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

public val SBBIcons.MeetingPointLarge: ImageVector
    get() {
        if (_meetingPointLarge != null) {
            return _meetingPointLarge!!
        }
        _meetingPointLarge = Builder(name = "MeetingPointLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 42.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-8.293f)
                lineToRelative(-7.646f, 7.646f)
                lineToRelative(-0.708f, -0.706f)
                lineTo(14.293f, 33.0f)
                lineTo(6.0f, 33.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(41.0f, 33.0f)
                horizontalLineToRelative(-8.293f)
                lineToRelative(7.646f, 7.647f)
                lineToRelative(-0.706f, 0.706f)
                lineTo(32.0f, 33.707f)
                lineTo(32.0f, 42.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(31.0f, 32.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(23.5f, 18.0f)
                curveToRelative(3.624f, 0.0f, 6.5f, 2.876f, 6.5f, 6.5f)
                reflectiveCurveTo(27.124f, 31.0f, 23.5f, 31.0f)
                arcToRelative(6.457f, 6.457f, 0.0f, false, true, -6.5f, -6.5f)
                curveToRelative(0.0f, -3.624f, 2.876f, -6.5f, 6.5f, -6.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(5.457f, 5.457f, 0.0f, false, false, -5.5f, 5.5f)
                curveToRelative(0.0f, 3.072f, 2.428f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.428f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.428f, -5.5f, -5.5f, -5.5f)
                moveTo(16.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.293f)
                lineTo(6.646f, 8.354f)
                lineToRelative(0.708f, -0.708f)
                lineTo(15.0f, 15.293f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(32.0f, 15.293f)
                lineTo(39.647f, 7.646f)
                lineTo(40.353f, 8.354f)
                lineTo(32.707f, 16.0f)
                lineTo(41.0f, 16.0f)
                verticalLineToRelative(1.0f)
                lineTo(31.0f, 17.0f)
                lineTo(31.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _meetingPointLarge!!
    }

private var _meetingPointLarge: ImageVector? = null
