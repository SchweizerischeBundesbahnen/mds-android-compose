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
                moveTo(16.0f, 7.32f)
                verticalLineToRelative(-0.928f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.928f)
                close()
                moveTo(16.0f, 9.177f)
                lineTo(16.0f, 8.25f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.928f)
                close()
                moveTo(16.0f, 11.035f)
                verticalLineToRelative(-0.93f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.93f)
                close()
                moveTo(16.0f, 12.892f)
                verticalLineToRelative(-0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.929f)
                close()
                moveTo(16.0f, 14.749f)
                verticalLineToRelative(-0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.929f)
                close()
                moveTo(16.0f, 16.606f)
                verticalLineToRelative(-0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.929f)
                close()
                moveTo(9.47f, 6.826f)
                lineTo(9.0f, 5.548f)
                lineToRelative(-0.47f, 1.28f)
                lineTo(7.55f, 9.5f)
                lineTo(3.6f, 9.5f)
                lineToRelative(1.083f, 0.887f)
                lineToRelative(1.923f, 1.573f)
                lineToRelative(-1.074f, 2.864f)
                lineToRelative(-0.544f, 1.452f)
                lineToRelative(1.29f, -0.86f)
                lineTo(9.0f, 13.6f)
                lineToRelative(2.723f, 1.815f)
                lineToRelative(1.268f, 0.845f)
                lineToRelative(-0.521f, -1.432f)
                lineToRelative(-1.075f, -2.957f)
                lineToRelative(1.91f, -1.477f)
                lineToRelative(1.16f, -0.895f)
                lineTo(10.45f, 9.499f)
                close()
                moveTo(8.37f, 10.171f)
                lineTo(9.0f, 8.452f)
                lineToRelative(0.63f, 1.72f)
                lineToRelative(0.12f, 0.328f)
                horizontalLineToRelative(1.785f)
                lineToRelative(-1.04f, 0.804f)
                lineToRelative(-0.29f, 0.223f)
                lineToRelative(0.125f, 0.344f)
                lineToRelative(0.68f, 1.867f)
                lineToRelative(-1.733f, -1.154f)
                lineTo(9.0f, 12.399f)
                lineToRelative(-0.277f, 0.185f)
                lineToRelative(-1.71f, 1.14f)
                lineToRelative(0.655f, -1.749f)
                lineToRelative(0.126f, -0.335f)
                lineToRelative(-0.277f, -0.227f)
                lineTo(6.4f, 10.5f)
                lineTo(8.25f, 10.5f)
                close()
            }
        }
        .build()
        return _ticketStarSmall!!
    }

private var _ticketStarSmall: ImageVector? = null
