package ch.sbb.compose_mds.example.pages

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import ch.sbb.compose_mds.composables.listItem.SBBList
import ch.sbb.compose_mds.composables.listItem.SBBListHeader
import ch.sbb.compose_mds.composables.listItem.SBBListItem
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

@Composable
fun MainPage(navController: NavController) {
    Column(
        modifier =
            Modifier
                .padding(horizontal = SBBSpacing.Small)
                .fillMaxSize()
                .verticalScroll(
                    state = rememberScrollState(),
                ),
    ) {
        SBBListHeader(title = "Basics")
        SBBList.Wrap {
            SBBListItem.Link(title = "Icon", onClick = { navController.navigate("icon") })
            SBBListItem.Link(
                title = "Typography",
                onClick = { navController.navigate("typography") },
            )
            SBBListItem.Link(
                title = "Color",
                onClick = { navController.navigate("color") },
            )
        }
        SBBListHeader(title = "Components")
        SBBList.Wrap {
            SBBListItem.Link(title = "Button", onClick = { navController.navigate("button") })
            SBBListItem.Link(title = "Checkbox", onClick = { navController.navigate("checkbox") })
            SBBListItem.Link(
                title = "Container",
                onClick = { navController.navigate("container") },
            )
            SBBListItem.Link(title = "Header", onClick = { navController.navigate("header") })
            SBBListItem.Link(
                title = "HeaderBox",
                onClick = { navController.navigate("header-box") },
            )
            SBBListItem.Link(
                title = "LoadingIndicator",
                onClick = { navController.navigate("loading-indicator") },
            )
            SBBListItem.Link(title = "Message", onClick = { navController.navigate("message") })
            SBBListItem.Link(
                title = "Bottom-Sheet",
                onClick = { navController.navigate("bottom-sheet") },
            )
            SBBListItem.Link(
                title = "NotificationBox",
                onClick = { navController.navigate("notification-box") },
            )
            SBBListItem.Link(
                title = "RadioButton",
                onClick = { navController.navigate("radio-button") },
            )
            SBBListItem.Link(
                title = "SegmentedButton",
                onClick = { navController.navigate("segmented-button") },
            )
            SBBListItem.Link(title = "Chip", onClick = { navController.navigate("chip") })
            SBBListItem.Link(title = "Slider", onClick = { navController.navigate("slider") })
            SBBListItem.Link(title = "Status", onClick = { navController.navigate("status") })
            SBBListItem.Link(title = "Switch", onClick = { navController.navigate("switch") })
            SBBListItem.Link(title = "TabBar", onClick = { navController.navigate("tab-bar") })
            SBBListItem.Link(title = "Dropdown", onClick = { navController.navigate("dropdown") })
            SBBListItem.Link(title = "Textarea", onClick = { navController.navigate("textarea") })
            SBBListItem.Link(
                title = "TextField",
                onClick = { navController.navigate("text-field") },
            )
            SBBListItem.Link(
                title = "ListItem",
                onClick = { navController.navigate("list-item") },
            )
            SBBListItem.Link(
                title = "Picker",
                onClick = { navController.navigate("picker") },
            )
            SBBListItem.Link(
                title = "Date Picker",
                onClick = { navController.navigate("date-picker") },
            )
            SBBListItem.Link(
                title = "Date Time Picker",
                onClick = { navController.navigate("date-time-picker") },
            )
            SBBListItem.Link(
                title = "Time Picker",
                onClick = { navController.navigate("time-picker") },
            )
            SBBListItem.Link(
                title = "Time Range Picker",
                onClick = { navController.navigate("time-range-picker") },
            )
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun MainPagePreview() {
    SBBTheme(includeSurface = true) {
        MainPage(navController = rememberNavController())
    }
}
