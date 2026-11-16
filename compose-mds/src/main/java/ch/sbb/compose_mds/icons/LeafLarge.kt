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

public val SBBIcons.LeafLarge: ImageVector
    get() {
        if (_leafLarge != null) {
            return _leafLarge!!
        }
        _leafLarge = Builder(name = "LeafLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(23.781f, 8.084f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(0.002f, 0.001f)
                lineToRelative(0.002f, 0.001f)
                lineToRelative(0.003f, 0.002f)
                lineToRelative(0.017f, 0.012f)
                lineToRelative(0.057f, 0.04f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.206f, 0.155f)
                curveToRelative(0.175f, 0.136f, 0.42f, 0.338f, 0.713f, 0.61f)
                curveToRelative(0.585f, 0.545f, 1.36f, 1.369f, 2.134f, 2.496f)
                curveToRelative(1.306f, 1.904f, 2.603f, 4.669f, 2.98f, 8.4f)
                quadToRelative(0.156f, -0.038f, 0.346f, -0.08f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, 2.315f, -0.383f)
                curveToRelative(1.836f, -0.198f, 4.212f, -0.194f, 6.158f, 0.707f)
                lineToRelative(0.32f, 0.148f)
                lineToRelative(-0.033f, 0.351f)
                curveToRelative(-0.19f, 2.08f, -1.144f, 3.93f, -2.334f, 5.491f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -1.98f, 2.204f)
                arcToRelative(12.9f, 12.9f, 0.0f, false, true, 4.181f, 2.914f)
                lineToRelative(0.305f, 0.319f)
                lineToRelative(-0.279f, 0.343f)
                curveToRelative(-1.875f, 2.307f, -7.29f, 5.049f, -14.872f, 1.496f)
                lineToRelative(0.012f, 6.687f)
                lineToRelative(-1.0f, 0.002f)
                lineToRelative(-0.012f, -6.707f)
                curveToRelative(-7.603f, 3.58f, -13.032f, 0.832f, -14.91f, -1.478f)
                lineToRelative(-0.279f, -0.343f)
                lineToRelative(0.305f, -0.319f)
                arcToRelative(12.9f, 12.9f, 0.0f, false, true, 4.181f, -2.914f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -1.98f, -2.204f)
                curveToRelative(-1.115f, -1.464f, -2.024f, -3.18f, -2.29f, -5.103f)
                lineToRelative(-0.044f, -0.388f)
                lineToRelative(-0.033f, -0.35f)
                lineToRelative(0.32f, -0.149f)
                curveToRelative(1.947f, -0.901f, 4.322f, -0.905f, 6.158f, -0.707f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, 2.662f, 0.464f)
                curveToRelative(0.376f, -3.733f, 1.673f, -6.497f, 2.979f, -8.4f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 2.134f, -2.497f)
                curveToRelative(0.292f, -0.272f, 0.538f, -0.474f, 0.713f, -0.61f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.263f, -0.195f)
                lineToRelative(0.017f, -0.012f)
                lineToRelative(0.003f, -0.002f)
                horizontalLineToRelative(0.002f)
                lineToRelative(0.002f, -0.002f)
                lineToRelative(0.278f, -0.185f)
                close()
                moveTo(32.821f, 29.888f)
                curveToRelative(0.338f, -0.276f, 0.694f, -0.576f, 1.058f, -0.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 3.94f, 2.53f)
                curveToRelative(-1.868f, 1.912f, -6.782f, 4.162f, -13.798f, 0.683f)
                lineToRelative(-0.003f, -1.443f)
                lineToRelative(5.763f, -3.842f)
                lineToRelative(-0.554f, -0.832f)
                lineToRelative(-5.211f, 3.474f)
                lineToRelative(-0.012f, -6.559f)
                lineToRelative(-1.0f, 0.002f)
                lineToRelative(0.012f, 6.573f)
                lineToRelative(-5.235f, -3.49f)
                lineToRelative(-0.554f, 0.832f)
                lineToRelative(5.791f, 3.861f)
                lineToRelative(0.003f, 1.408f)
                curveToRelative(-7.034f, 3.502f, -11.96f, 1.248f, -13.832f, -0.667f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 3.94f, -2.53f)
                curveToRelative(0.364f, 0.324f, 0.72f, 0.624f, 1.058f, 0.9f)
                lineToRelative(0.633f, -0.775f)
                curveToRelative(-1.186f, -0.966f, -2.563f, -2.211f, -3.684f, -3.683f)
                curveToRelative(-1.049f, -1.376f, -1.856f, -2.928f, -2.093f, -4.618f)
                curveToRelative(1.639f, -0.647f, 3.633f, -0.659f, 5.3f, -0.479f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 2.692f, 0.481f)
                quadToRelative(-0.03f, 0.579f, -0.031f, 1.186f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -4.64f, 1.462f, -7.917f, 2.912f, -10.031f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 1.991f, -2.33f)
                curveToRelative(0.242f, -0.225f, 0.447f, -0.395f, 0.597f, -0.514f)
                curveToRelative(0.15f, 0.12f, 0.355f, 0.29f, 0.597f, 0.514f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 1.99f, 2.33f)
                curveToRelative(1.45f, 2.114f, 2.913f, 5.391f, 2.913f, 10.031f)
                horizontalLineToRelative(1.0f)
                quadToRelative(0.0f, -0.607f, -0.031f, -1.186f)
                quadToRelative(0.2f, -0.05f, 0.487f, -0.116f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 2.204f, -0.365f)
                curveToRelative(1.668f, -0.18f, 3.661f, -0.168f, 5.3f, 0.479f)
                curveToRelative(-0.237f, 1.69f, -1.044f, 3.241f, -2.092f, 4.618f)
                curveToRelative(-1.121f, 1.472f, -2.498f, 2.717f, -3.684f, 3.683f)
                close()
            }
        }
        .build()
        return _leafLarge!!
    }

private var _leafLarge: ImageVector? = null
