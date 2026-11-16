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
                moveToRelative(20.288f, 9.38f)
                lineToRelative(0.541f, 2.936f)
                curveToRelative(-1.35f, 0.302f, -2.63f, 0.798f, -3.833f, 1.42f)
                lineTo(15.56f, 11.11f)
                lineToRelative(-0.877f, 0.48f)
                lineToRelative(1.438f, 2.628f)
                arcToRelative(23.6f, 23.6f, 0.0f, false, false, -3.28f, 2.339f)
                lineToRelative(-1.973f, -2.265f)
                lineToRelative(-0.754f, 0.656f)
                lineToRelative(1.973f, 2.266f)
                arcToRelative(35.0f, 35.0f, 0.0f, false, false, -2.8f, 2.861f)
                lineTo(6.994f, 18.12f)
                lineToRelative(-0.648f, 0.76f)
                lineToRelative(2.29f, 1.956f)
                arcToRelative(51.0f, 51.0f, 0.0f, false, false, -2.465f, 3.24f)
                lineToRelative(-0.088f, 0.124f)
                lineToRelative(-0.201f, 0.282f)
                lineToRelative(0.193f, 0.287f)
                curveToRelative(0.794f, 1.179f, 2.918f, 3.969f, 5.975f, 6.47f)
                curveToRelative(3.052f, 2.498f, 7.087f, 4.751f, 11.69f, 4.751f)
                curveToRelative(4.598f, 0.0f, 8.698f, -2.195f, 11.846f, -4.665f)
                curveToRelative(3.152f, -2.473f, 5.402f, -5.263f, 6.312f, -6.546f)
                lineToRelative(0.2f, -0.282f)
                lineToRelative(-0.194f, -0.287f)
                arcToRelative(37.0f, 37.0f, 0.0f, false, false, -2.7f, -3.45f)
                lineToRelative(2.23f, -2.008f)
                lineToRelative(-0.668f, -0.744f)
                lineToRelative(-2.233f, 2.01f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -2.85f, -2.768f)
                lineToRelative(-0.022f, -0.02f)
                lineToRelative(1.923f, -2.3f)
                lineToRelative(-0.768f, -0.64f)
                lineToRelative(-1.922f, 2.299f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -3.31f, -2.293f)
                lineToRelative(1.426f, -2.628f)
                lineToRelative(-0.88f, -0.476f)
                lineToRelative(-1.424f, 2.625f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, -3.808f, -1.443f)
                lineToRelative(0.592f, -2.924f)
                lineToRelative(-0.98f, -0.2f)
                lineToRelative(-0.592f, 2.924f)
                curveToRelative(-0.713f, -0.12f, -1.44f, -0.184f, -2.178f, -0.184f)
                quadToRelative(-0.983f, 0.002f, -1.928f, 0.143f)
                lineToRelative(-0.54f, -2.934f)
                close()
                moveTo(12.787f, 17.927f)
                curveToRelative(2.944f, -2.653f, 6.698f, -4.937f, 10.953f, -4.937f)
                curveToRelative(4.257f, 0.0f, 8.19f, 2.333f, 11.29f, 5.016f)
                curveToRelative(2.853f, 2.47f, 4.94f, 5.187f, 5.845f, 6.476f)
                curveToRelative(-0.98f, 1.327f, -3.066f, 3.827f, -5.906f, 6.056f)
                curveToRelative(-3.062f, 2.402f, -6.947f, 4.452f, -11.229f, 4.452f)
                curveToRelative(-4.276f, 0.0f, -8.091f, -2.098f, -11.056f, -4.524f)
                curveToRelative(-2.736f, -2.239f, -4.701f, -4.723f, -5.582f, -5.973f)
                curveToRelative(0.977f, -1.373f, 2.954f, -4.104f, 5.685f, -6.565f)
                moveToRelative(11.203f, -0.937f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 0.0f, 14.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, -14.0f)
                moveToRelative(0.0f, 15.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                moveToRelative(-0.028f, -12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.92f, 4.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.911f, -0.484f)
                lineToRelative(-0.011f, -0.296f)
                curveToRelative(-0.002f, -0.394f, 0.06f, -0.786f, 0.185f, -1.16f)
                horizontalLineToRelative(0.001f)
                quadToRelative(0.055f, -0.166f, 0.145f, -0.317f)
                lineToRelative(0.43f, -0.716f)
                lineToRelative(0.428f, 0.716f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, 0.84f, 0.476f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, 1.001f, -1.002f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, false, -0.475f, -0.837f)
                lineToRelative(-0.904f, -0.536f)
                lineToRelative(0.986f, -0.363f)
                lineToRelative(0.19f, -0.07f)
                lineToRelative(0.007f, -0.003f)
                lineToRelative(0.007f, -0.003f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 1.159f, -0.184f)
                close()
                moveTo(23.957f, 20.991f)
                quadToRelative(-0.116f, 0.0f, -0.232f, 0.01f)
                lineToRelative(0.004f, 0.006f)
                lineToRelative(0.004f, 0.006f)
                curveToRelative(0.17f, 0.299f, 0.258f, 0.637f, 0.257f, 0.98f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -1.997f, 1.998f)
                horizontalLineToRelative(-0.003f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.002f, -0.273f)
                lineToRelative(-0.014f, -0.008f)
                quadToRelative(-0.015f, 0.138f, -0.014f, 0.278f)
                verticalLineToRelative(0.003f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, false, 5.942f, 0.585f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.942f, -3.585f)
                close()
            }
        }
        .build()
        return _eyeLarge!!
    }

private var _eyeLarge: ImageVector? = null
