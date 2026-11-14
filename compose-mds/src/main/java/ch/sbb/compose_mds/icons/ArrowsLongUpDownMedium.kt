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

public val SBBIcons.ArrowsLongUpDownMedium: ImageVector
    get() {
        if (_arrowsLongUpDownMedium != null) {
            return _arrowsLongUpDownMedium!!
        }
        _arrowsLongUpDownMedium = Builder(name = "ArrowsLongUpDownMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(24.757f, 29.936f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(4.711f, -4.713f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-3.858f, 3.859f)
                verticalLineTo(5.993f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(22.03f)
                lineToRelative(-3.87f, -3.86f)
                lineToRelative(-0.707f, 0.706f)
                lineToRelative(4.724f, 4.714f)
                close()
                moveTo(11.256f, 6.05f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(4.71f, 4.713f)
                lineToRelative(-0.706f, 0.707f)
                lineToRelative(-3.858f, -3.859f)
                verticalLineToRelative(22.029f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(7.963f)
                lineToRelative(-3.87f, 3.86f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(4.724f, -4.714f)
                close()
            }
        }
        .build()
        return _arrowsLongUpDownMedium!!
    }

private var _arrowsLongUpDownMedium: ImageVector? = null
