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

public val SBBIcons.CloudDisabledLarge: ImageVector
    get() {
        if (_cloudDisabledLarge != null) {
            return _cloudDisabledLarge!!
        }
        _cloudDisabledLarge = Builder(
            name = "CloudDisabledLarge",
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
                moveToRelative(40.56f, 39.854f)
                lineToRelative(-0.707f, 0.706f)
                lineToRelative(-8.897f, -8.897f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.813f, 0.043f)
                horizontalLineToRelative(-14.0f)
                curveToRelative(-1.795f, 0.0f, -3.14f, -0.574f, -4.047f, -1.484f)
                curveToRelative(-0.902f, -0.905f, -1.333f, -2.1f, -1.384f, -3.274f)
                curveToRelative(-0.051f, -1.17f, 0.272f, -2.353f, 0.92f, -3.256f)
                curveToRelative(0.56f, -0.778f, 1.37f, -1.353f, 2.376f, -1.505f)
                curveToRelative(-0.053f, -2.217f, 1.315f, -3.843f, 3.031f, -4.441f)
                lineTo(7.854f, 8.56f)
                lineToRelative(0.707f, -0.707f)
                close()
                moveTo(17.853f, 18.56f)
                curveToRelative(-1.66f, 0.322f, -3.077f, 1.838f, -2.815f, 4.026f)
                lineToRelative(0.067f, 0.56f)
                horizontalLineToRelative(-0.563f)
                curveToRelative(-0.884f, 0.0f, -1.598f, 0.435f, -2.097f, 1.128f)
                curveToRelative(-0.504f, 0.703f, -0.777f, 1.66f, -0.734f, 2.63f)
                curveToRelative(0.042f, 0.965f, 0.395f, 1.91f, 1.093f, 2.61f)
                curveToRelative(0.692f, 0.695f, 1.767f, 1.191f, 3.339f, 1.191f)
                horizontalLineToRelative(13.856f)
                close()
                moveTo(21.226f, 17.345f)
                curveToRelative(1.943f, -2.754f, 5.206f, -3.2f, 7.684f, -2.034f)
                curveToRelative(2.36f, 1.112f, 4.011f, 3.68f, 3.27f, 7.055f)
                curveToRelative(1.767f, 0.185f, 2.92f, 1.413f, 3.347f, 2.897f)
                curveToRelative(0.472f, 1.636f, 0.082f, 3.626f, -1.312f, 4.965f)
                lineToRelative(-0.346f, -0.36f)
                lineToRelative(-0.346f, -0.36f)
                curveToRelative(1.101f, -1.06f, 1.422f, -2.655f, 1.043f, -3.968f)
                curveToRelative(-0.371f, -1.289f, -1.395f, -2.26f, -3.005f, -2.195f)
                lineToRelative(-0.699f, 0.028f)
                lineToRelative(0.2f, -0.67f)
                curveToRelative(0.953f, -3.19f, -0.506f, -5.512f, -2.578f, -6.487f)
                curveToRelative(-2.095f, -0.987f, -4.812f, -0.604f, -6.442f, 1.706f)
                lineToRelative(-0.408f, -0.29f)
                close()
            }
        }
            .build()
        return _cloudDisabledLarge!!
    }

private var _cloudDisabledLarge: ImageVector? = null
