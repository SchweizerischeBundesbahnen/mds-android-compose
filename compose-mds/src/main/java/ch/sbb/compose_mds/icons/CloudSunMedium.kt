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

public val SBBIcons.CloudSunMedium: ImageVector
    get() {
        if (_cloudSunMedium != null) {
            return _cloudSunMedium!!
        }
        _cloudSunMedium = Builder(name = "CloudSunMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.967f, 9.839f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 1.796f, 1.852f)
                curveToRelative(0.482f, 0.92f, 0.663f, 2.04f, 0.417f, 3.294f)
                curveToRelative(0.79f, 0.118f, 1.42f, 0.515f, 1.857f, 1.08f)
                quadToRelative(0.144f, 0.186f, 0.258f, 0.391f)
                curveToRelative(1.457f, -0.585f, 2.455f, -1.993f, 2.455f, -3.706f)
                curveToRelative(0.0f, -2.26f, -1.74f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.101f, 0.0f, -2.074f, 0.411f, -2.783f, 1.089f)
                moveToRelative(4.68f, 7.553f)
                curveToRelative(0.087f, 0.388f, 0.113f, 0.793f, 0.08f, 1.194f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, true, -1.165f, 2.517f)
                curveToRelative(-0.717f, 0.7f, -1.745f, 1.147f, -3.062f, 1.147f)
                horizontalLineTo(12.0f)
                curveToRelative(-1.375f, 0.0f, -2.417f, -0.442f, -3.125f, -1.155f)
                curveToRelative(-0.701f, -0.707f, -1.033f, -1.638f, -1.073f, -2.548f)
                curveToRelative(-0.039f, -0.906f, 0.21f, -1.825f, 0.714f, -2.53f)
                curveToRelative(0.416f, -0.581f, 1.014f, -1.024f, 1.758f, -1.167f)
                curveToRelative(0.007f, -2.802f, 2.942f, -4.36f, 5.134f, -3.134f)
                curveToRelative(1.28f, -2.282f, 3.626f, -2.91f, 5.582f, -2.303f)
                curveToRelative(0.91f, -1.031f, 2.25f, -1.663f, 3.76f, -1.663f)
                curveToRelative(2.813f, 0.0f, 5.0f, 2.187f, 5.0f, 5.0f)
                curveToRelative(0.0f, 2.132f, -1.259f, 3.91f, -3.103f, 4.642f)
                moveToRelative(-10.59f, -4.74f)
                curveToRelative(1.01f, -2.29f, 3.125f, -2.837f, 4.81f, -2.225f)
                curveToRelative(0.849f, 0.308f, 1.58f, 0.908f, 2.01f, 1.728f)
                curveToRelative(0.427f, 0.814f, 0.573f, 1.879f, 0.194f, 3.153f)
                lineToRelative(-0.2f, 0.67f)
                lineToRelative(0.7f, -0.028f)
                curveToRelative(0.776f, -0.031f, 1.324f, 0.273f, 1.675f, 0.728f)
                curveToRelative(0.364f, 0.469f, 0.541f, 1.131f, 0.484f, 1.825f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, true, -0.867f, 1.884f)
                curveToRelative(-0.515f, 0.504f, -1.285f, 0.863f, -2.363f, 0.863f)
                horizontalLineTo(12.0f)
                curveToRelative(-1.15f, 0.0f, -1.922f, -0.363f, -2.415f, -0.86f)
                curveToRelative(-0.498f, -0.502f, -0.753f, -1.183f, -0.784f, -1.886f)
                curveToRelative(-0.03f, -0.707f, 0.167f, -1.4f, 0.528f, -1.905f)
                curveToRelative(0.355f, -0.496f, 0.855f, -0.799f, 1.471f, -0.799f)
                horizontalLineToRelative(0.563f)
                lineToRelative(-0.066f, -0.559f)
                curveToRelative(-0.296f, -2.473f, 2.358f, -3.737f, 3.986f, -2.404f)
                lineToRelative(0.51f, 0.417f)
                close()
            }
        }
        .build()
        return _cloudSunMedium!!
    }

private var _cloudSunMedium: ImageVector? = null
