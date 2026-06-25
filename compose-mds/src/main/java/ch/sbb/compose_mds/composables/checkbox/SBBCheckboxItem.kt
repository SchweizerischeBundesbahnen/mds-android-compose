package ch.sbb.compose_mds.composables.checkbox

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.selection.triStateToggleable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import ch.sbb.compose_mds.composables.checkbox.SBBCheckboxItem.Boxed
import ch.sbb.compose_mds.composables.checkbox.SBBCheckboxItem.Default
import ch.sbb.compose_mds.composables.checkbox.SBBCheckboxUtils.nextState
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.composables.listItem.SBBListItem
import ch.sbb.compose_mds.composables.listItem.SBBListItemStyle
import ch.sbb.compose_mds.composables.listItem.withXSmallHorizontalGap
import ch.sbb.compose_mds.theme.SBBTheme

/**
 * Implementation of the SBB checkbox enclosed in a list-item.
 *
 * Available are the variants [Boxed] and [Default].
 * They can be used as a List, wrapped in an [SBBList.Wrap] or as standalone [Boxed] versions.
 *
 * For full specification, please visit [digital.sbb.ch](https://digital.sbb.ch/en/design-system/mobile/components/checkbox/).
 */
object SBBCheckboxItem {
    object Tristate {
        /**
         * Boxed variant of the switch radio button.
         *
         * Wraps the item in a content box so it can be used as a standalone element.
         *
         * @param title Main title text for the item.
         * @param state Current checked state of the switch.
         * @param modifier The modifier to apply to the outer container.
         * @param subtitle Optional subtitle text for the item.
         * @param interactionSource Optional interaction source used for the switch and click handling.
         * @param onCheckedChange Optional callback invoked when the switch is toggled. If null,
         *        the item is rendered as disabled.
         * @param enabled Whether the item and its controls are enabled. Defaults to true when
         *        [onCheckedChange] is provided.
         */
        @Composable
        fun Boxed(
            title: String,
            state: ToggleableState,
            modifier: Modifier = Modifier,
            subtitle: String? = null,
            interactionSource: MutableInteractionSource? = remember { MutableInteractionSource() },
            onCheckedChange: ((ToggleableState) -> Unit)? = null,
            enabled: Boolean = onCheckedChange != null,
            listStyle: SBBListItemStyle = SBBTheme.listItem.withXSmallHorizontalGap,
            style: SBBCheckboxStyle = SBBTheme.checkbox,
        ) {
            SBBContentBox(contentPadding = PaddingValues.Zero) {
                Default(
                    modifier = modifier,
                    interactionSource = interactionSource,
                    title = title,
                    subtitle = subtitle,
                    state = state,
                    onCheckedChange = onCheckedChange,
                    enabled = enabled,
                    tristate = true,
                    listStyle = listStyle,
                    style = style,
                )
            }
        }

        /**
         * Boxed variant of the switch radio button.
         *
         * Wraps the item in a content box so it can be used as a standalone element.
         *
         * @param title Main title text for the item.
         * @param state Current checked state of the switch.
         * @param modifier The modifier to apply to the outer container.
         * @param subtitle Optional subtitle text for the item.
         * @param interactionSource Optional interaction source used for the switch and click handling.
         * @param onCheckedChange Optional callback invoked when the switch is toggled. If null,
         *        the item is rendered as disabled.
         * @param enabled Whether the item and its controls are enabled. Defaults to true when
         *        [onCheckedChange] is provided.
         */
        @Composable
        fun Default(
            title: String,
            state: ToggleableState,
            modifier: Modifier = Modifier,
            subtitle: String? = null,
            interactionSource: MutableInteractionSource? = remember { MutableInteractionSource() },
            onCheckedChange: ((ToggleableState) -> Unit)? = null,
            enabled: Boolean = onCheckedChange != null,
            listStyle: SBBListItemStyle = SBBTheme.listItem.withXSmallHorizontalGap,
            style: SBBCheckboxStyle = SBBTheme.checkbox,
        ) {
            Default(
                modifier = modifier,
                interactionSource = interactionSource,
                title = title,
                subtitle = subtitle,
                state = state,
                onCheckedChange = onCheckedChange,
                enabled = enabled,
                tristate = true,
                listStyle = listStyle,
                style = style,
            )
        }
    }

    /**
     * Boxed variant of the switch radio button.
     *
     * Wraps the item in a content box so it can be used as a standalone element.
     *
     * @param title Main title text for the item.
     * @param state Current checked state of the switch.
     * @param modifier The modifier to apply to the outer container.
     * @param subtitle Optional subtitle text for the item.
     * @param interactionSource Optional interaction source used for the switch and click handling.
     * @param onCheckedChange Optional callback invoked when the switch is toggled. If null,
     *        the item is rendered as disabled.
     * @param enabled Whether the item and its controls are enabled. Defaults to true when
     *        [onCheckedChange] is provided.
     * @param listStyle an optional customized style for the enclosing list item.
     * @param style an optional customized style.
     */
    @Composable
    fun Boxed(
        title: String,
        state: ToggleableState,
        modifier: Modifier = Modifier,
        subtitle: String? = null,
        interactionSource: MutableInteractionSource? = remember { MutableInteractionSource() },
        onCheckedChange: ((ToggleableState) -> Unit)? = null,
        enabled: Boolean = onCheckedChange != null,
        listStyle: SBBListItemStyle = SBBTheme.listItem.withXSmallHorizontalGap,
        style: SBBCheckboxStyle = SBBTheme.checkbox,
    ) {
        SBBContentBox(contentPadding = PaddingValues.Zero) {
            Default(
                modifier = modifier,
                interactionSource = interactionSource,
                title = title,
                subtitle = subtitle,
                state = state,
                onCheckedChange = onCheckedChange,
                enabled = enabled,
                listStyle = listStyle,
                style = style,
            )
        }
    }

    /**
     *  Default (inline) variant of the radio button item.
     *
     * Wraps the item in a content box so it can be used as a standalone element.
     *
     * @param title Main title text for the item.
     * @param state Current checked state of the switch.
     * @param modifier The modifier to apply to the outer container.
     * @param subtitle Optional subtitle text for the item.
     * @param interactionSource Optional interaction source used for the switch and click handling.
     * @param onCheckedChange Optional callback invoked when the switch is toggled. If null,
     *        the item is rendered as disabled.
     * @param enabled Whether the item and its controls are enabled. Defaults to true when
     *        [onCheckedChange] is provided.
     * @param listStyle an optional customized style for the enclosing list item.
     * @param style an optional customized style.
     */
    @Composable
    fun Default(
        title: String,
        state: ToggleableState,
        modifier: Modifier = Modifier,
        subtitle: String? = null,
        interactionSource: MutableInteractionSource? = remember { MutableInteractionSource() },
        onCheckedChange: ((ToggleableState) -> Unit)? = null,
        enabled: Boolean = onCheckedChange != null,
        tristate: Boolean = false,
        listStyle: SBBListItemStyle = SBBTheme.listItem.withXSmallHorizontalGap,
        style: SBBCheckboxStyle = SBBTheme.checkbox,
    ) {
        val toggleableModifier =
            Modifier.triStateToggleable(
                state = state,
                enabled = enabled,
                role = Role.Checkbox,
                onClick = { onCheckedChange?.invoke(state.nextState(triStateEnabled = tristate)) },
            )
        SBBListItem.Custom(
            modifier = modifier then toggleableModifier,
            style = listStyle,
            title = { Text(title) },
            subtitle = subtitle?.let { { Subtext(it) } },
            interactionSource = interactionSource,
            enabled = enabled,
            leading = {
                DrawCheckbox(
                    state = state,
                    style = style,
                    disabled = !enabled,
                )
            },
        )
    }
}

@Preview(showBackground = true, name = "Checkbox - Default")
@Composable
private fun PreviewSBBCheckboxItem_Default() {
    SBBTheme {
        Default(
            title = "Default",
            state = ToggleableState.On,
            onCheckedChange = {},
        )
    }
}

@Preview(showBackground = true, name = "Checkbox - Disabled")
@Composable
private fun PreviewSBBCheckboxItem_Disabled() {
    SBBTheme {
        Default(
            title = "Disabled",
            state = ToggleableState.Off,
            onCheckedChange = {},
            enabled = false,
        )
    }
}

@Preview(showBackground = true, name = "Checkbox - Boxed")
@Composable
private fun PreviewSBBCheckboxItem_Boxed() {
    SBBTheme {
        Boxed(
            title = "Boxed",
            state = ToggleableState.On,
            onCheckedChange = {},
        )
    }
}

@Preview(showBackground = true, name = "RadioButton - Boxed - Disabled")
@Composable
private fun PreviewSBBCheckboxItem_Boxed_Disabled() {
    SBBTheme {
        Boxed(
            title = "Boxed Disabled",
            state = ToggleableState.On,
            onCheckedChange = {},
            enabled = false,
        )
    }
}

@Preview(showBackground = true, name = "RadioButton - Boxed - Disabled")
@Composable
private fun PreviewSBBCheckboxItem_Tristate() {
    SBBTheme {
        SBBCheckboxItem.Tristate.Default(
            title = "Tristate",
            state = ToggleableState.Indeterminate,
            onCheckedChange = {},
        )
    }
}
