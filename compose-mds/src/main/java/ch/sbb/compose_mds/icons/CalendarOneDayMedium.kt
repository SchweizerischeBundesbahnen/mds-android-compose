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

public val SBBIcons.CalendarOneDayMedium: ImageVector
    get() {
        if (_calendarOneDayMedium != null) {
            return _calendarOneDayMedium!!
        }
        _calendarOneDayMedium = Builder(name = "CalendarOneDayMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.75f, 9.265f)
                lineTo(11.75f, 7.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.765f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(17.454f)
                lineToRelative(0.499f, 0.001f)
                lineToRelative(22.5f, 0.045f)
                lineToRelative(0.501f, 0.001f)
                lineTo(29.75f, 9.265f)
                horizontalLineToRelative(-4.5f)
                lineTo(25.25f, 7.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.765f)
                close()
                moveTo(24.25f, 11.999f)
                verticalLineToRelative(-1.734f)
                horizontalLineToRelative(-12.5f)
                verticalLineToRelative(1.734f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.734f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.515f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(-3.515f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(1.734f)
                close()
                moveTo(7.25f, 25.721f)
                lineTo(7.25f, 14.78f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(10.984f)
                close()
                moveTo(19.762f, 24.001f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-1.174f)
                quadToRelative(-0.143f, 0.753f, -0.56f, 1.07f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -0.633f, 0.32f)
                quadToRelative(-0.346f, 0.096f, -0.895f, 0.112f)
                verticalLineToRelative(1.088f)
                horizontalLineToRelative(1.764f)
                lineTo(18.264f, 24.0f)
                close()
            }
        }
        .build()
        return _calendarOneDayMedium!!
    }

private var _calendarOneDayMedium: ImageVector? = null
