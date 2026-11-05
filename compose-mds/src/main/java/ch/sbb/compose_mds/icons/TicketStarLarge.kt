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

public val SBBIcons.TicketStarLarge: ImageVector
    get() {
        if (_ticketStarLarge != null) {
            return _ticketStarLarge!!
        }
        _ticketStarLarge = Builder(
            name = "TicketStarLarge",
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
                moveTo(43.0f, 18.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-3.124f, 0.0f, -5.5f, 2.376f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.376f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(9.0f)
                lineTo(4.0f, 38.0f)
                lineTo(4.0f, 9.0f)
                horizontalLineToRelative(39.0f)
                close()
                moveTo(5.0f, 37.0f)
                horizontalLineToRelative(37.0f)
                verticalLineToRelative(-7.02f)
                curveToRelative(-3.429f, -0.243f, -6.0f, -2.972f, -6.0f, -6.48f)
                reflectiveCurveToRelative(2.57f, -6.238f, 6.0f, -6.481f)
                lineTo(42.0f, 10.0f)
                lineTo(5.0f, 10.0f)
                close()
                moveTo(33.0f, 36.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(32.0f, 36.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 35.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(40.0f, 34.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(33.0f, 33.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.97f, 14.328f)
                lineTo(20.05f, 20.0f)
                horizontalLineToRelative(6.915f)
                lineToRelative(-1.16f, 0.895f)
                lineToRelative(-4.11f, 3.176f)
                lineToRelative(2.275f, 6.258f)
                lineToRelative(0.521f, 1.433f)
                lineToRelative(-1.268f, -0.846f)
                lineToRelative(-5.723f, -3.815f)
                lineToRelative(-5.723f, 3.815f)
                lineToRelative(-1.29f, 0.86f)
                lineToRelative(0.545f, -1.452f)
                lineToRelative(2.274f, -6.064f)
                lineToRelative(-4.122f, -3.373f)
                lineTo(8.1f, 20.0f)
                horizontalLineToRelative(6.85f)
                lineToRelative(2.08f, -5.672f)
                lineToRelative(0.47f, -1.28f)
                close()
                moveTo(33.0f, 31.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(15.77f, 20.672f)
                lineToRelative(-0.12f, 0.328f)
                lineTo(10.9f, 21.0f)
                lineToRelative(3.317f, 2.713f)
                lineToRelative(0.277f, 0.227f)
                lineToRelative(-0.126f, 0.335f)
                lineToRelative(-1.856f, 4.949f)
                lineToRelative(4.71f, -3.14f)
                lineToRelative(0.278f, -0.185f)
                lineToRelative(0.277f, 0.185f)
                lineToRelative(4.732f, 3.154f)
                lineToRelative(-2.004f, -5.51f)
                lineToRelative(0.289f, -0.224f)
                lineTo(24.035f, 21.0f)
                horizontalLineToRelative(-4.684f)
                lineToRelative(-0.12f, -0.328f)
                lineToRelative(-1.731f, -4.72f)
                close()
                moveTo(33.0f, 29.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 27.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 25.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 23.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 19.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 17.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 15.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(40.0f, 14.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(33.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _ticketStarLarge!!
    }

private var _ticketStarLarge: ImageVector? = null
