package ch.sbb.compose_mds.example.pages

import SBBTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.beta.text.SBBTextField
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.CircleInformationSmall
import ch.sbb.compose_mds.sbbicons.small.DogSmall
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.defaultPadding

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun TextFieldPage() {
    var text by remember { mutableStateOf("Value") }

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
                    label = { Text("Label") },
                )
                SBBTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Disabled") },
                    enabled = false,
                )
                SBBTextField(
                    value = "",
                    onValueChange = { text = it },
                    label = { Text("Placeholder") },
                    placeholder = { Text("Placeholder") },
                )
                SBBTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Leading icon") },
                    leadingIcon = SBBIcons.Small.DogSmall,
                )
                SBBTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Trailing icon") },
                    trailingIcon = SBBIcons.Small.CircleInformationSmall,
                )
                SBBTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Leading and trailing icons") },
                    leadingIcon = SBBIcons.Small.DogSmall,
                    trailingIcon = SBBIcons.Small.CircleInformationSmall,
                )
            }
        }
        SBBListHeader(text = "Error")
        SBBContentBox(contentPadding = PaddingValues(SBBSpacing.XSmall)) {
            Column {
                SBBTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Error with leading and trailing icons") },
                    leadingIcon = SBBIcons.Small.DogSmall,
                    trailingIcon = SBBIcons.Small.CircleInformationSmall,
                    isError = true,
                )
                SBBTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Error") },
                    isError = true,
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