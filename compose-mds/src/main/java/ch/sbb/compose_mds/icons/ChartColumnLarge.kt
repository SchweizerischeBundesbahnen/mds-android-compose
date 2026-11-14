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

public val SBBIcons.ChartColumnLarge: ImageVector
    get() {
        if (_chartColumnLarge != null) {
            return _chartColumnLarge!!
        }
        _chartColumnLarge = Builder(name = "ChartColumnLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(46.0f, 41.0f)
                lineTo(46.0f, 7.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(34.0f)
                close()
                moveTo(45.0f, 40.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(39.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(22.0f, 41.0f)
                lineTo(22.0f, 15.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(26.0f)
                close()
                moveTo(21.0f, 40.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(15.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(10.0f, 32.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 41.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(3.0f, 40.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-7.0f)
                lineTo(3.0f, 33.0f)
                close()
                moveTo(46.0f, 45.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 46.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(34.0f, 20.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(26.0f, 20.0f)
                close()
                moveTo(27.0f, 40.0f)
                horizontalLineToRelative(6.0f)
                lineTo(33.0f, 21.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _chartColumnLarge!!
    }

private var _chartColumnLarge: ImageVector? = null
