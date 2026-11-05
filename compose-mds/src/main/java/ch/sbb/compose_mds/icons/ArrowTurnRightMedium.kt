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

public val SBBIcons.ArrowTurnRightMedium: ImageVector
    get() {
        if (_arrowTurnRightMedium != null) {
            return _arrowTurnRightMedium!!
        }
        _arrowTurnRightMedium = Builder(name = "ArrowTurnRightMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 9.75f)
                curveToRelative(0.0f, 3.247f, 0.745f, 6.111f, 2.518f, 8.158f)
                curveToRelative(1.76f, 2.034f, 4.605f, 3.342f, 8.982f, 3.342f)
                horizontalLineToRelative(6.291f)
                lineToRelative(-3.872f, -3.871f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(4.713f, 4.71f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(-0.352f, 0.354f)
                lineToRelative(-4.714f, 4.724f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-0.353f, -0.353f)
                lineToRelative(3.848f, -3.857f)
                horizontalLineTo(20.25f)
                curveToRelative(-4.583f, 0.0f, -7.739f, -1.378f, -9.738f, -3.687f)
                curveTo(8.524f, 16.266f, 7.75f, 13.13f, 7.75f, 9.75f)
                close()
            }
        }
        .build()
        return _arrowTurnRightMedium!!
    }

private var _arrowTurnRightMedium: ImageVector? = null
