package ch.sbb.compose_mds.example.pages

import ch.sbb.compose_mds.theme.SBBTheme
import android.content.Context
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
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.composables.listItem.SBBListHeader
import ch.sbb.compose_mds.composables.segmentedButton.SBBButtonSegment
import ch.sbb.compose_mds.composables.segmentedButton.SBBSegmentedButton
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.ArrowLongRightSmall
import ch.sbb.compose_mds.sbbicons.small.ArrowsLongRightLeftSmall
import ch.sbb.compose_mds.sbbicons.small.UnicornSmall
import ch.sbb.compose_mds.theme.defaultPadding

@Composable
fun SegmentedButtonPage() {
  val context = LocalContext.current

  Column(
      modifier =
          Modifier.defaultPadding()
              .fillMaxWidth()
              .verticalScroll(
                  state = rememberScrollState(),
              ),
      verticalArrangement = Arrangement.spacedBy(8.dp),
  ) {
    // DEFAULT
    SBBListHeader(title = "Default")

    // Default with three segments
    var defaultSelection1: String by remember { mutableStateOf("Selection 1") }
    SBBSegmentedButton.Default(
        onSelectionChange = { selected ->
          defaultSelection1 = selected
          toastSelection(context, selected)
        },
        selection = defaultSelection1,
        segments = threeButtonSegments(),
    )

    // Default with two segments
    var defaultSelection2: String by remember { mutableStateOf("Selection 1") }
    SBBSegmentedButton.Default(
        onSelectionChange = { selected ->
          defaultSelection2 = selected
          toastSelection(context, selected)
        },
        selection = defaultSelection2,
        segments = twoButtonSegments(),
    )
      
    // PRIMARY
    SBBListHeader(title = "Primary")

    // Primary with three segments
    var primarySelection1: String by remember { mutableStateOf("Selection 1") }
    SBBSegmentedButton.Primary(
        onSelectionChange = { selected ->
          primarySelection1 = selected
          toastSelection(context, selected)
        },
        selection = primarySelection1,
        segments = threeButtonSegments(),
    )

    // Primary with two segments
    var primarySelection2: String by remember { mutableStateOf("Selection 1") }
    SBBSegmentedButton.Primary(
        onSelectionChange = { selected ->
            primarySelection2 = selected
          toastSelection(context, selected)
        },
        selection = primarySelection2,
        segments = twoButtonSegments(),
    )
  }
}

private fun threeButtonSegments() =
    listOf(
        SBBButtonSegment(
            label = "Label 1",
            value = "Selection 1",
            icon = SBBIcons.Small.ArrowLongRightSmall,
        ),
        SBBButtonSegment(
            label = "Label 2",
            value = "Selection 2",
            icon = SBBIcons.Small.ArrowsLongRightLeftSmall,
        ),
        SBBButtonSegment(
            label = "Label 3",
            value = "Selection 3",
            icon = SBBIcons.Small.UnicornSmall,
        ),
    )

private fun twoButtonSegments() =
    listOf(
        SBBButtonSegment(
            label = "Label 1",
            value = "Selection 1",
            icon = SBBIcons.Small.ArrowLongRightSmall,
        ),
        SBBButtonSegment(
            label = "Label 2",
            value = "Selection 2",
            icon = SBBIcons.Small.ArrowsLongRightLeftSmall,
        ),
    )

private fun toastSelection(
    context: Context,
    selection: String,
) {
  Toast.makeText(
          context,
          "Selection changed: $selection",
          Toast.LENGTH_SHORT,
      )
      .show()
}

@PreviewLightDark
@Composable
fun Preview_SegmentedButtonPage() {
  SBBTheme(includeSurface = true) {
    SegmentedButtonPage()
  }
}
