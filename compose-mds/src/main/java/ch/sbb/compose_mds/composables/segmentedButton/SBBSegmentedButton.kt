package ch.sbb.compose_mds.composables.segmentedButton

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateIntOffsetAsState
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
import androidx.compose.foundation.style.ExperimentalFoundationStyleApi
import androidx.compose.foundation.style.MutableStyleState
import androidx.compose.foundation.style.Style
import androidx.compose.foundation.style.StyleStateKey
import androidx.compose.foundation.style.styleable
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInParent
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.round
import ch.sbb.compose_mds.composables.segmentedButton.SBBSegmentedButton.Custom
import ch.sbb.compose_mds.composables.segmentedButton.SBBSegmentedButton.Default
import ch.sbb.compose_mds.composables.segmentedButton.SBBSegmentedButton.Primary
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.ArrowLongRightSmall
import ch.sbb.compose_mds.sbbicons.small.ArrowsLongRightLeftSmall
import ch.sbb.compose_mds.sbbicons.small.UnicornSmall
import ch.sbb.compose_mds.theme.SBBTheme

/**
 * Implementation of the SBB segmented-button.
 *
 * Available are the variants [Default], [Custom] and [Primary].
 *
 * For full specification, please visit [digital.sbb.ch](https://digital.sbb.ch/en/design-system/mobile/components/segmented-button/).
 */
@ExperimentalFoundationStyleApi
object SBBSegmentedButton {
    /** Default variant of the segmented button. */
    @Composable
    fun <T> Default(
        selection: T,
        segments: List<SBBButtonSegment<T>>,
        onSelectionChange: (T) -> Unit,
        modifier: Modifier = Modifier,
        styleOverride: Style = Style,
    ) {
        Custom(
            selection = selection,
            segments = segments,
            onSelectionChange = onSelectionChange,
            style = SBBTheme.segmentedButton.default,
            modifier = modifier,
            styleOverride = styleOverride,
        )
    }

    /** Primary variant of the segmented button. */
    @Composable
    fun <T> Primary(
        selection: T,
        segments: List<SBBButtonSegment<T>>,
        onSelectionChange: (T) -> Unit,
        modifier: Modifier = Modifier,
        styleOverride: Style = Style,
    ) {
        Custom(
            selection = selection,
            segments = segments,
            onSelectionChange = onSelectionChange,
            style = SBBTheme.segmentedButton.primary,
            modifier = modifier,
            styleOverride = styleOverride,
        )
    }

    /**
     * Custom variant of the segmented button.
     *
     * Legacy layout, and typography tokens remain supported. [styleOverride] is applied
     * after the variant's region styles.
     */
    @Composable
    fun <T> Custom(
        selection: T,
        segments: List<SBBButtonSegment<T>>,
        onSelectionChange: (T) -> Unit,
        style: SBBSegmentedButtonStyle,
        modifier: Modifier = Modifier,
        styleOverride: Style = Style,
    ) {
        Box(
            modifier = modifier.height(style.layout.height).fillMaxSize(),
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
                        .clip(style.layout.buttonShape)
                        .styleable(
                            null,
                            style.trackStyle,
                            styleOverride,
                        ),
            )
            Box(
                modifier =
                    Modifier
                        .width(width)
                        .fillMaxHeight()
                        .offset { offset }
                        .clip(style.layout.buttonShape)
                        .styleable(
                            null,
                            style.indicatorStyle,
                            styleOverride,
                        ),
            )
            Row(horizontalArrangement = Arrangement.spacedBy(style.layout.buttonGap)) {
                segments.forEach { segment ->
                    val interactionSource = remember { MutableInteractionSource() }
                    val isPressed by interactionSource.collectIsPressedAsState()
                    val selected = segment.value == selection
                    val styleState = remember { MutableStyleState(null) }
                    styleState[StyleStateKey.Selected] = selected

                    Box(
                        modifier =
                            Modifier
                                .weight(1f / totalWeight)
                                .fillMaxHeight()
                                .clip(style.layout.buttonShape)
                                .clickable(
                                    role = Role.Button,
                                    interactionSource = interactionSource,
                                    indication = null,
                                    onClick = { onSelectionChange(segment.value) },
                                ).onGloballyPositioned { positions[segment.value] = it },
                        contentAlignment = Alignment.Center,
                    ) {
                        Box(
                            modifier =
                                Modifier
                                    .graphicsLayer { alpha = if (isPressed) 1f else 0f }
                                    .styleable(null, style.pressedStyle, styleOverride)
                                    .fillMaxSize()
                                    .clickable(interactionSource = interactionSource) {
                                        onSelectionChange(segment.value)
                                    },
                        )
                        Row(
                            modifier = Modifier.styleable(styleState, style.contentStyle, styleOverride),
                            horizontalArrangement = Arrangement.spacedBy(style.layout.horizontalElementSpacing),
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            val fontWeight = if (selected) style.typography.selectedFontWeight else style.typography.fontWeight
                            segment.icon?.let {
                                SBBSegmentedButtonIcon(
                                    modifier = Modifier.styleable(styleState, style.contentStyle, styleOverride),
                                    icon = it,
                                    contentColor = style.typography.contentColor,
                                )
                            }
                            segment.label?.let {
                                SBBSegmentedButtonLabel(
                                    modifier = Modifier.styleable(styleState, style.contentStyle, styleOverride),
                                    text = it,
                                    textStyle = style.typography.title,
                                    fontWeight = fontWeight,
                                    contentColor = style.typography.contentColor,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun SBBSegmentedButtonIcon(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    contentColor: Color,
) {
    Icon(
        modifier = modifier,
        imageVector = icon,
        contentDescription = null,
        tint = contentColor,
    )
}

@Composable
private fun SBBSegmentedButtonLabel(
    modifier: Modifier = Modifier,
    text: String,
    textStyle: TextStyle,
    fontWeight: FontWeight,
    contentColor: Color,
) {
    Text(
        modifier = modifier,
        text = text,
        color = contentColor,
        style = textStyle,
        fontWeight = fontWeight,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
    )
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
