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

public val SBBIcons.ShoppingBagFastMedium: ImageVector
    get() {
        if (_shoppingBagFastMedium != null) {
            return _shoppingBagFastMedium!!
        }
        _shoppingBagFastMedium = Builder(name = "ShoppingBagFastMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(22.406f, 9.317f)
                lineToRelative(-0.303f, 1.722f)
                lineToRelative(4.924f, 0.868f)
                lineToRelative(0.304f, -1.723f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -4.925f, -0.867f)
                moveToRelative(5.606f, 2.764f)
                lineToRelative(0.304f, -1.723f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -6.895f, -1.215f)
                lineToRelative(-0.303f, 1.723f)
                lineToRelative(-3.939f, -0.695f)
                lineToRelative(-0.45f, -0.079f)
                lineToRelative(-0.119f, 0.44f)
                lineToRelative(-4.342f, 15.99f)
                lineToRelative(-0.144f, 0.527f)
                lineToRelative(0.54f, 0.096f)
                lineTo(30.39f, 30.27f)
                lineToRelative(0.54f, 0.095f)
                lineToRelative(0.045f, -0.546f)
                lineToRelative(1.388f, -16.51f)
                lineToRelative(0.038f, -0.456f)
                lineToRelative(-0.45f, -0.079f)
                close()
                moveTo(26.853f, 12.892f)
                lineTo(26.289f, 16.092f)
                lineTo(27.273f, 16.267f)
                lineTo(27.838f, 13.066f)
                lineTo(31.328f, 13.681f)
                lineTo(30.025f, 29.191f)
                lineTo(13.376f, 26.255f)
                lineTo(17.456f, 11.235f)
                lineTo(20.944f, 11.85f)
                lineTo(20.38f, 15.052f)
                lineTo(21.365f, 15.226f)
                lineTo(21.929f, 12.024f)
                close()
                moveTo(3.0f, 15.25f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 16.25f)
                close()
                moveTo(6.0f, 18.25f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 19.25f)
                close()
                moveTo(10.5f, 21.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _shoppingBagFastMedium!!
    }

private var _shoppingBagFastMedium: ImageVector? = null
