package ch.sbb.compose_mds.beta.slider

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.border
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderColors
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.SliderDefaults.Thumb
import androidx.compose.material3.SliderState
import androidx.compose.material3.Surface
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.MinusSmall
import ch.sbb.compose_mds.sbbicons.small.PlusSmall
import ch.sbb.compose_mds.theme.PrimitiveColors

@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalSBBComponent
@Composable
fun SBBSlider(
    state: SliderState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: SliderColors = SBBSliderDefaults.colors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    leadingIcon: ImageVector = SBBIcons.Small.MinusSmall,
    trailingIcon: ImageVector = SBBIcons.Small.PlusSmall,
) {
    Row(
        modifier = modifier.alpha(if (enabled) 1f else .5f),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(imageVector = leadingIcon, contentDescription = null)
        Slider(state = state,
            colors = colors,
            interactionSource = interactionSource,
            enabled = enabled,
            modifier = Modifier.weight(1f),
            thumb = {
                Thumb(
                    interactionSource,
                    enabled = enabled,
                    colors = colors,
                    modifier = Modifier
                        .size(28.dp)
                        .border(
                            width = 2.dp,
                            color = if (enabled) colors.activeTrackColor else colors.disabledActiveTrackColor,
                            shape = CircleShape,
                        )
                        .indication(
                            interactionSource = interactionSource,
                            indication = ripple(bounded = false, 18.dp, color = PrimitiveColors.smoke),
                        ),
                )
            },
            track = { sliderState ->
                SliderDefaults.Track(
                    modifier = Modifier.height(4.dp),
                    sliderState = sliderState,
                    drawStopIndicator = null,
                    thumbTrackGapSize = 0.dp,
                    colors = colors
                )
            })
        Icon(imageVector = trailingIcon, contentDescription = null)
    }
}

object SBBSliderDefaults {
    @Composable
    fun colors(): SliderColors {
        val trackColor = MaterialTheme.colorScheme.primary
        val inactiveTrackColor = if (SBBTheme.isDarkMode) PrimitiveColors.metal else PrimitiveColors.smoke
        val thumbColor = if (SBBTheme.isDarkMode) PrimitiveColors.iron else PrimitiveColors.white
        return SliderDefaults.colors(
            activeTrackColor = trackColor,
            disabledActiveTrackColor = trackColor,
            inactiveTrackColor = inactiveTrackColor,
            disabledInactiveTrackColor = inactiveTrackColor,
            thumbColor = thumbColor,
            disabledThumbColor = thumbColor,
            inactiveTickColor = thumbColor,
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalSBBComponent::class)
@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun SBBListItemPreview() {
    SBBTheme {
        Surface {
            val state = SliderState(.5f)
            Column {
                SBBSlider(state = state)
                SBBSlider(state = state, enabled = false)
            }
        }
    }
}
