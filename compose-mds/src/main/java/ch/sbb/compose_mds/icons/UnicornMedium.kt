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

public val SBBIcons.UnicornMedium: ImageVector
    get() {
        if (_unicornMedium != null) {
            return _unicornMedium!!
        }
        _unicornMedium = Builder(name = "UnicornMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(31.314f, 8.432f)
                lineToRelative(-5.51f, 5.72f)
                lineToRelative(0.152f, 0.31f)
                curveToRelative(0.29f, 0.581f, 0.633f, 1.229f, 0.987f, 1.898f)
                quadToRelative(0.245f, 0.461f, 0.491f, 0.93f)
                curveToRelative(0.513f, 0.978f, 1.009f, 1.957f, 1.321f, 2.747f)
                curveToRelative(0.156f, 0.392f, 0.277f, 0.765f, 0.326f, 1.082f)
                curveToRelative(0.026f, 0.159f, 0.037f, 0.327f, 0.012f, 0.49f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, true, -0.252f, 0.506f)
                lineToRelative(-0.292f, 0.28f)
                lineToRelative(-0.02f, 0.02f)
                curveToRelative(-0.086f, 0.084f, -0.173f, 0.169f, -0.258f, 0.247f)
                curveToRelative(-0.18f, 0.166f, -0.38f, 0.334f, -0.607f, 0.45f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -0.944f, 0.131f)
                arcToRelative(1.38f, 1.38f, 0.0f, false, true, -0.545f, 0.8f)
                curveToRelative(-0.265f, 0.18f, -0.596f, 0.245f, -0.937f, 0.151f)
                curveToRelative(-0.317f, -0.086f, -0.602f, -0.298f, -0.85f, -0.597f)
                arcToRelative(14.9f, 14.9f, 0.0f, false, false, -4.339f, -2.889f)
                lineToRelative(0.4f, -0.916f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 4.646f, 3.097f)
                lineToRelative(0.025f, 0.023f)
                lineToRelative(0.02f, 0.026f)
                curveToRelative(0.168f, 0.21f, 0.297f, 0.274f, 0.361f, 0.292f)
                curveToRelative(0.053f, 0.014f, 0.083f, 0.004f, 0.114f, -0.016f)
                curveToRelative(0.086f, -0.058f, 0.219f, -0.278f, 0.146f, -0.607f)
                lineToRelative(-0.26f, -1.181f)
                lineToRelative(1.018f, 0.653f)
                curveToRelative(0.215f, 0.138f, 0.356f, 0.182f, 0.447f, 0.192f)
                curveToRelative(0.08f, 0.01f, 0.152f, -0.003f, 0.241f, -0.05f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.385f, -0.294f)
                quadToRelative(0.113f, -0.104f, 0.243f, -0.233f)
                lineToRelative(0.016f, -0.015f)
                quadToRelative(0.118f, -0.115f, 0.254f, -0.244f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.012f, -0.16f)
                quadToRelative(-0.049f, -0.313f, -0.268f, -0.87f)
                curveToRelative(-0.291f, -0.734f, -0.762f, -1.67f, -1.277f, -2.652f)
                quadToRelative(-0.237f, -0.451f, -0.478f, -0.906f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -1.009f, -1.94f)
                curveToRelative(-0.214f, -0.43f, -0.403f, -0.833f, -0.543f, -1.18f)
                curveToRelative(-0.131f, -0.326f, -0.238f, -0.649f, -0.264f, -0.915f)
                arcTo(2.53f, 2.53f, 0.0f, false, false, 23.0f, 10.935f)
                lineToRelative(-0.409f, -0.235f)
                lineToRelative(0.211f, -0.423f)
                lineToRelative(1.08f, -2.163f)
                quadToRelative(-0.104f, 0.024f, -0.213f, 0.055f)
                curveToRelative(-0.604f, 0.172f, -1.19f, 0.491f, -1.472f, 1.056f)
                lineToRelative(-0.189f, 0.378f)
                lineToRelative(-0.404f, -0.123f)
                arcToRelative(10.57f, 10.57f, 0.0f, false, false, -10.025f, 2.148f)
                lineToRelative(-0.01f, 0.007f)
                curveToRelative(-2.215f, 1.853f, -3.612f, 4.575f, -4.486f, 7.515f)
                curveToRelative(-0.82f, 2.764f, -1.165f, 5.682f, -1.308f, 8.165f)
                curveToRelative(5.37f, 0.68f, 9.583f, 1.376f, 14.854f, 2.646f)
                curveToRelative(-1.214f, -1.842f, -2.141f, -3.34f, -2.778f, -5.03f)
                curveToRelative(-0.76f, -2.015f, -1.101f, -4.272f, -1.101f, -7.68f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 3.342f, 0.334f, 5.466f, 1.037f, 7.328f)
                curveToRelative(0.707f, 1.875f, 1.796f, 3.514f, 3.379f, 5.896f)
                lineToRelative(0.714f, 1.074f)
                lineToRelative(-1.252f, -0.313f)
                curveToRelative(-5.975f, -1.494f, -10.455f, -2.24f, -16.441f, -2.989f)
                lineToRelative(-0.46f, -0.057f)
                lineToRelative(0.023f, -0.463f)
                curveToRelative(0.128f, -2.617f, 0.47f, -5.816f, 1.375f, -8.86f)
                curveToRelative(0.902f, -3.038f, 2.375f, -5.966f, 4.795f, -7.993f)
                arcToRelative(11.57f, 11.57f, 0.0f, false, true, 10.602f, -2.458f)
                curveToRelative(0.499f, -0.69f, 1.26f, -1.034f, 1.871f, -1.208f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 1.235f, -0.203f)
                lineToRelative(0.035f, -0.002f)
                lineToRelative(0.05f, -0.002f)
                horizontalLineToRelative(0.845f)
                lineToRelative(-0.361f, 0.724f)
                lineToRelative(-1.305f, 2.607f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.361f, 0.318f)
                lineToRelative(6.49f, -3.017f)
                lineToRelative(2.43f, -1.13f)
                close()
                moveTo(28.734f, 9.668f)
                lineTo(25.37f, 13.16f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.123f, -0.452f)
                lineToRelative(-0.001f, -0.01f)
                lineToRelative(-0.001f, -0.01f)
                lineToRelative(-0.032f, -0.203f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.355f, -1.014f)
                close()
                moveTo(20.999f, 13.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.5f)
                moveToRelative(0.0f, 1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
            }
        }
        .build()
        return _unicornMedium!!
    }

private var _unicornMedium: ImageVector? = null
