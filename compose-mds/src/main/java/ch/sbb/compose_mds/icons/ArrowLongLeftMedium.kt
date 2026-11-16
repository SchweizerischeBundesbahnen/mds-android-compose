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

public val SBBIcons.ArrowLongLeftMedium: ImageVector
    get() {
        if (_arrowLongLeftMedium != null) {
            return _arrowLongLeftMedium!!
        }
        _arrowLongLeftMedium = Builder(name = "ArrowLongLeftMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(7.968f, 18.25f)
                lineToRelative(3.862f, -3.87f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(-4.71f, 4.723f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(4.712f, 4.711f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-3.857f, -3.857f)
                horizontalLineTo(30.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _arrowLongLeftMedium!!
    }

private var _arrowLongLeftMedium: ImageVector? = null
