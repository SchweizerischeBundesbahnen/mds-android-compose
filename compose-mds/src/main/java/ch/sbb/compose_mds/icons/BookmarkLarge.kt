package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.BookmarkLarge: ImageVector
    get() {
        if (_bookmarkLarge != null) {
            return _bookmarkLarge!!
        }
        _bookmarkLarge = Builder(
            name = "BookmarkLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveToRelative(35.0f, 31.707f)
                lineToRelative(-11.5f, 11.5f)
                lineToRelative(-11.5f, -11.5f)
                lineTo(12.0f, 5.0f)
                horizontalLineToRelative(23.0f)
                close()
                moveTo(13.0f, 31.293f)
                lineTo(23.5f, 41.793f)
                lineTo(34.0f, 31.293f)
                lineTo(34.0f, 6.0f)
                lineTo(13.0f, 6.0f)
                close()
            }
        }
            .build()
        return _bookmarkLarge!!
    }

private var _bookmarkLarge: ImageVector? = null
