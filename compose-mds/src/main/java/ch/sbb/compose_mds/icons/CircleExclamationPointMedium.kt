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

public val SBBIcons.CircleExclamationPointMedium: ImageVector
    get() {
        if (_circleExclamationPointMedium != null) {
            return _circleExclamationPointMedium!!
        }
        _circleExclamationPointMedium = Builder(name = "CircleExclamationPointMedium", defaultWidth
                = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.25f, 18.0f)
                curveToRelative(0.0f, -7.594f, 6.156f, -13.75f, 13.75f, -13.75f)
                reflectiveCurveTo(31.75f, 10.406f, 31.75f, 18.0f)
                reflectiveCurveTo(25.594f, 31.75f, 18.0f, 31.75f)
                reflectiveCurveTo(4.25f, 25.594f, 4.25f, 18.0f)
                moveTo(18.0f, 3.25f)
                curveTo(9.854f, 3.25f, 3.25f, 9.854f, 3.25f, 18.0f)
                reflectiveCurveTo(9.854f, 32.75f, 18.0f, 32.75f)
                reflectiveCurveTo(32.75f, 26.146f, 32.75f, 18.0f)
                reflectiveCurveTo(26.146f, 3.25f, 18.0f, 3.25f)
                moveTo(18.5f, 9.0f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(17.5f, 9.0f)
                close()
                moveTo(17.5f, 25.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _circleExclamationPointMedium!!
    }

private var _circleExclamationPointMedium: ImageVector? = null
