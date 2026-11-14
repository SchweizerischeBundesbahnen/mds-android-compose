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

public val SBBIcons.TicketDisabledMedium: ImageVector
    get() {
        if (_ticketDisabledMedium != null) {
            return _ticketDisabledMedium!!
        }
        _ticketDisabledMedium = Builder(name = "TicketDisabledMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(31.853f, 31.147f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-2.105f, -2.104f)
                lineTo(3.25f, 29.75f)
                verticalLineToRelative(-22.0f)
                horizontalLineToRelative(3.792f)
                lineTo(4.146f, 4.854f)
                lineToRelative(0.707f, -0.707f)
                close()
                moveTo(25.167f, 25.875f)
                lineTo(28.041f, 28.75f)
                lineTo(4.25f, 28.75f)
                verticalLineToRelative(-20.0f)
                horizontalLineToRelative(3.791f)
                lineToRelative(16.75f, 16.75f)
                horizontalLineToRelative(-0.541f)
                verticalLineToRelative(0.375f)
                close()
                moveTo(31.75f, 13.773f)
                curveToRelative(-2.558f, 0.244f, -4.5f, 2.346f, -4.5f, 4.977f)
                reflectiveCurveToRelative(1.942f, 4.731f, 4.5f, 4.975f)
                lineTo(31.75f, 27.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.25f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-2.248f, 0.0f, -4.0f, -1.751f, -4.0f, -4.0f)
                curveToRelative(0.0f, -2.246f, 1.752f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-7.0f)
                lineTo(13.5f, 7.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(18.25f)
                close()
                moveTo(25.25f, 18.976f)
                verticalLineToRelative(0.524f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.524f)
                close()
                moveTo(25.25f, 16.881f)
                verticalLineToRelative(1.048f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.048f)
                close()
                moveTo(25.25f, 14.787f)
                verticalLineToRelative(1.047f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.047f)
                close()
                moveTo(25.25f, 12.692f)
                verticalLineToRelative(1.047f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.047f)
                close()
                moveTo(25.25f, 10.597f)
                verticalLineToRelative(1.047f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.047f)
                close()
                moveTo(25.25f, 9.026f)
                verticalLineToRelative(0.523f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.523f)
                close()
                moveTo(25.25f, 28.5f)
                verticalLineToRelative(-0.375f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.375f)
                close()
                moveTo(25.25f, 27.375f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.75f)
                close()
            }
        }
        .build()
        return _ticketDisabledMedium!!
    }

private var _ticketDisabledMedium: ImageVector? = null
