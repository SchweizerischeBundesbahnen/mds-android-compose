package ch.sbb.compose_mds.example.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SliderState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.slider.SBBSlider
import ch.sbb.compose_mds.composables.listItem.SBBListHeader
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

@OptIn(ExperimentalMaterial3Api::class, ExperimentalSBBComponent::class)
@Composable
fun SliderPage() {
    Column(
        modifier =
            Modifier
                .padding(SBBSpacing.XSmall)
                .fillMaxWidth()
                .verticalScroll(
                    state = rememberScrollState(),
                ),
    ) {
        val sliderState = SliderState(value = .25f)
        SBBListHeader(title = "Default")
        SBBSlider(state = sliderState)
        SBBListHeader(title = "Disabled")
        SBBSlider(state = sliderState, enabled = false)
    }
}

@PreviewLightDark
@Composable
fun Preview_SliderPage() {
    SBBTheme(includeSurface = true) {
        SliderPage()
    }
}
