package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.TicketMachineTicketSmall: ImageVector
    get() {
        if (_ticketMachineTicketSmall != null) {
            return _ticketMachineTicketSmall!!
        }
        _ticketMachineTicketSmall = Builder(name = "TicketMachineTicketSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                lineTo(3.0f, 18.0f)
                lineTo(3.0f, 2.0f)
                moveToRelative(2.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 21.0f)
                close()
                moveTo(4.5f, 17.0f)
                lineTo(4.0f, 17.0f)
                lineTo(4.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(14.0f)
                lineTo(4.5f, 17.0f)
                moveTo(5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                lineTo(13.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                close()
                moveTo(12.0f, 10.0f)
                lineTo(12.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(5.5f, 7.0f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 7.0f)
                lineTo(5.5f, 7.0f)
                moveToRelative(0.5f, 4.0f)
                lineTo(6.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(16.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(16.0f, 9.0f)
                moveToRelative(5.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(18.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(5.5f, 13.0f)
                lineTo(5.0f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.5f, 13.0f)
            }
        }
        .build()
        return _ticketMachineTicketSmall!!
    }

private var _ticketMachineTicketSmall: ImageVector? = null
