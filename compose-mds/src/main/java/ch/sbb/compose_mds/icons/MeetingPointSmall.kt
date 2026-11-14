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

public val SBBIcons.MeetingPointSmall: ImageVector
    get() {
        if (_meetingPointSmall != null) {
            return _meetingPointSmall!!
        }
        _meetingPointSmall = Builder(name = "MeetingPointSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 7.293f)
                lineTo(7.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 9.0f)
                lineTo(3.0f, 8.0f)
                horizontalLineToRelative(3.293f)
                lineTo(2.897f, 4.604f)
                lineToRelative(0.707f, -0.707f)
                close()
                moveTo(14.0f, 12.5f)
                curveToRelative(0.0f, -1.398f, -1.102f, -2.5f, -2.5f, -2.5f)
                arcTo(2.48f, 2.48f, 0.0f, false, false, 9.0f, 12.5f)
                curveToRelative(0.0f, 1.398f, 1.102f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.102f, 2.5f, -2.5f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.95f, -1.55f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveTo(8.0f, 14.45f, 8.0f, 12.5f)
                reflectiveCurveTo(9.55f, 9.0f, 11.5f, 9.0f)
                reflectiveCurveToRelative(3.5f, 1.55f, 3.5f, 3.5f)
                moveToRelative(1.0f, -5.207f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                lineTo(20.0f, 8.0f)
                horizontalLineToRelative(-3.293f)
                lineToRelative(3.397f, -3.396f)
                lineToRelative(-0.707f, -0.707f)
                close()
                moveTo(20.0f, 16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.293f)
                lineToRelative(3.397f, 3.396f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(16.0f, 17.707f)
                lineTo(16.0f, 21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(8.0f, 16.0f)
                verticalLineToRelative(5.0f)
                lineTo(7.0f, 21.0f)
                verticalLineToRelative(-3.293f)
                lineToRelative(-3.396f, 3.396f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(6.293f, 17.0f)
                lineTo(3.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _meetingPointSmall!!
    }

private var _meetingPointSmall: ImageVector? = null
