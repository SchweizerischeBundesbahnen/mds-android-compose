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

public val SBBIcons.DinosaurSmall: ImageVector
    get() {
        if (_dinosaurSmall != null) {
            return _dinosaurSmall!!
        }
        _dinosaurSmall = Builder(name = "DinosaurSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 4.0f)
                curveToRelative(0.773f, 0.0f, 1.38f, 0.316f, 1.794f, 0.8f)
                curveToRelative(0.404f, 0.472f, 0.606f, 1.082f, 0.642f, 1.669f)
                curveToRelative(0.037f, 0.584f, -0.088f, 1.196f, -0.399f, 1.677f)
                curveToRelative(-0.32f, 0.497f, -0.844f, 0.854f, -1.537f, 0.854f)
                horizontalLineToRelative(-2.11f)
                curveToRelative(-0.343f, 1.174f, -1.081f, 2.059f, -1.665f, 2.908f)
                curveToRelative(-0.66f, 0.96f, -1.225f, 1.986f, -1.225f, 3.592f)
                lineTo(16.0f, 20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.894f, 0.686f, -3.119f, 1.4f, -4.158f)
                curveToRelative(0.727f, -1.056f, 1.386f, -1.819f, 1.61f, -2.94f)
                lineTo(18.09f, 8.0f)
                lineTo(21.0f, 8.0f)
                curveToRelative(0.307f, 0.0f, 0.534f, -0.143f, 0.697f, -0.396f)
                curveToRelative(0.173f, -0.269f, 0.267f, -0.657f, 0.242f, -1.073f)
                curveToRelative(-0.026f, -0.413f, -0.168f, -0.803f, -0.405f, -1.08f)
                curveTo(21.307f, 5.184f, 20.977f, 5.0f, 20.5f, 5.0f)
                curveToRelative(-0.913f, 0.0f, -1.814f, 0.227f, -2.66f, 0.791f)
                curveToRelative(-0.85f, 0.566f, -1.672f, 1.492f, -2.393f, 2.933f)
                curveToRelative(-0.485f, 0.97f, -0.906f, 1.834f, -1.634f, 2.417f)
                curveToRelative(-0.755f, 0.603f, -1.767f, 0.859f, -3.313f, 0.859f)
                curveToRelative(-1.283f, 0.0f, -2.408f, 0.742f, -3.63f, 2.086f)
                curveToRelative(-0.959f, 1.055f, -1.91f, 2.398f, -3.007f, 3.904f)
                quadToRelative(0.421f, -0.19f, 0.788f, -0.375f)
                curveTo(5.241f, 17.32f, 5.857f, 17.0f, 6.5f, 17.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(-1.9f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.901f, 0.41f)
                curveToRelative(-0.627f, 0.313f, -1.42f, 0.71f, -2.478f, 0.975f)
                lineToRelative(-1.366f, 0.341f)
                lineTo(2.1f, 18.7f)
                curveToRelative(1.474f, -1.965f, 2.76f, -3.888f, 4.03f, -5.286f)
                curveTo(7.408f, 12.01f, 8.783f, 11.0f, 10.5f, 11.0f)
                curveToRelative(1.454f, 0.0f, 2.192f, -0.244f, 2.688f, -0.64f)
                curveToRelative(0.521f, -0.418f, 0.85f, -1.054f, 1.365f, -2.084f)
                curveToRelative(0.78f, -1.559f, 1.707f, -2.633f, 2.732f, -3.317f)
                arcTo(5.7f, 5.7f, 0.0f, false, true, 20.5f, 4.0f)
                moveToRelative(-8.0f, 11.0f)
                curveToRelative(0.207f, 0.0f, 0.627f, -0.016f, 0.965f, 0.209f)
                curveToRelative(0.394f, 0.263f, 0.535f, 0.725f, 0.535f, 1.291f)
                lineTo(14.0f, 20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.212f, -0.027f, -0.333f, -0.052f, -0.396f)
                curveToRelative(-0.02f, -0.055f, -0.038f, -0.063f, -0.038f, -0.063f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.11f, -0.03f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.3f, -0.011f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.132f, 0.0f, -0.222f, 0.001f, -0.3f, 0.012f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.11f, 0.029f)
                reflectiveCurveToRelative(-0.017f, 0.008f, -0.038f, 0.063f)
                arcTo(1.1f, 1.1f, 0.0f, false, false, 9.0f, 16.5f)
                lineTo(9.0f, 20.0f)
                lineTo(8.0f, 20.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.566f, 0.141f, -1.028f, 0.535f, -1.291f)
                curveToRelative(0.338f, -0.225f, 0.758f, -0.209f, 0.965f, -0.209f)
                close()
                moveTo(19.5f, 6.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
            }
        }
        .build()
        return _dinosaurSmall!!
    }

private var _dinosaurSmall: ImageVector? = null
