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

public val SBBIcons.TicketStarSmall: ImageVector
    get() {
        if (_ticketStarSmall != null) {
            return _ticketStarSmall!!
        }
        _ticketStarSmall = Builder(name = "TicketStarSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveToRelative(-2.0f, 4.179f)
                verticalLineToRelative(0.928f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.928f)
                close()
                moveTo(17.0f, 13.821f)
                verticalLineToRelative(0.929f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.929f)
                close()
                moveTo(17.0f, 11.964f)
                verticalLineToRelative(0.928f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.928f)
                close()
                moveTo(17.0f, 10.107f)
                verticalLineToRelative(0.929f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.929f)
                close()
                moveTo(17.0f, 8.25f)
                verticalLineToRelative(0.928f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.0f, 8.25f)
                close()
                moveTo(17.0f, 6.392f)
                verticalLineToRelative(0.929f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.929f)
                close()
                moveTo(10.45f, 9.5f)
                lineToRelative(-0.98f, -2.672f)
                lineTo(9.0f, 5.548f)
                lineToRelative(-0.47f, 1.28f)
                lineTo(7.55f, 9.5f)
                lineTo(3.6f, 9.5f)
                lineToRelative(1.084f, 0.886f)
                lineToRelative(1.921f, 1.573f)
                lineToRelative(-1.073f, 2.865f)
                lineToRelative(-0.545f, 1.452f)
                lineToRelative(1.29f, -0.86f)
                lineTo(9.0f, 13.6f)
                lineToRelative(2.723f, 1.816f)
                lineToRelative(1.268f, 0.846f)
                lineToRelative(-0.521f, -1.433f)
                lineToRelative(-1.076f, -2.957f)
                lineToRelative(1.912f, -1.477f)
                lineToRelative(1.159f, -0.895f)
                close()
                moveTo(8.249f, 10.5f)
                lineTo(8.369f, 10.172f)
                lineTo(9.0f, 8.452f)
                lineToRelative(0.63f, 1.72f)
                lineToRelative(0.121f, 0.328f)
                horizontalLineToRelative(1.784f)
                lineToRelative(-1.04f, 0.804f)
                lineToRelative(-0.29f, 0.223f)
                lineToRelative(0.125f, 0.344f)
                lineToRelative(0.679f, 1.867f)
                lineToRelative(-1.732f, -1.154f)
                lineTo(9.0f, 12.399f)
                lineToRelative(-0.277f, 0.185f)
                lineToRelative(-1.711f, 1.14f)
                lineToRelative(0.656f, -1.749f)
                lineToRelative(0.126f, -0.336f)
                lineToRelative(-0.277f, -0.226f)
                lineTo(6.4f, 10.5f)
                close()
            }
        }
        .build()
        return _ticketStarSmall!!
    }

private var _ticketStarSmall: ImageVector? = null
