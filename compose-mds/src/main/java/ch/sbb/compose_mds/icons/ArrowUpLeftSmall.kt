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

public val SBBIcons.ArrowUpLeftSmall: ImageVector
    get() {
        if (_arrowUpLeftSmall != null) {
            return _arrowUpLeftSmall!!
        }
        _arrowUpLeftSmall = Builder(name = "ArrowUpLeftSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.997f, 17.494f)
                curveToRelative(0.0f, -2.142f, -0.492f, -4.007f, -1.637f, -5.33f)
                curveToRelative(-1.134f, -1.31f, -2.98f, -2.17f, -5.863f, -2.17f)
                horizontalLineTo(6.705f)
                lineToRelative(2.297f, 2.296f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-3.141f, -3.14f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(0.353f, -0.354f)
                lineTo(8.295f, 6.0f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-2.28f, 2.287f)
                horizontalLineToRelative(3.775f)
                curveToRelative(3.09f, 0.0f, 5.246f, 0.93f, 6.619f, 2.516f)
                curveToRelative(1.36f, 1.572f, 1.881f, 3.708f, 1.881f, 5.984f)
                close()
            }
        }
        .build()
        return _arrowUpLeftSmall!!
    }

private var _arrowUpLeftSmall: ImageVector? = null
