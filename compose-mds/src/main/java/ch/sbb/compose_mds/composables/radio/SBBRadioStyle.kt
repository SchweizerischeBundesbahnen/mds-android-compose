package ch.sbb.compose_mds.composables.radio

import androidx.compose.animation.animateColorAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.theme.SBBColors
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

@Immutable
data class SBBRadioColorVariants(
    val enabledLight: SBBRadioColors,
    val enabledDark: SBBRadioColors,
    val disabledLight: SBBRadioColors,
    val disabledDark: SBBRadioColors,
)

@Immutable
data class SBBRadioColors(
    val background: Color,
    val border: Color,
    val tick: Color,
    val icon: Color,
    val text: Color,
)

@Immutable
data class SBBRadioLayout(
    val tick: Dp,
    val borderWidth: Dp,
    val controlSize: Dp,
)

@Immutable
interface SBBRadioStyle {
    val colors: SBBRadioColorVariants @Composable get
    val layout: SBBRadioLayout @Composable get

    @Composable
    fun resolvedColors(enabled: Boolean): State<SBBRadioColors> {
        val enabledState by remember { mutableStateOf(enabled) }
        val isDark = SBBTheme.isDarkMode
        val colors = if (isDark) {
            if (enabledState) colors.enabledDark else colors.disabledDark
        } else if (enabledState) {
            colors.enabledLight
        } else {
            colors.disabledLight
        }

        val background by animateColorAsState(colors.background)
        val border by animateColorAsState(colors.border)
        val tick by animateColorAsState(colors.tick)
        val icon by animateColorAsState(colors.icon)
        val text by animateColorAsState(colors.text)

        return remember {
            derivedStateOf {
                SBBRadioColors(
                    background = background,
                    border = border,
                    tick = tick,
                    icon = icon,
                    text = text,
                )
            }
        }
    }
}

class DefaultRadioStyle : SBBRadioStyle by defaultSBBRadioStyle()

fun defaultSBBRadioStyle(): SBBRadioStyle =
    object : SBBRadioStyle {
        override val colors
            @Composable get() = SBBRadioColorVariants(
                enabledLight = SBBRadioColors(
                    background = SBBColors.white,
                    border = SBBColors.granite,
                    tick = SBBTheme.colorScheme.primary,
                    icon = SBBColors.black,
                    text = SBBColors.black,
                ),
                enabledDark = SBBRadioColors(
                    background = SBBColors.charcoal,
                    border = SBBColors.graphite,
                    tick = SBBTheme.colorScheme.primary,
                    icon = SBBColors.white,
                    text = SBBColors.white,
                ),
                disabledLight = SBBRadioColors(
                    background = SBBColors.white,
                    border = SBBColors.cloud,
                    tick = SBBColors.granite,
                    icon = SBBColors.granite,
                    text = SBBColors.granite,
                ),
                disabledDark = SBBRadioColors(
                    background = SBBColors.charcoal,
                    border = SBBColors.iron,
                    tick = SBBColors.graphite,
                    icon = SBBColors.graphite,
                    text = SBBColors.graphite,
                ),
            )
        override val layout
            @Composable get() = SBBRadioLayout(
                tick = SBBSpacing.XSmall,
                borderWidth = 1.dp,
                controlSize = 20.dp,
            )
    }

val LocalSBBRadioStyle = staticCompositionLocalOf<SBBRadioStyle> { DefaultRadioStyle() }
