package ch.sbb.compose_mds.composables.segmentedButton

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.style.ExperimentalFoundationStyleApi
import androidx.compose.foundation.style.Style
import androidx.compose.foundation.style.StyleStateKey
import androidx.compose.foundation.style.border
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

@Immutable
data class SBBSegmentedButtonLayout(
    val height: Dp,
    val buttonShape: Shape,
    val buttonBorderWidth: Dp,
    val buttonOverlap: Dp,
    val buttonGap: Dp,
    val horizontalElementSpacing: Dp,
)

@Immutable
data class SBBSegmentedButtonTypography(
    val title: TextStyle,
    val fontWeight: FontWeight,
    val selectedFontWeight: FontWeight,
    val contentColor: Color,
)

/**
 * Visual and layout tokens for one segmented-button variant.
 *
 * The legacy colors, layout, and typography properties remain available for compatibility. The
 * Style properties provide fine-grained overrides for each visual region through Foundation's
 * experimental Styles API.
 */
@ExperimentalFoundationStyleApi
@Immutable
data class SBBSegmentedButtonStyle(
    val layout: SBBSegmentedButtonLayout,
    val typography: SBBSegmentedButtonTypography,
    val trackStyle: Style = Style,
    val indicatorStyle: Style = Style,
    val contentStyle: Style = Style,
    val pressedStyle: Style = Style,
)

@ExperimentalFoundationStyleApi
@Immutable
interface SBBSegmentedButtonVariants {
    val default: SBBSegmentedButtonStyle @Composable get
    val primary: SBBSegmentedButtonStyle @Composable get
}

@ExperimentalFoundationStyleApi
class DefaultSegmentedButtonStyle : SBBSegmentedButtonVariants by defaultSBBSegmentedButtonStyles()

/** Default SBB segmented-button variants. */
@ExperimentalFoundationStyleApi
fun defaultSBBSegmentedButtonStyles(): SBBSegmentedButtonVariants {
    return object : SBBSegmentedButtonVariants {
        override val default: SBBSegmentedButtonStyle
            @Composable get() {
                val dark = SBBTheme.isDarkMode
                val typography = SBBTheme.materialTypography
                val colors = SBBTheme.colors

                val background by animateColorAsState(if (dark) colors.charcoal else colors.cloud)
                val border by animateColorAsState(if (dark) colors.graphite else colors.granite)
                val buttonColor by animateColorAsState(if (dark) colors.iron else colors.white)
                val onButton = MaterialTheme.colorScheme.onSurfaceVariant
                val layout = defaultSegmentedButtonLayout()
                val textStyle = typography.bodyMedium

                return SBBSegmentedButtonStyle(
                    layout = layout,
                    typography =
                        SBBSegmentedButtonTypography(
                            title = textStyle,
                            fontWeight = FontWeight.Light,
                            selectedFontWeight = FontWeight.Light,
                            contentColor = onButton,
                        ),
                    trackStyle = { background(background) },
                    indicatorStyle =
                        {
                            background(buttonColor)
                            shape(layout.buttonShape)
                            border(layout.buttonBorderWidth, border)
                        },
                    contentStyle =
                        {
                            textStyle(textStyle)
                            contentColor(onButton)
                            fontWeight(FontWeight.Light)
                        },
                )
            }

        override val primary: SBBSegmentedButtonStyle
            @Composable get() {
                val colors = SBBTheme.colors
                val background = colors.primary125
                val buttonColor = colors.primary
                val border = colors.primary150
                val onButton = colors.white
                val layout = defaultSegmentedButtonLayout()
                val textStyle = MaterialTheme.typography.bodyMedium

                return SBBSegmentedButtonStyle(
                    layout = layout,
                    typography =
                        SBBSegmentedButtonTypography(
                            title = textStyle,
                            fontWeight = FontWeight.Light,
                            selectedFontWeight = FontWeight.Bold,
                            contentColor = onButton,
                        ),
                    trackStyle = { background(background) },
                    indicatorStyle =
                        {
                            background(buttonColor)
                            shape(layout.buttonShape)
                            border(layout.buttonBorderWidth, border)
                        },
                    contentStyle =
                        {
                            textStyle(textStyle)
                            contentColor(onButton)
                            fontWeight(FontWeight.Light)
                            state(
                                StyleStateKey.Selected,
                                { fontWeight(FontWeight.Bold) },
                            ) { key, state -> state[key] }
                        },
                )
            }
    }
}

private fun defaultSegmentedButtonLayout() =
    SBBSegmentedButtonLayout(
        height = 46.dp,
        buttonShape = RoundedCornerShape(22.dp),
        buttonBorderWidth = 1.dp,
        buttonOverlap = 2.dp,
        buttonGap = SBBSpacing.XXSmall,
        horizontalElementSpacing = SBBSpacing.XXSmall,
    )

@ExperimentalFoundationStyleApi
val LocalSBBSegmentedButtonStyle =
    staticCompositionLocalOf<SBBSegmentedButtonVariants> { DefaultSegmentedButtonStyle() }
