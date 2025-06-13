package ch.sbb.compose_mds.composables.tabBar

import android.content.res.Configuration
import android.graphics.BlurMaskFilter
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.asAndroidPath
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.semantics.CollectionInfo
import androidx.compose.ui.semantics.collectionInfo
import androidx.compose.ui.semantics.hideFromAccessibility
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

/***
 * Implementation of the SBB Tab Bar.
 *
 * @param modifier Use the modifier for edge-to-edge apps with [Modifier.windowInsetsPadding(WindowInsets.navigationBars)].
 * @param controller The [SBBTabBarController]
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/tabbar/)
 */
@Composable
fun SBBTabBar(
    modifier: Modifier = Modifier,
    controller: SBBTabBarController,
) {
    val configuration = LocalConfiguration.current
    val portrait = configuration.orientation == Configuration.ORIENTATION_PORTRAIT
    val textPosition by controller.animatedTextPosition()
    val animationSpec = controller.animationSpec()
    val peekCoroutine = rememberCoroutineScope()
    val pathColor = MaterialTheme.colorScheme.surfaceVariant

    Column(
        modifier = Modifier
            .drawBehind {
                drawIntoCanvas { canvas ->
                    val path by controller.path(size)
                    val shadowPaint = Paint().asFrameworkPaint().apply {
                        isAntiAlias = true
                        maskFilter = BlurMaskFilter(6f, BlurMaskFilter.Blur.NORMAL)
                        style = android.graphics.Paint.Style.STROKE
                        strokeWidth = 1f
                    }
                    canvas.nativeCanvas.save()
                    canvas.nativeCanvas.translate(0f, 0f)
                    canvas.nativeCanvas.drawPath(path.asAndroidPath(), shadowPaint)
                    canvas.nativeCanvas.restore()

                    drawPath(path = path, color = pathColor)
                }
            }
            .then(modifier),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = if (portrait) 8.dp else 2.dp)
                .selectableGroup()
                .semantics {
                    collectionInfo = CollectionInfo(
                        rowCount = 1,
                        columnCount = controller.items.size,
                    )
                },
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.Top,
        ) {
            controller.items.mapIndexed { i, data ->
                SBBTabBarItem(
                    data = data,
                    state = controller.getStateAt(i),
                    warningSemantics = controller.warningSemanticsAt(i),
                    onPositioned = {
                        controller.positions[i] = it
                    },
                    onPress = {
                        peekCoroutine.launch {
                            controller.onPeek(i, animationSpec)
                        }
                        if (tryAwaitRelease()) {
                            controller.onSelecting(i, animationSpec)
                        } else {
                            controller.onCancelPeek(animationSpec)
                        }
                    },
                )
            }
        }
        if (portrait) {
            val selectedItem by controller.selectedItem
            Text(
                modifier = Modifier
                    .onSizeChanged { controller.textSize.value = it }
                    .offset { textPosition }
                    .semantics { hideFromAccessibility() },
                text = selectedItem.label,
                style = MaterialTheme.typography.bodyMedium,
            )
        }
    }
}
