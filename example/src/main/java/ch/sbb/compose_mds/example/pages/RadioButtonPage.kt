package ch.sbb.compose_mds.example.pages

import SBBTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.composables.radio.SBBRadioButton
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.TrainSmall
import ch.sbb.compose_mds.theme.defaultPadding

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun RadioButtonPage() {
    var selectedValue: Int by remember { mutableIntStateOf(0) }
    Column(
        modifier = Modifier
            .verticalScroll(
                state = rememberScrollState(),
            )
            .defaultPadding(),
    ) {
        SBBListHeader(text = "RadioButton")
        SBBRadioButton(
            label = "Label",
            selected = selectedValue == 0,
            onClick = { selectedValue = 0 },
        )

        SBBListHeader(text = "RadioButton with Icon")
        SBBRadioButton(
            label = "Label",
            selected = selectedValue == 1,
            icon = SBBIcons.Small.TrainSmall,
            onClick = { selectedValue = 1 },
        )

        SBBListHeader(text = "Disabled RadioButton")
        SBBRadioButton(
            label = "Label",
            selected = true,
            icon = SBBIcons.Small.TrainSmall,
            enabled = false,
            onClick = {  },
        )
    }
}

@PreviewLightDark
@Composable
fun Preview_RadioButtonPage() {
    SBBTheme(includeSurface = true) {
        RadioButtonPage()
    }
}