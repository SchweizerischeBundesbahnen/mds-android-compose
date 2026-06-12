package ch.sbb.compose_mds.example.pages

import ch.sbb.compose_mds.theme.SBBTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.composables.listItem.SBBListHeader
import ch.sbb.compose_mds.composables.status.Alert
import ch.sbb.compose_mds.composables.status.Information
import ch.sbb.compose_mds.composables.status.SBBStatus
import ch.sbb.compose_mds.composables.status.Success
import ch.sbb.compose_mds.composables.status.Warning
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.defaultPadding

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun StatusPage() {
  Column(
      modifier =
          Modifier.defaultPadding()
              .fillMaxWidth()
              .verticalScroll(
                  state = rememberScrollState(),
              ),
      verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall),
  ) {
    SBBListHeader(title = "Success")
    SBBStatus.Success()
    SBBStatus.Success(text = "Success with Text")

    SBBListHeader(title = "Alert")
    SBBStatus.Alert()
    SBBStatus.Alert(text = "Alert with Text")

    SBBListHeader(title = "Warning")
    SBBStatus.Warning()
    SBBStatus.Warning(text = "Warning with Text")

    SBBListHeader(title = "Information")
    SBBStatus.Information()
    SBBStatus.Information(text = "Information with Text")
  }
}

@PreviewLightDark
@Composable
fun Preview_StatusPage() {
  SBBTheme(includeSurface = true) {
    StatusPage()
  }
}
