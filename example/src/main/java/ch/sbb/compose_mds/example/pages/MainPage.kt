package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.beta.list.SBBListItem
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.ChevronSmallRightSmall
import ch.sbb.compose_mds.theme.defaultPadding

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun MainPage(navController: NavController) {
    Column(
        modifier = Modifier
            .defaultPadding()
            .fillMaxSize()
            .verticalScroll(
                state = rememberScrollState(),
            )
    ) {
        SBBListHeader(text = "Basics")
        SBBContentBox(contentPadding = PaddingValues(0.dp)) {
            ComponentListItem(title = "Icon", onClick = { navController.navigate("icon") })
            ComponentListItem(
                title = "Typography",
                onClick = { navController.navigate("typography") },
            )
            ComponentListItem(
                title = "Color",
                onClick = { navController.navigate("color") },
                isLastElement = true,
            )
        }
        SBBListHeader(text = "Components")
        SBBContentBox(contentPadding = PaddingValues(0.dp)) {
            ComponentListItem(title = "Button", onClick = { navController.navigate("button") })
            ComponentListItem(title = "Checkbox", onClick = { navController.navigate("checkbox") })
            ComponentListItem(
                title = "Container",
                onClick = { navController.navigate("container") })
            ComponentListItem(title = "Header", onClick = { navController.navigate("header") })
            ComponentListItem(
                title = "LoadingIndicator",
                onClick = { navController.navigate("loading-indicator") })
            ComponentListItem(
                title = "Modal View",
                onClick = { navController.navigate("modal-view") })
            ComponentListItem(
                title = "NotificationBox",
                onClick = { navController.navigate("notification-box") })
            ComponentListItem(
                title = "SegmentedButton",
                onClick = { navController.navigate("segmented-button") })
            ComponentListItem(title = "Slider", onClick = { navController.navigate("slider") })
            ComponentListItem(title = "Status", onClick = { navController.navigate("status") })
            ComponentListItem(title = "Switch", onClick = { navController.navigate("switch") })
            ComponentListItem(title = "TabBar", onClick = { navController.navigate("tab-bar") })
            ComponentListItem(
                title = "TextField",
                onClick = { navController.navigate("text-field") },
                isLastElement = true,
            )
        }
    }
}

@OptIn(ExperimentalSBBComponent::class)
@Composable
private fun ComponentListItem(
    title: String,
    onClick: (() -> Unit)? = null,
    isLastElement: Boolean = false,
) {
    SBBListItem(
        title = title,
        trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
        onClick = onClick,
        isLastElement = isLastElement
    )
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun MainPagePreview() {
    SBBTheme(includeSurface = true) {
        MainPage(navController = rememberNavController())
    }
}
