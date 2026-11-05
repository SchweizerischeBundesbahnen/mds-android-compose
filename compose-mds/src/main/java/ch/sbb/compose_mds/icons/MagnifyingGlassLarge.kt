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
        _magnifyingGlassLarge = Builder(
            name = "MagnifyingGlassLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
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
                pathFillType = EvenOdd,
            ) {
                moveTo(3.0f, 17.5f)
                curveTo(3.0f, 9.492f, 9.492f, 3.0f, 17.5f, 3.0f)
                reflectiveCurveTo(32.0f, 9.492f, 32.0f, 17.5f)
                reflectiveCurveTo(25.508f, 32.0f, 17.5f, 32.0f)
                reflectiveCurveTo(3.0f, 25.508f, 3.0f, 17.5f)
                moveTo(17.5f, 2.0f)
                curveTo(8.94f, 2.0f, 2.0f, 8.94f, 2.0f, 17.5f)
                reflectiveCurveTo(8.94f, 33.0f, 17.5f, 33.0f)
                curveToRelative(4.1f, 0.0f, 7.829f, -1.592f, 10.601f, -4.192f)
                lineToRelative(3.872f, 3.872f)
                lineToRelative(-0.706f, 0.706f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(11.32f, 11.32f)
                lineToRelative(0.006f, 0.007f)
                lineToRelative(0.006f, 0.006f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.827f, -2.827f)
                lineToRelative(-0.366f, 0.341f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(-11.32f, -11.32f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-3.872f, -3.872f)
                curveTo(31.408f, 25.329f, 33.0f, 21.6f, 33.0f, 17.5f)
                curveTo(33.0f, 8.94f, 26.06f, 2.0f, 17.5f, 2.0f)
                moveTo(5.0f, 17.5f)
                curveTo(5.0f, 10.596f, 10.596f, 5.0f, 17.5f, 5.0f)
                reflectiveCurveTo(30.0f, 10.596f, 30.0f, 17.5f)
                reflectiveCurveTo(24.404f, 30.0f, 17.5f, 30.0f)
                reflectiveCurveTo(5.0f, 24.404f, 5.0f, 17.5f)
                moveTo(17.5f, 4.0f)
                curveTo(10.044f, 4.0f, 4.0f, 10.044f, 4.0f, 17.5f)
                reflectiveCurveTo(10.044f, 31.0f, 17.5f, 31.0f)
                reflectiveCurveTo(31.0f, 24.956f, 31.0f, 17.5f)
                reflectiveCurveTo(24.956f, 4.0f, 17.5f, 4.0f)
                moveToRelative(27.2f, 39.287f)
                lineToRelative(-10.96f, -10.96f)
                lineToRelative(-1.413f, 1.413f)
                lineToRelative(10.96f, 10.96f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.413f, -1.413f)
            }
        }
            .build()
        return _magnifyingGlassLarge!!
    }

private var _magnifyingGlassLarge: ImageVector? = null
