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

public val SBBIcons.FastForwardLarge: ImageVector
    get() {
        if (_fastForwardLarge != null) {
            return _fastForwardLarge!!
        }
        _fastForwardLarge = Builder(
            name = "FastForwardLarge",
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
                moveToRelative(20.793f, 10.095f)
                lineToRelative(18.0f, 13.0f)
                lineToRelative(0.56f, 0.405f)
                lineToRelative(-0.56f, 0.405f)
                lineToRelative(-18.0f, 13.0f)
                lineToRelative(-0.793f, 0.572f)
                verticalLineTo(28.81f)
                lineToRelative(-2.207f, 1.595f)
                lineToRelative(-9.0f, 6.5f)
                lineToRelative(-0.793f, 0.572f)
                verticalLineTo(9.523f)
                lineToRelative(0.793f, 0.573f)
                lineToRelative(9.0f, 6.5f)
                lineTo(20.0f, 18.188f)
                verticalLineTo(9.522f)
                close()
                moveTo(21.0f, 20.144f)
                lineToRelative(-0.793f, -0.573f)
                lineToRelative(-3.0f, -2.166f)
                lineTo(9.0f, 11.477f)
                verticalLineToRelative(24.045f)
                lineToRelative(8.207f, -5.927f)
                lineToRelative(3.0f, -2.168f)
                lineToRelative(0.793f, -0.573f)
                verticalLineToRelative(8.668f)
                lineToRelative(8.207f, -5.927f)
                lineToRelative(8.438f, -6.095f)
                lineToRelative(-8.438f, -6.095f)
                lineTo(21.0f, 11.477f)
                close()
            }
        }
            .build()
        return _fastForwardLarge!!
    }

private var _fastForwardLarge: ImageVector? = null
