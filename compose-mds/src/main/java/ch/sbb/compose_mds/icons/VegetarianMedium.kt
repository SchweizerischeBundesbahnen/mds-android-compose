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

public val SBBIcons.VegetarianMedium: ImageVector
    get() {
        if (_vegetarianMedium != null) {
            return _vegetarianMedium!!
        }
        _vegetarianMedium = Builder(name = "VegetarianMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(27.3f, 6.676f)
                lineToRelative(-0.067f, -0.442f)
                lineToRelative(-0.446f, 0.016f)
                curveToRelative(-5.158f, 0.19f, -8.871f, 1.543f, -11.516f, 3.522f)
                curveToRelative(-2.646f, 1.98f, -4.185f, 4.558f, -5.043f, 7.134f)
                curveToRelative(-0.856f, 2.573f, -1.037f, 5.151f, -0.966f, 7.16f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.245f, 2.538f)
                curveToRelative(0.056f, 0.33f, 0.115f, 0.613f, 0.172f, 0.837f)
                quadToRelative(0.039f, 0.153f, 0.082f, 0.286f)
                arcToRelative(69.0f, 69.0f, 0.0f, false, false, -2.711f, 5.055f)
                lineToRelative(0.9f, 0.436f)
                quadToRelative(1.234f, -2.55f, 2.67f, -4.98f)
                curveToRelative(5.003f, -0.231f, 8.598f, -1.565f, 11.16f, -3.503f)
                curveToRelative(2.613f, -1.977f, 4.11f, -4.551f, 4.94f, -7.123f)
                curveToRelative(1.564f, -4.847f, 0.772f, -9.744f, 0.602f, -10.795f)
                close()
                moveTo(11.247f, 27.2f)
                curveToRelative(4.487f, -0.306f, 7.672f, -1.555f, 9.93f, -3.263f)
                curveToRelative(2.416f, -1.827f, 3.81f, -4.212f, 4.592f, -6.632f)
                curveToRelative(1.372f, -4.255f, 0.835f, -8.573f, 0.612f, -10.036f)
                curveToRelative(-4.763f, 0.243f, -8.134f, 1.525f, -10.511f, 3.304f)
                curveToRelative(-2.451f, 1.834f, -3.886f, 4.225f, -4.693f, 6.65f)
                curveToRelative(-0.809f, 2.428f, -0.984f, 4.88f, -0.916f, 6.808f)
                arcToRelative(19.0f, 19.0f, 0.0f, false, false, 0.243f, 2.469f)
                arcToRelative(69.0f, 69.0f, 0.0f, false, true, 12.41f, -14.871f)
                lineToRelative(0.671f, 0.742f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -12.339f, 14.83f)
            }
        }
        .build()
        return _vegetarianMedium!!
    }

private var _vegetarianMedium: ImageVector? = null
