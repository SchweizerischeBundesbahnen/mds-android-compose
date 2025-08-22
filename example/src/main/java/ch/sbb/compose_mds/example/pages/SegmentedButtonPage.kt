package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.Context
import android.content.res.Configuration
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.composables.segmentedButton.SBBButtonSegment
import ch.sbb.compose_mds.composables.segmentedButton.SBBSegmentedButton
import ch.sbb.compose_mds.theme.defaultPadding

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun SegmentedButtonPage() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .defaultPadding()
            .fillMaxWidth()
            .verticalScroll(
                state = rememberScrollState(),
            ),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        // DEFAULT
        SBBListHeader(text = "Default")

        // Default with three segments
        var defaultSelection1: String by remember { mutableStateOf("Selection 1") }
        SBBSegmentedButton(
            onSelectionChanged = { selected ->
                defaultSelection1 = selected
                toastSelection(context, selected)
            },
            selection = defaultSelection1,
            segments = threeButtonSegments()
        )

        // Default with two segments
        var defaultSelection2: String by remember { mutableStateOf("Selection 1") }
        SBBSegmentedButton(
            onSelectionChanged = { selected ->
                defaultSelection2 = selected
                toastSelection(context, selected)
            },
            selection = defaultSelection2,
            segments = twoButtonSegments()
        )

        // Default with two segments, disabled
        SBBListHeader(text = "Disabled")
        SBBSegmentedButton(
            onSelectionChanged = {},
            selection = "Selection 1",
            segments = twoButtonSegments(),
            enabled = false,
        )
    }
}

@OptIn(ExperimentalSBBComponent::class)
private fun threeButtonSegments() = listOf(
    SBBButtonSegment(
        label = "Label 1",
        value = "Selection 1"
    ),
    SBBButtonSegment(
        label = "Label 2",
        value = "Selection 2"
    ),
    SBBButtonSegment(
        label = "Label 3",
        value = "Selection 3"
    ),
)

@OptIn(ExperimentalSBBComponent::class)
private fun twoButtonSegments() = listOf(
    SBBButtonSegment(
        label = "Label 1",
        value = "Selection 1"
    ),
    SBBButtonSegment(
        label = "Label 2",
        value = "Selection 2"
    ),
)

private fun toastSelection(context: Context, selection: String) {
    Toast.makeText(
        context,
        "Selection changed: $selection",
        Toast.LENGTH_SHORT
    ).show()
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun Preview_SegmentedButtonPage() {
    SBBTheme(includeSurface = true) {
        SegmentedButtonPage()
    }
}