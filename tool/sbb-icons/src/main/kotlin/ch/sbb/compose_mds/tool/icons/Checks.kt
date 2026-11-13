package ch.sbb.compose_mds.tool.icons

private val VERSION_TAG = Regex("""^v(\d+)\.(\d+)\.(\d+)$""")

data class Version(val major: Int, val minor: Int, val patch: Int) : Comparable<Version> {
    override fun compareTo(other: Version): Int = compareValuesBy(this, other, Version::major, Version::minor, Version::patch)

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
