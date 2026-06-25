package ch.sbb.compose_mds.example.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ch.sbb.compose_mds.composables.chip.SBBChip
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.defaultPadding

@Composable
fun ChipPage() {
    var selected1 by remember { mutableStateOf(false) }
    var selected2 by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier.defaultPadding().fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(SBBSpacing.Medium),
    ) {
        Text("Default", style = MaterialTheme.typography.titleSmall)
        SBBContentBox(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(SBBSpacing.Medium),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            SBBChip(
                label = "Default",
                amount = 9,
                onSelectedChange = { selected1 = !selected1 },
                selected = selected1,
            )
            SBBChip(
                label = "Selected",
                amount = 9,
                onSelectedChange = { selected2 = !selected2 },
                selected = selected2,
            )
        }
        Text("Disabled", style = MaterialTheme.typography.titleSmall)
        SBBContentBox(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(SBBSpacing.Medium),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            SBBChip(
                label = "Default",
                amount = 3,
                selected = selected1,
                enabled = false,
            )
            SBBChip(
                label = "Selected",
                amount = 9,
                selected = selected2,
                enabled = false,
            )
        }
    }
}
