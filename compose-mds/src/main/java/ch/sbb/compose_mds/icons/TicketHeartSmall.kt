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
                moveTo(4.976f, 9.923f)
                curveTo(4.976f, 8.341f, 6.156f, 7.0f, 7.707f, 7.0f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 1.784f, 0.715f)
                arcTo(2.6f, 2.6f, 0.0f, false, true, 11.273f, 7.0f)
                curveToRelative(1.209f, 0.0f, 2.198f, 0.822f, 2.568f, 1.93f)
                lineToRelative(-1.028f, 0.115f)
                curveTo(12.522f, 8.407f, 11.931f, 8.0f, 11.273f, 8.0f)
                curveToRelative(-0.551f, 0.0f, -1.046f, 0.288f, -1.369f, 0.76f)
                lineToRelative(-0.412f, 0.605f)
                lineToRelative(-0.414f, -0.604f)
                curveToRelative(-0.323f, -0.473f, -0.82f, -0.76f, -1.37f, -0.76f)
                curveToRelative(-0.893f, 0.0f, -1.677f, 0.759f, -1.73f, 1.81f)
                lineToRelative(-0.002f, 0.112f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 0.494f, 1.36f)
                lineToRelative(3.02f, 3.287f)
                lineToRelative(3.002f, -3.267f)
                curveToRelative(0.085f, -0.115f, 0.235f, -0.33f, 0.276f, -0.405f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 13.0f, 9.923f)
                quadToRelative(-0.002f, -0.361f, -0.108f, -0.676f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.08f, -0.202f)
                lineToRelative(1.028f, -0.115f)
                curveToRelative(0.104f, 0.311f, 0.16f, 0.646f, 0.16f, 0.993f)
                curveToRelative(0.0f, 0.521f, -0.125f, 1.012f, -0.348f, 1.439f)
                lineToRelative(-0.001f, 0.002f)
                curveToRelative(-0.084f, 0.16f, -0.298f, 0.456f, -0.376f, 0.56f)
                lineToRelative(-0.014f, 0.019f)
                lineToRelative(-0.017f, 0.018f)
                lineToRelative(-3.387f, 3.686f)
                lineToRelative(-0.368f, 0.4f)
                lineToRelative(-0.368f, -0.4f)
                lineToRelative(-3.392f, -3.691f)
                lineToRelative(-0.007f, -0.008f)
                arcToRelative(3.103f, 3.103f, 0.0f, false, true, -0.747f, -2.024f)
                moveToRelative(7.837f, -0.878f)
                lineToRelative(-6.834f, 0.766f)
                close()
                moveTo(16.0f, 6.393f)
                verticalLineToRelative(0.928f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.928f)
                close()
                moveTo(16.0f, 8.25f)
                verticalLineToRelative(0.928f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 8.25f)
                close()
                moveTo(16.0f, 10.107f)
                verticalLineToRelative(0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.93f)
                close()
                moveTo(16.0f, 11.964f)
                verticalLineToRelative(0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.929f)
                close()
                moveTo(16.0f, 13.821f)
                verticalLineToRelative(0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.929f)
                close()
                moveTo(16.0f, 15.678f)
                verticalLineToRelative(0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.929f)
                close()
            }
        }
        .build()
        return _ticketHeartSmall!!
    }

private var _ticketHeartSmall: ImageVector? = null
