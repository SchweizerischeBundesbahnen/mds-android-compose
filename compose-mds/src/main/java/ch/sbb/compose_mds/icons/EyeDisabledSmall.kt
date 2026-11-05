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

public val SBBIcons.EyeDisabledSmall: ImageVector
    get() {
        if (_eyeDisabledSmall != null) {
            return _eyeDisabledSmall!!
        }
        _eyeDisabledSmall = Builder(
            name = "EyeDisabledSmall",
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
                moveToRelative(15.442f, 17.15f)
                lineToRelative(3.204f, 3.204f)
                lineToRelative(0.708f, -0.707f)
                lineToRelative(-15.0f, -15.0f)
                lineToRelative(-0.708f, 0.707f)
                lineTo(6.46f, 8.168f)
                curveToRelative(-1.695f, 1.32f, -2.902f, 2.88f, -3.37f, 3.544f)
                lineToRelative(-0.198f, 0.282f)
                lineToRelative(0.194f, 0.286f)
                curveToRelative(0.392f, 0.58f, 1.486f, 1.994f, 3.03f, 3.268f)
                curveTo(7.657f, 16.817f, 9.707f, 18.0f, 12.0f, 18.0f)
                curveToRelative(1.242f, 0.0f, 2.401f, -0.342f, 3.442f, -0.85f)
                moveToRelative(-0.752f, -0.753f)
                lineToRelative(-0.851f, -0.851f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 12.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                curveToRelative(0.0f, -0.684f, 0.149f, -1.288f, 0.451f, -1.841f)
                lineTo(7.173f, 8.88f)
                curveToRelative(-1.428f, 1.09f, -2.508f, 2.386f, -3.058f, 3.122f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, 2.638f, 2.774f)
                curveTo(8.216f, 15.983f, 10.043f, 17.0f, 12.0f, 17.0f)
                curveToRelative(0.94f, 0.0f, 1.842f, -0.23f, 2.69f, -0.603f)
                moveToRelative(-1.602f, -1.601f)
                lineTo(9.2f, 10.908f)
                curveToRelative(-0.133f, 0.328f, -0.2f, 0.685f, -0.2f, 1.093f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 15.0f)
                quadToRelative(0.593f, -0.002f, 1.088f, -0.204f)
                moveToRelative(-2.066f, -6.663f)
                curveToRelative(0.3f, -0.076f, 0.627f, -0.132f, 0.978f, -0.132f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.35f, -0.058f, 0.678f, -0.133f, 0.977f)
                lineToRelative(-0.97f, -0.243f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.103f, -0.734f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                curveToRelative(-0.243f, 0.0f, -0.485f, 0.039f, -0.735f, 0.102f)
                close()
                moveTo(9.364f, 6.504f)
                curveToRelative(0.822f, -0.307f, 1.704f, -0.503f, 2.636f, -0.503f)
                curveToRelative(2.294f, 0.0f, 4.345f, 1.183f, 5.883f, 2.451f)
                curveToRelative(1.546f, 1.275f, 2.639f, 2.688f, 3.032f, 3.268f)
                lineToRelative(0.193f, 0.286f)
                lineToRelative(-0.199f, 0.282f)
                arcToRelative(17.8f, 17.8f, 0.0f, false, true, -2.93f, 3.184f)
                lineToRelative(-0.644f, -0.765f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, 2.55f, -2.71f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, -2.638f, -2.773f)
                curveTo(15.784f, 8.018f, 13.957f, 7.0f, 12.0f, 7.0f)
                curveToRelative(-0.79f, 0.0f, -1.553f, 0.166f, -2.285f, 0.44f)
                close()
            }
        }
            .build()
        return _eyeDisabledSmall!!
    }

private var _eyeDisabledSmall: ImageVector? = null
