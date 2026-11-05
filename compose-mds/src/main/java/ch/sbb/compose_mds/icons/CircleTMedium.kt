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

public val SBBIcons.CircleTMedium: ImageVector
    get() {
        if (_circleTMedium != null) {
            return _circleTMedium!!
        }
        _circleTMedium = Builder(name = "CircleTMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.25f)
                curveToRelative(8.146f, 0.0f, 14.75f, 6.604f, 14.75f, 14.75f)
                reflectiveCurveTo(26.146f, 32.75f, 18.0f, 32.75f)
                reflectiveCurveTo(3.25f, 26.146f, 3.25f, 18.0f)
                reflectiveCurveTo(9.854f, 3.25f, 18.0f, 3.25f)
                moveToRelative(0.0f, 1.0f)
                curveTo(10.406f, 4.25f, 4.25f, 10.406f, 4.25f, 18.0f)
                reflectiveCurveTo(10.406f, 31.75f, 18.0f, 31.75f)
                reflectiveCurveTo(31.75f, 25.594f, 31.75f, 18.0f)
                reflectiveCurveTo(25.594f, 4.25f, 18.0f, 4.25f)
                moveToRelative(5.75f, 10.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(13.25f, 13.75f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-9.5f)
                close()
            }
        }
        .build()
        return _circleTMedium!!
    }

private var _circleTMedium: ImageVector? = null
