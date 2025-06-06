package ch.sbb.compose_mds.composables.loadingIndicator

import SBBTheme
import androidx.compose.animation.core.AnimationConstants
import androidx.compose.animation.core.InfiniteRepeatableSpec
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateValue
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import ch.sbb.compose_mds.theme.SBBColors

object SBBLoadingIndicator {

    /***
     * Implementation of the small SBB Loading Indicator.
     *
     * @param modifier Modifier to be applied to the loading indicator.
     * @param color The base color of the squares in the loading indicator.
     *
     * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/loading-indicator/)
     */
    @Composable
    fun Small(
        modifier: Modifier = Modifier,
        color: Color = SBBColors.red,
    ) {
        SBBLoadingIndicator(
            modifier = modifier,
            color = color,
            width = 20.dp,
            height = 12.5.dp,
            offsetY = 6.25.dp,
            rotationY = 70f,
            cameraDistance = 4f,
            windowPadding = 4.dp
        )
    }

    /***
     * Implementation of the default SBB Loading Indicator.
     *
     * @param modifier Modifier to be applied to the loading indicator.
     * @param color The base color of the squares in the loading indicator.
     *
     * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/loading-indicator/)
     */
    @Composable
    fun Default(
        modifier: Modifier = Modifier,
        color: Color = SBBColors.red,
    ) {
        SBBLoadingIndicator(modifier = modifier, color = color)
    }
}


@Composable
private fun SBBLoadingIndicator(
    modifier: Modifier = Modifier,
    width: Dp = 32.dp,
    height: Dp = 20.dp,
    windowPadding: Dp = 5.dp,
    color: Color = SBBColors.red,
    offsetY: Dp = 10.dp,
    cameraDistance: Float = 4f,
    rotationY: Float = 70f,
) {
    val colorF = { alpha: Float -> color.copy(alpha = alpha) }
    val t = rememberInfiniteTransition(label = "loadingTransition")
    val square1 by t.animateFloat(.5f, 0f, spec(), label = "window1")
    val square2 by t.animateFloat(1f, .5f, spec(), label = "window2")
    val square3 by t.animateFloat(.5f, 1f, spec(), label = "window3")
    val square4 by t.animateFloat(.25f, .5f, spec(), label = "window4")
    val square5 by t.animateFloat(0f, .25f, spec(), label = "window5")
    val offset by t.animateValue(
        initialValue = Offset(.2f, 0f),
        targetValue = Offset(0f, 0f),
        typeConverter = Offset.VectorConverter,
        animationSpec = spec(),
        label = "movement",
    )

    Row(
        modifier = modifier
            .height(height + offsetY * 2)
            .graphicsLayer(
                cameraDistance = cameraDistance,
                rotationY = rotationY,
            )
            .offset(offset.x * width * 5, offsetY),
    ) {
        Box(
            modifier = Modifier
                .width(width)
                .height(height)
                .padding(end = windowPadding)
                .background(colorF(square1)),
        )
        Box(
            modifier = Modifier
                .width(width)
                .height(height)
                .padding(end = windowPadding.times(0.9f))
                .background(colorF(square2)),
        )
        Box(
            modifier = Modifier
                .width(width)
                .height(height)
                .padding(end = windowPadding.times(0.8f))
                .background(colorF(square3)),
        )
        Box(
            modifier = Modifier
                .width(width)
                .height(height)
                .padding(end = windowPadding.times(0.7f))
                .background(colorF(square4)),
        )
        Box(
            modifier = Modifier
                .width(width)
                .height(height)
                .background(colorF(square5)),
        )
    }
}

fun <T> spec(): InfiniteRepeatableSpec<T> = infiniteRepeatable(
    animation = tween(AnimationConstants.DefaultDurationMillis, easing = LinearEasing)
)

@Preview
@Composable
private fun Preview_SBBLoadingIndicatorSmall() {
    SBBTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            SBBLoadingIndicator.Small(modifier = Modifier.align(Alignment.Center))
            Canvas(modifier = Modifier.fillMaxSize()) {
                val offsetX = Offset(100f, 0f)
                val offsetY = Offset(0f, 100f)
                drawLine(SBBColors.green, size.center - offsetX, size.center + offsetX, 4f)
                drawLine(SBBColors.green, size.center - offsetY, size.center + offsetY, 4f)
            }
        }
    }
}

@Preview
@Composable
private fun Preview_SBBLoadingIndicatorDefault() {
    SBBTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            SBBLoadingIndicator.Default(modifier = Modifier.align(Alignment.Center))
            Canvas(modifier = Modifier.fillMaxSize()) {
                val offsetX = Offset(100f, 0f)
                val offsetY = Offset(0f, 100f)
                drawLine(SBBColors.green, size.center - offsetX, size.center + offsetX, 4f)
                drawLine(SBBColors.green, size.center - offsetY, size.center + offsetY, 4f)
            }
        }
    }
}

