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

public val SBBIcons.AlarmClockMedium: ImageVector
    get() {
        if (_alarmClockMedium != null) {
            return _alarmClockMedium!!
        }
        _alarmClockMedium = Builder(name = "AlarmClockMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(5.604f, 10.103f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-4.5f, 4.5f)
                close()
                moveTo(18.0f, 7.25f)
                curveToRelative(5.938f, 0.0f, 10.75f, 4.813f, 10.75f, 10.75f)
                reflectiveCurveTo(23.938f, 28.75f, 18.0f, 28.75f)
                reflectiveCurveTo(7.25f, 23.938f, 7.25f, 18.0f)
                reflectiveCurveTo(12.063f, 7.25f, 18.0f, 7.25f)
                moveToRelative(0.0f, 22.5f)
                curveToRelative(6.49f, 0.0f, 11.75f, -5.26f, 11.75f, -11.75f)
                reflectiveCurveTo(24.49f, 6.25f, 18.0f, 6.25f)
                reflectiveCurveTo(6.25f, 11.51f, 6.25f, 18.0f)
                reflectiveCurveTo(11.51f, 29.75f, 18.0f, 29.75f)
                moveTo(31.104f, 9.396f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(0.707f, -0.707f)
                close()
                moveTo(17.75f, 18.25f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.75f)
                horizontalLineToRelative(8.75f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _alarmClockMedium!!
    }

private var _alarmClockMedium: ImageVector? = null
