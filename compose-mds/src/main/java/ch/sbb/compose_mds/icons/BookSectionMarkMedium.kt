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

public val SBBIcons.BookSectionMarkMedium: ImageVector
    get() {
        if (_bookSectionMarkMedium != null) {
            return _bookSectionMarkMedium!!
        }
        _bookSectionMarkMedium = Builder(name = "BookSectionMarkMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.25f, 27.75f)
                lineTo(6.25f, 8.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, -3.5f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(20.502f)
                horizontalLineToRelative(-20.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.498f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.502f)
                lineTo(30.0f, 30.25f)
                verticalLineToRelative(1.0f)
                lineToRelative(-20.25f, 0.002f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.495f, -3.322f)
                close()
                moveTo(7.25f, 25.302f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 2.5f, -1.05f)
                horizontalLineToRelative(19.0f)
                lineTo(28.75f, 5.75f)
                horizontalLineToRelative(-19.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                close()
                moveTo(30.0f, 28.25f)
                lineTo(10.5f, 28.25f)
                verticalLineToRelative(-1.0f)
                lineTo(30.0f, 27.25f)
                close()
                moveTo(18.0f, 13.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, -3.5f)
                moveToRelative(1.581f, 4.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -1.581f, -5.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 1.75f, -1.75f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, -4.331f, 2.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 1.581f, 5.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, -1.75f, 1.75f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 4.331f, -2.25f)
            }
        }
        .build()
        return _bookSectionMarkMedium!!
    }

private var _bookSectionMarkMedium: ImageVector? = null
