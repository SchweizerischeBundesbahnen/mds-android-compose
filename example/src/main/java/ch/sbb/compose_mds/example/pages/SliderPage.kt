package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SliderState
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.container.SBBGroup
import ch.sbb.compose_mds.beta.slider.SBBSlider
import ch.sbb.compose_mds.theme.defaultPadding
import ch.sbb.compose_mds.theme.elementPadding

@OptIn(ExperimentalMaterial3Api::class, ExperimentalSBBComponent::class)
@Composable
fun SliderPage() {
    SBBGroup(
        modifier = Modifier.defaultPadding()
    ) {
        val sliderState = SliderState(value = .25f)
        SBBSlider(modifier = Modifier.elementPadding(), state = sliderState)
        SBBSlider(modifier = Modifier.elementPadding(), state = sliderState, enabled = false)
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview_SliderPage() {
    SBBTheme {
        Surface {
            SliderPage()
        }
    }
}