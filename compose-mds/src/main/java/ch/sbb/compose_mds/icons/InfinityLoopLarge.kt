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

public val SBBIcons.InfinityLoopLarge: ImageVector
    get() {
        if (_infinityLoopLarge != null) {
            return _infinityLoopLarge!!
        }
        _infinityLoopLarge = Builder(
            name = "InfinityLoopLarge",
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
                moveTo(29.487f, 17.486f)
                curveToRelative(3.316f, -3.315f, 8.69f, -3.314f, 12.025f, 0.0f)
                curveToRelative(3.339f, 3.317f, 3.315f, 8.694f, 0.003f, 12.027f)
                curveToRelative(-3.316f, 3.337f, -8.691f, 3.313f, -12.024f, 0.004f)
                lineToRelative(-3.34f, -3.26f)
                lineToRelative(0.35f, -0.357f)
                lineToRelative(0.348f, -0.358f)
                lineToRelative(3.34f, 3.26f)
                lineToRelative(0.004f, 0.004f)
                curveToRelative(2.947f, 2.927f, 7.69f, 2.942f, 10.612f, 0.002f)
                curveToRelative(2.928f, -2.948f, 2.944f, -7.691f, 0.003f, -10.614f)
                curveToRelative(-2.944f, -2.925f, -7.685f, -2.925f, -10.61f, -0.006f)
                lineTo(19.525f, 29.502f)
                lineToRelative(-0.012f, 0.012f)
                curveToRelative(-3.333f, 3.311f, -8.709f, 3.336f, -12.026f, -0.002f)
                curveToRelative(-3.312f, -3.333f, -3.337f, -8.71f, 0.002f, -12.028f)
                curveToRelative(3.334f, -3.313f, 8.71f, -3.315f, 12.026f, 0.001f)
                lineToRelative(3.324f, 3.045f)
                lineToRelative(-0.338f, 0.37f)
                lineToRelative(-0.337f, 0.367f)
                lineToRelative(-3.34f, -3.06f)
                lineToRelative(-0.009f, -0.007f)
                lineToRelative(-0.008f, -0.008f)
                curveToRelative(-2.924f, -2.923f, -7.668f, -2.925f, -10.613f, 0.001f)
                curveToRelative(-2.941f, 2.923f, -2.926f, 7.666f, 0.002f, 10.614f)
                curveToRelative(2.919f, 2.937f, 7.653f, 2.925f, 10.601f, 0.008f)
                lineToRelative(10.68f, -11.319f)
                close()
            }
        }
            .build()
        return _infinityLoopLarge!!
    }

private var _infinityLoopLarge: ImageVector? = null
