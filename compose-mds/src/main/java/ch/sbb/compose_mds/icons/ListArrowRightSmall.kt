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

public val SBBIcons.ListArrowRightSmall: ImageVector
    get() {
        if (_listArrowRightSmall != null) {
            return _listArrowRightSmall!!
        }
        _listArrowRightSmall = Builder(name = "ListArrowRightSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.5f, 7.5f)
                verticalLineToRelative(10.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.0f, 20.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-1.0f)
                lineTo(9.5f, 19.0f)
                lineTo(9.5f, 6.0f)
                lineTo(17.0f, 6.0f)
                lineTo(17.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                moveToRelative(5.0f, -1.5f)
                lineTo(6.0f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 19.0f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(19.283f, 11.992f)
                lineTo(13.0f, 11.992f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.286f)
                lineToRelative(-3.14f, 3.155f)
                lineToRelative(0.709f, 0.705f)
                lineToRelative(3.99f, -4.008f)
                lineToRelative(0.351f, -0.353f)
                lineToRelative(-0.352f, -0.353f)
                lineToRelative(-3.99f, -3.992f)
                lineToRelative(-0.707f, 0.707f)
                close()
            }
        }
        .build()
        return _listArrowRightSmall!!
    }

private var _listArrowRightSmall: ImageVector? = null
