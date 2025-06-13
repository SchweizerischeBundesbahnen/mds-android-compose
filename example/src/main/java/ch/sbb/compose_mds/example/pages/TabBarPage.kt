package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ch.sbb.compose_mds.composables.tabBar.SBBTabBar
import ch.sbb.compose_mds.composables.tabBar.SBBTabBarItemData
import ch.sbb.compose_mds.composables.tabBar.SBBTabBarWarningData
import ch.sbb.compose_mds.composables.tabBar.rememberSBBTabBarController
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.ArchiveBoxSmall
import ch.sbb.compose_mds.sbbicons.small.ArrowCompassSmall
import ch.sbb.compose_mds.sbbicons.small.StationSmall
import ch.sbb.compose_mds.sbbicons.small.TrainSmall

@Composable
fun TabBarPage() {
    val items = listOf(
        SBBTabBarItemData(
            icon = SBBIcons.Small.StationSmall,
            label = "Item 1",
        ),
        SBBTabBarItemData(
            icon = SBBIcons.Small.TrainSmall,
            label = "Item 2",
        ),
        SBBTabBarItemData(
            icon = SBBIcons.Small.ArchiveBoxSmall,
            label = "Item 3",
        ),
        SBBTabBarItemData(
            icon = SBBIcons.Small.ArrowCompassSmall,
            label = "Item 4",
        ),
    )
    val controller by rememberSBBTabBarController(items)
    controller.setWarnings(
        listOf(SBBTabBarWarningData(index = 1, semantics = "Warning"))
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

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview_TabBarPage() {
    SBBTheme {
        Surface {
            TabBarPage()
        }
    }
}
