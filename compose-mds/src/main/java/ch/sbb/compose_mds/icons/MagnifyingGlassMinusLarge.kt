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
        _magnifyingGlassMinusLarge = Builder(
            name = "MagnifyingGlassMinusLarge",
            defaultWidth =
                48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight =
            48.0f,
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
                curveToRelative(4.1f, 0.0f, 7.829f, -1.592f, 10.6f, -4.192f)
                lineToRelative(3.869f, 3.868f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(11.324f, 11.324f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.828f, -2.828f)
                lineTo(34.09f, 31.262f)
                lineToRelative(-0.353f, -0.354f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-3.868f, -3.868f)
                curveTo(31.408f, 25.329f, 33.0f, 21.6f, 33.0f, 17.5f)
                curveTo(33.0f, 8.94f, 26.06f, 2.0f, 17.5f, 2.0f)
                moveToRelative(0.0f, 3.0f)
                curveTo(10.596f, 5.0f, 5.0f, 10.596f, 5.0f, 17.5f)
                reflectiveCurveTo(10.596f, 30.0f, 17.5f, 30.0f)
                reflectiveCurveTo(30.0f, 24.404f, 30.0f, 17.5f)
                reflectiveCurveTo(24.404f, 5.0f, 17.5f, 5.0f)
                moveTo(4.0f, 17.5f)
                curveTo(4.0f, 10.044f, 10.044f, 4.0f, 17.5f, 4.0f)
                reflectiveCurveTo(31.0f, 10.044f, 31.0f, 17.5f)
                reflectiveCurveTo(24.956f, 31.0f, 17.5f, 31.0f)
                reflectiveCurveTo(4.0f, 24.956f, 4.0f, 17.5f)
                moveToRelative(28.323f, 16.237f)
                lineToRelative(10.97f, 10.97f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, -1.414f)
                lineToRelative(-10.97f, -10.97f)
                close()
                moveTo(26.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.0f)
                close()
            }
        }
            .build()
        return _magnifyingGlassMinusLarge!!
    }

private var _magnifyingGlassMinusLarge: ImageVector? = null
