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

public val SBBIcons.FaceTearLarge: ImageVector
    get() {
        if (_faceTearLarge != null) {
            return _faceTearLarge!!
        }
        _faceTearLarge = Builder(name = "FaceTearLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(42.0f, 23.5f)
                curveTo(42.0f, 13.836f, 34.164f, 6.0f, 24.5f, 6.0f)
                reflectiveCurveTo(7.0f, 13.836f, 7.0f, 23.5f)
                reflectiveCurveTo(14.836f, 41.0f, 24.5f, 41.0f)
                arcToRelative(17.5f, 17.5f, 0.0f, false, false, 7.282f, -1.585f)
                lineToRelative(0.415f, 0.91f)
                arcTo(18.5f, 18.5f, 0.0f, false, true, 24.5f, 42.0f)
                curveTo(14.284f, 42.0f, 6.0f, 33.716f, 6.0f, 23.5f)
                reflectiveCurveTo(14.284f, 5.0f, 24.5f, 5.0f)
                reflectiveCurveTo(43.0f, 13.284f, 43.0f, 23.5f)
                curveToRelative(0.0f, 0.656f, -0.031f, 1.305f, -0.103f, 1.946f)
                lineToRelative(-0.994f, -0.112f)
                curveToRelative(0.068f, -0.598f, 0.097f, -1.21f, 0.097f, -1.834f)
                moveToRelative(-23.0f, -5.0f)
                curveToRelative(0.0f, -0.274f, -0.226f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.226f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.226f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.226f, 0.5f, -0.5f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 0.826f, -0.674f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.674f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.674f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.674f, 1.5f, 1.5f)
                moveToRelative(11.0f, 0.0f)
                curveToRelative(0.0f, -0.274f, -0.226f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.226f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.226f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.226f, 0.5f, -0.5f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 0.826f, -0.674f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.674f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.674f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.674f, 1.5f, 1.5f)
                moveToRelative(7.556f, 8.477f)
                curveTo(40.804f, 29.4f, 42.0f, 32.34f, 42.0f, 34.64f)
                curveToRelative(0.0f, 2.4f, -2.002f, 4.36f, -4.5f, 4.36f)
                curveToRelative(-2.497f, 0.0f, -4.5f, -1.97f, -4.5f, -4.36f)
                curveToRelative(0.0f, -2.294f, 1.196f, -5.234f, 2.444f, -7.66f)
                arcToRelative(45.0f, 45.0f, 0.0f, false, true, 1.7f, -3.003f)
                quadToRelative(0.169f, -0.27f, 0.307f, -0.485f)
                lineToRelative(0.049f, -0.076f)
                lineToRelative(0.056f, 0.087f)
                quadToRelative(0.136f, 0.21f, 0.3f, 0.474f)
                curveToRelative(0.463f, 0.75f, 1.082f, 1.8f, 1.7f, 3.0f)
                moveTo(37.5f, 40.0f)
                curveToRelative(3.022f, 0.0f, 5.5f, -2.38f, 5.5f, -5.36f)
                curveToRelative(0.0f, -2.561f, -1.304f, -5.69f, -2.556f, -8.121f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -2.311f, -3.971f)
                lineToRelative(-0.162f, -0.244f)
                lineToRelative(-0.039f, -0.057f)
                lineToRelative(-0.004f, -0.007f)
                lineToRelative(-0.012f, -0.016f)
                lineToRelative(-0.002f, -0.003f)
                verticalLineToRelative(-0.002f)
                lineToRelative(-0.002f, -0.001f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-0.412f, -0.6f)
                lineToRelative(-0.412f, 0.6f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.001f, 0.002f)
                lineToRelative(-0.002f, 0.002f)
                lineToRelative(-0.001f, 0.003f)
                lineToRelative(-0.004f, 0.006f)
                lineToRelative(-0.007f, 0.01f)
                lineToRelative(-0.044f, 0.065f)
                lineToRelative(-0.16f, 0.244f)
                arcToRelative(46.044f, 46.044f, 0.0f, false, false, -2.311f, 3.974f)
                curveToRelative(-1.253f, 2.431f, -2.557f, 5.56f, -2.557f, 8.117f)
                curveToRelative(0.0f, 2.969f, 2.477f, 5.36f, 5.5f, 5.36f)
                moveToRelative(-6.24f, -10.955f)
                arcTo(12.03f, 12.03f, 0.0f, false, false, 24.5f, 27.0f)
                curveToRelative(-3.93f, 0.0f, -7.386f, 1.825f, -9.568f, 4.697f)
                lineToRelative(0.797f, 0.606f)
                curveTo(17.726f, 29.675f, 20.889f, 28.0f, 24.5f, 28.0f)
                curveToRelative(2.319f, 0.0f, 4.441f, 0.69f, 6.2f, 1.875f)
                close()
            }
        }
        .build()
        return _faceTearLarge!!
    }

private var _faceTearLarge: ImageVector? = null
