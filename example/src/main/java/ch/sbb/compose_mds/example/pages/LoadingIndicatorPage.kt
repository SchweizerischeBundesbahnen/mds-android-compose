package ch.sbb.compose_mds.example.pages

import ch.sbb.compose_mds.theme.SBBTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.composables.listItem.SBBListHeader
import ch.sbb.compose_mds.composables.loadingIndicator.SBBLoadingIndicator
import ch.sbb.compose_mds.theme.defaultPadding

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun LoadingIndicatorPage() {
  Column(
      Modifier.fillMaxWidth().defaultPadding(),
  ) {
    SBBListHeader(title = "Small")
    SBBLoadingIndicator.Small()
    SBBListHeader(title = "Default")
    SBBLoadingIndicator.Default()
  }
}

// private as loading indicator can't reliably be golden tested
@PreviewLightDark
@Composable
private fun LoadingIndicatorPagePreview() {
  SBBTheme(includeSurface = true) {
    LoadingIndicatorPage()
  }
}
