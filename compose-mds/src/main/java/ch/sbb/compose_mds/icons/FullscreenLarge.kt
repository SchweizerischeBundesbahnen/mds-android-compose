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

public val SBBIcons.FullscreenLarge: ImageVector
    get() {
        if (_fullscreenLarge != null) {
            return _fullscreenLarge!!
        }
        _fullscreenLarge = Builder(name = "FullscreenLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 7.0f)
                lineTo(19.0f, 2.0f)
                lineTo(2.0f, 2.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(5.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(6.0f, 18.0f)
                lineTo(3.0f, 18.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(46.0f, 19.0f)
                lineTo(46.0f, 2.0f)
                lineTo(29.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(42.0f, 6.0f)
                lineTo(30.0f, 6.0f)
                lineTo(30.0f, 3.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(7.0f, 29.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(5.0f)
                lineTo(2.0f, 46.0f)
                lineTo(2.0f, 29.0f)
                close()
                moveTo(3.0f, 45.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-3.0f)
                lineTo(6.0f, 42.0f)
                lineTo(6.0f, 30.0f)
                lineTo(3.0f, 30.0f)
                close()
                moveTo(46.0f, 46.0f)
                lineTo(46.0f, 29.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(12.0f)
                lineTo(29.0f, 41.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(30.0f, 42.0f)
                horizontalLineToRelative(12.0f)
                lineTo(42.0f, 30.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(15.0f)
                lineTo(30.0f, 45.0f)
                close()
            }
        }
        .build()
        return _fullscreenLarge!!
    }

private var _fullscreenLarge: ImageVector? = null
