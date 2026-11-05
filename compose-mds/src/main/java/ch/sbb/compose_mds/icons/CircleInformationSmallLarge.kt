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

public val SBBIcons.CircleInformationSmallLarge: ImageVector
    get() {
        if (_circleInformationSmallLarge != null) {
            return _circleInformationSmallLarge!!
        }
        _circleInformationSmallLarge = Builder(name = "CircleInformationSmallLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 8.0f)
                curveTo(32.15f, 8.0f, 39.0f, 14.848f, 39.0f, 23.5f)
                reflectiveCurveTo(32.15f, 39.0f, 23.5f, 39.0f)
                curveTo(14.848f, 39.0f, 8.0f, 32.152f, 8.0f, 23.5f)
                reflectiveCurveTo(14.848f, 8.0f, 23.5f, 8.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(15.4f, 9.0f, 9.0f, 15.4f, 9.0f, 23.5f)
                reflectiveCurveTo(15.4f, 38.0f, 23.5f, 38.0f)
                curveTo(31.598f, 38.0f, 38.0f, 31.6f, 38.0f, 23.5f)
                reflectiveCurveTo(31.598f, 9.0f, 23.5f, 9.0f)
                moveToRelative(0.46f, 20.98f)
                horizontalLineTo(28.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.96f)
                verticalLineToRelative(-9.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.96f)
                close()
                moveTo(24.0f, 18.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _circleInformationSmallLarge!!
    }

private var _circleInformationSmallLarge: ImageVector? = null
