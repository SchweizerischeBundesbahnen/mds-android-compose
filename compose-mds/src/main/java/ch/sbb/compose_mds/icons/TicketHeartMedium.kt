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
        _ticketHeartMedium = Builder(name = "TicketHeartMedium", defaultWidth = 36.0.dp,
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
                moveToRelative(-8.499f, -2.365f)
                curveToRelative(0.0f, -0.387f, -0.061f, -0.755f, -0.175f, -1.093f)
                curveToRelative(-0.407f, -1.218f, -1.458f, -2.041f, -2.667f, -2.041f)
                curveToRelative(-0.919f, 0.0f, -1.735f, 0.48f, -2.26f, 1.249f)
                lineToRelative(-0.411f, 0.604f)
                lineToRelative(-0.415f, -0.604f)
                curveToRelative(-0.525f, -0.769f, -1.343f, -1.25f, -2.262f, -1.25f)
                curveToRelative(-1.542f, 0.0f, -2.847f, 1.353f, -2.847f, 3.135f)
                curveToRelative(0.0f, 0.555f, 0.13f, 1.072f, 0.353f, 1.52f)
                lineToRelative(0.1f, 0.19f)
                quadToRelative(0.157f, 0.273f, 0.353f, 0.497f)
                lineToRelative(4.715f, 5.131f)
                lineToRelative(4.691f, -5.105f)
                curveToRelative(0.125f, -0.167f, 0.372f, -0.517f, 0.445f, -0.653f)
                curveToRelative(0.24f, -0.462f, 0.38f, -1.0f, 0.38f, -1.58f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 0.74f, -0.178f, 1.438f, -0.493f, 2.041f)
                lineToRelative(-0.442f, -0.23f)
                lineToRelative(0.077f, 0.04f)
                lineToRelative(0.365f, 0.19f)
                verticalLineToRelative(0.003f)
                lineToRelative(-0.118f, 0.197f)
                curveToRelative(-0.141f, 0.22f, -0.337f, 0.492f, -0.425f, 0.609f)
                lineToRelative(-0.015f, 0.02f)
                lineToRelative(-0.016f, 0.017f)
                lineToRelative(-0.365f, -0.337f)
                lineToRelative(-0.003f, -0.002f)
                lineToRelative(0.368f, 0.34f)
                lineToRelative(-5.08f, 5.528f)
                lineToRelative(-0.368f, 0.4f)
                lineToRelative(-0.369f, -0.4f)
                lineToRelative(-5.088f, -5.537f)
                lineToRelative(-0.007f, -0.008f)
                lineToRelative(-0.173f, -0.21f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -0.427f, -0.693f)
                lineToRelative(-0.104f, -0.225f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -0.354f, -1.743f)
                curveToRelative(0.0f, -2.255f, 1.677f, -4.134f, 3.847f, -4.134f)
                curveToRelative(1.056f, 0.0f, 1.992f, 0.455f, 2.675f, 1.173f)
                curveToRelative(0.681f, -0.718f, 1.617f, -1.173f, 2.673f, -1.173f)
                curveToRelative(1.693f, 0.0f, 3.09f, 1.15f, 3.616f, 2.723f)
                curveToRelative(0.147f, 0.442f, 0.226f, 0.917f, 0.226f, 1.411f)
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
        return _ticketHeartMedium!!
    }

private var _ticketHeartMedium: ImageVector? = null
