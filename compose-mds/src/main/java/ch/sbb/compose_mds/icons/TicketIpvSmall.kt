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

public val SBBIcons.TicketIpvSmall: ImageVector
    get() {
        if (_ticketIpvSmall != null) {
            return _ticketIpvSmall!!
        }
        _ticketIpvSmall = Builder(name = "TicketIpvSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 22.0f)
                lineTo(20.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                verticalLineToRelative(20.0f)
                close()
                moveTo(19.0f, 21.0f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 3.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(17.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 17.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(8.12f, 12.012f)
                lineTo(8.12f, 7.015f)
                lineTo(7.0f, 7.015f)
                verticalLineToRelative(4.997f)
                close()
                moveTo(9.105f, 7.015f)
                horizontalLineToRelative(2.07f)
                quadToRelative(0.524f, 0.0f, 0.823f, 0.063f)
                quadToRelative(0.3f, 0.063f, 0.542f, 0.224f)
                quadToRelative(0.67f, 0.437f, 0.67f, 1.32f)
                quadToRelative(0.0f, 0.781f, -0.554f, 1.23f)
                quadToRelative(-0.236f, 0.19f, -0.537f, 0.275f)
                quadToRelative(-0.3f, 0.083f, -0.744f, 0.083f)
                horizontalLineToRelative(-1.15f)
                verticalLineToRelative(1.802f)
                horizontalLineToRelative(-1.12f)
                close()
                moveTo(10.225f, 7.938f)
                verticalLineToRelative(1.415f)
                horizontalLineToRelative(1.0f)
                quadToRelative(0.445f, 0.0f, 0.642f, -0.154f)
                quadToRelative(0.242f, -0.192f, 0.242f, -0.564f)
                quadToRelative(0.0f, -0.376f, -0.281f, -0.56f)
                quadToRelative(-0.204f, -0.138f, -0.663f, -0.137f)
                close()
                moveTo(16.295f, 12.012f)
                lineTo(18.0f, 7.015f)
                horizontalLineToRelative(-1.162f)
                lineToRelative(-1.172f, 3.742f)
                lineToRelative(-1.154f, -3.742f)
                lineTo(13.34f, 7.015f)
                lineToRelative(1.68f, 4.997f)
                close()
            }
        }
        .build()
        return _ticketIpvSmall!!
    }

private var _ticketIpvSmall: ImageVector? = null
