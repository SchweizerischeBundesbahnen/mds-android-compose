package ch.sbb.compose_mds.composables.button

import SBBTheme
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.composables.loadingIndicator.SBBLoadingIndicator
import ch.sbb.compose_mds.theme.PrimitiveColors

/***
 * Implementation of the SBB Tertiary Button.
 *
 * Button can be used with either a [label], [icon] or both.
 *
 * @param label label of button
 * @param icon icon of button
 * @param enabled controls the enabled state of this button
 * @param isLoading show loading indicator instead of [label] and disables button
 * @param onClick called when this button is clicked
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/button/)
 */
@Composable
fun SBBTertiaryButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isLoading: Boolean = false,
    label: String? = null,
    icon: ImageVector? = null,
    onClick: () -> Unit,
) {
    SBBTertiaryButtonImpl(
        modifier = modifier,
        enabled = enabled,
        isLoading = isLoading,
        label = label,
        icon = icon,
        size = SBBTertiaryButtonSize.Regular,
        onClick = onClick,
    )
}


/***
 * Implementation of the SBB Tertiary Small Button.
 *
 * Button can be used with either a [label], [icon] or both.
 *
 * @param label label of button
 * @param icon icon of button
 * @param enabled controls the enabled state of this button
 * @param isLoading show loading indicator instead of [label] and disables button
 * @param onClick called when this button is clicked
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/button/)
 */
@Composable
fun SBBTertiaryButtonSmall(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isLoading: Boolean = false,
    label: String? = null,
    icon: ImageVector? = null,
    onClick: () -> Unit,
) {
    SBBTertiaryButtonImpl(
        modifier = modifier,
        enabled = enabled,
        isLoading = isLoading,
        label = label,
        icon = icon,
        size = SBBTertiaryButtonSize.Small,
        onClick = onClick,
    )
}

private enum class SBBTertiaryButtonSize(
    val height: Dp,
    val iconOnlyWidth: Dp,
    val verticalPadding: Dp,
) {
    Regular(height = 44.dp, iconOnlyWidth = 44.dp, verticalPadding = 10.dp),
    Small(height = 32.dp, iconOnlyWidth = 32.dp, verticalPadding = 4.dp),
}

@Composable
private fun SBBTertiaryButtonImpl(
    modifier: Modifier,
    enabled: Boolean,
    isLoading: Boolean,
    label: String?,
    icon: ImageVector?,
    size: SBBTertiaryButtonSize,
    onClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val pressed by interactionSource.collectIsPressedAsState()
    val isEnabled = enabled && !isLoading
    val colors = buttonColors(pressed)

    var buttonModifier = modifier.height(size.height)
    if (label == null) {
        buttonModifier = buttonModifier.width(size.iconOnlyWidth)
    }

    Button(
        modifier = buttonModifier,
        enabled = isEnabled,
        onClick = onClick,
        shape = RoundedCornerShape(22.dp),
        border = borderColors(isEnabled),
        colors = colors,
        contentPadding = contentPadding(size, label),
        interactionSource = interactionSource,
    ) {
        if (isLoading) {
            SBBLoadingIndicator.Small(color = colors.disabledContentColor)
        } else {
            if (icon != null) {
                Icon(
                    modifier = Modifier.padding(end = if (label != null) 4.dp else 0.dp),
                    imageVector = icon,
                    contentDescription = null,
                    tint = if (isEnabled) colors.contentColor else colors.disabledContentColor,
                )
            }
            if (label != null) {
                Text(
                    text = label,
                    style = MaterialTheme.typography.bodyMedium,
                )
            }
        }
    }
}

private fun contentPadding(
    size: SBBTertiaryButtonSize,
    label: String?,
): PaddingValues =
    PaddingValues(
        start = if (label == null) 0.dp else 16.dp,
        top = size.verticalPadding,
        end = if (label == null) 0.dp else 16.dp,
        bottom = size.verticalPadding,
    )

@Composable
private fun buttonColors(pressed: Boolean): ButtonColors =
    if (SBBTheme.isDarkMode) darkModeColors(pressed) else lightModeColors(pressed)

@Composable
private fun lightModeColors(pressed: Boolean): ButtonColors {
    val colors = SBBTheme.colors
    return ButtonDefaults.buttonColors(
        containerColor = if (pressed) colors.graphite else colors.white,
        contentColor = colors.black,
        disabledContainerColor = colors.white,
        disabledContentColor = colors.graphite,
    )
}

@Composable
private fun darkModeColors(pressed: Boolean): ButtonColors {
    val colors = SBBTheme.colors
    return ButtonDefaults.buttonColors(
        containerColor = if (pressed) colors.black else colors.charcoal,
        contentColor = colors.white,
        disabledContainerColor = PrimitiveColors.transparent,
        disabledContentColor = colors.smoke,
    )
}

@Composable
private fun borderColors(enabled: Boolean): BorderStroke =
    if (SBBTheme.isDarkMode) darkModeBorder(enabled) else lightModeBorder(enabled)

@Composable
private fun lightModeBorder(enabled: Boolean): BorderStroke {
    val colors = SBBTheme.colors
    return BorderStroke(1.dp, if (enabled) colors.smoke else colors.cloud)
}

@Composable
private fun darkModeBorder(enabled: Boolean): BorderStroke {
    val colors = SBBTheme.colors
    return BorderStroke(1.dp, if (enabled) colors.smoke else colors.iron)
}