package ch.sbb.compose_mds.example.pages

import ch.sbb.compose_mds.theme.SBBTheme
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
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.composables.listItem.SBBList
import ch.sbb.compose_mds.composables.listItem.SBBListItem
import ch.sbb.compose_mds.theme.SBBSpacing

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun MainPage(navController: NavController) {
  Column(
      modifier =
          Modifier.padding(horizontal = SBBSpacing.Small)
              .fillMaxSize()
              .verticalScroll(
                  state = rememberScrollState(),
              ),
  ) {
    SBBListHeader(text = "Basics")
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
    SBBListHeader(text = "Components")
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
