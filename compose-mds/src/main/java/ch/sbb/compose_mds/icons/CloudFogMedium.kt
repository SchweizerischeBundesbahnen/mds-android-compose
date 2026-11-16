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

public val SBBIcons.CloudFogMedium: ImageVector
    get() {
        if (_cloudFogMedium != null) {
            return _cloudFogMedium!!
        }
        _cloudFogMedium = Builder(name = "CloudFogMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.408f, 11.719f)
                curveToRelative(1.328f, -2.37f, 3.803f, -2.956f, 5.8f, -2.232f)
                curveToRelative(1.064f, 0.386f, 2.0f, 1.145f, 2.555f, 2.204f)
                curveToRelative(0.482f, 0.92f, 0.661f, 2.04f, 0.415f, 3.294f)
                arcToRelative(2.91f, 2.91f, 0.0f, false, true, 1.881f, 1.075f)
                curveToRelative(0.555f, 0.694f, 0.8f, 1.614f, 0.74f, 2.518f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, true, -1.159f, 2.527f)
                curveToRelative(-0.729f, 0.703f, -1.78f, 1.146f, -3.14f, 1.146f)
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
                curveToRelative(1.132f, 0.0f, 1.925f, -0.363f, 2.446f, -0.865f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, 0.854f, -1.875f)
                curveToRelative(0.047f, -0.69f, -0.144f, -1.355f, -0.522f, -1.828f)
                curveToRelative(-0.368f, -0.46f, -0.93f, -0.764f, -1.708f, -0.733f)
                lineToRelative(-0.698f, 0.028f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.379f, -1.274f, 0.233f, -2.339f, -0.194f, -3.153f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, false, -2.01f, -1.728f)
                moveToRelative(6.122f, 13.823f)
                verticalLineToRelative(1.0f)
                lineTo(7.5f, 25.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(25.489f, 28.25f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 27.25f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _cloudFogMedium!!
    }

private var _cloudFogMedium: ImageVector? = null
