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

public val SBBIcons.ArrowLongRightMedium: ImageVector
    get() {
        if (_arrowLongRightMedium != null) {
            return _arrowLongRightMedium!!
        }
        _arrowLongRightMedium = Builder(name = "ArrowLongRightMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(29.943f, 18.737f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-4.712f, -4.71f)
                lineToRelative(-0.708f, 0.706f)
                lineToRelative(3.86f, 3.858f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(22.03f)
                lineToRelative(-3.86f, 3.87f)
                lineToRelative(0.706f, 0.707f)
                lineToRelative(4.714f, -4.724f)
                close()
            }
        }
        .build()
        return _arrowLongRightMedium!!
    }

private var _arrowLongRightMedium: ImageVector? = null
