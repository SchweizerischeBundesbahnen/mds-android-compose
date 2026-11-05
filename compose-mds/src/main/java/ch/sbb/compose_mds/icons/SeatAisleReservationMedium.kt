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
        _seatAisleReservationMedium = Builder(
            name = "SeatAisleReservationMedium",
            defaultWidth =
                36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight =
            36.0f,
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
                moveTo(10.25f, 10.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -3.5f, 0.0f)
                moveTo(12.0f, 7.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, -5.5f)
                moveToRelative(-5.72f, 5.17f)
                lineToRelative(6.0f, 16.5f)
                lineToRelative(0.12f, 0.33f)
                lineTo(24.0f, 29.75f)
                verticalLineToRelative(-1.0f)
                lineTo(13.1f, 28.75f)
                lineTo(7.22f, 12.58f)
                close()
                moveTo(13.965f, 15.25f)
                horizontalLineToRelative(-0.015f)
                curveToRelative(-1.334f, 0.01f, -2.233f, 1.328f, -1.791f, 2.572f)
                verticalLineToRelative(0.004f)
                lineToRelative(3.12f, 8.595f)
                lineToRelative(0.12f, 0.329f)
                horizontalLineToRelative(9.186f)
                curveToRelative(0.365f, 0.0f, 0.711f, 0.206f, 0.882f, 0.538f)
                lineToRelative(2.575f, 5.912f)
                lineToRelative(0.916f, -0.4f)
                lineToRelative(-2.58f, -5.925f)
                lineToRelative(-0.005f, -0.012f)
                lineToRelative(-0.006f, -0.012f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.782f, -1.101f)
                horizontalLineToRelative(-1.168f)
                lineToRelative(-5.75f, -4.312f)
                lineToRelative(-1.84f, -4.889f)
                verticalLineToRelative(-0.003f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, false, -1.862f, -1.296f)
                moveToRelative(-0.008f, 1.0f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, false, -0.856f, 1.236f)
                verticalLineToRelative(0.002f)
                lineToRelative(3.0f, 8.262f)
                horizontalLineToRelative(5.649f)
                lineToRelative(-4.8f, -3.6f)
                lineToRelative(-0.117f, -0.087f)
                lineToRelative(-0.051f, -0.137f)
                lineToRelative(-1.89f, -5.023f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, -0.934f, -0.653f)
            }
        }
            .build()
        return _seatAisleReservationMedium!!
    }

private var _seatAisleReservationMedium: ImageVector? = null
