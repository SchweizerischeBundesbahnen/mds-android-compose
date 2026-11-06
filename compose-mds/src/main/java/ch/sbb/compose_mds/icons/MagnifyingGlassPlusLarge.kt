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

public val SBBIcons.MagnifyingGlassPlusLarge: ImageVector
    get() {
        if (_magnifyingGlassPlusLarge != null) {
            return _magnifyingGlassPlusLarge!!
        }
        _magnifyingGlassPlusLarge = Builder(name = "MagnifyingGlassPlusLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.5f, 3.0f)
                curveTo(9.492f, 3.0f, 3.0f, 9.492f, 3.0f, 17.5f)
                reflectiveCurveTo(9.492f, 32.0f, 17.5f, 32.0f)
                reflectiveCurveTo(32.0f, 25.508f, 32.0f, 17.5f)
                reflectiveCurveTo(25.508f, 3.0f, 17.5f, 3.0f)
                moveTo(2.0f, 17.5f)
                curveTo(2.0f, 8.94f, 8.94f, 2.0f, 17.5f, 2.0f)
                reflectiveCurveTo(33.0f, 8.94f, 33.0f, 17.5f)
                curveToRelative(0.0f, 4.1f, -1.592f, 7.829f, -4.192f, 10.6f)
                lineToRelative(3.868f, 3.869f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(11.324f, 11.324f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.828f, 2.828f)
                lineTo(31.262f, 34.09f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(0.354f, -0.353f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-3.868f, -3.868f)
                arcTo(15.45f, 15.45f, 0.0f, false, true, 17.5f, 33.0f)
                curveTo(8.94f, 33.0f, 2.0f, 26.06f, 2.0f, 17.5f)
                moveToRelative(3.0f, 0.0f)
                curveTo(5.0f, 10.596f, 10.596f, 5.0f, 17.5f, 5.0f)
                reflectiveCurveTo(30.0f, 10.596f, 30.0f, 17.5f)
                reflectiveCurveTo(24.404f, 30.0f, 17.5f, 30.0f)
                reflectiveCurveTo(5.0f, 24.404f, 5.0f, 17.5f)
                moveTo(17.5f, 4.0f)
                curveTo(10.044f, 4.0f, 4.0f, 10.044f, 4.0f, 17.5f)
                reflectiveCurveTo(10.044f, 31.0f, 17.5f, 31.0f)
                reflectiveCurveTo(31.0f, 24.956f, 31.0f, 17.5f)
                reflectiveCurveTo(24.956f, 4.0f, 17.5f, 4.0f)
                moveToRelative(25.793f, 40.707f)
                lineToRelative(-10.97f, -10.97f)
                lineToRelative(1.413f, -1.414f)
                lineToRelative(10.97f, 10.97f)
                arcToRelative(0.999f, 0.999f, 0.0f, true, true, -1.413f, 1.414f)
                moveTo(18.0f, 18.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _magnifyingGlassPlusLarge!!
    }

private var _magnifyingGlassPlusLarge: ImageVector? = null
