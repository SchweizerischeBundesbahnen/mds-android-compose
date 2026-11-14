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

public val SBBIcons.ShoppingBagSmall: ImageVector
    get() {
        if (_shoppingBagSmall != null) {
            return _shoppingBagSmall!!
        }
        _shoppingBagSmall = Builder(name = "ShoppingBagSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(1.957f)
                lineTo(5.034f, 6.957f)
                lineTo(4.001f, 21.42f)
                lineToRelative(-0.038f, 0.535f)
                horizontalLineToRelative(16.074f)
                lineToRelative(-0.038f, -0.535f)
                lineToRelative(-1.033f, -14.464f)
                horizontalLineToRelative(-3.968f)
                lineTo(15.0f, 5.0f)
                lineTo(15.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                moveToRelative(1.997f, 5.957f)
                lineToRelative(-0.004f, 3.042f)
                lineToRelative(1.0f, 0.002f)
                lineToRelative(0.004f, -3.044f)
                horizontalLineToRelative(3.037f)
                lineToRelative(0.929f, 13.0f)
                lineTo(5.037f, 20.957f)
                lineToRelative(0.929f, -13.0f)
                lineTo(9.0f, 7.957f)
                lineTo(9.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                lineTo(10.0f, 7.957f)
                close()
                moveTo(13.997f, 6.957f)
                lineTo(14.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                verticalLineToRelative(1.957f)
                close()
            }
        }
        .build()
        return _shoppingBagSmall!!
    }

private var _shoppingBagSmall: ImageVector? = null
