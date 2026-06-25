package ch.sbb.compose_mds.composables.checkbox

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
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

@Immutable
data class SBBCheckboxColorVariants(
    val enabledLight: SBBCheckboxColors,
    val enabledDark: SBBCheckboxColors,
    val disabledLight: SBBCheckboxColors,
    val disabledDark: SBBCheckboxColors,
)

@Immutable
data class SBBCheckboxColors(
    val background: Color,
    val border: Color,
    val tick: Color,
    val icon: Color,
    val text: Color,
)

@Immutable
data class SBBCheckboxLayout(
    val padding: Dp,
    val borderWidth: Dp,
    val controlSize: Dp,
) {
    val innerEdge = controlSize - borderWidth.times(2.0f)
    val radius = innerEdge.div(3)
}

@Immutable
interface SBBCheckboxStyle {
    val colors: SBBCheckboxColorVariants @Composable get
    val layout: SBBCheckboxLayout @Composable get

    @Composable
    fun resolvedColors(enabled: Boolean): State<SBBCheckboxColors> {
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
        val border by animateColorAsState(colors.border)
        val tick by animateColorAsState(colors.tick)
        val icon by animateColorAsState(colors.icon)
        val text by animateColorAsState(colors.text)

        return remember {
            derivedStateOf {
                SBBCheckboxColors(
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

class DefaultCheckboxStyle : SBBCheckboxStyle by defaultSBBCheckboxStyle()

fun defaultSBBCheckboxStyle(): SBBCheckboxStyle =
    object : SBBCheckboxStyle {
        override val colors: SBBCheckboxColorVariants
            @Composable get() =
                SBBCheckboxColorVariants(
                    enabledLight =
                        SBBCheckboxColors(
                            background = SBBTheme.colors.white,
                            border = SBBTheme.colors.granite,
                            tick = SBBTheme.colors.primary,
                            icon = SBBTheme.colors.black,
                            text = SBBTheme.colors.black,
                        ),
                    enabledDark =
                        SBBCheckboxColors(
                            background = SBBTheme.colors.charcoal,
                            border = SBBTheme.colors.graphite,
                            tick = SBBTheme.colors.primary,
                            icon = SBBTheme.colors.white,
                            text = SBBTheme.colors.white,
                        ),
                    disabledLight =
                        SBBCheckboxColors(
                            background = SBBTheme.colors.white,
                            border = SBBTheme.colors.cloud,
                            tick = SBBTheme.colors.granite,
                            icon = SBBTheme.colors.granite,
                            text = SBBTheme.colors.granite,
                        ),
                    disabledDark =
                        SBBCheckboxColors(
                            background = SBBTheme.colors.charcoal,
                            border = SBBTheme.colors.iron,
                            tick = SBBTheme.colors.graphite,
                            icon = SBBTheme.colors.graphite,
                            text = SBBTheme.colors.granite,
                        ),
                )

        override val layout
            @Composable get() =
                SBBCheckboxLayout(
                    padding = SBBSpacing.XSmall,
                    borderWidth = 1.dp,
                    controlSize = 20.dp,
                )
    }

val LocalSBBCheckboxStyle = staticCompositionLocalOf<SBBCheckboxStyle> { DefaultCheckboxStyle() }
