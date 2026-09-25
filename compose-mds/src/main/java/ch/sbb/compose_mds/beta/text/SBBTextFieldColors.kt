package ch.sbb.compose_mds.beta.text

import ch.sbb.compose_mds.theme.SBBTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import ch.sbb.compose_mds.theme.SBBColors

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
    return SBBTextFieldColors(
        inputTextColor = if (enabled) SBBColors.black else SBBColors.granite,
        labelColor = SBBColors.granite,
        underlineColor = SBBColors.cloud,
        focusedUnderlineColor = SBBColors.black,
        cursorColor = SBBColors.sky,
        placeholderColor = SBBColors.granite,
        errorColor = SBBColors.red,
        selectionHandleColor = SBBColors.red,
        selectionBackgroundColor = SBBColors.red.copy(alpha = 0.38f),
        iconColor = if (enabled) SBBColors.black else SBBColors.granite,
        trailingIconColor = if (enabled) SBBColors.black else SBBColors.granite,
    )
}

@Composable
internal fun darkTextFieldColors(enabled: Boolean): SBBTextFieldColors {
    return SBBTextFieldColors(
        inputTextColor = if (enabled) SBBColors.white else SBBColors.graphite,
        labelColor = SBBColors.graphite,
        underlineColor = SBBColors.iron,
        focusedUnderlineColor = SBBColors.white,
        cursorColor = SBBColors.sky,
        placeholderColor = SBBColors.graphite,
        errorColor = SBBColors.errorDark,
        selectionHandleColor = SBBTheme.colorScheme.selection,
        selectionBackgroundColor = SBBTheme.colorScheme.selection.copy(alpha = 0.38f),
        iconColor = if (enabled) SBBColors.white else SBBColors.graphite,
        trailingIconColor = if (enabled) SBBColors.white else SBBColors.graphite,
    )
}