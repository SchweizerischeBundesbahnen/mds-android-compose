package ch.sbb.compose_mds.composables.picker

import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import ch.sbb.compose_mds.theme.SBBTheme
import kotlin.math.abs
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.mapNotNull

/**
 * The [SBBPickerWheel] is the implementation of the Picker described in [SBB Design System Mobile](https://digital.sbb.ch/en/design-system/mobile/components/picker/).
 *
 * @param items All items.
 * @param textSelector Label of an item.
 * @param infinite Whether the wheel will spin infinitely.
 * @param onSelectionChange Callback when the selected element has changed.
 * @param modifier The modifier to be applied to the layout.
 * @param currentItem The selected item.
 * @param style Overrideable [SBBPickerStyle]. Default is the defined style in [SBBTheme].
 * @param textAlign The alignemnt of the text.
 */
@Composable
fun <T> SBBPickerWheel(
    items: List<T>,
    textSelector: (T) -> String,
    infinite: Boolean,
    onSelectionChange: (T) -> Unit,
    modifier: Modifier = Modifier,
    currentItem: T = items.first(),
    style: SBBPickerStyle = SBBTheme.picker,
    textAlign: TextAlign = TextAlign.Center,
) {
    val colors by style.resolvedColors()

    val itemCount = items.size
    val selectedIndex = items.indexOf(currentItem).takeIf { it >= 0 } ?: 0
    val virtualCount = if (infinite) Int.MAX_VALUE else itemCount

    val selectedVirtualIndex =
        remember(items, currentItem, infinite) {
            if (infinite) {
                val middle = Int.MAX_VALUE / 2
                middle - middle % itemCount + selectedIndex
            } else {
                selectedIndex
            }
        }

    val listState =
        rememberLazyListState(
            initialFirstVisibleItemIndex = selectedVirtualIndex,
        )

    val flingBehavior =
        rememberSnapFlingBehavior(
            lazyListState = listState,
            snapPosition = SnapPosition.Center,
        )

    val onSelectionChangeState by rememberUpdatedState(onSelectionChange)

    val centeredVirtualIndex by remember {
        derivedStateOf {
            listState.centeredItemIndex() ?: selectedVirtualIndex
        }
    }

    LaunchedEffect(listState, itemCount, items) {
        snapshotFlow {
            listState.isScrollInProgress to listState.centeredItemIndex()
        }.filter { (scrollInProgress, centeredIndex) ->
            !scrollInProgress && centeredIndex != null
        }.mapNotNull { (_, centeredIndex) ->
            centeredIndex?.let { virtualIndex ->
                virtualIndex % itemCount
            }
        }.distinctUntilChanged()
            .collect { realIndex ->
                onSelectionChangeState(items[realIndex])
            }
    }

    LaunchedEffect(currentItem, items, infinite) {
        if (items.isEmpty()) return@LaunchedEffect

        val targetRealIndex = items.indexOf(currentItem).takeIf { it >= 0 } ?: 0

        val targetIndex =
            if (infinite) {
                val currentVirtualIndex =
                    listState.centeredItemIndex() ?: listState.firstVisibleItemIndex

                nearestVirtualIndex(
                    currentVirtualIndex = currentVirtualIndex,
                    targetRealIndex = targetRealIndex,
                    itemCount = items.size,
                )
            } else {
                targetRealIndex
            }

        listState.scrollToItem(targetIndex)
    }

    LazyColumn(
        modifier = modifier,
        state = listState,
        flingBehavior = flingBehavior,
        contentPadding =
            PaddingValues(
                vertical = style.itemSizes.padding,
            ),
    ) {
        items(
            count = virtualCount,
            key = { index -> index },
        ) { virtualIndex ->
            val realIndex = virtualIndex % itemCount
            val item = items[realIndex]

            val distanceFromCenter = virtualIndex - centeredVirtualIndex
            val itemHeight = style.itemSizes.height(distanceFromCenter)
            val textColor = colors.pickerItem(distanceFromCenter)

            Box(
                modifier =
                    Modifier
                        .padding(horizontal = style.layout.horizontalPadding)
                        .fillMaxWidth()
                        .height(itemHeight),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = textSelector(item),
                    style = style.layout.textStyle,
                    color = textColor,
                    textAlign = textAlign,
                )
            }
        }
    }
}

/**
 * Measurement of the label shown in the [SBBPickerWheel].
 *
 * @param label The label to be measured.
 * @param textStyle The style. Default is [textStyle] defined in [SBBPickerStyle.layout].
 * @param horizontalPadding The additional padding surrounding the label.
 */
@Composable
fun rememberLabelWheelWidth(
    label: String,
    textStyle: TextStyle = SBBTheme.picker.layout.textStyle,
    horizontalPadding: Dp = SBBTheme.picker.layout.horizontalPadding,
) = rememberWheelWidth(
    items = listOf(label),
    textSelector = { it },
    textStyle = textStyle,
    horizontalPadding = horizontalPadding,
)

/**
 * Measurement of the label shown in the [SBBPickerWheel].
 *
 * @param items Items to be measured. The longest will be used.
 * @param textSelector Label of an item.
 * @param textStyle The style. Default is [textStyle] defined in [SBBPickerStyle.layout].
 * @param horizontalPadding The additional padding surrounding the label.
 */
@Composable
fun <T> rememberWheelWidth(
    items: List<T>,
    textSelector: (T) -> String,
    textStyle: TextStyle = SBBTheme.picker.layout.textStyle,
    horizontalPadding: Dp = SBBTheme.picker.layout.horizontalPadding,
): Dp {
    val textMeasurer = rememberTextMeasurer()
    val density = LocalDensity.current

    val labels =
        remember(items, textSelector) {
            items.map(textSelector)
        }

    return remember(labels, textStyle, horizontalPadding, density) {
        val maxTextWidthPx =
            labels.maxOfOrNull { label ->
                textMeasurer
                    .measure(
                        text = AnnotatedString(label),
                        style = textStyle,
                    ).size.width
            } ?: 0

        with(density) {
            maxTextWidthPx.toDp() + horizontalPadding * 2
        }
    }
}

private fun LazyListState.centeredItemIndex(): Int? {
    val layoutInfo = layoutInfo
    val visibleItems = layoutInfo.visibleItemsInfo

    if (visibleItems.isEmpty()) return null

    val viewportCenter = (layoutInfo.viewportStartOffset + layoutInfo.viewportEndOffset) / 2

    return visibleItems
        .minByOrNull { item ->
            val itemCenter = item.offset + item.size / 2
            abs(itemCenter - viewportCenter)
        }?.index
}

private fun nearestVirtualIndex(
    currentVirtualIndex: Int,
    targetRealIndex: Int,
    itemCount: Int,
): Int {
    val currentRealIndex = Math.floorMod(currentVirtualIndex, itemCount)

    val base = currentVirtualIndex - currentRealIndex + targetRealIndex

    return listOf(
        base - itemCount,
        base,
        base + itemCount,
    ).filter { it >= 0 }.minBy { abs(it - currentVirtualIndex) }
}
