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

public val SBBIcons.FastForwardSmall: ImageVector
    get() {
        if (_fastForwardSmall != null) {
            return _fastForwardSmall!!
        }
        _fastForwardSmall = Builder(
            name = "FastForwardSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveToRelative(4.0f, 4.522f)
                lineToRelative(0.793f, 0.573f)
                lineToRelative(4.5f, 3.25f)
                lineToRelative(0.707f, 0.51f)
                verticalLineTo(4.522f)
                lineToRelative(0.793f, 0.573f)
                lineToRelative(4.5f, 3.25f)
                lineToRelative(4.5f, 3.25f)
                lineToRelative(0.561f, 0.405f)
                lineToRelative(-0.561f, 0.405f)
                lineToRelative(-4.5f, 3.25f)
                lineToRelative(-4.5f, 3.25f)
                lineToRelative(-0.793f, 0.573f)
                verticalLineToRelative(-4.334f)
                lineToRelative(-0.707f, 0.511f)
                lineToRelative(-4.5f, 3.25f)
                lineToRelative(-0.793f, 0.573f)
                verticalLineTo(4.522f)
                moveToRelative(1.0f, 1.956f)
                verticalLineToRelative(11.044f)
                lineToRelative(3.707f, -2.677f)
                lineToRelative(1.5f, -1.084f)
                lineToRelative(0.793f, -0.573f)
                verticalLineToRelative(4.334f)
                lineToRelative(3.707f, -2.677f)
                lineTo(18.646f, 12.0f)
                lineToRelative(-3.939f, -2.845f)
                lineTo(11.0f, 6.478f)
                verticalLineToRelative(4.333f)
                lineToRelative(-0.793f, -0.573f)
                lineToRelative(-1.5f, -1.083f)
                close()
            }
        }
            .build()
        return _fastForwardSmall!!
    }

private var _fastForwardSmall: ImageVector? = null
