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

public val SBBIcons.WeatherUnknownMedium: ImageVector
    get() {
        if (_weatherUnknownMedium != null) {
            return _weatherUnknownMedium!!
        }
        _weatherUnknownMedium = Builder(
            name = "WeatherUnknownMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                pathFillType = NonZero,
            ) {
                moveTo(17.86f, 25.499f)
                horizontalLineToRelative(-1.321f)
                verticalLineToRelative(-1.257f)
                horizontalLineToRelative(1.32f)
                close()
                moveTo(17.278f, 16.459f)
                quadToRelative(1.241f, -0.001f, 1.975f, 0.694f)
                quadToRelative(0.684f, 0.642f, 0.683f, 1.685f)
                quadToRelative(0.0f, 0.864f, -0.465f, 1.489f)
                quadToRelative(-0.207f, 0.282f, -0.996f, 1.044f)
                quadToRelative(-0.346f, 0.333f, -0.486f, 0.551f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.191f, 0.548f)
                quadToRelative(-0.061f, 0.328f, -0.062f, 0.848f)
                horizontalLineToRelative(-1.04f)
                quadToRelative(0.012f, -0.927f, 0.167f, -1.373f)
                quadToRelative(0.109f, -0.328f, 0.314f, -0.586f)
                quadToRelative(0.205f, -0.26f, 0.909f, -0.974f)
                quadToRelative(0.45f, -0.456f, 0.591f, -0.826f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 0.117f, -0.643f)
                quadToRelative(0.0f, -0.602f, -0.336f, -1.013f)
                quadToRelative(-0.403f, -0.503f, -1.193f, -0.503f)
                quadToRelative(-1.63f, 0.0f, -1.76f, 1.983f)
                horizontalLineToRelative(-1.051f)
                quadToRelative(0.043f, -1.125f, 0.445f, -1.74f)
                quadToRelative(0.375f, -0.568f, 0.99f, -0.877f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 1.39f, -0.307f)
                moveToRelative(-1.898f, -4.662f)
                curveToRelative(1.33f, -2.391f, 3.814f, -2.985f, 5.82f, -2.253f)
                curveToRelative(2.011f, 0.735f, 3.52f, 2.791f, 2.977f, 5.555f)
                curveToRelative(0.678f, 0.107f, 1.24f, 0.426f, 1.664f, 0.886f)
                curveToRelative(0.541f, 0.588f, 0.834f, 1.38f, 0.896f, 2.184f)
                curveToRelative(0.123f, 1.598f, -0.667f, 3.435f, -2.552f, 4.056f)
                lineToRelative(-0.312f, -0.95f)
                curveToRelative(1.34f, -0.442f, 1.963f, -1.766f, 1.867f, -3.028f)
                curveToRelative(-0.048f, -0.625f, -0.273f, -1.191f, -0.635f, -1.584f)
                curveToRelative(-0.352f, -0.383f, -0.855f, -0.628f, -1.536f, -0.601f)
                lineToRelative(-0.697f, 0.028f)
                lineToRelative(0.198f, -0.669f)
                lineToRelative(0.064f, -0.236f)
                curveToRelative(0.604f, -2.413f, -0.648f, -4.106f, -2.277f, -4.701f)
                curveToRelative(-1.689f, -0.617f, -3.81f, -0.067f, -4.825f, 2.249f)
                lineToRelative(-0.459f, -0.201f)
                lineToRelative(-0.317f, 0.386f)
                curveToRelative(-1.576f, -1.299f, -4.133f, -0.152f, -4.02f, 2.203f)
                lineToRelative(0.02f, 0.231f)
                lineToRelative(0.066f, 0.559f)
                horizontalLineToRelative(-0.563f)
                curveToRelative(-1.066f, 0.0f, -1.865f, 0.965f, -1.993f, 2.258f)
                curveToRelative(-0.123f, 1.256f, 0.436f, 2.569f, 1.857f, 3.054f)
                lineToRelative(-0.322f, 0.946f)
                curveToRelative(-1.966f, -0.67f, -2.687f, -2.501f, -2.53f, -4.098f)
                curveToRelative(0.138f, -1.402f, 0.993f, -2.834f, 2.463f, -3.112f)
                curveToRelative(0.006f, -2.822f, 2.944f, -4.4f, 5.146f, -3.162f)
                moveToRelative(0.652f, 0.936f)
                lineToRelative(-0.266f, 0.606f)
                lineToRelative(-0.51f, -0.42f)
                lineToRelative(0.318f, -0.386f)
                close()
            }
        }
            .build()
        return _weatherUnknownMedium!!
    }

private var _weatherUnknownMedium: ImageVector? = null
