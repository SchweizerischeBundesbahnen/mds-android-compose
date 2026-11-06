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

public val SBBIcons.CircleTickMedium: ImageVector
    get() {
        if (_circleTickMedium != null) {
            return _circleTickMedium!!
        }
        _circleTickMedium = Builder(name = "CircleTickMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.25f, 18.0f)
                curveToRelative(0.0f, -7.595f, 6.156f, -13.75f, 13.75f, -13.75f)
                reflectiveCurveTo(31.75f, 10.405f, 31.75f, 18.0f)
                reflectiveCurveTo(25.594f, 31.75f, 18.0f, 31.75f)
                reflectiveCurveTo(4.25f, 25.594f, 4.25f, 18.0f)
                moveTo(18.0f, 3.25f)
                curveTo(9.853f, 3.25f, 3.25f, 9.853f, 3.25f, 18.0f)
                reflectiveCurveTo(9.853f, 32.75f, 18.0f, 32.75f)
                reflectiveCurveTo(32.75f, 26.146f, 32.75f, 18.0f)
                reflectiveCurveTo(26.147f, 3.25f, 18.0f, 3.25f)
                moveToRelative(-1.854f, 19.555f)
                lineToRelative(7.5f, -9.75f)
                lineToRelative(-0.792f, -0.61f)
                lineToRelative(-7.19f, 9.346f)
                lineToRelative(-3.352f, -2.681f)
                lineToRelative(-0.624f, 0.78f)
                lineToRelative(3.75f, 3.0f)
                lineToRelative(0.398f, 0.319f)
                close()
            }
        }
        .build()
        return _circleTickMedium!!
    }

private var _circleTickMedium: ImageVector? = null
