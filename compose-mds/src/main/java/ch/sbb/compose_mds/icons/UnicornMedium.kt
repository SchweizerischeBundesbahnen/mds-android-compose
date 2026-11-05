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
                curveToRelative(0.289f, 0.581f, 0.633f, 1.23f, 0.988f, 1.9f)
                lineToRelative(0.49f, 0.927f)
                curveToRelative(0.513f, 0.979f, 1.008f, 1.958f, 1.321f, 2.748f)
                curveToRelative(0.155f, 0.393f, 0.277f, 0.765f, 0.327f, 1.082f)
                curveToRelative(0.024f, 0.159f, 0.036f, 0.327f, 0.011f, 0.49f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, true, -0.252f, 0.506f)
                quadToRelative(-0.149f, 0.14f, -0.285f, 0.274f)
                lineToRelative(-0.007f, 0.007f)
                quadToRelative(-0.14f, 0.137f, -0.278f, 0.266f)
                curveToRelative(-0.18f, 0.166f, -0.38f, 0.333f, -0.607f, 0.45f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -0.942f, 0.132f)
                curveToRelative(-0.088f, 0.325f, -0.271f, 0.613f, -0.547f, 0.799f)
                arcToRelative(1.12f, 1.12f, 0.0f, false, true, -0.937f, 0.151f)
                curveToRelative(-0.32f, -0.087f, -0.608f, -0.301f, -0.857f, -0.604f)
                arcToRelative(14.9f, 14.9f, 0.0f, false, false, -4.332f, -2.882f)
                lineToRelative(0.4f, -0.916f)
                curveToRelative(1.72f, 0.75f, 3.292f, 1.8f, 4.647f, 3.097f)
                lineToRelative(0.023f, 0.023f)
                lineToRelative(0.02f, 0.026f)
                curveToRelative(0.169f, 0.21f, 0.298f, 0.274f, 0.362f, 0.292f)
                curveToRelative(0.053f, 0.014f, 0.084f, 0.005f, 0.114f, -0.016f)
                curveToRelative(0.086f, -0.058f, 0.219f, -0.278f, 0.146f, -0.606f)
                lineToRelative(-0.26f, -1.182f)
                lineToRelative(1.018f, 0.653f)
                curveToRelative(0.215f, 0.138f, 0.356f, 0.182f, 0.448f, 0.193f)
                curveToRelative(0.08f, 0.01f, 0.15f, -0.004f, 0.24f, -0.05f)
                curveToRelative(0.103f, -0.053f, 0.222f, -0.144f, 0.386f, -0.295f)
                quadToRelative(0.118f, -0.11f, 0.259f, -0.248f)
                lineToRelative(0.009f, -0.009f)
                quadToRelative(0.114f, -0.112f, 0.246f, -0.237f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.013f, -0.158f)
                quadToRelative(-0.049f, -0.313f, -0.269f, -0.87f)
                curveToRelative(-0.29f, -0.734f, -0.762f, -1.67f, -1.277f, -2.652f)
                curveToRelative(-0.157f, -0.3f, -0.32f, -0.605f, -0.48f, -0.908f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -1.007f, -1.937f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, true, -0.543f, -1.181f)
                curveToRelative(-0.132f, -0.33f, -0.24f, -0.655f, -0.266f, -0.923f)
                arcToRelative(2.53f, 2.53f, 0.0f, false, false, -1.251f, -1.87f)
                lineToRelative(-0.41f, -0.235f)
                lineToRelative(0.211f, -0.423f)
                lineToRelative(1.082f, -2.163f)
                quadToRelative(-0.105f, 0.024f, -0.216f, 0.055f)
                curveToRelative(-0.603f, 0.173f, -1.189f, 0.49f, -1.471f, 1.056f)
                lineToRelative(-0.19f, 0.377f)
                lineToRelative(-0.403f, -0.123f)
                arcToRelative(10.57f, 10.57f, 0.0f, false, false, -10.026f, 2.149f)
                lineToRelative(-0.008f, 0.007f)
                curveToRelative(-2.216f, 1.853f, -3.613f, 4.575f, -4.487f, 7.516f)
                curveToRelative(-0.82f, 2.763f, -1.167f, 5.68f, -1.31f, 8.162f)
                curveToRelative(5.37f, 0.68f, 9.583f, 1.377f, 14.852f, 2.647f)
                curveToRelative(-1.213f, -1.841f, -2.138f, -3.34f, -2.774f, -5.028f)
                curveToRelative(-0.76f, -2.016f, -1.101f, -4.273f, -1.101f, -7.681f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 3.342f, 0.334f, 5.466f, 1.036f, 7.328f)
                curveToRelative(0.707f, 1.873f, 1.795f, 3.51f, 3.375f, 5.888f)
                lineToRelative(0.005f, 0.007f)
                lineToRelative(0.714f, 1.075f)
                lineToRelative(-1.252f, -0.313f)
                curveToRelative(-5.975f, -1.494f, -10.455f, -2.24f, -16.44f, -2.989f)
                lineToRelative(-0.46f, -0.057f)
                lineToRelative(0.022f, -0.463f)
                curveToRelative(0.128f, -2.617f, 0.47f, -5.816f, 1.375f, -8.86f)
                curveToRelative(0.902f, -3.04f, 2.377f, -5.969f, 4.8f, -7.996f)
                arcTo(11.57f, 11.57f, 0.0f, false, true, 21.52f, 8.415f)
                curveToRelative(0.5f, -0.69f, 1.262f, -1.034f, 1.872f, -1.208f)
                arcTo(5.6f, 5.6f, 0.0f, false, true, 24.713f, 7.0f)
                horizontalLineToRelative(0.036f)
                verticalLineToRelative(0.5f)
                lineTo(24.749f, 7.0f)
                horizontalLineToRelative(0.81f)
                lineToRelative(-0.362f, 0.724f)
                lineToRelative(-1.303f, 2.606f)
                quadToRelative(0.191f, 0.147f, 0.36f, 0.319f)
                lineToRelative(6.488f, -3.017f)
                lineToRelative(2.43f, -1.13f)
                close()
                moveTo(28.734f, 9.668f)
                lineTo(25.371f, 13.16f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.123f, -0.451f)
                lineToRelative(-0.001f, -0.011f)
                lineToRelative(-0.002f, -0.01f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.386f, -1.218f)
                close()
                moveTo(20.75f, 13.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
                moveToRelative(0.25f, -1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
            }
        }
        .build()
        return _unicornMedium!!
    }

private var _unicornMedium: ImageVector? = null
