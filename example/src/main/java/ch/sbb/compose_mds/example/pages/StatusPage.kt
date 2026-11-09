package ch.sbb.compose_mds.example.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.composables.listItem.SBBListHeader
import ch.sbb.compose_mds.composables.status.Alert
import ch.sbb.compose_mds.composables.status.Information
import ch.sbb.compose_mds.composables.status.SBBStatus
import ch.sbb.compose_mds.composables.status.Success
import ch.sbb.compose_mds.composables.status.Warning
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

@Composable
fun StatusPage() {
    Column(
        modifier = Modifier
            .padding(SBBSpacing.XSmall)
            .fillMaxWidth()
            .verticalScroll(state = rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall),
    ) {
        SBBListHeader(title = "Success")
        SBBStatus.Success()
        SBBStatus.Success(labelText = "Success with Text")

        SBBListHeader(title = "Alert")
        SBBStatus.Alert()
        SBBStatus.Alert(labelText = "Alert with Text")

        SBBListHeader(title = "Warning")
        SBBStatus.Warning()
        SBBStatus.Warning(labelText = "Warning with Text")

        SBBListHeader(title = "Information")
        SBBStatus.Information()
        SBBStatus.Information(labelText = "Information with Text")
    }
}

@PreviewLightDark
@Composable
fun Preview_StatusPage() {
    SBBTheme(includeSurface = true) {
        StatusPage()
    }
}
