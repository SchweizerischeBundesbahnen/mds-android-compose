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
                moveTo(18.0f, 4.25f)
                curveToRelative(7.594f, 0.0f, 13.75f, 6.156f, 13.75f, 13.75f)
                reflectiveCurveTo(25.594f, 31.75f, 18.0f, 31.75f)
                reflectiveCurveTo(4.25f, 25.594f, 4.25f, 18.0f)
                reflectiveCurveTo(10.406f, 4.25f, 18.0f, 4.25f)
                moveToRelative(0.0f, 28.5f)
                curveToRelative(8.146f, 0.0f, 14.75f, -6.604f, 14.75f, -14.75f)
                reflectiveCurveTo(26.146f, 3.25f, 18.0f, 3.25f)
                reflectiveCurveTo(3.25f, 9.854f, 3.25f, 18.0f)
                reflectiveCurveTo(9.854f, 32.75f, 18.0f, 32.75f)
                moveTo(18.5f, 9.0f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(17.5f, 9.0f)
                close()
                moveTo(18.5f, 22.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _circleExclamationPointMedium!!
    }

private var _circleExclamationPointMedium: ImageVector? = null
