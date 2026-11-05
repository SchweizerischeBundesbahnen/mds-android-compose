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

public val SBBIcons.TicketDaySmall: ImageVector
    get() {
        if (_ticketDaySmall != null) {
            return _ticketDaySmall!!
        }
        _ticketDaySmall = Builder(
            name = "TicketDaySmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(2.5f, 4.0f)
                lineTo(2.0f, 4.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.424f, 0.0f, -2.5f, -1.076f, -2.5f, -2.5f)
                reflectiveCurveTo(20.076f, 9.0f, 21.5f, 9.0f)
                horizontalLineToRelative(0.5f)
                lineTo(22.0f, 4.0f)
                lineTo(2.5f, 4.0f)
                moveTo(3.0f, 18.0f)
                lineTo(3.0f, 5.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(0.464f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.033f)
                curveToRelative(-1.727f, 0.233f, -3.0f, 1.66f, -3.0f, 3.467f)
                curveToRelative(0.0f, 1.806f, 1.273f, 3.234f, 3.0f, 3.467f)
                lineTo(21.0f, 18.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-0.465f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.0f, 18.0f)
                close()
                moveTo(4.5f, 7.0f)
                lineTo(4.0f, 7.0f)
                verticalLineToRelative(9.975f)
                horizontalLineToRelative(0.499f)
                lineToRelative(10.0f, 0.025f)
                lineTo(15.0f, 17.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 7.0f)
                lineTo(7.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(5.0f, 15.977f)
                lineTo(5.0f, 10.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(5.999f)
                close()
                moveTo(14.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 8.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(9.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                lineTo(9.0f, 15.0f)
                close()
                moveTo(16.0f, 6.393f)
                verticalLineToRelative(0.928f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.928f)
                close()
                moveTo(16.0f, 8.25f)
                verticalLineToRelative(0.928f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 8.25f)
                close()
                moveTo(16.0f, 10.107f)
                verticalLineToRelative(0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.93f)
                close()
                moveTo(16.0f, 11.964f)
                verticalLineToRelative(0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.929f)
                close()
                moveTo(16.0f, 13.821f)
                verticalLineToRelative(0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.929f)
                close()
                moveTo(16.0f, 15.678f)
                verticalLineToRelative(0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.929f)
                close()
            }
        }
            .build()
        return _ticketDaySmall!!
    }

private var _ticketDaySmall: ImageVector? = null
