package ch.sbb.compose_mds.beta.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.theme.PrimitiveColors

@ExperimentalSBBComponent
data class SBBButtonSegment<T>(
    val value: T,
    val label: String,
)

// TODO: Add Red State
// TODO: Add Icon Button
// TODO: Fix slow pressed animation
@OptIn(ExperimentalSBBComponent::class)
@Composable
fun <T> SBBSegmentedButton(
    modifier: Modifier = Modifier,
    selection: T,
    segments: List<SBBButtonSegment<T>>,
    enabled: Boolean = true,
    onSelectionChanged: (T) -> Unit
) {
    // TODO: Border on Row not working correctly, as it overlaps ButtonSegments.
    Row(
        modifier = modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(22.dp))
            .background(color = if (isSystemInDarkTheme()) PrimitiveColors.charcoal else PrimitiveColors.cloud),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        val totalWeight = segments.size.toFloat()
        segments.forEach { segment ->
            ButtonSegment(
                modifier = Modifier.weight(1f / totalWeight),
                label = segment.label,
                active = segment.value == selection,
                enabled = enabled,
            ) {
                onSelectionChanged(segment.value)
            }
        }
    }
}

@Composable
private fun ButtonSegment(
    modifier: Modifier = Modifier,
    label: String,
    active: Boolean = false,
    enabled: Boolean = true,
    onClick: () -> Unit,
) {
    Button(
        modifier = modifier.height(44.dp),
        onClick = onClick,
        enabled = enabled,
        shape = RoundedCornerShape(22.dp),
        border = if (isSystemInDarkTheme()) darkModeBorder(
            active = active,
            enabled = enabled
        ) else lightModeBorder(
            active = active,
            enabled = enabled
        ),
        colors = if (isSystemInDarkTheme()) darkModeColors(active) else lightModeColors(active),
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
private fun lightModeColors(active: Boolean): ButtonColors = ButtonDefaults.buttonColors(
    containerColor = if (active) PrimitiveColors.white else PrimitiveColors.cloud,
    contentColor = PrimitiveColors.black,
    disabledContainerColor = if (active) PrimitiveColors.white else PrimitiveColors.cloud,
    disabledContentColor = PrimitiveColors.graphite
)

@Composable
private fun darkModeColors(active: Boolean): ButtonColors = ButtonDefaults.buttonColors(
    containerColor = if (active) PrimitiveColors.iron else PrimitiveColors.charcoal,
    contentColor = PrimitiveColors.white,
    disabledContainerColor = if (active) PrimitiveColors.iron else PrimitiveColors.charcoal,
    disabledContentColor = PrimitiveColors.smoke
)

@Composable
private fun lightModeBorder(active: Boolean, enabled: Boolean): BorderStroke? =
    if (active) BorderStroke(1.dp, if (enabled) PrimitiveColors.granite else PrimitiveColors.graphite) else null

@Composable
private fun darkModeBorder(active: Boolean, enabled: Boolean): BorderStroke? =
    if (active) BorderStroke(1.dp, if (enabled) PrimitiveColors.graphite else PrimitiveColors.granite) else null