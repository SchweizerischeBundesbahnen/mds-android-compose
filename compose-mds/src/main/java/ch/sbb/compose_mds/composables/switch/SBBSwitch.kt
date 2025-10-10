package ch.sbb.compose_mds.composables.switch

import SBBTheme
import android.content.res.Configuration
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateIntOffsetAsState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.TickSmall
import ch.sbb.compose_mds.theme.PrimitiveColors
import ch.sbb.compose_mds.theme.SBBSpacing


private val knobSize = 28.dp
private val trackWidth = 52.dp

/***
 * Implementation of the SBB Switch.
 *
 * @param checked whether or not this switch is checked
 * @param enabled controls the enabled state of this switch
 * @param onCheckedChange called when this switch is clicked. If null, then this switch will not be interactable, unless something else handles its input events and updates its state.
 * @param interactionSource an optional hoisted MutableInteractionSource for observing and emitting Interactions for this switch.
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/switch/)
 */
@Composable
fun SBBSwitch(
    modifier: Modifier = Modifier,
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val colors = if (SBBTheme.isDarkMode) lightSwitchColors() else darkSwitchColors()
    Box(
        modifier = modifier
            .alpha(if (enabled) 1f else 0.5f)
            .size(DpSize(trackWidth + 1.dp, knobSize + 2.dp))
            .padding(end = 1.dp)
            .toggleable(
                enabled = enabled,
                value = checked,
                interactionSource = interactionSource,
                role = Role.Switch,
                onValueChange = { onCheckedChange?.invoke(it) },
                indication = null
            ),
        contentAlignment = Alignment.CenterStart,
    ) {
        SwitchTrack(checked, colors)
        SwitchKnob(checked, enabled, colors)
    }
}

@Composable
private fun SwitchKnob(
    checked: Boolean,
    enabled: Boolean = true,
    colors: SBBSwitchColors,
) {
    val shadow = if (enabled) 4.dp else 0.dp
    val borderColor by animateColorAsState(
        targetValue = if (checked) colors.checkedKnobBorderColor else colors.knobBorderColor
    )
    val knobOffset by animateIntOffsetAsState(
        targetValue = IntOffset(
            x = with(LocalDensity.current) {
                when (checked) {
                    true -> 52.dp - knobSize
                    false -> 0.dp
                }.roundToPx()
            },
            y = 0,
        ),
    )
    Box(
        modifier = Modifier
            .offset { knobOffset }
            .size(knobSize)
            .shadow(elevation = shadow, shape = CircleShape)
            .background(colors.knobBackgroundColor, shape = CircleShape)
            .border(border = BorderStroke(width = 1.dp, color = borderColor), shape = CircleShape),
        contentAlignment = Alignment.Center,
    ) {
        AnimatedVisibility(
            visible = checked,
            enter = fadeIn(),
            exit = fadeOut(),
        ) {
            Icon(
                imageVector = SBBIcons.Small.TickSmall,
                tint = colors.iconColor,
                contentDescription = null
            )
        }
    }
}

@Composable
private fun SwitchTrack(
    checked: Boolean,
    colors: SBBSwitchColors,
) {
    val backgroundColor by animateColorAsState(
        targetValue = if (checked) colors.checkedBackgroundColor else colors.backgroundColor
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(20.dp)
            .background(color = backgroundColor, shape = CircleShape),
    )
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun SBBSwitchPreview() {
    val darkTheme = isSystemInDarkTheme()
    val firstChecked = remember { mutableStateOf(false) }
    val secondChecked = remember { mutableStateOf(true) }
    SBBTheme {
        Column(
            modifier = Modifier
                .background(if (darkTheme) PrimitiveColors.black else PrimitiveColors.white)
                .padding(SBBSpacing.Medium),
            verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall),
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall),
            ) {
                SBBSwitch(
                    checked = firstChecked.value,
                    onCheckedChange = { firstChecked.value = it },
                )
                SBBSwitch(
                    checked = secondChecked.value,
                    onCheckedChange = { secondChecked.value = it },
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall),
            ) {
                SBBSwitch(
                    checked = firstChecked.value,
                    onCheckedChange = { firstChecked.value = it },
                    enabled = false,
                )
                SBBSwitch(
                    checked = secondChecked.value,
                    onCheckedChange = { secondChecked.value = it },
                    enabled = false,
                )
            }
        }
    }
}
