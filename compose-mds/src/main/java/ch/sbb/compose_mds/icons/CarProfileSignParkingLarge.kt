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
                moveTo(35.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 34.0f, 8.5f)
                verticalLineToRelative(11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 43.5f, 7.0f)
                close()
                moveTo(33.0f, 8.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 35.5f, 6.0f)
                horizontalLineToRelative(8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 46.0f, 8.5f)
                verticalLineToRelative(11.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                lineTo(40.0f, 22.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(39.0f, 22.0f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                close()
                moveTo(37.5f, 9.0f)
                lineTo(37.0f, 9.0f)
                lineTo(37.0f, 19.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.002f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 40.0f, 9.002f)
                close()
                moveTo(40.002f, 14.0f)
                lineTo(38.0f, 14.0f)
                verticalLineToRelative(-3.998f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.002f, 3.997f)
                moveTo(6.0f, 19.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.686f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.857f, 0.269f)
                lineToRelative(11.15f, 7.756f)
                lineToRelative(7.218f, 1.203f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 36.0f, 29.694f)
                lineTo(36.0f, 38.0f)
                horizontalLineToRelative(-7.027f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -8.945f, 0.0f)
                lineTo(4.973f, 38.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -2.785f, 3.667f)
                lineToRelative(-0.376f, -0.926f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 4.0f, 37.5f)
                curveToRelative(0.0f, -1.466f, -0.904f, -2.72f, -2.188f, -3.24f)
                lineToRelative(0.376f, -0.926f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 2.784f, 3.665f)
                horizontalLineToRelative(15.055f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 8.946f, 0.001f)
                lineTo(35.0f, 37.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.513f)
                lineToRelative(-0.013f, -0.001f)
                curveToRelative(-0.789f, -0.041f, -1.2f, -0.736f, -1.436f, -1.31f)
                lineToRelative(-0.002f, -0.004f)
                lineToRelative(-0.753f, -1.881f)
                lineTo(26.456f, 27.0f)
                lineTo(2.0f, 27.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(32.437f, 27.996f)
                lineTo(32.963f, 29.311f)
                curveToRelative(0.107f, 0.259f, 0.214f, 0.44f, 0.319f, 0.553f)
                curveToRelative(0.091f, 0.098f, 0.165f, 0.13f, 0.234f, 0.135f)
                lineTo(35.0f, 29.999f)
                verticalLineToRelative(-0.305f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.253f, -1.48f)
                close()
                moveTo(14.972f, 19.09f)
                lineTo(24.905f, 26.0f)
                lineTo(7.0f, 26.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.686f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.286f, 0.09f)
                moveTo(24.5f, 34.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveTo(23.0f, 37.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.002f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 23.0f, 37.5f)
                moveToRelative(1.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 24.502f, 40.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 24.5f, 35.0f)
                moveTo(12.0f, 29.0f)
                lineTo(9.0f, 29.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(6.006f, 27.999f)
                lineTo(6.0f, 33.999f)
                lineTo(7.0f, 34.0f)
                lineToRelative(0.006f, -6.0f)
                close()
            }
        }
        .build()
        return _carProfileSignParkingLarge!!
    }

private var _carProfileSignParkingLarge: ImageVector? = null
