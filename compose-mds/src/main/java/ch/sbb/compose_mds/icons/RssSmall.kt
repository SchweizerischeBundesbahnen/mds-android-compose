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

public val SBBIcons.RssSmall: ImageVector
    get() {
        if (_rssSmall != null) {
            return _rssSmall!!
        }
        _rssSmall = Builder(name = "RssSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 4.0f)
                curveToRelative(8.837f, 0.0f, 16.0f, 7.163f, 16.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -8.285f, -6.715f, -15.0f, -15.0f, -15.0f)
                close()
                moveTo(7.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 4.001f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 18.0f)
                moveToRelative(6.0f, 2.0f)
                curveToRelative(0.0f, -5.523f, -4.477f, -10.0f, -10.0f, -10.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _rssSmall!!
    }

private var _rssSmall: ImageVector? = null
