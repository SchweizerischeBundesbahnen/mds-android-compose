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

public val SBBIcons.CircleTickLarge: ImageVector
    get() {
        if (_circleTickLarge != null) {
            return _circleTickLarge!!
        }
        _circleTickLarge = Builder(name = "CircleTickLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 24.0f)
                curveTo(3.0f, 12.401f, 12.401f, 3.0f, 24.0f, 3.0f)
                reflectiveCurveToRelative(21.0f, 9.401f, 21.0f, 21.0f)
                reflectiveCurveToRelative(-9.401f, 21.0f, -21.0f, 21.0f)
                reflectiveCurveTo(3.0f, 35.599f, 3.0f, 24.0f)
                moveTo(24.0f, 2.0f)
                curveTo(11.85f, 2.0f, 2.0f, 11.85f, 2.0f, 24.0f)
                reflectiveCurveToRelative(9.85f, 22.0f, 22.0f, 22.0f)
                reflectiveCurveToRelative(22.0f, -9.85f, 22.0f, -22.0f)
                reflectiveCurveTo(36.15f, 2.0f, 24.0f, 2.0f)
                moveToRelative(8.224f, 13.553f)
                lineToRelative(-0.382f, -0.191f)
                lineToRelative(-0.249f, 0.347f)
                lineToRelative(-9.718f, 13.606f)
                lineToRelative(-5.598f, -3.731f)
                lineToRelative(-0.47f, -0.314f)
                lineToRelative(-0.254f, 0.506f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-0.198f, 0.395f)
                lineToRelative(0.368f, 0.245f)
                lineToRelative(7.5f, 5.0f)
                lineToRelative(0.401f, 0.268f)
                lineToRelative(0.282f, -0.392f)
                lineToRelative(11.5f, -16.0f)
                lineToRelative(0.343f, -0.477f)
                lineToRelative(-0.525f, -0.262f)
                close()
                moveTo(22.407f, 30.29f)
                lineToRelative(9.751f, -13.653f)
                lineToRelative(1.093f, 0.547f)
                lineToRelative(-10.875f, 15.131f)
                lineToRelative(-6.731f, -4.487f)
                lineToRelative(0.549f, -1.099f)
                lineToRelative(5.529f, 3.686f)
                lineToRelative(0.402f, 0.269f)
                close()
            }
        }
        .build()
        return _circleTickLarge!!
    }

private var _circleTickLarge: ImageVector? = null
