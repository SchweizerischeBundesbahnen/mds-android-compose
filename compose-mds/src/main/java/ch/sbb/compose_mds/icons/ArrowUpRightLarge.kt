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

public val SBBIcons.ArrowUpRightLarge: ImageVector
    get() {
        if (_arrowUpRightLarge != null) {
            return _arrowUpRightLarge!!
        }
        _arrowUpRightLarge = Builder(name = "ArrowUpRightLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(36.835f, 19.152f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(-0.353f, 0.352f)
                lineToRelative(-6.284f, 6.283f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(5.446f, -5.446f)
                horizontalLineTo(26.5f)
                curveToRelative(-5.87f, 0.0f, -9.715f, 1.756f, -12.102f, 4.514f)
                curveToRelative(-2.4f, 2.77f, -3.398f, 6.635f, -3.398f, 10.986f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -4.484f, 1.027f, -8.62f, 3.642f, -11.64f)
                curveToRelative(2.626f, -3.034f, 6.781f, -4.86f, 12.858f, -4.86f)
                horizontalLineToRelative(8.758f)
                lineToRelative(-5.414f, -5.427f)
                lineToRelative(0.707f, -0.707f)
                close()
            }
        }
        .build()
        return _arrowUpRightLarge!!
    }

private var _arrowUpRightLarge: ImageVector? = null
