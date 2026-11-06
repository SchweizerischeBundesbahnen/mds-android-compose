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

public val SBBIcons.ShoppingBagFastSmall: ImageVector
    get() {
        if (_shoppingBagFastSmall != null) {
            return _shoppingBagFastSmall!!
        }
        _shoppingBagFastSmall = Builder(name = "ShoppingBagFastSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(15.101f, 6.24f)
                lineToRelative(-0.173f, 0.984f)
                lineToRelative(2.955f, 0.521f)
                lineToRelative(0.174f, -0.984f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.956f, -0.52f)
                moveToRelative(3.767f, 1.679f)
                lineToRelative(0.173f, -0.985f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -4.924f, -0.868f)
                lineToRelative(-0.174f, 0.985f)
                lineToRelative(-2.461f, -0.434f)
                lineToRelative(-0.45f, -0.08f)
                lineToRelative(-0.12f, 0.441f)
                lineToRelative(-2.895f, 10.66f)
                lineToRelative(-0.143f, 0.527f)
                lineToRelative(0.54f, 0.096f)
                lineToRelative(11.817f, 2.084f)
                lineToRelative(0.54f, 0.095f)
                lineToRelative(0.045f, -0.546f)
                lineToRelative(0.925f, -11.007f)
                lineToRelative(0.038f, -0.455f)
                lineToRelative(-0.45f, -0.08f)
                close()
                moveTo(17.709f, 8.731f)
                lineTo(17.362f, 10.701f)
                lineTo(18.346f, 10.875f)
                lineTo(18.694f, 8.905f)
                lineTo(20.706f, 9.259f)
                lineTo(19.866f, 19.266f)
                lineTo(9.126f, 17.372f)
                lineTo(11.758f, 7.682f)
                lineTo(13.77f, 8.037f)
                lineTo(13.423f, 10.007f)
                lineTo(14.408f, 10.18f)
                lineTo(14.755f, 8.21f)
                close()
                moveTo(2.0f, 10.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 11.0f)
                close()
                moveTo(4.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 13.0f)
                close()
                moveTo(7.0f, 14.0f)
                lineTo(5.0f, 14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _shoppingBagFastSmall!!
    }

private var _shoppingBagFastSmall: ImageVector? = null
