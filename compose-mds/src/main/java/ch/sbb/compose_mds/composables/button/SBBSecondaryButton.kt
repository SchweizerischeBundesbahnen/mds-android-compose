package ch.sbb.compose_mds.composables.button

import SBBTheme
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.composables.loadingIndicator.SBBLoadingIndicator
import ch.sbb.compose_mds.theme.PrimitiveColors

/***
 * Implementation of the SBB Secondary Button.
 *
 * @param label label of button
 * @param enabled controls the enabled state of this button
 * @param isLoading show loading indicator instead of [label] and disables button
 * @param onClick called when this button is clicked
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/button/)
 */
@Composable
fun SBBSecondaryButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isLoading: Boolean = false,
    label: String,
    onClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val pressed by interactionSource.collectIsPressedAsState()
    val isEnabled = enabled && !isLoading
    val colors = buttonColors(pressed)

    Button(
        modifier = modifier.height(44.dp),
        enabled = isEnabled,
        onClick = onClick,
        shape = RoundedCornerShape(22.dp),
        border = buttonBorders(isEnabled),
        colors = colors,
        interactionSource = interactionSource,
    ) {
        if (isLoading) {
            SBBLoadingIndicator.Small(color = colors.disabledContentColor)
        } else {
            Text(
                text = label,
                style = SBBTheme.materialTypography.bodyMedium,
            )
        }
    }
}

@Composable
private fun buttonColors(pressed: Boolean) =
    if (SBBTheme.isDarkMode) darkModeColors(pressed) else lightModeColors(pressed)

@Composable
private fun buttonBorders(enabled: Boolean) =
    if (SBBTheme.isDarkMode) darkModeBorder(enabled) else lightModeBorder(enabled)

@Composable
private fun lightModeColors(pressed: Boolean): ButtonColors {
    val colors = SBBTheme.colors
    return ButtonDefaults.buttonColors(
        containerColor = if (pressed) colors.graphite else colors.white,
        contentColor = colors.primary,
        disabledContainerColor = colors.white,
        disabledContentColor = colors.graphite,
    )
}

@Composable
private fun darkModeColors(pressed: Boolean): ButtonColors {
    val colors = SBBTheme.colors
    return ButtonDefaults.buttonColors(
        containerColor = if (pressed) colors.charcoal else colors.iron,
        contentColor = colors.white,
        disabledContainerColor = PrimitiveColors.transparent,
        disabledContentColor = colors.smoke,
    )
}

@Composable
private fun lightModeBorder(enabled: Boolean): BorderStroke {
    val colors = SBBTheme.colors
    return BorderStroke(1.dp, if (enabled) colors.primary else colors.cloud)
}

@Composable
private fun darkModeBorder(enabled: Boolean): BorderStroke {
    val colors = SBBTheme.colors
    return BorderStroke(1.dp, if (enabled) colors.smoke else colors.iron)
}
