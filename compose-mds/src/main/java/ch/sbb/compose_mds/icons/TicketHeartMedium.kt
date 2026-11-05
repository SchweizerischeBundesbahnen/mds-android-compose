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

public val SBBIcons.TicketHeartMedium: ImageVector
    get() {
        if (_ticketHeartMedium != null) {
            return _ticketHeartMedium!!
        }
        _ticketHeartMedium = Builder(
            name = "TicketHeartMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                moveToRelative(3.464f, 7.635f)
                curveToRelative(0.0f, -2.256f, 1.677f, -4.134f, 3.847f, -4.134f)
                curveToRelative(1.056f, 0.0f, 1.992f, 0.455f, 2.675f, 1.173f)
                curveToRelative(0.682f, -0.718f, 1.618f, -1.173f, 2.674f, -1.173f)
                curveToRelative(1.692f, 0.0f, 3.089f, 1.15f, 3.615f, 2.723f)
                curveToRelative(0.148f, 0.442f, 0.227f, 0.917f, 0.227f, 1.411f)
                curveToRelative(0.0f, 0.74f, -0.179f, 1.438f, -0.493f, 2.042f)
                lineToRelative(-0.002f, 0.003f)
                curveToRelative(-0.116f, 0.218f, -0.424f, 0.649f, -0.542f, 0.805f)
                lineToRelative(-0.015f, 0.02f)
                lineToRelative(-0.016f, 0.017f)
                lineToRelative(-5.08f, 5.529f)
                lineToRelative(-0.369f, 0.4f)
                lineToRelative(-0.368f, -0.4f)
                lineToRelative(-5.088f, -5.537f)
                lineToRelative(-0.007f, -0.008f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -0.6f, -0.903f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -0.458f, -1.968f)
                moveToRelative(3.847f, -3.134f)
                curveToRelative(-1.542f, 0.0f, -2.847f, 1.352f, -2.847f, 3.134f)
                curveToRelative(0.0f, 0.555f, 0.129f, 1.073f, 0.352f, 1.521f)
                quadToRelative(0.193f, 0.386f, 0.453f, 0.686f)
                lineToRelative(4.716f, 5.132f)
                lineToRelative(4.696f, -5.11f)
                curveToRelative(0.126f, -0.17f, 0.37f, -0.517f, 0.441f, -0.651f)
                curveToRelative(0.24f, -0.461f, 0.38f, -1.0f, 0.38f, -1.578f)
                curveToRelative(0.0f, -0.387f, -0.062f, -0.755f, -0.175f, -1.094f)
                curveToRelative(-0.408f, -1.217f, -1.459f, -2.04f, -2.667f, -2.04f)
                curveToRelative(-0.92f, 0.0f, -1.736f, 0.48f, -2.26f, 1.249f)
                lineToRelative(-0.413f, 0.604f)
                lineToRelative(-0.413f, -0.604f)
                curveToRelative(-0.526f, -0.769f, -1.344f, -1.25f, -2.263f, -1.25f)
                moveTo(24.25f, 7.5f)
                verticalLineToRelative(0.487f)
                horizontalLineToRelative(1.0f)
                lineTo(25.25f, 7.5f)
                close()
                moveTo(24.25f, 8.962f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 10.912f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 12.862f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 14.812f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 16.762f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 18.712f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 20.662f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 22.612f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 24.562f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 26.512f)
                lineTo(24.25f, 27.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.488f)
                close()
            }
        }
            .build()
        return _ticketHeartMedium!!
    }

private var _ticketHeartMedium: ImageVector? = null
