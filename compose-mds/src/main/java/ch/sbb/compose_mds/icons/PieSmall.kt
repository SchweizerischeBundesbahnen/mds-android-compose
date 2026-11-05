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

public val SBBIcons.PieSmall: ImageVector
    get() {
        if (_pieSmall != null) {
            return _pieSmall!!
        }
        _pieSmall = Builder(
            name = "PieSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
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
                pathFillType = EvenOdd,
            ) {
                moveTo(7.0f, 7.01f)
                lineTo(4.0f, 7.01f)
                verticalLineToRelative(3.975f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, false, 1.0f, 1.787f)
                verticalLineToRelative(7.208f)
                horizontalLineToRelative(0.5f)
                lineToRelative(13.0f, 0.02f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-7.1f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, false, 0.97f, -1.928f)
                lineTo(19.97f, 7.01f)
                lineTo(17.0f, 7.01f)
                lineTo(17.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.01f)
                horizontalLineToRelative(-2.0f)
                lineTo(14.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.01f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.01f)
                lineTo(8.0f, 7.01f)
                lineTo(8.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                close()
                moveTo(18.0f, 13.184f)
                arcToRelative(2.014f, 2.014f, 0.0f, false, true, -2.03f, -2.211f)
                verticalLineToRelative(-0.209f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, -1.116f, -0.86f)
                curveToRelative(-0.586f, 0.067f, -0.948f, 0.515f, -0.888f, 1.037f)
                quadToRelative(0.029f, 0.232f, 0.0f, 0.465f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -3.997f, -0.429f)
                curveToRelative(-0.016f, -0.535f, -0.461f, -0.971f, -0.965f, -0.967f)
                horizontalLineToRelative(-0.02f)
                lineToRelative(-0.021f, -0.002f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, false, -1.024f, 1.0f)
                lineToRelative(0.002f, 0.03f)
                lineToRelative(-0.003f, 0.03f)
                curveTo(7.866f, 12.027f, 7.066f, 12.993f, 6.0f, 13.0f)
                verticalLineToRelative(1.99f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(18.0f, 15.99f)
                lineTo(6.0f, 15.99f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(18.0f, 17.99f)
                lineTo(6.0f, 17.99f)
                verticalLineToRelative(0.991f)
                lineTo(18.0f, 19.0f)
                close()
                moveTo(5.784f, 12.997f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(0.034f, -0.5f)
                close()
                moveTo(5.0f, 8.01f)
                verticalLineToRelative(3.006f)
                lineToRelative(-0.001f, 0.016f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, false, 0.85f, 0.967f)
                horizontalLineToRelative(0.002f)
                quadToRelative(0.032f, 0.002f, 0.087f, 0.0f)
                horizontalLineToRelative(0.027f)
                curveToRelative(0.445f, 0.015f, 0.92f, -0.427f, 0.974f, -0.982f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, true, 1.874f, -2.009f)
                horizontalLineToRelative(0.004f)
                quadToRelative(0.091f, -0.004f, 0.199f, 0.002f)
                curveToRelative(1.09f, 0.003f, 1.947f, 0.928f, 1.954f, 1.987f)
                verticalLineToRelative(0.03f)
                lineToRelative(-0.004f, 0.03f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, 2.007f, 0.232f)
                verticalLineToRelative(-0.003f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -0.226f)
                verticalLineToRelative(-0.003f)
                curveToRelative(-0.131f, -1.133f, 0.695f, -2.024f, 1.766f, -2.147f)
                moveToRelative(0.0f, 0.0f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, 2.227f, 1.765f)
                lineToRelative(0.004f, 0.029f)
                verticalLineToRelative(0.325f)
                lineToRelative(-0.003f, 0.028f)
                arcToRelative(1.01f, 1.01f, 0.0f, true, false, 2.007f, 0.232f)
                verticalLineToRelative(-0.003f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -0.226f)
                lineToRelative(-0.004f, -0.03f)
                lineTo(18.97f, 8.01f)
                lineTo(5.0f, 8.01f)
            }
        }
            .build()
        return _pieSmall!!
    }

private var _pieSmall: ImageVector? = null
