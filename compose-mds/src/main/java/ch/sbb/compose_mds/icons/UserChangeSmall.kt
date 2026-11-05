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

public val SBBIcons.UserChangeSmall: ImageVector
    get() {
        if (_userChangeSmall != null) {
            return _userChangeSmall!!
        }
        _userChangeSmall = Builder(name = "UserChangeSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.5f, 3.0f)
                curveTo(5.738f, 3.0f, 5.0f, 3.815f, 5.0f, 5.0f)
                curveToRelative(0.0f, 0.406f, 0.09f, 0.785f, 0.248f, 1.1f)
                verticalLineToRelative(0.001f)
                curveToRelative(0.285f, 0.576f, 0.753f, 0.9f, 1.252f, 0.9f)
                reflectiveCurveToRelative(0.966f, -0.324f, 1.252f, -0.902f)
                moveTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.49f, 0.968f, -3.0f, 2.5f, -3.0f)
                reflectiveCurveTo(9.0f, 3.51f, 9.0f, 5.0f)
                curveToRelative(0.0f, 0.463f, -0.088f, 0.912f, -0.25f, 1.315f)
                curveToRelative(1.751f, 1.07f, 2.253f, 3.157f, 2.253f, 5.189f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.022f, 0.492f, -4.111f, 2.249f, -5.182f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.0f, 5.0f)
                moveToRelative(0.772f, 2.177f)
                curveToRelative(-1.183f, 0.728f, -1.68f, 2.124f, -1.758f, 3.827f)
                horizontalLineToRelative(6.978f)
                curveToRelative(-0.079f, -1.708f, -0.581f, -3.105f, -1.76f, -3.832f)
                curveTo(7.802f, 7.667f, 7.207f, 8.0f, 6.5f, 8.0f)
                curveToRelative(-0.704f, 0.0f, -1.299f, -0.33f, -1.728f, -0.823f)
                moveTo(7.752f, 6.1f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.0f, 5.0f)
                curveToRelative(0.0f, -1.185f, -0.738f, -2.0f, -1.5f, -2.0f)
                moveToRelative(10.06f, 1.272f)
                curveToRelative(0.902f, 1.206f, 1.43f, 2.839f, 1.471f, 4.802f)
                lineTo(19.65f, 7.48f)
                lineToRelative(0.702f, 0.712f)
                lineToRelative(-2.506f, 2.471f)
                lineToRelative(-0.351f, 0.347f)
                lineToRelative(-0.352f, -0.347f)
                lineToRelative(-2.493f, -2.465f)
                lineToRelative(0.702f, -0.711f)
                lineToRelative(1.681f, 1.661f)
                curveToRelative(-0.029f, -1.821f, -0.512f, -3.26f, -1.273f, -4.276f)
                curveToRelative(-0.904f, -1.208f, -2.226f, -1.861f, -3.765f, -1.856f)
                lineToRelative(-0.004f, -1.0f)
                curveToRelative(1.85f, -0.006f, 3.472f, 0.79f, 4.57f, 2.257f)
                moveTo(17.5f, 13.0f)
                curveToRelative(-0.762f, 0.0f, -1.5f, 0.815f, -1.5f, 2.0f)
                curveToRelative(0.0f, 0.476f, 0.128f, 0.917f, 0.338f, 1.262f)
                curveToRelative(0.291f, 0.476f, 0.712f, 0.738f, 1.162f, 0.738f)
                reflectiveCurveToRelative(0.871f, -0.262f, 1.162f, -0.738f)
                curveToRelative(0.21f, -0.345f, 0.338f, -0.786f, 0.338f, -1.262f)
                curveToRelative(0.0f, -1.185f, -0.738f, -2.0f, -1.5f, -2.0f)
                moveToRelative(1.703f, 4.204f)
                curveToRelative(-0.427f, 0.477f, -1.014f, 0.796f, -1.703f, 0.796f)
                reflectiveCurveToRelative(-1.276f, -0.32f, -1.703f, -0.795f)
                curveToRelative(-1.051f, 0.825f, -1.667f, 2.264f, -1.777f, 3.798f)
                horizontalLineToRelative(6.966f)
                curveToRelative(-0.11f, -1.54f, -0.73f, -2.976f, -1.783f, -3.799f)
                moveToRelative(-3.937f, -0.852f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.0f, 15.0f)
                curveToRelative(0.0f, -1.49f, 0.968f, -3.0f, 2.5f, -3.0f)
                reflectiveCurveToRelative(2.5f, 1.51f, 2.5f, 3.0f)
                curveToRelative(0.0f, 0.477f, -0.093f, 0.939f, -0.265f, 1.352f)
                curveToRelative(1.542f, 1.145f, 2.269f, 3.201f, 2.269f, 5.151f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-9.002f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.94f, 0.721f, -4.002f, 2.264f, -5.15f)
                moveTo(6.5f, 12.966f)
                lineToRelative(0.35f, 0.346f)
                lineToRelative(2.5f, 2.464f)
                lineToRelative(-0.701f, 0.713f)
                lineToRelative(-1.687f, -1.664f)
                curveToRelative(0.029f, 1.826f, 0.513f, 3.275f, 1.274f, 4.302f)
                curveToRelative(0.905f, 1.22f, 2.228f, 1.88f, 3.764f, 1.875f)
                lineToRelative(0.004f, 1.0f)
                curveToRelative(-1.852f, 0.006f, -3.475f, -0.802f, -4.57f, -2.28f)
                curveToRelative(-0.902f, -1.214f, -1.43f, -2.854f, -1.471f, -4.82f)
                lineTo(4.35f, 16.494f)
                lineToRelative(-0.702f, -0.711f)
                lineToRelative(2.5f, -2.47f)
                close()
            }
        }
        .build()
        return _userChangeSmall!!
    }

private var _userChangeSmall: ImageVector? = null
