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

public val SBBIcons.TicketIpvMedium: ImageVector
    get() {
        if (_ticketIpvMedium != null) {
            return _ticketIpvMedium!!
        }
        _ticketIpvMedium = Builder(name = "TicketIpvMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.75f, 32.75f)
                lineTo(29.75f, 3.25f)
                horizontalLineToRelative(-22.0f)
                verticalLineToRelative(29.5f)
                close()
                moveTo(28.75f, 31.75f)
                horizontalLineToRelative(-20.0f)
                lineTo(8.75f, 4.25f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(25.5f, 23.75f)
                verticalLineToRelative(-1.0f)
                lineTo(12.0f, 22.75f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(25.5f, 25.75f)
                verticalLineToRelative(1.0f)
                lineTo(12.0f, 26.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(12.179f, 18.018f)
                verticalLineToRelative(-7.496f)
                lineTo(10.5f, 10.522f)
                verticalLineToRelative(7.496f)
                close()
                moveTo(13.658f, 10.522f)
                horizontalLineToRelative(3.105f)
                quadToRelative(0.785f, 0.0f, 1.234f, 0.095f)
                quadToRelative(0.45f, 0.095f, 0.814f, 0.336f)
                quadToRelative(1.004f, 0.656f, 1.004f, 1.979f)
                quadToRelative(0.0f, 1.174f, -0.832f, 1.845f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.804f, 0.413f)
                quadToRelative(-0.453f, 0.126f, -1.116f, 0.126f)
                horizontalLineToRelative(-1.726f)
                verticalLineToRelative(2.702f)
                horizontalLineToRelative(-1.68f)
                close()
                moveTo(15.337f, 11.906f)
                verticalLineToRelative(2.123f)
                horizontalLineToRelative(1.5f)
                quadToRelative(0.669f, 0.0f, 0.963f, -0.23f)
                quadToRelative(0.363f, -0.288f, 0.363f, -0.847f)
                quadToRelative(0.0f, -0.564f, -0.421f, -0.84f)
                quadToRelative(-0.305f, -0.206f, -0.995f, -0.206f)
                close()
                moveTo(24.442f, 18.018f)
                lineTo(27.0f, 10.522f)
                horizontalLineToRelative(-1.743f)
                lineTo(23.5f, 16.136f)
                lineToRelative(-1.73f, -5.614f)
                lineTo(20.01f, 10.522f)
                lineToRelative(2.52f, 7.496f)
                close()
            }
        }
        .build()
        return _ticketIpvMedium!!
    }

private var _ticketIpvMedium: ImageVector? = null
