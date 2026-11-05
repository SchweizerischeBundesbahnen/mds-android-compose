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

public val SBBIcons.TicketParkingLarge: ImageVector
    get() {
        if (_ticketParkingLarge != null) {
            return _ticketParkingLarge!!
        }
        _ticketParkingLarge = Builder(
            name = "TicketParkingLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(43.0f, 18.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-3.124f, 0.0f, -5.5f, 2.376f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.376f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(9.0f)
                lineTo(4.0f, 38.0f)
                lineTo(4.0f, 9.0f)
                horizontalLineToRelative(39.0f)
                close()
                moveTo(5.0f, 15.0f)
                horizontalLineToRelative(10.787f)
                lineToRelative(0.148f, 0.224f)
                lineToRelative(3.834f, 5.792f)
                lineTo(23.5f, 21.016f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 27.0f, 24.5f)
                lineTo(27.0f, 30.0f)
                horizontalLineToRelative(-4.337f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.163f, 2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.163f, -2.0f)
                lineTo(8.663f, 30.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.5f, 32.0f)
                curveToRelative(-0.172f, 0.0f, -0.338f, -0.017f, -0.5f, -0.043f)
                lineTo(5.0f, 37.0f)
                horizontalLineToRelative(37.0f)
                verticalLineToRelative(-7.02f)
                curveToRelative(-3.429f, -0.243f, -6.0f, -2.972f, -6.0f, -6.48f)
                reflectiveCurveToRelative(2.57f, -6.238f, 6.0f, -6.481f)
                lineTo(42.0f, 10.0f)
                lineTo(5.0f, 10.0f)
                close()
                moveTo(33.0f, 36.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(32.0f, 36.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 35.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(41.0f, 34.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(33.0f, 33.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(5.5f, 26.0f)
                quadToRelative(-0.253f, 0.002f, -0.5f, 0.06f)
                verticalLineToRelative(4.88f)
                curveToRelative(0.165f, 0.037f, 0.331f, 0.06f, 0.5f, 0.06f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                moveToRelative(14.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveTo(33.0f, 31.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(19.5f, 27.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveTo(5.0f, 25.042f)
                quadToRelative(0.243f, -0.04f, 0.5f, -0.042f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.464f, 4.0f)
                horizontalLineToRelative(7.072f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 6.928f, 0.0f)
                lineTo(26.0f, 29.0f)
                verticalLineToRelative(-4.484f)
                curveToRelative(0.0f, -1.382f, -1.118f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.269f)
                lineToRelative(-0.148f, -0.224f)
                lineTo(15.249f, 16.0f)
                lineTo(5.0f, 16.0f)
                close()
                moveTo(19.5f, 28.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(33.0f, 29.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 27.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 25.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 23.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(13.925f, 19.215f)
                lineTo(15.917f, 22.225f)
                lineTo(15.5f, 22.501f)
                lineTo(15.083f, 22.777f)
                lineTo(13.239f, 19.991f)
                lineTo(11.0f, 19.991f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.776f)
                close()
                moveTo(33.0f, 21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 19.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 17.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 15.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(41.0f, 14.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(33.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _ticketParkingLarge!!
    }

private var _ticketParkingLarge: ImageVector? = null
