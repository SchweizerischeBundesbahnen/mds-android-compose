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
                moveTo(8.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                moveToRelative(0.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                moveToRelative(8.0f, 10.0f)
                lineTo(8.85f, 19.0f)
                lineTo(4.97f, 8.33f)
                lineToRelative(-0.94f, 0.34f)
                lineToRelative(4.0f, 11.0f)
                lineToRelative(0.12f, 0.33f)
                lineTo(16.0f, 20.0f)
                close()
                moveTo(9.31f, 10.0f)
                close()
                arcToRelative(1.51f, 1.51f, 0.0f, false, true, 1.396f, 0.97f)
                lineToRelative(0.002f, 0.003f)
                lineToRelative(1.208f, 3.213f)
                lineTo(15.667f, 17.0f)
                horizontalLineToRelative(0.723f)
                curveToRelative(0.556f, 0.0f, 1.08f, 0.314f, 1.337f, 0.826f)
                lineToRelative(0.006f, 0.012f)
                lineToRelative(0.005f, 0.013f)
                lineToRelative(-0.456f, 0.197f)
                lineToRelative(-0.01f, 0.005f)
                lineToRelative(0.466f, -0.202f)
                lineToRelative(1.72f, 3.95f)
                lineToRelative(-0.917f, 0.398f)
                lineToRelative(-1.714f, -3.935f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 16.39f, 18.0f)
                horizontalLineToRelative(-6.24f)
                lineToRelative(-0.12f, -0.33f)
                lineToRelative(0.47f, -0.17f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-0.47f, 0.172f)
                lineToRelative(-2.08f, -5.73f)
                lineToRelative(0.496f, -0.18f)
                lineToRelative(-0.068f, 0.023f)
                lineToRelative(-0.429f, 0.156f)
                verticalLineToRelative(-0.002f)
                lineToRelative(-0.051f, -0.177f)
                arcTo(1.445f, 1.445f, 0.0f, false, true, 9.3f, 10.0f)
                lineTo(9.3f, 10.0f)
                close()
                moveTo(15.51f, 17.486f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.01f, 0.013f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(9.306f, 11.0f)
                arcToRelative(0.447f, 0.447f, 0.0f, false, false, -0.416f, 0.6f)
                lineToRelative(1.96f, 5.4f)
                lineTo(14.0f, 17.0f)
                lineToRelative(-2.8f, -2.1f)
                lineToRelative(-0.117f, -0.088f)
                lineToRelative(-0.052f, -0.136f)
                lineToRelative(-1.26f, -3.35f)
                arcTo(0.51f, 0.51f, 0.0f, false, false, 9.307f, 11.0f)
            }
        }
        .build()
        return _seatAisleReservationSmall!!
    }

private var _seatAisleReservationSmall: ImageVector? = null
