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

public val SBBIcons.ShoppingCartMedium: ImageVector
    get() {
        if (_shoppingCartMedium != null) {
            return _shoppingCartMedium!!
        }
        _shoppingCartMedium = Builder(name = "ShoppingCartMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 8.75f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(15.0f)
                lineTo(27.0f, 23.75f)
                verticalLineToRelative(-1.0f)
                lineTo(10.25f, 22.75f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(16.36f)
                lineToRelative(0.114f, -0.342f)
                lineToRelative(3.0f, -9.0f)
                lineToRelative(0.22f, -0.658f)
                lineTo(10.25f, 10.75f)
                verticalLineToRelative(-3.0f)
                lineTo(6.0f, 7.75f)
                close()
                moveTo(10.25f, 11.75f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(15.64f)
                lineToRelative(2.666f, -8.0f)
                close()
                moveTo(14.25f, 26.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(10.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(1.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
            }
        }
        .build()
        return _shoppingCartMedium!!
    }

private var _shoppingCartMedium: ImageVector? = null
