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

public val SBBIcons.SeatAisleReservationMedium: ImageVector
    get() {
        if (_seatAisleReservationMedium != null) {
            return _seatAisleReservationMedium!!
        }
        _seatAisleReservationMedium = Builder(name = "SeatAisleReservationMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 8.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, -3.5f)
                moveToRelative(0.0f, 4.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, -5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, 5.5f)
                moveToRelative(12.0f, 15.5f)
                lineTo(13.1f, 28.75f)
                lineTo(7.22f, 12.58f)
                lineToRelative(-0.94f, 0.34f)
                lineToRelative(6.0f, 16.5f)
                lineToRelative(0.12f, 0.33f)
                lineTo(24.0f, 29.75f)
                close()
                moveTo(13.965f, 15.25f)
                close()
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, 1.801f, 1.152f)
                lineToRelative(0.06f, 0.143f)
                lineToRelative(0.002f, 0.003f)
                lineToRelative(1.838f, 4.887f)
                lineToRelative(5.751f, 4.314f)
                horizontalLineToRelative(1.168f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.782f, 1.102f)
                lineToRelative(0.006f, 0.011f)
                lineToRelative(0.005f, 0.012f)
                lineToRelative(2.58f, 5.926f)
                lineToRelative(-0.917f, 0.398f)
                lineToRelative(-2.573f, -5.908f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, -0.541f)
                lineTo(15.4f, 26.749f)
                lineToRelative(-0.12f, -0.33f)
                lineToRelative(0.47f, -0.17f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-0.47f, 0.172f)
                lineToRelative(-3.12f, -8.596f)
                lineToRelative(-0.001f, -0.003f)
                curveToRelative(-0.442f, -1.244f, 0.457f, -2.561f, 1.79f, -2.571f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(23.265f, 26.23f)
                lineTo(23.25f, 26.25f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(13.955f, 16.25f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, false, -0.855f, 1.234f)
                lineToRelative(3.001f, 8.266f)
                horizontalLineToRelative(5.648f)
                lineToRelative(-4.8f, -3.6f)
                lineToRelative(-0.116f, -0.087f)
                lineToRelative(-0.051f, -0.137f)
                lineToRelative(-1.889f, -5.022f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, -0.937f, -0.654f)
            }
        }
        .build()
        return _seatAisleReservationMedium!!
    }

private var _seatAisleReservationMedium: ImageVector? = null
