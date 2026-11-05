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

public val SBBIcons.ShoppingBagCouponMedium: ImageVector
    get() {
        if (_shoppingBagCouponMedium != null) {
            return _shoppingBagCouponMedium!!
        }
        _shoppingBagCouponMedium = Builder(
            name = "ShoppingBagCouponMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(13.25f, 8.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(12.25f, 11.75f)
                lineTo(12.25f, 15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(8.0f)
                lineTo(21.25f, 15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(3.537f)
                lineToRelative(1.423f, 18.5f)
                lineTo(7.29f, 30.25f)
                lineToRelative(1.423f, -18.5f)
                close()
                moveTo(12.25f, 10.75f)
                verticalLineToRelative(-2.5f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 10.0f, 0.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(4.463f)
                lineToRelative(0.035f, 0.462f)
                lineToRelative(1.5f, 19.5f)
                lineToRelative(0.042f, 0.538f)
                lineTo(6.21f, 31.25f)
                lineToRelative(0.041f, -0.538f)
                lineToRelative(1.5f, -19.5f)
                lineToRelative(0.036f, -0.462f)
                horizontalLineToRelative(4.463f)
                moveToRelative(4.5f, 14.75f)
                lineTo(16.75f, 18.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(17.25f, 15.25f)
                quadToRelative(-0.258f, 0.0f, -0.51f, 0.02f)
                lineToRelative(0.077f, 0.996f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 0.865f, 0.0f)
                lineToRelative(0.078f, -0.997f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -0.51f, -0.02f)
                moveToRelative(2.488f, 0.493f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -0.97f, -0.315f)
                lineToRelative(-0.233f, 0.972f)
                quadToRelative(0.424f, 0.102f, 0.82f, 0.267f)
                close()
                moveTo(15.732f, 15.427f)
                quadToRelative(-0.501f, 0.12f, -0.97f, 0.315f)
                lineToRelative(0.383f, 0.924f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.82f, -0.267f)
                close()
                moveTo(21.472f, 16.806f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -0.825f, -0.6f)
                lineToRelative(-0.523f, 0.852f)
                quadToRelative(0.37f, 0.227f, 0.698f, 0.508f)
                close()
                moveTo(13.852f, 16.206f)
                quadToRelative(-0.436f, 0.268f, -0.824f, 0.6f)
                lineToRelative(0.65f, 0.76f)
                quadToRelative(0.329f, -0.281f, 0.698f, -0.508f)
                close()
                moveTo(22.792f, 18.352f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -0.6f, -0.825f)
                lineToRelative(-0.76f, 0.65f)
                quadToRelative(0.281f, 0.328f, 0.508f, 0.698f)
                close()
                moveTo(12.307f, 17.527f)
                quadToRelative(-0.33f, 0.388f, -0.6f, 0.825f)
                lineToRelative(0.852f, 0.523f)
                quadToRelative(0.228f, -0.37f, 0.509f, -0.698f)
                close()
                moveTo(23.572f, 20.231f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -0.316f, -0.97f)
                lineToRelative(-0.923f, 0.382f)
                quadToRelative(0.165f, 0.396f, 0.266f, 0.82f)
                close()
                moveTo(11.243f, 19.261f)
                quadToRelative(-0.194f, 0.468f, -0.315f, 0.97f)
                lineToRelative(0.973f, 0.233f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.266f, -0.82f)
                close()
                moveTo(10.77f, 21.239f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, 0.0f, 1.02f)
                lineToRelative(0.997f, -0.078f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 0.0f, -0.865f)
                close()
                moveTo(23.75f, 21.749f)
                quadToRelative(0.0f, -0.258f, -0.02f, -0.51f)
                lineToRelative(-0.997f, 0.077f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 0.0f, 0.865f)
                lineToRelative(0.997f, 0.078f)
                quadToRelative(0.02f, -0.253f, 0.02f, -0.51f)
                moveToRelative(-0.494f, 2.488f)
                quadToRelative(0.195f, -0.47f, 0.316f, -0.97f)
                lineToRelative(-0.973f, -0.234f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.266f, 0.82f)
                close()
                moveTo(10.928f, 23.267f)
                quadToRelative(0.12f, 0.5f, 0.315f, 0.97f)
                lineToRelative(0.924f, -0.383f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.266f, -0.82f)
                close()
                moveTo(11.708f, 25.145f)
                quadToRelative(0.268f, 0.437f, 0.6f, 0.825f)
                lineToRelative(0.76f, -0.65f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.509f, -0.698f)
                close()
                moveTo(22.192f, 25.97f)
                quadToRelative(0.332f, -0.388f, 0.6f, -0.825f)
                lineToRelative(-0.852f, -0.523f)
                quadToRelative(-0.226f, 0.37f, -0.508f, 0.698f)
                close()
                moveTo(13.028f, 26.691f)
                quadToRelative(0.388f, 0.33f, 0.825f, 0.6f)
                lineToRelative(0.523f, -0.852f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.698f, -0.508f)
                close()
                moveTo(20.647f, 27.291f)
                quadToRelative(0.436f, -0.27f, 0.825f, -0.6f)
                lineToRelative(-0.65f, -0.76f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.698f, 0.508f)
                close()
                moveTo(14.762f, 27.755f)
                quadToRelative(0.468f, 0.195f, 0.97f, 0.315f)
                lineToRelative(0.233f, -0.972f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.82f, -0.267f)
                close()
                moveTo(18.767f, 28.07f)
                quadToRelative(0.504f, -0.12f, 0.971f, -0.315f)
                lineToRelative(-0.383f, -0.924f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.82f, 0.267f)
                close()
                moveTo(16.74f, 28.229f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, 1.02f, 0.0f)
                lineToRelative(-0.078f, -0.997f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, -0.865f, 0.0f)
                close()
            }
        }
            .build()
        return _shoppingBagCouponMedium!!
    }

private var _shoppingBagCouponMedium: ImageVector? = null
