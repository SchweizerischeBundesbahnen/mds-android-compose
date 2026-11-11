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

public val SBBIcons.CalendarLarge: ImageVector
    get() {
        if (_calendarLarge != null) {
            return _calendarLarge!!
        }
        _calendarLarge = Builder(name = "CalendarLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(22.94f)
                horizontalLineToRelative(0.499f)
                lineToRelative(30.0f, 0.06f)
                lineTo(40.0f, 36.0f)
                lineTo(40.0f, 13.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(32.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                lineTo(16.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(29.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(39.0f, 34.998f)
                lineTo(10.0f, 34.941f)
                lineTo(10.0f, 19.0f)
                horizontalLineToRelative(29.0f)
                close()
                moveTo(36.0f, 22.0f)
                verticalLineToRelative(1.0f)
                lineTo(26.0f, 23.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(23.0f, 29.0f)
                verticalLineToRelative(-1.0f)
                lineTo(13.0f, 28.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(23.0f, 31.0f)
                verticalLineToRelative(1.0f)
                lineTo(13.0f, 32.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(36.0f, 26.0f)
                verticalLineToRelative(-1.0f)
                lineTo(26.0f, 25.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(36.0f, 31.0f)
                verticalLineToRelative(1.0f)
                lineTo(26.0f, 32.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(36.0f, 29.0f)
                verticalLineToRelative(-1.0f)
                lineTo(26.0f, 28.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 25.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(23.0f, 26.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _calendarLarge!!
    }

private var _calendarLarge: ImageVector? = null
