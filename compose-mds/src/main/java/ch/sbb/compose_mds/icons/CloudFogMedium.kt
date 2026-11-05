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
        _cloudFogMedium = Builder(
            name = "CloudFogMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(24.18f, 14.984f)
                curveToRelative(0.792f, 0.118f, 1.43f, 0.514f, 1.88f, 1.076f)
                curveToRelative(0.554f, 0.694f, 0.8f, 1.614f, 0.738f, 2.518f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, true, -1.158f, 2.527f)
                curveToRelative(-0.729f, 0.703f, -1.78f, 1.146f, -3.14f, 1.146f)
                horizontalLineTo(12.0f)
                curveToRelative(-1.375f, 0.0f, -2.417f, -0.443f, -3.125f, -1.156f)
                curveToRelative(-0.701f, -0.707f, -1.033f, -1.638f, -1.073f, -2.548f)
                curveToRelative(-0.039f, -0.906f, 0.21f, -1.825f, 0.714f, -2.53f)
                curveToRelative(0.416f, -0.581f, 1.014f, -1.023f, 1.758f, -1.167f)
                curveToRelative(0.007f, -2.802f, 2.942f, -4.359f, 5.134f, -3.133f)
                curveToRelative(1.329f, -2.368f, 3.803f, -2.955f, 5.8f, -2.23f)
                curveToRelative(1.064f, 0.386f, 2.0f, 1.145f, 2.555f, 2.204f)
                curveToRelative(0.482f, 0.92f, 0.663f, 2.04f, 0.417f, 3.293f)
                moveToRelative(-3.313f, -4.557f)
                curveToRelative(-1.686f, -0.612f, -3.8f, -0.064f, -4.81f, 2.226f)
                lineToRelative(-0.265f, 0.601f)
                lineToRelative(-0.509f, -0.416f)
                curveToRelative(-1.627f, -1.334f, -4.282f, -0.07f, -3.986f, 2.403f)
                lineToRelative(0.066f, 0.56f)
                horizontalLineTo(10.8f)
                curveToRelative(-0.616f, 0.0f, -1.116f, 0.303f, -1.47f, 0.798f)
                curveToRelative(-0.362f, 0.505f, -0.56f, 1.198f, -0.529f, 1.905f)
                curveToRelative(0.031f, 0.703f, 0.286f, 1.384f, 0.784f, 1.887f)
                curveToRelative(0.493f, 0.496f, 1.265f, 0.86f, 2.415f, 0.86f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.132f, 0.0f, 1.925f, -0.364f, 2.446f, -0.866f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, 0.855f, -1.875f)
                curveToRelative(0.047f, -0.69f, -0.145f, -1.353f, -0.523f, -1.826f)
                curveToRelative(-0.367f, -0.46f, -0.93f, -0.765f, -1.708f, -0.734f)
                lineToRelative(-0.698f, 0.028f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.379f, -1.274f, 0.233f, -2.339f, -0.193f, -3.153f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, false, -2.01f, -1.728f)
                moveTo(26.99f, 25.25f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.49f)
                close()
                moveTo(9.0f, 28.25f)
                horizontalLineToRelative(16.49f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
            .build()
        return _cloudFogMedium!!
    }

private var _cloudFogMedium: ImageVector? = null
