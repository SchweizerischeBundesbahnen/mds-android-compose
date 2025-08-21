package ch.sbb.compose_mds.composables.checkbox

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.selection.triStateToggleable
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.hideFromAccessibility
import androidx.compose.ui.semantics.invisibleToUser
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import kotlin.math.pow
import kotlin.math.sqrt

/***
 * Implementation of the SBB Checkbox.
 *
 * @param label The Checkbox Label.
 * @param checked State of the Checkbox. Parameters:
 *  - The parameter [true] will be mapped to [ToggleableState.On].
 *  - The parameter [false] will be mapped to [ToggleableState.Off]
 *  - The parameter [null] will be mapped to [ToggleableState.Off] or [ToggleableState.Indeterminate] when [triStateEnabled] is [true].
 * @param icon An Icon between the Checkbox itself and the [label].
 * @param triStateEnabled Enable or disable the [ToggleableState.Indeterminate] state.
 * @param onCheckedChange Action to change the state of the Checkbox.
 * @param disabled If [true], the Checkbox will be disabled and will have the Disabled style.
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/checkbox/)
 */
@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun SBBCheckbox(
    modifier: Modifier = Modifier,
    label: String,
    checked: Boolean?,
    icon: ImageVector? = null,
    triStateEnabled: Boolean = false,
    onCheckedChange: ((Boolean?) -> Unit)?,
    disabled: Boolean = false
) {
    val colors = when {
        SBBTheme.isDarkMode -> if (disabled) SBBCheckboxColors.DARK_DISABLED else SBBCheckboxColors.DARK_ENABLED
        else -> if (disabled) SBBCheckboxColors.LIGHT_DISABLED else SBBCheckboxColors.LIGHT_ENABLED
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = if (triStateEnabled) {
            val state = checked?.let { ToggleableState(it) } ?: ToggleableState.Indeterminate
            modifier.triStateToggleable(state, enabled = !disabled) {
                when (state) {
                    ToggleableState.On -> onCheckedChange?.invoke(null)
                    ToggleableState.Off -> onCheckedChange?.invoke(true)
                    ToggleableState.Indeterminate -> onCheckedChange?.invoke(false)
                }
            }
        } else {
            modifier.toggleable(checked ?: false, enabled = !disabled) {
                onCheckedChange?.invoke(it)
            }
        }
            .fillMaxWidth()
            .padding(SBBCheckboxConst.CHECKBOX_PADDING),
    ) {
        DrawCheckBox(
            modifier = Modifier.padding(end = SBBCheckboxConst.CHECKBOX_PADDING),
            checked = checked,
            triStateEnabled = triStateEnabled,
            colors = colors
        )
        if (icon != null) {
            Icon(
                modifier = Modifier
                    .semantics { hideFromAccessibility() }
                    .padding(end = SBBCheckboxConst.CHECKBOX_PADDING),
                imageVector = icon,
                contentDescription = null,
                tint = colors.textColor,
            )
        }
        Text(text = label, color = colors.textColor)
    }
}

@Composable
private fun DrawCheckBox(
    modifier: Modifier,
    checked: Boolean?,
    triStateEnabled: Boolean,
    colors: SBBCheckboxColors,
) {
    Canvas(
        modifier = modifier.size(
            SBBCheckboxConst.CHECKBOX_SIZE, SBBCheckboxConst.CHECKBOX_SIZE
        )
    ) {
        // Box
        drawRoundRect(
            color = colors.borderColor,
            cornerRadius = CornerRadius(SBBCheckboxConst.CHECKBOX_BORDER_RADIUS.toPx()),
        )
        drawRoundRect(
            color = colors.backgroundColor,
            size = Size(
                size.width - SBBCheckboxConst.CHECKBOX_BORDER_SIZE.toPx() * 2,
                size.height - SBBCheckboxConst.CHECKBOX_BORDER_SIZE.toPx() * 2
            ),
            topLeft = Offset(
                SBBCheckboxConst.CHECKBOX_BORDER_SIZE.toPx(),
                SBBCheckboxConst.CHECKBOX_BORDER_SIZE.toPx()
            ),
            cornerRadius = CornerRadius((SBBCheckboxConst.CHECKBOX_BORDER_RADIUS - SBBCheckboxConst.CHECKBOX_BORDER_SIZE).toPx())
        )

        // Check
        if (checked == true) {
            // Calculate offset, to center the check inside the box
            val checkHeight = SBBCheckboxConst.CHECK_HEIGHT.toPx()
            val checkWidth = SBBCheckboxConst.CHECK_WIDTH.toPx()
            val width = sqrt(((checkHeight / 2).pow(2) / 2) + (checkHeight.pow(2) / 2))
            val height = sqrt(((checkWidth).pow(2) / 2) + (checkHeight.pow(2) / 2))
            val offset = Offset(size.width / 2 - width / 4, (size.height + height) / 2)

            rotate(180f + SBBCheckboxConst.CHECK_ANGLE, pivot = offset) {
                drawRoundRect(
                    topLeft = offset,
                    color = colors.checkColor,
                    size = Size(checkWidth, checkHeight),
                    cornerRadius = CornerRadius(SBBCheckboxConst.CHECK_BORDER_RADIUS.toPx())
                )
            }
            rotate(180F - SBBCheckboxConst.CHECK_ANGLE, pivot = offset) {
                drawRoundRect(
                    topLeft = offset,
                    color = colors.checkColor,
                    size = Size(-checkWidth, checkHeight / 2),
                    cornerRadius = CornerRadius(SBBCheckboxConst.CHECK_BORDER_RADIUS.toPx())
                )
            }
        }

        // Indeterminate
        if (triStateEnabled && checked == null) {
            drawRoundRect(
                topLeft = Offset(
                    (size.width - SBBCheckboxConst.INDETERMINATE_WIDTH.toPx()) / 2,
                    (size.height - SBBCheckboxConst.INDETERMINATE_HEIGHT.toPx()) / 2
                ),
                color = colors.indeterminateColor,
                size = Size(
                    SBBCheckboxConst.INDETERMINATE_WIDTH.toPx(),
                    SBBCheckboxConst.INDETERMINATE_HEIGHT.toPx(),
                ),
                cornerRadius = CornerRadius(SBBCheckboxConst.INDETERMINATE_BORDER_RADIUS.toPx()),
            )
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview_Enabled_SBBCheckbox() = _Preview_Enabled_SBBCheckbox()

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview_Disabled_SBBCheckbox() = _Preview_Disabled_SBBCheckbox()
