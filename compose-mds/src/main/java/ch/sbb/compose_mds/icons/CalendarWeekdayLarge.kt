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

public val SBBIcons.CalendarWeekdayLarge: ImageVector
    get() {
        if (_calendarWeekdayLarge != null) {
            return _calendarWeekdayLarge!!
        }
        _calendarWeekdayLarge = Builder(name = "CalendarWeekdayLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.02f)
                horizontalLineToRelative(17.0f)
                lineTo(32.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(23.002f)
                lineToRelative(-0.501f, -0.002f)
                lineToRelative(-30.0f, -0.06f)
                lineTo(8.0f, 35.96f)
                lineTo(8.0f, 13.02f)
                horizontalLineToRelative(6.0f)
                lineTo(14.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(9.0f, 34.963f)
                lineToRelative(29.0f, 0.056f)
                lineTo(38.0f, 20.04f)
                lineTo(9.0f, 20.04f)
                close()
                moveTo(23.0f, 33.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(29.0f, 33.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(35.0f, 33.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 32.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(13.0f, 31.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(23.0f, 29.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(29.0f, 29.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(35.0f, 29.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(23.0f, 25.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(29.0f, 25.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(35.0f, 25.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(9.0f, 19.04f)
                horizontalLineToRelative(29.0f)
                lineTo(38.0f, 14.02f)
                horizontalLineToRelative(-5.0f)
                lineTo(33.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.98f)
                lineTo(15.0f, 14.02f)
                lineTo(15.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.98f)
                lineTo(9.0f, 14.02f)
                close()
            }
        }
        .build()
        return _calendarWeekdayLarge!!
    }

private var _calendarWeekdayLarge: ImageVector? = null
