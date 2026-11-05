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

public val SBBIcons.TicketDayLarge: ImageVector
    get() {
        if (_ticketDayLarge != null) {
            return _ticketDayLarge!!
        }
        _ticketDayLarge = Builder(
            name = "TicketDayLarge",
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
                moveTo(45.08f, 16.12f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(6.501f, 6.501f, 0.0f, true, false, 0.0f, 13.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-42.0f)
                verticalLineToRelative(-30.0f)
                horizontalLineToRelative(42.0f)
                close()
                moveTo(4.08f, 37.12f)
                horizontalLineToRelative(40.0f)
                lineTo(44.08f, 30.1f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -4.804f, -2.176f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 4.804f, -12.785f)
                lineTo(44.08f, 9.12f)
                horizontalLineToRelative(-40.0f)
                close()
                moveTo(33.08f, 36.12f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(13.08f, 15.12f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(19.001f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-20.0f, -0.05f)
                lineToRelative(-0.5f, -0.002f)
                lineTo(8.08f, 15.12f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(40.5f, 34.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(33.08f, 33.12f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(9.08f, 33.071f)
                lineTo(28.08f, 33.118f)
                lineTo(28.08f, 19.12f)
                horizontalLineToRelative(-19.0f)
                close()
                moveTo(19.61f, 30.121f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.8f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.72f)
                curveToRelative(0.602f, 0.043f, 1.201f, -0.109f, 1.71f, -0.431f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, false, 0.55f, -1.05f)
                horizontalLineToRelative(0.74f)
                close()
                moveTo(33.08f, 30.121f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.08f, 27.121f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.08f, 24.121f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.08f, 21.121f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(9.08f, 18.121f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-19.0f)
                close()
                moveTo(33.08f, 18.121f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.08f, 15.121f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(40.5f, 14.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(33.08f, 12.12f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _ticketDayLarge!!
    }

private var _ticketDayLarge: ImageVector? = null
