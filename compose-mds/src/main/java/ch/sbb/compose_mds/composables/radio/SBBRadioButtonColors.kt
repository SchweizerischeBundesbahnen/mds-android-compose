package ch.sbb.compose_mds.composables.radio

import SBBTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
internal fun lightRadioButtonColors(disabled: Boolean): SBBRadioButtonColors {
    val colors = SBBTheme.colors
    return SBBRadioButtonColors(
        tickColor = if (disabled) colors.granite else colors.primary,
        tickBorderColor = if (disabled) colors.cloud else colors.granite,
        iconColor = if (disabled) colors.granite else colors.black,
        textColor = if (disabled) colors.granite else colors.black,
    )
}

@Composable
internal fun darkRadioButtonColors(disabled: Boolean): SBBRadioButtonColors {
    val colors = SBBTheme.colors
    return SBBRadioButtonColors(
        tickColor = if (disabled) colors.graphite else colors.primary,
        tickBorderColor = if (disabled) colors.iron else colors.cement,
        iconColor = if (disabled) colors.graphite else colors.white,
        textColor = if (disabled) colors.graphite else colors.white,
    )
}

internal data class SBBRadioButtonColors(
    val tickColor: Color,
    val tickBorderColor: Color,
    val iconColor: Color,
    val textColor: Color,
)