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

public val SBBIcons.SeatWindowReservationMedium: ImageVector
    get() {
        if (_seatWindowReservationMedium != null) {
            return _seatWindowReservationMedium!!
        }
        _seatWindowReservationMedium = Builder(name = "SeatWindowReservationMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(30.75f, 4.25f)
                curveToRelative(0.549f, 0.0f, 1.0f, 0.451f, 1.0f, 1.0f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.549f, -0.451f, 1.0f, -1.0f, 1.0f)
                lineTo(16.5f, 16.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(14.25f)
                curveToRelative(1.101f, 0.0f, 2.0f, -0.899f, 2.0f, -2.0f)
                lineTo(32.75f, 5.25f)
                curveToRelative(0.0f, -1.101f, -0.899f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-19.5f)
                curveToRelative(-1.101f, 0.0f, -2.0f, 0.899f, -2.0f, 2.0f)
                lineTo(9.25f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.549f, 0.451f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(10.75f, 10.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 3.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 5.5f, 0.0f)
                moveTo(10.1f, 28.75f)
                lineTo(21.0f, 28.75f)
                verticalLineToRelative(1.0f)
                lineTo(9.4f, 29.75f)
                lineToRelative(-0.12f, -0.33f)
                lineToRelative(-6.0f, -16.5f)
                lineToRelative(0.94f, -0.34f)
                close()
                moveTo(10.965f, 15.251f)
                close()
                horizontalLineToRelative(-0.015f)
                verticalLineToRelative(0.001f)
                curveToRelative(-1.334f, 0.01f, -2.233f, 1.327f, -1.791f, 2.571f)
                verticalLineToRelative(0.003f)
                lineToRelative(3.12f, 8.596f)
                lineToRelative(0.12f, 0.329f)
                horizontalLineToRelative(9.186f)
                curveToRelative(0.366f, 0.0f, 0.713f, 0.208f, 0.883f, 0.541f)
                lineToRelative(2.573f, 5.908f)
                lineToRelative(0.917f, -0.398f)
                lineToRelative(-2.58f, -5.926f)
                lineToRelative(-0.005f, -0.012f)
                lineToRelative(-0.006f, -0.011f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.782f, -1.102f)
                horizontalLineToRelative(-1.168f)
                lineToRelative(-5.75f, -4.314f)
                lineToRelative(-1.84f, -4.887f)
                verticalLineToRelative(-0.003f)
                lineToRelative(-0.061f, -0.143f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, false, -1.8f, -1.152f)
                moveToRelative(1.315f, 11.17f)
                lineToRelative(0.47f, -0.172f)
                verticalLineToRelative(0.001f)
                close()
                moveTo(20.266f, 26.232f)
                verticalLineToRelative(-0.002f)
                lineToRelative(-0.015f, 0.02f)
                verticalLineToRelative(0.001f)
                close()
                moveTo(10.1f, 17.483f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, true, 0.855f, -1.234f)
                curveToRelative(0.417f, 0.002f, 0.786f, 0.26f, 0.938f, 0.654f)
                lineToRelative(1.888f, 5.022f)
                lineToRelative(0.052f, 0.137f)
                lineToRelative(0.117f, 0.087f)
                lineToRelative(4.8f, 3.6f)
                lineTo(13.1f, 25.749f)
                close()
            }
        }
        .build()
        return _seatWindowReservationMedium!!
    }

private var _seatWindowReservationMedium: ImageVector? = null
