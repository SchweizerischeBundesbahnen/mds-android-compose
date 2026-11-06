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

public val SBBIcons.ArrowsRightLeftMedium: ImageVector
    get() {
        if (_arrowsRightLeftMedium != null) {
            return _arrowsRightLeftMedium!!
        }
        _arrowsRightLeftMedium = Builder(name = "ArrowsRightLeftMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(26.589f, 10.883f)
                lineToRelative(-5.985f, -5.987f)
                lineToRelative(-0.708f, 0.707f)
                lineToRelative(5.132f, 5.133f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(17.532f)
                lineToRelative(-5.136f, 5.16f)
                lineToRelative(0.708f, 0.706f)
                lineToRelative(5.985f, -6.013f)
                lineToRelative(0.352f, -0.354f)
                close()
                moveTo(9.457f, 24.238f)
                horizontalLineTo(27.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(9.454f)
                lineToRelative(5.136f, 5.16f)
                lineToRelative(-0.709f, 0.706f)
                lineToRelative(-5.985f, -6.014f)
                lineToRelative(-0.352f, -0.353f)
                lineToRelative(0.353f, -0.353f)
                lineToRelative(5.985f, -5.986f)
                lineToRelative(0.707f, 0.707f)
                close()
            }
        }
        .build()
        return _arrowsRightLeftMedium!!
    }

private var _arrowsRightLeftMedium: ImageVector? = null
