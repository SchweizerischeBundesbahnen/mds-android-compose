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

public val SBBIcons.CalendarMedium: ImageVector
    get() {
        if (_calendarMedium != null) {
            return _calendarMedium!!
        }
        _calendarMedium = Builder(name = "CalendarMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.75f, 7.5f)
                verticalLineToRelative(1.765f)
                horizontalLineToRelative(12.5f)
                lineTo(24.25f, 7.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.765f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(17.501f)
                lineToRelative(-0.501f, -0.001f)
                lineToRelative(-22.5f, -0.045f)
                lineToRelative(-0.499f, -0.001f)
                lineTo(6.25f, 9.265f)
                horizontalLineToRelative(4.5f)
                lineTo(10.75f, 7.5f)
                close()
                moveTo(24.25f, 10.265f)
                verticalLineToRelative(1.734f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.734f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.515f)
                lineTo(7.25f, 13.78f)
                verticalLineToRelative(-3.515f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.734f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.734f)
                close()
                moveTo(7.25f, 25.721f)
                lineTo(7.25f, 14.78f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(10.984f)
                close()
                moveTo(19.5f, 17.75f)
                horizontalLineToRelative(7.47f)
                verticalLineToRelative(-1.0f)
                lineTo(19.5f, 16.75f)
                close()
                moveTo(16.5f, 20.75f)
                lineTo(9.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(9.0f, 23.75f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 22.75f)
                close()
                moveTo(27.0f, 20.75f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-1.0f)
                lineTo(27.0f, 19.75f)
                close()
                moveTo(19.5f, 23.75f)
                lineTo(27.0f, 23.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }
        .build()
        return _calendarMedium!!
    }

private var _calendarMedium: ImageVector? = null
