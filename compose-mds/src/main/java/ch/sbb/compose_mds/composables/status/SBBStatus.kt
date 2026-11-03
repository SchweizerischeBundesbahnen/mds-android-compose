package ch.sbb.compose_mds.composables.status

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.composables.status.theme.SBBStatusStyle
import ch.sbb.compose_mds.shared.applyForegroundStyle
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

object SBBStatus

/**
 * The Alert variant of [SBBStatus]
 */
@Composable
fun SBBStatus.Alert(
    modifier: Modifier = Modifier,
    iconData: ImageVector? = null,
    icon: (@Composable () -> Unit)? = null,
    labelText: String? = null,
    label: (@Composable () -> Unit)? = null,
    style: SBBStatusStyle? = null,
) = SBBStatus(
    state = SBBStatusState.Alert,
    modifier = modifier,
    iconData = iconData,
    icon = icon,
    labelText = labelText,
    label = label,
    style = style,
)

/**
 * The Warning variant of [SBBStatus]
 */
@Composable
fun SBBStatus.Warning(
    modifier: Modifier = Modifier,
    iconData: ImageVector? = null,
    icon: (@Composable () -> Unit)? = null,
    labelText: String? = null,
    label: (@Composable () -> Unit)? = null,
    style: SBBStatusStyle? = null,
) = SBBStatus(
    state = SBBStatusState.Warning,
    modifier = modifier,
    iconData = iconData,
    icon = icon,
    labelText = labelText,
    label = label,
    style = style,
)

/**
 * The Success variant of [SBBStatus]
 */
@Composable
fun SBBStatus.Success(
    modifier: Modifier = Modifier,
    iconData: ImageVector? = null,
    icon: (@Composable () -> Unit)? = null,
    labelText: String? = null,
    label: (@Composable () -> Unit)? = null,
    style: SBBStatusStyle? = null,
) = SBBStatus(
    state = SBBStatusState.Success,
    modifier = modifier,
    iconData = iconData,
    icon = icon,
    labelText = labelText,
    label = label,
    style = style,
)

/**
 * The Information variant of [SBBStatus]
 */
@Composable
fun SBBStatus.Information(
    modifier: Modifier = Modifier,
    iconData: ImageVector? = null,
    icon: (@Composable () -> Unit)? = null,
    labelText: String? = null,
    label: (@Composable () -> Unit)? = null,
    style: SBBStatusStyle? = null,
) = SBBStatus(
    state = SBBStatusState.Information,
    modifier = modifier,
    iconData = iconData,
    icon = icon,
    labelText = labelText,
    label = label,
    style = style,
)

/***
 * Implementation of the SBB Status.
 *
 * A Widget to display important, non-dismissible information to the user.
 *
 * Provide either [label] for custom content or [labelText] for text-only
 * content with standard styling. For a custom leading widget, use [icon] instead of the
 * default [iconData]. These parameters are mutually exclusive.
 *
 * Use [state] to specify the status type, or use the factory constructors:
 * - [SBBStatus.Alert] for error or alert states
 * - [SBBStatus.Warning] for warning states
 * - [SBBStatus.Success] for success states
 * - [SBBStatus.Information] for informational states
 *
 * See also:
 * - [SBBStatusStyle], for customizing the appearance.
 * - [SBBStatusThemeData], for setting the style for all status indicators within the current Theme.
 * - [SBBStatusState], defines the visual state of the status.
 * - For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/status/)
 */
@Composable
fun SBBStatus(
    state: SBBStatusState,
    modifier: Modifier = Modifier,
    iconData: ImageVector? = null,
    icon: (@Composable () -> Unit)? = null,
    labelText: String? = null,
    label: (@Composable () -> Unit)? = null,
    style: SBBStatusStyle? = null,
) {
    val stateStyle = when (state) {
        SBBStatusState.Alert -> SBBTheme.status.alert
        SBBStatusState.Warning -> SBBTheme.status.warning
        SBBStatusState.Success -> SBBTheme.status.success
        SBBStatusState.Information -> SBBTheme.status.information
    }
    val effectiveStyle = stateStyle.merge(style)

    val iconSlot: (@Composable () -> Unit)? = when {
        icon != null -> icon
        iconData != null || effectiveStyle.iconData != null -> {
            {
                Icon(
                    modifier = Modifier
                        .background(color = effectiveStyle.backgroundColor!!)
                        .padding(1.dp)
                        .padding(end = 1.dp),
                    imageVector = (iconData ?: effectiveStyle.iconData)!!,
                    contentDescription = "Icon",
                )
            }
        }
        else -> null
    }

    val labelSlot: (@Composable () -> Unit)? = when {
        label != null -> label
        !labelText.isNullOrBlank() -> {
            {
                Text(
                    text = labelText,
                    modifier = Modifier.padding(horizontal = SBBSpacing.XSmall),
                )
            }
        }
        else -> null
    }

    Row(
        modifier = modifier
            .clip(RoundedCornerShape(2.dp))
            .border(BorderStroke(1.dp, color = effectiveStyle.borderColor!!))
            .background(color = effectiveStyle.backgroundColor!!.copy(alpha = effectiveStyle.alphaValue!!)),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        iconSlot?.applyForegroundStyle(color = effectiveStyle.iconColor!!)
        labelSlot?.applyForegroundStyle(
            color = effectiveStyle.foregroundColor!!,
            textStyle = effectiveStyle.textStyle,
        )
    }
}
