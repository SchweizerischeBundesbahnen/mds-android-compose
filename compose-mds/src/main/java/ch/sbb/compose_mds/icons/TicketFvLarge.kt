package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.TicketFvLarge: ImageVector
    get() {
        if (_ticketFvLarge != null) {
            return _ticketFvLarge!!
        }
        _ticketFvLarge = Builder(
            name = "TicketFvLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(37.0f, 43.0f)
                lineTo(10.0f, 43.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(11.0f, 42.0f)
                horizontalLineToRelative(25.0f)
                lineTo(36.0f, 5.0f)
                lineTo(11.0f, 5.0f)
                close()
                moveTo(31.5f, 35.0f)
                horizontalLineToRelative(-16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(31.5f, 31.0f)
                horizontalLineToRelative(-16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(22.295f, 15.184f)
                horizontalLineToRelative(-4.95f)
                verticalLineToRelative(2.377f)
                horizontalLineToRelative(4.358f)
                verticalLineToRelative(1.605f)
                horizontalLineToRelative(-4.357f)
                verticalLineToRelative(4.358f)
                lineTo(15.5f, 23.524f)
                lineTo(15.5f, 13.5f)
                horizontalLineToRelative(6.795f)
                close()
                moveTo(24.53f, 13.5f)
                lineToRelative(2.504f, 7.508f)
                lineToRelative(2.516f, -7.508f)
                horizontalLineToRelative(1.965f)
                lineTo(27.93f, 23.523f)
                horizontalLineToRelative(-1.84f)
                lineToRelative(-0.072f, -0.199f)
                lineTo(22.51f, 13.5f)
                close()
            }
        }
            .build()
        return _ticketFvLarge!!
    }

private var _ticketFvLarge: ImageVector? = null
