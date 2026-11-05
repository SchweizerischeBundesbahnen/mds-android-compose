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

public val SBBIcons.TriceratopsMedium: ImageVector
    get() {
        if (_triceratopsMedium != null) {
            return _triceratopsMedium!!
        }
        _triceratopsMedium = Builder(
            name = "TriceratopsMedium",
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
                pathFillType = NonZero,
            ) {
                moveTo(22.25f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.75f)
                horizontalLineToRelative(-5.493f)
                lineToRelative(-0.238f, 0.015f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, false, -1.236f, 0.654f)
                curveToRelative(-0.362f, 0.413f, -0.609f, 0.985f, -0.77f, 1.6f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, -0.253f, 1.695f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.013f, 0.714f)
                lineToRelative(0.002f, 0.038f)
                verticalLineToRelative(0.01f)
                lineTo(12.75f, 30.0f)
                lineToRelative(-0.5f, 0.024f)
                verticalLineToRelative(-0.02f)
                lineToRelative(-0.002f, -0.048f)
                lineToRelative(-0.003f, -0.178f)
                curveToRelative(0.0f, -0.15f, 0.003f, -0.364f, 0.017f, -0.62f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, true, 0.284f, -1.893f)
                curveToRelative(0.181f, -0.692f, 0.481f, -1.43f, 0.986f, -2.005f)
                curveToRelative(0.52f, -0.592f, 1.244f, -0.997f, 2.211f, -1.01f)
                horizontalLineToRelative(6.507f)
                close()
                moveTo(21.75f, 7.75f)
                curveToRelative(0.584f, 0.0f, 1.054f, 0.273f, 1.422f, 0.66f)
                curveToRelative(0.358f, 0.378f, 0.64f, 0.884f, 0.874f, 1.421f)
                curveToRelative(0.452f, 1.036f, 0.808f, 2.385f, 1.158f, 3.447f)
                quadToRelative(0.151f, 0.224f, 0.302f, 0.431f)
                lineToRelative(5.214f, -2.085f)
                lineToRelative(-3.221f, 4.294f)
                curveToRelative(0.609f, 0.548f, 1.221f, 1.023f, 1.85f, 1.521f)
                lineToRelative(2.942f, -0.98f)
                lineToRelative(-1.041f, 3.123f)
                lineTo(31.25f, 21.0f)
                curveToRelative(0.0f, 0.369f, 0.0f, 0.72f, -0.025f, 1.026f)
                curveToRelative(-0.026f, 0.305f, -0.08f, 0.614f, -0.215f, 0.885f)
                arcToRelative(1.37f, 1.37f, 0.0f, false, true, -0.69f, 0.655f)
                curveToRelative(-0.3f, 0.134f, -0.66f, 0.184f, -1.07f, 0.184f)
                lineTo(27.0f, 23.75f)
                curveToRelative(-0.381f, 0.0f, -0.686f, 0.0f, -0.942f, 0.021f)
                curveToRelative(-0.258f, 0.022f, -0.419f, 0.062f, -0.522f, 0.114f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, -0.188f, 0.2f)
                curveToRelative(-0.054f, 0.122f, -0.098f, 0.324f, -0.098f, 0.665f)
                lineTo(25.25f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.25f)
                curveToRelative(0.0f, -0.41f, 0.05f, -0.77f, 0.184f, -1.07f)
                arcToRelative(1.37f, 1.37f, 0.0f, false, true, 0.655f, -0.69f)
                curveToRelative(0.271f, -0.136f, 0.58f, -0.19f, 0.885f, -0.215f)
                reflectiveCurveToRelative(0.657f, -0.025f, 1.026f, -0.025f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.34f, 0.0f, 0.543f, -0.044f, 0.664f, -0.098f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, 0.201f, -0.188f)
                curveToRelative(0.052f, -0.103f, 0.092f, -0.264f, 0.114f, -0.522f)
                curveToRelative(0.02f, -0.256f, 0.021f, -0.56f, 0.021f, -0.942f)
                verticalLineToRelative(-1.293f)
                lineToRelative(-1.332f, -1.332f)
                curveToRelative(-1.48f, -1.182f, -3.04f, -2.281f, -4.584f, -4.598f)
                lineToRelative(-0.037f, -0.055f)
                lineToRelative(-0.022f, -0.064f)
                curveToRelative(-0.392f, -1.178f, -0.707f, -2.42f, -1.146f, -3.427f)
                curveToRelative(-0.216f, -0.494f, -0.441f, -0.879f, -0.683f, -1.133f)
                curveToRelative(-0.232f, -0.245f, -0.456f, -0.348f, -0.696f, -0.348f)
                curveToRelative(-0.87f, 0.0f, -1.651f, 0.358f, -2.646f, 1.354f)
                curveToRelative(-1.348f, 1.347f, -2.063f, 3.38f, -2.101f, 5.47f)
                lineToRelative(3.63f, 4.356f)
                lineToRelative(-0.767f, 0.64f)
                lineToRelative(-3.75f, -4.5f)
                lineToRelative(-0.116f, -0.14f)
                verticalLineToRelative(-0.18f)
                quadToRelative(0.001f, -0.5f, 0.05f, -1.0f)
                horizontalLineToRelative(-1.8f)
                curveToRelative(-2.8f, 0.0f, -4.901f, 1.386f, -6.324f, 3.513f)
                lineTo(5.362f, 22.75f)
                horizontalLineToRelative(4.888f)
                lineTo(10.25f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.25f)
                lineTo(3.639f, 23.75f)
                lineToRelative(0.426f, -0.748f)
                lineToRelative(3.0f, -5.25f)
                lineToRelative(0.01f, -0.015f)
                lineToRelative(0.009f, -0.014f)
                curveToRelative(1.577f, -2.366f, 3.972f, -3.973f, 7.166f, -3.973f)
                horizontalLineToRelative(1.944f)
                curveToRelative(0.322f, -1.648f, 1.048f, -3.199f, 2.203f, -4.354f)
                curveTo(19.5f, 8.292f, 20.52f, 7.75f, 21.75f, 7.75f)
                moveToRelative(3.0f, 10.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                moveToRelative(5.426f, 0.219f)
                lineToRelative(0.355f, 0.355f)
                lineToRelative(0.178f, -0.533f)
                close()
                moveTo(26.146f, 14.529f)
                quadToRelative(0.313f, 0.368f, 0.625f, 0.69f)
                lineToRelative(1.01f, -1.343f)
                close()
            }
        }
            .build()
        return _triceratopsMedium!!
    }

private var _triceratopsMedium: ImageVector? = null
