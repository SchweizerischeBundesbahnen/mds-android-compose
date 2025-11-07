package ch.sbb.compose_mds.example.pages

import SBBTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.composables.switch.SBBSwitch
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.defaultPadding

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun SwitchPage() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(
                state = rememberScrollState(),
            )
            .defaultPadding(),
        verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)
    ) {
        var checkedState: Boolean by remember { mutableStateOf(true) }

        SBBListHeader(text = "Default")
        SBBSwitch(
            checked = checkedState,
            onCheckedChange = { checked -> checkedState = checked }
        )

        SBBListHeader(text = "Disabled")
        SBBSwitch(checked = true, enabled = false, onCheckedChange = { })
        SBBSwitch(checked = false, enabled = false, onCheckedChange = { })
    }
}

@PreviewLightDark
@Composable
fun Preview_SwitchPage() {
    SBBTheme(includeSurface = true) {
        SwitchPage()
    }
}
