package ch.sbb.compose_mds.example.pages

import SBBTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.dropdown.SBBDropdown
import ch.sbb.compose_mds.beta.dropdown.SBBDropdownItem
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.UnicornSmall
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.defaultPadding

@OptIn(ExperimentalSBBComponent::class, ExperimentalMaterial3Api::class)
@Composable
fun DropdownPage() {
    Column(
        modifier = Modifier
            .defaultPadding()
            .fillMaxWidth()
            .verticalScroll(state = rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SBBDropdownDefaultSection()
        SBBDropdownErrorSection()
    }
}

@OptIn(ExperimentalSBBComponent::class)
@Composable
private fun SBBDropdownDefaultSection() {
    var value1 by remember { mutableStateOf<Int?>(null) }
    var value2 by remember { mutableStateOf<Int?>(null) }
    var value3 by remember { mutableStateOf<Int?>(3) }
    var value4 by remember { mutableStateOf<Int?>(4) }
    val items = listOf(
        SBBDropdownItem(value = 1, label = "Value 1"),
        SBBDropdownItem(value = 2, label = "Value 2"),
        SBBDropdownItem(value = 3, label = "Value 3"),
        SBBDropdownItem(value = 4, label = "Value 4")
    )

    SBBContentBox(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(SBBSpacing.XSmall)
    ) {
        SBBListHeader(text = "Default")
        Column(
            verticalArrangement = Arrangement.spacedBy(SBBSpacing.Medium)
        ) {
            SBBDropdown(
                value = value1,
                items = items,
                onValueChange = { value1 = it },
                label = "Only label",
                selectionTitle = "Selection"
            )
            SBBDropdown(
                value = value2,
                items = items,
                leadingIcon = SBBIcons.Small.UnicornSmall,
                onValueChange = { value2 = it },
                label = "Label",
                selectionTitle = "Selection"
            )
            SBBDropdown(
                value = value3,
                items = items,
                leadingIcon = SBBIcons.Small.UnicornSmall,
                onValueChange = { value3 = it },
                label = "Label",
                placeholder = "With placeholder",
                selectionTitle = "Selection"
            )
            SBBDropdown(
                value = value4,
                items = items,
                leadingIcon = SBBIcons.Small.UnicornSmall,
                onValueChange = { value4 = it },
                enabled = false,
                label = "Disabled",
                selectionTitle = "Selection"
            )
        }
    }
}

@OptIn(ExperimentalSBBComponent::class)
@Composable
private fun SBBDropdownErrorSection() {
    var value1 by remember { mutableStateOf(1) }
    var value2 by remember { mutableStateOf(2) }
    val items = listOf(
        SBBDropdownItem(value = 1, label = "Value 1"),
        SBBDropdownItem(value = 2, label = "Value 2")
    )
    SBBContentBox(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(SBBSpacing.XSmall)
    ) {
        SBBListHeader(text = "Error")
        Column(
            verticalArrangement = Arrangement.spacedBy(SBBSpacing.Medium)
        ) {
            SBBDropdown(
                value = value1,
                items = items,
                onValueChange = { value1 = it },
                label = "Error",
                leadingIcon = SBBIcons.Small.UnicornSmall,
                selectionTitle = "Selection",
                isError = true,
            )
            SBBDropdown(
                value = value2,
                items = items,
                onValueChange = { value2 = it },
                label = "With error message",
                leadingIcon = SBBIcons.Small.UnicornSmall,
                selectionTitle = "Selection",
                isError = true,
                errorText = "This is an error message",
            )
        }
    }
}

@PreviewLightDark
@Composable
fun Preview_DropdownDefault() {
    SBBTheme(includeSurface = true) {
        SBBDropdownDefaultSection()
    }
}

@PreviewLightDark
@Composable
fun Preview_DropdownError() {
    SBBTheme(includeSurface = true) {
        SBBDropdownErrorSection()
    }
}