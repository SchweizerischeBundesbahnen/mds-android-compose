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

public val SBBIcons.VeganSmall: ImageVector
    get() {
        if (_veganSmall != null) {
            return _veganSmall!!
        }
        _veganSmall = Builder(name = "VeganSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.92f, 2.0f)
                horizontalLineToRelative(-0.377f)
                lineToRelative(-0.104f, 0.362f)
                arcTo(11.3f, 11.3f, 0.0f, false, false, 2.0f, 5.495f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, false, 5.742f, 10.433f)
                lineToRelative(0.517f, -0.856f)
                arcTo(10.89f, 10.89f, 0.0f, false, true, 3.0f, 5.511f)
                verticalLineToRelative(-0.012f)
                arcTo(10.3f, 10.3f, 0.0f, false, true, 3.304f, 3.0f)
                horizontalLineTo(3.5f)
                curveToRelative(3.303f, 0.0f, 6.238f, 1.038f, 8.115f, 3.318f)
                lineToRelative(0.772f, -0.636f)
                curveTo(10.262f, 3.102f, 6.997f, 2.0f, 3.5f, 2.0f)
                horizontalLineToRelative(-0.58f)
                moveToRelative(18.445f, 2.426f)
                lineToRelative(-0.066f, -0.442f)
                lineToRelative(-0.447f, 0.016f)
                curveToRelative(-3.465f, 0.128f, -5.975f, 1.037f, -7.771f, 2.381f)
                reflectiveCurveToRelative(-2.84f, 3.094f, -3.42f, 4.837f)
                curveToRelative(-0.58f, 1.74f, -0.7f, 3.48f, -0.653f, 4.832f)
                curveToRelative(0.024f, 0.678f, 0.09f, 1.265f, 0.166f, 1.713f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.152f, 0.7f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -1.776f, 3.32f)
                lineToRelative(0.9f, 0.435f)
                arcToRelative(45.0f, 45.0f, 0.0f, false, true, 1.729f, -3.231f)
                curveToRelative(3.314f, -0.167f, 5.717f, -1.06f, 7.442f, -2.364f)
                curveToRelative(1.775f, -1.343f, 2.79f, -3.09f, 3.351f, -4.83f)
                curveToRelative(1.055f, -3.272f, 0.521f, -6.573f, 0.407f, -7.274f)
                close()
                moveTo(10.813f, 17.942f)
                curveToRelative(2.794f, -0.239f, 4.785f, -1.043f, 6.205f, -2.117f)
                curveToRelative(1.577f, -1.193f, 2.49f, -2.751f, 3.002f, -4.34f)
                curveToRelative(0.86f, -2.666f, 0.58f, -5.375f, 0.425f, -6.464f)
                curveToRelative(-3.07f, 0.18f, -5.237f, 1.017f, -6.765f, 2.161f)
                curveToRelative(-1.602f, 1.198f, -2.54f, 2.762f, -3.07f, 4.352f)
                curveToRelative(-0.531f, 1.595f, -0.647f, 3.21f, -0.603f, 4.481f)
                curveToRelative(0.016f, 0.443f, 0.051f, 0.842f, 0.094f, 1.18f)
                arcToRelative(46.2f, 46.2f, 0.0f, false, true, 8.064f, -9.566f)
                lineToRelative(0.67f, 0.742f)
                arcToRelative(45.2f, 45.2f, 0.0f, false, false, -8.022f, 9.571f)
                moveTo(5.765f, 5.576f)
                arcToRelative(17.2f, 17.2f, 0.0f, false, true, 4.12f, 3.605f)
                lineToRelative(-0.77f, 0.638f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -3.88f, -3.395f)
                close()
            }
        }
        .build()
        return _veganSmall!!
    }

private var _veganSmall: ImageVector? = null
