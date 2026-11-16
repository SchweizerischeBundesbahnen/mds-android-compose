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

public val SBBIcons.FaceTearMedium: ImageVector
    get() {
        if (_faceTearMedium != null) {
            return _faceTearMedium!!
        }
        _faceTearMedium = Builder(name = "FaceTearMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 5.75f)
                curveToRelative(6.759f, 0.0f, 12.25f, 5.491f, 12.25f, 12.25f)
                curveToRelative(0.0f, 0.428f, -0.029f, 0.86f, -0.072f, 1.283f)
                lineToRelative(0.994f, 0.104f)
                curveToRelative(0.046f, -0.447f, 0.078f, -0.915f, 0.078f, -1.387f)
                curveToRelative(0.0f, -7.311f, -5.939f, -13.25f, -13.25f, -13.25f)
                reflectiveCurveTo(4.75f, 10.689f, 4.75f, 18.0f)
                reflectiveCurveTo(10.689f, 31.25f, 18.0f, 31.25f)
                curveToRelative(2.119f, 0.0f, 4.13f, -0.499f, 5.908f, -1.388f)
                lineToRelative(-0.447f, -0.894f)
                curveToRelative(-1.642f, 0.82f, -3.5f, 1.282f, -5.461f, 1.282f)
                curveToRelative(-6.759f, 0.0f, -12.25f, -5.491f, -12.25f, -12.25f)
                reflectiveCurveTo(11.241f, 5.75f, 18.0f, 5.75f)
                moveToRelative(10.75f, 19.0f)
                curveToRelative(0.0f, -1.373f, -0.7f, -3.155f, -1.447f, -4.651f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -1.013f, -1.842f)
                lineToRelative(-0.017f, -0.027f)
                lineToRelative(-0.005f, -0.009f)
                lineToRelative(-0.018f, -0.03f)
                lineToRelative(-0.018f, 0.03f)
                lineToRelative(-0.022f, 0.036f)
                curveToRelative(-0.277f, 0.46f, -0.645f, 1.106f, -1.013f, 1.842f)
                curveToRelative(-0.748f, 1.496f, -1.447f, 3.278f, -1.447f, 4.651f)
                curveToRelative(0.0f, 1.374f, 1.126f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.126f, 2.5f, -2.5f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.926f, -1.574f, 3.5f, -3.5f, 3.5f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.627f, 0.8f, -3.595f, 1.553f, -5.099f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, true, 1.481f, -2.602f)
                lineToRelative(0.014f, -0.02f)
                lineToRelative(0.017f, -0.028f)
                lineToRelative(0.01f, -0.014f)
                lineToRelative(0.006f, -0.01f)
                lineToRelative(0.002f, -0.003f)
                lineToRelative(0.001f, -0.001f)
                lineToRelative(0.416f, -0.624f)
                lineToRelative(0.416f, 0.624f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.002f, 0.004f)
                lineToRelative(0.007f, 0.01f)
                lineToRelative(0.01f, 0.017f)
                lineToRelative(0.016f, 0.024f)
                lineToRelative(0.013f, 0.02f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.086f, 0.132f)
                arcToRelative(28.824f, 28.824f, 0.0f, false, true, 1.396f, 2.47f)
                curveToRelative(0.752f, 1.504f, 1.553f, 3.472f, 1.553f, 5.099f)
                moveToRelative(-11.66f, -6.5f)
                curveToRelative(1.66f, 0.0f, 3.2f, 0.496f, 4.467f, 1.362f)
                lineToRelative(-0.564f, 0.826f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, -3.903f, -1.188f)
                curveToRelative(-2.896f, 0.0f, -5.301f, 1.718f, -6.366f, 4.197f)
                lineToRelative(-0.918f, -0.394f)
                curveToRelative(1.216f, -2.83f, 3.97f, -4.803f, 7.284f, -4.803f)
                moveToRelative(-4.34f, -4.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, -0.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                moveToRelative(7.75f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.5f)
                moveToRelative(0.0f, 1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
            }
        }
        .build()
        return _faceTearMedium!!
    }

private var _faceTearMedium: ImageVector? = null
