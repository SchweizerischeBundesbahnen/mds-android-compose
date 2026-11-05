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

public val SBBIcons.BookSectionMarkLarge: ImageVector
    get() {
        if (_bookSectionMarkLarge != null) {
            return _bookSectionMarkLarge!!
        }
        _bookSectionMarkLarge = Builder(
            name = "BookSectionMarkLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
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
                moveTo(39.0f, 33.003f)
                lineTo(12.5f, 33.003f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 9.0f, 36.5f)
                arcToRelative(3.503f, 3.503f, 0.0f, false, false, 3.5f, 3.503f)
                lineToRelative(27.0f, -0.003f)
                verticalLineToRelative(1.0f)
                lineToRelative(-27.0f, 0.003f)
                arcTo(4.503f, 4.503f, 0.0f, false, true, 8.0f, 36.5f)
                verticalLineToRelative(-26.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 12.5f, 6.0f)
                lineTo(39.0f, 6.0f)
                close()
                moveTo(40.0f, 37.0f)
                lineTo(13.0f, 37.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(12.5f, 7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 9.0f, 10.5f)
                verticalLineToRelative(23.173f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.5f, -1.67f)
                lineTo(38.0f, 32.003f)
                lineTo(38.0f, 7.0f)
                close()
                moveTo(23.5f, 10.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -2.5f, 2.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.803f, 6.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -5.303f, 3.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 2.5f, -2.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.804f, -6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 23.5f, 10.0f)
                moveToRelative(0.0f, 7.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
            }
        }
            .build()
        return _bookSectionMarkLarge!!
    }

private var _bookSectionMarkLarge: ImageVector? = null
