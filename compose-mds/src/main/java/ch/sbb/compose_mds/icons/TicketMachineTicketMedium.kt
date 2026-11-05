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

public val SBBIcons.TicketMachineTicketMedium: ImageVector
    get() {
        if (_ticketMachineTicketMedium != null) {
            return _ticketMachineTicketMedium!!
        }
        _ticketMachineTicketMedium = Builder(
            name = "TicketMachineTicketMedium",
            defaultWidth =
                36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight =
            36.0f,
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
                moveTo(4.75f, 3.25f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(23.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(6.0f)
                lineTo(6.25f, 32.75f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(4.75f, 3.25f)
                moveToRelative(2.5f, 23.5f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(5.0f)
                lineTo(7.25f, 31.75f)
                close()
                moveTo(21.25f, 25.75f)
                lineTo(5.75f, 25.75f)
                lineTo(5.75f, 4.25f)
                horizontalLineToRelative(15.5f)
                close()
                moveTo(7.5f, 7.25f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-12.0f)
                close()
                moveTo(18.25f, 15.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1.0f)
                lineTo(19.25f, 15.0f)
                close()
                moveTo(8.25f, 10.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-8.0f)
                moveToRelative(0.5f, 6.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(24.25f, 13.75f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(-13.0f)
                moveToRelative(7.5f, 1.0f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(27.0f, 23.75f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(30.0f, 20.75f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(8.25f, 19.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-8.0f)
                moveToRelative(0.5f, 1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(0.5f)
                close()
            }
        }
            .build()
        return _ticketMachineTicketMedium!!
    }

private var _ticketMachineTicketMedium: ImageVector? = null
