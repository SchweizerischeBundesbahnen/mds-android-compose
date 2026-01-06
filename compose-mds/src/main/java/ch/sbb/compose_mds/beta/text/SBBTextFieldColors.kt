package ch.sbb.compose_mds.beta.text

import SBBTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import ch.sbb.compose_mds.theme.PrimitiveColors

/**
 * Colors used by [SBBTextInput] and [SBBTextarea].
 *
 * TODO: Replace with style tokens in theme
 *
 * Note: will be replaced by style tokens in theme in future release
 */
data class SBBTextFieldColors(
    val inputTextColor: Color,
    val labelColor: Color,
    val underlineColor: Color,
    val focusedUnderlineColor: Color,
    val cursorColor: Color,
    val placeholderColor: Color,
    val errorColor: Color,
    val selectionHandleColor: Color,
    val selectionBackgroundColor: Color,
    val iconColor: Color,
    val trailingIconColor: Color,
)

@Composable
internal fun lightTextFieldColors(enabled: Boolean): SBBTextFieldColors {
    val colors = SBBTheme.colors
    return SBBTextFieldColors(
        inputTextColor = if (enabled) PrimitiveColors.black else colors.granite,
        labelColor = PrimitiveColors.granite,
        underlineColor = PrimitiveColors.cloud,
        focusedUnderlineColor = PrimitiveColors.black,
        cursorColor = PrimitiveColors.sky,
        placeholderColor = PrimitiveColors.granite,
        errorColor = PrimitiveColors.red,
        selectionHandleColor = PrimitiveColors.red,
        selectionBackgroundColor = PrimitiveColors.red.copy(alpha = 0.38f),
        iconColor = if (enabled) PrimitiveColors.black else colors.granite,
        trailingIconColor = if (enabled) PrimitiveColors.black else colors.granite,
    )
}

@Composable
internal fun darkTextFieldColors(enabled: Boolean): SBBTextFieldColors {
    val colors = SBBTheme.colors
    return SBBTextFieldColors(
        inputTextColor = if (enabled) PrimitiveColors.white else colors.graphite,
        labelColor = PrimitiveColors.graphite,
        underlineColor = PrimitiveColors.iron,
        focusedUnderlineColor = PrimitiveColors.white,
        cursorColor = PrimitiveColors.sky,
        placeholderColor = PrimitiveColors.graphite,
        errorColor = PrimitiveColors.redDarkMode,
        selectionHandleColor = PrimitiveColors.redDarkMode,
        selectionBackgroundColor = PrimitiveColors.redDarkMode.copy(alpha = 0.38f),
        iconColor = if (enabled) PrimitiveColors.white else colors.graphite,
        trailingIconColor = if (enabled) PrimitiveColors.white else colors.graphite,
    )
}