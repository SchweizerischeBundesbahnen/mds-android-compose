package ch.sbb.compose_mds.composables.bottomSheet

import SBBTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalBottomSheetProperties
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.composables.button.SBBTertiaryButton
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.CrossSmall
import ch.sbb.compose_mds.theme.PrimitiveColors
import ch.sbb.compose_mds.theme.SBBSpacing
import kotlinx.coroutines.launch

/**
 * Implementation of the SBB Bottom-Sheet.
 *
 * @param onDismissRequest Callback invoked when the sheet is dismissed. Callers should close the underlying UI or update state accordingly.
 * @param sheetState The ModalBottomSheet state used to control visibility and animation (e.g. rememberModalBottomSheetState()).
 * @param title Title text shown in the sheet header.
 * @param showCloseButton Whether to show the header close button. Defaults to true.
 * @param isClosable Whether the sheet can be dismissed by gestures (drag, outside tap, back press) and the close button. Defaults to true.
 * @param content Content of the sheet
 *
 * Use rememberModalBottomSheetState(skipPartiallyExpanded = true) for full-screen mode
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/bottom-sheet/)
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SBBBottomSheet(
    onDismissRequest: () -> Unit,
    sheetState: SheetState,
    title: String,
    showCloseButton: Boolean = true,
    isClosable: Boolean = true,
    content: @Composable (ColumnScope.() -> Unit),
) {
    val scope = rememberCoroutineScope()

    ModalBottomSheet(
        modifier = Modifier.statusBarsPadding(),
        onDismissRequest = onDismissRequest,
        sheetState = sheetState,
        containerColor = if (SBBTheme.isDarkMode) PrimitiveColors.midnight else PrimitiveColors.milk,
        shape = RoundedCornerShape(topStart = SBBSpacing.Medium, topEnd = SBBSpacing.Medium),
        dragHandle = null,
        sheetGesturesEnabled = isClosable,
        properties = ModalBottomSheetProperties(
            shouldDismissOnClickOutside = isClosable,
            shouldDismissOnBackPress = isClosable
        )
    ) {
        Column(
            modifier = Modifier
                .navigationBarsPadding()
                .padding(vertical = SBBSpacing.Small, horizontal = SBBSpacing.Medium)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .defaultMinSize(minHeight = 56.dp)
                    .padding(bottom = SBBSpacing.Small),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    title,
                    style = SBBTheme.sbbTypography.largeLight,
                )
                if (showCloseButton && isClosable) {
                    SBBTertiaryButton(icon = SBBIcons.Small.CrossSmall) {
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