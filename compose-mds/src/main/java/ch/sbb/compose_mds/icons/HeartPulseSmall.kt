package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.HeartPulseSmall: ImageVector
    get() {
        if (_heartPulseSmall != null) {
            return _heartPulseSmall!!
        }
        _heartPulseSmall = Builder(
            name = "HeartPulseSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(15.5f, 4.0f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, true, 5.169f, 3.605f)
                lineToRelative(0.076f, 0.223f)
                curveToRelative(0.166f, 0.527f, 0.255f, 1.087f, 0.255f, 1.67f)
                curveToRelative(0.0f, 0.995f, -0.262f, 1.928f, -0.72f, 2.733f)
                curveToRelative(-0.164f, 0.29f, -0.618f, 0.872f, -0.796f, 1.087f)
                lineToRelative(-0.014f, 0.019f)
                lineToRelative(-0.663f, 0.663f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.193f)
                lineToRelative(-5.953f, 5.953f)
                lineToRelative(-0.354f, 0.355f)
                lineToRelative(-0.354f, -0.355f)
                lineTo(5.193f, 15.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.193f)
                lineToRelative(-0.656f, -0.656f)
                lineToRelative(-0.007f, -0.008f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -0.682f, -0.882f)
                lineToRelative(-0.188f, -0.321f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.666f, -2.636f)
                arcTo(5.483f, 5.483f, 0.0f, false, true, 7.5f, 4.0f)
                curveToRelative(1.59f, 0.0f, 3.005f, 0.672f, 4.002f, 1.738f)
                arcTo(5.44f, 5.44f, 0.0f, false, true, 15.5f, 4.0f)
                moveTo(8.492f, 14.59f)
                lineToRelative(-0.075f, 0.41f)
                horizontalLineTo(6.608f)
                lineToRelative(4.891f, 4.892f)
                lineTo(16.391f, 15.0f)
                horizontalLineToRelative(-1.73f)
                lineToRelative(-0.125f, -0.315f)
                lineToRelative(-0.587f, -1.466f)
                lineToRelative(-2.002f, 4.005f)
                lineToRelative(-0.554f, 1.109f)
                lineToRelative(-0.37f, -1.184f)
                lineToRelative(-1.895f, -6.06f)
                close()
                moveTo(15.5f, 5.0f)
                arcToRelative(4.45f, 4.45f, 0.0f, false, false, -3.596f, 1.816f)
                lineToRelative(-0.4f, 0.54f)
                lineToRelative(-0.402f, -0.54f)
                arcTo(4.47f, 4.47f, 0.0f, false, false, 7.5f, 5.0f)
                arcToRelative(4.483f, 4.483f, 0.0f, false, false, -4.506f, 4.497f)
                curveToRelative(0.0f, 0.785f, 0.197f, 1.52f, 0.544f, 2.158f)
                quadToRelative(0.299f, 0.555f, 0.714f, 0.989f)
                lineTo(5.608f, 14.0f)
                horizontalLineToRelative(1.974f)
                lineToRelative(0.926f, -5.09f)
                lineToRelative(0.363f, -1.998f)
                lineToRelative(0.607f, 1.939f)
                lineToRelative(2.13f, 6.815f)
                lineToRelative(1.945f, -3.89f)
                lineToRelative(0.498f, -0.996f)
                lineToRelative(0.413f, 1.035f)
                lineToRelative(0.874f, 2.185f)
                horizontalLineToRelative(2.053f)
                lineToRelative(1.337f, -1.337f)
                curveToRelative(0.188f, -0.23f, 0.57f, -0.726f, 0.682f, -0.925f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.375f, -0.658f, 0.589f, -1.421f, 0.589f, -2.24f)
                curveToRelative(0.0f, -0.548f, -0.095f, -1.07f, -0.27f, -1.55f)
                verticalLineToRelative(-0.002f)
                arcTo(4.48f, 4.48f, 0.0f, false, false, 15.5f, 5.0f)
            }
        }
            .build()
        return _heartPulseSmall!!
    }

private var _heartPulseSmall: ImageVector? = null
