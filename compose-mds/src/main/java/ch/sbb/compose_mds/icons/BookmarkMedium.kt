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

public val SBBIcons.BookmarkMedium: ImageVector
    get() {
        if (_bookmarkMedium != null) {
            return _bookmarkMedium!!
        }
        _bookmarkMedium = Builder(name = "BookmarkMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.75f, 3.25f)
                verticalLineToRelative(20.207f)
                lineTo(18.0f, 32.207f)
                lineToRelative(-8.75f, -8.75f)
                lineTo(9.25f, 3.25f)
                close()
                moveTo(10.25f, 23.043f)
                lineTo(18.0f, 30.793f)
                lineTo(25.75f, 23.043f)
                lineTo(25.75f, 4.25f)
                horizontalLineToRelative(-15.5f)
                close()
            }
        }
        .build()
        return _bookmarkMedium!!
    }

private var _bookmarkMedium: ImageVector? = null
