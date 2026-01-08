package ch.sbb.compose_mds.example.pages

import SBBTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SheetState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.composables.bottomSheet.SBBBottomSheet
import ch.sbb.compose_mds.composables.button.SBBSecondaryButton
import ch.sbb.compose_mds.example.composeable.Placeholder
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.defaultPadding


@OptIn(ExperimentalMaterial3Api::class, ExperimentalSBBComponent::class)
@Composable
fun BottomSheetPage() {
    var showBottomSheet by remember { mutableStateOf(false) }
    var showBottomSheetScroll by remember { mutableStateOf(false) }
    var showFullScreenBottomSheet by remember { mutableStateOf(false) }

    Column(modifier = Modifier.defaultPadding()) {
        SBBListHeader(text = "Bottom-Sheet")
        SBBSecondaryButton(
            label = "Default",
            modifier = Modifier.fillMaxWidth(),
            onClick = { showBottomSheet = true }
        )
        Spacer(Modifier.height(SBBSpacing.Small))
        SBBSecondaryButton(
            label = "Scrollable content",
            modifier = Modifier.fillMaxWidth(),
            onClick = { showBottomSheetScroll = true }
        )
        Spacer(Modifier.height(SBBSpacing.Small))
        SBBSecondaryButton(
            label = "FullScreen",
            modifier = Modifier.fillMaxWidth(),
            onClick = { showFullScreenBottomSheet = true }
        )
    }

    if (showBottomSheet) {
        DefaultBottomSheet(
            onDismiss = { showBottomSheet = false },
        )
    }

    if (showBottomSheetScroll) {
        ScrollableBottomSheet(
            onDismiss = { showBottomSheetScroll = false },
        )
    }

    if (showFullScreenBottomSheet) {
        FullScreenBottomSheet(
            onDismiss = { showFullScreenBottomSheet = false }
        )
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun DefaultBottomSheet(
    onDismiss: () -> Unit,
    sheetState: SheetState = rememberModalBottomSheetState()
) {
    SBBBottomSheet(
        onDismissRequest = onDismiss,
        sheetState = sheetState,
        title = "Default"
    ) {
        Placeholder(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
        )
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun ScrollableBottomSheet(
    onDismiss: () -> Unit,
    sheetState: SheetState = rememberModalBottomSheetState()
) {
    SBBBottomSheet(
        onDismissRequest = onDismiss,
        sheetState = sheetState,
        title = "Scrollable content"
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxWidth()
        ) {
            items(100) {
                Placeholder(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp)
                        .height(56.dp)
                )
            }
        }
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun FullScreenBottomSheet(
    onDismiss: () -> Unit,
    sheetState: SheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
) {
    SBBBottomSheet(
        onDismissRequest = onDismiss,
        sheetState = sheetState,
        title = "FullScreen"
    ) {
        Placeholder(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        )
    }
}

// Previews are private to hide from golden files as it generates empty images

@OptIn(ExperimentalMaterial3Api::class)
@PreviewLightDark
@Composable
private fun Preview_DefaultBottomBottomSheet() {
    SBBTheme(includeSurface = true) {
        DefaultBottomSheet(onDismiss = {})
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@PreviewLightDark
@Composable
private fun Preview_ScrollableBottomSheet() {
    SBBTheme(includeSurface = true) {
        ScrollableBottomSheet(onDismiss = {})
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@PreviewLightDark
@Composable
private fun Preview_FullScreenBottomSheet() {
    SBBTheme(includeSurface = true) {
        FullScreenBottomSheet(onDismiss = {})
    }
}
