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

public val SBBIcons.CloudRainMedium: ImageVector
    get() {
        if (_cloudRainMedium != null) {
            return _cloudRainMedium!!
        }
        _cloudRainMedium = Builder(name = "CloudRainMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.408f, 11.719f)
                curveToRelative(1.328f, -2.37f, 3.803f, -2.956f, 5.8f, -2.232f)
                curveToRelative(1.064f, 0.386f, 2.0f, 1.145f, 2.555f, 2.204f)
                curveToRelative(0.482f, 0.92f, 0.661f, 2.04f, 0.415f, 3.294f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, true, 1.87f, 1.078f)
                curveToRelative(0.546f, 0.697f, 0.78f, 1.618f, 0.71f, 2.52f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, -1.162f, 2.52f)
                curveToRelative(-0.722f, 0.702f, -1.76f, 1.148f, -3.096f, 1.148f)
                lineTo(12.0f, 22.251f)
                curveToRelative(-1.374f, 0.0f, -2.417f, -0.443f, -3.125f, -1.156f)
                curveToRelative(-0.7f, -0.707f, -1.033f, -1.638f, -1.073f, -2.547f)
                curveToRelative(-0.04f, -0.906f, 0.21f, -1.826f, 0.714f, -2.53f)
                curveToRelative(0.417f, -0.583f, 1.015f, -1.026f, 1.76f, -1.168f)
                curveToRelative(0.008f, -2.803f, 2.94f, -4.357f, 5.132f, -3.131f)
                moveToRelative(5.459f, -1.292f)
                curveToRelative(-1.686f, -0.611f, -3.799f, -0.064f, -4.809f, 2.225f)
                lineToRelative(-0.458f, -0.202f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.458f, 0.201f)
                lineToRelative(-0.265f, 0.602f)
                lineToRelative(-0.51f, -0.416f)
                lineToRelative(-0.156f, -0.118f)
                curveToRelative(-1.635f, -1.136f, -4.117f, 0.126f, -3.83f, 2.521f)
                lineToRelative(-0.497f, 0.059f)
                lineToRelative(0.496f, -0.059f)
                lineToRelative(0.068f, 0.56f)
                lineTo(10.8f, 15.801f)
                curveToRelative(-0.616f, 0.0f, -1.116f, 0.303f, -1.47f, 0.798f)
                curveToRelative(-0.361f, 0.505f, -0.56f, 1.198f, -0.529f, 1.905f)
                curveToRelative(0.03f, 0.703f, 0.286f, 1.384f, 0.784f, 1.887f)
                curveToRelative(0.493f, 0.496f, 1.265f, 0.86f, 2.415f, 0.86f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.102f, 0.0f, 1.882f, -0.361f, 2.4f, -0.864f)
                arcToRelative(2.93f, 2.93f, 0.0f, false, false, 0.861f, -1.881f)
                curveToRelative(0.053f, -0.692f, -0.131f, -1.355f, -0.5f, -1.825f)
                curveToRelative(-0.36f, -0.457f, -0.914f, -0.762f, -1.691f, -0.73f)
                lineToRelative(-0.698f, 0.027f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.379f, -1.274f, 0.233f, -2.339f, -0.194f, -3.153f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, false, -2.01f, -1.728f)
                moveToRelative(-7.67f, 13.797f)
                lineToRelative(-1.5f, 3.0f)
                lineToRelative(-0.894f, -0.448f)
                lineToRelative(1.5f, -3.0f)
                close()
                moveTo(20.697f, 27.224f)
                lineTo(22.197f, 24.224f)
                lineTo(21.303f, 23.776f)
                lineTo(19.803f, 26.776f)
                close()
                moveTo(16.197f, 24.224f)
                lineTo(13.197f, 30.224f)
                lineTo(12.303f, 29.776f)
                lineTo(15.303f, 23.776f)
                close()
                moveTo(16.272f, 30.224f)
                lineTo(19.272f, 24.224f)
                lineTo(18.377f, 23.776f)
                lineTo(15.377f, 29.776f)
                close()
            }
        }
        .build()
        return _cloudRainMedium!!
    }

private var _cloudRainMedium: ImageVector? = null
