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

public val SBBIcons.EyeDisabledLarge: ImageVector
    get() {
        if (_eyeDisabledLarge != null) {
            return _eyeDisabledLarge!!
        }
        _eyeDisabledLarge = Builder(name = "EyeDisabledLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(45.647f, 45.354f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-43.0f, -43.0f)
                lineToRelative(-0.707f, 0.706f)
                lineToRelative(12.48f, 12.482f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, false, -2.288f, 1.722f)
                lineToRelative(-1.972f, -2.265f)
                lineToRelative(-0.754f, 0.656f)
                lineToRelative(1.973f, 2.266f)
                arcToRelative(35.0f, 35.0f, 0.0f, false, false, -2.803f, 2.859f)
                lineTo(6.994f, 18.12f)
                lineToRelative(-0.648f, 0.76f)
                lineToRelative(2.287f, 1.953f)
                arcToRelative(49.0f, 49.0f, 0.0f, false, false, -2.544f, 3.359f)
                lineToRelative(-0.008f, 0.011f)
                lineToRelative(-0.197f, 0.281f)
                lineToRelative(0.191f, 0.286f)
                curveToRelative(0.794f, 1.178f, 2.918f, 3.968f, 5.975f, 6.47f)
                curveToRelative(3.052f, 2.497f, 7.087f, 4.75f, 11.69f, 4.75f)
                horizontalLineToRelative(0.016f)
                arcToRelative(18.3f, 18.3f, 0.0f, false, false, 9.513f, -3.014f)
                close()
                moveTo(32.546f, 32.252f)
                lineToRelative(-2.754f, -2.754f)
                arcToRelative(8.003f, 8.003f, 0.0f, false, true, -11.456f, 0.145f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.145f, -11.456f)
                lineToRelative(-2.63f, -2.63f)
                curveToRelative(-4.31f, 2.797f, -7.435f, 7.07f, -8.75f, 8.933f)
                curveToRelative(0.88f, 1.25f, 2.846f, 3.735f, 5.583f, 5.975f)
                curveToRelative(2.962f, 2.425f, 6.773f, 4.52f, 11.045f, 4.523f)
                arcToRelative(17.3f, 17.3f, 0.0f, false, false, 8.817f, -2.736f)
                moveTo(17.73f, 20.86f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 1.457f, -1.965f)
                lineToRelative(3.637f, 3.637f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, -0.828f, 0.458f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, true, -0.767f, -0.365f)
                lineToRelative(-0.072f, -0.104f)
                lineToRelative(-0.536f, -0.886f)
                lineToRelative(-0.36f, 0.97f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, false, 4.77f, 5.247f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.93f, -1.182f)
                lineToRelative(2.122f, 2.121f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -11.353f, -7.93f)
                moveToRelative(5.456f, 2.729f)
                quadToRelative(0.199f, -0.15f, 0.353f, -0.342f)
                lineToRelative(2.715f, 2.715f)
                arcToRelative(2.991f, 2.991f, 0.0f, false, true, -5.232f, -2.226f)
                lineToRelative(0.004f, 0.003f)
                curveToRelative(0.298f, 0.167f, 0.634f, 0.253f, 0.975f, 0.25f)
                horizontalLineToRelative(0.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.185f, -0.4f)
                moveToRelative(18.248f, -4.837f)
                lineToRelative(-2.226f, 2.004f)
                arcToRelative(37.0f, 37.0f, 0.0f, false, true, 2.705f, 3.454f)
                lineToRelative(0.197f, 0.29f)
                lineToRelative(-0.208f, 0.285f)
                arcToRelative(33.5f, 33.5f, 0.0f, false, true, -6.597f, 6.771f)
                lineToRelative(-0.612f, -0.792f)
                arcToRelative(32.5f, 32.5f, 0.0f, false, false, 6.189f, -6.284f)
                curveToRelative(-0.906f, -1.29f, -2.992f, -4.006f, -5.844f, -6.474f)
                curveToRelative(-3.098f, -2.682f, -7.03f, -5.015f, -11.286f, -5.016f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, false, -5.782f, 1.379f)
                lineToRelative(-0.442f, -0.898f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, true, 3.302f, -1.15f)
                lineToRelative(-0.543f, -2.94f)
                lineToRelative(0.985f, -0.182f)
                lineToRelative(0.541f, 2.943f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, true, 1.93f, -0.152f)
                horizontalLineToRelative(0.006f)
                curveToRelative(0.735f, 0.0f, 1.458f, 0.064f, 2.168f, 0.182f)
                lineToRelative(0.592f, -2.922f)
                lineToRelative(0.98f, 0.2f)
                lineToRelative(-0.592f, 2.922f)
                curveToRelative(1.329f, 0.319f, 2.604f, 0.82f, 3.81f, 1.441f)
                lineToRelative(1.423f, -2.621f)
                lineToRelative(0.879f, 0.476f)
                lineToRelative(-1.423f, 2.624f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 3.311f, 2.292f)
                lineToRelative(1.918f, -2.294f)
                lineToRelative(0.768f, 0.64f)
                lineToRelative(-1.918f, 2.296f)
                lineToRelative(0.027f, 0.024f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 2.846f, 2.763f)
                lineToRelative(2.227f, -2.005f)
                close()
                moveTo(25.478f, 16.162f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.676f, 0.51f)
                lineToRelative(0.396f, 0.918f)
                arcToRelative(7.002f, 7.002f, 0.0f, false, true, 9.194f, 9.212f)
                lineToRelative(0.917f, 0.398f)
                arcToRelative(8.002f, 8.002f, 0.0f, false, false, -5.831f, -11.038f)
                moveToRelative(1.327f, 5.014f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, -2.392f, -1.142f)
                lineToRelative(-0.105f, 0.994f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, true, 2.645f, 2.646f)
                lineToRelative(0.994f, -0.106f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, -1.142f, -2.392f)
            }
        }
        .build()
        return _eyeDisabledLarge!!
    }

private var _eyeDisabledLarge: ImageVector? = null
