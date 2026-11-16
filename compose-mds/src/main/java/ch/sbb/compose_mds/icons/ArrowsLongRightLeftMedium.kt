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

public val SBBIcons.ArrowsLongRightLeftMedium: ImageVector
    get() {
        if (_arrowsLongRightLeftMedium != null) {
            return _arrowsLongRightLeftMedium!!
        }
        _arrowsLongRightLeftMedium = Builder(name = "ArrowsLongRightLeftMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(29.943f, 11.237f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-4.712f, -4.71f)
                lineToRelative(-0.708f, 0.706f)
                lineToRelative(3.86f, 3.858f)
                lineTo(6.0f, 10.737f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(22.03f)
                lineToRelative(-3.86f, 3.87f)
                lineToRelative(0.706f, 0.707f)
                lineToRelative(4.714f, -4.724f)
                close()
                moveTo(6.057f, 24.737f)
                lineTo(6.411f, 24.383f)
                lineTo(11.124f, 19.673f)
                lineTo(11.831f, 20.379f)
                lineTo(7.971f, 24.237f)
                lineTo(30.0f, 24.237f)
                verticalLineToRelative(1.0f)
                lineTo(7.97f, 25.237f)
                lineToRelative(3.86f, 3.87f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(6.41f, 25.09f)
                close()
            }
        }
        .build()
        return _arrowsLongRightLeftMedium!!
    }

private var _arrowsLongRightLeftMedium: ImageVector? = null
