package ch.sbb.compose_mds.composables.segmentedButton

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
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
import ch.sbb.compose_mds.theme.PrimitiveColors
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme
import ch.sbb.compose_mds.theme.context.LocalThemeContext

@Immutable
data class SBBSegmentedButtonColors(
    val background: Color,
    val buttonBackground: Color,
    val buttonBorder: Color,
    val onButton: Color,
)

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
)

@Immutable
data class SBBSegmentedButtonStyle(
    val colors: SBBSegmentedButtonColors,
    val layout: SBBSegmentedButtonLayout,
    val typography: SBBSegmentedButtonTypography,
) {
    val buttonBorderStroke = BorderStroke(
        width = layout.buttonBorderWidth,
        color = colors.buttonBorder
    )
}

@Immutable
data class SBBSegmentedButtonVariants(
    val default: SBBSegmentedButtonStyle,
    val primary: SBBSegmentedButtonStyle,
)

@Composable
fun defaultSBBSegmentedButtonStyles(): SBBSegmentedButtonVariants {
    val dark = SBBTheme.isDarkMode
    val typography = MaterialTheme.typography
    val colors = SBBTheme.colors

    val background by animateColorAsState(if (dark) colors.charcoal else colors.cloud)
    val border by animateColorAsState(if (dark) colors.graphite else colors.granite)
    val buttonColor by animateColorAsState(if (dark) colors.iron else colors.white)

    return SBBSegmentedButtonVariants(
        default =
            SBBSegmentedButtonStyle(
                colors =
                    SBBSegmentedButtonColors(
                        background = background,
                        buttonBackground = buttonColor,
                        buttonBorder = border,
                        onButton = MaterialTheme.colorScheme.onSurfaceVariant,
                    ),
                layout =
                    SBBSegmentedButtonLayout(
                        height = 46.dp,
                        buttonShape = RoundedCornerShape(22.dp),
                        buttonBorderWidth = 1.dp,
                        buttonOverlap = 2.dp,
                        buttonGap = SBBSpacing.XXSmall,
                        horizontalElementSpacing = SBBSpacing.XXSmall,
                    ),
                typography =
                    SBBSegmentedButtonTypography(
                        title = typography.bodyMedium,
                        fontWeight = FontWeight.Light,
                        selectedFontWeight = FontWeight.Light,
                    ),
            ),
        primary =
            SBBSegmentedButtonStyle(
                colors =
                    SBBSegmentedButtonColors(
                        background = colors.primary125,
                        buttonBackground = colors.primary,
                        buttonBorder = colors.primary150,
                        onButton = colors.white,
                    ),
                layout =
                    SBBSegmentedButtonLayout(
                        height = 46.dp,
                        buttonShape = RoundedCornerShape(22.dp),
                        buttonBorderWidth = 1.dp,
                        buttonOverlap = 2.dp,
                        buttonGap = SBBSpacing.XXSmall,
                        horizontalElementSpacing = SBBSpacing.XXSmall,
                    ),
                typography =
                    SBBSegmentedButtonTypography(
                        title = typography.bodyMedium,
                        fontWeight = FontWeight.Light,
                        selectedFontWeight = FontWeight.Bold,
                    ),
            ),
    )
}

private val StaticDefaultSBBSegmentedButtonStyle =
    SBBSegmentedButtonVariants(
        default =
            SBBSegmentedButtonStyle(
                colors =
                    SBBSegmentedButtonColors(
                        background = PrimitiveColors.cloud,
                        buttonBackground = PrimitiveColors.white,
                        buttonBorder = PrimitiveColors.granite,
                        onButton = PrimitiveColors.black,
                    ),
                layout =
                    SBBSegmentedButtonLayout(
                        height = 46.dp,
                        buttonShape = RoundedCornerShape(22.dp),
                        buttonBorderWidth = 1.dp,
                        buttonOverlap = 2.dp,
                        buttonGap = SBBSpacing.XXSmall,
                        horizontalElementSpacing = SBBSpacing.XXSmall,
                    ),
                typography =
                    SBBSegmentedButtonTypography(
                        title = TextStyle.Default,
                        fontWeight = FontWeight.Light,
                        selectedFontWeight = FontWeight.Light,
                    ),
            ),
        primary =
            SBBSegmentedButtonStyle(
                colors =
                    SBBSegmentedButtonColors(
                        background = PrimitiveColors.red125,
                        buttonBackground = PrimitiveColors.red,
                        buttonBorder = PrimitiveColors.red150,
                        onButton = PrimitiveColors.white,
                    ),
                layout =
                    SBBSegmentedButtonLayout(
                        height = 46.dp,
                        buttonShape = RoundedCornerShape(22.dp),
                        buttonBorderWidth = 1.dp,
                        buttonOverlap = 2.dp,
                        buttonGap = SBBSpacing.XXSmall,
                        horizontalElementSpacing = SBBSpacing.XXSmall,
                    ),
                typography =
                    SBBSegmentedButtonTypography(
                        title = TextStyle.Default,
                        fontWeight = FontWeight.Light,
                        selectedFontWeight = FontWeight.Bold,
                    ),
            ),
    )

val LocalSBBSegmentedButtonStyle = staticCompositionLocalOf { StaticDefaultSBBSegmentedButtonStyle }
