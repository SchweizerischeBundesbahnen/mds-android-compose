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
                moveTo(11.25f, 3.25f)
                curveToRelative(-1.101f, 0.0f, -2.0f, 0.899f, -2.0f, 2.0f)
                lineTo(9.25f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.549f, 0.451f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(19.5f)
                curveToRelative(0.549f, 0.0f, 1.0f, 0.451f, 1.0f, 1.0f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.549f, -0.451f, 1.0f, -1.0f, 1.0f)
                lineTo(16.5f, 16.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(14.25f)
                curveToRelative(1.101f, 0.0f, 2.0f, -0.899f, 2.0f, -2.0f)
                lineTo(32.75f, 5.25f)
                curveToRelative(0.0f, -1.101f, -0.899f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(9.0f, 8.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                moveTo(6.25f, 10.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.5f, 0.0f)
                moveToRelative(3.03f, 18.92f)
                lineToRelative(-6.0f, -16.5f)
                lineToRelative(0.94f, -0.34f)
                lineToRelative(5.88f, 16.17f)
                lineTo(21.0f, 28.75f)
                verticalLineToRelative(1.0f)
                lineTo(9.4f, 29.75f)
                close()
                moveTo(10.95f, 15.25f)
                horizontalLineToRelative(0.015f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, 1.861f, 1.296f)
                lineToRelative(0.002f, 0.003f)
                lineToRelative(1.838f, 4.889f)
                lineToRelative(5.75f, 4.312f)
                horizontalLineToRelative(1.169f)
                curveToRelative(0.741f, 0.0f, 1.441f, 0.42f, 1.782f, 1.101f)
                lineToRelative(0.006f, 0.012f)
                lineToRelative(0.005f, 0.012f)
                lineToRelative(2.58f, 5.925f)
                lineToRelative(-0.916f, 0.4f)
                lineToRelative(-2.575f, -5.912f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.882f, -0.538f)
                lineTo(12.4f, 26.75f)
                lineToRelative(-0.12f, -0.33f)
                lineToRelative(-3.12f, -8.594f)
                lineToRelative(-0.001f, -0.004f)
                curveToRelative(-0.442f, -1.244f, 0.457f, -2.562f, 1.79f, -2.572f)
                moveToRelative(-0.85f, 2.236f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, true, 0.857f, -1.236f)
                curveToRelative(0.416f, 0.003f, 0.784f, 0.26f, 0.935f, 0.653f)
                lineToRelative(1.89f, 5.023f)
                lineToRelative(0.051f, 0.137f)
                lineToRelative(0.117f, 0.087f)
                lineToRelative(4.8f, 3.6f)
                lineTo(13.1f, 25.75f)
                lineToRelative(-2.999f, -8.262f)
                close()
            }
        }
        .build()
        return _seatWindowReservationMedium!!
    }

private var _seatWindowReservationMedium: ImageVector? = null
