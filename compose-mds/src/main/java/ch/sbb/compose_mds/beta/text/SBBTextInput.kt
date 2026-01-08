package ch.sbb.compose_mds.beta.text

import SBBTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.hideFromAccessibility
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.CircleInformationSmall
import ch.sbb.compose_mds.sbbicons.small.DogSmall
import ch.sbb.compose_mds.theme.SBBSpacing

/***
 * Implementation of the SBB Text-Input.
 *
 * @param value Current text to display in the field.
 * @param onValueChange Callback invoked when the input value changes.
 * @param modifier Modifier to be applied to the text field.
 * @param enabled Whether the field is enabled for input.
 * @param readOnly If true, the field is read-only and cannot be edited.
 * @param textStyle TextStyle used for the input text.
 * @param label Optional label text shown above or inside the field depending on focus/state.
 * @param placeholder Optional placeholder text shown when the field is empty and focused.
 * @param leadingIcon Optional leading icon shown at the start of the field.
 * @param trailingIcon Optional trailing icon shown at the end of the field.
 * @param onClickTrailingIcon Optional click handler for the trailing icon.
 * @param supportingText Optional composable shown below the field (when not showing error).
 * @param errorText Optional error text shown when [isError] is true.
 * @param isError When true, the field is shown in an error state.
 * @param visualTransformation VisualTransformation applied to the displayed text (e.g. password).
 * @param keyboardOptions KeyboardOptions for IME configuration.
 * @param keyboardActions KeyboardActions for IME action callbacks.
 * @param singleLine Whether the text field is a single line input.
 * @param maxLines Maximum number of visible lines.
 * @param minLines Minimum number of visible lines.
 * @param interactionSource Interaction source used to observe focus and other interactions.
 * @param colors Optional colors used by component. If null, default colors will be used.
 *
 * TODO: Handle label animation and placing
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/text-input/)
 */
@ExperimentalSBBComponent
@Composable
fun SBBTextInput(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    label: String? = null,
    placeholder: String? = null,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    onClickTrailingIcon: (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    errorText: String? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: SBBTextFieldColors? = null,
) {
    val resolvedColors = colors
        ?: if (SBBTheme.isDarkMode) darkTextFieldColors(enabled = enabled) else lightTextFieldColors(
            enabled = enabled
        )

    val selectionColors = TextSelectionColors(
        handleColor = resolvedColors.selectionHandleColor,
        backgroundColor = resolvedColors.selectionBackgroundColor
    )
    CompositionLocalProvider(LocalTextSelectionColors provides selectionColors) {
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier.fillMaxWidth(),
            enabled = enabled,
            readOnly = readOnly,
            textStyle = textStyle.copy(color = if (isError) resolvedColors.errorColor else resolvedColors.inputTextColor),
            cursorBrush = SolidColor(resolvedColors.cursorColor),
            visualTransformation = visualTransformation,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            interactionSource = interactionSource,
            singleLine = singleLine,
            maxLines = maxLines,
            minLines = minLines,
            decorationBox = @Composable { innerTextField ->
                val isFocused = interactionSource.collectIsFocusedAsState().value
                Column {
                    Row {
                        if (leadingIcon != null) {
                            Icon(
                                modifier = Modifier
                                    .padding(top = 14.dp)
                                    .semantics { hideFromAccessibility() },
                                imageVector = leadingIcon,
                                contentDescription = null,
                                tint = resolvedColors.iconColor
                            )
                            Spacer(Modifier.width(SBBSpacing.XSmall))
                        }

                        Column {
                            val inputState =
                                when {
                                    isFocused && value.isEmpty() -> InputPhase.FOCUSED_EMPTY
                                    isFocused -> InputPhase.FOCUSED_NOT_EMPTY
                                    value.isEmpty() -> InputPhase.UNFOCUSED_EMPTY
                                    else -> InputPhase.UNFOCUSED_NOT_EMPTY
                                }

                            Text(
                                if (inputState != InputPhase.UNFOCUSED_EMPTY && label != null) label else "",
                                style = SBBTheme.sbbTypography.XXSmallLight,
                                color = resolvedColors.labelColor
                            )

                            Row(
                                modifier = Modifier.padding(top = 2.dp, bottom = 4.dp),
                                verticalAlignment = Alignment.Top
                            ) {
                                Box(modifier = Modifier.weight(1f)) {
                                    if (value.isEmpty() && placeholder != null && inputState == InputPhase.FOCUSED_EMPTY) {
                                        Text(
                                            placeholder,
                                            style = textStyle,
                                            color = resolvedColors.placeholderColor
                                        )
                                    }
                                    if (value.isEmpty() && label != null && inputState == InputPhase.UNFOCUSED_EMPTY) {
                                        Text(
                                            label,
                                            style = textStyle,
                                            color = resolvedColors.placeholderColor
                                        )
                                    }
                                    innerTextField()
                                }
                                if (trailingIcon != null) {
                                    Spacer(Modifier.width(SBBSpacing.XSmall))
                                    Icon(
                                        modifier = Modifier
                                            .semantics { hideFromAccessibility() }
                                            .clickable(
                                                enabled = onClickTrailingIcon != null,
                                                onClick = onClickTrailingIcon ?: {}),
                                        imageVector = trailingIcon,
                                        contentDescription = null,
                                        tint = resolvedColors.trailingIconColor
                                    )
                                }
                            }
                        }
                    }

                    if (isError && !errorText.isNullOrEmpty()) {
                        Text(
                            text = errorText,
                            color = resolvedColors.errorColor,
                            style = SBBTheme.sbbTypography.XXSmallBold,
                            modifier = Modifier.padding(bottom = SBBSpacing.XXSmall)
                        )
                    }

                    val underlineColor = when {
                        isError -> resolvedColors.errorColor
                        isFocused -> resolvedColors.focusedUnderlineColor
                        else -> resolvedColors.underlineColor
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(underlineColor)
                    )

                    if (supportingText != null && (!isError || errorText.isNullOrEmpty())) {
                        Box(modifier = Modifier.padding(top = SBBSpacing.XXSmall)) {
                            CompositionLocalProvider(LocalContentColor provides resolvedColors.labelColor) {
                                ProvideTextStyle(SBBTheme.sbbTypography.helpersLabel) {
                                    supportingText()
                                }
                            }
                        }
                    }
                }
            }
        )
    }
}

private enum class InputPhase {
    // Text field is focused and value is empty
    FOCUSED_EMPTY,

    // Text field is focused and value is empty
    FOCUSED_NOT_EMPTY,

    // Text field is not focused and value is empty
    UNFOCUSED_EMPTY,

    // Text field is not focused but value is not empty
    UNFOCUSED_NOT_EMPTY
}

@OptIn(ExperimentalSBBComponent::class)
@Preview(showBackground = true)
@Composable
internal fun _Preview_SBBTextInput() {
    SBBTheme {
        Surface {
            SBBTextInput(
                value = "Value",
                onValueChange = { },
                label = "Label",
                placeholder = "Placeholder",
                leadingIcon = SBBIcons.Small.DogSmall,
                trailingIcon = SBBIcons.Small.CircleInformationSmall,
            )
        }
    }
}