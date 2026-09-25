package ch.sbb.compose_mds.composables.switch

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import ch.sbb.compose_mds.theme.SBBColors
import ch.sbb.compose_mds.theme.SBBTheme

private const val disabledAlpha = 0.4f

@Composable
internal fun lightSwitchColors(enabled: Boolean): SBBSwitchColors {
    val colorScheme = SBBTheme.colorScheme
    val alpha = if (enabled) 1f else disabledAlpha
    return SBBSwitchColors(
        knobBackgroundColor = SBBColors.white,
        knobBorderColor = SBBColors.granite,
        checkedKnobBorderColor = colorScheme.primary,
        iconColor = colorScheme.primary,
        backgroundColor = SBBColors.graphite,
        checkedBackgroundColor = colorScheme.primary,
    ).withAlpha(alpha, SBBColors.milk)
}

@Composable
internal fun darkSwitchColors(enabled: Boolean): SBBSwitchColors {
    val colorScheme = SBBTheme.colorScheme
    val alpha = if (enabled) 1f else disabledAlpha
    return SBBSwitchColors(
        knobBackgroundColor = SBBColors.white,
        knobBorderColor = SBBColors.granite,
        checkedKnobBorderColor = colorScheme.primary,
        iconColor = colorScheme.primary,
        backgroundColor = SBBColors.graphite,
        checkedBackgroundColor = colorScheme.primary,
    ).withAlpha(alpha, SBBColors.midnight)
}

data class SBBSwitchColors(
    val knobBackgroundColor: Color,
    val knobBorderColor: Color,
    val checkedKnobBorderColor: Color,
    val iconColor: Color,
    val backgroundColor: Color,
    val checkedBackgroundColor: Color,
)

private fun SBBSwitchColors.withAlpha(
    alpha: Float,
    blendColor: Color,
): SBBSwitchColors {
    if (alpha >= 1f) return this

    return copy(
        knobBackgroundColor = knobBackgroundColor.blendOver(blendColor, alpha),
        knobBorderColor = knobBorderColor.blendOver(blendColor, alpha),
        checkedKnobBorderColor = checkedKnobBorderColor.blendOver(blendColor, alpha),
        iconColor = iconColor.blendOver(blendColor, alpha),
        backgroundColor = backgroundColor.blendOver(blendColor, alpha),
        checkedBackgroundColor = checkedBackgroundColor.blendOver(blendColor, alpha),
    )
}

private fun Color.blendOver(
    blendColor: Color,
    alpha: Float,
): Color {
    val a = alpha.coerceIn(0f, 1f)
    val r = blendColor.red * (1f - a) + this.red * a
    val g = blendColor.green * (1f - a) + this.green * a
    val b = blendColor.blue * (1f - a) + this.blue * a
    return Color(r.coerceIn(0f, 1f), g.coerceIn(0f, 1f), b.coerceIn(0f, 1f), 1f)
}
