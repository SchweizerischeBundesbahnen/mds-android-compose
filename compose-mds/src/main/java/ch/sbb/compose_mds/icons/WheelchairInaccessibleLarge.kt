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

public val SBBIcons.WheelchairInaccessibleLarge: ImageVector
    get() {
        if (_wheelchairInaccessibleLarge != null) {
            return _wheelchairInaccessibleLarge!!
        }
        _wheelchairInaccessibleLarge = Builder(
            name = "WheelchairInaccessibleLarge",
            defaultWidth =
                48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight =
            48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveToRelative(17.389f, 17.096f)
                lineToRelative(-1.298f, -1.298f)
                lineToRelative(-2.076f, 2.204f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.096f, 0.9f)
                lineToRelative(0.012f, 0.02f)
                lineToRelative(0.01f, 0.021f)
                lineToRelative(1.502f, 3.126f)
                quadToRelative(0.58f, -0.256f, 1.18f, -0.453f)
                lineToRelative(-0.575f, -2.067f)
                arcToRelative(1.22f, 1.22f, 0.0f, false, true, 0.254f, -1.328f)
                close()
                moveTo(2.646f, 2.354f)
                lineTo(15.384f, 15.09f)
                lineToRelative(-2.098f, 2.226f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -0.237f, 2.079f)
                lineToRelative(1.496f, 3.114f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, -5.593f, 6.206f)
                arcTo(12.5f, 12.5f, 0.0f, true, false, 33.0f, 33.5f)
                quadToRelative(0.0f, -0.41f, -0.027f, -0.82f)
                lineToRelative(2.066f, 2.066f)
                lineTo(36.0f, 39.55f)
                lineTo(36.0f, 43.0f)
                horizontalLineToRelative(7.293f)
                lineToRelative(2.354f, 2.354f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-43.0f, -43.0f)
                close()
                moveTo(17.586f, 21.344f)
                quadToRelative(0.207f, -0.05f, 0.414f, -0.091f)
                verticalLineToRelative(-3.351f)
                lineToRelative(-0.98f, 1.015f)
                lineToRelative(-0.004f, 0.004f)
                arcToRelative(0.22f, 0.22f, 0.0f, false, false, -0.043f, 0.248f)
                lineToRelative(0.017f, 0.037f)
                lineToRelative(0.011f, 0.04f)
                close()
                moveTo(19.0f, 21.09f)
                verticalLineToRelative(-2.383f)
                lineToRelative(2.32f, 2.32f)
                arcToRelative(12.49f, 12.49f, 0.0f, false, false, -2.32f, 0.064f)
                moveTo(42.293f, 42.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(39.23f, 40.0f)
                lineToRelative(-0.088f, -0.391f)
                lineToRelative(-0.218f, -0.978f)
                lineToRelative(-2.61f, -2.61f)
                lineToRelative(0.676f, 3.381f)
                lineToRelative(0.01f, 0.048f)
                lineTo(37.0f, 42.0f)
                close()
                moveTo(20.5f, 22.0f)
                quadToRelative(0.986f, 0.0f, 1.958f, 0.165f)
                lineToRelative(1.38f, 1.38f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, false, -2.285f, -0.492f)
                close()
                moveTo(21.553f, 23.053f)
                lineTo(20.5f, 22.0f)
                arcTo(11.5f, 11.5f, 0.0f, true, false, 32.0f, 33.5f)
                lineToRelative(-1.053f, -1.053f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, true, -3.567f, 8.985f)
                arcToRelative(10.5f, 10.5f, 0.0f, true, true, -5.827f, -18.38f)
                moveToRelative(8.17f, 8.17f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 0.137f, 3.905f)
                lineToRelative(-8.237f, -1.884f)
                lineToRelative(5.632f, -4.49f)
                close()
                moveTo(29.723f, 31.222f)
                lineTo(27.255f, 28.754f)
                lineTo(28.23f, 27.976f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 1.493f, 3.246f)
                moveToRelative(-3.18f, -3.18f)
                lineToRelative(0.998f, -0.795f)
                lineToRelative(-1.37f, -1.369f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, -3.394f, -1.602f)
                close()
                moveTo(21.0f, 32.462f)
                lineToRelative(5.543f, -4.419f)
                lineToRelative(-3.766f, -3.766f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 21.0f, 24.013f)
                close()
                moveTo(21.401f, 34.219f)
                lineTo(25.067f, 41.83f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 4.57f, -5.727f)
                close()
                moveTo(20.501f, 34.652f)
                lineTo(24.166f, 42.264f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, -7.332f, 0.0f)
                close()
                moveTo(19.599f, 34.219f)
                lineTo(11.364f, 36.103f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 4.569f, 5.727f)
                close()
                moveTo(11.006f, 33.837f)
                quadToRelative(0.023f, 0.653f, 0.134f, 1.29f)
                lineToRelative(8.236f, -1.883f)
                lineToRelative(-6.608f, -5.264f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, -1.762f, 5.857f)
                moveToRelative(2.386f, -6.64f)
                lineTo(20.0f, 32.464f)
                verticalLineToRelative(-8.45f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, -6.608f, 3.185f)
                moveToRelative(17.555f, 5.25f)
                lineTo(32.0f, 33.5f)
                quadToRelative(0.0f, -0.986f, -0.165f, -1.958f)
                lineToRelative(-1.38f, -1.38f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, true, 0.492f, 2.285f)
                moveTo(20.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                moveToRelative(3.0f, -4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                moveToRelative(12.871f, 24.317f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.959f, -0.317f)
                lineTo(29.5f, 26.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.394f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.494f, 1.95f)
                lineToRelative(1.67f, 7.46f)
                lineToRelative(-0.976f, 0.22f)
                lineToRelative(-1.67f, -7.46f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.54f, -0.853f)
                moveTo(25.341f, 12.0f)
                horizontalLineToRelative(-6.45f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, false, -1.021f, 0.434f)
                lineToRelative(-0.005f, 0.005f)
                lineToRelative(-0.7f, 0.75f)
                lineToRelative(0.73f, 0.682f)
                lineToRelative(0.698f, -0.747f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.296f, -0.124f)
                horizontalLineToRelative(6.451f)
                arcTo(1.66f, 1.66f, 0.0f, false, true, 27.0f, 14.66f)
                verticalLineToRelative(8.84f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-8.84f)
                arcTo(2.66f, 2.66f, 0.0f, false, false, 25.34f, 12.0f)
            }
        }
            .build()
        return _wheelchairInaccessibleLarge!!
    }

private var _wheelchairInaccessibleLarge: ImageVector? = null
