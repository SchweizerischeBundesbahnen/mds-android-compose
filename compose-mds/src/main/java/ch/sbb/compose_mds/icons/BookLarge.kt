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

public val SBBIcons.BookLarge: ImageVector
    get() {
        if (_bookLarge != null) {
            return _bookLarge!!
        }
        _bookLarge = Builder(name = "BookLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.0f, 33.002f)
                lineTo(12.5f, 33.002f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                lineToRelative(26.0f, -0.002f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-26.0f, 0.002f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, -4.5f)
                lineTo(8.0f, 10.5f)
                curveTo(8.0f, 8.016f, 10.016f, 6.0f, 12.5f, 6.0f)
                lineTo(39.0f, 6.0f)
                close()
                moveTo(39.0f, 37.002f)
                lineTo(12.0f, 37.002f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(12.5f, 7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 9.0f, 10.5f)
                verticalLineToRelative(23.176f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.5f, -1.674f)
                lineTo(38.0f, 32.002f)
                lineTo(38.0f, 7.0f)
                close()
                moveTo(13.0f, 30.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(12.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(28.0f, 18.0f)
                lineTo(17.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(32.0f, 14.0f)
                lineTo(17.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
            }
        }
        .build()
        return _bookLarge!!
    }

private var _bookLarge: ImageVector? = null
