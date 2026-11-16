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

public val SBBIcons.FlameWarningLightLarge: ImageVector
    get() {
        if (_flameWarningLightLarge != null) {
            return _flameWarningLightLarge!!
        }
        _flameWarningLightLarge = Builder(name = "FlameWarningLightLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 31.575f)
                curveToRelative(0.0f, -5.44f, 3.006f, -10.227f, 4.693f, -12.455f)
                curveToRelative(2.368f, -3.129f, 3.814f, -5.652f, 4.672f, -8.073f)
                curveToRelative(0.857f, -2.416f, 1.138f, -4.76f, 1.138f, -7.547f)
                lineTo(15.503f, 2.194f)
                lineToRelative(0.873f, 0.972f)
                lineToRelative(-0.373f, 0.334f)
                lineToRelative(0.373f, -0.334f)
                curveToRelative(2.235f, 2.494f, 4.092f, 4.457f, 5.723f, 6.18f)
                lineToRelative(0.984f, 1.042f)
                curveToRelative(1.86f, 1.973f, 3.438f, 3.687f, 4.977f, 5.636f)
                lineToRelative(-0.786f, 0.62f)
                curveToRelative(-1.51f, -1.912f, -3.06f, -3.6f, -4.919f, -5.57f)
                quadToRelative(-0.484f, -0.514f, -1.0f, -1.059f)
                arcToRelative(314.0f, 314.0f, 0.0f, false, true, -4.875f, -5.238f)
                curveToRelative(-0.08f, 2.334f, -0.404f, 4.436f, -1.172f, 6.604f)
                curveToRelative(-0.905f, 2.552f, -2.414f, 5.166f, -4.818f, 8.342f)
                curveTo(8.842f, 21.901f, 6.0f, 26.47f, 6.0f, 31.575f)
                curveToRelative(0.0f, 5.292f, 3.335f, 9.595f, 7.534f, 12.135f)
                curveToRelative(-0.265f, -0.322f, -0.52f, -0.658f, -0.756f, -1.007f)
                curveToRelative(-0.85f, -1.255f, -1.493f, -2.71f, -1.493f, -4.232f)
                curveToRelative(0.0f, -2.074f, 0.585f, -3.658f, 1.825f, -5.4f)
                curveToRelative(0.582f, -0.816f, 1.146f, -1.504f, 1.66f, -2.131f)
                lineToRelative(0.206f, -0.251f)
                curveToRelative(0.573f, -0.7f, 1.072f, -1.33f, 1.492f, -2.023f)
                curveToRelative(0.822f, -1.361f, 1.36f, -3.01f, 1.36f, -5.916f)
                verticalLineToRelative(-1.368f)
                lineToRelative(0.883f, 1.046f)
                curveToRelative(2.753f, 3.262f, 4.507f, 5.424f, 6.093f, 7.613f)
                lineToRelative(-0.81f, 0.586f)
                curveToRelative(-1.397f, -1.928f, -2.934f, -3.84f, -5.207f, -6.55f)
                curveToRelative(-0.145f, 2.282f, -0.672f, 3.798f, -1.463f, 5.106f)
                curveToRelative(-0.46f, 0.76f, -1.0f, 1.438f, -1.573f, 2.139f)
                lineToRelative(-0.21f, 0.256f)
                arcToRelative(37.0f, 37.0f, 0.0f, false, false, -1.616f, 2.074f)
                curveToRelative(-1.14f, 1.599f, -1.64f, 2.984f, -1.64f, 4.82f)
                curveToRelative(0.0f, 1.244f, 0.53f, 2.503f, 1.321f, 3.67f)
                curveToRelative(0.788f, 1.163f, 1.808f, 2.197f, 2.72f, 2.98f)
                lineToRelative(-0.327f, 0.38f)
                lineToRelative(-0.186f, 0.462f)
                curveTo(10.224f, 43.715f, 5.0f, 38.49f, 5.0f, 31.574f)
                moveTo(35.5f, 24.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(31.433f, 24.75f)
                lineTo(30.567f, 25.25f)
                lineTo(28.067f, 20.92f)
                lineTo(28.933f, 20.42f)
                close()
                moveTo(39.433f, 25.25f)
                lineTo(41.933f, 20.92f)
                lineTo(41.067f, 20.42f)
                lineTo(38.567f, 24.75f)
                close()
                moveTo(43.873f, 40.0f)
                lineToRelative(0.105f, 0.356f)
                lineToRelative(1.5f, 5.0f)
                lineToRelative(0.194f, 0.644f)
                lineTo(24.328f, 46.0f)
                lineToRelative(0.194f, -0.644f)
                lineToRelative(1.5f, -5.0f)
                lineToRelative(0.106f, -0.356f)
                lineTo(29.0f, 40.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(40.0f, 40.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -10.0f, 0.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(26.871f, 41.0f)
                lineTo(25.671f, 45.0f)
                horizontalLineToRelative(18.657f)
                lineToRelative(-1.2f, -4.0f)
                close()
            }
        }
        .build()
        return _flameWarningLightLarge!!
    }

private var _flameWarningLightLarge: ImageVector? = null
