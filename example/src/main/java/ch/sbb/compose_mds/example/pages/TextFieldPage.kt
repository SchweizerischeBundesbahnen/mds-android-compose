package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.text.SBBTextField
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.CircleInformationSmall
import ch.sbb.compose_mds.sbbicons.small.DogSmall

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun TextFieldPage() {
    var text by remember { mutableStateOf("Value") }

    Box(
        modifier = Modifier
            .padding(
                vertical = 16.dp,
                horizontal = 8.dp,
            )
    ) {
        SBBContentBox {
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
                    label = { Text("Error") },
                    isError = true,
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
                SBBTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Error with leading and trailing icons") },
                    leadingIcon = SBBIcons.Small.DogSmall,
                    trailingIcon = SBBIcons.Small.CircleInformationSmall,
                    isError = true,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun TextFieldPagePreview() {
    SBBTheme {
        TextFieldPage()
    }
}