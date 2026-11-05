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

public val SBBIcons.GearChangingLarge: ImageVector
    get() {
        if (_gearChangingLarge != null) {
            return _gearChangingLarge!!
        }
        _gearChangingLarge = Builder(
            name = "GearChangingLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(23.5f, 4.0f)
                curveTo(34.27f, 4.0f, 43.0f, 12.73f, 43.0f, 23.5f)
                reflectiveCurveTo(34.27f, 43.0f, 23.5f, 43.0f)
                reflectiveCurveTo(4.0f, 34.27f, 4.0f, 23.5f)
                reflectiveCurveTo(12.73f, 4.0f, 23.5f, 4.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(13.282f, 5.0f, 5.0f, 13.282f, 5.0f, 23.5f)
                reflectiveCurveTo(13.282f, 42.0f, 23.5f, 42.0f)
                reflectiveCurveTo(42.0f, 33.718f, 42.0f, 23.5f)
                reflectiveCurveTo(33.718f, 5.0f, 23.5f, 5.0f)
                moveToRelative(0.0f, 2.0f)
                curveTo(32.613f, 7.0f, 40.0f, 14.387f, 40.0f, 23.5f)
                reflectiveCurveTo(32.613f, 40.0f, 23.5f, 40.0f)
                reflectiveCurveTo(7.0f, 32.613f, 7.0f, 23.5f)
                reflectiveCurveTo(14.387f, 7.0f, 23.5f, 7.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(14.94f, 8.0f, 8.0f, 14.94f, 8.0f, 23.5f)
                reflectiveCurveTo(14.94f, 39.0f, 23.5f, 39.0f)
                reflectiveCurveTo(39.0f, 32.06f, 39.0f, 23.5f)
                reflectiveCurveTo(32.06f, 8.0f, 23.5f, 8.0f)
                moveTo(16.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _gearChangingLarge!!
    }

private var _gearChangingLarge: ImageVector? = null
