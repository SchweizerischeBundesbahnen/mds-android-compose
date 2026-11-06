package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.TicketDisabledLarge: ImageVector
    get() {
        if (_ticketDisabledLarge != null) {
            return _ticketDisabledLarge!!
        }
        _ticketDisabledLarge = Builder(name = "TicketDisabledLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(41.853f, 41.147f)
                lineToRelative(-0.708f, 0.706f)
                lineTo(38.293f, 39.0f)
                lineTo(4.0f, 39.0f)
                lineTo(4.0f, 10.0f)
                horizontalLineToRelative(5.292f)
                lineTo(5.146f, 5.854f)
                lineToRelative(0.707f, -0.708f)
                close()
                moveTo(5.0f, 38.0f)
                horizontalLineToRelative(32.292f)
                lineTo(33.0f, 33.708f)
                lineTo(33.0f, 34.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.792f)
                lineTo(10.292f, 11.0f)
                lineTo(5.0f, 11.0f)
                close()
                moveTo(33.0f, 37.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(32.0f, 37.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 36.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(43.0f, 19.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-3.09f, 0.0f, -5.5f, 2.412f, -5.5f, 5.5f)
                curveToRelative(0.0f, 3.09f, 2.41f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.021f)
                curveToRelative(-3.4f, -0.248f, -6.0f, -3.005f, -6.0f, -6.479f)
                curveToRelative(0.0f, -3.472f, 2.6f, -6.231f, 6.0f, -6.48f)
                lineTo(42.0f, 11.0f)
                lineTo(17.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(26.0f)
                close()
                moveTo(41.0f, 34.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(33.0f, 25.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.499f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 24.004f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.997f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 22.009f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.997f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 20.014f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.997f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 18.019f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.997f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 16.023f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.997f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 14.029f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.998f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(41.0f, 14.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(33.0f, 12.034f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.499f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _ticketDisabledLarge!!
    }

private var _ticketDisabledLarge: ImageVector? = null
