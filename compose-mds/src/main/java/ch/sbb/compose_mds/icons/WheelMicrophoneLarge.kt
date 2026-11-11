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

public val SBBIcons.WheelMicrophoneLarge: ImageVector
    get() {
        if (_wheelMicrophoneLarge != null) {
            return _wheelMicrophoneLarge!!
        }
        _wheelMicrophoneLarge = Builder(name = "WheelMicrophoneLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.0f, 2.0f)
                curveTo(11.85f, 2.0f, 2.0f, 11.85f, 2.0f, 24.0f)
                reflectiveCurveToRelative(9.85f, 22.0f, 22.0f, 22.0f)
                curveToRelative(2.25f, 0.0f, 4.319f, -0.296f, 6.371f, -0.928f)
                lineToRelative(-0.295f, -0.955f)
                curveToRelative(-1.95f, 0.6f, -3.919f, 0.883f, -6.076f, 0.883f)
                curveToRelative(-11.598f, 0.0f, -21.0f, -9.402f, -21.0f, -21.0f)
                reflectiveCurveTo(12.402f, 3.0f, 24.0f, 3.0f)
                curveToRelative(7.335f, 0.0f, 13.934f, 3.706f, 17.688f, 9.394f)
                lineToRelative(0.834f, -0.551f)
                curveTo(38.585f, 5.876f, 31.673f, 2.0f, 24.0f, 2.0f)
                moveToRelative(0.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                moveToRelative(0.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                moveToRelative(13.5f, 9.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, -3.5f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 7.0f, 0.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, 3.5f)
                moveTo(42.0f, 19.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, -9.0f, 0.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 9.0f, 0.0f)
                close()
                moveTo(37.0f, 45.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.012f)
                curveToRelative(4.416f, -0.212f, 8.0f, -3.238f, 8.0f, -7.988f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 4.277f, -3.306f, 7.0f, -7.5f, 7.0f)
                reflectiveCurveTo(30.0f, 38.277f, 30.0f, 34.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 4.75f, 3.584f, 7.776f, 8.0f, 7.988f)
                close()
                moveTo(6.0f, 24.0f)
                curveToRelative(0.0f, -9.941f, 8.059f, -18.0f, 18.0f, -18.0f)
                curveToRelative(5.493f, 0.0f, 10.508f, 2.429f, 13.835f, 6.306f)
                lineToRelative(-0.759f, 0.65f)
                curveTo(33.936f, 9.297f, 29.196f, 7.0f, 24.0f, 7.0f)
                curveTo(14.611f, 7.0f, 7.0f, 14.611f, 7.0f, 24.0f)
                reflectiveCurveToRelative(7.611f, 17.0f, 17.0f, 17.0f)
                curveToRelative(1.747f, 0.0f, 3.34f, -0.23f, 4.919f, -0.715f)
                lineToRelative(0.294f, 0.956f)
                curveTo(27.533f, 41.758f, 25.84f, 42.0f, 24.0f, 42.0f)
                curveToRelative(-9.941f, 0.0f, -18.0f, -8.059f, -18.0f, -18.0f)
            }
        }
        .build()
        return _wheelMicrophoneLarge!!
    }

private var _wheelMicrophoneLarge: ImageVector? = null
