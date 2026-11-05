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

public val SBBIcons.CloudMoonMedium: ImageVector
    get() {
        if (_cloudMoonMedium != null) {
            return _cloudMoonMedium!!
        }
        _cloudMoonMedium = Builder(
            name = "CloudMoonMedium",
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
                moveToRelative(25.92f, 5.926f)
                lineToRelative(0.65f, -1.288f)
                lineToRelative(-1.308f, 0.61f)
                curveToRelative(-0.729f, 0.339f, -1.514f, 0.744f, -2.234f, 1.485f)
                curveToRelative(-0.634f, 0.652f, -1.194f, 1.54f, -1.645f, 2.82f)
                lineToRelative(-0.175f, -0.066f)
                curveToRelative(-1.997f, -0.725f, -4.471f, -0.138f, -5.8f, 2.23f)
                curveToRelative(-2.192f, -1.226f, -5.127f, 0.33f, -5.134f, 3.133f)
                curveToRelative(-0.744f, 0.143f, -1.342f, 0.586f, -1.758f, 1.167f)
                curveToRelative(-0.504f, 0.705f, -0.753f, 1.624f, -0.714f, 2.53f)
                curveToRelative(0.04f, 0.91f, 0.372f, 1.841f, 1.073f, 2.548f)
                curveToRelative(0.708f, 0.713f, 1.75f, 1.156f, 3.125f, 1.156f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.34f, 0.0f, 2.38f, -0.445f, 3.104f, -1.147f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, false, 1.16f, -2.522f)
                quadToRelative(0.027f, -0.346f, -0.006f, -0.688f)
                curveToRelative(1.017f, 0.09f, 2.283f, -0.106f, 3.486f, -0.586f)
                curveToRelative(1.582f, -0.633f, 3.152f, -1.796f, 3.962f, -3.603f)
                lineToRelative(0.52f, -1.16f)
                lineToRelative(-1.17f, 0.495f)
                curveToRelative(-2.932f, 1.24f, -5.312f, 0.405f, -6.725f, -1.18f)
                curveToRelative(-1.438f, -1.614f, -1.886f, -4.006f, -0.912f, -5.934f)
                moveToRelative(0.584f, 10.925f)
                curveToRelative(0.83f, 0.156f, 2.097f, 0.036f, 3.369f, -0.472f)
                curveToRelative(1.034f, -0.413f, 2.022f, -1.064f, 2.742f, -1.97f)
                curveToRelative(-2.744f, 0.684f, -5.06f, -0.235f, -6.53f, -1.884f)
                curveToRelative(-1.379f, -1.546f, -2.005f, -3.734f, -1.527f, -5.765f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, false, -0.813f, 0.67f)
                curveToRelative(-0.536f, 0.551f, -1.047f, 1.347f, -1.47f, 2.602f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 1.488f, 1.66f)
                curveToRelative(0.482f, 0.918f, 0.663f, 2.039f, 0.417f, 3.292f)
                arcToRelative(2.88f, 2.88f, 0.0f, false, true, 1.869f, 1.078f)
                curveToRelative(0.189f, 0.24f, 0.34f, 0.506f, 0.455f, 0.79f)
                moveToRelative(-10.446f, -4.199f)
                curveToRelative(1.01f, -2.29f, 3.124f, -2.837f, 4.81f, -2.225f)
                curveToRelative(0.848f, 0.308f, 1.58f, 0.908f, 2.01f, 1.728f)
                curveToRelative(0.426f, 0.814f, 0.572f, 1.879f, 0.193f, 3.153f)
                lineToRelative(-0.2f, 0.67f)
                lineToRelative(0.7f, -0.028f)
                curveToRelative(0.777f, -0.031f, 1.332f, 0.274f, 1.692f, 0.731f)
                curveToRelative(0.371f, 0.471f, 0.557f, 1.134f, 0.505f, 1.826f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, true, -0.86f, 1.88f)
                curveToRelative(-0.518f, 0.502f, -1.301f, 0.863f, -2.408f, 0.863f)
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
        return _cloudMoonMedium!!
    }

private var _cloudMoonMedium: ImageVector? = null
