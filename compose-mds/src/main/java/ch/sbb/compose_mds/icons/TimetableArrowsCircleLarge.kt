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

public val SBBIcons.TimetableArrowsCircleLarge: ImageVector
    get() {
        if (_timetableArrowsCircleLarge != null) {
            return _timetableArrowsCircleLarge!!
        }
        _timetableArrowsCircleLarge = Builder(name = "TimetableArrowsCircleLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.0f, 32.492f)
                curveTo(43.0f, 38.23f, 38.101f, 42.0f, 32.5f, 42.0f)
                curveToRelative(-3.65f, 0.0f, -7.49f, -1.578f, -9.5f, -4.455f)
                verticalLineToRelative(3.462f)
                horizontalLineToRelative(-1.0f)
                lineTo(22.0f, 35.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.751f)
                curveToRelative(1.506f, 3.126f, 5.39f, 5.0f, 9.251f, 5.0f)
                curveToRelative(5.19f, 0.0f, 9.5f, -3.454f, 9.5f, -8.508f)
                close()
                moveTo(18.0f, 38.0f)
                lineTo(3.0f, 38.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(18.0f, 32.0f)
                lineTo(3.0f, 32.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(32.878f, 21.01f)
                curveToRelative(1.895f, 0.081f, 3.927f, 0.737f, 5.697f, 1.773f)
                curveToRelative(1.327f, 0.777f, 2.53f, 1.783f, 3.425f, 2.95f)
                lineTo(42.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.661f)
                curveToRelative(-0.81f, -1.313f, -2.092f, -2.477f, -3.592f, -3.355f)
                curveToRelative(-1.653f, -0.968f, -3.526f, -1.563f, -5.231f, -1.637f)
                lineTo(32.499f, 22.0f)
                curveToRelative(-5.189f, -0.01f, -9.488f, 3.445f, -9.498f, 8.501f)
                lineToRelative(-1.0f, -0.002f)
                curveToRelative(0.012f, -5.736f, 4.897f, -9.51f, 10.5f, -9.499f)
                close()
                moveTo(18.0f, 26.0f)
                lineTo(3.0f, 26.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(18.0f, 20.0f)
                lineTo(3.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(18.0f, 14.0f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(30.0f, 14.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(44.001f, 14.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(18.0f, 7.999f)
                lineTo(3.0f, 7.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(30.0f, 7.999f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(44.001f, 7.999f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
            }
        }
        .build()
        return _timetableArrowsCircleLarge!!
    }

private var _timetableArrowsCircleLarge: ImageVector? = null
