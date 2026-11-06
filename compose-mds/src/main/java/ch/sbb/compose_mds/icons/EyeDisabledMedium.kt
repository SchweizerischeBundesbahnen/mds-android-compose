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

public val SBBIcons.EyeDisabledMedium: ImageVector
    get() {
        if (_eyeDisabledMedium != null) {
            return _eyeDisabledMedium!!
        }
        _eyeDisabledMedium = Builder(name = "EyeDisabledMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(23.213f, 25.42f)
                lineToRelative(4.933f, 4.934f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-22.5f, -22.5f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(4.423f, 4.422f)
                curveToRelative(-2.634f, 1.994f, -4.514f, 4.421f, -5.228f, 5.436f)
                lineToRelative(-0.199f, 0.282f)
                lineToRelative(0.193f, 0.286f)
                curveToRelative(0.579f, 0.855f, 2.204f, 2.956f, 4.5f, 4.85f)
                curveToRelative(2.288f, 1.887f, 5.308f, 3.62f, 8.665f, 3.62f)
                curveToRelative(1.88f, 0.0f, 3.636f, -0.536f, 5.213f, -1.33f)
                moveToRelative(-0.748f, -0.747f)
                lineToRelative(-1.664f, -1.664f)
                arcToRelative(5.47f, 5.47f, 0.0f, false, true, -2.801f, 0.74f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, -5.75f, -5.748f)
                curveToRelative(0.0f, -1.053f, 0.243f, -1.97f, 0.739f, -2.805f)
                lineToRelative(-2.206f, -2.206f)
                curveToRelative(-2.354f, 1.756f, -4.106f, 3.903f, -4.92f, 5.014f)
                curveToRelative(0.668f, 0.926f, 2.129f, 2.722f, 4.107f, 4.354f)
                curveToRelative(2.214f, 1.825f, 5.011f, 3.392f, 8.03f, 3.392f)
                curveToRelative(1.574f, 0.0f, 3.075f, -0.419f, 4.465f, -1.077f)
                moveToRelative(-2.401f, -2.401f)
                lineToRelative(-6.34f, -6.34f)
                curveToRelative(-0.317f, 0.614f, -0.474f, 1.286f, -0.474f, 2.07f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 18.0f, 22.75f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 2.064f, -0.479f)
                moveToRelative(-3.47f, -9.83f)
                curveToRelative(0.438f, -0.11f, 0.906f, -0.191f, 1.406f, -0.191f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 5.75f, 5.75f)
                curveToRelative(0.0f, 0.499f, -0.083f, 0.968f, -0.192f, 1.405f)
                lineToRelative(-0.97f, -0.242f)
                curveToRelative(0.097f, -0.391f, 0.162f, -0.774f, 0.162f, -1.163f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, -4.75f, -4.75f)
                curveToRelative(-0.392f, 0.0f, -0.775f, 0.063f, -1.163f, 0.16f)
                close()
                moveTo(14.134f, 9.99f)
                curveToRelative(1.21f, -0.454f, 2.504f, -0.74f, 3.866f, -0.74f)
                curveToRelative(3.357f, 0.0f, 6.377f, 1.733f, 8.666f, 3.62f)
                curveToRelative(2.295f, 1.893f, 3.92f, 3.994f, 4.499f, 4.85f)
                lineToRelative(0.193f, 0.285f)
                lineToRelative(-0.199f, 0.282f)
                arcToRelative(26.5f, 26.5f, 0.0f, false, true, -4.35f, 4.729f)
                lineToRelative(-0.646f, -0.765f)
                arcToRelative(25.7f, 25.7f, 0.0f, false, false, 3.974f, -4.255f)
                arcToRelative(24.8f, 24.8f, 0.0f, false, false, -4.108f, -4.354f)
                curveTo(23.816f, 11.818f, 21.02f, 10.25f, 18.0f, 10.25f)
                curveToRelative(-1.22f, 0.0f, -2.395f, 0.256f, -3.516f, 0.676f)
                close()
            }
        }
        .build()
        return _eyeDisabledMedium!!
    }

private var _eyeDisabledMedium: ImageVector? = null
