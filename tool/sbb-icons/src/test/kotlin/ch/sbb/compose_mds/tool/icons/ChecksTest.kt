package ch.sbb.compose_mds.tool.icons

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonObject
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

private fun index(json: String): JsonObject = Json.parseToJsonElement(json).jsonObject

class ChecksTest {
    private val sizedIndex = index(
        """
        {
          "version": "1.8.38",
          "icons": [
            { "name": "bike-small", "tags": ["Size=small"] },
            { "name": "bike-medium", "tags": ["Size=medium"] },
            { "name": "bike-large", "tags": ["Size=large"] },
            { "name": "sbb-logo", "tags": ["Logo"] }
          ]
        }
        """,
    )

    @Test
    fun `latestVersionTag returns the highest vX_Y_Z tag by semver`() {
        val tags = listOf("v1.8.9", "v1.8.38", "v1.10.0", "v1.9.99")

        assertEquals(Version(1, 10, 0), latestVersionTag(tags))
    }

    @Test
    fun `latestVersionTag ignores tags that are not vX_Y_Z`() {
        val tags = listOf("v1.8.38", "v2.0.0-beta.1", "2.0.0", "v2", "latest", "v2.0.0.1")

        assertEquals(Version(1, 8, 38), latestVersionTag(tags))
    }

    @Test
    fun `latestVersionTag returns null without any vX_Y_Z tag`() {
        assertNull(latestVersionTag(listOf("latest", "main")))
    }

    @Test
    fun `iconNames returns the unique names tagged with the size`() {
        val index = index(
            """
            {
              "icons": [
                { "name": "arrow-turn-right-small", "tags": ["Size=small"] },
                { "name": "arrow-turn-right-small", "tags": ["Size=small"] },
                { "name": "bike-small", "tags": ["Size=small", "Bike"] },
                { "name": "bike-medium", "tags": ["Size=medium"] },
                { "name": "sbb-logo", "tags": ["Logo"] }
              ]
            }
            """,
        )

        assertEquals(setOf("arrow-turn-right-small", "bike-small"), iconNames(index, "small"))
        assertEquals(setOf("bike-medium"), iconNames(index, "medium"))
        assertEquals(emptySet(), iconNames(index, "large"))
    }

    @Test
    fun `checkIndex passes when the version matches and every sized icon has an SVG`() {
        val svgs = setOf("bike-small", "bike-medium", "bike-large")

        assertEquals(emptyList(), checkIndex(sizedIndex, Version(1, 8, 38), svgs))
    }

    @Test
    fun `checkIndex reports a version that differs from the tag`() {
        val svgs = setOf("bike-small", "bike-medium", "bike-large")

        assertEquals(
            listOf("index.json has version 1.8.38, expected 1.8.39 from the tag"),
            checkIndex(sizedIndex, Version(1, 8, 39), svgs),
        )
    }

    @Test
    fun `checkIndex reports sized icons without an SVG per size`() {
        val svgs = setOf("bike-medium")

        assertEquals(
            listOf("small: no SVG in the archive for bike-small", "large: no SVG in the archive for bike-large"),
            checkIndex(sizedIndex, Version(1, 8, 38), svgs),
        )
    }
}
