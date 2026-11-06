package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.TorchLarge: ImageVector
    get() {
        if (_torchLarge != null) {
            return _torchLarge!!
        }
        _torchLarge = Builder(name = "TorchLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(27.99f, 30.598f)
                lineToRelative(-2.0f, 10.0f)
                lineToRelative(-0.08f, 0.402f)
                horizontalLineToRelative(-4.82f)
                lineToRelative(-0.08f, -0.402f)
                lineToRelative(-2.0f, -10.0f)
                lineToRelative(-0.12f, -0.598f)
                horizontalLineToRelative(9.22f)
                close()
                moveTo(21.51f, 38.0f)
                lineToRelative(0.4f, 2.0f)
                horizontalLineToRelative(3.18f)
                lineToRelative(0.4f, -2.0f)
                close()
                moveTo(21.31f, 37.0f)
                horizontalLineToRelative(4.38f)
                lineToRelative(0.4f, -2.0f)
                horizontalLineToRelative(-5.18f)
                close()
                moveTo(20.71f, 34.0f)
                horizontalLineToRelative(5.58f)
                lineToRelative(0.6f, -3.0f)
                horizontalLineToRelative(-6.78f)
                close()
                moveTo(23.796f, 6.097f)
                curveToRelative(3.84f, 2.82f, 5.392f, 6.442f, 5.981f, 9.35f)
                curveToRelative(0.295f, 1.452f, 0.35f, 2.728f, 0.33f, 3.643f)
                curveToRelative(-0.009f, 0.458f, -0.036f, 0.827f, -0.062f, 1.083f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -0.047f, 0.378f)
                lineToRelative(-0.003f, 0.021f)
                curveTo(29.672f, 24.06f, 27.118f, 27.0f, 23.5f, 27.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -6.5f, -6.5f)
                verticalLineToRelative(-6.693f)
                lineToRelative(0.658f, 0.218f)
                lineTo(23.0f, 15.805f)
                lineTo(23.0f, 5.514f)
                close()
                moveTo(24.0f, 17.193f)
                lineToRelative(-0.658f, -0.218f)
                lineTo(18.0f, 15.193f)
                lineTo(18.0f, 20.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 5.5f, 5.5f)
                curveToRelative(3.0f, 0.0f, 5.226f, -2.444f, 5.502f, -5.544f)
                lineToRelative(0.002f, -0.02f)
                lineToRelative(0.003f, -0.019f)
                verticalLineToRelative(-0.002f)
                lineToRelative(0.003f, -0.015f)
                lineToRelative(0.009f, -0.064f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.03f, -0.264f)
                curveToRelative(0.024f, -0.232f, 0.05f, -0.574f, 0.058f, -1.003f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, -0.31f, -3.422f)
                curveToRelative(-0.51f, -2.517f, -1.782f, -5.586f, -4.797f, -8.118f)
                close()
                moveTo(23.854f, 18.146f)
                curveToRelative(1.555f, 1.555f, 2.282f, 3.186f, 2.209f, 4.506f)
                curveToRelative(-0.038f, 0.669f, -0.284f, 1.267f, -0.745f, 1.698f)
                curveToRelative(-0.46f, 0.43f, -1.091f, 0.65f, -1.818f, 0.65f)
                curveToRelative(-0.726f, 0.0f, -1.356f, -0.22f, -1.817f, -0.65f)
                reflectiveCurveToRelative(-0.707f, -1.029f, -0.744f, -1.698f)
                curveToRelative(-0.074f, -1.32f, 0.653f, -2.95f, 2.207f, -4.506f)
                lineToRelative(0.354f, -0.353f)
                close()
                moveTo(23.5f, 19.227f)
                curveToRelative(-1.177f, 1.306f, -1.61f, 2.522f, -1.562f, 3.37f)
                curveToRelative(0.025f, 0.457f, 0.185f, 0.796f, 0.427f, 1.022f)
                reflectiveCurveToRelative(0.612f, 0.38f, 1.135f, 0.381f)
                curveToRelative(0.523f, 0.0f, 0.894f, -0.155f, 1.136f, -0.38f)
                curveToRelative(0.242f, -0.227f, 0.402f, -0.566f, 0.428f, -1.022f)
                curveToRelative(0.047f, -0.85f, -0.387f, -2.065f, -1.564f, -3.37f)
            }
        }
        .build()
        return _torchLarge!!
    }

private var _torchLarge: ImageVector? = null
