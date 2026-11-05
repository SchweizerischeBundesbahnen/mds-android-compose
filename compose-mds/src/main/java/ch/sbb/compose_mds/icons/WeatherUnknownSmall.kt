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

public val SBBIcons.WeatherUnknownSmall: ImageVector
    get() {
        if (_weatherUnknownSmall != null) {
            return _weatherUnknownSmall!!
        }
        _weatherUnknownSmall = Builder(name = "WeatherUnknownSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.907f, 17.0f)
                horizontalLineToRelative(-0.881f)
                verticalLineToRelative(-0.838f)
                horizontalLineToRelative(0.88f)
                close()
                moveTo(11.519f, 10.972f)
                quadToRelative(0.826f, 0.0f, 1.316f, 0.463f)
                quadToRelative(0.456f, 0.428f, 0.456f, 1.124f)
                quadToRelative(0.0f, 0.576f, -0.31f, 0.992f)
                quadToRelative(-0.138f, 0.189f, -0.664f, 0.697f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.324f, 0.368f)
                quadToRelative(-0.09f, 0.148f, -0.127f, 0.364f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.041f, 0.565f)
                horizontalLineToRelative(-0.694f)
                quadToRelative(0.008f, -0.617f, 0.111f, -0.915f)
                quadToRelative(0.074f, -0.218f, 0.21f, -0.39f)
                quadToRelative(0.135f, -0.174f, 0.605f, -0.65f)
                quadToRelative(0.3f, -0.304f, 0.395f, -0.55f)
                quadToRelative(0.076f, -0.21f, 0.077f, -0.428f)
                arcToRelative(1.03f, 1.03f, 0.0f, false, false, -0.224f, -0.677f)
                quadToRelative(-0.27f, -0.335f, -0.795f, -0.335f)
                quadToRelative(-1.087f, 0.0f, -1.173f, 1.322f)
                horizontalLineToRelative(-0.701f)
                quadToRelative(0.029f, -0.75f, 0.297f, -1.16f)
                quadToRelative(0.249f, -0.38f, 0.66f, -0.585f)
                reflectiveQuadToRelative(0.926f, -0.205f)
                moveToRelative(-1.33f, -3.329f)
                curveToRelative(0.948f, -1.553f, 2.633f, -1.937f, 4.002f, -1.437f)
                curveToRelative(1.375f, 0.502f, 2.408f, 1.885f, 2.119f, 3.73f)
                curveToRelative(0.416f, 0.099f, 0.768f, 0.312f, 1.04f, 0.607f)
                curveToRelative(0.39f, 0.425f, 0.598f, 0.99f, 0.641f, 1.557f)
                curveToRelative(0.086f, 1.121f, -0.468f, 2.43f, -1.815f, 2.875f)
                lineToRelative(-0.312f, -0.95f)
                curveToRelative(0.802f, -0.265f, 1.19f, -1.063f, 1.13f, -1.849f)
                curveToRelative(-0.03f, -0.386f, -0.168f, -0.725f, -0.38f, -0.955f)
                curveToRelative(-0.201f, -0.219f, -0.49f, -0.363f, -0.894f, -0.347f)
                lineToRelative(-0.697f, 0.028f)
                lineToRelative(0.197f, -0.67f)
                curveToRelative(0.473f, -1.603f, -0.33f, -2.706f, -1.372f, -3.087f)
                curveToRelative(-1.05f, -0.383f, -2.368f, -0.047f, -3.007f, 1.41f)
                lineToRelative(-0.458f, -0.201f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.458f, 0.2f)
                lineToRelative(-0.266f, 0.607f)
                lineToRelative(-0.51f, -0.421f)
                curveToRelative(-0.964f, -0.795f, -2.577f, -0.055f, -2.396f, 1.473f)
                lineToRelative(-0.496f, 0.059f)
                lineToRelative(0.496f, -0.059f)
                lineToRelative(0.067f, 0.56f)
                horizontalLineToRelative(-0.563f)
                curveToRelative(-0.589f, 0.0f, -1.082f, 0.538f, -1.163f, 1.354f)
                curveToRelative(-0.077f, 0.781f, 0.27f, 1.57f, 1.126f, 1.863f)
                lineToRelative(-0.322f, 0.946f)
                curveToRelative(-1.402f, -0.478f, -1.91f, -1.785f, -1.8f, -2.906f)
                curveToRelative(0.093f, -0.935f, 0.652f, -1.933f, 1.645f, -2.192f)
                curveToRelative(0.092f, -1.862f, 2.008f, -2.923f, 3.53f, -2.196f)
            }
        }
        .build()
        return _weatherUnknownSmall!!
    }

private var _weatherUnknownSmall: ImageVector? = null
