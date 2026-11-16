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

public val SBBIcons.MagnifyingGlassLarge: ImageVector
    get() {
        if (_magnifyingGlassLarge != null) {
            return _magnifyingGlassLarge!!
        }
        _magnifyingGlassLarge = Builder(name = "MagnifyingGlassLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.5f, 3.0f)
                curveTo(25.508f, 3.0f, 32.0f, 9.492f, 32.0f, 17.5f)
                reflectiveCurveTo(25.508f, 32.0f, 17.5f, 32.0f)
                reflectiveCurveTo(3.0f, 25.508f, 3.0f, 17.5f)
                reflectiveCurveTo(9.492f, 3.0f, 17.5f, 3.0f)
                moveToRelative(11.308f, 25.1f)
                curveTo(31.408f, 25.33f, 33.0f, 21.6f, 33.0f, 17.5f)
                curveTo(33.0f, 8.94f, 26.06f, 2.0f, 17.5f, 2.0f)
                reflectiveCurveTo(2.0f, 8.94f, 2.0f, 17.5f)
                reflectiveCurveTo(8.94f, 33.0f, 17.5f, 33.0f)
                curveToRelative(4.1f, 0.0f, 7.829f, -1.592f, 10.601f, -4.192f)
                lineToRelative(3.872f, 3.872f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(11.68f, 11.68f)
                lineToRelative(0.007f, 0.006f)
                lineToRelative(0.147f, 0.125f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.679f, -2.952f)
                lineToRelative(-0.36f, 0.335f)
                lineToRelative(0.348f, -0.347f)
                lineTo(33.74f, 30.913f)
                lineToRelative(-1.06f, 1.06f)
                close()
                moveTo(17.5f, 5.0f)
                curveTo(24.404f, 5.0f, 30.0f, 10.596f, 30.0f, 17.5f)
                reflectiveCurveTo(24.404f, 30.0f, 17.5f, 30.0f)
                reflectiveCurveTo(5.0f, 24.404f, 5.0f, 17.5f)
                reflectiveCurveTo(10.596f, 5.0f, 17.5f, 5.0f)
                moveToRelative(0.0f, 26.0f)
                curveTo(24.956f, 31.0f, 31.0f, 24.956f, 31.0f, 17.5f)
                reflectiveCurveTo(24.956f, 4.0f, 17.5f, 4.0f)
                reflectiveCurveTo(4.0f, 10.044f, 4.0f, 17.5f)
                reflectiveCurveTo(10.044f, 31.0f, 17.5f, 31.0f)
                moveToRelative(14.827f, 2.74f)
                lineToRelative(10.954f, 10.954f)
                lineToRelative(0.074f, 0.063f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.402f, -1.403f)
                lineToRelative(-0.063f, -0.073f)
                lineTo(33.74f, 32.327f)
                close()
            }
        }
        .build()
        return _magnifyingGlassLarge!!
    }

private var _magnifyingGlassLarge: ImageVector? = null
