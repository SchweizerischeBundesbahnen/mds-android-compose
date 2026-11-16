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
                moveTo(14.174f, 5.817f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.867f, 1.117f)
                lineToRelative(-0.173f, 0.984f)
                lineToRelative(2.462f, 0.434f)
                lineToRelative(-0.088f, 0.493f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.087f, -0.493f)
                lineToRelative(0.45f, 0.08f)
                lineToRelative(-0.039f, 0.456f)
                lineToRelative(-0.925f, 11.006f)
                lineToRelative(-0.046f, 0.545f)
                lineToRelative(-0.539f, -0.094f)
                lineTo(8.413f, 18.26f)
                lineToRelative(-0.539f, -0.095f)
                lineToRelative(0.144f, -0.529f)
                lineToRelative(2.894f, -10.659f)
                lineToRelative(0.12f, -0.44f)
                lineToRelative(0.45f, 0.079f)
                lineToRelative(2.461f, 0.434f)
                lineToRelative(0.173f, -0.984f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(13.77f, 8.035f)
                lineTo(13.423f, 10.005f)
                lineTo(14.407f, 10.18f)
                lineTo(14.755f, 8.209f)
                lineTo(17.709f, 8.729f)
                lineTo(17.361f, 10.7f)
                lineTo(18.347f, 10.874f)
                lineTo(18.694f, 8.903f)
                lineTo(20.706f, 9.258f)
                lineTo(19.864f, 19.265f)
                lineTo(9.125f, 17.37f)
                lineToRelative(2.633f, -9.69f)
                close()
                moveTo(17.883f, 7.745f)
                lineTo(14.928f, 7.225f)
                lineTo(15.102f, 6.241f)
                arcToRelative(1.501f, 1.501f, 0.0f, false, true, 2.955f, 0.52f)
                close()
                moveTo(8.0f, 10.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(8.0f, 12.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(7.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 14.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _shoppingBagFastSmall!!
    }

private var _shoppingBagFastSmall: ImageVector? = null
