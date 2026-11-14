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

public val SBBIcons.BellDisabledLarge: ImageVector
    get() {
        if (_bellDisabledLarge != null) {
            return _bellDisabledLarge!!
        }
        _bellDisabledLarge = Builder(name = "BellDisabledLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(45.647f, 45.354f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-43.0f, -43.0f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(12.84f, 12.547f)
                arcTo(9.8f, 9.8f, 0.0f, false, false, 12.0f, 16.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.122f, -0.592f, 4.02f, -1.522f, 5.375f)
                curveTo(9.545f, 31.23f, 8.308f, 32.0f, 7.0f, 32.0f)
                curveToRelative(-0.706f, 0.0f, -1.21f, 0.557f, -1.509f, 1.154f)
                curveToRelative(-0.313f, 0.625f, -0.49f, 1.455f, -0.491f, 2.346f)
                curveToRelative(0.0f, 0.89f, 0.178f, 1.72f, 0.491f, 2.346f)
                curveTo(5.79f, 38.443f, 6.294f, 39.0f, 7.0f, 39.0f)
                horizontalLineToRelative(11.023f)
                curveToRelative(0.252f, 2.802f, 2.61f, 5.0f, 5.477f, 5.0f)
                arcToRelative(5.503f, 5.503f, 0.0f, false, false, 5.478f, -5.0f)
                horizontalLineToRelative(10.315f)
                close()
                moveTo(13.0f, 16.5f)
                curveToRelative(0.0f, -1.114f, 0.215f, -2.19f, 0.604f, -3.188f)
                lineToRelative(1.772f, 1.77f)
                curveTo(15.112f, 16.15f, 15.0f, 17.335f, 15.0f, 18.63f)
                lineTo(15.0f, 23.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.37f)
                lineToRelative(0.006f, -0.499f)
                quadToRelative(0.028f, -1.195f, 0.212f, -2.206f)
                lineTo(32.293f, 32.0f)
                lineTo(9.838f, 32.0f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, false, 1.464f, -1.559f)
                curveTo(12.362f, 28.9f, 13.0f, 26.798f, 13.0f, 24.5f)
                close()
                moveTo(6.386f, 33.6f)
                curveTo(6.63f, 33.113f, 6.876f, 33.0f, 7.0f, 33.0f)
                horizontalLineToRelative(26.293f)
                lineToRelative(5.0f, 5.0f)
                lineTo(7.0f, 38.0f)
                curveToRelative(-0.124f, 0.0f, -0.37f, -0.112f, -0.614f, -0.601f)
                curveToRelative(-0.23f, -0.46f, -0.386f, -1.13f, -0.386f, -1.9f)
                curveToRelative(0.0f, -0.769f, 0.156f, -1.439f, 0.386f, -1.898f)
                moveTo(23.5f, 43.0f)
                arcToRelative(4.503f, 4.503f, 0.0f, false, true, -4.472f, -4.0f)
                horizontalLineToRelative(8.945f)
                arcToRelative(4.503f, 4.503f, 0.0f, false, true, -4.473f, 4.0f)
                moveToRelative(-6.25f, -29.924f)
                curveToRelative(0.924f, -1.552f, 2.364f, -2.589f, 4.37f, -3.09f)
                lineToRelative(-0.241f, -0.971f)
                curveToRelative(-2.234f, 0.558f, -3.913f, 1.742f, -4.989f, 3.55f)
                close()
                moveTo(40.614f, 33.602f)
                curveToRelative(0.23f, 0.459f, 0.386f, 1.129f, 0.386f, 1.898f)
                curveToRelative(0.0f, 0.575f, -0.084f, 1.096f, -0.232f, 1.513f)
                lineToRelative(0.944f, 0.334f)
                curveToRelative(0.192f, -0.544f, 0.288f, -1.182f, 0.288f, -1.847f)
                curveToRelative(0.0f, -0.89f, -0.179f, -1.72f, -0.491f, -2.346f)
                curveTo(41.21f, 32.558f, 40.706f, 32.0f, 40.0f, 32.0f)
                curveToRelative(-1.308f, 0.0f, -2.546f, -0.77f, -3.478f, -2.126f)
                curveTo(35.592f, 28.52f, 35.0f, 26.622f, 35.0f, 24.5f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -4.712f, -3.38f, -8.657f, -8.0f, -10.004f)
                lineTo(27.0f, 5.5f)
                curveTo(27.0f, 3.564f, 25.436f, 2.0f, 23.5f, 2.0f)
                arcTo(3.496f, 3.496f, 0.0f, false, false, 20.0f, 5.5f)
                verticalLineToRelative(0.996f)
                curveToRelative(-2.337f, 0.681f, -4.355f, 2.028f, -5.78f, 3.8f)
                lineToRelative(0.78f, 0.627f)
                curveTo(16.902f, 8.554f, 19.997f, 7.0f, 23.5f, 7.0f)
                curveTo(29.35f, 7.0f, 34.0f, 11.3f, 34.0f, 16.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.298f, 0.639f, 4.4f, 1.698f, 5.94f)
                arcTo(6.7f, 6.7f, 0.0f, false, false, 37.162f, 32.0f)
                lineTo(37.0f, 32.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.124f, 0.0f, 0.37f, 0.113f, 0.614f, 0.602f)
                moveTo(26.0f, 5.5f)
                verticalLineToRelative(0.75f)
                arcTo(12.6f, 12.6f, 0.0f, false, false, 23.5f, 6.0f)
                curveToRelative(-0.858f, 0.0f, -1.695f, 0.086f, -2.5f, 0.25f)
                lineTo(21.0f, 5.5f)
                curveTo(21.0f, 4.116f, 22.116f, 3.0f, 23.5f, 3.0f)
                reflectiveCurveTo(26.0f, 4.116f, 26.0f, 5.5f)
            }
        }
        .build()
        return _bellDisabledLarge!!
    }

private var _bellDisabledLarge: ImageVector? = null
