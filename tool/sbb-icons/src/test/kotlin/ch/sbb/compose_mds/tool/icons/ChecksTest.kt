package ch.sbb.compose_mds.tool.icons

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class ChecksTest {
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
}
