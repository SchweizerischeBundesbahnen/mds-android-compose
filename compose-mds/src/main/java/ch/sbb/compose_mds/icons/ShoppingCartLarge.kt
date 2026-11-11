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

public val SBBIcons.ShoppingCartLarge: ImageVector
    get() {
        if (_shoppingCartLarge != null) {
            return _shoppingCartLarge!!
        }
        _shoppingCartLarge = Builder(name = "ShoppingCartLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(-1.0f)
                lineTo(14.0f, 31.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(21.876f)
                lineToRelative(0.105f, -0.36f)
                lineToRelative(3.479f, -12.0f)
                lineToRelative(0.185f, -0.64f)
                lineTo(14.0f, 15.0f)
                verticalLineToRelative(-4.0f)
                lineTo(9.0f, 11.0f)
                close()
                moveTo(14.0f, 16.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(21.124f)
                lineToRelative(3.19f, -11.0f)
                close()
                moveTo(20.0f, 36.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.0f, 36.5f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.002f, -0.002f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 36.5f)
                moveToRelative(8.5f, -1.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 29.499f, 38.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 29.5f, 35.0f)
                moveToRelative(0.0f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -0.002f, -5.002f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 29.5f, 39.0f)
                moveTo(33.0f, 19.0f)
                verticalLineToRelative(1.0f)
                lineTo(19.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(31.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                lineTo(19.0f, 23.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _shoppingCartLarge!!
    }

private var _shoppingCartLarge: ImageVector? = null
