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

public val SBBIcons.PieSmall: ImageVector
    get() {
        if (_pieSmall != null) {
            return _pieSmall!!
        }
        _pieSmall = Builder(name = "PieSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 12.769f)
                arcTo(1.91f, 1.91f, 0.0f, false, true, 4.0f, 11.0f)
                lineTo(4.0f, 7.01f)
                horizontalLineToRelative(3.0f)
                lineTo(7.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.01f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.01f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.01f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.01f)
                horizontalLineToRelative(2.97f)
                verticalLineToRelative(3.98f)
                quadToRelative(0.02f, 0.208f, -0.004f, 0.416f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 12.898f)
                lineTo(19.0f, 20.0f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-13.0f, -0.02f)
                lineTo(5.0f, 19.98f)
                close()
                moveTo(6.0f, 18.98f)
                lineTo(18.0f, 19.0f)
                lineTo(18.0f, 17.99f)
                lineTo(6.0f, 17.99f)
                close()
                moveTo(6.0f, 16.99f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 15.99f)
                close()
                moveTo(14.853f, 9.903f)
                curveToRelative(-0.585f, 0.068f, -0.945f, 0.515f, -0.886f, 1.037f)
                lineToRelative(0.013f, 0.234f)
                quadToRelative(0.0f, 0.116f, -0.014f, 0.232f)
                arcToRelative(2.009f, 2.009f, 0.0f, false, true, -3.996f, -0.403f)
                lineToRelative(-0.006f, -0.102f)
                curveToRelative(-0.055f, -0.5f, -0.48f, -0.895f, -0.96f, -0.891f)
                horizontalLineToRelative(-0.02f)
                lineToRelative(-0.021f, -0.001f)
                arcToRelative(0.961f, 0.961f, 0.0f, false, false, -1.023f, 0.999f)
                verticalLineToRelative(0.03f)
                lineToRelative(-0.002f, 0.03f)
                lineToRelative(-0.495f, -0.039f)
                lineTo(7.44f, 11.029f)
                lineToRelative(0.5f, 0.038f)
                curveToRelative(-0.073f, 0.962f, -0.873f, 1.924f, -1.94f, 1.93f)
                verticalLineToRelative(1.993f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.808f)
                arcTo(2.008f, 2.008f, 0.0f, false, true, 15.97f, 11.0f)
                verticalLineToRelative(-0.233f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, -1.115f, -0.864f)
                lineToRelative(-0.057f, -0.497f)
                lineToRelative(-0.028f, -0.239f)
                close()
                moveTo(5.0f, 11.016f)
                lineToRelative(-0.001f, 0.016f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, false, 0.85f, 0.967f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.088f, 0.001f)
                lineToRelative(0.01f, 0.44f)
                horizontalLineToRelative(0.001f)
                lineToRelative(-0.01f, -0.44f)
                horizontalLineToRelative(0.027f)
                curveToRelative(0.451f, 0.014f, 0.933f, -0.441f, 0.975f, -1.008f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, true, 1.872f, -1.984f)
                horizontalLineToRelative(0.003f)
                quadToRelative(0.09f, -0.004f, 0.194f, 0.002f)
                horizontalLineToRelative(0.027f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(1.08f, 0.015f, 1.927f, 0.935f, 1.934f, 1.987f)
                verticalLineToRelative(0.03f)
                lineToRelative(-0.003f, 0.03f)
                lineToRelative(-0.007f, 0.103f)
                arcToRelative(1.011f, 1.011f, 0.0f, false, false, 2.013f, 0.13f)
                verticalLineToRelative(-0.004f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.007f, -0.112f)
                lineToRelative(-0.007f, -0.114f)
                verticalLineToRelative(-0.002f)
                lineToRelative(-0.013f, -0.21f)
                curveToRelative(-0.014f, -1.032f, 0.774f, -1.822f, 1.779f, -1.938f)
                lineToRelative(0.205f, -0.014f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, 1.988f, 1.577f)
                lineToRelative(0.035f, 0.202f)
                lineToRelative(0.003f, 0.03f)
                verticalLineToRelative(0.323f)
                lineToRelative(-0.003f, 0.03f)
                lineToRelative(-0.007f, 0.102f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, 2.013f, 0.13f)
                verticalLineToRelative(-0.004f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.007f, -0.112f)
                lineToRelative(-0.007f, -0.114f)
                lineToRelative(-0.003f, -0.03f)
                lineTo(18.97f, 8.01f)
                lineTo(5.0f, 8.01f)
                close()
            }
        }
        .build()
        return _pieSmall!!
    }

private var _pieSmall: ImageVector? = null
