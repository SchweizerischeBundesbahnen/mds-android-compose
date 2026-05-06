package ch.sbb.compose_mds.example.pages

import SBBTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.composables.listItem.SBBListItem
import ch.sbb.compose_mds.composables.listItem.SBBListItemState
import ch.sbb.compose_mds.composables.listItem.SBBListItemVariant
import ch.sbb.compose_mds.sbbicons.Medium
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.medium.ChevronSmallRightMedium
import ch.sbb.compose_mds.sbbicons.medium.UnicornMedium
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.defaultPadding

/**
 * Example page demonstrating the different usages of the SBB list item component.
 *
 * This page is intentionally small and only used in the `example` module for
 * documentation and previewing of the component in light/dark themes.
 *
 * The goal here is to show common variants: simple title, title + subtitle,
 * with a leading icon and a disabled state. Previews are wrapped in `SBBTheme`
 * so screenshots/golden files match the library visuals.
 */
@OptIn(ExperimentalSBBComponent::class)
@Composable
fun ListItemPage() {
    Column(modifier = Modifier.defaultPadding()) {
        SBBListHeader(text = "List items")

        SBBContentBox(
            contentPadding = PaddingValues.Zero,
        ) {
            // Title only
            SBBListItem(
                text = "Title only",
                onClick = { /* no-op for example */ },
            )

            // Title + subtitle
            SBBListItem(
                text = "Title with subtitle",
                subtext = "This is a short description",
                onClick = { /* no-op for example */ },
            )

            // With leading icon and trailing chevron
            SBBListItem(
                leading = SBBIcons.Medium.UnicornMedium,
                text = "With leading icon",
                subtext = "Has trailing affordance",
                onClick = { /* no-op for example */ },
                trailing = SBBIcons.Medium.ChevronSmallRightMedium,
            )

            // Disabled list item
            SBBListItem(
                state = SBBListItemState.Disabled,
                text = "Disabled item",
                subtext = "Not interactive",
                isLastElement = true,
            )
        }

        SBBListHeader(text = "Boxed list items")

        // Title only
        SBBListItem(
            variant = SBBListItemVariant.Boxed,
            text = "Title only",
            onClick = { /* no-op for example */ },
        )

        Spacer(modifier = Modifier.height(SBBSpacing.Small))

        // Title + subtitle
        SBBListItem(
            variant = SBBListItemVariant.Boxed,
            text = "Title with subtitle",
            subtext = "This is a short description",
            onClick = { /* no-op for example */ },
        )

        Spacer(modifier = Modifier.height(SBBSpacing.Small))

        // With leading icon and trailing chevron
        SBBListItem(
            variant = SBBListItemVariant.Boxed,
            leading = SBBIcons.Medium.UnicornMedium,
            text = "With leading icon",
            subtext = "Has trailing affordance",
            onClick = { /* no-op for example */ },
            trailing = SBBIcons.Medium.ChevronSmallRightMedium,
        )

        Spacer(modifier = Modifier.height(SBBSpacing.Small))

        // Disabled list item
        SBBListItem(
            variant = SBBListItemVariant.Boxed,
            state = SBBListItemState.Disabled,
            text = "Disabled item",
            subtext = "Not interactive",
        )
    }
}

// Previews are private to hide from golden files as it generates empty images
@PreviewLightDark
@Composable
private fun Preview_ListItemPage() {
    SBBTheme(includeSurface = true) {
        ListItemPage()
    }
}
