package ch.sbb.compose_mds.example.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.switch.SBBSwitch
import ch.sbb.compose_mds.composables.container.SBBContentBox

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun SwitchPage() {
    SBBContentBox {

        Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            var checkedState: Boolean by remember { mutableStateOf(true) }
            SBBSwitch(
                checked = checkedState,
                onCheckedChange = { checked -> checkedState = checked })

            SBBSwitch(checked = true, enabled = false, onCheckedChange = { })
            SBBSwitch(checked = false, enabled = false, onCheckedChange = { })
        }
    }
}
