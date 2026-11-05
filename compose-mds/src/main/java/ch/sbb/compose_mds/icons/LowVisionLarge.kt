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

public val SBBIcons.LowVisionLarge: ImageVector
    get() {
        if (_lowVisionLarge != null) {
            return _lowVisionLarge!!
        }
        _lowVisionLarge = Builder(
            name = "LowVisionLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveToRelative(38.074f, 38.847f)
                lineToRelative(-0.707f, 0.706f)
                lineToRelative(-6.706f, -6.706f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, -6.926f, 1.853f)
                horizontalLineToRelative(-0.015f)
                curveToRelative(-4.419f, 0.0f, -8.41f, -2.283f, -11.45f, -4.79f)
                curveToRelative(-3.047f, -2.51f, -5.204f, -5.3f, -5.965f, -6.43f)
                lineToRelative(-0.192f, -0.288f)
                lineToRelative(0.2f, -0.281f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 7.086f, -7.325f)
                lineTo(7.367f, 9.554f)
                lineToRelative(0.707f, -0.708f)
                close()
                moveTo(9.904f, 20.092f)
                arcToRelative(33.0f, 33.0f, 0.0f, false, false, -2.57f, 3.113f)
                curveToRelative(0.86f, 1.213f, 2.85f, 3.69f, 5.572f, 5.935f)
                curveToRelative(2.908f, 2.397f, 6.59f, 4.477f, 10.583f, 4.555f)
                close()
                moveTo(14.113f, 16.3f)
                arcToRelative(33.0f, 33.0f, 0.0f, false, false, -3.515f, 3.07f)
                lineToRelative(14.23f, 14.25f)
                curveToRelative(1.775f, -0.19f, 3.5f, -0.702f, 5.091f, -1.514f)
                close()
                moveTo(23.72f, 11.7f)
                curveToRelative(4.419f, 0.0f, 8.41f, 2.283f, 11.45f, 4.79f)
                curveToRelative(3.047f, 2.51f, 5.204f, 5.3f, 5.965f, 6.43f)
                lineToRelative(0.194f, 0.289f)
                lineToRelative(-0.202f, 0.282f)
                arcToRelative(34.8f, 34.8f, 0.0f, false, true, -5.762f, 6.27f)
                lineToRelative(-0.649f, -0.762f)
                arcToRelative(33.8f, 33.8f, 0.0f, false, false, 5.389f, -5.805f)
                curveToRelative(-0.86f, -1.213f, -2.849f, -3.69f, -5.57f, -5.933f)
                curveToRelative(-2.963f, -2.443f, -6.73f, -4.558f, -10.808f, -4.561f)
                curveToRelative(-1.625f, 0.033f, -3.232f, 0.36f, -4.741f, 0.964f)
                lineToRelative(-0.371f, -0.928f)
                curveToRelative(1.622f, -0.65f, 3.348f, -1.0f, 5.095f, -1.036f)
                close()
                moveTo(21.87f, 15.957f)
                arcToRelative(7.42f, 7.42f, 0.0f, false, true, 7.174f, 1.918f)
                horizontalLineToRelative(0.001f)
                arcToRelative(7.43f, 7.43f, 0.0f, false, true, 1.918f, 7.175f)
                lineToRelative(-0.482f, -0.13f)
                lineToRelative(-0.483f, -0.13f)
                arcToRelative(6.42f, 6.42f, 0.0f, false, false, -1.66f, -6.207f)
                lineToRelative(-0.308f, -0.29f)
                arcToRelative(6.43f, 6.43f, 0.0f, false, false, -5.9f, -1.37f)
                lineToRelative(-0.13f, -0.484f)
                close()
            }
        }
            .build()
        return _lowVisionLarge!!
    }

private var _lowVisionLarge: ImageVector? = null
