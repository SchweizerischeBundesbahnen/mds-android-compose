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

public val SBBIcons.AppleBagLarge: ImageVector
    get() {
        if (_appleBagLarge != null) {
            return _appleBagLarge!!
        }
        _appleBagLarge = Builder(
            name = "AppleBagLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(20.5f, 4.0f)
                horizontalLineToRelative(-0.29f)
                lineToRelative(-0.144f, 0.252f)
                lineToRelative(-3.1f, 5.43f)
                curveTo(16.375f, 10.717f, 17.128f, 12.0f, 18.31f, 12.0f)
                horizontalLineToRelative(0.643f)
                arcTo(89.0f, 89.0f, 0.0f, false, false, 17.5f, 23.974f)
                lineToRelative(0.998f, 0.052f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 19.971f, 12.0f)
                horizontalLineToRelative(15.84f)
                curveToRelative(1.23f, 0.0f, 2.355f, -0.657f, 2.963f, -1.722f)
                lineToRelative(1.782f, -3.118f)
                quadToRelative(-0.069f, 0.446f, -0.144f, 0.954f)
                arcToRelative(199.0f, 199.0f, 0.0f, false, false, -1.16f, 9.336f)
                curveToRelative(-0.733f, 7.337f, -1.232f, 16.615f, -0.316f, 24.55f)
                horizontalLineTo(23.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(16.618f)
                lineToRelative(0.106f, -0.053f)
                lineToRelative(6.0f, -3.0f)
                lineTo(46.0f, 39.81f)
                verticalLineTo(39.5f)
                horizontalLineToRelative(-0.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-0.318f)
                lineToRelative(-0.008f, -0.904f)
                curveToRelative(-0.008f, -0.781f, -0.023f, -1.904f, -0.055f, -3.274f)
                arcToRelative(262.0f, 262.0f, 0.0f, false, false, -0.438f, -10.41f)
                curveToRelative(-0.25f, -3.945f, -0.627f, -8.118f, -1.192f, -11.75f)
                curveToRelative(-0.563f, -3.607f, -1.322f, -6.754f, -2.373f, -8.592f)
                lineTo(41.79f, 4.0f)
                horizontalLineTo(20.5f)
                moveToRelative(19.413f, 37.735f)
                lineToRelative(5.086f, -2.544f)
                verticalLineToRelative(-0.005f)
                arcToRelative(256.631f, 256.631f, 0.0f, false, false, -0.061f, -4.16f)
                curveToRelative(-0.063f, -2.729f, -0.187f, -6.44f, -0.437f, -10.37f)
                reflectiveCurveTo(43.878f, 16.587f, 43.32f, 13.0f)
                curveToRelative(-0.426f, -2.732f, -0.954f, -5.102f, -1.597f, -6.814f)
                arcToRelative(197.808f, 197.808f, 0.0f, false, false, -1.475f, 11.365f)
                curveToRelative(-0.727f, 7.269f, -1.215f, 16.391f, -0.334f, 24.185f)
                moveTo(20.79f, 5.0f)
                horizontalLineTo(40.64f)
                lineToRelative(-2.733f, 4.782f)
                arcTo(2.41f, 2.41f, 0.0f, false, true, 35.81f, 11.0f)
                horizontalLineToRelative(-17.5f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.476f, -0.822f)
                close()
                moveTo(4.473f, 33.834f)
                curveToRelative(0.05f, -1.835f, 0.768f, -3.712f, 2.585f, -4.466f)
                lineToRelative(0.383f, 0.924f)
                curveToRelative(-1.292f, 0.536f, -1.924f, 1.92f, -1.969f, 3.57f)
                curveToRelative(-0.045f, 1.645f, 0.51f, 3.369f, 1.365f, 4.35f)
                lineToRelative(-0.754f, 0.657f)
                curveToRelative(-1.055f, -1.21f, -1.66f, -3.197f, -1.61f, -5.035f)
                moveToRelative(5.85f, -10.792f)
                curveToRelative(0.12f, 0.39f, 0.399f, 0.871f, 0.825f, 1.33f)
                curveToRelative(0.427f, 0.458f, 0.887f, 0.77f, 1.268f, 0.918f)
                curveToRelative(0.392f, 0.152f, 0.553f, 0.084f, 0.589f, 0.058f)
                quadToRelative(0.018f, -0.034f, 0.04f, -0.067f)
                curveToRelative(0.027f, -0.08f, 0.044f, -0.241f, -0.046f, -0.534f)
                curveToRelative(-0.12f, -0.39f, -0.4f, -0.871f, -0.826f, -1.33f)
                curveToRelative(-0.427f, -0.458f, -0.887f, -0.77f, -1.267f, -0.918f)
                curveToRelative(-0.417f, -0.162f, -0.572f, -0.075f, -0.595f, -0.053f)
                curveToRelative(-0.023f, 0.02f, -0.12f, 0.17f, 0.011f, 0.596f)
                moveToRelative(1.73f, 3.18f)
                curveToRelative(0.192f, 0.074f, 0.403f, 0.133f, 0.617f, 0.154f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.106f, 0.599f)
                curveToRelative(-0.696f, -0.065f, -1.38f, -0.25f, -1.955f, -0.617f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-1.27f, -0.804f, -2.712f, -1.098f, -4.13f, -0.644f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-1.8f, 0.592f, -3.112f, 2.239f, -3.828f, 4.306f)
                curveToRelative(-0.719f, 2.077f, -0.867f, 4.646f, -0.294f, 7.228f)
                curveToRelative(0.567f, 2.58f, 1.755f, 4.73f, 3.252f, 6.108f)
                curveToRelative(1.497f, 1.38f, 3.349f, 2.016f, 5.168f, 1.42f)
                curveToRelative(0.335f, -0.104f, 0.638f, -0.252f, 0.918f, -0.413f)
                lineToRelative(0.005f, -0.003f)
                curveToRelative(0.417f, -0.247f, 0.86f, -0.37f, 1.305f, -0.37f)
                reflectiveCurveToRelative(0.888f, 0.123f, 1.305f, 0.37f)
                lineToRelative(0.005f, 0.003f)
                curveToRelative(0.28f, 0.162f, 0.583f, 0.31f, 0.918f, 0.413f)
                curveToRelative(1.82f, 0.596f, 3.67f, -0.04f, 5.168f, -1.42f)
                curveToRelative(1.497f, -1.378f, 2.684f, -3.528f, 3.252f, -6.108f)
                curveToRelative(0.573f, -2.581f, 0.425f, -5.151f, -0.294f, -7.228f)
                curveToRelative(-0.716f, -2.067f, -2.027f, -3.714f, -3.828f, -4.305f)
                lineToRelative(-0.156f, 0.475f)
                lineToRelative(0.152f, -0.476f)
                curveToRelative(-1.417f, -0.454f, -2.86f, -0.16f, -4.13f, 0.643f)
                verticalLineToRelative(0.001f)
                curveToRelative(-0.536f, 0.341f, -1.166f, 0.526f, -1.813f, 0.602f)
                quadToRelative(0.015f, -0.098f, 0.035f, -0.2f)
                curveToRelative(0.04f, -0.213f, 0.088f, -0.429f, 0.143f, -0.614f)
                quadToRelative(0.051f, -0.164f, 0.09f, -0.25f)
                quadToRelative(0.044f, -0.062f, 0.077f, -0.128f)
                curveToRelative(0.348f, -0.446f, 0.872f, -0.768f, 1.347f, -0.982f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.785f, -0.285f)
                lineToRelative(0.045f, -0.011f)
                lineToRelative(0.01f, -0.002f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, true, -0.223f, -0.975f)
                horizontalLineToRelative(-0.003f)
                lineToRelative(-0.005f, 0.002f)
                lineToRelative(-0.019f, 0.004f)
                lineToRelative(-0.063f, 0.017f)
                arcToRelative(6.49f, 6.49f, 0.0f, false, false, -0.939f, 0.339f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -0.922f, 0.523f)
                curveToRelative(-0.18f, -0.547f, -0.542f, -1.135f, -1.032f, -1.662f)
                curveToRelative(-0.507f, -0.544f, -1.088f, -0.956f, -1.638f, -1.17f)
                curveToRelative(-0.513f, -0.198f, -1.175f, -0.283f, -1.637f, 0.148f)
                reflectiveCurveToRelative(-0.426f, 1.097f, -0.263f, 1.623f)
                curveToRelative(0.173f, 0.563f, 0.543f, 1.172f, 1.05f, 1.716f)
                curveToRelative(0.506f, 0.544f, 1.087f, 0.956f, 1.637f, 1.17f)
                moveToRelative(3.875f, 0.98f)
                curveToRelative(1.07f, -0.676f, 2.206f, -0.882f, 3.288f, -0.536f)
                curveToRelative(1.398f, 0.46f, 2.537f, 1.787f, 3.193f, 3.681f)
                curveToRelative(0.653f, 1.886f, 0.8f, 4.267f, 0.263f, 6.685f)
                curveToRelative(-0.533f, 2.42f, -1.635f, 4.375f, -2.953f, 5.589f)
                curveToRelative(-1.317f, 1.212f, -2.804f, 1.657f, -4.183f, 1.204f)
                lineToRelative(-0.008f, -0.003f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.716f, -0.324f)
                arcTo(3.55f, 3.55f, 0.0f, false, false, 13.0f, 42.99f)
                curveToRelative(-0.634f, 0.0f, -1.25f, 0.176f, -1.812f, 0.508f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.716f, 0.325f)
                lineToRelative(-0.008f, 0.002f)
                curveToRelative(-1.38f, 0.453f, -2.866f, 0.008f, -4.183f, -1.204f)
                curveToRelative(-1.318f, -1.214f, -2.42f, -3.168f, -2.953f, -5.588f)
                verticalLineToRelative(-0.001f)
                curveToRelative(-0.537f, -2.418f, -0.39f, -4.799f, 0.263f, -6.685f)
                curveToRelative(0.656f, -1.894f, 1.795f, -3.222f, 3.193f, -3.681f)
                curveToRelative(1.082f, -0.346f, 2.218f, -0.14f, 3.288f, 0.536f)
                curveToRelative(0.903f, 0.575f, 1.962f, 0.777f, 2.917f, 0.798f)
                horizontalLineToRelative(0.022f)
                curveToRelative(0.955f, -0.021f, 2.014f, -0.223f, 2.917f, -0.798f)
            }
        }
            .build()
        return _appleBagLarge!!
    }

private var _appleBagLarge: ImageVector? = null
