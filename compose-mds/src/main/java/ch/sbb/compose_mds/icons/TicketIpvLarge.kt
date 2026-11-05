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

public val SBBIcons.TicketIpvLarge: ImageVector
    get() {
        if (_ticketIpvLarge != null) {
            return _ticketIpvLarge!!
        }
        _ticketIpvLarge = Builder(name = "TicketIpvLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.0f, 43.0f)
                lineTo(10.0f, 43.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineToRelative(29.0f)
                close()
                moveTo(11.0f, 42.0f)
                horizontalLineToRelative(27.0f)
                lineTo(38.0f, 5.0f)
                lineTo(11.0f, 5.0f)
                close()
                moveTo(33.5f, 35.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(33.5f, 31.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(15.74f, 23.523f)
                lineTo(13.5f, 23.523f)
                verticalLineToRelative(-9.994f)
                horizontalLineToRelative(2.24f)
                close()
                moveTo(21.85f, 13.529f)
                quadToRelative(1.047f, 0.0f, 1.646f, 0.127f)
                quadToRelative(0.601f, 0.127f, 1.085f, 0.447f)
                quadToRelative(1.338f, 0.875f, 1.339f, 2.64f)
                quadToRelative(0.0f, 1.564f, -1.11f, 2.46f)
                quadToRelative(-0.469f, 0.383f, -1.07f, 0.55f)
                quadToRelative(-0.605f, 0.168f, -1.489f, 0.168f)
                horizontalLineToRelative(-2.302f)
                verticalLineToRelative(3.602f)
                lineTo(17.71f, 23.523f)
                verticalLineToRelative(-9.994f)
                close()
                moveTo(30.832f, 21.015f)
                lineTo(33.176f, 13.529f)
                lineTo(35.5f, 13.529f)
                lineToRelative(-3.411f, 9.994f)
                lineTo(29.54f, 23.523f)
                lineToRelative(-3.36f, -9.994f)
                horizontalLineToRelative(2.344f)
                close()
                moveTo(19.949f, 18.205f)
                horizontalLineToRelative(2.0f)
                quadToRelative(0.892f, 0.0f, 1.284f, -0.308f)
                quadToRelative(0.484f, -0.382f, 0.484f, -1.127f)
                quadToRelative(0.0f, -0.752f, -0.56f, -1.122f)
                quadToRelative(-0.41f, -0.273f, -1.327f, -0.273f)
                horizontalLineToRelative(-1.88f)
                close()
            }
        }
        .build()
        return _ticketIpvLarge!!
    }

private var _ticketIpvLarge: ImageVector? = null
