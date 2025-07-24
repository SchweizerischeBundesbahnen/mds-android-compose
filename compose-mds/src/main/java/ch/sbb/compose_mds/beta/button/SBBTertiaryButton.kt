package ch.sbb.compose_mds.beta.button

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.theme.PrimitiveColors

@ExperimentalSBBComponent
@Composable
fun SBBTertiaryButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    label: String? = null,
    icon: ImageVector? = null,
    onClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val pressed by interactionSource.collectIsPressedAsState()

    var buttonModifier = modifier
    if (label == null) {
        buttonModifier = buttonModifier.width(44.dp)
    }

    Button(
        modifier = buttonModifier.height(44.dp),
        enabled = enabled,
        onClick = onClick,
        shape = RoundedCornerShape(22.dp),
        border = borderColors(enabled),
        colors = buttonColors(pressed),
        contentPadding = contentPadding(label),
        interactionSource = interactionSource,
    ) {
        if (icon != null) {
            Icon(
                modifier = Modifier.padding(end = if (label != null) 4.dp else 0.dp),
                imageVector = icon,
                contentDescription = null,
                tint = iconColor(enabled = enabled),
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

private fun contentPadding(label: String?): PaddingValues =
    PaddingValues(
        start = if (label == null) 0.dp else 16.dp,
        top = 10.dp,
        end = if (label == null) 0.dp else 16.dp,
        bottom = 10.dp,
    )

@Composable
private fun iconColor(enabled: Boolean): Color {
    val colors = SBBTheme.colors
    return if (SBBTheme.isDarkMode) {
        if (enabled) colors.white else colors.smoke
    } else {
        if (enabled) colors.black else colors.cloud
    }
}

@Composable
private fun buttonColors(pressed: Boolean): ButtonColors = if (SBBTheme.isDarkMode) darkModeColors(pressed) else lightModeColors(pressed)

@Composable
private fun lightModeColors(pressed: Boolean): ButtonColors {
    val colors = SBBTheme.colors
    return ButtonDefaults.buttonColors(
        containerColor = if (pressed) colors.graphite else colors.white,
        contentColor = colors.black,
        disabledContainerColor = colors.white,
        disabledContentColor = colors.cloud,
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
    if (SBBTheme.isDarkMode) {
        darkModeBorder(enabled)
    } else {
        lightModeBorder(enabled)
    }

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
