package ch.sbb.compose_mds.beta.dropdown

import SBBTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import ch.sbb.compose_mds.theme.PrimitiveColors

/**
 * Colors used by [SBBDropdown].
 *
 * TODO: Replace with style tokens in theme
 *
 * Note: will be replaced by style tokens in theme in future release
 */
data class SBBDropdownColors(
    val valueTextColor: Color,
    val labelColor: Color,
    val underlineColor: Color,
    val placeholderColor: Color,
    val errorColor: Color,
    val iconColor: Color,
    val dropdownIconColor: Color,
)

@Composable
internal fun lightDropdownColors(enabled: Boolean): SBBDropdownColors {
    val colors = SBBTheme.colors
    return SBBDropdownColors(
        valueTextColor = if (enabled) PrimitiveColors.black else colors.granite,
        labelColor = PrimitiveColors.granite,
        underlineColor = PrimitiveColors.cloud,
        placeholderColor = PrimitiveColors.granite,
        errorColor = PrimitiveColors.red,
        iconColor = if (enabled) PrimitiveColors.black else colors.granite,
        dropdownIconColor = if (enabled) PrimitiveColors.black else colors.granite,
    )
}

@Composable
internal fun darkDropdownColors(enabled: Boolean): SBBDropdownColors {
    val colors = SBBTheme.colors
    return SBBDropdownColors(
        valueTextColor = if (enabled) PrimitiveColors.white else colors.graphite,
        labelColor = PrimitiveColors.graphite,
        underlineColor = PrimitiveColors.iron,
        placeholderColor = PrimitiveColors.graphite,
        errorColor = PrimitiveColors.redDarkMode,
        iconColor = if (enabled) PrimitiveColors.white else colors.graphite,
        dropdownIconColor = if (enabled) PrimitiveColors.white else colors.graphite,
    )
}