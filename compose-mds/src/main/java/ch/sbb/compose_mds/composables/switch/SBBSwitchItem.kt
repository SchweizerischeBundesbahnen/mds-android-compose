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

object SBBSwitchItem {
    @Composable
    fun Boxed(
        modifier: Modifier = Modifier,
        interactionSource: MutableInteractionSource? = remember { MutableInteractionSource() },
        title: String,
        subtitle: String,
        checked: Boolean,
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

    @Composable
    fun Default(
        modifier: Modifier = Modifier,
        interactionSource: MutableInteractionSource? = remember { MutableInteractionSource() },
        title: String,
        subtitle: String,
        checked: Boolean,
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
fun PreviewSBBSwitchItem_Default() {
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
fun PreviewSBBSwitchItem_Links() {
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
