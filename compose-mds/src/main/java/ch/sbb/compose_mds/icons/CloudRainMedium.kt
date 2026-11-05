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
                moveTo(24.18f, 14.985f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, true, 1.867f, 1.078f)
                curveToRelative(0.547f, 0.696f, 0.78f, 1.617f, 0.711f, 2.52f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, -1.161f, 2.52f)
                curveToRelative(-0.723f, 0.703f, -1.761f, 1.148f, -3.097f, 1.148f)
                lineTo(12.0f, 22.251f)
                curveToRelative(-1.375f, 0.0f, -2.417f, -0.443f, -3.125f, -1.156f)
                curveToRelative(-0.701f, -0.707f, -1.033f, -1.638f, -1.073f, -2.548f)
                curveToRelative(-0.039f, -0.906f, 0.21f, -1.825f, 0.714f, -2.53f)
                curveToRelative(0.416f, -0.581f, 1.014f, -1.023f, 1.758f, -1.167f)
                curveToRelative(0.007f, -2.802f, 2.942f, -4.359f, 5.134f, -3.133f)
                curveToRelative(1.329f, -2.368f, 3.803f, -2.955f, 5.8f, -2.23f)
                curveToRelative(1.064f, 0.386f, 2.0f, 1.145f, 2.555f, 2.204f)
                curveToRelative(0.482f, 0.92f, 0.663f, 2.04f, 0.417f, 3.294f)
                moveToRelative(-3.313f, -4.558f)
                curveToRelative(-1.686f, -0.612f, -3.8f, -0.064f, -4.81f, 2.226f)
                lineToRelative(-0.265f, 0.601f)
                lineToRelative(-0.509f, -0.416f)
                curveToRelative(-1.627f, -1.334f, -4.282f, -0.07f, -3.986f, 2.403f)
                lineToRelative(0.066f, 0.56f)
                lineTo(10.8f, 15.801f)
                curveToRelative(-0.616f, 0.0f, -1.116f, 0.303f, -1.47f, 0.798f)
                curveToRelative(-0.362f, 0.505f, -0.56f, 1.198f, -0.529f, 1.905f)
                curveToRelative(0.031f, 0.703f, 0.286f, 1.384f, 0.784f, 1.887f)
                curveToRelative(0.493f, 0.496f, 1.265f, 0.86f, 2.415f, 0.86f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.102f, 0.0f, 1.882f, -0.361f, 2.4f, -0.864f)
                arcToRelative(2.93f, 2.93f, 0.0f, false, false, 0.861f, -1.88f)
                curveToRelative(0.053f, -0.693f, -0.131f, -1.356f, -0.5f, -1.827f)
                curveToRelative(-0.36f, -0.456f, -0.913f, -0.76f, -1.69f, -0.73f)
                lineToRelative(-0.7f, 0.028f)
                lineToRelative(0.2f, -0.67f)
                curveToRelative(0.379f, -1.274f, 0.233f, -2.339f, -0.194f, -3.153f)
                arcToRelative(3.66f, 3.66f, 0.0f, false, false, -2.01f, -1.728f)
                moveToRelative(-10.064f, 16.35f)
                lineToRelative(1.5f, -3.0f)
                lineToRelative(0.894f, 0.447f)
                lineToRelative(-1.5f, 3.0f)
                close()
                moveTo(21.303f, 23.777f)
                lineTo(19.803f, 26.777f)
                lineTo(20.697f, 27.224f)
                lineTo(22.197f, 24.224f)
                close()
                moveTo(12.303f, 29.777f)
                lineTo(15.303f, 23.777f)
                lineTo(16.197f, 24.224f)
                lineTo(13.197f, 30.224f)
                close()
                moveTo(18.378f, 23.777f)
                lineTo(15.378f, 29.777f)
                lineTo(16.272f, 30.224f)
                lineTo(19.272f, 24.224f)
                close()
            }
        }
        .build()
        return _cloudRainMedium!!
    }

private var _cloudRainMedium: ImageVector? = null
