package ch.sbb.compose_mds.example.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
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
import ch.sbb.compose_mds.composables.checkbox.SBBCheckbox
import ch.sbb.compose_mds.icons.AppIconSmall
import ch.sbb.compose_mds.icons.SBBIcons
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

@Composable
fun CheckboxPage() {
    Column(
        modifier =
            Modifier
                .verticalScroll(
                    state = rememberScrollState(),
                )
                .padding(SBBSpacing.XSmall),
    ) {
        Text("Checkbox")
        var checkedState: Boolean? by remember { mutableStateOf(false) }
        SBBCheckbox(
            label = "Check me!",
            checked = checkedState,
            onCheckedChange = { checkedState = it },
        )

        Text("Checkbox with Icon", modifier = Modifier.padding(top = SBBSpacing.XSmall))
        var checkedState2: Boolean? by remember { mutableStateOf(true) }
        SBBCheckbox(
            label = "Check me!",
            checked = checkedState2,
            icon = SBBIcons.AppIconSmall,
            onCheckedChange = { checkedState2 = it },
        )

        Text("Tristate Checkbox", modifier = Modifier.padding(top = SBBSpacing.XSmall))
        var checkedState3: Boolean? by remember { mutableStateOf(null) }
        SBBCheckbox(
            label = "Tri me!",
            triStateEnabled = true,
            checked = checkedState3,
            onCheckedChange = { checkedState3 = it },
        )

        Text("Disabled Checkbox", modifier = Modifier.padding(top = SBBSpacing.XSmall))
        SBBCheckbox(
            label = "Im Disabled",
            triStateEnabled = true,
            checked = checkedState3,
            disabled = true,
            onCheckedChange = { checkedState3 = it },
        )
    }
}

@PreviewLightDark
@Composable
fun Preview_CheckboxPage() {
    SBBTheme(includeSurface = true) {
        CheckboxPage()
    }
}
