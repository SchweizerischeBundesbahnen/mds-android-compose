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
                moveTo(11.123f, 13.673f)
                lineTo(6.41f, 18.397f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(4.712f, 4.712f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-3.857f, -3.858f)
                horizontalLineTo(30.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(7.97f)
                lineToRelative(3.86f, -3.87f)
                close()
            }
        }
        .build()
        return _arrowLongLeftMedium!!
    }

private var _arrowLongLeftMedium: ImageVector? = null
