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

public val SBBIcons.ArrowTurnRightSmall: ImageVector
    get() {
        if (_arrowTurnRightSmall != null) {
            return _arrowTurnRightSmall!!
        }
        _arrowTurnRightSmall = Builder(name = "ArrowTurnRightSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 6.5f)
                curveToRelative(0.0f, 2.143f, 0.492f, 4.007f, 1.638f, 5.33f)
                curveTo(8.772f, 13.14f, 10.616f, 14.0f, 13.5f, 14.0f)
                horizontalLineToRelative(3.792f)
                lineToRelative(-2.297f, -2.296f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(3.142f, 3.14f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(-0.352f, 0.354f)
                lineToRelative(-3.143f, 3.15f)
                lineToRelative(-0.707f, -0.708f)
                lineTo(17.275f, 15.0f)
                horizontalLineTo(13.5f)
                curveToRelative(-3.09f, 0.0f, -5.245f, -0.93f, -6.618f, -2.516f)
                curveTo(5.52f, 10.912f, 5.0f, 8.776f, 5.0f, 6.5f)
                close()
            }
        }
        .build()
        return _arrowTurnRightSmall!!
    }

private var _arrowTurnRightSmall: ImageVector? = null
