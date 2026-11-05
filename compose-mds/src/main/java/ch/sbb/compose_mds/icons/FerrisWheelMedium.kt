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
        _ferrisWheelMedium = Builder(
            name = "FerrisWheelMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(19.0f, 5.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(-1.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.66f, 3.116f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, 5.381f, 2.227f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.366f, 2.366f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, 2.236f, 5.45f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -0.02f, 3.32f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, -2.216f, 5.313f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.366f, 2.365f)
                curveToRelative(-0.61f, 0.458f, -1.268f, 0.858f, -1.963f, 1.192f)
                lineToRelative(1.386f, 3.465f)
                lineToRelative(0.274f, 0.686f)
                lineTo(11.261f, 32.75f)
                lineToRelative(0.275f, -0.686f)
                lineToRelative(1.386f, -3.465f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -1.963f, -1.192f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.366f, -2.366f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, -2.236f, -5.45f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.02f, -3.32f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, 2.216f, -5.312f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.366f, -2.366f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, 5.381f, -2.227f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 3.25f)
                moveToRelative(-8.165f, 6.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.285f, 0.285f)
                quadToRelative(0.141f, -0.144f, 0.285f, -0.285f)
                moveToRelative(-0.284f, 16.615f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.284f, 0.284f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.284f, -0.284f)
                moveToRelative(16.614f, 0.284f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.284f, -0.284f)
                quadToRelative(-0.139f, 0.145f, -0.284f, 0.284f)
                moveToRelative(0.285f, -16.614f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.285f, -0.285f)
                quadToRelative(0.144f, 0.141f, 0.285f, 0.285f)
                moveTo(18.0f, 7.25f)
                curveToRelative(-2.789f, 0.0f, -5.33f, 1.062f, -7.24f, 2.803f)
                lineToRelative(5.144f, 5.144f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.0f, 14.5f)
                curveToRelative(0.786f, 0.0f, 1.512f, 0.26f, 2.096f, 0.697f)
                lineToRelative(5.144f, -5.143f)
                arcTo(10.7f, 10.7f, 0.0f, false, false, 18.0f, 7.25f)
                moveToRelative(2.803f, 8.654f)
                curveToRelative(0.438f, 0.584f, 0.697f, 1.31f, 0.697f, 2.096f)
                reflectiveCurveToRelative(-0.26f, 1.512f, -0.697f, 2.096f)
                lineToRelative(5.144f, 5.144f)
                arcTo(10.7f, 10.7f, 0.0f, false, false, 28.75f, 18.0f)
                arcToRelative(10.7f, 10.7f, 0.0f, false, false, -2.803f, -7.24f)
                close()
                moveTo(19.99f, 20.879f)
                quadToRelative(0.054f, -0.037f, 0.106f, -0.076f)
                lineToRelative(5.144f, 5.144f)
                arcToRelative(10.8f, 10.8f, 0.0f, false, true, -2.534f, 1.721f)
                close()
                moveTo(15.904f, 20.803f)
                quadToRelative(0.052f, 0.04f, 0.106f, 0.076f)
                lineToRelative(-2.716f, 6.79f)
                arcToRelative(10.8f, 10.8f, 0.0f, false, true, -2.534f, -1.722f)
                close()
                moveTo(15.197f, 20.096f)
                lineTo(10.053f, 25.24f)
                arcTo(10.7f, 10.7f, 0.0f, false, true, 7.25f, 18.0f)
                curveToRelative(0.0f, -2.789f, 1.062f, -5.33f, 2.803f, -7.24f)
                lineToRelative(5.144f, 5.144f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 14.5f, 18.0f)
                curveToRelative(0.0f, 0.786f, 0.26f, 1.512f, 0.697f, 2.096f)
                moveTo(18.0f, 20.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                moveToRelative(12.043f, -1.718f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, -1.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 1.414f)
                moveTo(5.957f, 17.218f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, 1.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                moveToRelative(8.07f, 11.31f)
                lineTo(16.84f, 21.5f)
                horizontalLineToRelative(2.323f)
                lineToRelative(2.81f, 7.027f)
                lineToRelative(1.29f, 3.223f)
                lineTo(12.739f, 31.75f)
                close()
            }
        }
            .build()
        return _ferrisWheelMedium!!
    }

private var _ferrisWheelMedium: ImageVector? = null
