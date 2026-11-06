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

public val SBBIcons.TicketFvMedium: ImageVector
    get() {
        if (_ticketFvMedium != null) {
            return _ticketFvMedium!!
        }
        _ticketFvMedium = Builder(name = "TicketFvMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.75f, 3.25f)
                horizontalLineToRelative(20.5f)
                verticalLineToRelative(29.5f)
                lineTo(7.75f, 32.75f)
                lineTo(7.75f, 3.25f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(27.5f)
                horizontalLineToRelative(18.5f)
                lineTo(27.25f, 4.25f)
                close()
                moveTo(24.0f, 23.75f)
                lineTo(12.0f, 23.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(12.0f, 26.75f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                lineTo(12.0f, 25.75f)
                close()
                moveTo(12.0f, 18.018f)
                horizontalLineToRelative(1.384f)
                verticalLineToRelative(-3.269f)
                horizontalLineToRelative(3.268f)
                verticalLineToRelative(-1.204f)
                horizontalLineToRelative(-3.268f)
                verticalLineToRelative(-1.782f)
                horizontalLineToRelative(3.712f)
                lineTo(17.096f, 10.5f)
                lineTo(12.0f, 10.5f)
                close()
                moveTo(20.651f, 16.131f)
                lineTo(22.538f, 10.501f)
                lineTo(24.012f, 10.5f)
                lineTo(21.322f, 18.018f)
                horizontalLineToRelative(-1.38f)
                lineToRelative(-0.054f, -0.15f)
                lineToRelative(-2.63f, -7.368f)
                horizontalLineToRelative(1.515f)
                close()
            }
        }
        .build()
        return _ticketFvMedium!!
    }

private var _ticketFvMedium: ImageVector? = null
