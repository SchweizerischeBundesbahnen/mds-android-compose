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

public val SBBIcons.SoccerBallLarge: ImageVector
    get() {
        if (_soccerBallLarge != null) {
            return _soccerBallLarge!!
        }
        _soccerBallLarge = Builder(name = "SoccerBallLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.814f, 7.134f)
                arcTo(17.5f, 17.5f, 0.0f, false, true, 24.5f, 6.5f)
                curveToRelative(1.623f, 0.0f, 3.195f, 0.221f, 4.686f, 0.635f)
                lineTo(24.5f, 10.539f)
                close()
                moveTo(18.628f, 7.509f)
                arcToRelative(17.54f, 17.54f, 0.0f, false, false, -7.999f, 5.82f)
                lineToRelative(2.055f, 6.323f)
                lineToRelative(4.744f, 1.868f)
                lineTo(24.0f, 16.745f)
                verticalLineToRelative(-5.333f)
                close()
                moveTo(9.906f, 14.339f)
                arcToRelative(17.4f, 17.4f, 0.0f, false, false, -2.89f, 8.9f)
                lineToRelative(4.677f, -3.4f)
                close()
                moveTo(6.02f, 24.851f)
                lineToRelative(0.005f, 0.345f)
                lineToRelative(0.013f, -0.01f)
                curveTo(6.65f, 34.85f, 14.681f, 42.5f, 24.5f, 42.5f)
                curveToRelative(9.816f, 0.0f, 17.847f, -7.646f, 18.462f, -17.307f)
                lineToRelative(0.014f, 0.01f)
                lineToRelative(0.004f, -0.33f)
                quadTo(43.0f, 24.438f, 43.0f, 24.0f)
                curveToRelative(0.0f, -10.217f, -8.283f, -18.5f, -18.5f, -18.5f)
                reflectiveCurveTo(6.0f, 13.783f, 6.0f, 24.0f)
                quadToRelative(0.0f, 0.428f, 0.02f, 0.85f)
                moveToRelative(35.965f, -1.605f)
                arcToRelative(17.4f, 17.4f, 0.0f, false, false, -2.896f, -8.916f)
                lineToRelative(-1.791f, 5.51f)
                close()
                moveTo(38.365f, 13.319f)
                arcToRelative(17.54f, 17.54f, 0.0f, false, false, -7.992f, -5.81f)
                lineTo(25.0f, 11.411f)
                verticalLineToRelative(5.333f)
                lineToRelative(6.572f, 4.775f)
                lineToRelative(4.734f, -1.867f)
                close()
                moveTo(41.995f, 24.489f)
                lineTo(36.638f, 20.596f)
                lineTo(31.904f, 22.464f)
                lineTo(29.386f, 30.214f)
                lineTo(32.304f, 33.904f)
                horizontalLineToRelative(6.627f)
                arcToRelative(17.4f, 17.4f, 0.0f, false, false, 3.063f, -9.416f)
                moveToRelative(-3.806f, 10.414f)
                horizontalLineToRelative(-5.764f)
                lineToRelative(-1.782f, 5.488f)
                arcToRelative(17.54f, 17.54f, 0.0f, false, false, 7.546f, -5.488f)
                moveToRelative(-8.726f, 5.883f)
                lineToRelative(2.04f, -6.283f)
                lineToRelative(-2.917f, -3.689f)
                horizontalLineToRelative(-8.17f)
                lineToRelative(-2.912f, 3.684f)
                lineToRelative(2.044f, 6.29f)
                curveToRelative(1.57f, 0.463f, 3.233f, 0.711f, 4.953f, 0.711f)
                curveToRelative(1.724f, 0.0f, 3.389f, -0.25f, 4.962f, -0.713f)
                moveToRelative(-11.095f, -0.392f)
                lineTo(16.582f, 34.9f)
                horizontalLineToRelative(-5.774f)
                arcToRelative(17.54f, 17.54f, 0.0f, false, false, 7.56f, 5.496f)
                moveToRelative(-8.3f, -6.496f)
                arcToRelative(17.4f, 17.4f, 0.0f, false, true, -3.06f, -9.417f)
                lineToRelative(5.346f, -3.885f)
                lineToRelative(4.744f, 1.868f)
                lineToRelative(2.519f, 7.75f)
                lineToRelative(-2.913f, 3.684f)
                close()
                moveTo(18.088f, 22.278f)
                lineTo(20.538f, 29.816f)
                horizontalLineToRelative(7.926f)
                lineToRelative(2.45f, -7.538f)
                lineToRelative(-6.413f, -4.659f)
                close()
            }
        }
        .build()
        return _soccerBallLarge!!
    }

private var _soccerBallLarge: ImageVector? = null
