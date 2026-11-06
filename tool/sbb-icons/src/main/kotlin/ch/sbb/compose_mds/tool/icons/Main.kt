package ch.sbb.compose_mds.tool.icons

import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.io.File
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.time.Duration
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.exitProcess

private const val BASE_URL = "https://icons.app.sbb.ch/icons"
private const val ICON_PACKAGE = "ch.sbb.compose_mds"
private const val ACCESSOR_NAME = "SBBIcons"
private const val TARGET_PACKAGE = "$ICON_PACKAGE.icons"
private const val ALL_ASSETS_PROPERTY = "all"
private const val PARALLEL_DOWNLOADS = 16
private const val MAX_ATTEMPTS = 3

private val SIZES = listOf("small", "medium", "large")

private val httpClient: HttpClient = HttpClient.newBuilder()
    .connectTimeout(Duration.ofSeconds(30))
    .followRedirects(HttpClient.Redirect.NORMAL)
    .build()

private data class Options(
    val force: Boolean,
    val sourceRoot: File,
    val versionFile: File,
)

fun main(args: Array<String>) {
    val options = parseOptions(args)

    println("Fetching $BASE_URL/index.json ...")
    val index = Json.parseToJsonElement(get("$BASE_URL/index.json").decodeToString()).jsonObject
    val remoteVersion = index.getValue("version").jsonPrimitive.content
    val localVersion = options.versionFile.takeIf { it.exists() }?.readText()?.trim()
    println("Remote version: $remoteVersion - Local version: ${localVersion ?: "none"}")

    if (!options.force && localVersion != null && compareVersions(localVersion, remoteVersion) >= 0) {
        println("All up to date!")
        return
    }

    val icons = index.getValue("icons").jsonArray
        .map { it.jsonObject }
        .mapNotNull { icon ->
            val name = icon.getValue("name").jsonPrimitive.content
            val tags = icon["tags"]?.jsonArray?.map { it.jsonPrimitive.content }.orEmpty()
            name.takeIf { SIZES.any { "Size=$it" in tags } }
        }
        .distinct()

    val workDir = createTempDirectory()
    try {
        val svgDir = File(workDir, "svg")
        downloadIcons(icons, svgDir)

        println("Generating Compose ImageVectors ...")
        val generatedRoot = File(workDir, "generated")
        generateIcons(svgDir, generatedRoot, options.sourceRoot)
        options.versionFile.parentFile?.mkdirs()
        options.versionFile.writeText("$remoteVersion\n")
        println("Updated SBBIcons to version $remoteVersion (${icons.size} icons).")
    } finally {
        workDir.deleteRecursively()
    }
}

private fun parseOptions(args: Array<String>): Options {
    var force = false
    var sourceRoot = File("compose-mds/src/main/java")
    var versionFile = File("tool/sbb-icons/icons.version")
    val iterator = args.iterator()
    while (iterator.hasNext()) {
        when (val arg = iterator.next()) {
            "--force", "-f" -> force = true
            "--source-root" -> sourceRoot = File(iterator.next())
            "--version-file" -> versionFile = File(iterator.next())
            "--help", "-h" -> {
                println(
                    """
                    Usage: ./gradlew -p tool/sbb-icons run [--args="<options>"]

                    Downloads the SBB icons from $BASE_URL and generates the Compose SBBIcons.

                    Options:
                      -f, --force             Regenerate even if the local version is up to date
                      --source-root <dir>     Kotlin source root (default: compose-mds/src/main/java)
                      --version-file <file>   File tracking the icon version (default: tool/sbb-icons/icons.version)
                    """.trimIndent(),
                )
                exitProcess(0)
            }
            else -> {
                System.err.println("Unknown argument: $arg (use --help)")
                exitProcess(1)
            }
        }
    }
    return Options(force, sourceRoot.absoluteFile, versionFile.absoluteFile)
}

private fun downloadIcons(icons: List<String>, targetDir: File) {
    targetDir.mkdirs()
    val done = AtomicInteger()
    val executor = Executors.newFixedThreadPool(PARALLEL_DOWNLOADS)
    try {
        val tasks = icons.map { name ->
            Callable {
                val bytes = get("$BASE_URL/$name.svg")
                // Svg2Compose converts lower_underscore file names to PascalCase property names.
                File(targetDir, "${name.replace('-', '_')}.svg").writeBytes(bytes)
                val count = done.incrementAndGet()
                if (count % 100 == 0 || count == icons.size) println("Downloaded $count/${icons.size} icons")
            }
        }
        executor.invokeAll(tasks).forEach { it.get() }
    } finally {
        executor.shutdownNow()
    }
}

internal fun generateIcons(svgDir: File, generatedRoot: File, sourceRoot: File) {
    Svg2Compose.parse(
        applicationIconPackage = ICON_PACKAGE,
        accessorName = ACCESSOR_NAME,
        outputSourceDirectory = generatedRoot,
        vectorsDirectory = svgDir,
        type = VectorType.SVG,
        iconNameTransformer = { name, _ -> name.toPascalCase() },
        allAssetsPropertyName = ALL_ASSETS_PROPERTY,
        generatePreview = false,
    )
    replaceGeneratedSources(generatedRoot, sourceRoot)
}

private fun get(url: String): ByteArray {
    val request = HttpRequest.newBuilder(URI(url)).timeout(Duration.ofSeconds(60)).GET().build()
    var lastError: Exception? = null
    repeat(MAX_ATTEMPTS) { attempt ->
        try {
            val response = httpClient.send(request, HttpResponse.BodyHandlers.ofByteArray())
            if (response.statusCode() == 200) return response.body()
            lastError = IllegalStateException("HTTP ${response.statusCode()} for $url")
        } catch (e: java.io.IOException) {
            lastError = e
        }
        Thread.sleep(500L * (attempt + 1))
    }
    throw IllegalStateException("Failed to download $url", lastError)
}

/**
 * Replaces the previously generated `icons` folder with the freshly generated one,
 * so icons removed upstream are removed here as well.
 */
private fun replaceGeneratedSources(generatedRoot: File, sourceRoot: File) {
    val generatedPackage = "$ICON_PACKAGE.${ACCESSOR_NAME.lowercase()}"
    val generatedPackageDir = File(generatedRoot, generatedPackage.replace('.', File.separatorChar))
    val targetPackageDir = File(sourceRoot, TARGET_PACKAGE.replace('.', File.separatorChar))
    val accessorFile = File(generatedRoot, ICON_PACKAGE.replace('.', File.separatorChar) + "/__$ACCESSOR_NAME.kt")
    check(generatedPackageDir.isDirectory && accessorFile.isFile) { "Unexpected generator output in $generatedRoot" }

    targetPackageDir.deleteRecursively()
    generatedPackageDir.copyRecursively(targetPackageDir)
    val samePackageImport = Regex("""^import ${Regex.escape(TARGET_PACKAGE)}\.\w+\n""", RegexOption.MULTILINE)
    val accessor = accessorFile.readText()
        .replaceFirst("package $ICON_PACKAGE\n", "package $TARGET_PACKAGE\n")
        .replace("import $generatedPackage.", "import $TARGET_PACKAGE.")
        .replace(samePackageImport, "")
    File(targetPackageDir, "__$ACCESSOR_NAME.kt").writeText(accessor)
    targetPackageDir.listFiles { file -> file.extension == "kt" }?.forEach { file ->
        file.writeText(
            file.readText()
                .replaceFirst("package $generatedPackage\n", "package $TARGET_PACKAGE\n")
                .replace("import $ICON_PACKAGE.$ACCESSOR_NAME\n", ""),
        )
    }
}

private fun String.toPascalCase(): String = split('_', '-')
    .filter { it.isNotEmpty() }
    .joinToString("") { part -> part.replaceFirstChar { it.uppercaseChar() } }
    .let { if (it.first().isDigit()) "_$it" else it }

/** Compares dot-separated numeric versions, e.g. `1.8.37`. */
internal fun compareVersions(a: String, b: String): Int {
    val left = a.split('.').map { it.toIntOrNull() ?: 0 }
    val right = b.split('.').map { it.toIntOrNull() ?: 0 }
    for (i in 0 until maxOf(left.size, right.size)) {
        val diff = left.getOrElse(i) { 0 }.compareTo(right.getOrElse(i) { 0 })
        if (diff != 0) return diff
    }
    return 0
}

private fun createTempDirectory(): File = kotlin.io.path.createTempDirectory("sbb-icons").toFile()
