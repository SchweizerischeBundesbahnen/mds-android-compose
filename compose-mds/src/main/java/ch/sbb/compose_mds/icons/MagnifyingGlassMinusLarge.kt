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

public val SBBIcons.MagnifyingGlassMinusLarge: ImageVector
    get() {
        if (_magnifyingGlassMinusLarge != null) {
            return _magnifyingGlassMinusLarge!!
        }
        _magnifyingGlassMinusLarge = Builder(name = "MagnifyingGlassMinusLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
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
                curveToRelative(4.1f, 0.0f, 7.829f, -1.592f, 10.6f, -4.192f)
                lineToRelative(3.87f, 3.868f)
                lineToRelative(-1.061f, 1.06f)
                lineToRelative(11.677f, 11.678f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.829f, -2.828f)
                lineTo(33.737f, 30.91f)
                lineToRelative(-1.06f, 1.06f)
                close()
                moveTo(30.0f, 17.5f)
                curveTo(30.0f, 10.596f, 24.404f, 5.0f, 17.5f, 5.0f)
                reflectiveCurveTo(5.0f, 10.596f, 5.0f, 17.5f)
                reflectiveCurveTo(10.596f, 30.0f, 17.5f, 30.0f)
                reflectiveCurveTo(30.0f, 24.404f, 30.0f, 17.5f)
                moveToRelative(1.0f, 0.0f)
                curveTo(31.0f, 24.956f, 24.956f, 31.0f, 17.5f, 31.0f)
                reflectiveCurveTo(4.0f, 24.956f, 4.0f, 17.5f)
                reflectiveCurveTo(10.044f, 4.0f, 17.5f, 4.0f)
                reflectiveCurveTo(31.0f, 10.044f, 31.0f, 17.5f)
                moveToRelative(1.323f, 16.237f)
                lineToRelative(10.97f, 10.97f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.415f, -1.414f)
                lineToRelative(-10.971f, -10.97f)
                close()
                moveTo(26.0f, 17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _magnifyingGlassMinusLarge!!
    }

private var _magnifyingGlassMinusLarge: ImageVector? = null
