package ch.sbb.compose_mds.example.pages

import SBBTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.beta.modal.SBBModalView
import ch.sbb.compose_mds.beta.text.SBBTextarea
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.CircleInformationSmall
import ch.sbb.compose_mds.sbbicons.small.DogSmall
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.defaultPadding

@OptIn(ExperimentalSBBComponent::class, ExperimentalMaterial3Api::class)
@Composable
fun TextareaPage() {
    var showSheet by remember { mutableStateOf(false) }

    if (showSheet) {
        SBBModalView(
            onDismissRequest = { showSheet = false },
            sheetState = rememberModalBottomSheetState(),
            showCloseButton = true,
            title = "Information"
        ) {
            Text("Lorem ipsum.")
        }
    }

    Column(
        modifier = Modifier
            .defaultPadding()
            .fillMaxWidth()
            .verticalScroll(state = rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SBBTextareaDefaultSection(onShowSheet = { showSheet = true })
        SBBTextareaErrorSection(onShowSheet = { showSheet = true })
    }
}

@OptIn(ExperimentalSBBComponent::class)
@Composable
private fun SBBTextareaDefaultSection(onShowSheet: () -> Unit) {
    var text1 by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    var text3 by remember { mutableStateOf("Value") }
    var text4 by remember { mutableStateOf("") }

    SBBContentBox(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(SBBSpacing.XSmall)
    ) {
        SBBListHeader(text = "Default")
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            SBBTextarea(
                value = text1,
                onValueChange = { text1 = it },
                label = "Label",
            )
            SBBTextarea(
                value = "Value",
                onValueChange = { },
                label = "Disabled",
                enabled = false,
                leadingIcon = SBBIcons.Small.DogSmall,
                trailingIcon = SBBIcons.Small.CircleInformationSmall,
                onClickTrailingIcon = {
                    onShowSheet()
                }
            )
            SBBTextarea(
                value = text2,
                onValueChange = { text2 = it },
                label = "Leading icon",
                leadingIcon = SBBIcons.Small.DogSmall,
            )
            SBBTextarea(
                value = text3,
                onValueChange = { text3 = it },
                label = "Trailing icon",
                trailingIcon = SBBIcons.Small.CircleInformationSmall,
                onClickTrailingIcon = {
                    onShowSheet()
                }
            )
            SBBTextarea(
                value = text4,
                onValueChange = { text4 = it },
                label = "Leading and trailing icons",
                leadingIcon = SBBIcons.Small.DogSmall,
                trailingIcon = SBBIcons.Small.CircleInformationSmall,
                onClickTrailingIcon = {
                    onShowSheet()
                }
            )
        }
    }
}

@OptIn(ExperimentalSBBComponent::class)
@Composable
private fun SBBTextareaErrorSection(onShowSheet: () -> Unit) {
    var text5 by remember { mutableStateOf("Error") }
    SBBContentBox(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(SBBSpacing.XSmall)
    ) {
        SBBListHeader(text = "Error")
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            SBBTextarea(
                value = text5,
                onValueChange = { text5 = it },
                label = "Error with leading and trailing icons",
                leadingIcon = SBBIcons.Small.DogSmall,
                trailingIcon = SBBIcons.Small.CircleInformationSmall,
                isError = true,
                onClickTrailingIcon = {
                    onShowSheet()
                }
            )
            SBBTextarea(
                value = text5,
                onValueChange = { text5 = it },
                label = "Error",
                isError = true,
                errorText = "This is an error message",
            )
        }
    }
}

@PreviewLightDark
@Composable
fun Preview_TextareaDefault() {
    SBBTheme(includeSurface = true) {
        SBBTextareaDefaultSection(onShowSheet = {})
    }
}

@PreviewLightDark
@Composable
fun Preview_TextareaError() {
    SBBTheme(includeSurface = true) {
        SBBTextareaErrorSection(onShowSheet = {})
    }
}