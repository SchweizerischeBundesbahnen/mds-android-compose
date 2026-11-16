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

public val SBBIcons.CalendarOneDaySmall: ImageVector
    get() {
        if (_calendarOneDaySmall != null) {
            return _calendarOneDaySmall!!
        }
        _calendarOneDaySmall = Builder(name = "CalendarOneDaySmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 6.01f)
                lineTo(8.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                verticalLineToRelative(1.01f)
                lineTo(4.0f, 6.01f)
                verticalLineToRelative(11.969f)
                horizontalLineToRelative(0.499f)
                lineToRelative(15.0f, 0.031f)
                lineToRelative(0.501f, 0.001f)
                lineTo(20.0f, 6.01f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.01f)
                close()
                moveTo(16.0f, 8.0f)
                verticalLineToRelative(-0.99f)
                lineTo(8.0f, 7.01f)
                lineTo(8.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                verticalLineToRelative(-0.99f)
                lineTo(5.0f, 7.01f)
                verticalLineToRelative(2.01f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 7.01f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.0f, 8.0f)
                close()
                moveTo(5.0f, 16.98f)
                lineToRelative(14.0f, 0.028f)
                lineTo(19.0f, 10.02f)
                lineTo(5.0f, 10.02f)
                close()
                moveTo(13.175f, 16.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-0.783f)
                quadToRelative(-0.096f, 0.503f, -0.373f, 0.714f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -0.422f, 0.213f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, -0.597f, 0.075f)
                verticalLineToRelative(0.725f)
                horizontalLineToRelative(1.176f)
                lineTo(12.176f, 16.0f)
                close()
            }
        }
        .build()
        return _calendarOneDaySmall!!
    }

private var _calendarOneDaySmall: ImageVector? = null
