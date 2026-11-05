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

public val SBBIcons.TicketMachineMedium: ImageVector
    get() {
        if (_ticketMachineMedium != null) {
            return _ticketMachineMedium!!
        }
        _ticketMachineMedium = Builder(
            name = "TicketMachineMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                moveTo(9.75f, 3.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(23.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.5f)
                lineTo(26.75f, 3.25f)
                horizontalLineToRelative(-17.0f)
                moveToRelative(14.5f, 23.5f)
                horizontalLineToRelative(-12.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(12.5f)
                close()
                moveTo(25.25f, 25.75f)
                horizontalLineToRelative(0.5f)
                lineTo(25.75f, 4.25f)
                horizontalLineToRelative(-15.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(15.0f)
                moveTo(24.0f, 7.25f)
                lineTo(12.0f, 7.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(22.75f, 10.5f)
                lineTo(22.75f, 15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(12.25f, 10.75f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(-7.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(12.75f, 19.75f)
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
        return _ticketMachineMedium!!
    }

private var _ticketMachineMedium: ImageVector? = null
