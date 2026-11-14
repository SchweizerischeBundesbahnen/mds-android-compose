package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.BellLarge: ImageVector
    get() {
        if (_bellLarge != null) {
            return _bellLarge!!
        }
        _bellLarge = Builder(name = "BellLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(26.0f, 5.5f)
                curveTo(26.0f, 4.116f, 24.884f, 3.0f, 23.5f, 3.0f)
                arcTo(2.496f, 2.496f, 0.0f, false, false, 21.0f, 5.5f)
                verticalLineToRelative(0.75f)
                arcTo(12.6f, 12.6f, 0.0f, false, true, 23.5f, 6.0f)
                curveToRelative(0.857f, 0.0f, 1.694f, 0.086f, 2.5f, 0.25f)
                close()
                moveTo(20.0f, 5.5f)
                verticalLineToRelative(0.996f)
                curveToRelative(-4.62f, 1.347f, -8.0f, 5.292f, -8.0f, 10.004f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.122f, -0.592f, 4.02f, -1.523f, 5.374f)
                curveTo(9.545f, 31.23f, 8.308f, 32.0f, 7.0f, 32.0f)
                curveToRelative(-0.706f, 0.0f, -1.21f, 0.558f, -1.509f, 1.154f)
                curveTo(5.178f, 33.78f, 5.0f, 34.61f, 5.0f, 35.5f)
                reflectiveCurveToRelative(0.178f, 1.72f, 0.491f, 2.346f)
                curveTo(5.79f, 38.442f, 6.294f, 39.0f, 7.0f, 39.0f)
                horizontalLineToRelative(11.023f)
                curveToRelative(0.252f, 2.802f, 2.61f, 5.0f, 5.477f, 5.0f)
                arcToRelative(5.503f, 5.503f, 0.0f, false, false, 5.477f, -5.0f)
                lineTo(40.0f, 39.0f)
                curveToRelative(0.706f, 0.0f, 1.21f, -0.558f, 1.509f, -1.154f)
                curveToRelative(0.313f, -0.626f, 0.491f, -1.456f, 0.491f, -2.346f)
                reflectiveCurveToRelative(-0.178f, -1.72f, -0.491f, -2.346f)
                curveTo(41.21f, 32.558f, 40.706f, 32.0f, 40.0f, 32.0f)
                curveToRelative(-1.308f, 0.0f, -2.545f, -0.77f, -3.477f, -2.126f)
                curveTo(35.592f, 28.52f, 35.0f, 26.622f, 35.0f, 24.5f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -4.712f, -3.38f, -8.657f, -8.0f, -10.004f)
                lineTo(27.0f, 5.5f)
                curveTo(27.0f, 3.564f, 25.436f, 2.0f, 23.5f, 2.0f)
                arcTo(3.496f, 3.496f, 0.0f, false, false, 20.0f, 5.5f)
                moveTo(37.162f, 32.0f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, -1.464f, -1.56f)
                curveTo(34.64f, 28.9f, 34.0f, 26.798f, 34.0f, 24.5f)
                verticalLineToRelative(-8.0f)
                curveTo(34.0f, 11.3f, 29.35f, 7.0f, 23.5f, 7.0f)
                reflectiveCurveTo(13.0f, 11.3f, 13.0f, 16.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.298f, -0.639f, 4.4f, -1.698f, 5.94f)
                arcTo(6.7f, 6.7f, 0.0f, false, true, 9.838f, 32.0f)
                close()
                moveTo(7.0f, 33.0f)
                curveToRelative(-0.124f, 0.0f, -0.37f, 0.113f, -0.614f, 0.602f)
                curveTo(6.156f, 34.06f, 6.0f, 34.73f, 6.0f, 35.5f)
                curveToRelative(0.0f, 0.77f, 0.156f, 1.44f, 0.386f, 1.898f)
                curveToRelative(0.244f, 0.489f, 0.49f, 0.602f, 0.614f, 0.602f)
                horizontalLineToRelative(33.0f)
                curveToRelative(0.124f, 0.0f, 0.37f, -0.113f, 0.614f, -0.602f)
                curveToRelative(0.23f, -0.459f, 0.386f, -1.129f, 0.386f, -1.898f)
                curveToRelative(0.0f, -0.77f, -0.156f, -1.44f, -0.386f, -1.898f)
                curveToRelative(-0.244f, -0.489f, -0.49f, -0.602f, -0.614f, -0.602f)
                close()
                moveTo(19.028f, 39.0f)
                arcToRelative(4.503f, 4.503f, 0.0f, false, false, 4.472f, 4.0f)
                arcToRelative(4.503f, 4.503f, 0.0f, false, false, 4.473f, -4.0f)
                close()
                moveTo(17.4f, 12.81f)
                curveToRelative(0.923f, -1.404f, 2.314f, -2.35f, 4.21f, -2.825f)
                lineToRelative(-0.242f, -0.97f)
                curveToRelative(-2.104f, 0.526f, -3.723f, 1.604f, -4.803f, 3.246f)
                curveToRelative(-1.072f, 1.63f, -1.581f, 3.768f, -1.566f, 6.369f)
                lineTo(14.999f, 23.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.373f)
                curveToRelative(-0.015f, -2.478f, 0.471f, -4.403f, 1.401f, -5.817f)
            }
        }
        .build()
        return _bellLarge!!
    }

private var _bellLarge: ImageVector? = null
