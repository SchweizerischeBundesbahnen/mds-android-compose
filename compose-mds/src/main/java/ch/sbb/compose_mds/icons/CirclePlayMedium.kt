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

public val SBBIcons.CirclePlayMedium: ImageVector
    get() {
        if (_circlePlayMedium != null) {
            return _circlePlayMedium!!
        }
        _circlePlayMedium = Builder(name = "CirclePlayMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 3.25f)
                curveTo(9.853f, 3.25f, 3.25f, 9.853f, 3.25f, 18.0f)
                reflectiveCurveTo(9.853f, 32.75f, 18.0f, 32.75f)
                reflectiveCurveTo(32.75f, 26.146f, 32.75f, 18.0f)
                reflectiveCurveTo(26.147f, 3.25f, 18.0f, 3.25f)
                moveTo(4.25f, 18.0f)
                curveToRelative(0.0f, -7.595f, 6.156f, -13.75f, 13.75f, -13.75f)
                reflectiveCurveTo(31.75f, 10.405f, 31.75f, 18.0f)
                reflectiveCurveTo(25.594f, 31.75f, 18.0f, 31.75f)
                reflectiveCurveTo(4.25f, 25.594f, 4.25f, 18.0f)
                moveToRelative(8.741f, -9.438f)
                lineToRelative(-0.741f, -0.407f)
                verticalLineToRelative(18.978f)
                lineToRelative(0.757f, -0.454f)
                lineToRelative(15.0f, -9.0f)
                lineToRelative(0.746f, -0.448f)
                lineToRelative(-0.762f, -0.419f)
                close()
                moveTo(13.25f, 25.367f)
                lineTo(13.25f, 9.846f)
                lineToRelative(13.497f, 7.423f)
                close()
            }
        }
        .build()
        return _circlePlayMedium!!
    }

private var _circlePlayMedium: ImageVector? = null
