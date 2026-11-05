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

public val SBBIcons.TimetableLarge: ImageVector
    get() {
        if (_timetableLarge != null) {
            return _timetableLarge!!
        }
        _timetableLarge = Builder(
            name = "TimetableLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(31.5f, 20.0f)
                curveTo(37.29f, 20.0f, 42.0f, 24.71f, 42.0f, 30.5f)
                curveTo(42.0f, 36.288f, 37.29f, 41.0f, 31.5f, 41.0f)
                reflectiveCurveTo(21.0f, 36.288f, 21.0f, 30.5f)
                curveTo(21.0f, 24.71f, 25.71f, 20.0f, 31.5f, 20.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-5.238f, 0.0f, -9.5f, 4.262f, -9.5f, 9.5f)
                curveToRelative(0.0f, 5.236f, 4.262f, 9.5f, 9.5f, 9.5f)
                reflectiveCurveToRelative(9.5f, -4.264f, 9.5f, -9.5f)
                curveToRelative(0.0f, -5.238f, -4.262f, -9.5f, -9.5f, -9.5f)
                moveToRelative(0.5f, 18.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(14.999f, 37.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(14.999f, 31.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(26.0f, 31.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(32.0f, 30.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(14.999f, 25.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(18.999f, 19.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(18.999f, 13.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(30.999f, 13.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(45.0f, 13.0f)
                lineTo(34.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(18.999f, 7.0f)
                horizontalLineToRelative(-15.0f)
                lineTo(3.999f, 6.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(30.999f, 7.0f)
                horizontalLineToRelative(-9.0f)
                lineTo(21.999f, 6.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(45.0f, 7.0f)
                lineTo(34.0f, 7.0f)
                lineTo(34.0f, 6.0f)
                horizontalLineToRelative(11.0f)
                close()
            }
        }
            .build()
        return _timetableLarge!!
    }

private var _timetableLarge: ImageVector? = null
