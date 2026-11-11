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
        _ticketDayMedium = Builder(name = "TicketDayMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(31.75f, 12.273f)
                curveToRelative(-2.578f, 0.24f, -4.5f, 2.32f, -4.5f, 4.977f)
                reflectiveCurveToRelative(1.922f, 4.736f, 4.5f, 4.975f)
                verticalLineToRelative(5.025f)
                lineTo(4.25f, 27.25f)
                verticalLineToRelative(-20.0f)
                horizontalLineToRelative(27.5f)
                close()
                moveTo(32.25f, 21.25f)
                curveToRelative(-2.274f, 0.0f, -4.0f, -1.727f, -4.0f, -4.0f)
                curveToRelative(0.0f, -2.274f, 1.726f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-7.0f)
                lineTo(3.25f, 6.25f)
                verticalLineToRelative(22.0f)
                horizontalLineToRelative(29.5f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(22.25f, 25.25f)
                verticalLineToRelative(-14.5f)
                horizontalLineToRelative(-3.0f)
                lineTo(19.25f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-8.0f)
                lineTo(10.25f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(14.462f)
                lineToRelative(0.499f, 0.001f)
                lineToRelative(15.0f, 0.037f)
                close()
                moveTo(7.25f, 24.214f)
                lineTo(7.25f, 14.75f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(9.498f)
                close()
                moveTo(7.25f, 13.75f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.75f, 18.25f)
                lineTo(12.0f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(25.25f, 27.0f)
                verticalLineToRelative(-0.488f)
                horizontalLineToRelative(-1.0f)
                lineTo(24.25f, 27.0f)
                close()
                moveTo(25.25f, 25.537f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 23.587f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 21.637f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 19.687f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 17.737f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 15.787f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 13.837f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 11.887f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 9.937f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 7.987f)
                lineTo(25.25f, 7.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.487f)
                close()
            }
        }
        .build()
        return _ticketDayMedium!!
    }

private var _ticketDayMedium: ImageVector? = null
