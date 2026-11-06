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

public val SBBIcons.RocketLarge: ImageVector
    get() {
        if (_rocketLarge != null) {
            return _rocketLarge!!
        }
        _rocketLarge = Builder(name = "RocketLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(24.885f, 8.512f)
                lineToRelative(-0.375f, -0.423f)
                lineToRelative(-0.374f, 0.423f)
                curveToRelative(-6.515f, 7.362f, -8.044f, 15.084f, -7.938f, 20.964f)
                quadToRelative(0.022f, 1.13f, 0.114f, 2.161f)
                curveToRelative(-2.112f, 1.162f, -2.93f, 2.996f, -3.21f, 4.541f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, false, -0.044f, 2.698f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.04f, 0.228f)
                lineToRelative(0.002f, 0.014f)
                lineToRelative(0.001f, 0.005f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.49f, -0.104f)
                lineToRelative(-0.49f, 0.105f)
                lineToRelative(0.185f, 0.855f)
                lineToRelative(0.643f, -0.592f)
                curveToRelative(1.172f, -1.08f, 2.33f, -1.706f, 3.426f, -2.03f)
                curveToRelative(0.154f, 0.536f, 0.298f, 0.978f, 0.415f, 1.312f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.259f, 0.689f)
                lineToRelative(0.015f, 0.038f)
                lineToRelative(0.005f, 0.01f)
                lineToRelative(0.001f, 0.004f)
                curveToRelative(0.0f, 0.001f, 0.001f, 0.001f, 0.46f, -0.196f)
                lineToRelative(-0.459f, 0.197f)
                lineToRelative(0.279f, 0.648f)
                lineToRelative(0.518f, -0.477f)
                lineToRelative(0.002f, -0.002f)
                lineToRelative(0.01f, -0.009f)
                lineToRelative(0.045f, -0.039f)
                arcToRelative(9.855f, 9.855f, 0.0f, false, true, 0.91f, -0.677f)
                arcToRelative(10.3f, 10.3f, 0.0f, false, true, 2.592f, -1.233f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 24.0f, 37.298f)
                lineTo(24.0f, 40.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.734f)
                curveToRelative(1.598f, 0.06f, 3.377f, 0.666f, 5.172f, 2.317f)
                lineToRelative(0.519f, 0.477f)
                lineToRelative(0.279f, -0.648f)
                lineToRelative(-0.46f, -0.197f)
                lineToRelative(0.46f, 0.197f)
                verticalLineToRelative(-0.001f)
                lineToRelative(0.002f, -0.003f)
                lineToRelative(0.004f, -0.01f)
                lineToRelative(0.016f, -0.039f)
                lineToRelative(0.057f, -0.144f)
                quadToRelative(0.076f, -0.188f, 0.202f, -0.545f)
                curveToRelative(0.115f, -0.33f, 0.258f, -0.766f, 0.41f, -1.295f)
                curveToRelative(1.078f, 0.33f, 2.216f, 0.952f, 3.367f, 2.013f)
                lineToRelative(0.644f, 0.592f)
                lineToRelative(0.184f, -0.855f)
                lineToRelative(-0.489f, -0.105f)
                lineToRelative(0.489f, 0.104f)
                verticalLineToRelative(-0.002f)
                lineToRelative(0.001f, -0.004f)
                lineToRelative(0.003f, -0.015f)
                lineToRelative(0.01f, -0.049f)
                quadToRelative(0.012f, -0.063f, 0.029f, -0.177f)
                arcToRelative(8.582f, 8.582f, 0.0f, false, false, -0.04f, -2.677f)
                curveToRelative(-0.273f, -1.534f, -1.075f, -3.361f, -3.153f, -4.53f)
                curveToRelative(0.061f, -0.697f, 0.103f, -1.43f, 0.116f, -2.194f)
                curveToRelative(0.106f, -5.88f, -1.422f, -13.602f, -7.937f, -20.964f)
                moveTo(14.087f, 36.356f)
                curveToRelative(0.223f, -1.24f, 0.83f, -2.644f, 2.34f, -3.623f)
                curveToRelative(0.173f, 1.412f, 0.42f, 2.647f, 0.67f, 3.658f)
                curveToRelative(-1.021f, 0.299f, -2.07f, 0.822f, -3.116f, 1.64f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 0.106f, -1.675f)
                moveToRelative(20.89f, 1.675f)
                curveToRelative(-1.027f, -0.803f, -2.055f, -1.321f, -3.059f, -1.623f)
                curveToRelative(0.25f, -1.004f, 0.497f, -2.233f, 0.671f, -3.638f)
                curveToRelative(1.474f, 0.982f, 2.067f, 2.376f, 2.285f, 3.605f)
                curveToRelative(0.111f, 0.627f, 0.123f, 1.206f, 0.102f, 1.656f)
                moveTo(25.0f, 36.266f)
                curveToRelative(1.654f, 0.054f, 3.474f, 0.617f, 5.297f, 2.102f)
                lineToRelative(0.01f, -0.029f)
                curveToRelative(0.157f, -0.45f, 0.37f, -1.113f, 0.586f, -1.955f)
                arcToRelative(30.3f, 30.3f, 0.0f, false, false, 0.93f, -6.926f)
                curveToRelative(0.078f, -4.331f, -0.759f, -9.698f, -3.96f, -15.167f)
                curveToRelative(-2.78f, 1.302f, -5.446f, 0.504f, -6.69f, -0.026f)
                curveToRelative(-3.214f, 5.478f, -4.053f, 10.855f, -3.975f, 15.193f)
                curveToRelative(0.051f, 2.843f, 0.497f, 5.241f, 0.93f, 6.926f)
                curveToRelative(0.215f, 0.842f, 0.428f, 1.505f, 0.586f, 1.955f)
                lineToRelative(0.019f, 0.055f)
                quadToRelative(0.226f, -0.17f, 0.534f, -0.373f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, true, 2.847f, -1.354f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 24.0f, 36.294f)
                lineTo(24.0f, 32.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(21.7f, 13.401f)
                curveToRelative(1.145f, 0.464f, 3.352f, 1.053f, 5.64f, 0.03f)
                arcToRelative(33.0f, 33.0f, 0.0f, false, false, -2.83f, -3.826f)
                arcToRelative(33.0f, 33.0f, 0.0f, false, false, -2.81f, 3.796f)
                moveTo(22.0f, 22.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                moveToRelative(2.5f, -3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
            }
        }
        .build()
        return _rocketLarge!!
    }

private var _rocketLarge: ImageVector? = null
