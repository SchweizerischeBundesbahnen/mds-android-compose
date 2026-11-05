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

public val SBBIcons.VegetarianSmall: ImageVector
    get() {
        if (_vegetarianSmall != null) {
            return _vegetarianSmall!!
        }
        _vegetarianSmall = Builder(
            name = "VegetarianSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveToRelative(18.365f, 4.426f)
                lineToRelative(-0.067f, -0.442f)
                lineToRelative(-0.446f, 0.016f)
                curveToRelative(-3.465f, 0.128f, -5.975f, 1.037f, -7.772f, 2.381f)
                curveToRelative(-1.796f, 1.344f, -2.839f, 3.094f, -3.42f, 4.837f)
                curveToRelative(-0.578f, 1.74f, -0.7f, 3.48f, -0.652f, 4.832f)
                curveToRelative(0.024f, 0.678f, 0.09f, 1.265f, 0.166f, 1.713f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.152f, 0.7f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -1.776f, 3.32f)
                lineToRelative(0.9f, 0.435f)
                arcToRelative(45.0f, 45.0f, 0.0f, false, true, 1.728f, -3.231f)
                curveToRelative(3.315f, -0.167f, 5.718f, -1.06f, 7.443f, -2.364f)
                curveToRelative(1.774f, -1.343f, 2.79f, -3.09f, 3.351f, -4.83f)
                curveToRelative(1.055f, -3.272f, 0.52f, -6.573f, 0.407f, -7.274f)
                close()
                moveTo(7.811f, 17.942f)
                curveToRelative(2.795f, -0.239f, 4.786f, -1.043f, 6.206f, -2.117f)
                curveToRelative(1.577f, -1.193f, 2.49f, -2.751f, 3.002f, -4.34f)
                curveToRelative(0.86f, -2.666f, 0.58f, -5.375f, 0.424f, -6.464f)
                curveToRelative(-3.068f, 0.18f, -5.236f, 1.017f, -6.764f, 2.161f)
                curveToRelative(-1.602f, 1.198f, -2.541f, 2.762f, -3.07f, 4.352f)
                curveToRelative(-0.532f, 1.595f, -0.648f, 3.21f, -0.603f, 4.481f)
                curveToRelative(0.016f, 0.443f, 0.05f, 0.842f, 0.094f, 1.18f)
                arcToRelative(46.2f, 46.2f, 0.0f, false, true, 8.064f, -9.566f)
                lineToRelative(0.67f, 0.742f)
                arcToRelative(45.2f, 45.2f, 0.0f, false, false, -8.023f, 9.571f)
            }
        }
            .build()
        return _vegetarianSmall!!
    }

private var _vegetarianSmall: ImageVector? = null
