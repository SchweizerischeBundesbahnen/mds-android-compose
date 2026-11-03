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
import ch.sbb.compose_mds.theme.SBBColors
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

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
        color = colors.buttonBorder,
    )
}

@Immutable
interface SBBSegmentedButtonVariants {
    val default: SBBSegmentedButtonStyle @Composable get
    val primary: SBBSegmentedButtonStyle @Composable get
}

class DefaultSegmentedButtonStyle : SBBSegmentedButtonVariants by defaultSBBSegmentedButtonStyles()

fun defaultSBBSegmentedButtonStyles(): SBBSegmentedButtonVariants {
    return object : SBBSegmentedButtonVariants {
        override val default: SBBSegmentedButtonStyle
            @Composable get() {
                val dark = SBBTheme.isDarkMode
                val typography = SBBTheme.materialTypography

                val background by animateColorAsState(if (dark) SBBColors.charcoal else SBBColors.cloud)
                val border by animateColorAsState(if (dark) SBBColors.graphite else SBBColors.granite)
                val buttonColor by animateColorAsState(if (dark) SBBColors.iron else SBBColors.white)

                return SBBSegmentedButtonStyle(
                    colors = SBBSegmentedButtonColors(
                        background = background,
                        buttonBackground = buttonColor,
                        buttonBorder = border,
                        onButton = MaterialTheme.colorScheme.onSurfaceVariant,
                    ),
                    layout = SBBSegmentedButtonLayout(
                        height = 46.dp,
                        buttonShape = RoundedCornerShape(22.dp),
                        buttonBorderWidth = 1.dp,
                        buttonOverlap = 2.dp,
                        buttonGap = SBBSpacing.XXSmall,
                        horizontalElementSpacing = SBBSpacing.XXSmall,
                    ),
                    typography = SBBSegmentedButtonTypography(
                        title = typography.bodyMedium,
                        fontWeight = FontWeight.Light,
                        selectedFontWeight = FontWeight.Light,
                    ),
                )
            }
        override val primary
            @Composable get() = SBBSegmentedButtonStyle(
                colors = SBBSegmentedButtonColors(
                    background = SBBTheme.colorScheme.primary125,
                    buttonBackground = SBBTheme.colorScheme.primary,
                    buttonBorder = SBBTheme.colorScheme.primary150,
                    onButton = SBBColors.white,
                ),
                layout = SBBSegmentedButtonLayout(
                    height = 46.dp,
                    buttonShape = RoundedCornerShape(22.dp),
                    buttonBorderWidth = 1.dp,
                    buttonOverlap = 2.dp,
                    buttonGap = SBBSpacing.XXSmall,
                    horizontalElementSpacing = SBBSpacing.XXSmall,
                ),
                typography = SBBSegmentedButtonTypography(
                    title = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Light,
                    selectedFontWeight = FontWeight.Bold,
                ),
            )
    }
}

val LocalSBBSegmentedButtonStyle =
    staticCompositionLocalOf<SBBSegmentedButtonVariants> { DefaultSegmentedButtonStyle() }
