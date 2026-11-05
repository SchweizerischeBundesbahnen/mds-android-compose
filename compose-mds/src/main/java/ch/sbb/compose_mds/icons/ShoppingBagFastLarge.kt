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

public val SBBIcons.ShoppingBagFastLarge: ImageVector
    get() {
        if (_shoppingBagFastLarge != null) {
            return _shoppingBagFastLarge!!
        }
        _shoppingBagFastLarge = Builder(
            name = "ShoppingBagFastLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(29.226f, 11.72f)
                arcToRelative(4.504f, 4.504f, 0.0f, false, true, 5.215f, -3.65f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.65f, 5.212f)
                lineToRelative(-0.435f, 2.46f)
                lineToRelative(5.417f, 0.956f)
                lineToRelative(0.45f, 0.08f)
                lineToRelative(-0.039f, 0.454f)
                lineToRelative(-1.85f, 22.015f)
                lineToRelative(-0.045f, 0.545f)
                lineToRelative(-0.54f, -0.095f)
                lineToRelative(-23.636f, -4.168f)
                lineToRelative(-0.539f, -0.096f)
                lineToRelative(0.144f, -0.528f)
                lineToRelative(5.79f, -21.317f)
                lineToRelative(0.119f, -0.44f)
                lineToRelative(0.45f, 0.078f)
                lineToRelative(5.415f, 0.954f)
                close()
                moveTo(18.126f, 34.638f)
                lineTo(40.683f, 38.616f)
                lineTo(42.448f, 17.603f)
                lineTo(37.482f, 16.727f)
                lineTo(36.7f, 21.16f)
                lineTo(35.716f, 20.986f)
                lineTo(36.497f, 16.553f)
                lineTo(29.602f, 15.339f)
                lineTo(28.822f, 19.772f)
                lineTo(27.838f, 19.598f)
                lineTo(28.618f, 15.165f)
                lineTo(23.652f, 14.29f)
                close()
                moveTo(15.0f, 29.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(17.0f, 25.0f)
                lineTo(8.0f, 25.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(17.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(34.268f, 9.053f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, false, -4.058f, 2.84f)
                lineToRelative(-0.434f, 2.461f)
                lineToRelative(6.895f, 1.215f)
                lineToRelative(0.434f, -2.46f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.837f, -4.056f)
            }
        }
            .build()
        return _shoppingBagFastLarge!!
    }

private var _shoppingBagFastLarge: ImageVector? = null
