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

public val SBBIcons.CirclePentagonMedium: ImageVector
    get() {
        if (_circlePentagonMedium != null) {
            return _circlePentagonMedium!!
        }
        _circlePentagonMedium = Builder(name = "CirclePentagonMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
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
                moveToRelative(0.291f, 6.593f)
                lineToRelative(5.25f, 3.75f)
                lineToRelative(0.209f, 0.15f)
                verticalLineToRelative(9.007f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-9.007f)
                lineToRelative(0.209f, -0.15f)
                lineToRelative(5.25f, -3.75f)
                lineToRelative(0.291f, -0.207f)
                close()
                moveTo(13.25f, 15.258f)
                verticalLineToRelative(7.492f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-7.492f)
                lineTo(18.0f, 11.864f)
                close()
            }
        }
        .build()
        return _circlePentagonMedium!!
    }

private var _circlePentagonMedium: ImageVector? = null
