package ch.sbb.compose_mds.beta.switch

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
import androidx.compose.material3.MaterialTheme
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
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.TickSmall
import ch.sbb.compose_mds.theme.PrimitiveColors
import ch.sbb.compose_mds.theme.SBBSpacing

@ExperimentalSBBComponent
@Composable
fun SBBSwitch(
    modifier: Modifier = Modifier,
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val color by animateColorAsState(
        targetValue = when (checked) {
            true -> MaterialTheme.colorScheme.primary
            false -> PrimitiveColors.graphite
        }
    )
    val knobSize = 26.dp
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
    val alpha = when (enabled) {
        true -> 1f
        false -> 0.5f
    }
    val shadow = when (enabled) {
        true -> 4.dp
        false -> 0.dp
    }
    Box(
        modifier = modifier
            .alpha(alpha)
            .size(DpSize(53.dp, knobSize + 2.dp))
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
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
                .background(color = color, shape = CircleShape),
        )
        Box(
            modifier = Modifier
                .offset { knobOffset }
                .size(knobSize)
                .shadow(elevation = shadow, shape = CircleShape)
                .background(PrimitiveColors.white, shape = CircleShape)
                .border(border = BorderStroke(width = 1.dp, color = color), shape = CircleShape),
            contentAlignment = Alignment.Center,
        ) {
            AnimatedVisibility(
                visible = checked,
                enter = fadeIn(),
                exit = fadeOut(),
            ) {
                Icon(
                    imageVector = SBBIcons.Small.TickSmall,
                    tint = color,
                    contentDescription = null
                )
            }
        }
    }
}

@OptIn(ExperimentalSBBComponent::class)
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
