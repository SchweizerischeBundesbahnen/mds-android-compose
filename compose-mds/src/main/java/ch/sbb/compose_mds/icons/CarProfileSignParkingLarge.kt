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

public val SBBIcons.CarProfileSignParkingLarge: ImageVector
    get() {
        if (_carProfileSignParkingLarge != null) {
            return _carProfileSignParkingLarge!!
        }
        _carProfileSignParkingLarge = Builder(name = "CarProfileSignParkingLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(45.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 43.5f, 7.0f)
                horizontalLineToRelative(-8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 34.0f, 8.5f)
                verticalLineToRelative(11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                close()
                moveTo(46.0f, 19.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                lineTo(40.0f, 22.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(39.0f, 22.0f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 35.5f, 6.0f)
                horizontalLineToRelative(8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 46.0f, 8.5f)
                close()
                moveTo(40.0f, 10.002f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.002f, 3.997f)
                lineTo(38.0f, 13.999f)
                verticalLineToRelative(-3.998f)
                close()
                moveTo(40.002f, 14.999f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 40.0f, 9.002f)
                horizontalLineToRelative(-3.0f)
                lineTo(37.0f, 19.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(35.0f, 29.694f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.253f, -1.48f)
                lineToRelative(-1.31f, -0.218f)
                lineToRelative(0.525f, 1.313f)
                curveToRelative(0.107f, 0.26f, 0.214f, 0.442f, 0.32f, 0.555f)
                curveToRelative(0.095f, 0.103f, 0.172f, 0.132f, 0.244f, 0.136f)
                lineTo(35.0f, 30.0f)
                close()
                moveTo(35.0f, 31.0f)
                horizontalLineToRelative(-1.513f)
                lineToRelative(-0.012f, -0.002f)
                lineToRelative(-0.145f, -0.014f)
                curveToRelative(-0.603f, -0.098f, -0.965f, -0.595f, -1.195f, -1.075f)
                lineToRelative(-0.097f, -0.22f)
                lineToRelative(-0.002f, -0.004f)
                lineToRelative(-0.753f, -1.88f)
                lineTo(26.456f, 27.0f)
                lineTo(2.0f, 27.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-7.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.687f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.856f, 0.269f)
                lineToRelative(11.148f, 7.755f)
                lineToRelative(7.22f, 1.204f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 36.0f, 29.695f)
                lineTo(36.0f, 38.0f)
                horizontalLineToRelative(-7.027f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -8.945f, 0.0f)
                lineTo(4.973f, 38.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -2.784f, 3.667f)
                lineToRelative(-0.377f, -0.927f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 4.0f, 37.5f)
                curveToRelative(0.0f, -1.466f, -0.904f, -2.72f, -2.187f, -3.24f)
                lineToRelative(0.375f, -0.926f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 2.784f, 3.665f)
                horizontalLineToRelative(15.055f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 8.946f, 0.001f)
                lineTo(35.0f, 37.0f)
                close()
                moveTo(14.972f, 19.09f)
                lineTo(24.906f, 26.0f)
                lineTo(7.0f, 26.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.687f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.285f, 0.09f)
                moveTo(28.0f, 37.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                moveTo(24.5f, 36.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 24.499f, 39.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 24.5f, 36.0f)
                moveToRelative(0.0f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -0.001f, -5.002f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 24.5f, 40.0f)
                moveTo(12.0f, 28.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 29.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(7.0f, 34.0f)
                lineTo(7.006f, 28.0f)
                lineTo(6.006f, 27.998f)
                lineTo(6.0f, 33.998f)
                close()
            }
        }
        .build()
        return _carProfileSignParkingLarge!!
    }

private var _carProfileSignParkingLarge: ImageVector? = null
