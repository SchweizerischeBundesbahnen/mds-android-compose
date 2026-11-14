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

public val SBBIcons.TimetableArrowsCircleSmall: ImageVector
    get() {
        if (_timetableArrowsCircleSmall != null) {
            return _timetableArrowsCircleSmall!!
        }
        _timetableArrowsCircleSmall = Builder(name = "TimetableArrowsCircleSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 4.0f)
                lineTo(9.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(15.0f, 4.0f)
                lineTo(15.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(15.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(11.0f, 6.0f)
                close()
                moveTo(22.0f, 7.0f)
                lineTo(22.0f, 6.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(22.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(17.0f, 3.0f)
                close()
                moveTo(9.0f, 7.0f)
                lineTo(9.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(9.0f, 9.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 10.0f)
                lineTo(2.0f, 9.0f)
                close()
                moveTo(9.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(9.0f, 15.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(9.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.5f, 10.0f)
                curveToRelative(1.053f, 0.002f, 2.189f, 0.354f, 3.164f, 0.925f)
                curveToRelative(0.485f, 0.284f, 0.943f, 0.63f, 1.336f, 1.026f)
                lineTo(21.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.599f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, -1.44f, -1.212f)
                curveToRelative(-0.85f, -0.498f, -1.815f, -0.786f, -2.66f, -0.788f)
                curveToRelative(-2.49f, -0.005f, -4.494f, 1.643f, -4.498f, 4.001f)
                lineToRelative(-1.0f, -0.002f)
                curveToRelative(0.006f, -3.038f, 2.595f, -5.005f, 5.5f, -4.999f)
                moveTo(14.0f, 17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.697f)
                curveToRelative(0.809f, 1.24f, 2.486f, 2.0f, 4.197f, 2.0f)
                curveToRelative(2.493f, 0.0f, 4.5f, -1.648f, 4.5f, -4.004f)
                horizontalLineToRelative(1.0f)
                curveTo(22.0f, 19.036f, 19.403f, 21.0f, 16.5f, 21.0f)
                curveToRelative(-1.636f, 0.0f, -3.376f, -0.614f, -4.5f, -1.78f)
                verticalLineToRelative(0.784f)
                horizontalLineToRelative(-1.0f)
                lineTo(11.0f, 17.0f)
                close()
            }
        }
        .build()
        return _timetableArrowsCircleSmall!!
    }

private var _timetableArrowsCircleSmall: ImageVector? = null
