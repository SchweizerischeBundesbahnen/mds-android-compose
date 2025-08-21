package ch.sbb.compose_mds.example.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.composables.container.SBBContentBox

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun ContainerPage() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        SBBListHeader(text = "Content-Box")
        SBBContentBox {
            Text("Preview")
        }
    }
}
