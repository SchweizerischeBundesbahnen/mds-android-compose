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
                moveTo(5.75f, 18.0f)
                curveToRelative(0.0f, -6.759f, 5.491f, -12.25f, 12.25f, -12.25f)
                reflectiveCurveTo(30.25f, 11.241f, 30.25f, 18.0f)
                curveToRelative(0.0f, 0.428f, -0.029f, 0.86f, -0.072f, 1.284f)
                lineToRelative(0.994f, 0.102f)
                curveToRelative(0.047f, -0.447f, 0.078f, -0.914f, 0.078f, -1.386f)
                curveToRelative(0.0f, -7.311f, -5.939f, -13.25f, -13.25f, -13.25f)
                reflectiveCurveTo(4.75f, 10.689f, 4.75f, 18.0f)
                reflectiveCurveTo(10.689f, 31.25f, 18.0f, 31.25f)
                curveToRelative(2.119f, 0.0f, 4.13f, -0.499f, 5.909f, -1.388f)
                lineToRelative(-0.448f, -0.894f)
                curveToRelative(-1.641f, 0.82f, -3.5f, 1.282f, -5.461f, 1.282f)
                curveToRelative(-6.759f, 0.0f, -12.25f, -5.491f, -12.25f, -12.25f)
                moveToRelative(20.916f, -1.027f)
                lineToRelative(-0.416f, 0.277f)
                lineToRelative(-0.416f, -0.277f)
                lineToRelative(0.416f, -0.624f)
                close()
                moveTo(26.25f, 17.25f)
                lineTo(25.834f, 16.973f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.003f, 0.003f)
                lineToRelative(-0.007f, 0.01f)
                lineToRelative(-0.027f, 0.041f)
                lineToRelative(-0.098f, 0.153f)
                arcToRelative(28.755f, 28.755f, 0.0f, false, false, -1.396f, 2.47f)
                curveToRelative(-0.752f, 1.504f, -1.553f, 3.472f, -1.553f, 5.099f)
                curveToRelative(0.0f, 1.926f, 1.574f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.574f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.627f, -0.8f, -3.595f, -1.553f, -5.099f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, false, -1.494f, -2.623f)
                lineToRelative(-0.027f, -0.04f)
                lineToRelative(-0.007f, -0.011f)
                lineToRelative(-0.002f, -0.003f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(26.25f, 18.19f)
                lineTo(26.21f, 18.257f)
                curveToRelative(-0.277f, 0.461f, -0.645f, 1.106f, -1.013f, 1.842f)
                curveToRelative(-0.748f, 1.496f, -1.447f, 3.278f, -1.447f, 4.651f)
                curveToRelative(0.0f, 1.374f, 1.126f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.126f, 2.5f, -2.5f)
                curveToRelative(0.0f, -1.373f, -0.7f, -3.155f, -1.447f, -4.651f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -1.013f, -1.842f)
                close()
                moveTo(10.806f, 23.053f)
                curveToRelative(1.215f, -2.83f, 3.97f, -4.803f, 7.284f, -4.803f)
                curveToRelative(1.66f, 0.0f, 3.2f, 0.495f, 4.467f, 1.362f)
                lineToRelative(-0.564f, 0.826f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, -3.903f, -1.188f)
                curveToRelative(-2.896f, 0.0f, -5.301f, 1.718f, -6.365f, 4.197f)
                close()
                moveTo(13.5f, 13.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(-1.25f, 0.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveToRelative(10.0f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
                moveToRelative(0.25f, -1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
            }
        }
        .build()
        return _faceTearMedium!!
    }

private var _faceTearMedium: ImageVector? = null
