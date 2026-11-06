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

public val SBBIcons.FerrisWheelLarge: ImageVector
    get() {
        if (_ferrisWheelLarge != null) {
            return _ferrisWheelLarge!!
        }
        _ferrisWheelLarge = Builder(name = "FerrisWheelLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                moveToRelative(-0.897f, 0.713f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, false, -5.978f, 2.469f)
                curveToRelative(0.238f, 0.383f, 0.375f, 0.834f, 0.375f, 1.318f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.494f, 1.493f)
                lineToRelative(6.392f, 6.208f)
                curveToRelative(0.586f, -0.44f, 1.313f, -0.701f, 2.102f, -0.701f)
                reflectiveCurveToRelative(1.516f, 0.26f, 2.101f, 0.7f)
                lineToRelative(6.393f, -6.207f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 31.5f, 13.0f)
                curveToRelative(0.0f, -0.484f, 0.137f, -0.936f, 0.376f, -1.319f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, false, -5.98f, -2.468f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, -4.793f, 0.0f)
                moveToRelative(4.88f, -1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -4.967f, 0.001f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, -6.586f, 2.735f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.481f, 3.48f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, -2.735f, 6.587f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 4.968f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, 2.735f, 6.586f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 3.48f, 3.482f)
                curveToRelative(0.807f, 0.588f, 1.67f, 1.098f, 2.574f, 1.52f)
                lineToRelative(-0.857f, 2.429f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(18.001f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.127f)
                lineToRelative(-0.624f, -2.122f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, false, 3.32f, -1.828f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 3.481f, -3.48f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, 2.734f, -6.587f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -4.968f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, -2.734f, -6.586f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.481f, -3.48f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, -6.586f, -2.736f)
                moveTo(34.0f, 15.5f)
                curveToRelative(0.484f, 0.0f, 0.936f, -0.138f, 1.319f, -0.376f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, true, 2.467f, 5.98f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, 4.793f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, true, -2.467f, 5.979f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 34.0f, 31.5f)
                curveToRelative(-0.452f, 0.0f, -0.876f, 0.12f, -1.241f, 0.33f)
                lineToRelative(-6.451f, -6.24f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 27.0f, 23.5f)
                curveToRelative(0.0f, -0.784f, -0.258f, -1.507f, -0.693f, -2.09f)
                lineToRelative(6.435f, -6.25f)
                curveToRelative(0.37f, 0.216f, 0.8f, 0.34f, 1.258f, 0.34f)
                moveToRelative(-22.318f, -0.376f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, false, -2.469f, 5.98f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, 0.0f, 4.793f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, false, 2.469f, 5.978f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.0f, 31.5f)
                curveToRelative(0.452f, 0.0f, 0.876f, 0.12f, 1.242f, 0.33f)
                lineToRelative(6.45f, -6.24f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 20.0f, 23.5f)
                curveToRelative(0.0f, -0.784f, 0.258f, -1.507f, 0.693f, -2.09f)
                lineToRelative(-6.435f, -6.25f)
                curveToRelative(-0.37f, 0.216f, -0.8f, 0.34f, -1.258f, 0.34f)
                curveToRelative(-0.484f, 0.0f, -0.936f, -0.137f, -1.318f, -0.376f)
                moveTo(25.94f, 26.627f)
                lineToRelative(6.064f, 5.866f)
                curveToRelative(-0.317f, 0.42f, -0.505f, 0.942f, -0.505f, 1.508f)
                curveToRelative(0.0f, 0.484f, 0.137f, 0.935f, 0.375f, 1.318f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, true, -2.908f, 1.597f)
                close()
                moveTo(15.124f, 35.32f)
                curveToRelative(0.698f, 0.5f, 1.439f, 0.936f, 2.214f, 1.304f)
                lineToRelative(3.428f, -9.715f)
                lineToRelative(-5.771f, 5.584f)
                curveToRelative(0.317f, 0.419f, 0.505f, 0.94f, 0.505f, 1.507f)
                curveToRelative(0.0f, 0.485f, -0.138f, 0.937f, -0.377f, 1.32f)
                moveTo(26.0f, 23.5f)
                curveToRelative(0.0f, 0.579f, -0.197f, 1.112f, -0.527f, 1.536f)
                lineToRelative(-0.493f, -1.677f)
                lineToRelative(-0.106f, -0.359f)
                horizontalLineToRelative(-2.728f)
                lineToRelative(-0.117f, 0.334f)
                lineToRelative(-0.57f, 1.611f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 26.0f, 23.5f)
                moveToRelative(2.832f, 16.501f)
                lineTo(24.126f, 24.0f)
                horizontalLineToRelative(-1.272f)
                lineToRelative(-5.648f, 16.001f)
                close()
                moveTo(11.5f, 34.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                moveTo(34.0f, 32.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(-27.0f, -9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                moveTo(38.5f, 22.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(-27.0f, -9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                moveTo(34.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
            }
        }
        .build()
        return _ferrisWheelLarge!!
    }

private var _ferrisWheelLarge: ImageVector? = null
