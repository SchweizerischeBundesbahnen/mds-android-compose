package ch.sbb.compose_mds.example.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.composables.picker.SBBPickerWheel
import ch.sbb.compose_mds.composables.picker.SBBPickerWheelContainer
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

data class City(
    val name: String,
)

@Composable
fun PickerPage() {
    val bern = City("Bern")
    val stGallen = City("St. Gallen")
    val cities =
        remember {
            listOf(
                City("Zürich"),
                bern,
                City("Basel"),
                City("Genève"),
                City("Lausanne"),
                City("Luzern"),
                stGallen,
                City("Lugano"),
            )
        }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        var selection1 by remember { mutableStateOf(bern) }
        var selection2 by remember { mutableStateOf(stGallen) }

        Column(
            modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
            verticalArrangement =
                Arrangement.spacedBy(
                    SBBSpacing.Large,
                    alignment = Alignment.CenterVertically,
                ),
        ) {
            Text("Selected 1: ${selection1.name}, Selected 2: ${selection2.name}")
            SBBPickerWheelContainer(boxed = false) {
                SBBPickerWheel(
                    items = cities,
                    currentItem = selection1,
                    infinite = false,
                    textSelector = { it.name },
                    onSelectionChange = { selection1 = it },
                )
            }
            SBBContentBox(contentPadding = PaddingValues.Zero) {
                SBBPickerWheelContainer(boxed = true) {
                    SBBPickerWheel(
                        items = cities,
                        currentItem = selection2,
                        infinite = false,
                        textSelector = { it.name },
                        onSelectionChange = { selection2 = it },
                    )
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
fun Preview_PickerPage() {
    SBBTheme(includeSurface = true) {
        PickerPage()
    }
}
