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
        _colourPaletteBrushSmall = Builder(
            name = "ColourPaletteBrushSmall",
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
                moveTo(17.333f, 5.698f)
                curveToRelative(0.339f, -0.958f, 1.0f, -1.955f, 2.335f, -2.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.09f, 0.475f)
                curveToRelative(-0.11f, 0.886f, 0.06f, 2.047f, 1.09f, 3.18f)
                arcToRelative(1.986f, 1.986f, 0.0f, false, true, -0.347f, 2.598f)
                horizontalLineToRelative(-2.642f)
                arcTo(1.99f, 1.99f, 0.0f, false, true, 17.0f, 7.999f)
                verticalLineToRelative(-0.038f)
                lineToRelative(-0.001f, -0.007f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.006f, -0.167f)
                arcToRelative(6.168f, 6.168f, 0.0f, false, true, 0.34f, -2.09f)
                moveTo(15.997f, 7.97f)
                lineToRelative(0.003f, 0.048f)
                curveToRelative(0.005f, 0.889f, 0.4f, 1.665f, 1.0f, 2.206f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 1.106f, 0.894f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.894f, 2.0f, -2.0f)
                verticalLineToRelative(-9.776f)
                curveToRelative(0.603f, -0.545f, 1.0f, -1.328f, 1.0f, -2.224f)
                curveToRelative(0.0f, -0.632f, -0.191f, -1.222f, -0.53f, -1.707f)
                lineToRelative(-0.02f, -0.027f)
                lineToRelative(-0.022f, -0.025f)
                curveToRelative(-0.829f, -0.899f, -0.936f, -1.767f, -0.857f, -2.404f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.315f, -1.007f)
                lineToRelative(0.029f, -0.05f)
                lineToRelative(0.006f, -0.01f)
                lineToRelative(0.618f, -0.956f)
                lineToRelative(-1.124f, 0.193f)
                curveToRelative(-2.406f, 0.413f, -3.527f, 1.951f, -4.025f, 3.357f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, false, -0.393f, 2.606f)
                moveTo(20.0f, 10.49f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 20.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.554f, -0.446f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.446f, -1.0f, -1.0f)
                moveTo(12.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveTo(7.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveTo(5.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(5.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(1.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                moveToRelative(1.284f, -13.99f)
                curveToRelative(-4.896f, -0.137f, -9.021f, 3.253f, -10.042f, 7.8f)
                verticalLineToRelative(0.002f)
                curveToRelative(-0.295f, 1.331f, 0.57f, 2.539f, 1.786f, 2.925f)
                curveTo(5.795f, 13.3f, 7.0f, 14.79f, 7.0f, 16.5f)
                curveToRelative(0.0f, 0.483f, -0.097f, 0.945f, -0.278f, 1.36f)
                lineToRelative(-0.002f, 0.005f)
                curveToRelative(-0.513f, 1.209f, -0.063f, 2.682f, 1.18f, 3.259f)
                horizontalLineToRelative(0.002f)
                arcTo(9.8f, 9.8f, 0.0f, false, false, 11.99f, 22.0f)
                curveToRelative(1.454f, 0.0f, 2.926f, -0.337f, 4.211f, -0.937f)
                lineToRelative(-0.423f, -0.906f)
                arcTo(9.1f, 9.1f, 0.0f, false, true, 11.99f, 21.0f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, true, -3.671f, -0.784f)
                curveToRelative(-0.696f, -0.324f, -1.005f, -1.188f, -0.68f, -1.958f)
                curveToRelative(0.238f, -0.545f, 0.36f, -1.142f, 0.36f, -1.758f)
                curveToRelative(0.0f, -2.211f, -1.554f, -4.04f, -3.667f, -4.716f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-0.803f, -0.255f, -1.278f, -1.007f, -1.113f, -1.755f)
                curveToRelative(0.92f, -4.093f, 4.633f, -7.142f, 9.037f, -7.02f)
                curveToRelative(1.248f, 0.039f, 2.44f, 0.341f, 3.53f, 0.862f)
                lineToRelative(0.43f, -0.902f)
                arcToRelative(9.8f, 9.8f, 0.0f, false, false, -3.93f, -0.959f)
                close()
            }
        }
            .build()
        return _colourPaletteBrushSmall!!
    }

private var _colourPaletteBrushSmall: ImageVector? = null
