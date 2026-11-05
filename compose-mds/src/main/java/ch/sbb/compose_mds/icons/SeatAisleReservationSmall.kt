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

public val SBBIcons.SeatAisleReservationSmall: ImageVector
    get() {
        if (_seatAisleReservationSmall != null) {
            return _seatAisleReservationSmall!!
        }
        _seatAisleReservationSmall = Builder(name = "SeatAisleReservationSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(1.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                moveTo(4.03f, 8.67f)
                lineToRelative(4.0f, 11.0f)
                lineToRelative(0.12f, 0.33f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(8.85f)
                lineTo(4.97f, 8.33f)
                close()
                moveTo(9.31f, 10.0f)
                horizontalLineTo(9.3f)
                arcToRelative(1.447f, 1.447f, 0.0f, false, false, -1.351f, 1.937f)
                verticalLineToRelative(0.004f)
                lineToRelative(2.08f, 5.73f)
                lineToRelative(0.12f, 0.329f)
                horizontalLineToRelative(6.24f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.439f, 0.264f)
                lineTo(18.54f, 22.2f)
                lineToRelative(0.917f, -0.4f)
                lineToRelative(-1.72f, -3.95f)
                lineToRelative(-0.005f, -0.012f)
                lineToRelative(-0.006f, -0.012f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.39f, 17.0f)
                horizontalLineToRelative(-0.723f)
                lineToRelative(-3.75f, -2.812f)
                lineToRelative(-1.21f, -3.214f)
                verticalLineToRelative(-0.004f)
                arcTo(1.51f, 1.51f, 0.0f, false, false, 9.31f, 10.0f)
                moveToRelative(-0.005f, 1.0f)
                arcToRelative(0.447f, 0.447f, 0.0f, false, false, -0.414f, 0.601f)
                lineTo(10.85f, 17.0f)
                horizontalLineTo(14.0f)
                lineToRelative(-2.8f, -2.1f)
                lineToRelative(-0.117f, -0.088f)
                lineToRelative(-0.051f, -0.136f)
                lineToRelative(-1.26f, -3.348f)
                arcTo(0.51f, 0.51f, 0.0f, false, false, 9.306f, 11.0f)
            }
        }
        .build()
        return _seatAisleReservationSmall!!
    }

private var _seatAisleReservationSmall: ImageVector? = null
