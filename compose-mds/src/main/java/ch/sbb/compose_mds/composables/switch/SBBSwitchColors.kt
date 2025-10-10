package ch.sbb.compose_mds.composables.switch

import SBBTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
internal fun lightSwitchColors(): SBBSwitchColors {
    val colors = SBBTheme.colors
    return SBBSwitchColors(
        knobBackgroundColor = colors.white,
        knobBorderColor = colors.granite,
        checkedKnobBorderColor = colors.primary,
        iconColor = colors.primary,
        backgroundColor = colors.graphite,
        checkedBackgroundColor = colors.primary,
    )
}

@Composable
internal fun darkSwitchColors(): SBBSwitchColors {
    val colors = SBBTheme.colors
    return SBBSwitchColors(
        knobBackgroundColor = colors.white,
        knobBorderColor = colors.granite,
        checkedKnobBorderColor = colors.primary,
        iconColor = colors.primary,
        backgroundColor = colors.graphite,
        checkedBackgroundColor = colors.primary,
    )
}

internal data class SBBSwitchColors(
    val knobBackgroundColor: Color,
    val knobBorderColor: Color,
    val checkedKnobBorderColor: Color,
    val iconColor: Color,
    val backgroundColor: Color,
    val checkedBackgroundColor: Color,
)