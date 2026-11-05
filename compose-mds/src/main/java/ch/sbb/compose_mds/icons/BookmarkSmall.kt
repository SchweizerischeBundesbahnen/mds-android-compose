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

public val SBBIcons.BookmarkSmall: ImageVector
    get() {
        if (_bookmarkSmall != null) {
            return _bookmarkSmall!!
        }
        _bookmarkSmall = Builder(
            name = "BookmarkSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(6.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(13.707f)
                lineToRelative(-0.146f, 0.147f)
                lineToRelative(-5.5f, 5.5f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-5.5f, -5.5f)
                lineTo(6.0f, 15.707f)
                verticalLineTo(2.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(12.293f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(5.0f, -5.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
            .build()
        return _bookmarkSmall!!
    }

private var _bookmarkSmall: ImageVector? = null
