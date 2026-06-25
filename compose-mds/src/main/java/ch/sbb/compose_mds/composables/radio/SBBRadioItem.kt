package ch.sbb.compose_mds.composables.radio

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.composables.listItem.SBBListItem
import ch.sbb.compose_mds.composables.listItem.SBBListItemStyle
import ch.sbb.compose_mds.composables.listItem.withXSmallHorizontalGap
import ch.sbb.compose_mds.theme.SBBTheme

/**
 * Implementation of the SBB radio-button enclosed in a list-item.
 *
 * Available are the variants [Boxed] and [Default].
 * They can be used as a List, wrapped in an [SBBList.Wrap] or as standalone [Boxed] versions.
 *
 * For full specification, please visit [digital.sbb.ch](https://digital.sbb.ch/en/design-system/mobile/components/radio-button/).
 */
object SBBRadioItem {
    /**
     * Boxed variant of the switch radio button.
     *
     * Wraps the item in a content box so it can be used as a standalone element.
     *
     * @param title Main title text for the item.
     * @param checked Current checked state of the switch.
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
        checked: Boolean,
        modifier: Modifier = Modifier,
        subtitle: String? = null,
        interactionSource: MutableInteractionSource? = remember { MutableInteractionSource() },
        onCheckedChange: ((Boolean) -> Unit)? = null,
        enabled: Boolean = onCheckedChange != null,
        listStyle: SBBListItemStyle = SBBTheme.listItem.withXSmallHorizontalGap,
        style: SBBRadioStyle = SBBTheme.radio,
    ) {
        SBBContentBox(contentPadding = PaddingValues.Zero) {
            Default(
                modifier = modifier,
                interactionSource = interactionSource,
                title = title,
                subtitle = subtitle,
                checked = checked,
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
     * @param checked Current checked state of the switch.
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
        checked: Boolean,
        modifier: Modifier = Modifier,
        subtitle: String? = null,
        interactionSource: MutableInteractionSource? = remember { MutableInteractionSource() },
        onCheckedChange: ((Boolean) -> Unit)? = null,
        enabled: Boolean = onCheckedChange != null,
        listStyle: SBBListItemStyle = SBBTheme.listItem.withXSmallHorizontalGap,
        style: SBBRadioStyle = SBBTheme.radio,
    ) {
        SBBListItem.Custom(
            modifier = modifier,
            style = listStyle,
            title = { Text(title) },
            subtitle = subtitle?.let { { Subtext(it) } },
            interactionSource = interactionSource,
            onClick = onCheckedChange?.let { { it(!checked) } },
            leading = {
                DrawRadio(
                    selected = checked,
                    enabled = enabled,
                    style = style,
                )
            },
        )
    }
}

@Preview(showBackground = true, name = "RadioButton - Default")
@Composable
private fun PreviewSBBRadioButtonItem_Default() {
    SBBTheme {
        SBBRadioItem.Default(
            title = "Default",
            checked = true,
            onCheckedChange = {},
        )
    }
}

@Preview(showBackground = true, name = "RadioButton - Disabled")
@Composable
private fun PreviewSBBRadioButtonItem_Disabled() {
    SBBTheme {
        SBBRadioItem.Default(
            title = "Disabled",
            checked = true,
            onCheckedChange = {},
            enabled = false,
        )
    }
}

@Preview(showBackground = true, name = "RadioButton - Boxed - Disabled")
@Composable
private fun PreviewSBBRadioButtonItem_Boxed() {
    SBBTheme {
        SBBRadioItem.Boxed(
            title = "Boxed",
            checked = true,
            onCheckedChange = {},
        )
    }
}

@Preview(showBackground = true, name = "RadioButton - Boxed - Disabled")
@Composable
private fun PreviewSBBRadioButtonItem_Boxed_Disabled() {
    SBBTheme {
        SBBRadioItem.Boxed(
            title = "Boxed Disabled",
            checked = true,
            onCheckedChange = {},
            enabled = false,
        )
    }
}
