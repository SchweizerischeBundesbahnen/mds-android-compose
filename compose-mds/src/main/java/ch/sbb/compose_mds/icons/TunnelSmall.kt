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

public val SBBIcons.TunnelSmall: ImageVector
    get() {
        if (_tunnelSmall != null) {
            return _tunnelSmall!!
        }
        _tunnelSmall = Builder(name = "TunnelSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 10.34f)
                curveToRelative(0.0f, -1.9f, -0.992f, -3.732f, -2.575f, -5.1f)
                curveTo(16.843f, 3.871f, 14.707f, 3.0f, 12.5f, 3.0f)
                reflectiveCurveToRelative(-4.343f, 0.872f, -5.925f, 2.24f)
                curveTo(4.992f, 6.607f, 4.0f, 8.44f, 4.0f, 10.34f)
                lineTo(4.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(-8.66f)
                curveToRelative(0.0f, -2.256f, 1.173f, -4.345f, 2.922f, -5.857f)
                reflectiveCurveTo(10.036f, 2.0f, 12.5f, 2.0f)
                reflectiveCurveToRelative(4.828f, 0.97f, 6.578f, 2.483f)
                curveTo(20.827f, 5.995f, 22.0f, 8.084f, 22.0f, 10.341f)
                lineTo(22.0f, 19.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(19.0f, 20.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.918f)
                lineToRelative(0.37f, 0.787f)
                lineToRelative(-0.904f, 0.426f)
                lineToRelative(-0.57f, -1.213f)
                lineTo(7.951f, 21.0f)
                lineToRelative(-0.49f, 1.19f)
                lineToRelative(-0.924f, -0.38f)
                lineToRelative(0.333f, -0.81f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.283f)
                lineToRelative(0.412f, -1.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.107f)
                lineToRelative(0.412f, -1.0f)
                lineTo(8.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.93f)
                lineToRelative(0.412f, -1.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.754f)
                lineToRelative(0.284f, -0.69f)
                lineToRelative(0.924f, 0.38f)
                lineToRelative(-0.128f, 0.31f)
                horizontalLineToRelative(2.849f)
                lineToRelative(-0.135f, -0.287f)
                lineToRelative(0.904f, -0.426f)
                lineToRelative(0.336f, 0.713f)
                lineTo(16.0f, 14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.742f)
                lineToRelative(0.47f, 1.0f)
                lineTo(17.0f, 16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(0.47f, 1.0f)
                lineTo(18.0f, 18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.86f)
                lineToRelative(0.471f, 1.0f)
                close()
                moveTo(16.506f, 20.0f)
                lineTo(16.036f, 19.0f)
                horizontalLineToRelative(-7.26f)
                lineToRelative(-0.412f, 1.0f)
                close()
                moveTo(15.566f, 18.0f)
                lineTo(15.095f, 17.0f)
                lineTo(9.599f, 17.0f)
                lineToRelative(-0.412f, 1.0f)
                close()
                moveTo(14.624f, 16.0f)
                lineTo(14.154f, 15.0f)
                horizontalLineToRelative(-3.731f)
                lineToRelative(-0.412f, 1.0f)
                close()
            }
        }
        .build()
        return _tunnelSmall!!
    }

private var _tunnelSmall: ImageVector? = null
