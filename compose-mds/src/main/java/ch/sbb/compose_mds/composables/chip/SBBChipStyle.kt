package ch.sbb.compose_mds.composables.chip

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.theme.SBBColors
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

@Immutable
data class SBBChipColorVariants(
    val enabledLight: SBBChipColors,
    val enabledDark: SBBChipColors,
    val disabledLight: SBBChipColors,
    val disabledDark: SBBChipColors,
)

@Immutable
data class SBBChipColors(
    val background: Color,
    val backgroundNumber: Color,
    val backgroundClose: Color,
    val border: Color,
    val text: Color,
    val textNumber: Color,
    val iconClose: Color,
)

@Immutable
data class SBBChipLayout(
    val padding: PaddingValues,
    val borderStrokeWidth: Dp,
    val shape: Shape,
    val labelGap: Dp,
    val indicatorSize: Dp,
    val indicatorShape: Shape,
)

@Immutable
data class SBBChipTypography(
    val label: TextStyle,
    val number: TextStyle,
)

@Immutable
interface SBBChipStyle {
    val colors: SBBChipColorVariants @Composable get
    val layout: SBBChipLayout @Composable get
    val typography: SBBChipTypography @Composable get

    @Composable
    fun borderStroke(enabled: Boolean): BorderStroke {
        val colors by resolvedColors(enabled)
        return BorderStroke(
            width = layout.borderStrokeWidth,
            color = colors.border,
        )
    }

    @Composable
    fun resolvedColors(enabled: Boolean): State<SBBChipColors> {
        val enabledState by remember { mutableStateOf(enabled) }
        val isDark = SBBTheme.isDarkMode
        val colors =
            if (isDark) {
                if (enabledState) {
                    colors.enabledDark
                } else {
                    colors.disabledDark
                }
            } else if (enabledState) {
                colors.enabledLight
            } else {
                colors.disabledLight
            }

        val background by animateColorAsState(colors.background)
        val backgroundNumber by animateColorAsState(colors.backgroundNumber)
        val backgroundClose by animateColorAsState(colors.backgroundClose)
        val border by animateColorAsState(colors.border)
        val text by animateColorAsState(colors.text)
        val textNumber by animateColorAsState(colors.textNumber)
        val iconClose by animateColorAsState(colors.iconClose)

        return remember {
            derivedStateOf {
                SBBChipColors(
                    background = background,
                    backgroundNumber = backgroundNumber,
                    backgroundClose = backgroundClose,
                    border = border,
                    text = text,
                    textNumber = textNumber,
                    iconClose = iconClose,
                )
            }
        }
    }
}

class DefaultCheckboxStyle : SBBChipStyle by defaultSBBChipStyle()

fun defaultSBBChipStyle(): SBBChipStyle =
    object : SBBChipStyle {
        override val colors: SBBChipColorVariants
            @Composable get() =
                SBBChipColorVariants(
                    enabledLight =
                        SBBChipColors(
                            background = SBBColors.white,
                            backgroundNumber = SBBTheme.colorScheme.primary,
                            backgroundClose = SBBColors.cloud,
                            border = SBBColors.granite,
                            text = SBBColors.black,
                            textNumber = SBBColors.white,
                            iconClose = SBBColors.black,
                        ),
                    enabledDark =
                        SBBChipColors(
                            background = SBBColors.charcoal,
                            backgroundNumber = SBBTheme.colorScheme.primary,
                            backgroundClose = SBBColors.granite,
                            border = SBBColors.graphite,
                            text = SBBColors.white,
                            textNumber = SBBColors.white,
                            iconClose = SBBColors.white,
                        ),
                    disabledLight =
                        SBBChipColors(
                            background = SBBColors.white,
                            backgroundNumber = SBBColors.graphite,
                            backgroundClose = SBBColors.milk,
                            border = SBBColors.cloud,
                            text = SBBColors.granite,
                            textNumber = SBBColors.white,
                            iconClose = SBBColors.granite,
                        ),
                    disabledDark =
                        SBBChipColors(
                            background = SBBColors.charcoal,
                            backgroundNumber = SBBColors.iron,
                            backgroundClose = SBBColors.iron,
                            border = SBBColors.iron,
                            text = SBBColors.graphite,
                            textNumber = SBBColors.white,
                            iconClose = SBBColors.graphite,
                        ),
                )
        override val layout
            @Composable get() =
                SBBChipLayout(
                    padding =
                        PaddingValues(
                            start = SBBSpacing.Small,
                            top = SBBSpacing.XXSmall,
                            end = SBBSpacing.XXSmall,
                            bottom = SBBSpacing.XXSmall,
                        ),
                    borderStrokeWidth = 1.dp,
                    shape = RoundedCornerShape(percent = 100),
                    labelGap = SBBSpacing.Small,
                    indicatorSize = 24.dp,
                    indicatorShape = CircleShape,
                )

        override val typography: SBBChipTypography
            @Composable get() =
                SBBChipTypography(
                    label = SBBTheme.materialTypography.bodyMedium,
                    number = SBBTheme.materialTypography.headlineSmall,
                )
    }

val LocalSBBChipStyle = staticCompositionLocalOf<SBBChipStyle> { DefaultCheckboxStyle() }
