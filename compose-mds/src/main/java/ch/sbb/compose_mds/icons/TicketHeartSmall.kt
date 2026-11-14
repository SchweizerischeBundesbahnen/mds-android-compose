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

public val SBBIcons.TicketHeartSmall: ImageVector
    get() {
        if (_ticketHeartSmall != null) {
            return _ticketHeartSmall!!
        }
        _ticketHeartSmall = Builder(name = "TicketHeartSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 11.5f)
                curveToRelative(0.0f, -1.806f, 1.273f, -3.234f, 3.0f, -3.467f)
                lineTo(21.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(0.464f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-0.464f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 18.0f)
                horizontalLineToRelative(4.0f)
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
                moveToRelative(-5.998f, -1.577f)
                curveToRelative(0.0f, -0.24f, -0.04f, -0.467f, -0.109f, -0.675f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-0.052f, -0.138f)
                curveTo(12.561f, 8.435f, 11.953f, 8.0f, 11.273f, 8.0f)
                curveToRelative(-0.551f, 0.0f, -1.047f, 0.288f, -1.37f, 0.76f)
                lineToRelative(-0.411f, 0.605f)
                lineToRelative(-0.413f, -0.604f)
                lineToRelative(-0.13f, -0.169f)
                arcTo(1.63f, 1.63f, 0.0f, false, false, 7.709f, 8.0f)
                curveToRelative(-0.924f, 0.0f, -1.732f, 0.814f, -1.732f, 1.923f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 0.49f, 1.356f)
                lineToRelative(3.024f, 3.29f)
                lineToRelative(2.995f, -3.259f)
                curveToRelative(0.084f, -0.113f, 0.242f, -0.336f, 0.283f, -0.413f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 0.233f, -0.974f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, -0.348f, 1.439f)
                lineToRelative(-0.002f, 0.003f)
                lineToRelative(-0.401f, -0.213f)
                lineToRelative(-0.103f, -0.054f)
                lineToRelative(0.504f, 0.267f)
                curveToRelative(-0.084f, 0.159f, -0.298f, 0.455f, -0.376f, 0.558f)
                lineToRelative(-0.4f, -0.301f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.399f, 0.301f)
                lineToRelative(-0.015f, 0.02f)
                lineToRelative(-0.015f, 0.017f)
                lineToRelative(-3.388f, 3.687f)
                lineToRelative(-0.368f, 0.4f)
                lineToRelative(-0.368f, -0.4f)
                lineToRelative(-3.392f, -3.691f)
                lineToRelative(-0.008f, -0.008f)
                verticalLineToRelative(-0.001f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.423f, -0.637f)
                lineToRelative(-0.074f, -0.158f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, -0.249f, -1.229f)
                curveTo(4.976f, 8.341f, 6.156f, 7.0f, 7.708f, 7.0f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 1.783f, 0.714f)
                arcTo(2.6f, 2.6f, 0.0f, false, true, 11.273f, 7.0f)
                curveToRelative(1.209f, 0.0f, 2.198f, 0.823f, 2.568f, 1.93f)
                curveToRelative(0.104f, 0.312f, 0.16f, 0.646f, 0.16f, 0.993f)
                moveTo(17.0f, 16.607f)
                verticalLineToRelative(-0.928f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.928f)
                close()
                moveTo(17.0f, 14.75f)
                verticalLineToRelative(-0.929f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.929f)
                close()
                moveTo(17.0f, 12.892f)
                verticalLineToRelative(-0.928f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.928f)
                close()
                moveTo(17.0f, 11.036f)
                verticalLineToRelative(-0.929f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.929f)
                close()
                moveTo(17.0f, 9.178f)
                lineTo(17.0f, 8.25f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.928f)
                close()
                moveTo(17.0f, 7.321f)
                verticalLineToRelative(-0.929f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.929f)
                close()
            }
        }
        .build()
        return _ticketHeartSmall!!
    }

private var _ticketHeartSmall: ImageVector? = null
