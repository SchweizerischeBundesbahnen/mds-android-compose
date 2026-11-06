package ch.sbb.compose_mds.example.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.composables.listItem.SBBListHeader
import ch.sbb.compose_mds.icons.SBBIcons
import ch.sbb.compose_mds.icons.all
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

@Composable
fun IconPage() {
    Column(
        modifier = Modifier
            .padding(SBBSpacing.XSmall)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
    ) {
        SBBListHeader(title = "Small Icons")
        SBBContentBox {
            LazyVerticalGrid(
                modifier = Modifier.heightIn(max = 500.dp),
                columns = GridCells.Adaptive(24.dp),
                verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall),
                horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall),
                contentPadding = PaddingValues(SBBSpacing.XSmall),
            ) {
                items(SBBIcons.all.filter { it.name.endsWith("Small") }) {
                    Icon(
                        imageVector = it,
                        contentDescription = null,
                    )
                }
            }
        }
        SBBListHeader(title = "Medium Icons")
        SBBContentBox {
            LazyVerticalGrid(
                modifier = Modifier.heightIn(max = 500.dp),
                columns = GridCells.Adaptive(36.dp),
                verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall),
                horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall),
                contentPadding = PaddingValues(SBBSpacing.XSmall),
            ) {
                items(SBBIcons.all.filter { it.name.endsWith("Medium") }) {
                    Icon(
                        imageVector = it,
                        contentDescription = null,
                    )
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
fun Preview_IconPage() {
    SBBTheme(includeSurface = true) {
        IconPage()
    }
}
