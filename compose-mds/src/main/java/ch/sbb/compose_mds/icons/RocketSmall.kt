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

public val SBBIcons.RocketSmall: ImageVector
    get() {
        if (_rocketSmall != null) {
            return _rocketSmall!!
        }
        _rocketSmall = Builder(
            name = "RocketSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveToRelative(12.0f, 2.233f)
                lineToRelative(0.38f, 0.441f)
                curveToRelative(3.789f, 4.408f, 4.679f, 9.036f, 4.617f, 12.557f)
                quadToRelative(-0.009f, 0.505f, -0.042f, 0.978f)
                curveToRelative(1.544f, 1.03f, 2.242f, 2.868f, 1.902f, 4.604f)
                lineToRelative(-0.183f, 0.939f)
                lineToRelative(-0.666f, -0.686f)
                arcToRelative(3.45f, 3.45f, 0.0f, false, false, -1.729f, -0.958f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -0.316f, 0.962f)
                lineToRelative(-0.034f, 0.088f)
                lineToRelative(-0.01f, 0.024f)
                lineToRelative(-0.003f, 0.007f)
                verticalLineToRelative(0.003f)
                lineTo(15.453f, 21.0f)
                lineToRelative(0.461f, 0.193f)
                lineToRelative(-0.28f, 0.668f)
                lineToRelative(-0.525f, -0.498f)
                curveToRelative(-1.574f, -1.491f, -3.103f, -1.477f, -4.255f, -1.113f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, -1.938f, 1.088f)
                lineToRelative(-0.023f, 0.021f)
                lineToRelative(-0.004f, 0.004f)
                lineToRelative(-0.526f, 0.498f)
                lineToRelative(-0.28f, -0.668f)
                lineToRelative(0.462f, -0.193f)
                lineToRelative(-0.461f, 0.192f)
                lineToRelative(-0.002f, -0.003f)
                lineToRelative(-0.003f, -0.007f)
                lineToRelative(-0.01f, -0.024f)
                lineToRelative(-0.034f, -0.088f)
                arcToRelative(14.159f, 14.159f, 0.0f, false, true, -0.316f, -0.962f)
                curveToRelative(-0.672f, 0.15f, -1.269f, 0.485f, -1.728f, 0.958f)
                lineToRelative(-0.666f, 0.686f)
                lineToRelative(-0.183f, -0.939f)
                curveToRelative(-0.34f, -1.736f, 0.358f, -3.574f, 1.902f, -4.603f)
                arcToRelative(19.0f, 19.0f, 0.0f, false, true, -0.042f, -0.979f)
                curveTo(6.94f, 11.71f, 7.83f, 7.082f, 11.62f, 2.674f)
                close()
                moveTo(16.528f, 19.139f)
                curveToRelative(0.506f, 0.117f, 0.98f, 0.316f, 1.407f, 0.587f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, -1.097f, -2.338f)
                arcToRelative(19.0f, 19.0f, 0.0f, false, true, -0.31f, 1.751f)
                moveToRelative(-9.366f, -1.751f)
                curveToRelative(0.085f, 0.656f, 0.195f, 1.245f, 0.31f, 1.751f)
                curveToRelative(-0.506f, 0.117f, -0.98f, 0.316f, -1.407f, 0.587f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, true, 1.097f, -2.338f)
                moveToRelative(1.624f, 2.788f)
                lineToRelative(0.074f, -0.05f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, true, 1.694f, -0.83f)
                curveToRelative(1.293f, -0.408f, 2.977f, -0.438f, 4.67f, 0.851f)
                curveToRelative(0.073f, -0.234f, 0.158f, -0.527f, 0.244f, -0.872f)
                curveToRelative(0.246f, -0.987f, 0.5f, -2.393f, 0.53f, -4.061f)
                curveToRelative(0.043f, -2.484f, -0.412f, -5.547f, -2.138f, -8.68f)
                arcToRelative(3.95f, 3.95f, 0.0f, false, true, -3.72f, 0.0f)
                curveToRelative(-1.726f, 3.133f, -2.18f, 6.196f, -2.137f, 8.68f)
                curveToRelative(0.029f, 1.668f, 0.283f, 3.074f, 0.53f, 4.061f)
                curveToRelative(0.089f, 0.359f, 0.177f, 0.662f, 0.253f, 0.901f)
                moveToRelative(1.861f, -14.505f)
                arcToRelative(2.95f, 2.95f, 0.0f, false, false, 2.706f, 0.0f)
                arcTo(19.0f, 19.0f, 0.0f, false, false, 12.0f, 3.781f)
                curveToRelative(-0.51f, 0.628f, -0.958f, 1.26f, -1.353f, 1.89f)
                moveTo(12.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
            }
        }
            .build()
        return _rocketSmall!!
    }

private var _rocketSmall: ImageVector? = null
