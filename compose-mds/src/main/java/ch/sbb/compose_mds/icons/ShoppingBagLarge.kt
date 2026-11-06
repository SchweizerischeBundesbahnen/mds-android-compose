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

public val SBBIcons.ShoppingBagLarge: ImageVector
    get() {
        if (_shoppingBagLarge != null) {
            return _shoppingBagLarge!!
        }
        _shoppingBagLarge = Builder(name = "ShoppingBagLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 5.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.5f, 5.5f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.005f, 4.412f)
                horizontalLineToRelative(7.97f)
                lineTo(39.0f, 43.378f)
                lineToRelative(0.038f, 0.535f)
                horizontalLineTo(7.963f)
                lineTo(8.0f, 43.378f)
                lineToRelative(2.033f, -28.465f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 23.5f, 5.0f)
                moveTo(9.037f, 42.913f)
                horizontalLineToRelative(28.926f)
                lineToRelative(-1.929f, -27.0f)
                horizontalLineToRelative(-7.04f)
                lineToRelative(-0.008f, 6.588f)
                lineToRelative(-1.0f, -0.002f)
                lineToRelative(0.008f, -6.586f)
                horizontalLineTo(19.0f)
                verticalLineTo(23.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.087f)
                horizontalLineToRelative(-7.034f)
                close()
                moveTo(23.5f, 6.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.5f)
                verticalLineToRelative(4.413f)
                horizontalLineToRelative(8.995f)
                lineTo(28.0f, 10.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 23.5f, 6.0f)
            }
        }
        .build()
        return _shoppingBagLarge!!
    }

private var _shoppingBagLarge: ImageVector? = null
