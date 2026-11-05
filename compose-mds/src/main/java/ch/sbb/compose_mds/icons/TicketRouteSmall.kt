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

public val SBBIcons.TicketRouteSmall: ImageVector
    get() {
        if (_ticketRouteSmall != null) {
            return _ticketRouteSmall!!
        }
        _ticketRouteSmall = Builder(name = "TicketRouteSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 4.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.424f, 0.0f, -2.5f, 1.076f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.076f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(5.0f)
                lineTo(2.0f, 19.0f)
                lineTo(2.0f, 4.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-0.465f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 18.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.033f)
                curveToRelative(-1.727f, -0.233f, -3.0f, -1.661f, -3.0f, -3.467f)
                reflectiveCurveToRelative(1.273f, -3.234f, 3.0f, -3.467f)
                lineTo(21.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(0.464f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.0f, 5.0f)
                close()
                moveTo(10.18f, 10.825f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -0.78f, -0.625f)
                lineToRelative(-1.58f, 1.975f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.78f, 0.625f)
                close()
                moveTo(10.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 11.998f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 9.0f)
                moveToRelative(-3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(9.0f, -6.607f)
                verticalLineToRelative(0.928f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.928f)
                close()
                moveTo(16.0f, 8.25f)
                verticalLineToRelative(0.928f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 8.25f)
                close()
                moveTo(16.0f, 10.107f)
                verticalLineToRelative(0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.93f)
                close()
                moveTo(16.0f, 11.964f)
                verticalLineToRelative(0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.929f)
                close()
                moveTo(16.0f, 13.821f)
                verticalLineToRelative(0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.929f)
                close()
                moveTo(16.0f, 15.678f)
                verticalLineToRelative(0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.929f)
                close()
            }
        }
        .build()
        return _ticketRouteSmall!!
    }

private var _ticketRouteSmall: ImageVector? = null
