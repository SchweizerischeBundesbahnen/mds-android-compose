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

public val SBBIcons.TicketStarMedium: ImageVector
    get() {
        if (_ticketStarMedium != null) {
            return _ticketStarMedium!!
        }
        _ticketStarMedium = Builder(
            name = "TicketStarMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
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
                moveToRelative(20.0f, 0.737f)
                lineTo(24.25f, 7.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.487f)
                close()
                moveTo(24.25f, 9.937f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(24.25f, 11.887f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(24.25f, 13.837f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(24.25f, 15.787f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(24.25f, 17.737f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(24.25f, 19.687f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(24.25f, 21.637f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(24.25f, 23.587f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(24.25f, 25.537f)
                verticalLineToRelative(-0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.975f)
                close()
                moveTo(24.25f, 27.0f)
                verticalLineToRelative(-0.488f)
                horizontalLineToRelative(1.0f)
                lineTo(25.25f, 27.0f)
                close()
                moveTo(13.97f, 10.327f)
                lineToRelative(-0.47f, -1.28f)
                lineToRelative(-0.47f, 1.28f)
                lineTo(11.5f, 14.5f)
                lineTo(6.1f, 14.5f)
                lineToRelative(1.083f, 0.887f)
                lineToRelative(3.023f, 2.474f)
                lineToRelative(-1.674f, 4.464f)
                lineToRelative(-0.544f, 1.451f)
                lineToRelative(1.29f, -0.86f)
                lineTo(13.5f, 20.1f)
                lineToRelative(4.223f, 2.816f)
                lineToRelative(1.268f, 0.845f)
                lineToRelative(-0.521f, -1.432f)
                lineToRelative(-1.675f, -4.607f)
                lineToRelative(3.01f, -2.327f)
                lineToRelative(1.16f, -0.896f)
                lineTo(15.5f, 14.499f)
                close()
                moveTo(12.32f, 15.172f)
                lineTo(13.5f, 11.952f)
                lineTo(14.68f, 15.172f)
                lineTo(14.8f, 15.499f)
                horizontalLineToRelative(3.235f)
                lineToRelative(-2.14f, 1.655f)
                lineToRelative(-0.29f, 0.223f)
                lineToRelative(0.125f, 0.343f)
                lineToRelative(1.28f, 3.518f)
                lineToRelative(-3.233f, -2.154f)
                lineToRelative(-0.277f, -0.185f)
                lineToRelative(-0.277f, 0.184f)
                lineToRelative(-3.21f, 2.14f)
                lineToRelative(1.255f, -3.348f)
                lineToRelative(0.126f, -0.335f)
                lineToRelative(-0.277f, -0.227f)
                lineTo(8.9f, 15.5f)
                lineTo(12.2f, 15.5f)
                close()
            }
        }
            .build()
        return _ticketStarMedium!!
    }

private var _ticketStarMedium: ImageVector? = null
