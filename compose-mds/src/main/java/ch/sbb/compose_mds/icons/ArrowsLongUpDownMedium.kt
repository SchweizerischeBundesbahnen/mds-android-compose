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
                moveToRelative(25.11f, 29.582f)
                lineToRelative(4.711f, -4.713f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-3.858f, 3.86f)
                verticalLineTo(5.991f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(22.031f)
                lineToRelative(-3.87f, -3.861f)
                lineToRelative(-0.707f, 0.708f)
                lineToRelative(4.724f, 4.713f)
                lineToRelative(0.353f, 0.353f)
                close()
                moveTo(11.61f, 6.403f)
                lineToRelative(4.711f, 4.713f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-3.858f, -3.859f)
                verticalLineToRelative(22.029f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(7.962f)
                lineToRelative(-3.87f, 3.862f)
                lineToRelative(-0.707f, -0.708f)
                lineToRelative(4.724f, -4.713f)
                lineToRelative(0.353f, -0.353f)
                close()
            }
        }
        .build()
        return _arrowsLongUpDownMedium!!
    }

private var _arrowsLongUpDownMedium: ImageVector? = null
