package ch.sbb.compose_mds.beta.text

import SBBTheme
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.CircleInformationSmall
import ch.sbb.compose_mds.sbbicons.small.DogSmall

/***
 * Implementation of the SBB Textarea
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
 * @param minLines Minimum number of visible lines.
 * @param interactionSource Interaction source used to observe focus and other interactions.
 * @param colors Optional colors used by component. If null, default colors will be used.
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/textarea/)
 */
@ExperimentalSBBComponent
@Composable
fun SBBTextarea(
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
    minLines: Int = 3,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: SBBTextFieldColors? = null,
) {
    SBBTextInput(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle,
        label = label,
        placeholder = placeholder,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        onClickTrailingIcon = onClickTrailingIcon,
        supportingText = supportingText,
        errorText = errorText,
        isError = isError,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = false,
        minLines = minLines,
        maxLines = Int.MAX_VALUE,
        interactionSource = interactionSource,
        colors = colors,
    )
}

@OptIn(ExperimentalSBBComponent::class)
@Preview(showBackground = true)
@Composable
internal fun _Preview_SBBTextarea() {
    SBBTheme {
        Surface {
            SBBTextarea(
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
