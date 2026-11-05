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

public val SBBIcons.HandFingersSnapMedium: ImageVector
    get() {
        if (_handFingersSnapMedium != null) {
            return _handFingersSnapMedium!!
        }
        _handFingersSnapMedium = Builder(
            name = "HandFingersSnapMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(17.75f, 10.5f)
                lineTo(17.75f, 3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(28.035f, 8.834f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.829f, -0.002f)
                lineToRelative(-8.954f, 8.731f)
                lineToRelative(0.002f, -3.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.002f, -2.003f)
                curveToRelative(-0.555f, 0.0f, -1.005f, 0.21f, -1.342f, 0.577f)
                curveToRelative(-0.32f, 0.348f, -0.515f, 0.81f, -0.642f, 1.294f)
                lineToRelative(-3.0f, 10.491f)
                lineToRelative(-0.078f, 0.274f)
                lineToRelative(0.196f, 0.207f)
                lineToRelative(7.432f, 7.878f)
                lineToRelative(0.205f, 0.217f)
                lineToRelative(0.289f, -0.077f)
                lineToRelative(-0.13f, -0.483f)
                lineToRelative(0.13f, 0.483f)
                horizontalLineToRelative(0.002f)
                lineToRelative(0.003f, -0.002f)
                lineToRelative(0.009f, -0.002f)
                lineToRelative(0.029f, -0.008f)
                lineToRelative(0.1f, -0.032f)
                quadToRelative(0.131f, -0.041f, 0.366f, -0.132f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.294f, -0.609f)
                curveToRelative(1.082f, -0.586f, 2.553f, -1.57f, 4.147f, -3.164f)
                arcToRelative(3169.0f, 3169.0f, 0.0f, false, true, 3.571f, -3.565f)
                lineToRelative(0.11f, -0.11f)
                lineToRelative(0.024f, -0.024f)
                lineToRelative(0.006f, -0.005f)
                lineToRelative(0.001f, -0.001f)
                lineToRelative(0.002f, -0.002f)
                arcToRelative(2.002f, 2.002f, 0.0f, false, false, -0.912f, -3.354f)
                arcToRelative(2.005f, 2.005f, 0.0f, false, false, -0.148f, -2.665f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.907f, -0.52f)
                curveToRelative(0.621f, -0.786f, 0.57f, -1.93f, -0.155f, -2.657f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.896f, -0.518f)
                lineToRelative(4.077f, -4.076f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -2.831f)
                moveToRelative(-10.578f, 23.17f)
                lineToRelative(-0.13f, 0.049f)
                lineToRelative(-7.019f, -7.44f)
                lineToRelative(2.924f, -10.223f)
                lineToRelative(0.003f, -0.011f)
                curveToRelative(0.106f, -0.41f, 0.247f, -0.696f, 0.41f, -0.875f)
                arcToRelative(0.77f, 0.77f, 0.0f, false, true, 0.607f, -0.254f)
                curveToRelative(0.553f, 0.0f, 1.002f, 0.448f, 1.002f, 1.003f)
                lineToRelative(-0.003f, 4.497f)
                verticalLineToRelative(1.186f)
                lineToRelative(0.849f, -0.828f)
                lineToRelative(9.807f, -9.563f)
                lineToRelative(0.005f, -0.005f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, true, 1.416f, 1.418f)
                lineTo(22.1f, 16.185f)
                lineToRelative(-0.079f, 0.074f)
                lineToRelative(-2.656f, 2.66f)
                lineToRelative(0.707f, 0.706f)
                lineToRelative(2.712f, -2.71f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, true, 1.363f, 0.05f)
                curveToRelative(0.39f, 0.392f, 0.39f, 1.026f, 0.0f, 1.418f)
                lineToRelative(-0.962f, 0.958f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.102f, 0.095f)
                lineToRelative(0.004f, 0.003f)
                lineToRelative(-1.596f, 1.59f)
                lineToRelative(0.706f, 0.708f)
                lineToRelative(1.665f, -1.66f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, true, 1.347f, 0.066f)
                curveToRelative(0.39f, 0.391f, 0.39f, 1.026f, 0.0f, 1.417f)
                lineToRelative(-1.594f, 1.592f)
                lineToRelative(0.706f, 0.708f)
                lineToRelative(0.53f, -0.53f)
                horizontalLineToRelative(0.002f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, true, 1.417f, 1.417f)
                lineToRelative(-0.007f, 0.006f)
                lineToRelative(-0.024f, 0.024f)
                lineToRelative(-0.11f, 0.11f)
                lineToRelative(-0.548f, 0.546f)
                curveToRelative(-0.54f, 0.537f, -1.468f, 1.464f, -3.026f, 3.022f)
                curveToRelative(-1.52f, 1.522f, -2.913f, 2.448f, -3.916f, 2.992f)
                curveToRelative(-0.502f, 0.272f, -0.907f, 0.449f, -1.182f, 0.557f)
                moveToRelative(6.96f, -27.227f)
                lineToRelative(-3.0f, 4.5f)
                lineToRelative(-0.833f, -0.554f)
                lineToRelative(3.0f, -4.5f)
                close()
                moveTo(13.917f, 8.723f)
                lineTo(10.917f, 4.223f)
                lineTo(10.084f, 4.777f)
                lineTo(13.084f, 9.277f)
                close()
            }
        }
            .build()
        return _handFingersSnapMedium!!
    }

private var _handFingersSnapMedium: ImageVector? = null
