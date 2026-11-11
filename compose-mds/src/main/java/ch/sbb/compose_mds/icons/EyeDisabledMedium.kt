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
                moveToRelative(28.146f, 30.354f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-22.5f, -22.5f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(4.423f, 4.422f)
                curveToRelative(-2.285f, 1.73f, -4.003f, 3.785f, -4.884f, 4.963f)
                lineToRelative(-0.345f, 0.473f)
                lineToRelative(-0.198f, 0.282f)
                lineToRelative(0.193f, 0.286f)
                curveToRelative(0.579f, 0.855f, 2.204f, 2.956f, 4.5f, 4.85f)
                curveToRelative(2.288f, 1.887f, 5.308f, 3.62f, 8.665f, 3.62f)
                curveToRelative(1.88f, 0.0f, 3.636f, -0.536f, 5.213f, -1.33f)
                close()
                moveTo(22.466f, 24.674f)
                lineTo(20.8f, 23.007f)
                arcTo(5.47f, 5.47f, 0.0f, false, true, 18.0f, 23.75f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, -5.75f, -5.748f)
                curveToRelative(0.0f, -1.053f, 0.244f, -1.97f, 0.739f, -2.805f)
                lineToRelative(-2.206f, -2.206f)
                curveToRelative(-2.354f, 1.755f, -4.105f, 3.904f, -4.92f, 5.014f)
                arcToRelative(24.7f, 24.7f, 0.0f, false, false, 4.107f, 4.354f)
                curveToRelative(2.214f, 1.825f, 5.011f, 3.391f, 8.03f, 3.391f)
                curveToRelative(1.574f, 0.0f, 3.075f, -0.417f, 4.466f, -1.076f)
                moveToRelative(-2.402f, -2.403f)
                lineToRelative(-6.34f, -6.34f)
                curveToRelative(-0.317f, 0.615f, -0.474f, 1.287f, -0.474f, 2.07f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 18.0f, 22.75f)
                curveToRelative(0.763f, 0.0f, 1.445f, -0.165f, 2.064f, -0.478f)
                moveToRelative(2.686f, -4.27f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, -4.75f, -4.75f)
                curveToRelative(-0.392f, 0.0f, -0.775f, 0.063f, -1.162f, 0.16f)
                lineToRelative(-0.245f, -0.97f)
                curveToRelative(0.438f, -0.11f, 0.907f, -0.19f, 1.407f, -0.19f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 5.75f, 5.75f)
                curveToRelative(0.0f, 0.499f, -0.083f, 0.968f, -0.193f, 1.405f)
                lineToRelative(-0.97f, -0.242f)
                curveToRelative(0.098f, -0.39f, 0.163f, -0.774f, 0.163f, -1.163f)
                moveTo(18.0f, 9.251f)
                curveToRelative(3.357f, 0.0f, 6.376f, 1.733f, 8.665f, 3.62f)
                curveToRelative(2.296f, 1.893f, 3.92f, 3.994f, 4.5f, 4.85f)
                lineToRelative(0.193f, 0.286f)
                lineToRelative(-0.199f, 0.281f)
                arcToRelative(26.5f, 26.5f, 0.0f, false, true, -4.351f, 4.729f)
                lineToRelative(-0.645f, -0.765f)
                arcToRelative(25.6f, 25.6f, 0.0f, false, false, 3.972f, -4.255f)
                arcToRelative(24.7f, 24.7f, 0.0f, false, false, -4.105f, -4.354f)
                curveToRelative(-2.214f, -1.825f, -5.011f, -3.392f, -8.03f, -3.392f)
                curveToRelative(-1.22f, 0.0f, -2.395f, 0.256f, -3.515f, 0.676f)
                lineToRelative(-0.352f, -0.936f)
                curveToRelative(1.21f, -0.453f, 2.505f, -0.74f, 3.867f, -0.74f)
            }
        }
        .build()
        return _eyeDisabledMedium!!
    }

private var _eyeDisabledMedium: ImageVector? = null
