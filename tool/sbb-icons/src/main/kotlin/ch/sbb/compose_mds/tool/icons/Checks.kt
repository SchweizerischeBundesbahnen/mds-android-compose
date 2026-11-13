package ch.sbb.compose_mds.tool.icons

import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

private val VERSION_TAG = Regex("""^v(\d+)\.(\d+)\.(\d+)$""")

data class Version(val major: Int, val minor: Int, val patch: Int) : Comparable<Version> {
    override fun compareTo(other: Version): Int =
        compareValuesBy(this, other, Version::major, Version::minor, Version::patch)

    override fun toString(): String = "$major.$minor.$patch"

    companion object {
        /** Parses a version of the form `X.Y.Z`, e.g. `1.8.37`. */
        fun parse(text: String): Version {
            val parts = text.trim().split('.').map { it.toInt() }
            require(parts.size == 3) { "Not a X.Y.Z version: $text" }
            return Version(parts[0], parts[1], parts[2])
        }
    }
}

/** Returns the highest semantic version among [tagNames], considering only tags of the form `vX.Y.Z`. */
fun latestVersionTag(tagNames: Iterable<String>): Version? = tagNames
    .mapNotNull { VERSION_TAG.find(it) }
    .map { Version(it.groupValues[1].toInt(), it.groupValues[2].toInt(), it.groupValues[3].toInt()) }
    .maxOrNull()

val SIZES = listOf("small", "medium", "large")

/**
 * Returns the unique icon names in [index] that are tagged with `Size=<size>`.
 * The index can list a name more than once, so a set is returned.
 */
fun iconNames(index: JsonObject, size: String): Set<String> = index.getValue("icons").jsonArray
    .map { it.jsonObject }
    .filter { icon -> icon["tags"]?.jsonArray.orEmpty().any { it.jsonPrimitive.content == "Size=$size" } }
    .mapTo(mutableSetOf()) { it.getValue("name").jsonPrimitive.content }

/** Checks that [index] belongs to [version] and that every sized icon has an SVG among [svgNames]. */
fun checkIndex(index: JsonObject, version: Version, svgNames: Set<String>): List<String> = buildList {
    val indexVersion = index["version"]?.jsonPrimitive?.content
    if (indexVersion != version.toString()) add("index.json has version $indexVersion, expected $version from the tag")
    SIZES.forEach { size ->
        val missing = iconNames(index, size) - svgNames
        if (missing.isNotEmpty()) add("$size: no SVG in the archive for ${missing.joinToString()}")
    }
}

/** The property and file name Svg2Compose gives an icon, e.g. `AdultKidsSmall` for `adult-kids-small`. */
fun propertyName(iconName: String): String = iconName.split('_', '-')
    .filter { it.isNotEmpty() }
    .joinToString("") { part -> part.replaceFirstChar { it.uppercaseChar() } }
    .let { if (it.first().isDigit()) "_$it" else it }

/** Checks that exactly one icon was generated per name in [expectedIcons], given the [generatedNames] of the files. */
fun checkGenerated(expectedIcons: Set<String>, generatedNames: Iterable<String>): List<String> {
    val expected = expectedIcons.mapTo(mutableSetOf(), ::propertyName)
    val actual = generatedNames.toSet()
    val missing = expected - actual
    val unexpected = actual - expected
    if (missing.isEmpty() && unexpected.isEmpty()) return emptyList()
    return listOf(
        listOfNotNull(
            "${actual.size} generated icons, expected ${expected.size}",
            missing.takeIf { it.isNotEmpty() }?.let { "missing ${it.joinToString()}" },
            unexpected.takeIf { it.isNotEmpty() }?.let { "unexpected ${it.joinToString()}" },
        ).joinToString("; "),
    )
}
