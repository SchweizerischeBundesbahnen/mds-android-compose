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

public val SBBIcons.MugHotSmall: ImageVector
    get() {
        if (_mugHotSmall != null) {
            return _mugHotSmall!!
        }
        _mugHotSmall = Builder(
            name = "MugHotSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(16.0f, 12.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                lineTo(16.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 21.0f)
                lineTo(5.0f, 9.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(6.0f, 20.0f)
                horizontalLineToRelative(9.0f)
                lineTo(15.0f, 10.0f)
                lineTo(6.0f, 10.0f)
                close()
                moveTo(16.0f, 18.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                lineTo(16.0f, 13.0f)
                close()
                moveTo(8.0f, 2.0f)
                curveToRelative(0.0f, 0.155f, 0.089f, 0.417f, 0.29f, 0.646f)
                curveToRelative(0.19f, 0.219f, 0.437f, 0.354f, 0.71f, 0.354f)
                curveToRelative(1.242f, 0.0f, 1.915f, 1.042f, 1.962f, 1.975f)
                curveToRelative(0.024f, 0.477f, -0.105f, 0.985f, -0.441f, 1.38f)
                curveTo(10.175f, 6.762f, 9.653f, 7.0f, 9.0f, 7.0f)
                curveToRelative(-0.546f, 0.0f, -1.0f, 0.398f, -1.0f, 1.0f)
                lineTo(7.0f, 8.0f)
                curveToRelative(0.0f, -1.198f, 0.946f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.397f, 0.0f, 0.625f, -0.137f, 0.758f, -0.293f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, false, 0.205f, -0.682f)
                curveTo(9.935f, 4.458f, 9.557f, 4.0f, 9.0f, 4.0f)
                curveToRelative(-0.627f, 0.0f, -1.13f, -0.315f, -1.464f, -0.695f)
                curveTo(7.211f, 2.933f, 7.0f, 2.445f, 7.0f, 2.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(0.0f, 0.155f, 0.089f, 0.417f, 0.29f, 0.646f)
                curveToRelative(0.19f, 0.219f, 0.437f, 0.354f, 0.71f, 0.354f)
                curveToRelative(1.242f, 0.0f, 1.915f, 1.042f, 1.962f, 1.975f)
                curveToRelative(0.024f, 0.477f, -0.105f, 0.985f, -0.441f, 1.38f)
                curveTo(14.175f, 6.762f, 13.653f, 7.0f, 13.0f, 7.0f)
                curveToRelative(-0.546f, 0.0f, -1.0f, 0.398f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.198f, 0.946f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.396f, 0.0f, 0.625f, -0.137f, 0.758f, -0.293f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, false, 0.205f, -0.682f)
                curveTo(13.935f, 4.458f, 13.557f, 4.0f, 13.0f, 4.0f)
                curveToRelative(-0.627f, 0.0f, -1.13f, -0.315f, -1.464f, -0.695f)
                curveTo(11.211f, 2.933f, 11.0f, 2.445f, 11.0f, 2.0f)
                close()
            }
        }
            .build()
        return _mugHotSmall!!
    }

private var _mugHotSmall: ImageVector? = null
