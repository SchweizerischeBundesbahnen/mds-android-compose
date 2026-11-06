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

public val SBBIcons.UserGroupSmall: ImageVector
    get() {
        if (_userGroupSmall != null) {
            return _userGroupSmall!!
        }
        _userGroupSmall = Builder(name = "UserGroupSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 7.0f)
                curveToRelative(0.438f, 0.0f, 0.837f, 0.17f, 1.171f, 0.471f)
                lineToRelative(0.02f, 0.019f)
                quadToRelative(0.058f, 0.053f, 0.113f, 0.112f)
                curveToRelative(0.419f, 0.447f, 0.696f, 1.115f, 0.696f, 1.9f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -0.015f, 0.206f)
                lineToRelative(-0.007f, 0.064f)
                lineToRelative(-0.006f, 0.055f)
                verticalLineToRelative(0.001f)
                curveToRelative(-0.133f, 1.314f, -0.992f, 2.173f, -1.972f, 2.173f)
                curveToRelative(-0.963f, 0.0f, -1.81f, -0.829f, -1.964f, -2.104f)
                lineToRelative(-0.008f, -0.07f)
                lineToRelative(-0.011f, -0.105f)
                curveToRelative(-0.01f, -0.089f, -0.017f, -0.15f, -0.017f, -0.22f)
                curveToRelative(0.0f, -0.853f, 0.328f, -1.569f, 0.809f, -2.012f)
                lineToRelative(0.032f, -0.03f)
                curveToRelative(0.332f, -0.294f, 0.726f, -0.46f, 1.16f, -0.46f)
                moveToRelative(-2.408f, 4.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -0.4f, -0.882f)
                arcToRelative(2.706f, 2.706f, 0.0f, false, true, -2.947f, -0.353f)
                curveToRelative(-1.931f, 1.23f, -3.053f, 3.147f, -3.223f, 5.632f)
                horizontalLineToRelative(3.335f)
                curveToRelative(0.526f, -1.837f, 1.624f, -3.335f, 3.235f, -4.397f)
                moveToRelative(-3.46f, 5.397f)
                quadToRelative(-0.119f, 0.72f, -0.131f, 1.495f)
                lineToRelative(-0.009f, 0.509f)
                horizontalLineToRelative(12.045f)
                lineTo(18.0f, 18.465f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 17.812f, 17.0f)
                horizontalLineToRelative(4.225f)
                lineTo(22.0f, 16.465f)
                curveToRelative(-0.204f, -2.871f, -1.25f, -5.274f, -3.596f, -6.843f)
                curveToRelative(0.382f, -0.6f, 0.597f, -1.343f, 0.597f, -2.121f)
                curveToRelative(0.0f, -1.85f, -1.213f, -3.502f, -3.0f, -3.502f)
                curveToRelative(-1.377f, 0.0f, -2.408f, 0.991f, -2.808f, 2.284f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, false, -2.384f, 0.0f)
                curveTo(10.408f, 4.99f, 9.378f, 3.998f, 8.0f, 3.998f)
                curveTo(6.214f, 4.0f, 5.0f, 5.651f, 5.0f, 7.501f)
                curveToRelative(0.0f, 0.77f, 0.21f, 1.505f, 0.584f, 2.1f)
                curveTo(3.298f, 11.114f, 2.05f, 13.5f, 2.0f, 16.49f)
                lineToRelative(-0.008f, 0.508f)
                horizontalLineToRelative(4.141f)
                moveTo(16.0f, 11.001f)
                curveToRelative(0.67f, 0.0f, 1.26f, -0.232f, 1.735f, -0.62f)
                curveToRelative(1.965f, 1.263f, 2.94f, 3.18f, 3.217f, 5.62f)
                horizontalLineToRelative(-3.381f)
                curveToRelative(-0.528f, -1.786f, -1.534f, -3.288f, -3.176f, -4.382f)
                curveToRelative(0.174f, -0.275f, 0.313f, -0.579f, 0.413f, -0.902f)
                curveToRelative(0.358f, 0.18f, 0.76f, 0.284f, 1.192f, 0.284f)
                moveTo(14.06f, 6.945f)
                curveTo(14.65f, 7.59f, 15.0f, 8.5f, 15.0f, 9.5f)
                quadToRelative(0.0f, 0.082f, -0.006f, 0.162f)
                curveToRelative(0.297f, 0.217f, 0.638f, 0.338f, 1.006f, 0.338f)
                curveToRelative(1.063f, 0.0f, 2.0f, -1.015f, 2.0f, -2.5f)
                reflectiveCurveToRelative(-0.937f, -2.502f, -2.0f, -2.502f)
                curveToRelative(-0.922f, 0.0f, -1.737f, 0.762f, -1.941f, 1.946f)
                moveTo(12.0f, 13.0f)
                curveToRelative(-0.678f, 0.0f, -1.272f, -0.24f, -1.748f, -0.637f)
                curveToRelative(-1.936f, 1.23f, -3.06f, 3.149f, -3.23f, 5.637f)
                horizontalLineToRelative(9.93f)
                curveToRelative(-0.278f, -2.442f, -1.254f, -4.36f, -3.222f, -5.622f)
                arcTo(2.7f, 2.7f, 0.0f, false, true, 12.0f, 13.0f)
                moveTo(8.0f, 5.0f)
                curveTo(6.938f, 5.0f, 6.0f, 6.015f, 6.0f, 7.501f)
                reflectiveCurveToRelative(0.937f, 2.5f, 2.0f, 2.5f)
                curveToRelative(0.369f, 0.0f, 0.709f, -0.12f, 1.006f, -0.337f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 9.5f)
                curveToRelative(0.0f, -1.001f, 0.35f, -1.91f, 0.941f, -2.556f)
                curveTo(9.738f, 5.76f, 8.923f, 4.999f, 8.0f, 4.999f)
            }
        }
        .build()
        return _userGroupSmall!!
    }

private var _userGroupSmall: ImageVector? = null
