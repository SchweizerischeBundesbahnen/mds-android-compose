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

public val SBBIcons.TicketMachineSmall: ImageVector
    get() {
        if (_ticketMachineSmall != null) {
            return _ticketMachineSmall!!
        }
        _ticketMachineSmall = Builder(name = "TicketMachineSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 18.0f)
                lineTo(18.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(16.0f, 18.0f)
                lineTo(8.0f, 18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(17.0f, 17.0f)
                lineTo(17.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(16.0f, 4.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 5.0f)
                lineTo(8.0f, 4.0f)
                close()
                moveTo(16.0f, 10.0f)
                lineTo(16.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(14.0f, 7.0f)
                verticalLineToRelative(5.0f)
                lineTo(8.0f, 12.0f)
                lineTo(8.0f, 7.0f)
                close()
                moveTo(9.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                lineTo(13.0f, 8.0f)
                lineTo(9.0f, 8.0f)
                close()
                moveTo(14.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 13.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _ticketMachineSmall!!
    }

private var _ticketMachineSmall: ImageVector? = null
