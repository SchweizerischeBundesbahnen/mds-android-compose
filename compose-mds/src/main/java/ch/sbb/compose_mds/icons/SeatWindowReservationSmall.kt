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

public val SBBIcons.SeatWindowReservationSmall: ImageVector
    get() {
        if (_seatWindowReservationSmall != null) {
            return _seatWindowReservationSmall!!
        }
        _seatWindowReservationSmall = Builder(name = "SeatWindowReservationSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.5f, 3.0f)
                curveToRelative(0.274f, 0.0f, 0.5f, 0.226f, 0.5f, 0.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.274f, -0.226f, 0.5f, -0.5f, 0.5f)
                lineTo(11.0f, 11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.826f, 0.0f, 1.5f, -0.674f, 1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.826f, -0.674f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-13.0f)
                curveTo(6.674f, 2.0f, 6.0f, 2.674f, 6.0f, 3.5f)
                lineTo(6.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.274f, 0.226f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(7.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                moveTo(6.85f, 19.0f)
                lineTo(14.0f, 19.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.15f, 20.0f)
                lineToRelative(-0.12f, -0.33f)
                lineToRelative(-4.0f, -11.0f)
                lineToRelative(0.94f, -0.34f)
                close()
                moveTo(7.31f, 10.001f)
                close()
                lineTo(7.3f, 10.001f)
                verticalLineToRelative(0.001f)
                arcToRelative(1.445f, 1.445f, 0.0f, false, false, -1.402f, 1.76f)
                lineToRelative(0.05f, 0.177f)
                lineToRelative(0.001f, 0.002f)
                lineToRelative(2.08f, 5.73f)
                lineToRelative(0.12f, 0.33f)
                horizontalLineToRelative(6.24f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.438f, 0.264f)
                lineToRelative(1.714f, 3.935f)
                lineToRelative(0.917f, -0.398f)
                lineToRelative(-1.72f, -3.95f)
                lineToRelative(-0.005f, -0.013f)
                lineToRelative(-0.006f, -0.012f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.39f, 17.0f)
                horizontalLineToRelative(-0.723f)
                lineToRelative(-3.75f, -2.813f)
                lineToRelative(-1.209f, -3.213f)
                lineToRelative(-0.002f, -0.003f)
                arcTo(1.51f, 1.51f, 0.0f, false, false, 7.31f, 10.0f)
                moveToRelative(8.429f, 7.85f)
                lineToRelative(-0.467f, 0.202f)
                lineToRelative(0.01f, -0.005f)
                close()
                moveTo(8.029f, 17.67f)
                lineTo(8.5f, 17.498f)
                verticalLineToRelative(0.001f)
                close()
                moveTo(5.949f, 11.94f)
                lineTo(6.379f, 11.783f)
                lineTo(6.445f, 11.76f)
                close()
                moveTo(13.509f, 17.486f)
                close()
                lineToRelative(-0.009f, 0.013f)
                verticalLineToRelative(0.001f)
                close()
                moveTo(6.89f, 11.6f)
                arcToRelative(0.447f, 0.447f, 0.0f, false, true, 0.417f, -0.6f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, 0.466f, 0.325f)
                verticalLineToRelative(0.001f)
                lineToRelative(1.26f, 3.35f)
                lineToRelative(0.051f, 0.136f)
                lineToRelative(0.116f, 0.088f)
                lineTo(12.0f, 17.0f)
                lineTo(8.851f, 17.0f)
                close()
            }
        }
        .build()
        return _seatWindowReservationSmall!!
    }

private var _seatWindowReservationSmall: ImageVector? = null
