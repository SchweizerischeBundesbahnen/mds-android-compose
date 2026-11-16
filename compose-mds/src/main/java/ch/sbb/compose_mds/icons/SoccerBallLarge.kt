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
                moveToRelative(41.993f, 24.49f)
                lineToRelative(-5.356f, -3.893f)
                lineToRelative(-4.735f, 1.868f)
                lineToRelative(-2.517f, 7.749f)
                lineToRelative(2.918f, 3.69f)
                horizontalLineToRelative(6.627f)
                arcToRelative(17.4f, 17.4f, 0.0f, false, false, 3.063f, -9.415f)
                moveToRelative(0.97f, 0.703f)
                curveTo(42.346f, 34.854f, 34.315f, 42.5f, 24.5f, 42.5f)
                curveToRelative(-9.819f, 0.0f, -17.851f, -7.65f, -18.463f, -17.314f)
                lineToRelative(-0.014f, 0.01f)
                lineToRelative(-0.004f, -0.355f)
                arcTo(19.0f, 19.0f, 0.0f, false, true, 6.0f, 24.0f)
                curveTo(6.0f, 13.783f, 14.283f, 5.5f, 24.5f, 5.5f)
                reflectiveCurveTo(43.0f, 13.783f, 43.0f, 24.0f)
                quadToRelative(0.0f, 0.436f, -0.02f, 0.868f)
                lineToRelative(-0.004f, 0.335f)
                close()
                moveTo(41.984f, 23.244f)
                arcToRelative(17.4f, 17.4f, 0.0f, false, false, -2.896f, -8.915f)
                lineToRelative(-1.792f, 5.51f)
                close()
                moveTo(38.364f, 13.319f)
                arcToRelative(17.54f, 17.54f, 0.0f, false, false, -7.992f, -5.81f)
                lineTo(25.0f, 11.411f)
                verticalLineToRelative(5.333f)
                lineToRelative(6.572f, 4.775f)
                lineToRelative(4.734f, -1.867f)
                lineToRelative(0.733f, -2.256f)
                close()
                moveTo(29.186f, 7.133f)
                arcTo(17.5f, 17.5f, 0.0f, false, false, 24.5f, 6.5f)
                curveToRelative(-1.623f, 0.0f, -3.195f, 0.221f, -4.686f, 0.634f)
                lineToRelative(4.686f, 3.404f)
                close()
                moveTo(18.629f, 7.508f)
                arcToRelative(17.54f, 17.54f, 0.0f, false, false, -8.0f, 5.82f)
                lineToRelative(0.478f, 1.468f)
                lineToRelative(1.577f, 4.856f)
                lineToRelative(4.744f, 1.867f)
                lineTo(24.0f, 16.745f)
                verticalLineToRelative(-5.334f)
                close()
                moveTo(9.906f, 14.338f)
                arcToRelative(17.4f, 17.4f, 0.0f, false, false, -2.89f, 8.9f)
                lineToRelative(4.676f, -3.4f)
                close()
                moveTo(7.006f, 24.481f)
                lineTo(8.247f, 23.579f)
                lineTo(12.353f, 20.596f)
                lineTo(17.098f, 22.464f)
                lineTo(19.615f, 30.214f)
                lineTo(16.703f, 33.898f)
                horizontalLineToRelative(-6.636f)
                arcToRelative(17.4f, 17.4f, 0.0f, false, true, -3.06f, -9.417f)
                moveToRelative(3.802f, 10.417f)
                arcToRelative(17.54f, 17.54f, 0.0f, false, false, 7.56f, 5.496f)
                lineTo(16.581f, 34.9f)
                close()
                moveTo(19.549f, 40.788f)
                curveToRelative(1.57f, 0.463f, 3.232f, 0.711f, 4.952f, 0.711f)
                curveToRelative(1.724f, 0.0f, 3.389f, -0.25f, 4.962f, -0.713f)
                lineToRelative(2.04f, -6.283f)
                lineToRelative(-2.918f, -3.689f)
                horizontalLineToRelative(-8.169f)
                lineTo(17.504f, 34.5f)
                close()
                moveTo(30.643f, 40.391f)
                arcToRelative(17.54f, 17.54f, 0.0f, false, false, 7.546f, -5.488f)
                horizontalLineToRelative(-5.764f)
                close()
                moveTo(18.086f, 22.276f)
                lineToRelative(2.451f, 7.54f)
                horizontalLineToRelative(7.926f)
                lineToRelative(2.45f, -7.54f)
                lineToRelative(-6.413f, -4.659f)
                close()
            }
        }
        .build()
        return _soccerBallLarge!!
    }

private var _soccerBallLarge: ImageVector? = null
