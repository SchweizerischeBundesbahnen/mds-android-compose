package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.composables.checkbox.SBBCheckbox
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.AppIconSmall
import ch.sbb.compose_mds.theme.defaultPadding

@Composable
fun CheckboxPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(
                state = rememberScrollState(),
            )
            .defaultPadding(),
    ) {
        Text("Checkbox")
        var checkedState: Boolean? by remember { mutableStateOf(false) }
        SBBCheckbox(
            label = "Check me!",
            checked = checkedState,
            onCheckedChange = { checkedState = it },
        )

        Text("Checkbox with Icon", modifier = Modifier.padding(top = 8.dp))
        var checkedState2: Boolean? by remember { mutableStateOf(true) }
        SBBCheckbox(
            label = "Check me!",
            checked = checkedState2,
            icon = SBBIcons.Small.AppIconSmall,
            onCheckedChange = { checkedState2 = it },
        )

        Text("Tristate Checkbox", modifier = Modifier.padding(top = 8.dp))
        var checkedState3: Boolean? by remember { mutableStateOf(null) }
        SBBCheckbox(
            label = "Tri me!",
            triStateEnabled = true,
            checked = checkedState3,
            onCheckedChange = { checkedState3 = it },
        )

        Text("Disabled Checkbox", modifier = Modifier.padding(top = 8.dp))
        SBBCheckbox(
            label = "Im Disabled",
            triStateEnabled = true,
            checked = checkedState3,
            disabled = true,
            onCheckedChange = { checkedState3 = it },
        )
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun Preview_CheckboxPage() {
    SBBTheme(includeSurface = true) {
        CheckboxPage()
    }
}