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

public val SBBIcons.CalendarSmall: ImageVector
    get() {
        if (_calendarSmall != null) {
            return _calendarSmall!!
        }
        _calendarSmall = Builder(name = "CalendarSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 5.0f)
                verticalLineToRelative(1.01f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.01f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(12.001f)
                lineToRelative(-0.501f, -0.001f)
                lineToRelative(-15.0f, -0.03f)
                lineTo(4.0f, 17.979f)
                lineTo(4.0f, 6.01f)
                horizontalLineToRelative(3.0f)
                lineTo(7.0f, 5.0f)
                close()
                moveTo(16.0f, 7.01f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.99f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.01f)
                lineTo(5.0f, 9.02f)
                lineTo(5.0f, 7.01f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.99f)
                close()
                moveTo(5.0f, 16.981f)
                lineTo(5.0f, 10.02f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(6.989f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineToRelative(4.98f)
                verticalLineToRelative(-1.0f)
                lineTo(13.0f, 11.0f)
                close()
                moveTo(11.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(6.0f, 16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 15.0f)
                close()
                moveTo(18.0f, 14.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(13.0f, 16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _calendarSmall!!
    }

private var _calendarSmall: ImageVector? = null
