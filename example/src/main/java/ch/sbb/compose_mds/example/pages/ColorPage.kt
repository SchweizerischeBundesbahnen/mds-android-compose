package ch.sbb.compose_mds.example.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.composables.listItem.SBBListHeader
import ch.sbb.compose_mds.theme.SBBColors
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

@Composable
fun ColorPage() {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 125.dp),
        verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall),
        horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall),
        contentPadding = PaddingValues(SBBSpacing.XSmall),
    ) {
        item(span = { GridItemSpan(maxLineSpan) }) { SBBListHeader(title = "Colors") }
        item { ColorEntry(name = "red85", color = SBBColors.red85) }
        item { ColorEntry(name = "red", color = SBBColors.red) }
        item { ColorEntry(name = "red125", color = SBBColors.red125) }
        item { ColorEntry(name = "red150", color = SBBColors.red150) }
        item { ColorEntry(name = "white", color = SBBColors.white) }
        item { ColorEntry(name = "milk", color = SBBColors.milk) }
        item { ColorEntry(name = "cloud", color = SBBColors.cloud) }
        item { ColorEntry(name = "silver", color = SBBColors.silver) }
        item { ColorEntry(name = "aluminum", color = SBBColors.aluminum) }
        item { ColorEntry(name = "platinum", color = SBBColors.platinum) }
        item { ColorEntry(name = "cement", color = SBBColors.cement) }
        item { ColorEntry(name = "graphite", color = SBBColors.graphite) }
        item { ColorEntry(name = "storm", color = SBBColors.storm) }
        item { ColorEntry(name = "smoke", color = SBBColors.smoke) }
        item { ColorEntry(name = "metal", color = SBBColors.metal) }
        item { ColorEntry(name = "granite", color = SBBColors.granite) }
        item { ColorEntry(name = "anthracite", color = SBBColors.anthracite) }
        item { ColorEntry(name = "iron", color = SBBColors.iron) }
        item { ColorEntry(name = "charcoal", color = SBBColors.charcoal) }
        item { ColorEntry(name = "midnight", color = SBBColors.midnight) }
        item { ColorEntry(name = "black", color = SBBColors.black) }
        item { ColorEntry(name = "blue", color = SBBColors.blue) }
        item { ColorEntry(name = "transparent", color = SBBColors.transparent) }

        item(span = { GridItemSpan(maxLineSpan) }) { SBBListHeader(title = "Functional colors") }
        item { ColorEntry(name = "sky", color = SBBColors.sky) }
        item { ColorEntry(name = "night", color = SBBColors.night) }
        item { ColorEntry(name = "violet", color = SBBColors.violet) }
        item { ColorEntry(name = "pink", color = SBBColors.pink) }
        item { ColorEntry(name = "autumn", color = SBBColors.autumn) }
        item { ColorEntry(name = "orange", color = SBBColors.orange) }
        item { ColorEntry(name = "peach", color = SBBColors.peach) }
        item { ColorEntry(name = "lemon", color = SBBColors.lemon) }
        item { ColorEntry(name = "brown", color = SBBColors.brown) }
        item { ColorEntry(name = "green", color = SBBColors.green) }
        item { ColorEntry(name = "turquoise", color = SBBColors.turquoise) }

        item(span = { GridItemSpan(maxLineSpan) }) { SBBListHeader(title = "Off brand colors") }
        item { ColorEntry(name = "royal85", color = SBBColors.royal85) }
        item { ColorEntry(name = "royal", color = SBBColors.royal) }
        item { ColorEntry(name = "royal125", color = SBBColors.royal125) }
        item { ColorEntry(name = "royal150", color = SBBColors.royal150) }
    }
}

@Composable
private fun ColorEntry(
    name: String,
    color: Color,
) {
    SBBContentBox(
        modifier = Modifier.size(100.dp),
        contentPadding = PaddingValues(0.dp),
    ) {
        val textPadding = PaddingValues(
            start = SBBSpacing.XSmall,
            end = SBBSpacing.XSmall,
            bottom = SBBSpacing.XSmall,
        )
        Box(
            modifier = Modifier
                .weight(1.0f)
                .fillMaxSize()
                .background(color),
        )
        Text(
            modifier = Modifier.padding(textPadding),
            text = name,
            style = MaterialTheme.typography.bodyMedium,
        )
        Text(
            modifier = Modifier.padding(textPadding),
            text = "#${color.toArgb().toHexString(format = HexFormat.UpperCase)}",
            style = MaterialTheme.typography.bodySmall,
        )
    }
}

@PreviewLightDark
@Composable
private fun Preview_ColorPage() {
    SBBTheme(includeSurface = true) {
        ColorPage()
    }
}
