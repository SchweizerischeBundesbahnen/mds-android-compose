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
                moveTo(7.5f, 2.0f)
                curveTo(6.674f, 2.0f, 6.0f, 2.674f, 6.0f, 3.5f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.274f, 0.226f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.274f, 0.0f, 0.5f, 0.226f, 0.5f, 0.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.274f, -0.226f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.826f, 0.0f, 1.5f, -0.674f, 1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.826f, -0.674f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(6.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveTo(4.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(2.03f, 12.67f)
                lineToRelative(-4.0f, -11.0f)
                lineToRelative(0.94f, -0.34f)
                lineTo(6.85f, 19.0f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(6.15f)
                close()
                moveTo(7.3f, 10.0f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, true, 1.397f, 0.97f)
                verticalLineToRelative(0.004f)
                lineToRelative(1.21f, 3.214f)
                lineTo(13.667f, 17.0f)
                horizontalLineToRelative(0.723f)
                curveToRelative(0.556f, 0.0f, 1.081f, 0.314f, 1.337f, 0.826f)
                lineToRelative(0.006f, 0.012f)
                lineToRelative(0.005f, 0.012f)
                lineToRelative(1.72f, 3.95f)
                lineToRelative(-0.916f, 0.4f)
                lineToRelative(-1.714f, -3.936f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.39f, 18.0f)
                horizontalLineTo(8.15f)
                lineToRelative(-0.12f, -0.33f)
                lineToRelative(-2.08f, -5.73f)
                lineToRelative(-0.001f, -0.003f)
                arcTo(1.447f, 1.447f, 0.0f, false, true, 7.299f, 10.0f)
                moveToRelative(-0.41f, 1.601f)
                arcTo(0.447f, 0.447f, 0.0f, false, true, 7.306f, 11.0f)
                curveToRelative(0.206f, 0.002f, 0.39f, 0.13f, 0.468f, 0.328f)
                lineToRelative(1.259f, 3.348f)
                lineToRelative(0.051f, 0.136f)
                lineToRelative(0.117f, 0.088f)
                lineTo(12.0f, 17.0f)
                horizontalLineTo(8.85f)
                close()
            }
        }
        .build()
        return _seatWindowReservationSmall!!
    }

private var _seatWindowReservationSmall: ImageVector? = null
