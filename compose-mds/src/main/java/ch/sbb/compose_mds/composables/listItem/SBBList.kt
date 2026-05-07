package ch.sbb.compose_mds.composables.listItem

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.SubcomposeLayout
import ch.sbb.compose_mds.composables.container.SBBContentBox

object SBBList {
    @Composable
    fun Wrap(
        modifier: Modifier = Modifier,
        divider: @Composable () -> Unit = { HorizontalDivider() },
        content: @Composable () -> Unit,
    ) {
        SBBContentBox(contentPadding = PaddingValues.Zero) {
            DividedColumn(
                modifier = modifier,
                divider = divider,
                content = content,
            )
        }
    }

    @Composable
    fun DividedColumn(
        modifier: Modifier = Modifier,
        divider: @Composable () -> Unit = { HorizontalDivider() },
        content: @Composable () -> Unit,
    ) {
        SubcomposeLayout(modifier = modifier) { constraints ->
            // Subcompose the whole content — returns a list of measurables (one per direct child)
            val childMeasurables = subcompose("content", content)

            // Measure each child with the given constraints (you can adapt constraints if needed)
            val childPlaceables = childMeasurables.map { it.measure(constraints) }

            // Prepare measurables for dividers (one less than children)
            val dividerMeasurables =
                if (childPlaceables.size > 1) {
                    List(childPlaceables.size - 1) { index ->
                        // each divider is its own subcompose call (slot key keeps them distinct)
                        subcompose("divider#$index") { divider() }.first().measure(constraints)
                    }
                } else {
                    emptyList()
                }

            // Compute column size
            val width =
                (childPlaceables + dividerMeasurables).maxOfOrNull { it.width }
                    ?: constraints.minWidth
            var height = 0
            childPlaceables.forEachIndexed { i, p ->
                height += p.height
                if (i < dividerMeasurables.size) height += dividerMeasurables[i].height
            }
            val layoutWidth = width.coerceIn(constraints.minWidth, constraints.maxWidth)
            val layoutHeight = height.coerceIn(constraints.minHeight, constraints.maxHeight)

            layout(layoutWidth, layoutHeight) {
                var y = 0
                childPlaceables.forEachIndexed { i, p ->
                    p.placeRelative(0, y)
                    y += p.height
                    if (i < dividerMeasurables.size) {
                        val d = dividerMeasurables[i]
                        // place divider full width if it measured that way; otherwise left-aligned
                        d.placeRelative(0, y)
                        y += d.height
                    }
                }
            }
        }
    }
}
