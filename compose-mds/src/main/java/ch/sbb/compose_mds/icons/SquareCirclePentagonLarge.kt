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

public val SBBIcons.SquareCirclePentagonLarge: ImageVector
    get() {
        if (_squareCirclePentagonLarge != null) {
            return _squareCirclePentagonLarge!!
        }
        _squareCirclePentagonLarge = Builder(name = "SquareCirclePentagonLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.0f, 43.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(39.0f)
                close()
                moveTo(5.0f, 42.0f)
                horizontalLineToRelative(37.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(23.5f, 8.0f)
                curveTo(32.06f, 8.0f, 39.0f, 14.94f, 39.0f, 23.5f)
                reflectiveCurveTo(32.06f, 39.0f, 23.5f, 39.0f)
                reflectiveCurveTo(8.0f, 32.06f, 8.0f, 23.5f)
                reflectiveCurveTo(14.94f, 8.0f, 23.5f, 8.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(15.492f, 9.0f, 9.0f, 15.492f, 9.0f, 23.5f)
                reflectiveCurveTo(15.492f, 38.0f, 23.5f, 38.0f)
                reflectiveCurveTo(38.0f, 31.508f, 38.0f, 23.5f)
                reflectiveCurveTo(31.508f, 9.0f, 23.5f, 9.0f)
                moveToRelative(0.248f, 6.065f)
                lineToRelative(7.0f, 4.0f)
                lineToRelative(0.252f, 0.145f)
                verticalLineTo(31.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.21f)
                lineToRelative(0.252f, -0.145f)
                lineToRelative(7.0f, -4.0f)
                lineToRelative(0.248f, -0.141f)
                close()
                moveTo(17.0f, 19.79f)
                verticalLineTo(30.0f)
                horizontalLineToRelative(13.0f)
                verticalLineTo(19.79f)
                lineToRelative(-6.5f, -3.714f)
                close()
            }
        }
        .build()
        return _squareCirclePentagonLarge!!
    }

private var _squareCirclePentagonLarge: ImageVector? = null
