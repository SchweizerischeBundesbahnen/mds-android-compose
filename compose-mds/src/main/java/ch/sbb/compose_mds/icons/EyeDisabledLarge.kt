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

public val SBBIcons.EyeDisabledLarge: ImageVector
    get() {
        if (_eyeDisabledLarge != null) {
            return _eyeDisabledLarge!!
        }
        _eyeDisabledLarge = Builder(name = "EyeDisabledLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(15.85f, 15.557f)
                lineToRelative(2.631f, 2.631f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.31f, 11.31f)
                lineToRelative(2.755f, 2.755f)
                arcToRelative(17.3f, 17.3f, 0.0f, false, true, -8.813f, 2.737f)
                curveToRelative(-4.274f, -0.003f, -8.086f, -2.099f, -11.05f, -4.525f)
                curveToRelative(-2.736f, -2.239f, -4.704f, -4.723f, -5.583f, -5.972f)
                curveToRelative(1.313f, -1.862f, 4.44f, -6.137f, 8.75f, -8.936f)
                moveToRelative(-0.722f, -0.722f)
                lineTo(2.646f, 2.354f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(43.0f, 43.0f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-12.379f, -12.378f)
                arcToRelative(18.3f, 18.3f, 0.0f, false, true, -9.512f, 3.015f)
                horizontalLineToRelative(-0.016f)
                curveToRelative(-4.603f, 0.0f, -8.638f, -2.253f, -11.69f, -4.75f)
                curveToRelative(-3.057f, -2.502f, -5.18f, -5.292f, -5.974f, -6.47f)
                lineToRelative(-0.193f, -0.286f)
                lineToRelative(0.198f, -0.281f)
                lineToRelative(0.008f, -0.011f)
                curveToRelative(0.491f, -0.7f, 1.358f, -1.936f, 2.544f, -3.36f)
                lineTo(6.345f, 18.88f)
                lineToRelative(0.65f, -0.76f)
                lineToRelative(2.288f, 1.953f)
                arcToRelative(35.0f, 35.0f, 0.0f, false, true, 2.803f, -2.859f)
                lineToRelative(-1.973f, -2.266f)
                lineToRelative(0.754f, -0.656f)
                lineToRelative(1.972f, 2.265f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, true, 2.289f, -1.722f)
                moveToRelative(2.602f, 6.025f)
                curveToRelative(0.368f, -0.736f, 0.862f, -1.401f, 1.459f, -1.964f)
                lineToRelative(3.636f, 3.636f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, -0.828f, 0.458f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, true, -0.838f, -0.468f)
                lineToRelative(-0.536f, -0.887f)
                lineToRelative(-0.36f, 0.97f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, false, 6.701f, 4.065f)
                lineToRelative(2.121f, 2.121f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 17.73f, 20.86f)
                moveToRelative(5.458f, 2.73f)
                quadToRelative(0.198f, -0.15f, 0.353f, -0.342f)
                lineToRelative(2.714f, 2.714f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, true, -5.233f, -2.225f)
                lineToRelative(0.005f, 0.003f)
                curveToRelative(0.298f, 0.166f, 0.635f, 0.253f, 0.976f, 0.25f)
                lineToRelative(-0.003f, -0.5f)
                lineToRelative(0.004f, 0.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.184f, -0.4f)
                moveToRelative(17.578f, -5.582f)
                lineToRelative(-2.227f, 2.005f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -2.846f, -2.764f)
                lineToRelative(-0.027f, -0.024f)
                lineToRelative(1.918f, -2.294f)
                lineToRelative(-0.768f, -0.642f)
                lineToRelative(-1.918f, 2.295f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -3.312f, -2.292f)
                lineToRelative(1.424f, -2.624f)
                lineToRelative(-0.88f, -0.476f)
                lineToRelative(-1.422f, 2.621f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, -3.81f, -1.441f)
                lineToRelative(0.592f, -2.923f)
                lineToRelative(-0.98f, -0.198f)
                lineToRelative(-0.592f, 2.921f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, -2.168f, -0.182f)
                horizontalLineToRelative(-0.006f)
                quadToRelative(-0.973f, 0.012f, -1.93f, 0.152f)
                lineTo(21.272f, 9.2f)
                lineToRelative(-0.983f, 0.182f)
                lineToRelative(0.541f, 2.94f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, false, -3.3f, 1.15f)
                lineToRelative(0.44f, 0.898f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, true, 5.783f, -1.379f)
                curveToRelative(4.256f, 0.001f, 8.188f, 2.334f, 11.286f, 5.016f)
                curveToRelative(2.853f, 2.47f, 4.941f, 5.184f, 5.847f, 6.474f)
                arcToRelative(32.5f, 32.5f, 0.0f, false, true, -6.191f, 6.284f)
                lineToRelative(0.61f, 0.792f)
                arcToRelative(33.5f, 33.5f, 0.0f, false, false, 6.599f, -6.771f)
                lineToRelative(0.207f, -0.284f)
                lineToRelative(-0.197f, -0.292f)
                arcToRelative(37.0f, 37.0f, 0.0f, false, false, -2.706f, -3.454f)
                lineToRelative(2.227f, -2.003f)
                close()
                moveTo(21.198f, 17.589f)
                arcToRelative(7.001f, 7.001f, 0.0f, false, true, 9.193f, 9.212f)
                lineToRelative(0.918f, 0.398f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.802f, 16.67f)
                close()
                moveTo(24.308f, 21.027f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, true, 2.645f, 2.646f)
                lineToRelative(0.995f, -0.106f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, -3.534f, -3.534f)
                close()
            }
        }
        .build()
        return _eyeDisabledLarge!!
    }

private var _eyeDisabledLarge: ImageVector? = null
