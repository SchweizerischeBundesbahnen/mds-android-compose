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

public val SBBIcons.CirclePentagonLarge: ImageVector
    get() {
        if (_circlePentagonLarge != null) {
            return _circlePentagonLarge!!
        }
        _circlePentagonLarge = Builder(name = "CirclePentagonLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 4.0f)
                curveTo(34.27f, 4.0f, 43.0f, 12.73f, 43.0f, 23.5f)
                reflectiveCurveTo(34.27f, 43.0f, 23.5f, 43.0f)
                reflectiveCurveTo(4.0f, 34.27f, 4.0f, 23.5f)
                reflectiveCurveTo(12.73f, 4.0f, 23.5f, 4.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(13.283f, 5.0f, 5.0f, 13.283f, 5.0f, 23.5f)
                reflectiveCurveTo(13.283f, 42.0f, 23.5f, 42.0f)
                reflectiveCurveTo(42.0f, 33.717f, 42.0f, 23.5f)
                reflectiveCurveTo(33.717f, 5.0f, 23.5f, 5.0f)
                moveToRelative(0.291f, 9.093f)
                lineToRelative(7.0f, 5.0f)
                lineToRelative(0.209f, 0.15f)
                verticalLineTo(31.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.243f)
                lineToRelative(0.209f, -0.15f)
                lineToRelative(7.0f, -5.0f)
                lineToRelative(0.291f, -0.207f)
                close()
                moveTo(17.0f, 19.758f)
                verticalLineTo(30.0f)
                horizontalLineToRelative(13.0f)
                verticalLineTo(19.758f)
                lineToRelative(-6.5f, -4.644f)
                close()
            }
        }
        .build()
        return _circlePentagonLarge!!
    }

private var _circlePentagonLarge: ImageVector? = null
