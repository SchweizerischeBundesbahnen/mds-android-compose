package ch.sbb.compose_mds.composables.radio

import androidx.compose.animation.animateColorAsState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

// Token data classes
@Immutable
data class SBBRadioColors(
    val border: Color,
    val tick: Color,
    val text: Color,
    val logo: Color,
)

@Immutable
data class SBBRadioLayout(
    val tick: Dp,
    val borderWidth: Dp,
    val controlSize: Dp,
)

@Immutable
interface SBBRadioStyle {
    val enabledColors: SBBRadioColors @Composable get
    val disabledColors: SBBRadioColors @Composable get
    val layout: SBBRadioLayout @Composable get

    @Composable
    fun colors(enabled: Boolean) = if (enabled) enabledColors else disabledColors
}

class DefaultRadioStyle : SBBRadioStyle by defaultSBBRadioStyle()

fun defaultSBBRadioStyle(): SBBRadioStyle {
    return object : SBBRadioStyle {
        override val enabledColors: SBBRadioColors
            @Composable get() {
                val dark = SBBTheme.isDarkMode
                val colors = SBBTheme.colors

                val border by animateColorAsState(if (dark) colors.cloud else colors.granite)

                return SBBRadioColors(
                    border = border,
                    tick = colors.primary,
                    logo = MaterialTheme.colorScheme.onSurface,
                    text = MaterialTheme.colorScheme.onSurface,
                )
            }
        override val disabledColors: SBBRadioColors
            @Composable get() {
                val dark = SBBTheme.isDarkMode
                val colors = SBBTheme.colors

                val inactiveBorder by animateColorAsState(if (dark) colors.iron else colors.cloud)
                val inactiveContent by animateColorAsState(if (dark) colors.graphite else colors.granite)

                return SBBRadioColors(
                    border = inactiveBorder,
                    tick = inactiveContent,
                    logo = inactiveContent,
                    text = inactiveContent,
                )
            }
        override val layout @Composable get() =
            SBBRadioLayout(
                tick = SBBSpacing.XSmall,
                borderWidth = 1.dp,
                controlSize = 20.dp,
            )
    }
}

val LocalSBBRadioStyle = staticCompositionLocalOf<SBBRadioStyle> { DefaultRadioStyle() }
