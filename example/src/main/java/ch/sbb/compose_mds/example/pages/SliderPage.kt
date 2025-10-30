package ch.sbb.compose_mds.example.pages

import SBBTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SliderState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.beta.slider.SBBSlider
import ch.sbb.compose_mds.theme.defaultPadding
import ch.sbb.compose_mds.theme.elementPadding

@OptIn(ExperimentalMaterial3Api::class, ExperimentalSBBComponent::class)
@Composable
fun SliderPage() {
    Column(
        modifier = Modifier
            .defaultPadding()
            .fillMaxWidth()
            .verticalScroll(
                state = rememberScrollState(),
            ),
    ) {
        val sliderState = SliderState(value = .25f)
        SBBListHeader(text = "Default")
        SBBSlider(modifier = Modifier.elementPadding(), state = sliderState)
        SBBListHeader(text = "Disabled")
        SBBSlider(modifier = Modifier.elementPadding(), state = sliderState, enabled = false)
    }
}

@PreviewLightDark
@Composable
fun Preview_SliderPage() {
    SBBTheme(includeSurface = true) {
        SliderPage()
    }
}