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

public val SBBIcons.TicketRouteMedium: ImageVector
    get() {
        if (_ticketRouteMedium != null) {
            return _ticketRouteMedium!!
        }
        _ticketRouteMedium = Builder(name = "TicketRouteMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(27.25f, 17.25f)
                curveToRelative(0.0f, -2.658f, 1.922f, -4.738f, 4.5f, -4.977f)
                lineTo(31.75f, 7.25f)
                lineTo(4.25f, 7.25f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(27.5f)
                verticalLineToRelative(-5.025f)
                curveToRelative(-2.578f, -0.24f, -4.5f, -2.318f, -4.5f, -4.975f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 2.273f, 1.726f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(7.0f)
                lineTo(3.25f, 28.25f)
                verticalLineToRelative(-22.0f)
                horizontalLineToRelative(29.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-2.274f, 0.0f, -4.0f, 1.726f, -4.0f, 4.0f)
                moveTo(15.2f, 15.925f)
                lineTo(12.58f, 19.2f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -0.78f, -0.626f)
                lineToRelative(2.62f, -3.276f)
                arcToRelative(2.749f, 2.749f, 0.0f, true, true, 4.83f, -1.799f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -4.05f, 2.425f)
                moveToRelative(1.3f, -4.175f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, -3.5f)
                moveTo(12.25f, 21.0f)
                arcTo(1.75f, 1.75f, 0.0f, true, false, 8.748f, 21.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 12.25f, 21.0f)
                moveToRelative(13.0f, 6.0f)
                verticalLineToRelative(-0.488f)
                horizontalLineToRelative(-1.0f)
                lineTo(24.25f, 27.0f)
                close()
                moveTo(25.25f, 25.537f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 23.587f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 21.637f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 19.687f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 17.737f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 15.787f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 13.837f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 11.887f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 9.937f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(25.25f, 7.987f)
                lineTo(25.25f, 7.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.487f)
                close()
            }
        }
        .build()
        return _ticketRouteMedium!!
    }

private var _ticketRouteMedium: ImageVector? = null
