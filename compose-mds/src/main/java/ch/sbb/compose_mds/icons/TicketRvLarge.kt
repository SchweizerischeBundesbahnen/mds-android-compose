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

public val SBBIcons.TicketRvLarge: ImageVector
    get() {
        if (_ticketRvLarge != null) {
            return _ticketRvLarge!!
        }
        _ticketRvLarge = Builder(name = "TicketRvLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(37.0f, 43.0f)
                lineTo(10.0f, 43.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(11.0f, 42.0f)
                horizontalLineToRelative(25.0f)
                lineTo(36.0f, 5.0f)
                lineTo(11.0f, 5.0f)
                close()
                moveTo(31.5f, 35.0f)
                horizontalLineToRelative(-16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(31.5f, 31.0f)
                horizontalLineToRelative(-16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(20.106f, 13.504f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, true, 2.015f, 0.458f)
                curveToRelative(0.403f, 0.245f, 0.733f, 0.594f, 0.955f, 1.01f)
                curveToRelative(0.222f, 0.433f, 0.335f, 0.913f, 0.328f, 1.4f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.465f, 1.62f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, -0.699f, 0.664f)
                curveToRelative(0.216f, 0.137f, 0.4f, 0.319f, 0.54f, 0.534f)
                curveToRelative(0.15f, 0.217f, 0.258f, 0.463f, 0.316f, 0.722f)
                curveToRelative(0.039f, 0.2f, 0.095f, 0.711f, 0.183f, 1.657f)
                curveToRelative(0.096f, 1.034f, 0.246f, 1.274f, 0.291f, 1.323f)
                lineToRelative(0.553f, 0.635f)
                horizontalLineToRelative(-2.242f)
                lineToRelative(-0.09f, -0.13f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.234f, -0.624f)
                curveToRelative(-0.032f, -0.2f, -0.063f, -0.629f, -0.1f, -1.386f)
                curveToRelative(-0.045f, -0.9f, -0.246f, -1.488f, -0.578f, -1.704f)
                curveToRelative(-0.42f, -0.201f, -0.888f, -0.285f, -1.352f, -0.242f)
                horizontalLineToRelative(-2.181f)
                verticalLineToRelative(4.086f)
                lineTo(15.5f, 23.527f)
                lineTo(15.5f, 13.504f)
                close()
                moveTo(25.551f, 13.504f)
                lineTo(28.055f, 21.012f)
                lineTo(30.57f, 13.504f)
                horizontalLineToRelative(1.965f)
                lineTo(28.95f, 23.527f)
                horizontalLineToRelative(-1.84f)
                lineToRelative(-0.072f, -0.199f)
                lineToRelative(-3.508f, -9.824f)
                close()
                moveTo(17.346f, 17.836f)
                horizontalLineToRelative(2.31f)
                quadToRelative(0.395f, -0.007f, 0.787f, -0.06f)
                curveToRelative(0.196f, -0.028f, 0.385f, -0.09f, 0.557f, -0.187f)
                curveToRelative(0.382f, -0.232f, 0.597f, -0.665f, 0.553f, -1.11f)
                arcToRelative(1.23f, 1.23f, 0.0f, false, false, -0.346f, -0.937f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.506f, -0.265f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.974f, -0.09f)
                horizontalLineToRelative(-2.381f)
                close()
            }
        }
        .build()
        return _ticketRvLarge!!
    }

private var _ticketRvLarge: ImageVector? = null
