package ch.sbb.compose_mds.composables.checkbox

import android.content.res.Configuration
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.triStateToggleable
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.hideFromAccessibility
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import ch.sbb.compose_mds.composables.checkbox.SBBCheckboxUtils.asBoolean
import ch.sbb.compose_mds.composables.checkbox.SBBCheckboxUtils.asToggleableState
import ch.sbb.compose_mds.composables.checkbox.SBBCheckboxUtils.nextState
import ch.sbb.compose_mds.theme.SBBTheme

/***
 * Implementation of the SBB Checkbox.
 *
 * @param label The Checkbox Label.
 * @param checked State of the Checkbox. Parameters:
 *  - The parameter [true] will be mapped to [ToggleableState.On].
 *  - The parameter [false] will be mapped to [ToggleableState.Off]
 *  - The parameter [null] will be mapped to [ToggleableState.Off] or [ToggleableState.Indeterminate] when [triStateEnabled] is [true].
 * @param icon An Icon between the Checkbox itself and the [label].
 * @param triStateEnabled Enable or disable the [ToggleableState.Indeterminate] state.
 * @param onCheckedChange Action to change the state of the Checkbox.
 * @param disabled If [true], the Checkbox will be disabled and will have the Disabled style.
 * @param style an optional customized style.
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/checkbox/)
 */
@Composable
fun SBBCheckbox(
    label: String,
    checked: Boolean?,
    onCheckedChange: ((Boolean?) -> Unit)?,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    triStateEnabled: Boolean = false,
    disabled: Boolean = false,
    style: SBBCheckboxStyle = SBBTheme.checkbox,
) {
    SBBCheckbox(
        label = label,
        state = checked.asToggleableState,
        onCheckedChange = onCheckedChange?.let { { state -> it.invoke(state.asBoolean) } },
        modifier = modifier,
        icon = icon,
        triStateEnabled = triStateEnabled,
        disabled = disabled,
        style = style,
    )
}

/***
 * Implementation of the SBB Checkbox.
 *
 * @param label The Checkbox Label.
 * @param state State of the Checkbox.
 * @param icon An Icon between the Checkbox itself and the [label].
 * @param triStateEnabled Enable or disable the [ToggleableState.Indeterminate] state.
 * @param onCheckedChange Action to change the state of the Checkbox.
 * @param disabled If [true], the Checkbox will be disabled and will have the Disabled style.
 * @param style an optional customized style.
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/checkbox/)
 */
@Composable
fun SBBCheckbox(
    label: String,
    state: ToggleableState,
    onCheckedChange: ((ToggleableState) -> Unit)?,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    triStateEnabled: Boolean = false,
    disabled: Boolean = false,
    style: SBBCheckboxStyle = SBBTheme.checkbox,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier =
            modifier
                .triStateToggleable(
                    state,
                    enabled = !disabled,
                    role = Role.Checkbox,
                    onClick = { onCheckedChange?.invoke(state.nextState(triStateEnabled)) },
                ).fillMaxWidth()
                .padding(style.layout.padding),
    ) {
        DrawCheckbox(
            modifier = Modifier.padding(end = style.layout.padding),
            state = state,
            disabled = disabled,
            style = style,
        )
        val colors by style.resolvedColors(!disabled)
        if (icon != null) {
            Icon(
                modifier =
                    Modifier
                        .semantics { hideFromAccessibility() }
                        .padding(end = style.layout.padding),
                imageVector = icon,
                contentDescription = null,
                tint = colors.icon,
            )
        }
        Text(text = label, color = colors.text)
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview_Enabled_SBBCheckbox() = _Preview_Enabled_SBBCheckbox()

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview_Disabled_SBBCheckbox() = _Preview_Disabled_SBBCheckbox()
