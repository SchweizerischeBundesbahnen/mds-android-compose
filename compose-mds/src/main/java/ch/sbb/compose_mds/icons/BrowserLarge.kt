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

public val SBBIcons.BrowserLarge: ImageVector
    get() {
        if (_browserLarge != null) {
            return _browserLarge!!
        }
        _browserLarge = Builder(name = "BrowserLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(46.0f, 42.0f)
                lineTo(46.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(36.0f)
                close()
                moveTo(45.0f, 41.0f)
                lineTo(3.0f, 41.0f)
                lineTo(3.0f, 17.0f)
                horizontalLineToRelative(42.0f)
                close()
                moveTo(45.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                lineTo(3.0f, 7.0f)
                horizontalLineToRelative(42.0f)
                close()
                moveTo(7.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                moveToRelative(7.0f, -4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                moveToRelative(4.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.5f, 9.0f)
                horizontalLineToRelative(19.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                horizontalLineToRelative(-19.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                moveToRelative(2.5f, 1.5f)
                horizontalLineToRelative(19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
            }
        }
        .build()
        return _browserLarge!!
    }

private var _browserLarge: ImageVector? = null
