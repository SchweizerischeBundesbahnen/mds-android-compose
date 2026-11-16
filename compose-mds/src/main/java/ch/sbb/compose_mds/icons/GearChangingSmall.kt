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

public val SBBIcons.GearChangingSmall: ImageVector
    get() {
        if (_gearChangingSmall != null) {
            return _gearChangingSmall!!
        }
        _gearChangingSmall = Builder(name = "GearChangingSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, -9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 9.0f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 9.0f, -9.0f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 5.523f, -4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                moveTo(8.0f, 12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _gearChangingSmall!!
    }

private var _gearChangingSmall: ImageVector? = null
