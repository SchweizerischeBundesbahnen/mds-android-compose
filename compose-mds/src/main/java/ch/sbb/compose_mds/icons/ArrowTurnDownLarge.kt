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

public val SBBIcons.ArrowTurnDownLarge: ImageVector
    get() {
        if (_arrowTurnDownLarge != null) {
            return _arrowTurnDownLarge!!
        }
        _arrowTurnDownLarge = Builder(name = "ArrowTurnDownLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.5f, 11.0f)
                curveToRelative(-4.351f, 0.0f, -8.215f, 0.999f, -10.986f, 3.398f)
                curveTo(21.756f, 16.785f, 20.0f, 20.63f, 20.0f, 26.5f)
                verticalLineToRelative(8.79f)
                lineToRelative(5.446f, -5.446f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-6.283f, 6.284f)
                lineToRelative(-0.352f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-6.299f, -6.284f)
                lineToRelative(0.707f, -0.707f)
                lineTo(19.0f, 35.258f)
                verticalLineTo(26.5f)
                curveToRelative(0.0f, -6.076f, 1.825f, -10.232f, 4.859f, -12.858f)
                curveTo(26.879f, 11.027f, 31.015f, 10.0f, 35.5f, 10.0f)
                close()
            }
        }
        .build()
        return _arrowTurnDownLarge!!
    }

private var _arrowTurnDownLarge: ImageVector? = null
