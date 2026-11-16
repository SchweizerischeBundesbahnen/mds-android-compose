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

public val SBBIcons.TimetableMedium: ImageVector
    get() {
        if (_timetableMedium != null) {
            return _timetableMedium!!
        }
        _timetableMedium = Builder(name = "TimetableMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.5f, 5.75f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 4.75f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(23.25f, 16.25f)
                curveToRelative(3.86f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f)
                curveToRelative(0.0f, 3.858f, -3.14f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.142f, -7.0f, -7.0f)
                curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f)
                moveToRelative(0.0f, 15.0f)
                curveToRelative(4.412f, 0.0f, 8.0f, -3.59f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.588f, -8.0f, -8.0f, -8.0f)
                reflectiveCurveToRelative(-8.0f, 3.589f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.588f, 8.0f, 8.0f, 8.0f)
                moveToRelative(-0.75f, -26.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(22.5f, 10.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 9.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(33.0f, 5.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(13.5f, 9.25f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 10.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(13.5f, 14.75f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 13.75f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(10.5f, 18.25f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 19.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.5f, 23.75f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 22.75f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(10.5f, 27.25f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 28.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(23.75f, 22.75f)
                lineTo(23.75f, 18.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.75f)
                horizontalLineToRelative(5.75f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _timetableMedium!!
    }

private var _timetableMedium: ImageVector? = null
