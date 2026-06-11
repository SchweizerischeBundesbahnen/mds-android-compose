package ch.sbb.compose_mds.composables.radio

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import ch.sbb.compose_mds.theme.SBBTheme

/***
 * Implementation of the SBB Radio Button.
 *
 * @param label label of the radio button.
 * @param selected controls the selected state of this radio button.
 * @param onClick callback when radio button is clicked.
 * @param modifier modifier of the surrounding Row.
 * @param enabled controls the enabled state of this radio button.
 * @param icon optional icon that is displayed between radio button and label
 * @param interactionSource an optional hoisted MutableInteractionSource for observing and emitting Interactions for this switch.
 * @param style an optional customized style.
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/radio-button/)
 */
@Composable
fun SBBRadio(
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    icon: ImageVector? = null,
    interactionSource: MutableInteractionSource? = null,
    style: SBBRadioStyle = SBBTheme.radio,
) {
    val colors = style.colors(enabled)
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier =
            modifier
                .minimumInteractiveComponentSize()
                .clip(RoundedCornerShape(SBBSpacing.XSmall))
                .clickable(
                    onClick = onClick,
                    enabled = enabled,
                    role = Role.RadioButton,
                    interactionSource = interactionSource,
                    indication = ripple(),
                ).padding(SBBSpacing.XSmall),
    ) {
        DrawRadio(
            modifier = Modifier.padding(end = SBBSpacing.XSmall),
            selected = selected,
            enabled = enabled,
            style = style,
        )
        if (icon != null) {
            Icon(
                modifier =
                    Modifier
                        .semantics { hideFromAccessibility() }
                        .padding(end = SBBSpacing.XSmall),
                imageVector = icon,
                contentDescription = null,
                tint = colors.logo,
            )
        }
        Text(text = label, color = colors.text)
    }
}

@Composable
internal fun DrawRadio(
    selected: Boolean,
    enabled: Boolean,
    modifier: Modifier = Modifier,
    style: SBBRadioStyle = SBBTheme.radio,
) {
    val colors = style.colors(enabled)
    val animatedTickRadius by animateDpAsState(targetValue = if (selected) style.layout.tick else 0.dp)
    Box(
        modifier =
            modifier then
                Modifier
                    .size(style.layout.controlSize)
                    .border(
                        width = style.layout.borderWidth,
                        color = colors.border,
                        shape = CircleShape,
                    ),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier =
                Modifier
                    .size(animatedTickRadius)
                    .background(
                        color = colors.tick,
                        shape = CircleShape,
                    ),
        )
    }
}

@PreviewLightDark
@Composable
private fun SBBRadioPreview() {
    val darkTheme = isSystemInDarkTheme()
    SBBTheme {
        Column(
            modifier =
                Modifier
                    .background(if (darkTheme) PrimitiveColors.black else PrimitiveColors.white)
                    .padding(SBBSpacing.Medium),
            verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall),
        ) {
            SBBRadio(
                selected = true,
                label = "Label",
                onClick = {},
            )
            SBBRadio(
                selected = false,
                label = "Label",
                onClick = {},
            )
            SBBRadio(
                selected = true,
                label = "Label",
                icon = SBBIcons.Small.UnicornSmall,
                onClick = {},
            )
            SBBRadio(
                selected = true,
                label = "Disabled",
                icon = SBBIcons.Small.UnicornSmall,
                enabled = false,
                onClick = {},
            )
        }
    }
}
