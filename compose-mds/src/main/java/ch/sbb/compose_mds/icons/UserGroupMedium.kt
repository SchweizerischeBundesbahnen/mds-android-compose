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

public val SBBIcons.UserGroupMedium: ImageVector
    get() {
        if (_userGroupMedium != null) {
            return _userGroupMedium!!
        }
        _userGroupMedium = Builder(name = "UserGroupMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(27.25f, 11.252f)
                curveToRelative(0.0f, -2.32f, -1.475f, -4.003f, -3.25f, -4.003f)
                curveToRelative(-1.574f, 0.0f, -2.891f, 1.323f, -3.176f, 3.253f)
                curveToRelative(0.89f, 0.922f, 1.426f, 2.26f, 1.426f, 3.75f)
                quadToRelative(0.0f, 0.086f, -0.006f, 0.171f)
                lineToRelative(-0.015f, 0.185f)
                curveToRelative(0.51f, 0.408f, 1.111f, 0.643f, 1.771f, 0.643f)
                curveToRelative(1.776f, 0.0f, 3.25f, -1.681f, 3.25f, -4.0f)
                moveToRelative(-6.04f, 3.485f)
                lineToRelative(-0.003f, 0.029f)
                verticalLineToRelative(0.002f)
                curveToRelative(-0.208f, 2.056f, -1.57f, 3.484f, -3.207f, 3.484f)
                curveToRelative(-1.605f, 0.0f, -2.945f, -1.371f, -3.194f, -3.361f)
                lineToRelative(-0.012f, -0.126f)
                lineToRelative(-0.017f, -0.145f)
                curveToRelative(-0.015f, -0.139f, -0.027f, -0.248f, -0.027f, -0.368f)
                curveToRelative(0.0f, -1.341f, 0.516f, -2.484f, 1.294f, -3.202f)
                lineToRelative(0.04f, -0.037f)
                curveToRelative(0.54f, -0.483f, 1.193f, -0.764f, 1.917f, -0.764f)
                curveToRelative(0.733f, 0.0f, 1.393f, 0.29f, 1.937f, 0.785f)
                lineToRelative(0.018f, 0.017f)
                curveToRelative(0.297f, 0.273f, 0.555f, 0.608f, 0.761f, 0.992f)
                curveToRelative(0.335f, 0.624f, 0.532f, 1.379f, 0.532f, 2.209f)
                quadToRelative(0.0f, 0.112f, -0.012f, 0.227f)
                lineToRelative(-0.012f, 0.12f)
                close()
                moveTo(12.0f, 16.252f)
                curveToRelative(0.717f, 0.0f, 1.373f, -0.203f, 1.944f, -0.547f)
                curveToRelative(0.162f, 0.65f, 0.432f, 1.252f, 0.792f, 1.768f)
                curveToRelative(-2.533f, 1.6f, -4.237f, 3.909f, -5.011f, 6.773f)
                horizontalLineTo(4.268f)
                curveToRelative(0.2f, -4.0f, 1.988f, -7.08f, 5.125f, -9.01f)
                arcTo(3.84f, 3.84f, 0.0f, false, false, 12.0f, 16.252f)
                moveToRelative(-2.503f, 8.994f)
                horizontalLineTo(3.24f)
                lineToRelative(0.01f, -0.508f)
                curveToRelative(0.074f, -4.5f, 1.984f, -8.053f, 5.473f, -10.263f)
                curveToRelative(-0.62f, -0.881f, -0.974f, -2.015f, -0.974f, -3.223f)
                curveToRelative(0.0f, -2.684f, 1.752f, -5.003f, 4.25f, -5.003f)
                curveToRelative(2.029f, 0.0f, 3.555f, 1.54f, 4.056f, 3.546f)
                arcToRelative(3.74f, 3.74f, 0.0f, false, true, 3.888f, 0.0f)
                curveTo(20.446f, 7.79f, 21.972f, 6.25f, 24.0f, 6.25f)
                curveToRelative(2.5f, 0.0f, 4.25f, 2.319f, 4.25f, 5.003f)
                curveToRelative(0.0f, 1.22f, -0.363f, 2.367f, -0.994f, 3.252f)
                curveToRelative(3.47f, 2.22f, 5.078f, 5.642f, 5.46f, 9.787f)
                lineToRelative(0.033f, 0.424f)
                lineToRelative(0.038f, 0.535f)
                horizontalLineToRelative(-6.374f)
                quadToRelative(0.247f, 1.186f, 0.337f, 2.465f)
                lineToRelative(-0.5f, 0.035f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.5f, -0.036f)
                lineToRelative(0.038f, 0.536f)
                horizontalLineTo(9.243f)
                lineToRelative(0.008f, -0.509f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 0.246f, -2.496f)
                moveToRelative(22.209f, -0.996f)
                horizontalLineToRelative(-5.538f)
                curveToRelative(-0.784f, -2.785f, -2.338f, -5.1f, -4.924f, -6.75f)
                curveToRelative(0.37f, -0.522f, 0.647f, -1.133f, 0.812f, -1.795f)
                arcToRelative(3.74f, 3.74f, 0.0f, false, false, 1.944f, 0.547f)
                arcToRelative(3.83f, 3.83f, 0.0f, false, false, 2.58f, -0.992f)
                curveToRelative(3.206f, 1.99f, 4.74f, 5.079f, 5.126f, 8.99f)
                moveTo(18.0f, 19.252f)
                curveToRelative(1.0f, 0.0f, 1.878f, -0.374f, 2.571f, -0.994f)
                curveToRelative(3.212f, 1.99f, 4.748f, 5.079f, 5.135f, 8.993f)
                horizontalLineTo(10.268f)
                curveToRelative(0.2f, -4.003f, 1.992f, -7.086f, 5.135f, -9.016f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 18.0f, 19.252f)
                moveToRelative(-9.25f, -8.0f)
                curveToRelative(0.0f, 2.318f, 1.475f, 4.0f, 3.25f, 4.0f)
                curveToRelative(0.66f, 0.0f, 1.26f, -0.236f, 1.77f, -0.644f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.02f, -0.357f)
                curveToRelative(0.0f, -0.48f, 0.055f, -0.946f, 0.161f, -1.386f)
                curveToRelative(0.222f, -0.924f, 0.662f, -1.739f, 1.263f, -2.363f)
                curveToRelative(-0.283f, -1.93f, -1.6f, -3.253f, -3.174f, -3.253f)
                curveToRelative(-1.774f, 0.0f, -3.25f, 1.682f, -3.25f, 4.003f)
            }
        }
        .build()
        return _userGroupMedium!!
    }

private var _userGroupMedium: ImageVector? = null
