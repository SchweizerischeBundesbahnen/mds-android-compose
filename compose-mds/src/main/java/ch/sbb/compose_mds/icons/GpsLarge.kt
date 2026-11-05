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

public val SBBIcons.GpsLarge: ImageVector
    get() {
        if (_gpsLarge != null) {
            return _gpsLarge!!
        }
        _gpsLarge = Builder(name = "GpsLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.0f, 8.007f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.007f)
                arcTo(16.466f, 16.466f, 0.0f, false, false, 8.007f, 24.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.007f)
                arcTo(16.466f, 16.466f, 0.0f, false, false, 24.0f, 40.993f)
                verticalLineTo(46.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.007f)
                arcTo(16.466f, 16.466f, 0.0f, false, false, 40.993f, 25.0f)
                horizontalLineToRelative(5.006f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.006f)
                arcTo(16.466f, 16.466f, 0.0f, false, false, 25.0f, 8.007f)
                moveTo(9.0f, 24.5f)
                curveTo(9.0f, 15.915f, 15.915f, 9.0f, 24.5f, 9.0f)
                reflectiveCurveTo(40.0f, 15.915f, 40.0f, 24.5f)
                reflectiveCurveTo(33.085f, 40.0f, 24.5f, 40.0f)
                reflectiveCurveTo(9.0f, 33.085f, 9.0f, 24.5f)
                moveToRelative(7.0f, 0.0f)
                curveToRelative(0.0f, -4.708f, 3.792f, -8.5f, 8.5f, -8.5f)
                reflectiveCurveToRelative(8.5f, 3.792f, 8.5f, 8.5f)
                reflectiveCurveToRelative(-3.792f, 8.5f, -8.5f, 8.5f)
                arcToRelative(8.483f, 8.483f, 0.0f, false, true, -8.5f, -8.5f)
                moveToRelative(8.5f, -9.5f)
                curveToRelative(-5.26f, 0.0f, -9.5f, 4.24f, -9.5f, 9.5f)
                reflectiveCurveToRelative(4.24f, 9.5f, 9.5f, 9.5f)
                reflectiveCurveToRelative(9.5f, -4.24f, 9.5f, -9.5f)
                reflectiveCurveToRelative(-4.24f, -9.5f, -9.5f, -9.5f)
            }
        }
        .build()
        return _gpsLarge!!
    }

private var _gpsLarge: ImageVector? = null
