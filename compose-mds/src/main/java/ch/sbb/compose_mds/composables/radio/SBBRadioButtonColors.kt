package ch.sbb.compose_mds.composables.radio

import SBBTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
internal fun lightRadioButtonColors(enabled: Boolean): SBBRadioButtonColors {
    val colors = SBBTheme.colors
    return SBBRadioButtonColors(
        tickColor = if (enabled) colors.primary else colors.granite,
        tickBorderColor = if (enabled) colors.granite else colors.cloud,
        iconColor = if (enabled) colors.black else colors.granite,
        textColor = if (enabled) colors.black else colors.granite,
    )
}

@Composable
internal fun darkRadioButtonColors(enabled: Boolean): SBBRadioButtonColors {
    val colors = SBBTheme.colors
    return SBBRadioButtonColors(
        tickColor = if (enabled) colors.primary else colors.graphite,
        tickBorderColor = if (enabled) colors.cement else colors.iron,
        iconColor = if (enabled) colors.white else colors.graphite,
        textColor = if (enabled) colors.white else colors.graphite,
    )
}

internal data class SBBRadioButtonColors(
    val tickColor: Color,
    val tickBorderColor: Color,
    val iconColor: Color,
    val textColor: Color,
)