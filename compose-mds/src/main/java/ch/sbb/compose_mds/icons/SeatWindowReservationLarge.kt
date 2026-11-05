package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.SeatWindowReservationLarge: ImageVector
    get() {
        if (_seatWindowReservationLarge != null) {
            return _seatWindowReservationLarge!!
        }
        _seatWindowReservationLarge = Builder(name = "SeatWindowReservationLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.12f, 20.001f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, 2.251f, 1.441f)
                lineToRelative(0.076f, 0.178f)
                lineToRelative(0.001f, 0.004f)
                lineToRelative(2.469f, 6.563f)
                lineTo(26.668f, 34.0f)
                horizontalLineToRelative(1.612f)
                curveToRelative(0.869f, 0.0f, 1.692f, 0.461f, 2.143f, 1.22f)
                lineToRelative(0.085f, 0.156f)
                lineToRelative(0.006f, 0.013f)
                lineToRelative(0.005f, 0.011f)
                lineToRelative(3.44f, 7.9f)
                lineToRelative(-0.458f, 0.2f)
                lineToRelative(-0.459f, 0.2f)
                lineToRelative(-3.432f, -7.882f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 28.28f, 35.0f)
                lineTo(16.15f, 35.0f)
                lineToRelative(-0.12f, -0.33f)
                lineToRelative(-4.16f, -11.46f)
                verticalLineToRelative(-0.003f)
                curveToRelative(-0.552f, -1.553f, 0.57f, -3.193f, 2.23f, -3.206f)
                lineTo(14.1f, 20.0f)
                horizontalLineToRelative(0.02f)
                close()
                moveTo(12.85f, 38.0f)
                lineTo(28.0f, 38.0f)
                verticalLineToRelative(1.0f)
                lineTo(12.15f, 39.0f)
                lineToRelative(-0.12f, -0.33f)
                lineToRelative(-8.0f, -22.0f)
                lineToRelative(0.94f, -0.34f)
                close()
                moveTo(14.111f, 21.0f)
                arcToRelative(1.393f, 1.393f, 0.0f, false, false, -1.3f, 1.87f)
                lineTo(16.85f, 34.0f)
                lineTo(25.0f, 34.0f)
                lineToRelative(-6.8f, -5.1f)
                lineToRelative(-0.116f, -0.087f)
                lineToRelative(-0.052f, -0.137f)
                lineToRelative(-2.518f, -6.697f)
                arcTo(1.51f, 1.51f, 0.0f, false, false, 14.11f, 21.0f)
                moveTo(40.5f, 4.0f)
                curveTo(41.876f, 4.0f, 43.0f, 5.124f, 43.0f, 6.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.376f, -1.124f, 2.5f, -2.5f, 2.5f)
                lineTo(21.0f, 23.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.5f)
                curveToRelative(0.824f, 0.0f, 1.5f, -0.676f, 1.5f, -1.5f)
                verticalLineToRelative(-14.0f)
                curveToRelative(0.0f, -0.824f, -0.676f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-26.0f)
                curveToRelative(-0.824f, 0.0f, -1.5f, 0.676f, -1.5f, 1.5f)
                lineTo(13.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(12.0f, 6.5f)
                curveTo(12.0f, 5.124f, 13.124f, 4.0f, 14.5f, 4.0f)
                close()
                moveTo(11.5f, 10.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
            }
        }
        .build()
        return _seatWindowReservationLarge!!
    }

private var _seatWindowReservationLarge: ImageVector? = null
