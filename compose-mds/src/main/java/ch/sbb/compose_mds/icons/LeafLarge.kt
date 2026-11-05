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
                lineToRelative(-0.277f, 0.416f)
                lineToRelative(-0.277f, -0.416f)
                lineToRelative(0.277f, -0.185f)
                close()
                moveTo(36.668f, 26.036f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -1.98f, 2.204f)
                arcToRelative(12.9f, 12.9f, 0.0f, false, true, 4.181f, 2.914f)
                lineToRelative(0.305f, 0.32f)
                lineToRelative(-0.278f, 0.341f)
                curveToRelative(-1.875f, 2.308f, -7.29f, 5.05f, -14.873f, 1.497f)
                lineToRelative(0.012f, 6.687f)
                lineToRelative(-1.0f, 0.002f)
                lineToRelative(-0.012f, -6.706f)
                curveToRelative(-7.603f, 3.579f, -13.032f, 0.831f, -14.91f, -1.48f)
                lineToRelative(-0.28f, -0.342f)
                lineToRelative(0.306f, -0.319f)
                arcToRelative(12.9f, 12.9f, 0.0f, false, true, 4.181f, -2.914f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -1.98f, -2.204f)
                curveToRelative(-1.19f, -1.562f, -2.145f, -3.411f, -2.334f, -5.49f)
                lineToRelative(-0.032f, -0.352f)
                lineToRelative(0.32f, -0.148f)
                curveToRelative(1.946f, -0.901f, 4.321f, -0.905f, 6.157f, -0.707f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, 2.662f, 0.464f)
                curveToRelative(0.376f, -3.732f, 1.673f, -6.496f, 2.979f, -8.4f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 2.134f, -2.496f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, 0.919f, -0.766f)
                lineToRelative(0.057f, -0.04f)
                lineToRelative(0.017f, -0.012f)
                lineToRelative(0.005f, -0.003f)
                lineToRelative(0.002f, -0.001f)
                lineToRelative(0.278f, 0.415f)
                lineToRelative(0.278f, -0.416f)
                lineToRelative(0.002f, 0.002f)
                lineToRelative(0.005f, 0.003f)
                lineToRelative(0.016f, 0.012f)
                lineToRelative(0.058f, 0.04f)
                quadToRelative(0.075f, 0.053f, 0.206f, 0.155f)
                curveToRelative(0.175f, 0.136f, 0.42f, 0.338f, 0.713f, 0.61f)
                curveToRelative(0.585f, 0.545f, 1.36f, 1.369f, 2.134f, 2.497f)
                curveToRelative(1.306f, 1.904f, 2.603f, 4.668f, 2.98f, 8.4f)
                quadToRelative(0.156f, -0.038f, 0.346f, -0.08f)
                curveToRelative(0.578f, -0.13f, 1.388f, -0.284f, 2.315f, -0.384f)
                curveToRelative(1.836f, -0.198f, 4.211f, -0.194f, 6.157f, 0.707f)
                lineToRelative(0.32f, 0.148f)
                lineToRelative(-0.032f, 0.351f)
                curveToRelative(-0.19f, 2.08f, -1.145f, 3.93f, -2.334f, 5.49f)
                moveToRelative(-3.848f, 3.852f)
                curveToRelative(0.339f, -0.276f, 0.695f, -0.576f, 1.06f, -0.9f)
                curveToRelative(1.47f, 0.574f, 2.809f, 1.435f, 3.941f, 2.53f)
                curveToRelative(-1.867f, 1.913f, -6.783f, 4.162f, -13.8f, 0.683f)
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
                lineToRelative(0.003f, 1.407f)
                curveToRelative(-7.035f, 3.503f, -11.963f, 1.25f, -13.834f, -0.665f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 3.941f, -2.53f)
                quadToRelative(0.55f, 0.485f, 1.06f, 0.9f)
                lineToRelative(0.632f, -0.776f)
                curveToRelative(-1.186f, -0.967f, -2.563f, -2.211f, -3.684f, -3.683f)
                curveToRelative(-1.048f, -1.376f, -1.856f, -2.928f, -2.093f, -4.618f)
                curveToRelative(1.64f, -0.647f, 3.633f, -0.659f, 5.3f, -0.479f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 2.692f, 0.48f)
                quadToRelative(-0.03f, 0.58f, -0.031f, 1.187f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -4.64f, 1.462f, -7.918f, 2.912f, -10.031f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 1.99f, -2.33f)
                curveToRelative(0.243f, -0.225f, 0.448f, -0.396f, 0.598f, -0.515f)
                curveToRelative(0.15f, 0.119f, 0.355f, 0.29f, 0.597f, 0.515f)
                curveToRelative(0.54f, 0.502f, 1.264f, 1.27f, 1.99f, 2.33f)
                curveToRelative(1.45f, 2.113f, 2.913f, 5.391f, 2.913f, 10.031f)
                horizontalLineToRelative(1.0f)
                quadToRelative(0.0f, -0.607f, -0.031f, -1.186f)
                quadToRelative(0.2f, -0.051f, 0.487f, -0.116f)
                curveToRelative(0.55f, -0.123f, 1.323f, -0.27f, 2.204f, -0.365f)
                curveToRelative(1.668f, -0.18f, 3.662f, -0.168f, 5.3f, 0.48f)
                curveToRelative(-0.236f, 1.69f, -1.044f, 3.24f, -2.092f, 4.617f)
                curveToRelative(-1.121f, 1.472f, -2.498f, 2.716f, -3.684f, 3.683f)
                close()
            }
        }
        .build()
        return _leafLarge!!
    }

private var _leafLarge: ImageVector? = null
