package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.theme.PrimitiveColors
import ch.sbb.compose_mds.theme.SBBConst
import ch.sbb.compose_mds.theme.SBBSpacing

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun ColorPage() {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 125.dp),
        verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall),
        horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall),
        contentPadding = PaddingValues(SBBSpacing.XSmall),
    ) {
        item(span = { GridItemSpan(maxLineSpan) }) { SBBListHeader(text = "Colors") }
        item { ColorEntry(name = "red", color = PrimitiveColors.red) }
        item { ColorEntry(name = "red125", color = PrimitiveColors.red125) }
        item { ColorEntry(name = "red150", color = PrimitiveColors.red150) }
        item { ColorEntry(name = "redDarkMode", color = PrimitiveColors.redDarkMode) }
        item { ColorEntry(name = "white", color = PrimitiveColors.white) }
        item { ColorEntry(name = "milk", color = PrimitiveColors.milk) }
        item { ColorEntry(name = "cloud", color = PrimitiveColors.cloud) }
        item { ColorEntry(name = "silver", color = PrimitiveColors.silver) }
        item { ColorEntry(name = "aluminum", color = PrimitiveColors.aluminum) }
        item { ColorEntry(name = "platinum", color = PrimitiveColors.platinum) }
        item { ColorEntry(name = "cement", color = PrimitiveColors.cement) }
        item { ColorEntry(name = "graphite", color = PrimitiveColors.graphite) }
        item { ColorEntry(name = "storm", color = PrimitiveColors.storm) }
        item { ColorEntry(name = "smoke", color = PrimitiveColors.smoke) }
        item { ColorEntry(name = "metal", color = PrimitiveColors.metal) }
        item { ColorEntry(name = "granite", color = PrimitiveColors.granite) }
        item { ColorEntry(name = "anthracite", color = PrimitiveColors.anthracite) }
        item { ColorEntry(name = "iron", color = PrimitiveColors.iron) }
        item { ColorEntry(name = "charcoal", color = PrimitiveColors.charcoal) }
        item { ColorEntry(name = "midnight", color = PrimitiveColors.midnight) }
        item { ColorEntry(name = "black", color = PrimitiveColors.black) }
        item { ColorEntry(name = "blue", color = PrimitiveColors.blue) }
        item { ColorEntry(name = "transparent", color = PrimitiveColors.transparent) }

        item(span = { GridItemSpan(maxLineSpan) }) { SBBListHeader(text = "Functional colors") }
        item { ColorEntry(name = "sky", color = PrimitiveColors.sky) }
        item { ColorEntry(name = "night", color = PrimitiveColors.night) }
        item { ColorEntry(name = "violet", color = PrimitiveColors.violet) }
        item { ColorEntry(name = "pink", color = PrimitiveColors.pink) }
        item { ColorEntry(name = "autumn", color = PrimitiveColors.autumn) }
        item { ColorEntry(name = "orange", color = PrimitiveColors.orange) }
        item { ColorEntry(name = "peach", color = PrimitiveColors.peach) }
        item { ColorEntry(name = "lemon", color = PrimitiveColors.lemon) }
        item { ColorEntry(name = "brown", color = PrimitiveColors.brown) }
        item { ColorEntry(name = "green", color = PrimitiveColors.green) }
        item { ColorEntry(name = "turquoise", color = PrimitiveColors.turquoise) }

        item(span = { GridItemSpan(maxLineSpan) }) { SBBListHeader(text = "Off brand colors") }
        item { ColorEntry(name = "royal", color = PrimitiveColors.royal) }
        item { ColorEntry(name = "royal125", color = PrimitiveColors.royal125) }
        item { ColorEntry(name = "royal150", color = PrimitiveColors.royal150) }
    }
}

@OptIn(ExperimentalStdlibApi::class, ExperimentalSBBComponent::class)
@Composable
private fun ColorEntry(
    name: String,
    color: Color,
) {
    SBBContentBox(
        modifier =
            Modifier.size(100.dp),
        contentPadding = PaddingValues(0.dp),
    ) {
        Box(
            modifier =
                Modifier
                    .weight(1.0f)
                    .fillMaxSize()
                    .background(color),
        )
        Text(
            modifier =
                Modifier.padding(
                    start = SBBConst.DEFAULT_HORIZONTAL_PADDING,
                    top = SBBSpacing.XSmall,
                    end = SBBConst.DEFAULT_HORIZONTAL_PADDING,
                ),
            text = name,
            style = MaterialTheme.typography.bodyMedium,
        )
        Text(
            modifier =
                Modifier.padding(
                    start = SBBConst.DEFAULT_HORIZONTAL_PADDING,
                    end = SBBConst.DEFAULT_HORIZONTAL_PADDING,
                    bottom = SBBSpacing.XSmall,
                ),
            text = "#${color.toArgb().toHexString(format = HexFormat.UpperCase)}",
            style = MaterialTheme.typography.bodySmall,
        )
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview_ColorPage() {
    SBBTheme(includeSurface = true) {
        ColorPage()
    }
}
