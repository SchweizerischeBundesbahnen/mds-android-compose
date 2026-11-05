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

public val SBBIcons.HeartLarge: ImageVector
    get() {
        if (_heartLarge != null) {
            return _heartLarge!!
        }
        _heartLarge = Builder(
            name = "HeartLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
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
                moveTo(33.56f, 4.0f)
                curveToRelative(6.894f, 0.0f, 12.45f, 5.522f, 12.45f, 12.43f)
                curveToRelative(0.0f, 2.156f, -0.552f, 4.188f, -1.51f, 5.958f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, -1.97f, 2.728f)
                lineToRelative(-0.006f, 0.007f)
                lineToRelative(-18.17f, 18.23f)
                lineToRelative(-0.354f, 0.355f)
                lineToRelative(-0.355f, -0.355f)
                lineToRelative(-18.16f, -18.23f)
                lineToRelative(0.356f, -0.354f)
                lineToRelative(-0.022f, 0.02f)
                lineToRelative(-0.334f, 0.334f)
                lineToRelative(-0.007f, -0.009f)
                lineToRelative(-0.285f, -0.31f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, -1.681f, -2.414f)
                arcTo(12.3f, 12.3f, 0.0f, false, true, 2.0f, 16.43f)
                curveTo(2.0f, 9.523f, 7.545f, 4.0f, 14.45f, 4.0f)
                curveToRelative(3.895f, 0.0f, 7.29f, 1.933f, 9.55f, 4.688f)
                curveTo(26.263f, 5.932f, 29.675f, 4.0f, 33.56f, 4.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(29.8f, 5.0f, 26.492f, 6.985f, 24.4f, 9.798f)
                lineToRelative(-0.401f, 0.54f)
                lineToRelative(-0.401f, -0.54f)
                curveTo(21.508f, 6.984f, 18.218f, 5.0f, 14.45f, 5.0f)
                curveTo(8.095f, 5.0f, 3.0f, 10.077f, 3.0f, 16.43f)
                curveToRelative(0.0f, 1.995f, 0.498f, 3.863f, 1.388f, 5.48f)
                lineToRelative(0.002f, 0.002f)
                lineToRelative(0.192f, 0.343f)
                curveToRelative(0.46f, 0.79f, 1.0f, 1.516f, 1.62f, 2.169f)
                lineTo(24.0f, 42.29f)
                lineToRelative(17.815f, -17.874f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, 1.805f, -2.505f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, 1.39f, -5.482f)
                curveTo(45.01f, 10.077f, 39.905f, 5.0f, 33.56f, 5.0f)
            }
        }
            .build()
        return _heartLarge!!
    }

private var _heartLarge: ImageVector? = null
