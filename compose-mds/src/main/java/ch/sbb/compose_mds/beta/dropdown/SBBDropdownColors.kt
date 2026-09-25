package ch.sbb.compose_mds.beta.dropdown

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import ch.sbb.compose_mds.theme.SBBColors

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
    return SBBDropdownColors(
        valueTextColor = if (enabled) SBBColors.black else SBBColors.granite,
        labelColor = SBBColors.granite,
        underlineColor = SBBColors.cloud,
        placeholderColor = SBBColors.granite,
        errorColor = SBBColors.error,
        iconColor = if (enabled) SBBColors.black else SBBColors.granite,
        dropdownIconColor = if (enabled) SBBColors.black else SBBColors.granite,
    )
}

@Composable
internal fun darkDropdownColors(enabled: Boolean): SBBDropdownColors {
    return SBBDropdownColors(
        valueTextColor = if (enabled) SBBColors.white else SBBColors.graphite,
        labelColor = SBBColors.graphite,
        underlineColor = SBBColors.iron,
        placeholderColor = SBBColors.graphite,
        errorColor = SBBColors.errorDark,
        iconColor = if (enabled) SBBColors.white else SBBColors.graphite,
        dropdownIconColor = if (enabled) SBBColors.white else SBBColors.graphite,
    )
}