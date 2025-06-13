@file:OptIn(ExperimentalComposeUiApi::class)

package ch.sbb.compose_mds.beta.text

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.CombinedModifier
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.hideFromAccessibility
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.theme.SBBColors

@ExperimentalSBBComponent
@Composable
fun SBBTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = TextFieldDefaults.shape,
    colors: TextFieldColors? = null,
) {
    val decoratedLeadingIcon: @Composable (() -> Unit)? = leadingIcon?.let {
        @Composable {
            Icon(
                modifier = Modifier.semantics { hideFromAccessibility() },
                imageVector = leadingIcon,
                contentDescription = null,
            )
        }
    }
    val decoratedTrailingIcon: @Composable (() -> Unit)? = trailingIcon?.let {
        @Composable {
            Icon(
                modifier = Modifier.semantics { hideFromAccessibility() },
                imageVector = trailingIcon,
                contentDescription = null,
            )
        }
    }

    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = CombinedModifier(
            inner = modifier,
            outer = Modifier
                .fillMaxWidth()
        ),
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle,
        label = label,
        placeholder = placeholder,
        leadingIcon = decoratedLeadingIcon,
        trailingIcon = decoratedTrailingIcon,
        prefix = prefix,
        suffix = suffix,
        supportingText = supportingText,
        isError = isError,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = singleLine,
        maxLines = maxLines,
        minLines = minLines,
        interactionSource = interactionSource,
        shape = shape,
        colors = colors ?: colors(),
    )
}

@Composable
private fun colors(): TextFieldColors {
    val textColor = themedValue(SBBColors.black, SBBColors.white)
    val containerColor = SBBColors.transparent
    val cursorColor = Color(0xFF007AFF)
    val unfocusedIndicatorColor = themedValue(SBBColors.cloud, SBBColors.iron)
    val iconColor = themedValue(SBBColors.black, SBBColors.white)
    val labelColor = themedValue(SBBColors.granite, SBBColors.graphite)
    val placeholderColor = themedValue(SBBColors.granite, SBBColors.graphite)
    return TextFieldDefaults.colors(
        focusedTextColor = textColor,
        unfocusedTextColor = textColor,
        disabledTextColor = themedValue(SBBColors.granite, SBBColors.graphite),
        errorTextColor = themedValue(SBBColors.red, SBBColors.redDarkMode),
        focusedContainerColor = containerColor,
        unfocusedContainerColor = containerColor,
        disabledContainerColor = containerColor,
        errorContainerColor = containerColor,
        cursorColor = cursorColor,
        errorCursorColor = cursorColor,
        selectionColors = TextSelectionColors(
            handleColor = SBBColors.red,
            backgroundColor = SBBColors.red.copy(alpha = 0.38f)
        ),
        focusedIndicatorColor = themedValue(SBBColors.black, SBBColors.white),
        unfocusedIndicatorColor = unfocusedIndicatorColor,
        disabledIndicatorColor = unfocusedIndicatorColor,
        errorIndicatorColor = SBBColors.red,
        focusedLeadingIconColor = iconColor,
        unfocusedLeadingIconColor = iconColor,
        disabledLeadingIconColor = themedValue(SBBColors.granite, SBBColors.graphite),
        errorLeadingIconColor = SBBColors.red,
        focusedTrailingIconColor = iconColor,
        unfocusedTrailingIconColor = iconColor,
        disabledTrailingIconColor = themedValue(SBBColors.granite, SBBColors.graphite),
        errorTrailingIconColor = iconColor,
        focusedLabelColor = labelColor,
        unfocusedLabelColor = labelColor,
        disabledLabelColor = labelColor,
        errorLabelColor = labelColor,
        focusedPlaceholderColor = placeholderColor,
        unfocusedPlaceholderColor = placeholderColor,
        disabledPlaceholderColor = placeholderColor,
        errorPlaceholderColor = placeholderColor,
    )
}

@Composable
private fun <T> themedValue(lightThemeValue: T, darkThemeValue: T): T {
    if (isSystemInDarkTheme()) {
        return darkThemeValue
    }
    return lightThemeValue
}
