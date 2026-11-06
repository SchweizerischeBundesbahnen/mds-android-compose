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
                moveTo(20.0f, 5.5f)
                curveTo(20.0f, 3.564f, 21.564f, 2.0f, 23.5f, 2.0f)
                reflectiveCurveTo(27.0f, 3.564f, 27.0f, 5.5f)
                verticalLineToRelative(0.996f)
                curveToRelative(4.62f, 1.347f, 8.0f, 5.292f, 8.0f, 10.004f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.122f, 0.591f, 4.02f, 1.522f, 5.374f)
                curveTo(37.454f, 31.23f, 38.692f, 32.0f, 40.0f, 32.0f)
                curveToRelative(0.706f, 0.0f, 1.21f, 0.557f, 1.508f, 1.154f)
                curveToRelative(0.313f, 0.626f, 0.492f, 1.455f, 0.492f, 2.346f)
                curveToRelative(0.0f, 0.89f, -0.179f, 1.72f, -0.492f, 2.346f)
                curveTo(41.21f, 38.443f, 40.707f, 39.0f, 40.0f, 39.0f)
                lineTo(28.978f, 39.0f)
                arcToRelative(5.503f, 5.503f, 0.0f, false, true, -5.478f, 5.0f)
                arcToRelative(5.503f, 5.503f, 0.0f, false, true, -5.477f, -5.0f)
                lineTo(7.0f, 39.0f)
                curveToRelative(-0.706f, 0.0f, -1.21f, -0.557f, -1.508f, -1.154f)
                curveTo(5.179f, 37.22f, 5.0f, 36.391f, 5.0f, 35.5f)
                curveToRelative(0.0f, -0.89f, 0.179f, -1.72f, 0.492f, -2.346f)
                curveTo(5.79f, 32.557f, 6.294f, 32.0f, 7.0f, 32.0f)
                curveToRelative(1.308f, 0.0f, 2.546f, -0.77f, 3.478f, -2.126f)
                curveTo(11.408f, 28.52f, 12.0f, 26.622f, 12.0f, 24.5f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -4.712f, 3.38f, -8.657f, 8.0f, -10.004f)
                close()
                moveTo(7.0f, 33.0f)
                curveToRelative(-0.124f, 0.0f, -0.37f, 0.113f, -0.614f, 0.601f)
                curveToRelative(-0.23f, 0.46f, -0.386f, 1.13f, -0.386f, 1.899f)
                reflectiveCurveToRelative(0.156f, 1.44f, 0.386f, 1.899f)
                curveToRelative(0.244f, 0.488f, 0.49f, 0.601f, 0.614f, 0.601f)
                horizontalLineToRelative(33.0f)
                curveToRelative(0.124f, 0.0f, 0.37f, -0.113f, 0.614f, -0.601f)
                curveToRelative(0.23f, -0.46f, 0.386f, -1.13f, 0.386f, -1.899f)
                reflectiveCurveToRelative(-0.156f, -1.44f, -0.386f, -1.899f)
                curveTo(40.37f, 33.113f, 40.124f, 33.0f, 40.0f, 33.0f)
                close()
                moveTo(37.162f, 32.0f)
                lineTo(9.838f, 32.0f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, false, 1.464f, -1.56f)
                curveTo(12.362f, 28.9f, 13.0f, 26.799f, 13.0f, 24.5f)
                verticalLineToRelative(-8.0f)
                curveTo(13.0f, 11.3f, 17.65f, 7.0f, 23.5f, 7.0f)
                reflectiveCurveTo(34.0f, 11.3f, 34.0f, 16.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.298f, 0.639f, 4.4f, 1.698f, 5.94f)
                curveToRelative(0.42f, 0.613f, 0.914f, 1.143f, 1.464f, 1.56f)
                moveTo(26.0f, 5.5f)
                verticalLineToRelative(0.75f)
                arcTo(12.6f, 12.6f, 0.0f, false, false, 23.5f, 6.0f)
                curveToRelative(-0.857f, 0.0f, -1.694f, 0.086f, -2.5f, 0.25f)
                lineTo(21.0f, 5.5f)
                curveTo(21.0f, 4.116f, 22.116f, 3.0f, 23.5f, 3.0f)
                reflectiveCurveTo(26.0f, 4.116f, 26.0f, 5.5f)
                moveTo(19.028f, 39.0f)
                arcToRelative(4.503f, 4.503f, 0.0f, false, false, 4.472f, 4.0f)
                arcToRelative(4.503f, 4.503f, 0.0f, false, false, 4.473f, -4.0f)
                close()
                moveTo(16.0f, 18.627f)
                curveToRelative(-0.015f, -2.478f, 0.472f, -4.403f, 1.402f, -5.817f)
                curveToRelative(0.923f, -1.404f, 2.314f, -2.351f, 4.21f, -2.825f)
                lineToRelative(-0.243f, -0.97f)
                curveToRelative(-2.104f, 0.526f, -3.723f, 1.604f, -4.803f, 3.245f)
                curveToRelative(-1.072f, 1.631f, -1.581f, 3.77f, -1.566f, 6.371f)
                lineTo(15.0f, 23.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.373f)
            }
        }
        .build()
        return _bellLarge!!
    }

private var _bellLarge: ImageVector? = null
