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

public val SBBIcons.TunnelMedium: ImageVector
    get() {
        if (_tunnelMedium != null) {
            return _tunnelMedium!!
        }
        _tunnelMedium = Builder(name = "TunnelMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(31.75f, 15.512f)
                curveToRelative(0.0f, -2.941f, -1.534f, -5.753f, -3.95f, -7.842f)
                curveToRelative(-2.415f, -2.088f, -5.676f, -3.42f, -9.05f, -3.42f)
                reflectiveCurveTo(12.115f, 5.582f, 9.7f, 7.67f)
                curveToRelative(-2.416f, 2.09f, -3.95f, 4.9f, -3.95f, 7.842f)
                lineTo(5.75f, 28.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(4.75f, 15.512f)
                curveToRelative(0.0f, -3.296f, 1.714f, -6.366f, 4.296f, -8.598f)
                curveTo(11.63f, 4.68f, 15.119f, 3.25f, 18.75f, 3.25f)
                reflectiveCurveToRelative(7.12f, 1.43f, 9.704f, 3.664f)
                curveToRelative(2.582f, 2.232f, 4.296f, 5.302f, 4.296f, 8.598f)
                lineTo(32.75f, 28.5f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(28.5f, 30.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.771f)
                lineToRelative(0.723f, 1.537f)
                lineToRelative(-0.904f, 0.426f)
                lineToRelative(-0.924f, -1.963f)
                lineTo(11.761f, 31.25f)
                lineToRelative(-0.8f, 1.94f)
                lineToRelative(-0.923f, -0.38f)
                lineToRelative(0.642f, -1.56f)
                lineTo(9.0f, 31.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.092f)
                lineToRelative(0.824f, -2.0f)
                lineTo(10.5f, 28.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.827f)
                lineToRelative(0.824f, -2.0f)
                lineTo(12.0f, 25.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.563f)
                lineToRelative(0.823f, -2.0f)
                lineTo(13.5f, 22.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.298f)
                lineToRelative(0.49f, -1.19f)
                lineToRelative(0.924f, 0.38f)
                lineToRelative(-0.333f, 0.81f)
                horizontalLineToRelative(5.04f)
                lineToRelative(-0.371f, -0.787f)
                lineToRelative(0.904f, -0.426f)
                lineToRelative(0.57f, 1.213f)
                lineTo(24.0f, 21.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.506f)
                lineToRelative(0.94f, 2.0f)
                lineTo(25.5f, 24.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.595f)
                lineToRelative(0.941f, 2.0f)
                lineTo(27.0f, 27.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.683f)
                lineToRelative(0.941f, 2.0f)
                close()
                moveTo(25.154f, 30.25f)
                lineTo(24.212f, 28.25f)
                lineTo(12.996f, 28.25f)
                lineToRelative(-0.823f, 2.0f)
                close()
                moveTo(23.742f, 27.25f)
                lineTo(22.801f, 25.25f)
                horizontalLineToRelative(-8.57f)
                lineToRelative(-0.823f, 2.0f)
                close()
                moveTo(22.33f, 24.25f)
                lineTo(21.389f, 22.25f)
                horizontalLineToRelative(-5.922f)
                lineToRelative(-0.824f, 2.0f)
                close()
            }
        }
        .build()
        return _tunnelMedium!!
    }

private var _tunnelMedium: ImageVector? = null
