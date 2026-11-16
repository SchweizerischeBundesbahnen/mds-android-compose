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

public val SBBIcons.UnicornSmall: ImageVector
    get() {
        if (_unicornSmall != null) {
            return _unicornSmall!!
        }
        _unicornSmall = Builder(name = "UnicornSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(20.996f, 5.737f)
                lineToRelative(-3.592f, 3.73f)
                lineToRelative(0.05f, 0.1f)
                curveToRelative(0.19f, 0.385f, 0.418f, 0.813f, 0.654f, 1.258f)
                quadToRelative(0.164f, 0.308f, 0.329f, 0.623f)
                curveToRelative(0.342f, 0.652f, 0.675f, 1.313f, 0.888f, 1.849f)
                curveToRelative(0.105f, 0.265f, 0.191f, 0.527f, 0.227f, 0.757f)
                curveToRelative(0.018f, 0.114f, 0.027f, 0.245f, 0.008f, 0.376f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -0.219f, 0.435f)
                lineToRelative(-0.192f, 0.185f)
                lineToRelative(-0.19f, 0.18f)
                curveToRelative(-0.122f, 0.113f, -0.269f, 0.238f, -0.44f, 0.327f)
                curveToRelative(-0.174f, 0.088f, -0.372f, 0.137f, -0.594f, 0.12f)
                arcToRelative(1.05f, 1.05f, 0.0f, false, true, -0.381f, 0.49f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, true, -0.763f, 0.123f)
                curveToRelative(-0.246f, -0.067f, -0.455f, -0.226f, -0.632f, -0.434f)
                arcToRelative(9.8f, 9.8f, 0.0f, false, false, -2.85f, -1.898f)
                lineToRelative(0.4f, -0.916f)
                arcToRelative(10.8f, 10.8f, 0.0f, false, true, 3.146f, 2.097f)
                lineToRelative(0.025f, 0.023f)
                lineToRelative(0.02f, 0.025f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.111f, 0.113f)
                lineToRelative(0.003f, -0.005f)
                lineToRelative(0.002f, -0.005f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, false, 0.005f, -0.183f)
                lineToRelative(-0.26f, -1.181f)
                lineToRelative(1.018f, 0.653f)
                curveToRelative(0.13f, 0.083f, 0.2f, 0.1f, 0.228f, 0.104f)
                curveToRelative(0.015f, 0.002f, 0.03f, 0.001f, 0.065f, -0.017f)
                curveToRelative(0.047f, -0.024f, 0.113f, -0.073f, 0.22f, -0.17f)
                lineToRelative(0.17f, -0.163f)
                lineToRelative(0.113f, -0.11f)
                verticalLineToRelative(-0.006f)
                lineToRelative(-0.001f, -0.008f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.169f, -0.544f)
                curveToRelative(-0.19f, -0.48f, -0.5f, -1.097f, -0.844f, -1.752f)
                quadToRelative(-0.156f, -0.299f, -0.317f, -0.6f)
                curveToRelative(-0.24f, -0.453f, -0.478f, -0.902f, -0.676f, -1.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.367f, -0.8f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, -0.187f, -0.651f)
                arcToRelative(1.52f, 1.52f, 0.0f, false, false, -0.754f, -1.128f)
                lineToRelative(-0.409f, -0.235f)
                lineToRelative(0.211f, -0.423f)
                lineToRelative(0.546f, -1.092f)
                curveToRelative(-0.287f, 0.115f, -0.526f, 0.289f, -0.651f, 0.54f)
                lineToRelative(-0.189f, 0.378f)
                lineToRelative(-0.404f, -0.123f)
                arcToRelative(6.88f, 6.88f, 0.0f, false, false, -6.525f, 1.398f)
                lineToRelative(-0.01f, 0.007f)
                curveToRelative(-1.442f, 1.206f, -2.36f, 2.987f, -2.938f, 4.93f)
                curveToRelative(-0.525f, 1.769f, -0.755f, 3.636f, -0.855f, 5.25f)
                curveToRelative(3.372f, 0.43f, 6.074f, 0.875f, 9.356f, 1.65f)
                curveToRelative(-0.7f, -1.075f, -1.248f, -2.003f, -1.637f, -3.035f)
                curveToRelative(-0.517f, -1.37f, -0.745f, -2.896f, -0.745f, -5.179f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.217f, 0.222f, 3.61f, 0.68f, 4.826f)
                curveToRelative(0.464f, 1.23f, 1.177f, 2.306f, 2.236f, 3.898f)
                lineToRelative(0.714f, 1.074f)
                lineToRelative(-1.252f, -0.313f)
                curveToRelative(-3.975f, -0.994f, -6.955f, -1.49f, -10.941f, -1.989f)
                lineToRelative(-0.46f, -0.057f)
                lineToRelative(0.023f, -0.463f)
                curveToRelative(0.086f, -1.751f, 0.315f, -3.899f, 0.923f, -5.947f)
                curveToRelative(0.606f, -2.04f, 1.6f, -4.025f, 3.247f, -5.406f)
                arcToRelative(7.88f, 7.88f, 0.0f, false, true, 7.113f, -1.702f)
                curveToRelative(0.362f, -0.442f, 0.87f, -0.663f, 1.266f, -0.776f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.862f, -0.142f)
                lineToRelative(0.027f, -0.001f)
                lineToRelative(0.033f, -0.002f)
                horizontalLineToRelative(0.837f)
                lineToRelative(-0.361f, 0.724f)
                lineToRelative(-0.81f, 1.618f)
                lineToRelative(0.066f, 0.058f)
                lineToRelative(4.221f, -1.963f)
                lineToRelative(2.43f, -1.13f)
                close()
                moveTo(18.416f, 6.973f)
                lineTo(16.996f, 8.447f)
                verticalLineToRelative(-0.01f)
                lineToRelative(-0.023f, -0.144f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.176f, -0.567f)
                close()
                moveTo(13.999f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _unicornSmall!!
    }

private var _unicornSmall: ImageVector? = null
