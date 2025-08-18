package ch.sbb.compose_mds.beta.modal

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.button.SBBTertiaryButton
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.CrossSmall
import ch.sbb.compose_mds.theme.PrimitiveColors
import kotlinx.coroutines.launch

/**
 * SBB style modal view.
 *
 * See: https://digital.sbb.ch/de/design-system/mobile/components/modal-view
 */
@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalSBBComponent
@Composable
fun SBBModalView(
    onDismissRequest: () -> Unit,
    sheetState: SheetState,
    showCloseButton: Boolean,
    title: String,
    content: @Composable (ColumnScope.() -> Unit),
) {
    val scope = rememberCoroutineScope()

    ModalBottomSheet(
        onDismissRequest = onDismissRequest,
        sheetState = sheetState,
        containerColor = if (isSystemInDarkTheme()) PrimitiveColors.midnight else PrimitiveColors.milk,
        shape = RoundedCornerShape(16.dp),
        dragHandle = null,
    ) {
        Column(
            modifier = Modifier.padding(
                start = 16.dp,
                top = 16.dp,
                end = 16.dp,
                bottom = 34.dp,
            )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    title,
                    style = MaterialTheme.typography.titleLarge,
                )
                if (showCloseButton) {
                    // TODO: Only small icons supported
                    SBBTertiaryButton(
                        icon = SBBIcons.Small.CrossSmall,
                    ) {
                        scope.launch { sheetState.hide() }.invokeOnCompletion {
                            if (!sheetState.isVisible) {
                                onDismissRequest()
                            }
                        }
                    }
                }
            }
            content()
        }
    }
}