package ch.sbb.compose_mds.example.pages

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.composables.header.Default
import ch.sbb.compose_mds.composables.header.NavigationType
import ch.sbb.compose_mds.composables.header.SBBHeader
import ch.sbb.compose_mds.composables.header.Small

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun HeaderPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(
                state = rememberScrollState(),
            )
            .padding(
                vertical = 16.dp,
            )
    ) {
        SBBListHeader(text = "Default")
        SBBHeader.Default(title = "SBB Header Default", navController = rememberNavController())
        SBBListHeader(text = "Default mit Zurück-Button")
        SBBHeader.Default(title = "SBB Header Default", navController = rememberNavController(), navigationType = NavigationType.Back)
        SBBListHeader(text = "Default mit Abbrechen-Button")
        SBBHeader.Default(title = "SBB Header Default", navController = rememberNavController(), navigationType = NavigationType.Cancel)
        Spacer(modifier = Modifier.padding(vertical = 20.dp))

        SBBListHeader(text = "Small")
        SBBHeader.Small(title = "SBB Header Small", navController = rememberNavController())
        SBBListHeader(text = "Default mit Zurück-Button")
        SBBHeader.Small(title = "SBB Header Small", navController = rememberNavController(), navigationType = NavigationType.Back)
        SBBListHeader(text = "Default mit Abbrechen-Button")
        SBBHeader.Small(title = "SBB Header Small", navController = rememberNavController(), navigationType = NavigationType.Cancel)
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HeaderPagePreview() {
    HeaderPage()
}