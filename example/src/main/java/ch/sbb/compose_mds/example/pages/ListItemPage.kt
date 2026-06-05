package ch.sbb.compose_mds.example.pages

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.composables.listItem.SBBList
import ch.sbb.compose_mds.composables.listItem.SBBListItem
import ch.sbb.compose_mds.composables.radio.SBBRadioButtonItem
import ch.sbb.compose_mds.composables.switch.SBBSwitchItem
import ch.sbb.compose_mds.sbbicons.Medium
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.medium.ChevronSmallRightMedium
import ch.sbb.compose_mds.sbbicons.medium.UnicornMedium
import ch.sbb.compose_mds.sbbicons.small.FaceGrinningSmall
import ch.sbb.compose_mds.theme.SBBConst
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

/**
 * Example page demonstrating the different usages of the SBB list item component.
 *
 * This page is intentionally small and only used in the `example` module for documentation and
 * previewing of the component in light/dark themes.
 *
 * The goal here is to show common variants: simple title, title + subtitle, with a leading icon and
 * a disabled state. Previews are wrapped in `SBBTheme` so screenshots/golden files match the
 * library visuals.
 */
@OptIn(ExperimentalSBBComponent::class)
@Composable
fun ListItemPage() {
    val scrollState = rememberScrollState()
    Column(
        modifier =
            Modifier
                .verticalScroll(scrollState)
                .padding(horizontal = SBBConst.DEFAULT_HORIZONTAL_PADDING),
    ) {
        SBBListHeader(text = "List items")

        SBBList.Wrap {
            // Title only
            SBBListItem.Default(
                title = "Title only",
            )

            // Title + subtitle
            SBBListItem.Default(
                title = "Title with subtitle",
                subtitle = "This is a short description",
            )

            // With leading icon and trailing chevron
            SBBListItem.Default(
                leading = SBBIcons.Medium.UnicornMedium,
                title = "With leading icon",
                subtitle = "Has trailing affordance",
                trailing = SBBIcons.Medium.ChevronSmallRightMedium,
                onClick = {},
            )

            // Disabled list item
            SBBListItem.Disabled(
                title = "Disabled item",
                subtitle = "Not interactive",
            )

            var checked by remember { mutableStateOf(false) }
            SBBSwitchItem.Default(
                title = "Switch",
                subtitle = "Press to show link",
                checked = checked,
                onCheckedChange = { checked = it },
                links = {
                    AnimatedVisibility(checked) {
                        Links()
                    }
                },
            )

            SBBRadioButtonItem.Default(
                title = "RadioButton",
                checked = true,
                enabled = true,
                onCheckedChange = {},
            )
        }

        SBBListHeader(text = "Boxed list items")

        Column(verticalArrangement = Arrangement.spacedBy(SBBSpacing.Small)) {
            // Title only
            SBBListItem.Boxed.Default(
                title = "Title only",
            )

            // Title + subtitle
            SBBListItem.Boxed.Default(
                title = "Title with subtitle",
                subtitle = "This is a short description",
            )

            // With leading icon and trailing chevron
            SBBListItem.Boxed.Default(
                leading = SBBIcons.Medium.UnicornMedium,
                title = "With leading icon",
                subtitle = "Has trailing affordance",
                trailing = SBBIcons.Medium.ChevronSmallRightMedium,
                onClick = {},
            )

            // Disabled list item
            SBBListItem.Boxed.Disabled(
                title = "Disabled item",
                subtitle = "Not interactive",
            )

            var checked2 by remember { mutableStateOf(false) }
            SBBSwitchItem.Boxed(
                title = "Switch",
                subtitle = "Press to show link",
                checked = checked2,
                onCheckedChange = { checked2 = it },
                links = {
                    AnimatedVisibility(checked2) {
                        Links()
                    }
                },
            )

            SBBRadioButtonItem.Boxed(title = "RadioButton", checked = true, onCheckedChange = {})
        }
    }
}

@Composable
private fun Links() {
    SBBList.DividedColumn(
        divider = {
            HorizontalDivider(modifier = Modifier.padding(start = SBBSpacing.Medium))
        },
    ) {
        SBBListItem.Link(title = "Link 1", onClick = {})
        SBBListItem.Link(
            title = "Link 2",
            subtitle = "with subtitle",
            onClick = {},
        )
        SBBListItem.Link(
            title = "Link 3",
            subtitle = "with icon",
            leading = SBBIcons.Small.FaceGrinningSmall,
            onClick = {},
        )
    }
}

// Previews are private to hide from golden files as it generates empty images
@PreviewLightDark
@Composable
fun Preview_ListItemPage() {
    SBBTheme(includeSurface = true) {
        ListItemPage()
    }
}
