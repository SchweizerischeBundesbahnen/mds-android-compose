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

public val SBBIcons.ArrowUpLeftLarge: ImageVector
    get() {
        if (_arrowUpLeftLarge != null) {
            return _arrowUpLeftLarge!!
        }
        _arrowUpLeftLarge = Builder(name = "ArrowUpLeftLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.797f, 13.207f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(-5.417f, 5.428f)
                horizontalLineToRelative(8.762f)
                curveToRelative(6.077f, 0.0f, 10.232f, 1.826f, 12.858f, 4.86f)
                curveToRelative(2.615f, 3.02f, 3.642f, 7.156f, 3.642f, 11.64f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -4.351f, -0.999f, -8.215f, -3.398f, -10.986f)
                curveToRelative(-2.387f, -2.758f, -6.232f, -4.514f, -12.102f, -4.514f)
                horizontalLineToRelative(-8.792f)
                lineToRelative(5.447f, 5.446f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-6.284f, -6.283f)
                lineToRelative(-0.354f, -0.352f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(6.283f, -6.299f)
                close()
            }
        }
        .build()
        return _arrowUpLeftLarge!!
    }

private var _arrowUpLeftLarge: ImageVector? = null
