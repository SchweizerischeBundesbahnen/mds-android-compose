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

public val SBBIcons.CircleMinusLarge: ImageVector
    get() {
        if (_circleMinusLarge != null) {
            return _circleMinusLarge!!
        }
        _circleMinusLarge = Builder(name = "CircleMinusLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.5f, 7.0f)
                curveTo(33.612f, 7.0f, 41.0f, 14.388f, 41.0f, 23.5f)
                curveTo(41.0f, 32.614f, 33.612f, 40.0f, 24.5f, 40.0f)
                reflectiveCurveTo(8.0f, 32.614f, 8.0f, 23.5f)
                curveTo(8.0f, 14.388f, 15.388f, 7.0f, 24.5f, 7.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(15.94f, 8.0f, 9.0f, 14.94f, 9.0f, 23.5f)
                curveTo(9.0f, 32.062f, 15.94f, 39.0f, 24.5f, 39.0f)
                reflectiveCurveTo(40.0f, 32.062f, 40.0f, 23.5f)
                curveTo(40.0f, 14.94f, 33.06f, 8.0f, 24.5f, 8.0f)
                moveTo(34.0f, 24.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.0f)
                close()
            }
        }
        .build()
        return _circleMinusLarge!!
    }

private var _circleMinusLarge: ImageVector? = null
