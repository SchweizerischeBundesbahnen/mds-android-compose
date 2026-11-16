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

public val SBBIcons.TicketPercentMedium: ImageVector
    get() {
        if (_ticketPercentMedium != null) {
            return _ticketPercentMedium!!
        }
        _ticketPercentMedium = Builder(name = "TicketPercentMedium", defaultWidth = 36.0.dp,
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
                moveToRelative(-16.004f, -5.254f)
                arcToRelative(1.749f, 1.749f, 0.0f, true, false, -3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.749f, 2.749f, 0.0f, true, true, -5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.5f, 0.0f)
                moveTo(16.5f, 20.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, -0.002f, 3.501f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.002f, -3.501f)
                moveToRelative(0.0f, 4.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, -5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, 5.5f)
                moveToRelative(4.104f, -14.397f)
                lineToRelative(-13.5f, 13.5f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(13.5f, -13.5f)
                close()
                moveTo(25.25f, 27.0f)
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
        return _ticketPercentMedium!!
    }

private var _ticketPercentMedium: ImageVector? = null
