package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.AlarmClockSmall: ImageVector
    get() {
        if (_alarmClockSmall != null) {
            return _alarmClockSmall!!
        }
        _alarmClockSmall = Builder(name = "AlarmClockSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(3.854f, 6.853f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(-3.0f, 3.0f)
                close()
                moveTo(5.0f, 12.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 14.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -14.0f, 0.0f)
                moveToRelative(7.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                moveToRelative(8.147f, 2.853f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(3.0f, 3.0f)
                close()
                moveTo(11.0f, 7.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _alarmClockSmall!!
    }

private var _alarmClockSmall: ImageVector? = null
