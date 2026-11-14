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
                moveTo(18.0f, 4.25f)
                curveToRelative(7.594f, 0.0f, 13.75f, 6.155f, 13.75f, 13.75f)
                reflectiveCurveTo(25.594f, 31.75f, 18.0f, 31.75f)
                reflectiveCurveTo(4.25f, 25.594f, 4.25f, 18.0f)
                reflectiveCurveTo(10.406f, 4.25f, 18.0f, 4.25f)
                moveToRelative(0.0f, 28.5f)
                curveToRelative(8.147f, 0.0f, 14.75f, -6.604f, 14.75f, -14.75f)
                reflectiveCurveTo(26.147f, 3.25f, 18.0f, 3.25f)
                reflectiveCurveTo(3.25f, 9.853f, 3.25f, 18.0f)
                reflectiveCurveTo(9.853f, 32.75f, 18.0f, 32.75f)
                moveToRelative(-1.854f, -9.945f)
                lineToRelative(7.5f, -9.75f)
                lineToRelative(-0.793f, -0.61f)
                lineToRelative(-7.189f, 9.345f)
                lineToRelative(-3.351f, -2.68f)
                lineToRelative(-0.626f, 0.78f)
                lineToRelative(3.75f, 3.0f)
                lineToRelative(0.399f, 0.319f)
                close()
            }
        }
        .build()
        return _circleTickMedium!!
    }

private var _circleTickMedium: ImageVector? = null
