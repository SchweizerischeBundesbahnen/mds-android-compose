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

public val SBBIcons.EarthMedium: ImageVector
    get() {
        if (_earthMedium != null) {
            return _earthMedium!!
        }
        _earthMedium = Builder(
            name = "EarthMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                moveTo(15.696f, 4.442f)
                quadToRelative(1.126f, -0.19f, 2.304f, -0.192f)
                curveToRelative(2.479f, 0.0f, 4.804f, 0.656f, 6.812f, 1.803f)
                lineToRelative(-1.205f, 0.788f)
                curveToRelative(-0.4f, 0.26f, -0.923f, 0.769f, -1.196f, 1.145f)
                lineToRelative(-0.84f, 1.155f)
                lineToRelative(-0.007f, 0.01f)
                arcToRelative(0.24f, 0.24f, 0.0f, false, true, -0.204f, 0.099f)
                horizontalLineToRelative(-3.81f)
                curveToRelative(-0.314f, 0.0f, -0.646f, 0.119f, -0.887f, 0.38f)
                lineToRelative(-2.69f, 2.69f)
                lineToRelative(-0.03f, 0.024f)
                quadToRelative(-0.03f, 0.023f, -0.033f, 0.024f)
                lineToRelative(-0.01f, 0.006f)
                lineToRelative(-2.85f, 1.605f)
                curveToRelative(-0.984f, 0.555f, -0.785f, 1.977f, 0.265f, 2.294f)
                lineToRelative(0.004f, 0.002f)
                lineToRelative(2.61f, 0.765f)
                lineToRelative(0.01f, 0.002f)
                lineToRelative(0.01f, 0.003f)
                curveToRelative(0.15f, 0.037f, 0.358f, 0.072f, 0.59f, 0.018f)
                lineToRelative(5.629f, -1.135f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, 0.159f, 0.0f)
                lineToRelative(0.584f, 0.142f)
                lineToRelative(0.01f, 0.003f)
                curveToRelative(0.17f, 0.037f, 0.344f, 0.249f, 0.344f, 0.442f)
                verticalLineToRelative(3.435f)
                curveToRelative(0.0f, 0.351f, 0.149f, 0.67f, 0.371f, 0.893f)
                lineToRelative(0.008f, 0.007f)
                lineToRelative(6.59f, 6.334f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, true, -3.922f, 3.035f)
                lineToRelative(-0.522f, -3.783f)
                lineToRelative(-0.001f, -0.01f)
                lineToRelative(-0.002f, -0.01f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.358f, -0.695f)
                lineToRelative(-2.81f, -2.81f)
                lineToRelative(-1.125f, -1.125f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -1.448f, -0.229f)
                lineToRelative(-0.001f, 0.001f)
                lineToRelative(-1.425f, 0.72f)
                lineToRelative(-0.004f, 0.002f)
                curveToRelative(-0.145f, 0.075f, -0.351f, -0.03f, -0.351f, -0.23f)
                verticalLineToRelative(-1.035f)
                curveToRelative(0.0f, -0.697f, -0.554f, -1.25f, -1.25f, -1.25f)
                lineTo(7.2f, 19.765f)
                curveToRelative(-0.454f, 0.0f, -0.874f, 0.25f, -1.096f, 0.645f)
                lineToRelative(-0.004f, 0.007f)
                lineToRelative(-1.108f, 2.051f)
                arcTo(13.7f, 13.7f, 0.0f, false, true, 4.25f, 18.0f)
                curveToRelative(0.0f, -4.658f, 2.316f, -8.774f, 5.859f, -11.261f)
                lineToRelative(1.659f, 1.022f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.262f, 0.074f)
                horizontalLineToRelative(2.4f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.484f, -0.375f)
                close()
                moveTo(28.876f, 26.414f)
                arcTo(13.7f, 13.7f, 0.0f, false, false, 31.75f, 18.0f)
                curveToRelative(0.0f, -4.72f, -2.38f, -8.886f, -6.004f, -11.362f)
                lineToRelative(-1.593f, 1.04f)
                curveToRelative(-0.29f, 0.19f, -0.727f, 0.612f, -0.934f, 0.896f)
                lineToRelative(-0.837f, 1.15f)
                curveToRelative(-0.23f, 0.33f, -0.609f, 0.526f, -1.022f, 0.526f)
                horizontalLineToRelative(-3.81f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, -0.153f, 0.06f)
                lineToRelative(-0.01f, 0.009f)
                lineToRelative(-0.009f, 0.01f)
                lineToRelative(-2.714f, 2.714f)
                lineToRelative(-0.014f, 0.014f)
                lineToRelative(-0.015f, 0.012f)
                lineToRelative(-0.325f, -0.38f)
                lineToRelative(0.325f, 0.38f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.002f, 0.002f)
                lineToRelative(-0.005f, 0.004f)
                lineToRelative(-0.017f, 0.014f)
                lineToRelative(-0.054f, 0.043f)
                curveToRelative(-0.03f, 0.023f, -0.1f, 0.077f, -0.174f, 0.116f)
                lineToRelative(-2.842f, 1.601f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, false, 0.062f, 0.466f)
                lineToRelative(2.597f, 0.76f)
                curveToRelative(0.08f, 0.02f, 0.105f, 0.015f, 0.109f, 0.014f)
                lineToRelative(0.01f, -0.003f)
                lineToRelative(0.012f, -0.003f)
                lineToRelative(5.655f, -1.14f)
                lineToRelative(0.014f, -0.002f)
                lineToRelative(0.014f, -0.002f)
                curveToRelative(0.155f, -0.022f, 0.305f, -0.021f, 0.463f, -0.002f)
                lineToRelative(0.029f, 0.004f)
                lineToRelative(0.027f, 0.007f)
                lineToRelative(0.611f, 0.149f)
                curveToRelative(0.638f, 0.145f, 1.121f, 0.771f, 1.121f, 1.417f)
                verticalLineToRelative(3.435f)
                curveToRelative(0.0f, 0.067f, 0.03f, 0.136f, 0.076f, 0.184f)
                close()
                moveTo(22.801f, 26.584f)
                lineTo(23.365f, 30.664f)
                arcTo(13.7f, 13.7f, 0.0f, false, true, 18.0f, 31.75f)
                curveToRelative(-5.568f, 0.0f, -10.364f, -3.31f, -12.526f, -8.07f)
                lineToRelative(1.503f, -2.783f)
                arcToRelative(0.26f, 0.26f, 0.0f, false, true, 0.223f, -0.132f)
                horizontalLineToRelative(7.815f)
                curveToRelative(0.144f, 0.0f, 0.25f, 0.106f, 0.25f, 0.25f)
                verticalLineToRelative(1.035f)
                curveToRelative(0.0f, 0.909f, 0.963f, 1.553f, 1.807f, 1.12f)
                lineToRelative(1.422f, -0.718f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.293f, 0.041f)
                lineToRelative(1.125f, 1.125f)
                lineToRelative(2.82f, 2.82f)
                lineToRelative(0.011f, 0.012f)
                lineToRelative(0.013f, 0.01f)
                verticalLineToRelative(0.001f)
                quadToRelative(0.001f, -0.002f, 0.016f, 0.025f)
                quadToRelative(0.015f, 0.03f, 0.03f, 0.099f)
                moveTo(14.603f, 4.674f)
                curveToRelative(-1.267f, 0.322f, -2.463f, 0.82f, -3.562f, 1.465f)
                lineToRelative(1.13f, 0.697f)
                horizontalLineToRelative(1.872f)
                close()
                moveTo(18.0f, 3.25f)
                curveTo(9.854f, 3.25f, 3.25f, 9.854f, 3.25f, 18.0f)
                reflectiveCurveTo(9.854f, 32.75f, 18.0f, 32.75f)
                reflectiveCurveTo(32.75f, 26.146f, 32.75f, 18.0f)
                reflectiveCurveTo(26.146f, 3.25f, 18.0f, 3.25f)
            }
        }
            .build()
        return _earthMedium!!
    }

private var _earthMedium: ImageVector? = null
