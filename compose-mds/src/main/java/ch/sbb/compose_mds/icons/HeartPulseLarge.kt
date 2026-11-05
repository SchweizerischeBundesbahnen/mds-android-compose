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

public val SBBIcons.HeartPulseLarge: ImageVector
    get() {
        if (_heartPulseLarge != null) {
            return _heartPulseLarge!!
        }
        _heartPulseLarge = Builder(
            name = "HeartPulseLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(31.5f, 8.0f)
                curveToRelative(4.554f, 0.0f, 8.406f, 2.85f, 9.868f, 6.88f)
                lineToRelative(0.145f, 0.428f)
                curveToRelative(0.317f, 1.004f, 0.487f, 2.074f, 0.487f, 3.186f)
                curveToRelative(0.0f, 1.904f, -0.499f, 3.688f, -1.375f, 5.224f)
                lineToRelative(-0.001f, -0.001f)
                curveToRelative(-0.305f, 0.537f, -1.182f, 1.668f, -1.54f, 2.101f)
                lineToRelative(-0.016f, 0.019f)
                lineTo(36.905f, 28.0f)
                horizontalLineTo(43.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.095f)
                lineTo(23.854f, 41.054f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineTo(11.096f, 29.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.095f)
                lineToRelative(-2.166f, -2.166f)
                lineToRelative(-0.007f, -0.008f)
                arcToRelative(10.6f, 10.6f, 0.0f, false, true, -1.663f, -2.3f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, true, -1.27f, -5.032f)
                curveTo(4.988f, 12.665f, 9.67f, 8.0f, 15.5f, 8.0f)
                curveToRelative(3.234f, 0.0f, 6.089f, 1.458f, 8.006f, 3.731f)
                curveTo(25.417f, 9.458f, 28.264f, 8.001f, 31.5f, 8.0f)
                moveTo(16.992f, 28.59f)
                lineToRelative(-0.075f, 0.41f)
                horizontalLineToRelative(-4.41f)
                lineTo(23.5f, 39.992f)
                lineTo(34.49f, 29.0f)
                horizontalLineToRelative(-4.329f)
                lineToRelative(-0.125f, -0.314f)
                lineToRelative(-1.587f, -3.967f)
                lineToRelative(-4.502f, 9.005f)
                lineToRelative(-0.554f, 1.109f)
                lineToRelative(-0.37f, -1.184f)
                lineToRelative(-4.395f, -14.06f)
                close()
                moveTo(31.5f, 9.0f)
                curveToRelative(-3.137f, 0.0f, -5.869f, 1.512f, -7.592f, 3.834f)
                lineToRelative(-0.401f, 0.54f)
                lineToRelative(-0.402f, -0.539f)
                curveTo(21.377f, 10.513f, 18.636f, 9.0f, 15.5f, 9.0f)
                arcToRelative(9.467f, 9.467f, 0.0f, false, false, -9.512f, 9.494f)
                curveToRelative(0.0f, 1.655f, 0.417f, 3.207f, 1.15f, 4.555f)
                curveToRelative(0.419f, 0.771f, 0.915f, 1.47f, 1.505f, 2.085f)
                lineTo(11.509f, 28.0f)
                horizontalLineToRelative(4.573f)
                lineToRelative(1.926f, -10.59f)
                lineToRelative(0.363f, -1.998f)
                lineToRelative(0.607f, 1.939f)
                lineToRelative(4.63f, 14.815f)
                lineToRelative(4.445f, -8.89f)
                lineToRelative(0.498f, -0.996f)
                lineToRelative(0.413f, 1.034f)
                lineTo(30.838f, 28.0f)
                horizontalLineToRelative(4.652f)
                lineToRelative(2.834f, -2.834f)
                curveToRelative(0.369f, -0.448f, 1.178f, -1.497f, 1.43f, -1.942f)
                lineToRelative(0.002f, -0.001f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 41.0f, 18.494f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, false, -0.44f, -2.886f)
                lineToRelative(-0.131f, -0.385f)
                arcTo(9.46f, 9.46f, 0.0f, false, false, 31.5f, 9.0f)
            }
        }
            .build()
        return _heartPulseLarge!!
    }

private var _heartPulseLarge: ImageVector? = null
