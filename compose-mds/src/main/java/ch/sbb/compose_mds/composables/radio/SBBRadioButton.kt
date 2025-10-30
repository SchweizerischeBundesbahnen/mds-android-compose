package ch.sbb.compose_mds.composables.radio

import SBBTheme
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.hideFromAccessibility
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.UnicornSmall
import ch.sbb.compose_mds.theme.PrimitiveColors
import ch.sbb.compose_mds.theme.SBBSpacing

val tickRadius = 4.dp
val backgroundRadius = 9.dp
val backgroundBorderWidth = 1.dp

/***
 * Implementation of the SBB Radio Button.
 *
 * TODO:
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/radio-button/)
 */
@Composable
fun SBBRadioButton(
    modifier: Modifier = Modifier,
    label: String,
    selected: Boolean,
    disabled: Boolean = false,
    icon: ImageVector? = null,
    interactionSource: MutableInteractionSource? = null,
    onClick: () -> Unit,
) {
    val colors = if (SBBTheme.isDarkMode) darkRadioButtonColors(disabled = disabled)
    else lightRadioButtonColors(disabled = disabled)
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .minimumInteractiveComponentSize()
            .clip(RoundedCornerShape(8.dp))
            .clickable(
                onClick = onClick,
                enabled = !disabled,
                role = Role.RadioButton,
                interactionSource = interactionSource,
                indication = ripple(),
            )
            .padding(8.dp),
    ) {
        DrawRadio(
            modifier = Modifier.padding(end = 8.dp),
            selected = selected,
            colors = colors,
        )
        if (icon != null) {
            Icon(
                modifier = Modifier
                    .semantics { hideFromAccessibility() }
                    .padding(end = 8.dp),
                imageVector = icon,
                contentDescription = null,
                tint = colors.iconColor,
            )
        }
        Text(text = label, color = colors.textColor)
    }
}

@Composable
private fun DrawRadio(
    modifier: Modifier,
    selected: Boolean,
    colors: SBBRadioButtonColors,
) {
    val radioButtonSize = (backgroundRadius + backgroundBorderWidth) * 2
    val animatedTickRadius = animateDpAsState(targetValue = if (selected) tickRadius else 0.dp)
    Canvas(
        modifier = modifier.size(radioButtonSize, radioButtonSize)
    ) {
        // Draw the radio button
        val strokeWidth = backgroundBorderWidth.toPx()
        drawCircle(
            colors.tickBorderColor,
            radius = backgroundRadius.toPx() - strokeWidth / 2,
            style = Stroke(strokeWidth)
        )
        if (animatedTickRadius.value > 0.dp) {
            drawCircle(
                colors.tickColor, animatedTickRadius.value.toPx() - strokeWidth / 2, style = Fill
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SBBSwitchPreview() {
    val darkTheme = isSystemInDarkTheme()
    SBBTheme {
        Column(
            modifier = Modifier
                .background(if (darkTheme) PrimitiveColors.black else PrimitiveColors.white)
                .padding(SBBSpacing.Medium),
            verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall),
        ) {
            SBBRadioButton(
                selected = true,
                label = "Label",
                onClick = {},
            )
            SBBRadioButton(
                selected = false,
                label = "Label",
                onClick = {},
            )
            SBBRadioButton(
                selected = true,
                label = "Label",
                icon = SBBIcons.Small.UnicornSmall,
                onClick = {},
            )
            SBBRadioButton(
                selected = true,
                label = "Disabled",
                icon = SBBIcons.Small.UnicornSmall,
                disabled = true,
                onClick = {},
            )
        }
    }
}
