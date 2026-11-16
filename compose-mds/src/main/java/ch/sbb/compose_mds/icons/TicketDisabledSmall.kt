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

public val SBBIcons.TicketDisabledSmall: ImageVector
    get() {
        if (_ticketDisabledSmall != null) {
            return _ticketDisabledSmall!!
        }
        _ticketDisabledSmall = Builder(name = "TicketDisabledSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(21.353f, 20.647f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(19.292f, 20.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 5.0f)
                horizontalLineToRelative(2.292f)
                lineTo(2.646f, 3.354f)
                lineToRelative(0.707f, -0.707f)
                close()
                moveTo(16.793f, 17.5f)
                lineTo(18.292f, 19.0f)
                lineTo(17.0f, 19.0f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.5f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 6.0f)
                horizontalLineToRelative(2.292f)
                lineToRelative(11.0f, 11.0f)
                lineTo(16.0f, 17.0f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(21.0f, 9.034f)
                arcToRelative(3.463f, 3.463f, 0.0f, false, false, -3.0f, 3.466f)
                arcToRelative(3.46f, 3.46f, 0.0f, false, false, 3.0f, 3.465f)
                lineTo(21.0f, 18.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(2.467f, 2.467f, 0.0f, false, true, -2.5f, -2.5f)
                curveToRelative(0.0f, -1.406f, 1.093f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.5f)
                lineTo(22.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(17.0f, 12.418f)
                lineTo(17.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.582f)
                close()
                moveTo(17.0f, 10.091f)
                verticalLineToRelative(1.164f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.0f, 10.09f)
                close()
                moveTo(17.0f, 7.763f)
                verticalLineToRelative(1.164f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.0f, 7.763f)
                close()
                moveTo(17.0f, 6.017f)
                lineTo(17.0f, 6.6f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.582f)
                close()
            }
        }
        .build()
        return _ticketDisabledSmall!!
    }

private var _ticketDisabledSmall: ImageVector? = null
