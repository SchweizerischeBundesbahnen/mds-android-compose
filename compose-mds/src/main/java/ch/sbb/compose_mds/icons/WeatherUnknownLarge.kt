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

public val SBBIcons.WeatherUnknownLarge: ImageVector
    get() {
        if (_weatherUnknownLarge != null) {
            return _weatherUnknownLarge!!
        }
        _weatherUnknownLarge = Builder(name = "WeatherUnknownLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.312f, 34.497f)
                horizontalLineToRelative(-1.76f)
                verticalLineToRelative(-1.676f)
                horizontalLineToRelative(1.76f)
                close()
                moveTo(23.538f, 22.443f)
                quadToRelative(1.653f, 0.0f, 2.632f, 0.926f)
                quadToRelative(0.912f, 0.856f, 0.912f, 2.248f)
                quadToRelative(0.0f, 1.152f, -0.62f, 1.985f)
                quadToRelative(-0.276f, 0.376f, -1.328f, 1.391f)
                quadToRelative(-0.462f, 0.445f, -0.648f, 0.737f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -0.256f, 0.73f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, -0.082f, 1.13f)
                horizontalLineToRelative(-1.386f)
                quadToRelative(0.017f, -1.234f, 0.222f, -1.83f)
                quadToRelative(0.146f, -0.438f, 0.418f, -0.783f)
                quadToRelative(0.273f, -0.346f, 1.212f, -1.297f)
                quadToRelative(0.6f, -0.61f, 0.79f, -1.103f)
                quadToRelative(0.154f, -0.42f, 0.154f, -0.855f)
                quadToRelative(0.001f, -0.806f, -0.448f, -1.353f)
                quadToRelative(-0.538f, -0.67f, -1.59f, -0.67f)
                quadToRelative(-2.175f, 0.001f, -2.346f, 2.645f)
                horizontalLineToRelative(-1.401f)
                quadToRelative(0.056f, -1.5f, 0.593f, -2.323f)
                arcToRelative(3.34f, 3.34f, 0.0f, false, true, 1.32f, -1.168f)
                quadToRelative(0.824f, -0.41f, 1.852f, -0.41f)
                moveToRelative(-2.465f, -5.982f)
                curveToRelative(1.712f, -3.237f, 4.993f, -4.045f, 7.637f, -3.08f)
                curveToRelative(2.649f, 0.968f, 4.63f, 3.702f, 3.825f, 7.392f)
                curveToRelative(0.947f, 0.106f, 1.723f, 0.53f, 2.297f, 1.154f)
                curveToRelative(0.692f, 0.752f, 1.072f, 1.768f, 1.152f, 2.811f)
                curveToRelative(0.16f, 2.075f, -0.866f, 4.438f, -3.288f, 5.237f)
                lineToRelative(-0.157f, -0.475f)
                lineToRelative(-0.156f, -0.476f)
                curveToRelative(1.877f, -0.619f, 2.738f, -2.469f, 2.604f, -4.209f)
                curveToRelative(-0.066f, -0.863f, -0.378f, -1.655f, -0.89f, -2.212f)
                curveToRelative(-0.503f, -0.546f, -1.222f, -0.892f, -2.178f, -0.854f)
                lineToRelative(-0.696f, 0.028f)
                lineToRelative(0.197f, -0.669f)
                curveToRelative(1.025f, -3.472f, -0.732f, -5.939f, -3.053f, -6.787f)
                curveToRelative(-2.328f, -0.85f, -5.252f, -0.085f, -6.643f, 3.09f)
                lineToRelative(-0.266f, 0.606f)
                lineToRelative(-0.51f, -0.421f)
                curveToRelative(-2.289f, -1.887f, -6.02f, -0.097f, -5.606f, 3.392f)
                lineToRelative(0.066f, 0.56f)
                horizontalLineToRelative(-0.562f)
                curveToRelative(-1.542f, 0.0f, -2.65f, 1.392f, -2.823f, 3.16f)
                curveToRelative(-0.171f, 1.732f, 0.602f, 3.568f, 2.587f, 4.246f)
                lineToRelative(-0.16f, 0.474f)
                lineToRelative(-0.162f, 0.472f)
                curveToRelative(-2.53f, -0.864f, -3.465f, -3.217f, -3.26f, -5.29f)
                curveToRelative(0.184f, -1.872f, 1.339f, -3.734f, 3.285f, -4.023f)
                curveToRelative(-0.092f, -3.792f, 3.886f, -5.893f, 6.76f, -4.126f)
            }
        }
        .build()
        return _weatherUnknownLarge!!
    }

private var _weatherUnknownLarge: ImageVector? = null
