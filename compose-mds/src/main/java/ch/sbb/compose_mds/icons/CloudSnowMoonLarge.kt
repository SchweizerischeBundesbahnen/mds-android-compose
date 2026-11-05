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

public val SBBIcons.CloudSnowMoonLarge: ImageVector
    get() {
        if (_cloudSnowMoonLarge != null) {
            return _cloudSnowMoonLarge!!
        }
        _cloudSnowMoonLarge = Builder(
            name = "CloudSnowMoonLarge",
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
                moveTo(18.5f, 36.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(-8.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-12.0f, -5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(-16.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(3.41f, -24.673f)
                curveToRelative(-1.334f, 2.64f, -0.716f, 5.902f, 1.241f, 8.097f)
                curveToRelative(1.932f, 2.167f, 5.181f, 3.296f, 9.155f, 1.617f)
                lineToRelative(1.17f, -0.496f)
                lineToRelative(-0.52f, 1.16f)
                curveToRelative(-1.058f, 2.36f, -3.11f, 3.885f, -5.192f, 4.717f)
                curveToRelative(-1.617f, 0.646f, -3.31f, 0.894f, -4.643f, 0.761f)
                curveToRelative(0.058f, 0.351f, 0.08f, 0.71f, 0.062f, 1.067f)
                arcToRelative(4.82f, 4.82f, 0.0f, false, true, -1.484f, 3.274f)
                curveTo(32.745f, 29.428f, 31.345f, 30.0f, 29.5f, 30.0f)
                horizontalLineToRelative(-14.0f)
                curveToRelative(-1.796f, 0.0f, -3.14f, -0.577f, -4.048f, -1.492f)
                curveToRelative(-0.901f, -0.908f, -1.331f, -2.108f, -1.383f, -3.286f)
                curveToRelative(-0.05f, -1.174f, 0.273f, -2.363f, 0.921f, -3.27f)
                curveToRelative(0.56f, -0.781f, 1.37f, -1.36f, 2.38f, -1.511f)
                curveToRelative(-0.092f, -3.763f, 3.876f, -5.834f, 6.738f, -4.086f)
                curveToRelative(1.708f, -3.208f, 4.979f, -4.005f, 7.613f, -3.05f)
                quadToRelative(0.196f, 0.073f, 0.388f, 0.157f)
                curveToRelative(0.59f, -1.775f, 1.28f, -3.037f, 2.101f, -3.945f)
                curveToRelative(0.914f, -1.01f, 1.958f, -1.55f, 3.111f, -1.895f)
                lineToRelative(1.114f, -0.334f)
                close()
                moveTo(27.38f, 14.257f)
                curveToRelative(-2.323f, -0.843f, -5.237f, -0.084f, -6.622f, 3.056f)
                lineToRelative(-0.266f, 0.602f)
                lineToRelative(-0.509f, -0.417f)
                curveToRelative(-2.288f, -1.874f, -5.998f, -0.09f, -5.587f, 3.354f)
                lineToRelative(0.068f, 0.559f)
                lineTo(13.9f, 21.411f)
                curveToRelative(-0.883f, 0.0f, -1.597f, 0.437f, -2.096f, 1.135f)
                curveToRelative(-0.505f, 0.706f, -0.778f, 1.668f, -0.736f, 2.643f)
                curveToRelative(0.043f, 0.972f, 0.395f, 1.922f, 1.094f, 2.626f)
                curveToRelative(0.692f, 0.698f, 1.767f, 1.196f, 3.338f, 1.197f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.631f, 0.0f, 2.77f, -0.503f, 3.512f, -1.205f)
                arcToRelative(3.81f, 3.81f, 0.0f, false, false, 1.172f, -2.595f)
                curveToRelative(0.047f, -0.952f, -0.242f, -1.882f, -0.8f, -2.553f)
                curveToRelative(-0.549f, -0.66f, -1.373f, -1.091f, -2.464f, -1.048f)
                lineToRelative(-0.698f, 0.027f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.516f, -1.736f, 0.32f, -3.2f, -0.27f, -4.328f)
                curveToRelative(-0.593f, -1.133f, -1.604f, -1.96f, -2.771f, -2.383f)
                moveToRelative(5.186f, -5.269f)
                curveToRelative(-0.59f, 0.286f, -1.125f, 0.67f, -1.615f, 1.211f)
                curveToRelative(-0.722f, 0.799f, -1.372f, 1.972f, -1.947f, 3.758f)
                arcToRelative(5.94f, 5.94f, 0.0f, false, true, 2.033f, 2.22f)
                curveToRelative(0.645f, 1.231f, 0.874f, 2.747f, 0.5f, 4.456f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, true, 2.616f, 1.386f)
                curveToRelative(0.28f, 0.337f, 0.505f, 0.718f, 0.672f, 1.125f)
                curveToRelative(1.147f, 0.21f, 2.861f, 0.041f, 4.568f, -0.64f)
                curveToRelative(1.542f, -0.617f, 3.016f, -1.628f, 4.013f, -3.07f)
                curveToRelative(-3.8f, 1.123f, -7.003f, -0.093f, -9.002f, -2.335f)
                curveToRelative(-1.936f, -2.172f, -2.735f, -5.307f, -1.838f, -8.111f)
            }
        }
            .build()
        return _cloudSnowMoonLarge!!
    }

private var _cloudSnowMoonLarge: ImageVector? = null
