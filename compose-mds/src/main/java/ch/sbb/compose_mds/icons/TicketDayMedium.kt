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

public val SBBIcons.TicketDayMedium: ImageVector
    get() {
        if (_ticketDayMedium != null) {
            return _ticketDayMedium!!
        }
        _ticketDayMedium = Builder(
            name = "TicketDayMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(3.75f, 6.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(22.0f)
                horizontalLineToRelative(29.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-2.274f, 0.0f, -4.0f, -1.727f, -4.0f, -4.0f)
                curveToRelative(0.0f, -2.274f, 1.726f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-29.0f)
                moveToRelative(0.5f, 21.0f)
                verticalLineToRelative(-20.0f)
                horizontalLineToRelative(27.5f)
                verticalLineToRelative(5.023f)
                curveToRelative(-2.578f, 0.239f, -4.5f, 2.32f, -4.5f, 4.977f)
                reflectiveCurveToRelative(1.922f, 4.737f, 4.5f, 4.977f)
                verticalLineToRelative(5.023f)
                close()
                moveTo(6.75f, 10.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(14.462f)
                lineToRelative(0.499f, 0.002f)
                lineToRelative(15.0f, 0.036f)
                horizontalLineToRelative(0.501f)
                verticalLineToRelative(-14.5f)
                horizontalLineToRelative(-3.0f)
                lineTo(19.25f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-8.0f)
                lineTo(10.25f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.75f)
                close()
                moveTo(7.25f, 24.215f)
                lineTo(7.25f, 14.75f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(9.498f)
                close()
                moveTo(21.25f, 13.75f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(13.75f, 19.25f)
                lineTo(12.0f, 19.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.75f)
                lineTo(13.75f, 16.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(24.25f, 7.5f)
                verticalLineToRelative(0.487f)
                horizontalLineToRelative(1.0f)
                lineTo(25.25f, 7.5f)
                close()
                moveTo(24.25f, 8.962f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 10.912f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 12.862f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 14.812f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 16.762f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 18.712f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 20.662f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 22.612f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 24.562f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 26.512f)
                lineTo(24.25f, 27.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.488f)
                close()
            }
        }
            .build()
        return _ticketDayMedium!!
    }

private var _ticketDayMedium: ImageVector? = null
