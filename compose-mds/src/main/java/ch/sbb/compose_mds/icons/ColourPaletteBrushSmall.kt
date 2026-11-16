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

public val SBBIcons.ColourPaletteBrushSmall: ImageVector
    get() {
        if (_colourPaletteBrushSmall != null) {
            return _colourPaletteBrushSmall!!
        }
        _colourPaletteBrushSmall = Builder(name = "ColourPaletteBrushSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.658f, 6.88f)
                arcToRelative(1.983f, 1.983f, 0.0f, false, true, -0.343f, 2.61f)
                horizontalLineToRelative(-2.631f)
                arcTo(1.98f, 1.98f, 0.0f, false, true, 17.0f, 8.0f)
                verticalLineToRelative(-0.02f)
                lineToRelative(-0.002f, -0.02f)
                verticalLineToRelative(-0.011f)
                lineToRelative(-0.002f, -0.026f)
                lineToRelative(-0.004f, -0.135f)
                arcToRelative(6.169f, 6.169f, 0.0f, false, true, 0.34f, -2.09f)
                curveToRelative(0.34f, -0.958f, 1.002f, -1.954f, 2.337f, -2.459f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.09f, 0.475f)
                curveToRelative(-0.11f, 0.882f, 0.059f, 2.037f, 1.08f, 3.166f)
                moveTo(21.0f, 10.223f)
                curveToRelative(0.603f, -0.545f, 1.0f, -1.327f, 1.0f, -2.223f)
                curveToRelative(0.0f, -0.632f, -0.191f, -1.222f, -0.53f, -1.707f)
                lineToRelative(-0.02f, -0.027f)
                lineToRelative(-0.022f, -0.025f)
                curveToRelative(-0.829f, -0.899f, -0.936f, -1.767f, -0.857f, -2.404f)
                curveToRelative(0.04f, -0.327f, 0.131f, -0.601f, 0.212f, -0.792f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 0.137f, -0.273f)
                lineTo(20.92f, 2.77f)
                lineToRelative(0.62f, -0.956f)
                lineToRelative(-1.125f, 0.193f)
                curveToRelative(-2.406f, 0.413f, -3.527f, 1.95f, -4.025f, 3.357f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, false, -0.393f, 2.606f)
                lineToRelative(0.003f, 0.048f)
                lineToRelative(0.001f, 0.008f)
                lineToRelative(0.001f, 0.005f)
                curveToRelative(0.01f, 0.884f, 0.402f, 1.654f, 0.998f, 2.193f)
                lineTo(17.0f, 20.0f)
                curveToRelative(0.0f, 1.106f, 0.894f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.894f, 2.0f, -2.0f)
                close()
                moveTo(20.0f, 10.49f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 20.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.554f, -0.446f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.446f, -1.0f, -1.0f)
                moveToRelative(-0.508f, -10.0f)
                lineToRelative(0.008f, -0.01f)
                verticalLineToRelative(-0.002f)
                lineToRelative(-0.009f, 0.012f)
                close()
                moveTo(13.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                moveTo(8.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                moveToRelative(2.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                moveToRelative(0.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                moveToRelative(-6.973f, -7.264f)
                curveTo(5.794f, 13.3f, 7.0f, 14.79f, 7.0f, 16.5f)
                curveToRelative(0.0f, 0.483f, -0.097f, 0.945f, -0.278f, 1.36f)
                lineToRelative(-0.002f, 0.005f)
                curveToRelative(-0.513f, 1.208f, -0.063f, 2.682f, 1.18f, 3.258f)
                lineToRelative(0.001f, 0.001f)
                arcToRelative(9.8f, 9.8f, 0.0f, false, false, 4.09f, 0.876f)
                curveToRelative(1.454f, 0.0f, 2.925f, -0.337f, 4.21f, -0.937f)
                lineToRelative(-0.423f, -0.906f)
                arcTo(9.1f, 9.1f, 0.0f, false, true, 11.99f, 21.0f)
                arcToRelative(8.9f, 8.9f, 0.0f, false, true, -3.249f, -0.605f)
                lineToRelative(-0.423f, -0.18f)
                curveToRelative(-0.695f, -0.324f, -1.004f, -1.19f, -0.677f, -1.96f)
                lineTo(7.64f, 18.255f)
                curveToRelative(0.236f, -0.544f, 0.36f, -1.14f, 0.36f, -1.755f)
                curveToRelative(0.0f, -2.21f, -1.555f, -4.041f, -3.668f, -4.716f)
                curveToRelative(-0.803f, -0.255f, -1.279f, -1.007f, -1.114f, -1.754f)
                curveToRelative(0.919f, -4.093f, 4.633f, -7.143f, 9.037f, -7.02f)
                curveToRelative(1.248f, 0.038f, 2.44f, 0.34f, 3.53f, 0.861f)
                lineToRelative(0.43f, -0.902f)
                arcToRelative(9.8f, 9.8f, 0.0f, false, false, -3.93f, -0.959f)
                curveToRelative(-4.896f, -0.137f, -9.022f, 3.254f, -10.043f, 7.8f)
                verticalLineToRelative(0.002f)
                curveToRelative(-0.295f, 1.33f, 0.57f, 2.538f, 1.785f, 2.924f)
                moveTo(7.9f, 21.123f)
                lineToRelative(0.215f, -0.463f)
                lineToRelative(-0.023f, 0.052f)
                close()
                moveTo(12.274f, 2.402f)
                lineTo(12.271f, 2.51f)
                lineTo(12.274f, 2.422f)
                lineTo(12.28f, 2.196f)
                close()
            }
        }
        .build()
        return _colourPaletteBrushSmall!!
    }

private var _colourPaletteBrushSmall: ImageVector? = null
