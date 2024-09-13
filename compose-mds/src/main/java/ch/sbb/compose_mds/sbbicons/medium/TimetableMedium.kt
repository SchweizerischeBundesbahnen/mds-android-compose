package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.TimetableMedium: ImageVector
    get() {
        if (_timetableMedium != null) {
            return _timetableMedium!!
        }
        _timetableMedium = Builder(name = "TimetableMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 5.75f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 4.75f)
                close()
                moveTo(16.25f, 23.25f)
                curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                curveToRelative(0.0f, 3.858f, -3.14f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.142f, -7.0f, -7.0f)
                moveToRelative(7.0f, -8.0f)
                curveToRelative(-4.412f, 0.0f, -8.0f, 3.589f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.588f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.588f, -8.0f, -8.0f, -8.0f)
                moveToRelative(-0.75f, -9.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(16.5f, 10.25f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(33.0f, 10.25f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-1.0f)
                lineTo(33.0f, 9.25f)
                close()
                moveTo(25.5f, 5.75f)
                lineTo(33.0f, 5.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(13.5f, 10.25f)
                lineTo(3.0f, 10.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(3.0f, 14.75f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 13.75f)
                close()
                moveTo(10.5f, 19.25f)
                lineTo(3.0f, 19.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(3.0f, 23.75f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 22.75f)
                close()
                moveTo(10.5f, 28.25f)
                lineTo(3.0f, 28.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(22.75f, 18.0f)
                verticalLineToRelative(5.75f)
                horizontalLineToRelative(5.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.75f)
                lineTo(23.75f, 18.0f)
                close()
            }
        }
        .build()
        return _timetableMedium!!
    }

private var _timetableMedium: ImageVector? = null
