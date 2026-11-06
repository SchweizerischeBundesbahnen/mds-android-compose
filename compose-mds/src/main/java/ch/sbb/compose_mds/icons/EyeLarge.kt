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

public val SBBIcons.EyeLarge: ImageVector
    get() {
        if (_eyeLarge != null) {
            return _eyeLarge!!
        }
        _eyeLarge = Builder(name = "EyeLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(21.271f, 9.2f)
                lineToRelative(0.54f, 2.933f)
                quadToRelative(0.945f, -0.141f, 1.93f, -0.143f)
                curveToRelative(0.738f, 0.0f, 1.464f, 0.065f, 2.177f, 0.184f)
                lineToRelative(0.592f, -2.923f)
                lineToRelative(0.98f, 0.198f)
                lineToRelative(-0.592f, 2.925f)
                curveToRelative(1.328f, 0.32f, 2.602f, 0.822f, 3.808f, 1.443f)
                lineToRelative(1.425f, -2.625f)
                lineToRelative(0.879f, 0.476f)
                lineToRelative(-1.426f, 2.628f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 3.31f, 2.293f)
                lineToRelative(1.922f, -2.3f)
                lineToRelative(0.767f, 0.642f)
                lineToRelative(-1.922f, 2.3f)
                lineToRelative(0.023f, 0.018f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 2.85f, 2.768f)
                lineToRelative(2.231f, -2.009f)
                lineToRelative(0.67f, 0.744f)
                lineToRelative(-2.232f, 2.008f)
                arcToRelative(37.0f, 37.0f, 0.0f, false, true, 2.7f, 3.45f)
                lineToRelative(0.196f, 0.286f)
                lineToRelative(-0.201f, 0.283f)
                curveToRelative(-0.91f, 1.283f, -3.16f, 4.072f, -6.312f, 6.546f)
                curveToRelative(-3.148f, 2.47f, -7.248f, 4.665f, -11.846f, 4.665f)
                curveToRelative(-4.603f, 0.0f, -8.638f, -2.253f, -11.69f, -4.75f)
                curveToRelative(-3.057f, -2.502f, -5.18f, -5.292f, -5.975f, -6.47f)
                lineToRelative(-0.193f, -0.288f)
                lineToRelative(0.2f, -0.282f)
                lineToRelative(0.09f, -0.125f)
                arcToRelative(51.0f, 51.0f, 0.0f, false, true, 2.465f, -3.24f)
                lineTo(6.345f, 18.88f)
                lineToRelative(0.65f, -0.76f)
                lineToRelative(2.29f, 1.955f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 2.8f, -2.861f)
                lineToRelative(-1.972f, -2.266f)
                lineToRelative(0.754f, -0.656f)
                lineToRelative(1.972f, 2.264f)
                arcToRelative(23.6f, 23.6f, 0.0f, false, true, 3.281f, -2.339f)
                lineToRelative(-1.439f, -2.627f)
                lineToRelative(0.878f, -0.48f)
                lineToRelative(1.437f, 2.625f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 3.833f, -1.419f)
                lineToRelative(-0.541f, -2.935f)
                close()
                moveTo(12.683f, 30.466f)
                curveToRelative(-2.735f, -2.24f, -4.702f, -4.722f, -5.583f, -5.972f)
                curveToRelative(0.976f, -1.372f, 2.955f, -4.103f, 5.687f, -6.566f)
                curveToRelative(2.944f, -2.654f, 6.698f, -4.938f, 10.953f, -4.938f)
                curveToRelative(4.257f, 0.0f, 8.19f, 2.333f, 11.29f, 5.016f)
                curveToRelative(2.855f, 2.471f, 4.943f, 5.189f, 5.848f, 6.477f)
                curveToRelative(-0.98f, 1.327f, -3.068f, 3.826f, -5.909f, 6.055f)
                curveToRelative(-3.062f, 2.403f, -6.947f, 4.452f, -11.229f, 4.452f)
                curveToRelative(-4.276f, 0.0f, -8.091f, -2.097f, -11.057f, -4.524f)
                moveToRelative(4.307f, -6.476f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 14.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -14.0f, 0.0f)
                moveToRelative(7.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                moveToRelative(-0.264f, 5.009f)
                quadToRelative(0.116f, -0.01f, 0.23f, -0.009f)
                horizontalLineToRelative(0.004f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -3.0f, 3.0f)
                verticalLineToRelative(-0.003f)
                quadToRelative(0.0f, -0.14f, 0.013f, -0.278f)
                lineToRelative(0.04f, 0.023f)
                curveToRelative(0.298f, 0.17f, 0.635f, 0.258f, 0.977f, 0.258f)
                horizontalLineToRelative(0.003f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, false, 1.997f, -1.997f)
                verticalLineToRelative(-0.001f)
                arcToRelative(1.97f, 1.97f, 0.0f, false, false, -0.256f, -0.98f)
                close()
                moveTo(20.146f, 22.833f)
                quadToRelative(0.054f, -0.168f, 0.145f, -0.32f)
                lineToRelative(0.43f, -0.716f)
                lineToRelative(0.428f, 0.716f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, 1.545f, 0.181f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.296f, -0.707f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, false, -0.475f, -0.837f)
                lineToRelative(-0.904f, -0.536f)
                lineToRelative(0.986f, -0.363f)
                lineToRelative(0.19f, -0.07f)
                lineToRelative(0.007f, -0.003f)
                lineToRelative(0.007f, -0.002f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 1.16f, -0.186f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.001f, 4.002f)
                close()
            }
        }
        .build()
        return _eyeLarge!!
    }

private var _eyeLarge: ImageVector? = null
