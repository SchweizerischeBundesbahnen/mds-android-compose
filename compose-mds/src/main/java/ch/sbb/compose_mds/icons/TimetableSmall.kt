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

public val SBBIcons.TimetableSmall: ImageVector
    get() {
        if (_timetableSmall != null) {
            return _timetableSmall!!
        }
        _timetableSmall = Builder(
            name = "TimetableSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(2.0f, 4.0f)
                horizontalLineToRelative(7.0f)
                lineTo(9.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(11.0f, 15.5f)
                curveToRelative(0.0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                moveToRelative(4.5f, -5.5f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, -5.5f, 5.5f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.468f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.467f, -5.5f, -5.5f, -5.5f)
                moveTo(15.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(11.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                lineTo(15.0f, 6.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(22.0f, 7.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(17.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(17.0f, 4.0f)
                horizontalLineToRelative(5.0f)
                lineTo(22.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(9.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 6.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(2.0f, 10.0f)
                horizontalLineToRelative(7.0f)
                lineTo(9.0f, 9.0f)
                lineTo(2.0f, 9.0f)
                close()
                moveTo(7.0f, 13.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 15.0f)
                close()
                moveTo(7.0f, 19.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(15.0f, 12.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
            .build()
        return _timetableSmall!!
    }

private var _timetableSmall: ImageVector? = null
