package ch.sbb.compose_mds.composables.checkbox

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.state.ToggleableState
import ch.sbb.compose_mds.theme.SBBTheme
import kotlin.math.min

@Composable
internal fun DrawCheckbox(
    state: ToggleableState,
    disabled: Boolean,
    modifier: Modifier = Modifier,
    style: SBBCheckboxStyle = SBBTheme.checkbox,
) {
    var fromValue by remember { mutableStateOf(state) }
    var toValue by remember { mutableStateOf(state) }
    val progress = remember { Animatable(1f) }

    LaunchedEffect(state) {
        if (toValue != state) {
            fromValue = toValue
            toValue = state
            progress.snapTo(0f)
            progress.animateTo(
                targetValue = 1f,
                animationSpec = tween(durationMillis = 150),
            )
        }
    }

    val layout = style.layout
    val colors by style.resolvedColors(!disabled)
    Canvas(modifier = modifier.size(layout.controlSize)) {
        drawAnyCheckbox(
            layout = layout,
            colors = colors,
            previousValue = fromValue,
            value = toValue,
            transitionProgress = progress.value,
        )
    }
}

private fun DrawScope.drawAnyCheckbox(
    layout: SBBCheckboxLayout,
    colors: SBBCheckboxColors,
    previousValue: ToggleableState,
    value: ToggleableState,
    transitionProgress: Float,
) {
    val borderWidthPx = layout.borderWidth.toPx()
    val borderRadiusPx = layout.radius.toPx()
    val canvasSide = min(size.width, size.height)

    val innerWidth = canvasSide - 2f * borderWidthPx
    val edgeHalf = innerWidth * 0.5f
    val markRadius = CornerRadius(0.02f * innerWidth, 0.02f * innerWidth)

    val origin =
        Offset(
            x = (size.width - innerWidth) / 2f,
            y = (size.height - innerWidth) / 2f,
        )

    drawRoundedBox(
        origin = origin,
        innerWidth = innerWidth,
        borderWidthPx = borderWidthPx,
        borderRadiusPx = borderRadiusPx,
        borderColor = colors.border,
        fillColor = colors.background,
    )

    // Same transition logic as the Flutter painter
    if (previousValue == ToggleableState.Off || value == ToggleableState.Off) {
        val t = if (value == ToggleableState.Off) 1f - transitionProgress else transitionProgress
        if (previousValue == ToggleableState.Indeterminate || value == ToggleableState.Indeterminate) {
            drawDash(
                origin = origin,
                innerWidth = innerWidth,
                edgeHalf = edgeHalf,
                t = t,
                color = colors.tick,
                markRadius = markRadius,
            )
        } else {
            drawCheck(
                origin = origin,
                innerWidth = innerWidth,
                edgeHalf = edgeHalf,
                t = t,
                color = colors.tick,
                markRadius = markRadius,
            )
        }
    } else {
        // null <-> true
        if (transitionProgress <= 0.5f) {
            val tShrink = 1f - transitionProgress * 2f
            if (previousValue == ToggleableState.On) {
                drawCheck(
                    origin = origin,
                    innerWidth = innerWidth,
                    edgeHalf = edgeHalf,
                    t = tShrink,
                    color = colors.tick,
                    markRadius = markRadius,
                )
            } else {
                drawDash(
                    origin = origin,
                    innerWidth = innerWidth,
                    edgeHalf = edgeHalf,
                    t = tShrink,
                    color = colors.tick,
                    markRadius = markRadius,
                )
            }
        } else {
            val tExpand = (transitionProgress - 0.5f) * 2f
            if (value == ToggleableState.On) {
                drawCheck(
                    origin = origin,
                    innerWidth = innerWidth,
                    edgeHalf = edgeHalf,
                    t = tExpand,
                    color = colors.tick,
                    markRadius = markRadius,
                )
            } else {
                drawDash(
                    origin = origin,
                    innerWidth = innerWidth,
                    edgeHalf = edgeHalf,
                    t = tExpand,
                    color = colors.tick,
                    markRadius = markRadius,
                )
            }
        }
    }
}

private fun DrawScope.drawRoundedBox(
    origin: Offset,
    innerWidth: Float,
    borderWidthPx: Float,
    borderRadiusPx: Float,
    borderColor: Color,
    fillColor: Color,
) {
    val innerRect =
        Rect(
            left = origin.x,
            top = origin.y,
            right = origin.x + innerWidth,
            bottom = origin.y + innerWidth,
        )

    val outerRect =
        Rect(
            left = innerRect.left - borderWidthPx,
            top = innerRect.top - borderWidthPx,
            right = innerRect.right + borderWidthPx,
            bottom = innerRect.bottom + borderWidthPx,
        )

    drawRoundRect(
        color = borderColor,
        topLeft = Offset(outerRect.left, outerRect.top),
        size = Size(outerRect.width, outerRect.height),
        cornerRadius = CornerRadius(borderRadiusPx, borderRadiusPx),
        style = Stroke(width = borderWidthPx),
    )

    drawRoundRect(
        color = fillColor,
        topLeft = Offset(innerRect.left, innerRect.top),
        size = Size(innerRect.width, innerRect.height),
        cornerRadius = CornerRadius(borderRadiusPx, borderRadiusPx),
    )
}

private fun DrawScope.drawCheck(
    origin: Offset,
    innerWidth: Float,
    edgeHalf: Float,
    t: Float,
    color: Color,
    markRadius: CornerRadius,
) {
    val clamped = t.coerceIn(0f, 1f)
    val pivot = Offset(origin.x + edgeHalf, origin.y + edgeHalf)

    withTransform({
        rotate(
            degrees = 45f,
            pivot = pivot,
        )
    }) {
        if (clamped < 0.5f) {
            drawCheckShortSide(
                origin = origin,
                innerWidth = innerWidth,
                t = clamped * 2f,
                color = color,
                markRadius = markRadius,
            )
        } else {
            drawCheckShortSide(
                origin = origin,
                innerWidth = innerWidth,
                t = 1f,
                color = color,
                markRadius = markRadius,
            )
            drawCheckLongSide(
                origin = origin,
                innerWidth = innerWidth,
                t = (clamped - 0.5f) * 2f,
                color = color,
                markRadius = markRadius,
            )
        }
    }
}

private fun DrawScope.drawCheckShortSide(
    origin: Offset,
    innerWidth: Float,
    t: Float,
    color: Color,
    markRadius: CornerRadius,
) {
    val xStart = 0.3f * innerWidth
    val xEnd = 0.6f * innerWidth
    val xAtT = lerpFloat(xStart, xEnd, t)

    val start = Offset(xStart, 0.6f * innerWidth) + origin
    val end = Offset(xAtT, 0.7f * innerWidth) + origin

    val rect = rectFromPoints(start, end)
    drawRoundRect(
        color = color,
        topLeft = Offset(rect.left, rect.top),
        size = Size(rect.width, rect.height),
        cornerRadius = markRadius,
    )
}

private fun DrawScope.drawCheckLongSide(
    origin: Offset,
    innerWidth: Float,
    t: Float,
    color: Color,
    markRadius: CornerRadius,
) {
    val yStart = 0.7f * innerWidth
    val yEnd = 0.2f * innerWidth
    val yAtT = lerpFloat(yStart, yEnd, t)

    val start = Offset(0.5f * innerWidth, yAtT) + origin
    val end = Offset(0.6f * innerWidth, yStart) + origin

    val rect = rectFromPoints(start, end)
    drawRoundRect(
        color = color,
        topLeft = Offset(rect.left, rect.top),
        size = Size(rect.width, rect.height),
        cornerRadius = markRadius,
    )
}

private fun DrawScope.drawDash(
    origin: Offset,
    innerWidth: Float,
    edgeHalf: Float,
    t: Float,
    color: Color,
    markRadius: CornerRadius,
) {
    val clamped = t.coerceIn(0f, 1f)
    val height = innerWidth * 0.15f
    val center = Offset(edgeHalf, edgeHalf) + origin
    val drawWidth = lerpFloat(0f, 0.6f * innerWidth, clamped)

    val rect =
        Rect(
            left = center.x - drawWidth / 2f,
            top = center.y - height / 2f,
            right = center.x + drawWidth / 2f,
            bottom = center.y + height / 2f,
        )

    drawRoundRect(
        color = color,
        topLeft = Offset(rect.left, rect.top),
        size = Size(rect.width, rect.height),
        cornerRadius = markRadius,
    )
}

private fun rectFromPoints(
    a: Offset,
    b: Offset,
): Rect =
    Rect(
        left = minOf(a.x, b.x),
        top = minOf(a.y, b.y),
        right = maxOf(a.x, b.x),
        bottom = maxOf(a.y, b.y),
    )

private fun lerpFloat(
    start: Float,
    stop: Float,
    fraction: Float,
): Float = start + (stop - start) * fraction
