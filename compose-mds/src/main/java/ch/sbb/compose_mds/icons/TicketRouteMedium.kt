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
                moveTo(3.25f, 6.25f)
                horizontalLineToRelative(29.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-2.274f, 0.0f, -4.0f, 1.726f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.726f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(7.0f)
                lineTo(3.25f, 28.25f)
                verticalLineToRelative(-22.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(27.5f)
                verticalLineToRelative(-5.023f)
                curveToRelative(-2.578f, -0.24f, -4.5f, -2.32f, -4.5f, -4.977f)
                reflectiveCurveToRelative(1.922f, -4.738f, 4.5f, -4.977f)
                lineTo(31.75f, 7.25f)
                lineTo(4.25f, 7.25f)
                moveToRelative(10.95f, 8.674f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, -0.78f, -0.625f)
                lineToRelative(-2.62f, 3.276f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.78f, 0.625f)
                close()
                moveTo(14.75f, 13.5f)
                arcToRelative(1.749f, 1.749f, 0.0f, true, true, 3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -3.5f, 0.0f)
                moveToRelative(-4.25f, 5.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                moveTo(24.25f, 7.5f)
                verticalLineToRelative(0.487f)
                horizontalLineToRelative(1.0f)
                lineTo(25.25f, 7.5f)
                close()
                moveTo(24.25f, 8.962f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 10.912f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 12.862f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 14.812f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 16.762f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 18.712f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 20.662f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 22.612f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 24.562f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 26.512f)
                lineTo(24.25f, 27.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.488f)
                close()
            }
        }
        .build()
        return _ticketRouteMedium!!
    }

private var _ticketRouteMedium: ImageVector? = null
