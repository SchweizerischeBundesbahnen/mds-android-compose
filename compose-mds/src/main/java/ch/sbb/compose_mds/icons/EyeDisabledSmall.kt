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
        _eyeDisabledSmall = Builder(name = "EyeDisabledSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(18.647f, 20.354f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-15.0f, -15.0f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(6.46f, 8.168f)
                curveToRelative(-1.696f, 1.32f, -2.903f, 2.88f, -3.37f, 3.544f)
                lineToRelative(-0.199f, 0.282f)
                lineToRelative(0.194f, 0.286f)
                curveToRelative(0.392f, 0.58f, 1.486f, 1.994f, 3.031f, 3.268f)
                curveTo(7.656f, 16.817f, 9.706f, 18.0f, 12.0f, 18.0f)
                curveToRelative(1.242f, 0.0f, 2.401f, -0.342f, 3.442f, -0.85f)
                close()
                moveTo(14.69f, 16.397f)
                lineTo(13.84f, 15.547f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 12.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                curveToRelative(0.0f, -0.684f, 0.149f, -1.288f, 0.451f, -1.841f)
                lineTo(7.173f, 8.88f)
                curveToRelative(-1.427f, 1.09f, -2.507f, 2.386f, -3.057f, 3.122f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, 2.637f, 2.775f)
                curveTo(8.216f, 15.983f, 10.043f, 17.0f, 12.0f, 17.0f)
                curveToRelative(0.94f, 0.0f, 1.842f, -0.23f, 2.69f, -0.603f)
                moveToRelative(-1.602f, -1.602f)
                lineToRelative(-3.887f, -3.887f)
                curveTo(9.067f, 11.236f, 9.0f, 11.593f, 9.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 15.0f)
                quadToRelative(0.593f, -0.001f, 1.088f, -0.205f)
                moveTo(15.0f, 12.001f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                curveToRelative(-0.243f, 0.0f, -0.484f, 0.039f, -0.734f, 0.101f)
                lineToRelative(-0.244f, -0.97f)
                curveToRelative(0.3f, -0.075f, 0.627f, -0.131f, 0.978f, -0.131f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.35f, -0.059f, 0.678f, -0.133f, 0.977f)
                lineToRelative(-0.97f, -0.243f)
                curveToRelative(0.063f, -0.253f, 0.103f, -0.493f, 0.103f, -0.734f)
                moveToRelative(-3.0f, -6.0f)
                curveToRelative(2.294f, 0.0f, 4.345f, 1.183f, 5.883f, 2.452f)
                curveToRelative(1.545f, 1.274f, 2.639f, 2.687f, 3.031f, 3.267f)
                lineToRelative(0.194f, 0.286f)
                lineToRelative(-0.199f, 0.282f)
                arcToRelative(17.8f, 17.8f, 0.0f, false, true, -2.93f, 3.184f)
                lineToRelative(-0.644f, -0.764f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, 2.548f, -2.711f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, -2.636f, -2.773f)
                curveTo(15.784f, 8.018f, 13.957f, 7.001f, 12.0f, 7.001f)
                curveToRelative(-0.79f, 0.0f, -1.553f, 0.166f, -2.285f, 0.44f)
                lineToRelative(-0.351f, -0.937f)
                curveToRelative(0.821f, -0.307f, 1.704f, -0.503f, 2.636f, -0.503f)
            }
        }
        .build()
        return _eyeDisabledSmall!!
    }

private var _eyeDisabledSmall: ImageVector? = null
