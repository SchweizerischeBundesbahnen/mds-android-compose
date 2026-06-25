package ch.sbb.compose_mds.composables.listItem

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.SubcomposeLayout
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.theme.SBBTheme

object SBBList {
    /**
     * Wraps children in a content box and renders them as a divided column.
     *
     * This is the recommended container when you want a list-like grouping with dividers
     * between direct children. The provided [divider] composable is used between each direct
     * child of [content].
     *
     * @param modifier Modifier applied to the outer layout.
     * @param divider A composable used to draw the divider between items. Defaults to
     *        [HorizontalDivider].
     * @param content Slot for the list children — each direct child becomes an item in the
     *        divided column.
     */
    @Composable
    fun Wrap(
        modifier: Modifier = Modifier,
        divider: @Composable () -> Unit = {
            val colors by SBBTheme.listItem.resolvedColors()
            HorizontalDivider(color = colors.line)
        },
        content: @Composable () -> Unit,
    ) {
        val colors by SBBTheme.listItem.resolvedColors()
        SBBContentBox(contentPadding = PaddingValues.Zero, backgroundColor = colors.background) {
            DividedColumn(
                modifier = modifier,
                divider = divider,
                content = content,
            )
        }
    }

    /**
     * Layout that measures all direct children and inserts a divider between them.
     *
     * Implementation notes: this uses [SubcomposeLayout] to first subcompose and measure
     * all children, then measures one divider per gap and lays out children and dividers
     * in a vertical column. The resulting layout width is the maximum measured width of all
     * children and dividers; heights are summed including divider heights.
     *
     * @param modifier Modifier applied to the SubcomposeLayout.
     * @param divider Composable used to create the divider between items.
     * @param content Slot containing the direct children to be laid out with dividers.
     */
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
