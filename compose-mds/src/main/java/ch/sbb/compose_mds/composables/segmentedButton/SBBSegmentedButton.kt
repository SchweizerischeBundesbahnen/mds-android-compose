package ch.sbb.compose_mds.composables.segmentedButton

import androidx.compose.animation.core.animateIntOffsetAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInParent
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.round
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.ArrowLongRightSmall
import ch.sbb.compose_mds.sbbicons.small.ArrowsLongRightLeftSmall
import ch.sbb.compose_mds.sbbicons.small.UnicornSmall
import ch.sbb.compose_mds.theme.SBBTheme

data class SBBButtonSegment<T>(
    val value: T,
    val label: String? = null,
    val icon: ImageVector? = null,
)

object SBBSegmentedButton {
    @Composable
    fun <T> Default(
        selection: T,
        segments: List<SBBButtonSegment<T>>,
        onSelectionChange: (T) -> Unit,
        modifier: Modifier = Modifier,
    ) {
        Custom(
            selection = selection,
            segments = segments,
            onSelectionChange = onSelectionChange,
            style = LocalSBBSegmentedButtonStyle.current.default,
            modifier = modifier,
        )
    }

    @Composable
    fun <T> Primary(
        selection: T,
        segments: List<SBBButtonSegment<T>>,
        onSelectionChange: (T) -> Unit,
        modifier: Modifier = Modifier,
    ) {
        Custom(
            selection = selection,
            segments = segments,
            onSelectionChange = onSelectionChange,
            style = LocalSBBSegmentedButtonStyle.current.primary,
            modifier = modifier,
        )
    }

    @Composable
    private fun <T> Custom(
        selection: T,
        segments: List<SBBButtonSegment<T>>,
        onSelectionChange: (T) -> Unit,
        style: SBBSegmentedButtonStyle,
        modifier: Modifier = Modifier,
    ) {
        Box(
            modifier =
                modifier
                    .height(style.layout.height)
                    .fillMaxSize(),
        ) {
            val totalWeight = segments.size.toFloat()
            val positions = remember { mutableStateMapOf<T, LayoutCoordinates>() }
            val offset by animateIntOffsetAsState(
                positions[selection]?.positionInParent()?.round() ?: IntOffset.Zero,
            )
            val width =
                with(LocalDensity.current) {
                    positions.values
                        .firstOrNull()
                        ?.size
                        ?.width
                        ?.toDp() ?: 0.dp
                }

            Box(
                modifier =
                    Modifier
                        .fillMaxSize()
                        .padding(style.layout.buttonOverlap)
                        .clip(shape = style.layout.buttonShape)
                        .background(color = style.colors.background),
            )
            Box(
                modifier =
                    Modifier
                        .width(width)
                        .fillMaxHeight()
                        .offset { offset }
                        .clip(shape = style.layout.buttonShape)
                        .background(style.colors.buttonBackground)
                        .border(
                            border = style.buttonBorderStroke,
                            shape = style.layout.buttonShape,
                        ),
            )
            Row(horizontalArrangement = Arrangement.spacedBy(style.layout.buttonGap)) {
                segments.forEach { segment ->
                    val interactionSource = remember { MutableInteractionSource() }
                    val isPressed by interactionSource.collectIsPressedAsState()
                    val selected = segment.value == selection

                    Box(
                        modifier =
                            Modifier
                                .weight(1f / totalWeight)
                                .fillMaxHeight()
                                .clip(shape = style.layout.buttonShape)
                                .clickable(
                                    role = Role.Button,
                                    interactionSource = interactionSource,
                                    indication = null,
                                    onClick = { onSelectionChange(segment.value) },
                                )
                                .onGloballyPositioned { positions[segment.value] = it },
                        contentAlignment = Alignment.Center,
                    ) {
                        Box(
                            modifier =
                                Modifier
                                    .graphicsLayer { alpha = if (isPressed) 1f else 0f }
                                    .fillMaxSize()
                                    .clickable(interactionSource = interactionSource) {
                                        onSelectionChange(segment.value)
                                    },
                        )
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(style.layout.horizontalElementSpacing),
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            segment.icon?.let {
                                Icon(
                                    imageVector = it,
                                    contentDescription = null,
                                    tint = style.colors.onButton,
                                )
                            }
                            segment.label?.let {
                                Text(
                                    text = it,
                                    style = style.typography.title.copy(color = style.colors.onButton),
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    fontWeight = if (selected) style.typography.selectedFontWeight else style.typography.fontWeight,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

private val twoSegments =
    listOf(
        SBBButtonSegment(
            value = 1,
            label = "Label 1",
            icon = SBBIcons.Small.ArrowLongRightSmall,
        ),
        SBBButtonSegment(
            value = 2,
            label = "Label 2",
            icon = SBBIcons.Small.ArrowsLongRightLeftSmall,
        ),
    )

private val threeSegments =
    twoSegments.plus(
        SBBButtonSegment(
            value = 3,
            label = "Label 3",
            icon = SBBIcons.Small.UnicornSmall,
        ),
    )

@PreviewLightDark
@Preview
@Composable
private fun PreviewSBBSegmentedButton_TwoItems() {
    SBBTheme {
        SBBSegmentedButton.Default(
            selection = 1,
            segments = twoSegments,
            onSelectionChange = {},
        )
    }
}

@PreviewLightDark
@Preview
@Composable
private fun PreviewSBBSegmentedButton_ThreeItems() {
    SBBTheme {
        SBBSegmentedButton.Default(
            selection = 1,
            segments = threeSegments,
            onSelectionChange = {},
        )
    }
}

@PreviewLightDark
@Preview
@Composable
private fun PreviewSBBSegmentedButton_Primary_TwoItems() {
    SBBTheme {
        SBBSegmentedButton.Primary(
            selection = 1,
            segments = twoSegments,
            onSelectionChange = {},
        )
    }
}

@PreviewLightDark
@Preview
@Composable
private fun PreviewSBBSegmentedButton_Primary_ThreeItems() {
    SBBTheme {
        SBBSegmentedButton.Primary(
            selection = 1,
            segments = threeSegments,
            onSelectionChange = {},
        )
    }
}
