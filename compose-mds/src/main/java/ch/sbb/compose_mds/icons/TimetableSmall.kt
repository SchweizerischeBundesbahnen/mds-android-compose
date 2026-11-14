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
        _timetableSmall = Builder(name = "TimetableSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 4.0f)
                lineTo(9.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(15.5f, 11.0f)
                curveToRelative(2.48f, 0.0f, 4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveTo(17.98f, 20.0f, 15.5f, 20.0f)
                reflectiveCurveTo(11.0f, 17.98f, 11.0f, 15.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                moveToRelative(0.0f, 10.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                reflectiveCurveTo(18.533f, 10.0f, 15.5f, 10.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, -5.5f, 5.5f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                moveTo(15.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(11.0f, 3.0f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(15.0f, 6.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(22.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(17.0f, 6.0f)
                close()
                moveTo(22.0f, 4.0f)
                lineTo(22.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(9.0f, 6.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 6.0f)
                close()
                moveTo(9.0f, 10.0f)
                lineTo(9.0f, 9.0f)
                lineTo(2.0f, 9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(7.0f, 12.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(7.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(7.0f, 18.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(16.0f, 15.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _timetableSmall!!
    }

private var _timetableSmall: ImageVector? = null
