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

public val SBBIcons.CircleEmptyLarge: ImageVector
    get() {
        if (_circleEmptyLarge != null) {
            return _circleEmptyLarge!!
        }
        _circleEmptyLarge = Builder(name = "CircleEmptyLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 4.999f)
                curveToRelative(10.77f, 0.0f, 19.5f, 8.73f, 19.5f, 19.5f)
                reflectiveCurveToRelative(-8.73f, 19.5f, -19.5f, 19.5f)
                reflectiveCurveTo(4.0f, 35.269f, 4.0f, 24.499f)
                reflectiveCurveToRelative(8.73f, -19.5f, 19.5f, -19.5f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-10.218f, 0.0f, -18.5f, 8.282f, -18.5f, 18.5f)
                reflectiveCurveToRelative(8.282f, 18.5f, 18.5f, 18.5f)
                reflectiveCurveTo(42.0f, 34.717f, 42.0f, 24.499f)
                reflectiveCurveToRelative(-8.282f, -18.5f, -18.5f, -18.5f)
            }
        }
        .build()
        return _circleEmptyLarge!!
    }

private var _circleEmptyLarge: ImageVector? = null
