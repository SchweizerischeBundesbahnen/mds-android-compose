package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.composables.loadingIndicator.SBBLoadingIndicator
import ch.sbb.compose_mds.theme.defaultPadding

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun LoadingIndicatorPage() {
    Column(
        Modifier
            .fillMaxWidth()
            .defaultPadding()
    ) {
        SBBListHeader(text = "Small")
        SBBLoadingIndicator.Small()
        SBBListHeader(text = "Default")
        SBBLoadingIndicator.Default()
    }
}

// private as loading indicator can't reliably be golden tested
@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun LoadingIndicatorPagePreview() {
    SBBTheme(includeSurface = true) {
        LoadingIndicatorPage()
    }
}