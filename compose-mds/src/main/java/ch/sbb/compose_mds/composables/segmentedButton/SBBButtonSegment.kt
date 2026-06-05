package ch.sbb.compose_mds.composables.segmentedButton

import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Definition of an element for an [SBBSegmentedButton].
 *
 * @param value The value for the Button Segment
 * @param label Optional label for the Button Segment.
 * @param icon Optional icon for the Button Segment
 */
data class SBBButtonSegment<T>(
    val value: T,
    val label: String? = null,
    val icon: ImageVector? = null,
)
