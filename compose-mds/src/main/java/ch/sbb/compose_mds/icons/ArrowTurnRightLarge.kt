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

public val SBBIcons.ArrowTurnRightLarge: ImageVector
    get() {
        if (_arrowTurnRightLarge != null) {
            return _arrowTurnRightLarge!!
        }
        _arrowTurnRightLarge = Builder(name = "ArrowTurnRightLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.5f)
                curveToRelative(0.0f, 4.352f, 0.999f, 8.215f, 3.398f, 10.986f)
                curveTo(16.785f, 26.244f, 20.63f, 28.0f, 26.5f, 28.0f)
                horizontalLineToRelative(8.791f)
                lineToRelative(-5.447f, -5.445f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(6.284f, 6.282f)
                lineToRelative(0.353f, 0.352f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-6.284f, 6.299f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(35.257f, 29.0f)
                horizontalLineTo(26.5f)
                curveToRelative(-6.076f, 0.0f, -10.232f, -1.825f, -12.858f, -4.858f)
                curveTo(11.027f, 21.122f, 10.0f, 16.985f, 10.0f, 12.5f)
                close()
            }
        }
        .build()
        return _arrowTurnRightLarge!!
    }

private var _arrowTurnRightLarge: ImageVector? = null
