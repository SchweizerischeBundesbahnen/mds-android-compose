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

public val SBBIcons.UnicornLarge: ImageVector
    get() {
        if (_unicornLarge != null) {
            return _unicornLarge!!
        }
        _unicornLarge = Builder(
            name = "UnicornLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
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
                moveToRelative(41.132f, 10.627f)
                lineToRelative(-7.424f, 7.708f)
                quadToRelative(0.12f, 0.251f, 0.252f, 0.522f)
                curveToRelative(0.562f, 1.131f, 1.281f, 2.455f, 1.972f, 3.772f)
                curveToRelative(0.684f, 1.305f, 1.34f, 2.604f, 1.753f, 3.648f)
                curveToRelative(0.206f, 0.52f, 0.363f, 1.003f, 0.426f, 1.408f)
                curveToRelative(0.032f, 0.202f, 0.045f, 0.408f, 0.016f, 0.601f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, true, -0.285f, 0.58f)
                quadToRelative(-0.206f, 0.192f, -0.393f, 0.375f)
                curveToRelative(-0.124f, 0.121f, -0.247f, 0.242f, -0.367f, 0.353f)
                curveToRelative(-0.237f, 0.218f, -0.49f, 0.43f, -0.772f, 0.574f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -1.306f, 0.12f)
                curveToRelative(-0.087f, 0.465f, -0.324f, 0.879f, -0.696f, 1.13f)
                curveToRelative(-0.315f, 0.214f, -0.706f, 0.291f, -1.113f, 0.18f)
                curveToRelative(-0.383f, -0.104f, -0.74f, -0.365f, -1.057f, -0.752f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -5.838f, -3.888f)
                lineToRelative(0.4f, -0.916f)
                arcToRelative(21.1f, 21.1f, 0.0f, false, true, 6.146f, 4.097f)
                lineToRelative(0.024f, 0.023f)
                lineToRelative(0.02f, 0.026f)
                curveToRelative(0.238f, 0.297f, 0.438f, 0.41f, 0.568f, 0.446f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, false, 0.29f, -0.043f)
                curveToRelative(0.184f, -0.125f, 0.371f, -0.496f, 0.264f, -0.984f)
                lineToRelative(-0.261f, -1.181f)
                lineToRelative(1.019f, 0.653f)
                curveToRelative(0.299f, 0.192f, 0.511f, 0.264f, 0.666f, 0.282f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.416f, -0.084f)
                curveToRelative(0.158f, -0.08f, 0.33f, -0.215f, 0.551f, -0.419f)
                quadToRelative(0.162f, -0.15f, 0.349f, -0.333f)
                quadToRelative(0.176f, -0.173f, 0.38f, -0.367f)
                lineToRelative(0.006f, -0.02f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.014f, -0.298f)
                curveToRelative(-0.046f, -0.295f, -0.171f, -0.697f, -0.368f, -1.195f)
                curveToRelative(-0.392f, -0.988f, -1.024f, -2.243f, -1.71f, -3.551f)
                curveToRelative(-0.68f, -1.297f, -1.413f, -2.648f, -1.981f, -3.791f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, true, -0.72f, -1.563f)
                curveToRelative(-0.174f, -0.434f, -0.31f, -0.847f, -0.341f, -1.177f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, -0.566f, -1.52f)
                lineToRelative(-0.002f, -0.001f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.184f, -1.108f)
                lineToRelative(-0.41f, -0.235f)
                lineToRelative(0.21f, -0.423f)
                lineToRelative(1.595f, -3.188f)
                curveToRelative(-0.195f, 0.033f, -0.41f, 0.079f, -0.634f, 0.143f)
                curveToRelative(-0.823f, 0.234f, -1.658f, 0.678f, -2.066f, 1.493f)
                lineToRelative(-0.188f, 0.378f)
                lineToRelative(-0.404f, -0.123f)
                arcToRelative(14.26f, 14.26f, 0.0f, false, false, -6.694f, -0.39f)
                lineToRelative(-0.444f, 0.088f)
                arcToRelative(14.26f, 14.26f, 0.0f, false, false, -6.388f, 3.2f)
                lineToRelative(-0.009f, 0.007f)
                curveToRelative(-2.99f, 2.5f, -4.866f, 6.164f, -6.035f, 10.101f)
                curveToRelative(-1.116f, 3.76f, -1.574f, 7.728f, -1.76f, 11.078f)
                curveToRelative(7.37f, 0.93f, 13.09f, 1.878f, 20.355f, 3.646f)
                curveToRelative(-1.734f, -2.621f, -3.04f, -4.687f, -3.922f, -7.027f)
                curveTo(22.454f, 30.019f, 22.0f, 27.033f, 22.0f, 22.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 4.467f, 0.448f, 7.321f, 1.394f, 9.83f)
                curveToRelative(0.95f, 2.52f, 2.414f, 4.722f, 4.522f, 7.894f)
                lineToRelative(0.715f, 1.074f)
                lineToRelative(-1.252f, -0.313f)
                curveToRelative(-7.976f, -1.994f, -13.956f, -2.99f, -21.941f, -3.989f)
                lineToRelative(-0.46f, -0.058f)
                lineToRelative(0.023f, -0.462f)
                curveToRelative(0.17f, -3.483f, 0.626f, -7.734f, 1.826f, -11.776f)
                curveToRelative(1.198f, -4.034f, 3.15f, -7.903f, 6.344f, -10.577f)
                arcToRelative(15.26f, 15.26f, 0.0f, false, true, 14.095f, -3.21f)
                curveToRelative(0.63f, -0.94f, 1.644f, -1.407f, 2.471f, -1.643f)
                arcTo(7.3f, 7.3f, 0.0f, false, true, 32.455f, 9.0f)
                lineTo(32.486f, 9.0f)
                horizontalLineToRelative(0.823f)
                lineToRelative(-0.362f, 0.724f)
                lineToRelative(-1.8f, 3.6f)
                quadToRelative(0.355f, 0.257f, 0.654f, 0.575f)
                lineToRelative(8.76f, -4.072f)
                lineToRelative(2.43f, -1.13f)
                close()
                moveTo(27.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(4.912f, -2.281f)
                curveToRelative(0.263f, 0.451f, 0.447f, 0.944f, 0.543f, 1.458f)
                lineToRelative(0.041f, 0.26f)
                lineToRelative(0.002f, 0.021f)
                curveToRelative(0.014f, 0.17f, 0.098f, 0.466f, 0.27f, 0.894f)
                lineToRelative(5.286f, -5.49f)
                close()
            }
        }
            .build()
        return _unicornLarge!!
    }

private var _unicornLarge: ImageVector? = null
