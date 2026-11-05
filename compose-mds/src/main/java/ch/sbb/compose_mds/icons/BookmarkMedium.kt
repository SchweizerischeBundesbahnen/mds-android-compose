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

public val SBBIcons.BookmarkMedium: ImageVector
    get() {
        if (_bookmarkMedium != null) {
            return _bookmarkMedium!!
        }
        _bookmarkMedium = Builder(
            name = "BookmarkMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(9.25f, 3.25f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(20.207f)
                lineToRelative(-0.146f, 0.147f)
                lineToRelative(-8.25f, 8.25f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-8.25f, -8.25f)
                lineToRelative(-0.146f, -0.147f)
                verticalLineTo(3.25f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(18.793f)
                lineToRelative(7.75f, 7.75f)
                lineToRelative(7.75f, -7.75f)
                verticalLineTo(4.25f)
                close()
            }
        }
            .build()
        return _bookmarkMedium!!
    }

private var _bookmarkMedium: ImageVector? = null
