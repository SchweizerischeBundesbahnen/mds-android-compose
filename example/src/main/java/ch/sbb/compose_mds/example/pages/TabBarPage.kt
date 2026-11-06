package ch.sbb.compose_mds.example.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.composables.tabBar.SBBTabBar
import ch.sbb.compose_mds.composables.tabBar.SBBTabBarItemData
import ch.sbb.compose_mds.composables.tabBar.SBBTabBarWarningData
import ch.sbb.compose_mds.composables.tabBar.rememberSBBTabBarController
import ch.sbb.compose_mds.icons.ArchiveBoxSmall
import ch.sbb.compose_mds.icons.ArrowCompassSmall
import ch.sbb.compose_mds.icons.SBBIcons
import ch.sbb.compose_mds.icons.StationSmall
import ch.sbb.compose_mds.icons.TrainSmall
import ch.sbb.compose_mds.theme.SBBTheme

@Composable
fun TabBarPage() {
  val items =
      listOf(
          SBBTabBarItemData(
                icon = SBBIcons.StationSmall,
                label = "Item 1",
            ),
            SBBTabBarItemData(
                icon = SBBIcons.TrainSmall,
                label = "Item 2",
            ),
          SBBTabBarItemData(
                icon = SBBIcons.ArchiveBoxSmall,
                label = "Item 3",
          ),
          SBBTabBarItemData(
                icon = SBBIcons.ArrowCompassSmall,
                label = "Item 4",
          ),
      )
  val controller by rememberSBBTabBarController(items)
  controller.setWarnings(
      listOf(SBBTabBarWarningData(index = 1, semantics = "Warning")),
  )
  Box(
      modifier = Modifier.fillMaxSize(),
      contentAlignment = Alignment.BottomCenter,
  ) {
    SBBTabBar(
        modifier = Modifier.windowInsetsPadding(WindowInsets.navigationBars),
        controller = controller,
    )
  }
}

@PreviewLightDark
@Composable
fun Preview_TabBarPage() {
  SBBTheme(includeSurface = true) {
    TabBarPage()
  }
}
