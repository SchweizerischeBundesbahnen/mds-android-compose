package ch.sbb.compose_mds.composables.button

import SBBTheme
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

/***
 * Implementation of the SBB Primary Button.
 *
 * @param label label of button
 * @param enabled controls the enabled state of this button
 * @param isLoading show loading indicator instead of [label] and disables button
 * @param onClick called when this button is clicked
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/button/)
 */
@Composable
fun SBBPrimaryButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isLoading: Boolean = false,
    label: String,
    onClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val pressed by interactionSource.collectIsPressedAsState()
    val buttonColors = buttonColors(pressed)

    Button(
        modifier = modifier.height(44.dp),
        enabled = enabled && !isLoading,
        onClick = onClick,
        shape = RoundedCornerShape(22.dp),
        colors = buttonColors,
        interactionSource = interactionSource,
    ) {
        if (isLoading) {
            SBBLoadingIndicator.Small(color = buttonColors.disabledContentColor)
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
private fun lightModeColors(pressed: Boolean): ButtonColors {
    val colors = SBBTheme.colors
    return ButtonDefaults.buttonColors(
        containerColor = if (pressed) colors.primary125 else colors.primary,
        contentColor = colors.white,
        disabledContainerColor = colors.graphite,
        disabledContentColor = colors.white,
    )
}

@Composable
private fun darkModeColors(pressed: Boolean): ButtonColors {
    val colors = SBBTheme.colors
    return ButtonDefaults.buttonColors(
        containerColor = if (pressed) colors.primary125 else colors.primary,
        contentColor = colors.white,
        disabledContainerColor = colors.iron,
        disabledContentColor = colors.smoke,
    )
}
