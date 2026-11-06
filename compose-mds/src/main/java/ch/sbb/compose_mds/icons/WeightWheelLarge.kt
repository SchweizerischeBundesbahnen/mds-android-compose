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

public val SBBIcons.WeightWheelLarge: ImageVector
    get() {
        if (_weightWheelLarge != null) {
            return _weightWheelLarge!!
        }
        _weightWheelLarge = Builder(name = "WeightWheelLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.999f, 29.041f)
                curveTo(41.209f, 38.537f, 33.236f, 46.0f, 23.5f, 46.0f)
                reflectiveCurveTo(5.791f, 38.537f, 5.002f, 29.041f)
                lineTo(6.0f, 28.959f)
                curveTo(6.744f, 37.938f, 14.287f, 45.0f, 23.5f, 45.0f)
                reflectiveCurveToRelative(16.757f, -7.062f, 17.502f, -16.041f)
                close()
                moveTo(37.999f, 29.043f)
                curveTo(37.379f, 36.309f, 31.119f, 42.0f, 23.5f, 42.0f)
                curveToRelative(-7.618f, 0.0f, -13.878f, -5.69f, -14.498f, -12.957f)
                lineToRelative(0.997f, -0.086f)
                curveTo(10.572f, 35.687f, 16.38f, 41.0f, 23.5f, 41.0f)
                curveToRelative(7.12f, 0.0f, 12.929f, -5.314f, 13.502f, -12.043f)
                close()
                moveTo(26.666f, 29.278f)
                curveTo(25.974f, 30.31f, 24.82f, 31.0f, 23.5f, 31.0f)
                reflectiveCurveToRelative(-2.473f, -0.69f, -3.165f, -1.722f)
                lineToRelative(0.83f, -0.556f)
                curveTo(21.689f, 29.5f, 22.543f, 30.0f, 23.5f, 30.0f)
                curveToRelative(0.959f, 0.0f, 1.813f, -0.5f, 2.335f, -1.278f)
                close()
                moveTo(23.5f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.645f, 7.0f)
                lineTo(36.88f, 9.0f)
                lineToRelative(0.102f, 0.366f)
                lineToRelative(5.0f, 18.0f)
                lineToRelative(0.177f, 0.634f)
                lineTo(4.842f, 28.0f)
                lineToRelative(0.177f, -0.634f)
                lineToRelative(5.0f, -18.0f)
                lineTo(10.121f, 9.0f)
                horizontalLineToRelative(10.735f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 23.5f, 2.0f)
                moveTo(6.159f, 27.0f)
                horizontalLineToRelative(34.685f)
                lineToRelative(-4.722f, -17.0f)
                lineTo(10.88f, 10.0f)
                close()
                moveTo(28.679f, 12.905f)
                quadToRelative(2.179f, 0.0f, 3.429f, 1.287f)
                quadToRelative(0.93f, 0.951f, 1.06f, 2.247f)
                horizontalLineToRelative(-1.39f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.004f, -1.694f)
                quadToRelative(-0.852f, -0.64f, -2.096f, -0.64f)
                quadToRelative(-1.813f, 0.0f, -2.844f, 1.302f)
                quadToRelative(-0.936f, 1.185f, -0.937f, 3.145f)
                quadToRelative(0.0f, 1.799f, 0.856f, 2.947f)
                quadToRelative(1.032f, 1.396f, 2.918f, 1.396f)
                quadToRelative(1.455f, 0.0f, 2.399f, -0.92f)
                quadToRelative(0.921f, -0.908f, 0.951f, -2.633f)
                horizontalLineToRelative(-3.423f)
                verticalLineToRelative(-1.14f)
                horizontalLineToRelative(4.688f)
                verticalLineToRelative(5.645f)
                horizontalLineToRelative(-0.9f)
                lineToRelative(-0.212f, -0.812f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.153f, -0.526f)
                quadToRelative(-1.28f, 1.586f, -3.438f, 1.587f)
                quadToRelative(-2.567f, -0.001f, -3.971f, -1.85f)
                quadToRelative(-1.133f, -1.5f, -1.133f, -3.643f)
                quadToRelative(0.0f, -2.508f, 1.455f, -4.147f)
                quadToRelative(1.39f, -1.55f, 3.744f, -1.55f)
                moveToRelative(-12.55f, 5.552f)
                lineToRelative(5.426f, -5.303f)
                horizontalLineToRelative(1.859f)
                lineToRelative(-4.52f, 4.293f)
                lineToRelative(4.688f, 6.4f)
                horizontalLineToRelative(-1.792f)
                lineToRelative(-3.891f, -5.434f)
                lineToRelative(-1.77f, 1.682f)
                verticalLineToRelative(3.752f)
                horizontalLineToRelative(-1.412f)
                lineTo(14.716f, 13.154f)
                horizontalLineToRelative(1.412f)
                close()
                moveTo(23.5f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
            }
        }
        .build()
        return _weightWheelLarge!!
    }

private var _weightWheelLarge: ImageVector? = null
