package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.container.SBBGroup
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.beta.list.SBBListItem
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.ChevronSmallRightSmall
import ch.sbb.compose_mds.theme.defaultPadding

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun MainPage(navController: NavController) {

    Column(
        modifier = Modifier
            .defaultPadding
            .fillMaxSize()
            .verticalScroll(
                state = rememberScrollState(),
            )
    ) {
        SBBListHeader(text = "Basics")
        SBBGroup {
            SBBListItem(
                title = "Icon",
                trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
                onClick = { navController.navigate("icon") },
            )
            SBBListItem(
                title = "Typography",
                trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
                onClick = { navController.navigate("typography") },
            )
            SBBListItem(
                title = "Color",
                trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
                onClick = { navController.navigate("color") },
                isLastElement = true,
            )
        }
        SBBListHeader(text = "Components")
        SBBGroup {
            SBBListItem(
                title = "Modal View",
                trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
                onClick = { navController.navigate("modal-view") },
            )
            SBBListItem(
                title = "Checkbox",
                trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
                onClick = { navController.navigate("checkbox") },
            )
            SBBListItem(
                title = "Button",
                trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
                onClick = { navController.navigate("button") },
            )
            SBBListItem(
                title = "SegmentedButton",
                trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
                onClick = { navController.navigate("segmented-button") },
            )
            SBBListItem(
                title = "LoadingIndicator",
                trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
                onClick = { navController.navigate("loading-indicator") },
            )
            SBBListItem(
                title = "Switch",
                trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
                onClick = { navController.navigate("switch") },
            )
            SBBListItem(
                title = "Header",
                trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
                onClick = { navController.navigate("header") },
            )
            SBBListItem(
                title = "TextField",
                trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
                onClick = { navController.navigate("text-field") },
            )
            SBBListItem(
                title = "Status",
                trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
                onClick = { navController.navigate("status") },
            )
            SBBListItem(
                title = "Slider",
                trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
                onClick = { navController.navigate("slider") },
            )
            SBBListItem(
                title = "NotificationBox",
                trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
                onClick = { navController.navigate("notification-box") },
            )
            SBBListItem(
                title = "TabBar",
                trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
                onClick = { navController.navigate("tab-bar") },
                isLastElement = true,
            )
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun MainPagePreview() {
    SBBTheme {
        Surface {
            MainPage(navController = rememberNavController())
        }
    }
}
