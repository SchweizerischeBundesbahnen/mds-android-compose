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
import java.util.zip.ZipInputStream
import kotlin.system.exitProcess

private const val REPOSITORY = "sbb-design-systems/sbb-icons"
private const val ICON_PACKAGE = "ch.sbb.compose_mds"
private const val ACCESSOR_NAME = "SBBIcons"
private const val TARGET_PACKAGE = "$ICON_PACKAGE.icons"
private const val ALL_ASSETS_PROPERTY = "all"
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

    println("Fetching the tags of $REPOSITORY ...")
    val remoteVersion = fetchLatestVersion()
    val localVersion = options.versionFile.takeIf { it.exists() }?.readText()?.let(Version::parse)
    println("Remote version: $remoteVersion - Local version: ${localVersion ?: "none"}")

    if (!options.force && localVersion != null && localVersion >= remoteVersion) {
        println("All up to date!")
        return
    }
    setOutput("new_version", remoteVersion.toString())

    println("Downloading icons v$remoteVersion ...")
    val files = downloadArchive(remoteVersion)
    val index = Json.parseToJsonElement(files.getValue("icons/index.json").decodeToString()).jsonObject
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
        writeIcons(icons, files, svgDir)

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

                    Downloads the SBB icons of the latest vX.Y.Z tag of https://github.com/$REPOSITORY
                    and generates the Compose SBBIcons. Set GITHUB_TOKEN to avoid the GitHub API rate limit.

                    Options:
                      -f, --force             Regenerate the latest tag even if the local version is up to date
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

/** Sets a step output when running in GitHub Actions. */
private fun setOutput(name: String, value: String) {
    val path = System.getenv("GITHUB_OUTPUT") ?: return
    File(path).appendText("$name=$value\n")
}

private val githubHeaders: Map<String, String>
    get() = buildMap {
        put("Accept", "application/vnd.github+json")
        System.getenv("GITHUB_TOKEN")?.takeIf { it.isNotEmpty() }?.let { put("Authorization", "Bearer $it") }
    }

/** Returns the highest `vX.Y.Z` tag of the icon repository, following the pagination of the tags API. */
private fun fetchLatestVersion(): Version {
    val tagNames = mutableListOf<String>()
    var uri: URI? = URI("https://api.github.com/repos/$REPOSITORY/tags?per_page=100")
    while (uri != null) {
        val response = get(uri, githubHeaders)
        Json.parseToJsonElement(response.body().decodeToString()).jsonArray
            .mapTo(tagNames) { it.jsonObject.getValue("name").jsonPrimitive.content }
        uri = nextPage(response.headers().firstValue("link").orElse(null))
    }
    return checkNotNull(latestVersionTag(tagNames)) { "No vX.Y.Z tag found in $REPOSITORY" }
}

private fun nextPage(linkHeader: String?): URI? =
    Regex("""<([^>]+)>;\s*rel="next"""").find(linkHeader.orEmpty())?.let { URI(it.groupValues[1]) }

/** Downloads the tagged archive and returns its files keyed by their path inside the repository. */
private fun downloadArchive(version: Version): Map<String, ByteArray> {
    val response = get(URI("https://github.com/$REPOSITORY/archive/refs/tags/v$version.zip"))
    val files = mutableMapOf<String, ByteArray>()
    ZipInputStream(response.body().inputStream()).use { zip ->
        generateSequence { zip.nextEntry }
            .filterNot { it.isDirectory }
            .forEach { entry -> files[entry.name.substringAfter('/')] = zip.readBytes() }
    }
    return files
}

private fun writeIcons(icons: List<String>, files: Map<String, ByteArray>, targetDir: File) {
    targetDir.mkdirs()
    icons.forEach { name ->
        val svg = files["icons/$name.svg"] ?: return@forEach
        // Svg2Compose converts lower_underscore file names to PascalCase property names.
        File(targetDir, "${name.replace('-', '_')}.svg").writeBytes(svg)
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

private fun get(uri: URI, headers: Map<String, String> = emptyMap()): HttpResponse<ByteArray> {
    val request = HttpRequest.newBuilder(uri).timeout(Duration.ofSeconds(60)).GET()
        .apply { headers.forEach { (name, value) -> header(name, value) } }
        .build()
    var lastError: Exception? = null
    repeat(MAX_ATTEMPTS) { attempt ->
        try {
            val response = httpClient.send(request, HttpResponse.BodyHandlers.ofByteArray())
            if (response.statusCode() == 200) return response
            lastError = IllegalStateException("HTTP ${response.statusCode()} for $uri")
        } catch (e: java.io.IOException) {
            lastError = e
        }
        Thread.sleep(500L * (attempt + 1))
    }
    throw IllegalStateException("Failed to download $uri", lastError)
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

private fun createTempDirectory(): File = kotlin.io.path.createTempDirectory("sbb-icons").toFile()
