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

public val SBBIcons.TicketFvSmall: ImageVector
    get() {
        if (_ticketFvSmall != null) {
            return _ticketFvSmall!!
        }
        _ticketFvSmall = Builder(name = "TicketFvSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(20.0f)
                lineTo(5.0f, 22.0f)
                lineTo(5.0f, 2.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 3.0f)
                close()
                moveTo(16.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(8.0f, 18.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 17.0f)
                close()
                moveTo(8.0f, 12.012f)
                horizontalLineToRelative(0.923f)
                lineTo(8.923f, 9.833f)
                horizontalLineToRelative(2.179f)
                lineTo(11.102f, 9.03f)
                horizontalLineToRelative(-2.18f)
                lineTo(8.922f, 7.842f)
                horizontalLineToRelative(2.476f)
                lineTo(11.398f, 7.0f)
                lineTo(8.0f, 7.0f)
                close()
                moveTo(13.768f, 10.754f)
                lineTo(15.025f, 7.0f)
                horizontalLineToRelative(0.983f)
                lineToRelative(-1.793f, 5.012f)
                horizontalLineToRelative(-0.92f)
                lineToRelative(-0.036f, -0.1f)
                lineTo(11.505f, 7.0f)
                horizontalLineToRelative(1.01f)
                close()
            }
        }
        .build()
        return _ticketFvSmall!!
    }

private var _ticketFvSmall: ImageVector? = null
