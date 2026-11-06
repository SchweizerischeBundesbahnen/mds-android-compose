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

public val SBBIcons.ShopLarge: ImageVector
    get() {
        if (_shopLarge != null) {
            return _shopLarge!!
        }
        _shopLarge = Builder(name = "ShopLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(39.982f, 8.342f)
                lineToRelative(2.0f, 6.0f)
                lineTo(42.2f, 15.0f)
                horizontalLineToRelative(-0.222f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -1.97f, 3.495f)
                lineTo(40.008f, 39.0f)
                horizontalLineToRelative(-33.0f)
                lineTo(7.008f, 18.499f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 5.03f, 15.0f)
                horizontalLineToRelative(-0.217f)
                lineToRelative(0.218f, -0.658f)
                lineToRelative(2.0f, -6.0f)
                lineTo(7.147f, 8.0f)
                horizontalLineToRelative(32.72f)
                close()
                moveTo(32.504f, 16.675f)
                arcToRelative(4.996f, 4.996f, 0.0f, false, true, -9.0f, 0.0f)
                arcToRelative(4.996f, 4.996f, 0.0f, false, true, -9.0f, 0.0f)
                arcToRelative(4.996f, 4.996f, 0.0f, false, true, -6.497f, 2.406f)
                lineTo(8.007f, 38.0f)
                horizontalLineToRelative(19.0f)
                lineTo(27.007f, 22.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(3.0f)
                lineTo(39.007f, 19.08f)
                arcToRelative(4.997f, 4.997f, 0.0f, false, true, -6.503f, -2.404f)
                moveTo(28.007f, 38.0f)
                horizontalLineToRelative(7.0f)
                lineTo(35.007f, 23.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(24.007f, 31.0f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(12.007f, 30.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(6.04f, 15.0f)
                arcToRelative(3.997f, 3.997f, 0.0f, false, false, 7.931f, 0.0f)
                close()
                moveTo(15.04f, 15.0f)
                arcToRelative(3.997f, 3.997f, 0.0f, false, false, 7.931f, 0.0f)
                close()
                moveTo(24.04f, 15.0f)
                arcToRelative(3.997f, 3.997f, 0.0f, false, false, 7.931f, 0.0f)
                close()
                moveTo(33.04f, 15.0f)
                arcToRelative(3.997f, 3.997f, 0.0f, false, false, 7.931f, 0.0f)
                close()
                moveTo(6.201f, 14.0f)
                horizontalLineToRelative(34.612f)
                lineToRelative(-1.666f, -5.0f)
                lineTo(7.867f, 9.0f)
                close()
            }
        }
        .build()
        return _shopLarge!!
    }

private var _shopLarge: ImageVector? = null
