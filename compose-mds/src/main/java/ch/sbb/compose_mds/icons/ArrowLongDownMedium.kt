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

public val SBBIcons.ArrowLongDownMedium: ImageVector
    get() {
        if (_arrowLongDownMedium != null) {
            return _arrowLongDownMedium!!
        }
        _arrowLongDownMedium = Builder(name = "ArrowLongDownMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(17.612f, 29.59f)
                lineToRelative(4.711f, -4.714f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-3.858f, 3.86f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(22.03f)
                lineToRelative(-3.87f, -3.861f)
                lineToRelative(-0.707f, 0.708f)
                lineToRelative(4.724f, 4.713f)
                lineToRelative(0.354f, 0.353f)
                close()
            }
        }
        .build()
        return _arrowLongDownMedium!!
    }

private var _arrowLongDownMedium: ImageVector? = null
