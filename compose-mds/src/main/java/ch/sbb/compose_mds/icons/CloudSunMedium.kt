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
                moveTo(24.75f, 8.75f)
                curveToRelative(2.26f, 0.0f, 4.0f, 1.74f, 4.0f, 4.0f)
                curveToRelative(0.0f, 1.713f, -0.998f, 3.12f, -2.455f, 3.706f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.257f, -0.39f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, false, -1.86f, -1.08f)
                curveToRelative(0.246f, -1.255f, 0.067f, -2.375f, -0.415f, -3.295f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, -1.796f, -1.852f)
                curveToRelative(0.71f, -0.677f, 1.682f, -1.089f, 2.783f, -1.089f)
                moveToRelative(-3.76f, 0.664f)
                curveToRelative(0.91f, -1.032f, 2.25f, -1.664f, 3.76f, -1.664f)
                curveToRelative(2.812f, 0.0f, 5.0f, 2.187f, 5.0f, 5.0f)
                curveToRelative(0.0f, 2.132f, -1.259f, 3.91f, -3.103f, 4.643f)
                curveToRelative(0.087f, 0.387f, 0.112f, 0.792f, 0.08f, 1.193f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, true, -1.165f, 2.516f)
                curveToRelative(-0.717f, 0.701f, -1.745f, 1.149f, -3.062f, 1.149f)
                lineTo(12.0f, 22.251f)
                curveToRelative(-1.374f, 0.0f, -2.417f, -0.443f, -3.125f, -1.157f)
                curveToRelative(-0.7f, -0.706f, -1.033f, -1.637f, -1.073f, -2.546f)
                curveToRelative(-0.04f, -0.906f, 0.21f, -1.826f, 0.714f, -2.53f)
                curveToRelative(0.417f, -0.583f, 1.015f, -1.026f, 1.76f, -1.169f)
                curveToRelative(0.008f, -2.802f, 2.94f, -4.356f, 5.132f, -3.13f)
                curveToRelative(1.28f, -2.284f, 3.625f, -2.912f, 5.582f, -2.305f)
                moveToRelative(-4.932f, 3.238f)
                curveToRelative(1.01f, -2.29f, 3.123f, -2.837f, 4.809f, -2.225f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, true, 2.01f, 1.728f)
                curveToRelative(0.427f, 0.814f, 0.573f, 1.879f, 0.194f, 3.153f)
                lineToRelative(-0.2f, 0.67f)
                lineToRelative(0.699f, -0.028f)
                curveToRelative(0.777f, -0.031f, 1.325f, 0.273f, 1.677f, 0.727f)
                curveToRelative(0.363f, 0.47f, 0.54f, 1.132f, 0.483f, 1.826f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, true, -0.867f, 1.884f)
                curveToRelative(-0.515f, 0.504f, -1.285f, 0.864f, -2.363f, 0.864f)
                lineTo(12.0f, 21.251f)
                curveToRelative(-1.15f, 0.0f, -1.922f, -0.364f, -2.415f, -0.86f)
                curveToRelative(-0.498f, -0.503f, -0.753f, -1.184f, -0.784f, -1.887f)
                curveToRelative(-0.03f, -0.707f, 0.168f, -1.4f, 0.529f, -1.905f)
                curveToRelative(0.354f, -0.495f, 0.854f, -0.799f, 1.47f, -0.799f)
                horizontalLineToRelative(0.564f)
                lineToRelative(-0.068f, -0.559f)
                curveToRelative(-0.286f, -2.395f, 2.196f, -3.657f, 3.831f, -2.521f)
                lineToRelative(0.157f, 0.118f)
                lineToRelative(0.508f, 0.416f)
                close()
                moveTo(16.058f, 12.652f)
                lineTo(15.6f, 12.451f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(11.296f, 15.241f)
                lineTo(10.8f, 15.301f)
                lineTo(10.8f, 15.3f)
                close()
            }
        }
        .build()
        return _cloudSunMedium!!
    }

private var _cloudSunMedium: ImageVector? = null
