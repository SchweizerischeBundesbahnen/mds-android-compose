package ch.sbb.compose_mds.composables.picker

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.visible
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.theme.PrimitiveColors
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

/**
 * Decoration for a [SBBPickerWheel].
 *
 * @param boxed using surface background color when [false] or surfaceVariant when [true].
 * @param modifier The modifier to be applied to the layout.
 * @param highlightSelected Flag to highlight the selected/centered element.
 * @param style Overrideable [SBBPickerStyle]. Default is the defined style in [SBBTheme].
 * @param content The content of the [SBBPickerWheelContainer].
 */
@Composable
fun SBBPickerWheelContainer(
    boxed: Boolean,
    modifier: Modifier = Modifier,
    highlightSelected: Boolean = true,
    style: SBBPickerStyle = SBBTheme.picker,
    contentPadding: PaddingValues = PaddingValues(horizontal = SBBSpacing.XSmall),
    content: @Composable RowScope.() -> Unit,
) {
    val colors by style.resolvedColors()

    Box(
        modifier = modifier.height(style.itemSizes.pickerHeight).padding(contentPadding),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier =
                Modifier
                    .visible(highlightSelected)
                    .align(Alignment.Center)
                    .fillMaxWidth()
                    .height(style.itemSizes.selected)
                    .clip(style.layout.selectedShape)
                    .background(colors.backgroundSelected),
        )

        Row {
            content()
        }

        Box(
            modifier =
                Modifier
                    .align(Alignment.TopCenter)
                    .fillMaxWidth()
                    .height(style.itemSizes.selected)
                    .background(
                        Brush.verticalGradient(
                            listOf(
                                if (boxed) colors.boxedBackground else colors.background,
                                PrimitiveColors.transparent,
                            ),
                        ),
                    ),
        )

        Box(
            modifier =
                Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .height(style.itemSizes.selected)
                    .background(
                        Brush.verticalGradient(
                            listOf(
                                PrimitiveColors.transparent,
                                if (boxed) colors.boxedBackground else colors.background,
                            ),
                        ),
                    ),
        )
    }
}

@PreviewLightDark
@Composable
private fun Preview_WheelWheelContainerSBBSBB() {
    val list = List(20) { "Item ${it + 1}" }
    val width = rememberWheelWidth(items = list, textSelector = { it })
    SBBTheme {
        SBBPickerWheelContainer(boxed = false) {
            SBBPickerWheel(
                modifier = Modifier.width(width),
                items = list,
                currentItem = list[12],
                textSelector = { it },
                infinite = true,
                onSelectionChange = {},
            )
            SBBPickerWheel(
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.End,
                items = list,
                currentItem = list[9],
                textSelector = { it },
                infinite = true,
                onSelectionChange = {},
            )
            SBBPickerWheel(
                modifier = Modifier.width(width),
                items = list,
                currentItem = list[18],
                textSelector = { it },
                infinite = true,
                onSelectionChange = {},
            )
        }
    }
}
