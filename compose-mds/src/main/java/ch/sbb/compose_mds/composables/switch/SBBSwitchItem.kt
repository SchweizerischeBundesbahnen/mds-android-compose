package ch.sbb.compose_mds.composables.listItem

import SBBTheme
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.composables.switch.SBBSwitch
import ch.sbb.compose_mds.theme.SBBSpacing

/**
 * Implementation of the SBB switch-item.
 *
 * Available are the variants [Default].
 * they can be used as a List, wrapped in a [SBBList.Wrap] or as standalone [Boxed] versions.
 *
 * For full specification, please visit [digital.sbb.ch](https://digital.sbb.ch/en/design-system/mobile/components/switch/).
 */
object SBBSwitchItem {
    /**
     * Boxed variant of the switch list item.
     *
     * Wraps the item in a content box so it can be used as a standalone grouped element.
     *
     * @param modifier Modifier to apply to the outer container.
     * @param interactionSource Optional interaction source used for the switch and click handling.
     * @param title Main title text for the item.
     * @param subtitle Subtitle text displayed below the title.
     * @param checked Current checked state of the switch.
     * @param onCheckedChange Optional callback invoked when the switch is toggled. If null,
     *        the item is rendered as disabled.
     * @param enabled Whether the item and its controls are enabled. Defaults to true when
     *        [onCheckedChange] is provided.
     * @param links Optional slot for additional link items shown below this item (e.g. extra
     *        actions or child items).
     */
    @Composable
    fun Boxed(
        title: String,
        subtitle: String,
        checked: Boolean,
        modifier: Modifier = Modifier,
        interactionSource: MutableInteractionSource? = remember { MutableInteractionSource() },
        onCheckedChange: ((Boolean) -> Unit)? = null,
        enabled: Boolean = onCheckedChange != null,
        links: (@Composable () -> Unit)? = null,
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
                links = links,
            )
        }
    }

    /**
     * Default (inline) variant of the switch list item.
     *
     * Renders the item suitable for placement in a divided list. The trailing slot is used to
     * render an [SBBSwitch]. The item becomes clickable and toggles when [onCheckedChange] is
     * provided — the [onClick] behavior is handled by forwarding a toggle action.
     *
     * @param modifier Modifier to apply to the item.
     * @param interactionSource Optional interaction source shared with the switch.
     * @param title Main title text.
     * @param subtitle Subtitle text shown below the title.
     * @param checked Current checked state shown by the switch.
     * @param onCheckedChange Optional callback invoked when the switch is toggled; also used
     *        to provide the item click behavior.
     * @param enabled Whether the control is enabled. Defaults to true when [onCheckedChange]
     *        is provided.
     * @param links Optional composable slot to render link items beneath this item.
     */
    @Composable
    fun Default(
        title: String,
        subtitle: String,
        checked: Boolean,
        modifier: Modifier = Modifier,
        interactionSource: MutableInteractionSource? = remember { MutableInteractionSource() },
        onCheckedChange: ((Boolean) -> Unit)? = null,
        enabled: Boolean = onCheckedChange != null,
        links: (@Composable () -> Unit)? = null,
    ) {
        SBBList.DividedColumn(divider = { HorizontalDivider(modifier = Modifier.padding(start = SBBSpacing.Medium)) }) {
            SBBListItem.Custom(
                modifier = modifier,
                titleText = title,
                subtitleText = subtitle,
                interactionSource = interactionSource,
                onClick = onCheckedChange?.let { { it(!checked) } },
                trailing = {
                    SBBSwitch(
                        checked = checked,
                        onCheckedChange = onCheckedChange,
                        enabled = enabled,
                        interactionSource = interactionSource,
                    )
                },
            )
            links?.invoke()
        }
    }
}

@Preview(showBackground = true, name = "Switch - Default")
@Composable
private fun PreviewSBBSwitchItem_Default() {
    SBBTheme {
        SBBSwitchItem.Boxed(
            title = "Default",
            subtitle = "Sub",
            checked = true,
            onCheckedChange = {},
        )
    }
}

@Preview(showBackground = true, name = "Switch - Links")
@Composable
private fun PreviewSBBSwitchItem_Links() {
    SBBTheme {
        SBBSwitchItem.Boxed(
            title = "Links",
            subtitle = "multiple!",
            checked = true,
            onCheckedChange = {},
            links = {
                SBBListItem.Link(
                    title = "Link 1",
                    onClick = {},
                )
                SBBListItem.Link(
                    title = "Link 2",
                    onClick = {},
                )
                SBBListItem.Link(
                    title = "Link 3",
                    onClick = {},
                )
                SBBListItem.Link(
                    title = "Link 4",
                    onClick = {},
                )
            },
        )
    }
}
