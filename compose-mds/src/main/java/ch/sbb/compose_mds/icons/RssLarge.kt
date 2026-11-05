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

public val SBBIcons.RssLarge: ImageVector
    get() {
        if (_rssLarge != null) {
            return _rssLarge!!
        }
        _rssLarge = Builder(name = "RssLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 20.0f)
                curveTo(19.27f, 20.0f, 28.0f, 28.73f, 28.0f, 39.5f)
                horizontalLineToRelative(-1.0f)
                curveTo(27.0f, 29.282f, 18.718f, 21.0f, 8.5f, 21.0f)
                close()
                moveTo(8.5f, 8.0f)
                curveTo(25.898f, 8.0f, 40.0f, 22.102f, 40.0f, 39.5f)
                horizontalLineToRelative(-1.0f)
                curveTo(39.0f, 22.654f, 25.346f, 9.0f, 8.5f, 9.0f)
                close()
                moveTo(12.5f, 31.999f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
            }
        }
        .build()
        return _rssLarge!!
    }

private var _rssLarge: ImageVector? = null
