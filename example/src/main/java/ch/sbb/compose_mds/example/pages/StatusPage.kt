package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
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
        modifier = Modifier
            .defaultPadding()
            .fillMaxWidth()
            .verticalScroll(
                state = rememberScrollState(),
            ),
        verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)
    ) {
        SBBListHeader(text = "Success")
        SBBStatus.Success()
        SBBStatus.Success(text = "Success with Text")

        SBBListHeader(text = "Alert")
        SBBStatus.Alert()
        SBBStatus.Alert(text = "Alert with Text")

        SBBListHeader(text = "Warning")
        SBBStatus.Warning()
        SBBStatus.Warning(text = "Warning with Text")

        SBBListHeader(text = "Information")
        SBBStatus.Information()
        SBBStatus.Information(text = "Information with Text")
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun Preview_StatusPage() {
    SBBTheme(includeSurface = true) {
        StatusPage()
    }
}