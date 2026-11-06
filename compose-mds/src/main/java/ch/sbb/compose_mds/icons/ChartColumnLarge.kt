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
                moveTo(38.5f, 7.0f)
                lineTo(38.0f, 7.0f)
                verticalLineToRelative(34.0f)
                horizontalLineToRelative(8.0f)
                lineTo(46.0f, 7.0f)
                horizontalLineToRelative(-7.5f)
                moveToRelative(0.5f, 33.0f)
                lineTo(39.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(14.5f, 15.0f)
                lineTo(14.0f, 15.0f)
                verticalLineToRelative(26.0f)
                horizontalLineToRelative(8.0f)
                lineTo(22.0f, 15.0f)
                horizontalLineToRelative(-7.5f)
                moveToRelative(0.5f, 25.0f)
                lineTo(15.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(2.0f, 32.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 41.0f)
                verticalLineToRelative(-9.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(46.0f, 46.0f)
                lineTo(2.0f, 46.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(44.0f)
                close()
                moveTo(26.0f, 20.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(26.0f, 20.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(6.0f)
                lineTo(33.0f, 21.0f)
                close()
            }
        }
        .build()
        return _chartColumnLarge!!
    }

private var _chartColumnLarge: ImageVector? = null
