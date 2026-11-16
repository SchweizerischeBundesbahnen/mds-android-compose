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
                moveTo(24.0f, 3.0f)
                curveToRelative(11.599f, 0.0f, 21.0f, 9.401f, 21.0f, 21.0f)
                reflectiveCurveToRelative(-9.401f, 21.0f, -21.0f, 21.0f)
                reflectiveCurveTo(3.0f, 35.599f, 3.0f, 24.0f)
                reflectiveCurveTo(12.401f, 3.0f, 24.0f, 3.0f)
                moveToRelative(0.0f, 43.0f)
                curveToRelative(12.15f, 0.0f, 22.0f, -9.85f, 22.0f, -22.0f)
                reflectiveCurveTo(36.15f, 2.0f, 24.0f, 2.0f)
                reflectiveCurveTo(2.0f, 11.85f, 2.0f, 24.0f)
                reflectiveCurveToRelative(9.85f, 22.0f, 22.0f, 22.0f)
                moveToRelative(10.749f, -29.185f)
                lineToRelative(-2.525f, -1.262f)
                lineToRelative(-0.382f, -0.192f)
                lineToRelative(-0.25f, 0.348f)
                lineToRelative(-9.718f, 13.606f)
                lineToRelative(-5.597f, -3.731f)
                lineToRelative(-0.471f, -0.314f)
                lineToRelative(-0.253f, 0.506f)
                lineToRelative(-1.198f, 2.395f)
                lineToRelative(0.368f, 0.245f)
                lineToRelative(7.901f, 5.268f)
                lineToRelative(0.282f, -0.392f)
                lineToRelative(11.5f, -16.0f)
                close()
                moveTo(22.125f, 30.685f)
                lineTo(22.407f, 30.291f)
                lineTo(32.158f, 16.638f)
                lineTo(33.251f, 17.185f)
                lineTo(22.375f, 32.315f)
                lineTo(15.645f, 27.828f)
                lineTo(16.193f, 26.73f)
                lineTo(21.723f, 30.416f)
                close()
            }
        }
        .build()
        return _circleTickLarge!!
    }

private var _circleTickLarge: ImageVector? = null
