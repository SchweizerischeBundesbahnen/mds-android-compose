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

public val SBBIcons.TicketMoonStarSmall: ImageVector
    get() {
        if (_ticketMoonStarSmall != null) {
            return _ticketMoonStarSmall!!
        }
        _ticketMoonStarSmall = Builder(name = "TicketMoonStarSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 11.5f)
                curveToRelative(0.0f, -1.806f, 1.273f, -3.234f, 3.0f, -3.467f)
                lineTo(21.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-3.034f)
                curveToRelative(-1.727f, -0.233f, -3.0f, -1.66f, -3.0f, -3.466f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.424f, 1.076f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(5.0f)
                lineTo(2.0f, 19.0f)
                lineTo(2.0f, 4.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.424f, 0.0f, -2.5f, 1.076f, -2.5f, 2.5f)
                moveTo(13.0f, 7.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(13.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                lineTo(14.0f, 7.0f)
                close()
                moveTo(17.0f, 7.0f)
                lineTo(17.0f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.0f, 8.0f)
                close()
                moveTo(17.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(17.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(14.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(7.713f, 9.09f)
                arcTo(4.4f, 4.4f, 0.0f, false, false, 7.0f, 11.5f)
                arcToRelative(4.47f, 4.47f, 0.0f, false, false, 2.911f, 4.19f)
                curveToRelative(-0.432f, 0.196f, -0.907f, 0.31f, -1.411f, 0.31f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.787f, -6.91f)
                moveToRelative(3.491f, 5.877f)
                curveTo(9.41f, 14.816f, 8.0f, 13.327f, 8.0f, 11.5f)
                curveToRelative(0.0f, -1.03f, 0.454f, -1.949f, 1.172f, -2.594f)
                lineToRelative(0.855f, -0.769f)
                lineToRelative(-1.145f, -0.101f)
                lineToRelative(-0.09f, -0.01f)
                lineToRelative(-0.058f, -0.009f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.5f, 8.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.0f, 9.0f)
                curveToRelative(1.16f, 0.0f, 2.203f, -0.45f, 2.996f, -1.162f)
                lineToRelative(0.858f, -0.773f)
                close()
            }
        }
        .build()
        return _ticketMoonStarSmall!!
    }

private var _ticketMoonStarSmall: ImageVector? = null
