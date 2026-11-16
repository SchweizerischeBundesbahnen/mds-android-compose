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

public val SBBIcons.FerrisWheelMedium: ImageVector
    get() {
        if (_ferrisWheelMedium != null) {
            return _ferrisWheelMedium!!
        }
        _ferrisWheelMedium = Builder(name = "FerrisWheelMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 6.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, -0.293f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 18.0f, 6.25f)
                moveToRelative(-1.66f, 0.116f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 3.32f, 0.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, 5.381f, 2.227f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.366f, 2.366f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, 2.236f, 5.45f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -0.02f, 3.32f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, -2.217f, 5.312f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.365f, 2.365f)
                curveToRelative(-0.611f, 0.458f, -1.269f, 0.858f, -1.964f, 1.192f)
                lineToRelative(1.387f, 3.467f)
                lineToRelative(0.274f, 0.685f)
                lineTo(11.262f, 32.75f)
                lineToRelative(0.274f, -0.685f)
                lineToRelative(1.386f, -3.467f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -1.963f, -1.192f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.366f, -2.365f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, -2.236f, -5.45f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.02f, -3.32f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, 2.216f, -5.312f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.366f, -2.366f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, 5.381f, -2.227f)
                moveTo(9.835f, 9.55f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.285f, 0.285f)
                quadToRelative(0.141f, -0.144f, 0.285f, -0.285f)
                moveToRelative(-0.281f, 16.617f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.279f, 0.279f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.28f, -0.279f)
                moveToRelative(16.614f, 0.278f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.277f, -0.277f)
                quadToRelative(-0.135f, 0.14f, -0.277f, 0.277f)
                moveToRelative(0.282f, -16.61f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.285f, -0.285f)
                quadToRelative(0.144f, 0.141f, 0.285f, 0.285f)
                moveToRelative(3.593f, 7.533f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.293f, 0.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.293f, -0.707f)
                moveToRelative(-10.275f, -1.136f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -3.535f, 3.535f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 3.535f, -3.535f)
                moveToRelative(1.035f, 3.864f)
                curveToRelative(0.438f, -0.584f, 0.697f, -1.31f, 0.697f, -2.096f)
                reflectiveCurveToRelative(-0.26f, -1.511f, -0.697f, -2.095f)
                lineToRelative(5.143f, -5.144f)
                arcTo(10.7f, 10.7f, 0.0f, false, true, 28.75f, 18.0f)
                curveToRelative(0.0f, 2.788f, -1.063f, 5.328f, -2.805f, 7.238f)
                close()
                moveTo(19.989f, 20.88f)
                lineTo(20.095f, 20.803f)
                lineTo(25.237f, 25.945f)
                arcToRelative(10.8f, 10.8f, 0.0f, false, true, -2.534f, 1.721f)
                close()
                moveTo(15.903f, 20.803f)
                lineTo(16.009f, 20.88f)
                lineTo(13.294f, 27.666f)
                arcToRelative(10.8f, 10.8f, 0.0f, false, true, -2.534f, -1.72f)
                close()
                moveTo(15.196f, 20.096f)
                lineTo(10.053f, 25.238f)
                arcTo(10.7f, 10.7f, 0.0f, false, true, 7.25f, 18.0f)
                curveToRelative(0.0f, -2.789f, 1.061f, -5.33f, 2.803f, -7.24f)
                lineToRelative(5.144f, 5.144f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 14.5f, 18.0f)
                curveToRelative(0.0f, 0.786f, 0.26f, 1.512f, 0.697f, 2.096f)
                moveToRelative(0.707f, -4.9f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.0f, 14.5f)
                curveToRelative(0.786f, 0.0f, 1.512f, 0.26f, 2.096f, 0.697f)
                lineToRelative(5.143f, -5.143f)
                arcTo(10.7f, 10.7f, 0.0f, false, false, 18.0f, 7.25f)
                curveToRelative(-2.789f, 0.0f, -5.33f, 1.061f, -7.24f, 2.803f)
                close()
                moveTo(5.957f, 18.632f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.293f, -0.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.293f, 0.707f)
                moveToRelative(6.781f, 13.118f)
                lineToRelative(1.29f, -3.223f)
                lineToRelative(2.81f, -7.027f)
                horizontalLineToRelative(2.324f)
                lineToRelative(2.81f, 7.027f)
                lineToRelative(1.29f, 3.223f)
                close()
            }
        }
        .build()
        return _ferrisWheelMedium!!
    }

private var _ferrisWheelMedium: ImageVector? = null
