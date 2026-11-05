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

public val SBBIcons.CircleCrossLarge: ImageVector
    get() {
        if (_circleCrossLarge != null) {
            return _circleCrossLarge!!
        }
        _circleCrossLarge = Builder(name = "CircleCrossLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.0f)
                curveToRelative(12.15f, 0.0f, 22.0f, 9.85f, 22.0f, 22.0f)
                reflectiveCurveToRelative(-9.85f, 22.0f, -22.0f, 22.0f)
                reflectiveCurveTo(2.0f, 36.15f, 2.0f, 24.0f)
                reflectiveCurveTo(11.85f, 2.0f, 24.0f, 2.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(12.402f, 3.0f, 3.0f, 12.402f, 3.0f, 24.0f)
                reflectiveCurveToRelative(9.402f, 21.0f, 21.0f, 21.0f)
                reflectiveCurveToRelative(21.0f, -9.402f, 21.0f, -21.0f)
                reflectiveCurveTo(35.598f, 3.0f, 24.0f, 3.0f)
                moveToRelative(8.353f, 13.354f)
                lineTo(24.707f, 24.0f)
                lineToRelative(7.646f, 7.647f)
                lineToRelative(-0.707f, 0.706f)
                lineTo(24.0f, 24.707f)
                lineToRelative(-7.646f, 7.646f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(23.293f, 24.0f)
                lineToRelative(-7.646f, -7.646f)
                lineToRelative(0.707f, -0.707f)
                lineTo(24.0f, 23.293f)
                lineToRelative(7.647f, -7.646f)
                close()
            }
        }
        .build()
        return _circleCrossLarge!!
    }

private var _circleCrossLarge: ImageVector? = null
