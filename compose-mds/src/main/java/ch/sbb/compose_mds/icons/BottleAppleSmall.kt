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

public val SBBIcons.BottleAppleSmall: ImageVector
    get() {
        if (_bottleAppleSmall != null) {
            return _bottleAppleSmall!!
        }
        _bottleAppleSmall = Builder(name = "BottleAppleSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 4.045f)
                lineTo(8.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                verticalLineToRelative(2.046f)
                arcTo(2.35f, 2.35f, 0.0f, false, false, 3.313f, 5.39f)
                curveToRelative(-0.24f, 0.539f, -0.452f, 0.953f, -0.638f, 1.318f)
                curveToRelative(-0.095f, 0.186f, -0.183f, 0.359f, -0.265f, 0.528f)
                curveToRelative(-0.231f, 0.48f, -0.41f, 0.927f, -0.41f, 1.439f)
                lineTo(2.0f, 19.8f)
                curveTo(2.0f, 21.022f, 3.001f, 22.0f, 4.224f, 22.0f)
                horizontalLineToRelative(4.552f)
                curveTo(9.997f, 22.0f, 11.0f, 21.022f, 11.0f, 19.8f)
                lineTo(11.0f, 8.676f)
                curveToRelative(0.0f, -0.512f, -0.179f, -0.96f, -0.41f, -1.439f)
                curveToRelative(-0.082f, -0.17f, -0.17f, -0.342f, -0.265f, -0.528f)
                arcToRelative(27.0f, 27.0f, 0.0f, false, true, -0.638f, -1.318f)
                arcTo(2.35f, 2.35f, 0.0f, false, false, 8.0f, 4.045f)
                moveTo(7.54f, 5.0f)
                lineTo(5.46f, 5.0f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, -1.233f, 0.798f)
                lineToRelative(-0.269f, 0.579f)
                quadToRelative(-0.227f, 0.465f, -0.41f, 0.823f)
                quadToRelative(-0.136f, 0.264f, -0.237f, 0.472f)
                curveTo(3.09f, 8.128f, 3.0f, 8.402f, 3.0f, 8.675f)
                lineTo(3.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(9.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(0.8f)
                curveToRelative(0.0f, 0.656f, 0.54f, 1.2f, 1.224f, 1.2f)
                horizontalLineToRelative(4.552f)
                curveTo(9.46f, 21.0f, 10.0f, 20.456f, 10.0f, 19.8f)
                lineTo(10.0f, 8.676f)
                curveToRelative(0.0f, -0.272f, -0.09f, -0.547f, -0.31f, -1.003f)
                arcToRelative(27.0f, 27.0f, 0.0f, false, false, -0.238f, -0.473f)
                curveToRelative(-0.191f, -0.376f, -0.428f, -0.842f, -0.679f, -1.401f)
                arcTo(1.35f, 1.35f, 0.0f, false, false, 7.54f, 5.0f)
                moveTo(7.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                lineTo(6.0f, 2.999f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(3.0f, 18.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(21.0f, 16.596f)
                curveToRelative(0.0f, -1.475f, -0.38f, -2.064f, -0.714f, -2.318f)
                curveToRelative(-0.268f, -0.205f, -0.592f, -0.265f, -0.931f, -0.278f)
                lineTo(19.0f, 14.0f)
                curveToRelative(-0.258f, 0.0f, -0.414f, 0.027f, -0.518f, 0.058f)
                curveToRelative(-0.101f, 0.03f, -0.174f, 0.068f, -0.278f, 0.127f)
                lineToRelative(-0.022f, 0.012f)
                curveToRelative(-0.103f, 0.059f, -0.245f, 0.14f, -0.433f, 0.2f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 17.0f, 14.5f)
                curveToRelative(-0.306f, 0.0f, -0.544f, -0.036f, -0.749f, -0.102f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.432f, -0.2f)
                lineToRelative(-0.023f, -0.013f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.278f, -0.127f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 15.0f, 14.0f)
                horizontalLineToRelative(-0.354f)
                curveToRelative(-0.34f, 0.013f, -0.664f, 0.073f, -0.932f, 0.278f)
                curveToRelative(-0.334f, 0.253f, -0.714f, 0.843f, -0.714f, 2.318f)
                curveToRelative(0.0f, 1.406f, 0.236f, 2.547f, 0.623f, 3.316f)
                curveToRelative(0.384f, 0.765f, 0.867f, 1.085f, 1.371f, 1.087f)
                curveToRelative(0.479f, -0.01f, 0.763f, -0.107f, 1.005f, -0.209f)
                lineToRelative(0.11f, -0.048f)
                curveToRelative(0.222f, -0.098f, 0.514f, -0.227f, 0.87f, -0.242f)
                horizontalLineToRelative(0.041f)
                curveToRelative(0.357f, 0.015f, 0.65f, 0.144f, 0.87f, 0.242f)
                quadToRelative(0.06f, 0.026f, 0.111f, 0.048f)
                curveToRelative(0.242f, 0.102f, 0.526f, 0.2f, 1.004f, 0.21f)
                curveToRelative(0.504f, -0.003f, 0.987f, -0.322f, 1.372f, -1.088f)
                curveToRelative(0.387f, -0.77f, 0.623f, -1.91f, 0.623f, -3.316f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.498f, -0.249f, 2.81f, -0.73f, 3.766f)
                curveTo(20.79f, 21.32f, 20.025f, 22.0f, 19.0f, 22.0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.376f, -0.288f)
                lineToRelative(-0.158f, -0.067f)
                curveToRelative(-0.21f, -0.09f, -0.312f, -0.134f, -0.456f, -0.144f)
                curveToRelative(-0.144f, 0.01f, -0.247f, 0.054f, -0.456f, 0.143f)
                lineToRelative(-0.158f, 0.068f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.01f, 22.0f)
                lineTo(15.0f, 22.0f)
                curveToRelative(-1.025f, 0.0f, -1.789f, -0.68f, -2.27f, -1.638f)
                reflectiveCurveTo(12.0f, 18.094f, 12.0f, 16.596f)
                curveToRelative(0.0f, -1.62f, 0.418f, -2.59f, 1.108f, -3.114f)
                curveToRelative(0.666f, -0.507f, 1.46f, -0.491f, 1.903f, -0.482f)
                lineToRelative(-0.001f, 0.001f)
                curveToRelative(0.324f, 0.0f, 0.576f, 0.034f, 0.79f, 0.097f)
                curveToRelative(0.217f, 0.064f, 0.373f, 0.15f, 0.49f, 0.217f)
                lineToRelative(0.005f, 0.003f)
                curveToRelative(0.097f, 0.055f, 0.157f, 0.09f, 0.228f, 0.116f)
                curveToRelative(0.125f, -1.48f, 0.738f, -2.355f, 1.415f, -2.853f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 1.352f, -0.563f)
                quadToRelative(0.064f, -0.01f, 0.103f, -0.013f)
                lineToRelative(0.043f, -0.004f)
                horizontalLineToRelative(0.007f)
                lineToRelative(0.008f, 0.148f)
                curveToRelative(0.003f, 0.073f, 0.01f, 0.184f, 0.017f, 0.351f)
                lineToRelative(0.027f, 0.499f)
                horizontalLineToRelative(0.003f)
                lineToRelative(-0.009f, 0.001f)
                lineToRelative(-0.053f, 0.007f)
                arcToRelative(2.14f, 2.14f, 0.0f, false, false, -0.906f, 0.38f)
                curveToRelative(-0.41f, 0.301f, -0.88f, 0.877f, -1.0f, 2.025f)
                curveToRelative(0.05f, -0.024f, 0.103f, -0.053f, 0.177f, -0.095f)
                lineToRelative(0.004f, -0.002f)
                curveToRelative(0.116f, -0.066f, 0.272f, -0.153f, 0.49f, -0.217f)
                curveToRelative(0.212f, -0.063f, 0.464f, -0.096f, 0.788f, -0.097f)
                curveToRelative(0.442f, -0.01f, 1.236f, -0.026f, 1.903f, 0.48f)
                curveToRelative(0.69f, 0.526f, 1.108f, 1.494f, 1.108f, 3.115f)
            }
        }
        .build()
        return _bottleAppleSmall!!
    }

private var _bottleAppleSmall: ImageVector? = null
