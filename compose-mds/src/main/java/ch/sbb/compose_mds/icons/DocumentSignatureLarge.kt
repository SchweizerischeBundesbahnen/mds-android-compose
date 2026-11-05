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

public val SBBIcons.DocumentSignatureLarge: ImageVector
    get() {
        if (_documentSignatureLarge != null) {
            return _documentSignatureLarge!!
        }
        _documentSignatureLarge = Builder(
            name = "DocumentSignatureLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(35.0f, 19.292f)
                verticalLineToRelative(20.707f)
                lineTo(12.0f, 39.999f)
                verticalLineToRelative(-31.0f)
                horizontalLineToRelative(12.707f)
                close()
                moveTo(13.0f, 38.999f)
                horizontalLineToRelative(21.0f)
                lineTo(34.0f, 19.993f)
                lineTo(24.0f, 19.993f)
                lineTo(24.0f, 9.999f)
                lineTo(13.0f, 9.999f)
                close()
                moveTo(18.735f, 32.196f)
                curveToRelative(0.326f, -0.182f, 0.727f, -0.281f, 1.146f, -0.145f)
                lineToRelative(0.18f, 0.073f)
                lineToRelative(0.004f, 0.002f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.465f, 0.55f)
                curveToRelative(0.072f, 0.198f, 0.098f, 0.418f, 0.105f, 0.623f)
                curveToRelative(0.014f, 0.407f, -0.041f, 0.898f, -0.087f, 1.329f)
                curveToRelative(-0.049f, 0.457f, -0.087f, 0.852f, -0.067f, 1.148f)
                curveToRelative(0.006f, 0.098f, 0.02f, 0.167f, 0.032f, 0.212f)
                lineToRelative(0.016f, -0.004f)
                curveToRelative(0.074f, -0.031f, 0.177f, -0.097f, 0.31f, -0.212f)
                curveToRelative(0.267f, -0.23f, 0.564f, -0.58f, 0.884f, -0.973f)
                curveToRelative(0.306f, -0.378f, 0.638f, -0.802f, 0.943f, -1.121f)
                curveToRelative(0.154f, -0.161f, 0.32f, -0.316f, 0.49f, -0.431f)
                curveToRelative(0.161f, -0.11f, 0.388f, -0.226f, 0.65f, -0.217f)
                horizontalLineToRelative(0.008f)
                curveToRelative(0.248f, 0.012f, 0.477f, 0.07f, 0.674f, 0.19f)
                curveToRelative(0.201f, 0.121f, 0.343f, 0.29f, 0.436f, 0.474f)
                curveToRelative(0.173f, 0.345f, 0.18f, 0.75f, 0.165f, 1.058f)
                curveToRelative(-0.008f, 0.162f, -0.023f, 0.325f, -0.036f, 0.466f)
                quadToRelative(-0.022f, 0.22f, -0.027f, 0.374f)
                lineToRelative(0.001f, 0.091f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.12f, -0.039f)
                curveToRelative(0.156f, -0.075f, 0.34f, -0.224f, 0.594f, -0.45f)
                curveToRelative(0.235f, -0.208f, 0.523f, -0.474f, 0.835f, -0.694f)
                curveToRelative(0.317f, -0.223f, 0.696f, -0.427f, 1.139f, -0.494f)
                verticalLineToRelative(-0.001f)
                curveToRelative(0.684f, -0.103f, 1.254f, 0.258f, 1.6f, 0.552f)
                curveToRelative(0.354f, 0.303f, 0.581f, 0.63f, 0.613f, 0.68f)
                lineToRelative(-0.426f, 0.263f)
                lineToRelative(-0.426f, 0.261f)
                curveToRelative(-0.013f, -0.017f, -0.17f, -0.238f, -0.411f, -0.444f)
                curveToRelative(-0.274f, -0.234f, -0.553f, -0.361f, -0.8f, -0.324f)
                curveToRelative(-0.23f, 0.036f, -0.463f, 0.148f, -0.713f, 0.324f)
                curveToRelative(-0.254f, 0.18f, -0.488f, 0.395f, -0.747f, 0.625f)
                curveToRelative(-0.24f, 0.213f, -0.522f, 0.458f, -0.822f, 0.603f)
                curveToRelative(-0.287f, 0.139f, -0.631f, 0.204f, -0.986f, 0.065f)
                lineToRelative(-0.154f, -0.072f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.372f, -0.501f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -0.045f, -0.467f)
                curveToRelative(0.004f, -0.144f, 0.018f, -0.3f, 0.03f, -0.442f)
                quadToRelative(0.022f, -0.221f, 0.034f, -0.423f)
                curveToRelative(0.013f, -0.288f, -0.011f, -0.465f, -0.06f, -0.562f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, false, -0.058f, -0.067f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.179f, -0.045f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.076f, 0.044f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.328f, 0.294f)
                curveToRelative(-0.269f, 0.281f, -0.562f, 0.657f, -0.89f, 1.06f)
                curveToRelative(-0.314f, 0.388f, -0.662f, 0.803f, -1.006f, 1.1f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.577f, 0.377f)
                curveToRelative(-0.213f, 0.09f, -0.474f, 0.137f, -0.745f, 0.052f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, -0.55f, -0.498f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -0.139f, -0.617f)
                curveToRelative(-0.026f, -0.4f, 0.025f, -0.888f, 0.07f, -1.32f)
                curveToRelative(0.05f, -0.46f, 0.094f, -0.87f, 0.083f, -1.19f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -0.045f, -0.317f)
                quadToRelative(0.0f, -0.003f, -0.003f, -0.005f)
                curveToRelative(-0.097f, -0.036f, -0.206f, -0.03f, -0.363f, 0.058f)
                curveToRelative(-0.192f, 0.107f, -0.4f, 0.307f, -0.602f, 0.563f)
                arcToRelative(6.71f, 6.71f, 0.0f, false, false, -0.657f, 1.058f)
                lineToRelative(-0.008f, 0.017f)
                lineToRelative(-0.002f, 0.003f)
                lineToRelative(-0.906f, -0.421f)
                verticalLineToRelative(-0.004f)
                lineToRelative(0.005f, -0.007f)
                lineToRelative(0.011f, -0.024f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.202f, -0.382f)
                curveToRelative(0.134f, -0.239f, 0.33f, -0.557f, 0.57f, -0.86f)
                curveToRelative(0.236f, -0.298f, 0.54f, -0.616f, 0.898f, -0.816f)
                moveToRelative(11.267f, -4.197f)
                lineTo(16.998f, 27.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.004f)
                close()
                moveTo(30.002f, 23.999f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(25.0f, 18.994f)
                horizontalLineToRelative(8.287f)
                lineTo(25.0f, 10.706f)
                close()
            }
        }
            .build()
        return _documentSignatureLarge!!
    }

private var _documentSignatureLarge: ImageVector? = null
