package ch.sbb.compose_mds.example.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.composables.listItem.SBBListHeader
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

@Composable
fun ContainerPage() {
    Column(
        modifier = Modifier.padding(SBBSpacing.Medium),
    ) {
        SBBListHeader(title = "Content-Box")
        SBBContentBox {
            Text("Preview")
        }
    }
}

@PreviewLightDark
@Composable
fun Preview_ContainerPage() {
    SBBTheme(includeSurface = true) {
        ContainerPage()
    }
}
