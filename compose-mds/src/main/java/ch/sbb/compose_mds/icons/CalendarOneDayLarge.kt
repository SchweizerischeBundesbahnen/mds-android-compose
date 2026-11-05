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

public val SBBIcons.CalendarOneDayLarge: ImageVector
    get() {
        if (_calendarOneDayLarge != null) {
            return _calendarOneDayLarge!!
        }
        _calendarOneDayLarge = Builder(
            name = "CalendarOneDayLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(23.0f)
                horizontalLineToRelative(-0.501f)
                lineToRelative(-30.0f, -0.06f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(10.0f, 34.94f)
                lineToRelative(29.0f, 0.057f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(25.0f, 33.0f)
                horizontalLineToRelative(-1.116f)
                verticalLineTo(24.06f)
                horizontalLineToRelative(-3.045f)
                verticalLineToRelative(-0.837f)
                quadToRelative(1.125f, -0.025f, 1.638f, -0.127f)
                quadToRelative(0.512f, -0.104f, 0.848f, -0.374f)
                quadToRelative(0.312f, -0.246f, 0.486f, -0.61f)
                quadToRelative(0.172f, -0.366f, 0.335f, -1.113f)
                horizontalLineTo(25.0f)
                close()
                moveTo(10.0f, 18.0f)
                horizontalLineToRelative(29.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
            .build()
        return _calendarOneDayLarge!!
    }

private var _calendarOneDayLarge: ImageVector? = null
