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

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun LoadingIndicatorPage() {
    Column(Modifier.fillMaxWidth()) {
        SBBListHeader(text = "Small")
        SBBLoadingIndicator.Small()
        SBBListHeader(text = "Default")
        SBBLoadingIndicator.Default()
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun LoadingIndicatorPagePreview() {
    SBBTheme {
        LoadingIndicatorPage()
    }
}