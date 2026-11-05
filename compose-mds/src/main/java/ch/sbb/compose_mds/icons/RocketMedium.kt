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

public val SBBIcons.RocketMedium: ImageVector
    get() {
        if (_rocketMedium != null) {
            return _rocketMedium!!
        }
        _rocketMedium = Builder(name = "RocketMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(18.0f, 3.733f)
                lineToRelative(0.38f, 0.441f)
                curveToRelative(5.636f, 6.557f, 6.957f, 13.434f, 6.866f, 18.669f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, true, -0.073f, 1.6f)
                curveToRelative(2.312f, 1.47f, 3.367f, 4.174f, 2.868f, 6.73f)
                lineToRelative(-0.184f, 0.938f)
                lineToRelative(-0.666f, -0.686f)
                arcToRelative(5.44f, 5.44f, 0.0f, false, false, -2.95f, -1.553f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -0.355f, 1.157f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, -0.224f, 0.616f)
                lineToRelative(-0.014f, 0.034f)
                lineToRelative(-0.004f, 0.01f)
                lineToRelative(-0.001f, 0.002f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.462f, -0.192f)
                lineToRelative(0.46f, 0.193f)
                lineToRelative(-0.278f, 0.668f)
                lineToRelative(-0.526f, -0.498f)
                curveToRelative(-2.437f, -2.309f, -4.83f, -2.295f, -6.63f, -1.727f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, -2.217f, 1.088f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.78f, 0.596f)
                lineToRelative(-0.038f, 0.035f)
                lineToRelative(-0.008f, 0.007f)
                verticalLineToRelative(0.001f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.526f, 0.498f)
                lineToRelative(-0.28f, -0.668f)
                lineToRelative(0.462f, -0.193f)
                lineToRelative(-0.461f, 0.192f)
                lineToRelative(-0.002f, -0.003f)
                lineToRelative(-0.004f, -0.01f)
                lineToRelative(-0.014f, -0.034f)
                lineToRelative(-0.05f, -0.129f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, -0.174f, -0.486f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -0.356f, -1.158f)
                arcToRelative(5.44f, 5.44f, 0.0f, false, false, -2.95f, 1.552f)
                lineToRelative(-0.665f, 0.687f)
                lineToRelative(-0.184f, -0.939f)
                curveToRelative(-0.499f, -2.554f, 0.556f, -5.259f, 2.868f, -6.728f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, true, -0.073f, -1.601f)
                curveToRelative(-0.091f, -5.235f, 1.23f, -12.112f, 6.867f, -18.669f)
                close()
                moveTo(24.49f, 28.901f)
                curveToRelative(0.985f, 0.188f, 1.895f, 0.59f, 2.67f, 1.17f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, false, -2.094f, -4.481f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -0.575f, 3.31f)
                moveToRelative(-13.556f, -3.31f)
                curveToRelative(0.145f, 1.274f, 0.358f, 2.392f, 0.575f, 3.31f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -2.67f, 1.17f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, true, 2.095f, -4.48f)
                moveToRelative(2.113f, 5.077f)
                quadToRelative(0.17f, -0.127f, 0.382f, -0.272f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, true, 2.478f, -1.213f)
                curveToRelative(1.943f, -0.614f, 4.496f, -0.644f, 7.055f, 1.457f)
                curveToRelative(0.133f, -0.397f, 0.306f, -0.96f, 0.482f, -1.667f)
                arcToRelative(27.6f, 27.6f, 0.0f, false, false, 0.802f, -6.148f)
                curveToRelative(0.067f, -3.82f, -0.645f, -8.545f, -3.36f, -13.364f)
                arcToRelative(5.68f, 5.68f, 0.0f, false, true, -5.773f, 0.0f)
                curveToRelative(-2.714f, 4.82f, -3.426f, 9.545f, -3.359f, 13.364f)
                arcToRelative(27.6f, 27.6f, 0.0f, false, false, 0.802f, 6.148f)
                curveToRelative(0.18f, 0.723f, 0.357f, 1.297f, 0.491f, 1.695f)
                moveToRelative(2.573f, -22.07f)
                arcToRelative(4.68f, 4.68f, 0.0f, false, false, 4.76f, 0.0f)
                arcTo(29.0f, 29.0f, 0.0f, false, false, 18.0f, 5.276f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, false, -2.38f, 3.323f)
                moveTo(18.0f, 14.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                moveToRelative(-2.75f, 1.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.5f, 0.0f)
            }
        }
        .build()
        return _rocketMedium!!
    }

private var _rocketMedium: ImageVector? = null
