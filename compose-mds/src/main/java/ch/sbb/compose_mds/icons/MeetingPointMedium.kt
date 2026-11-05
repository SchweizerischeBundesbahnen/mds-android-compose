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

public val SBBIcons.MeetingPointMedium: ImageVector
    get() {
        if (_meetingPointMedium != null) {
            return _meetingPointMedium!!
        }
        _meetingPointMedium = Builder(
            name = "MeetingPointMedium",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(11.75f, 6.0f)
                verticalLineToRelative(7.25f)
                lineTo(4.5f, 13.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.543f)
                lineTo(4.52f, 6.73f)
                lineToRelative(0.708f, -0.707f)
                lineToRelative(5.521f, 5.521f)
                lineTo(10.749f, 6.0f)
                close()
                moveTo(17.25f, 14.75f)
                curveToRelative(-2.235f, 0.0f, -4.0f, 1.766f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.765f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.765f, 4.0f, -4.0f)
                curveToRelative(0.0f, -2.234f, -1.765f, -4.0f, -4.0f, -4.0f)
                moveToRelative(-5.0f, 4.0f)
                curveToRelative(0.0f, -2.787f, 2.213f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.213f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.213f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.212f, -5.0f, -5.0f)
                moveToRelative(10.5f, -6.0f)
                lineTo(22.75f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.543f)
                lineToRelative(5.521f, -5.521f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(-5.522f, 5.522f)
                lineTo(30.0f, 12.251f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.25f)
                close()
                moveTo(22.75f, 24.25f)
                lineTo(30.0f, 24.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.543f)
                lineToRelative(5.522f, 5.521f)
                lineToRelative(-0.708f, 0.707f)
                lineToRelative(-5.521f, -5.521f)
                lineTo(23.75f, 31.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.25f)
                moveToRelative(-18.25f, 0.0f)
                horizontalLineToRelative(7.25f)
                verticalLineToRelative(7.25f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.543f)
                lineToRelative(-5.521f, 5.521f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(5.522f, -5.521f)
                lineTo(4.5f, 25.25f)
                close()
            }
        }
            .build()
        return _meetingPointMedium!!
    }

private var _meetingPointMedium: ImageVector? = null
