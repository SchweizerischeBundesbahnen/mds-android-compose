package ch.sbb.compose_mds.beta.dropdown

import SBBTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.hideFromAccessibility
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListItem
import ch.sbb.compose_mds.beta.modal.SBBModalView
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.ChevronSmallDownSmall
import ch.sbb.compose_mds.sbbicons.small.TickSmall
import ch.sbb.compose_mds.sbbicons.small.UnicornSmall
import ch.sbb.compose_mds.theme.SBBSpacing

/**
 * A single selectable item for [SBBDropdown].
 *
 * @param T The type of the selectable value.
 * @property label The visible label shown to the user for this item.
 * @property value The value associated with this item
 */
data class SBBDropdownItem<T>(val label: String, val value: T)

/**
 * Implementation of the SBB Dropdown.
 *
 * @param label The field label shown above or inside the dropdown.
 * @param value Currently selected value, or null when none is selected.
 * @param items List of selectable items (SBBDropdownItem<T>).
 * @param onValueChange Callback invoked with the selected value when the user selects an item.
 * @param selectionTitle Title shown in the selection sheet.
 * @param modifier Modifier for styling and layout.
 * @param enabled Whether the dropdown is interactable.
 * @param textStyle Text style for the selected value
 * @param placeholder Optional placeholder text shown when no item is selected.
 * @param leadingIcon Optional leading icon displayed left of the label/value.
 * @param supportingText Optional helper text shown below the dropdown.
 * @param errorText Optional error message shown when isError is true.
 * @param isError Whether the dropdown is in an error state.
 * @param colors Optional color overrides for the dropdown.
 *
 * TODO: Implement multiselect
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/dropdown/)
 */
@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalSBBComponent
@Composable
fun <T> SBBDropdown(
    label: String,
    value: T? = null,
    items: List<SBBDropdownItem<T>>,
    onValueChange: (T) -> Unit,
    selectionTitle: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    textStyle: TextStyle = LocalTextStyle.current,
    placeholder: String? = null,
    leadingIcon: ImageVector? = null,
    supportingText: String? = null,
    errorText: String? = null,
    isError: Boolean = false,
    colors: SBBDropdownColors? = null,
) {
    val resolvedColors = colors
        ?: if (SBBTheme.isDarkMode) darkDropdownColors(enabled = enabled) else lightDropdownColors(
            enabled = enabled
        )

    var showItemSelection by remember { mutableStateOf(false) }

    if (showItemSelection) {
        SelectionSheet(
            title = selectionTitle,
            value = value,
            items = items,
            onSelected = onValueChange,
            onClose = { showItemSelection = false }
        )
    }

    Column(modifier = modifier.clickable(enabled = enabled) { showItemSelection = true }) {
        Row(
            modifier = Modifier.padding(vertical = SBBSpacing.XSmall),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall),
        ) {
            if (leadingIcon != null) {
                Icon(
                    modifier = Modifier.semantics { hideFromAccessibility() },
                    imageVector = leadingIcon,
                    contentDescription = null,
                    tint = resolvedColors.iconColor
                )
            }

            val selected = items.firstOrNull { it.value == value }
            if (selected != null || placeholder != null) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        label,
                        style = SBBTheme.sbbTypography.XXSmallLight,
                        color = resolvedColors.labelColor
                    )
                    Text(
                        selected?.label ?: placeholder!!,
                        style = textStyle,
                        color = if (selected != null) resolvedColors.valueTextColor else resolvedColors.placeholderColor
                    )
                }
            } else {
                Text(
                    placeholder ?: label,
                    modifier = Modifier.weight(1f),
                    color = resolvedColors.placeholderColor
                )
            }

            Icon(
                modifier = Modifier.semantics { hideFromAccessibility() },
                imageVector = SBBIcons.Small.ChevronSmallDownSmall,
                contentDescription = null,
                tint = resolvedColors.dropdownIconColor
            )
        }

        if (isError && !errorText.isNullOrEmpty()) {
            Text(
                text = errorText,
                color = resolvedColors.errorColor,
                style = SBBTheme.sbbTypography.XXSmallBold,
                modifier = Modifier.padding(bottom = SBBSpacing.XXSmall)
            )
        }

        val underlineColor = when {
            isError -> resolvedColors.errorColor
            else -> resolvedColors.underlineColor
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(underlineColor)
        )

        if (supportingText != null && (!isError || errorText.isNullOrEmpty())) {
            Box(modifier = Modifier.padding(top = SBBSpacing.XXSmall)) {
                Text(
                    supportingText,
                    style = SBBTheme.sbbTypography.helpersLabel,
                    color = resolvedColors.labelColor
                )
            }
        }
    }
}

@OptIn(ExperimentalSBBComponent::class, ExperimentalMaterial3Api::class)
@Composable
internal fun <T> SelectionSheet(
    title: String,
    value: T? = null,
    items: List<SBBDropdownItem<T>>,
    onClose: () -> Unit,
    onSelected: (T) -> Unit,
) {
    SBBModalView(
        onDismissRequest = {
            onClose()
        },
        sheetState = rememberModalBottomSheetState(),
        showCloseButton = true,
        title = title
    ) {
        SBBContentBox(contentPadding = PaddingValues(0.dp)) {
            items.forEachIndexed { index, item ->
                val isSelected = value == item.value
                val textStyle =
                    MaterialTheme.typography.bodyMedium.copy(fontWeight = if (isSelected) FontWeight.Bold else null)
                SBBListItem(
                    title = item.label,
                    textStyle = textStyle,
                    trailingIcon = if (isSelected) SBBIcons.Small.TickSmall else null,
                    onClick = {
                        onClose()
                        onSelected(item.value)
                    },
                    isLastElement = index == items.size - 1
                )
            }
        }
    }
}

@OptIn(ExperimentalSBBComponent::class)
@Preview(showBackground = true)
@Composable
internal fun _Preview_SBBDropdown() {
    SBBTheme {
        Surface {
            SBBDropdown(
                value = "Value",
                items = listOf(SBBDropdownItem(label = "Label 1", value = "Value 1")),
                onValueChange = { },
                label = "Label",
                placeholder = "Placeholder",
                leadingIcon = SBBIcons.Small.UnicornSmall,
                selectionTitle = "Selection",
            )
        }
    }
}

@OptIn(ExperimentalSBBComponent::class)
@Preview(showBackground = true)
@Composable
internal fun _Preview_SBBDropdownLabel() {
    SBBTheme {
        Surface {
            SBBDropdown(
                items = listOf(SBBDropdownItem(label = "Label 1", value = "Value")),
                onValueChange = { },
                label = "Label",
                leadingIcon = SBBIcons.Small.UnicornSmall,
                selectionTitle = "Selection",
            )
        }
    }
}

@OptIn(ExperimentalSBBComponent::class)
@Preview(showBackground = true)
@Composable
internal fun _Preview_SBBDropdown_Error() {
    SBBTheme {
        Surface {
            SBBDropdown(
                value = "Value",
                items = listOf(SBBDropdownItem(label = "Label 1", value = "Value 1")),
                onValueChange = { },
                label = "Label",
                placeholder = "Placeholder",
                isError = true,
                errorText = "This is an error text",
                leadingIcon = SBBIcons.Small.UnicornSmall,
                selectionTitle = "Selection",
            )
        }
    }
}

@OptIn(ExperimentalSBBComponent::class)
@Preview(showBackground = true)
@Composable
internal fun _Preview_SBBDropdown_Selection() {
    SBBTheme {
        Surface {
            SelectionSheet(
                title = "Title",
                value = 3,
                items = listOf(
                    SBBDropdownItem(label = "Item 1", value = 1),
                    SBBDropdownItem(label = "Item 2", value = 2),
                    SBBDropdownItem(label = "Item 3", value = 3),
                    SBBDropdownItem(label = "Item 4", value = 4)
                ),
                onClose = {},
                onSelected = {}
            )
        }
    }
}