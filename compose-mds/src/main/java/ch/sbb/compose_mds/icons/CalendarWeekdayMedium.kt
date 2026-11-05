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

public val SBBIcons.CalendarWeekdayMedium: ImageVector
    get() {
        if (_calendarWeekdayMedium != null) {
            return _calendarWeekdayMedium!!
        }
        _calendarWeekdayMedium = Builder(
            name = "CalendarWeekdayMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(11.75f, 9.265f)
                horizontalLineToRelative(12.5f)
                lineTo(24.25f, 7.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.765f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(17.501f)
                horizontalLineToRelative(-0.501f)
                lineToRelative(-22.5f, -0.046f)
                lineTo(6.25f, 26.72f)
                lineTo(6.25f, 9.264f)
                horizontalLineToRelative(4.5f)
                lineTo(10.75f, 7.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(7.25f, 25.721f)
                lineTo(28.75f, 25.763f)
                lineTo(28.75f, 14.78f)
                lineTo(7.25f, 14.78f)
                close()
                moveTo(13.25f, 23.75f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(17.75f, 23.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(22.25f, 23.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(26.75f, 23.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(10.25f, 22.75f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(17.75f, 21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(22.25f, 21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(26.75f, 21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.75f, 18.25f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(22.25f, 18.25f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(26.75f, 18.25f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(7.25f, 13.78f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(-3.515f)
                horizontalLineToRelative(-3.5f)
                lineTo(25.25f, 12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.735f)
                horizontalLineToRelative(-12.5f)
                lineTo(11.75f, 12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.735f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }
            .build()
        return _calendarWeekdayMedium!!
    }

private var _calendarWeekdayMedium: ImageVector? = null
