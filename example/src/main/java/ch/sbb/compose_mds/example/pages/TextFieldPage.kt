package ch.sbb.compose_mds.example.pages

import SBBTheme
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
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.beta.modal.SBBModalView
import ch.sbb.compose_mds.beta.text.SBBTextField
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.CircleInformationSmall
import ch.sbb.compose_mds.sbbicons.small.DogSmall
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.defaultPadding

@OptIn(ExperimentalSBBComponent::class, ExperimentalMaterial3Api::class)
@Composable
fun TextFieldPage() {
    var text by remember { mutableStateOf("") }
    var showSheet by remember { mutableStateOf(false) }

    if (showSheet) {
        SBBModalView(
            onDismissRequest = {
                showSheet = false
            },
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
            .verticalScroll(
                state = rememberScrollState(),
            ),
    ) {
        SBBListHeader(text = "Default")
        SBBContentBox(contentPadding = PaddingValues(SBBSpacing.XSmall)) {
            Column {
                SBBTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = "Label",
                )
                SBBTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = "Disabled",
                    enabled = false,
                )
                SBBTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = "Label",
                    //placeholder = "Placeholder",
                )
                SBBTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = "Leading icon",
                    leadingIcon = SBBIcons.Small.DogSmall,
                )
                SBBTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = "Trailing icon",
                    trailingIcon = SBBIcons.Small.CircleInformationSmall,
                    onClickTrailingIcon = {
                        showSheet = true
                    }
                )
                SBBTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = "Leading and trailing icons",
                    leadingIcon = SBBIcons.Small.DogSmall,
                    trailingIcon = SBBIcons.Small.CircleInformationSmall,
                    onClickTrailingIcon = {
                        showSheet = true
                    }
                )
            }
        }
        SBBListHeader(text = "Error")
        SBBContentBox(contentPadding = PaddingValues(SBBSpacing.XSmall)) {
            Column {
                SBBTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = "Error with leading and trailing icons",
                    leadingIcon = SBBIcons.Small.DogSmall,
                    trailingIcon = SBBIcons.Small.CircleInformationSmall,
                    isError = true,
                    onClickTrailingIcon = {
                        showSheet = true
                    }
                )
                SBBTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = "Error",
                    isError = true,
                    errorText = "Test",
                )
            }
        }
    }
}

@PreviewLightDark
@Composable
fun Preview_TextFieldPage() {
    SBBTheme(includeSurface = true) {
        TextFieldPage()
    }
}