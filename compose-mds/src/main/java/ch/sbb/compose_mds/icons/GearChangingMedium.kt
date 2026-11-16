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

public val SBBIcons.GearChangingMedium: ImageVector
    get() {
        if (_gearChangingMedium != null) {
            return _gearChangingMedium!!
        }
        _gearChangingMedium = Builder(name = "GearChangingMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(31.75f, 18.0f)
                curveToRelative(0.0f, -7.594f, -6.156f, -13.75f, -13.75f, -13.75f)
                reflectiveCurveTo(4.25f, 10.406f, 4.25f, 18.0f)
                reflectiveCurveTo(10.406f, 31.75f, 18.0f, 31.75f)
                reflectiveCurveTo(31.75f, 25.594f, 31.75f, 18.0f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 8.147f, -6.603f, 14.75f, -14.75f, 14.75f)
                reflectiveCurveTo(3.25f, 26.147f, 3.25f, 18.0f)
                reflectiveCurveTo(9.853f, 3.25f, 18.0f, 3.25f)
                reflectiveCurveTo(32.75f, 9.853f, 32.75f, 18.0f)
                moveToRelative(-21.0f, 0.25f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.25f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(6.25f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.25f)
                horizontalLineToRelative(7.5f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.25f)
                horizontalLineToRelative(-6.5f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.25f)
                close()
            }
        }
        .build()
        return _gearChangingMedium!!
    }

private var _gearChangingMedium: ImageVector? = null
