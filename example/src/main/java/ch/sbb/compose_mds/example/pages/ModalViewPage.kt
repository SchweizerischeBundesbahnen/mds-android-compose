package ch.sbb.compose_mds.example.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.composables.button.SBBSecondaryButton
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.beta.modal.SBBModalView
import ch.sbb.compose_mds.example.composeable.Placeholder
import ch.sbb.compose_mds.theme.defaultPadding


@OptIn(ExperimentalMaterial3Api::class, ExperimentalSBBComponent::class)
@Composable
fun ModalViewPage() {
    val sheetState = rememberModalBottomSheetState()
    var showBottomSheet by remember { mutableStateOf(false) }

    Column(modifier = Modifier.defaultPadding()) {
        SBBListHeader(text = "ModalView")
        SBBSecondaryButton(
            label = "Show",
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 8.dp),
            onClick = { showBottomSheet = true }
        )
    }

    if (showBottomSheet) {
        SBBModalView(
            onDismissRequest = { showBottomSheet = false },
            sheetState = sheetState,
            title = "Title",
            showCloseButton = true,
        ) {
            Placeholder(
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
            )
        }
    }
}
