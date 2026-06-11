package ch.sbb.compose_mds.composables.checkbox

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

@Immutable
data class SBBCheckboxColors(
    val border: Color,
    val check: Color,
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
    val enabledColors: SBBCheckboxColors @Composable get
    val disabledColors: SBBCheckboxColors @Composable get
    val layout: SBBCheckboxLayout @Composable get

    @Composable
    fun colors(enabled: Boolean) = if (enabled) enabledColors else disabledColors
}

class DefaultCheckboxStyle : SBBCheckboxStyle by defaultSBBCheckboxStyle()

fun defaultSBBCheckboxStyle(): SBBCheckboxStyle {
    return object : SBBCheckboxStyle {
        override val enabledColors: SBBCheckboxColors
            @Composable get() {
                val dark = SBBTheme.isDarkMode
                val colors = SBBTheme.colors

                val border by animateColorAsState(if (dark) colors.cloud else colors.granite)
                return SBBCheckboxColors(
                    border = border,
                    check = colors.primary,
                    text = MaterialTheme.colorScheme.onSurface,
                )
            }
        override val disabledColors: SBBCheckboxColors
            @Composable get() {
                val dark = SBBTheme.isDarkMode
                val colors = SBBTheme.colors

                val inactiveBorder by animateColorAsState(if (dark) colors.iron else colors.cloud)
                val inactiveContent by animateColorAsState(if (dark) colors.graphite else colors.granite)
                return SBBCheckboxColors(
                    border = inactiveBorder,
                    check = inactiveContent,
                    text = inactiveContent,
                )
            }
        override val layout @Composable get() =
            SBBCheckboxLayout(
                padding = SBBSpacing.XSmall,
                borderWidth = 1.dp,
                controlSize = 20.dp,
            )
    }
}

val LocalSBBCheckboxStyle = staticCompositionLocalOf<SBBCheckboxStyle> { DefaultCheckboxStyle() }
