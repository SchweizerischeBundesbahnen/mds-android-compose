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

public val SBBIcons.ShoppingBagCouponSmall: ImageVector
    get() {
        if (_shoppingBagCouponSmall != null) {
            return _shoppingBagCouponSmall!!
        }
        _shoppingBagCouponSmall = Builder(
            name = "ShoppingBagCouponSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(9.0f, 5.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                lineTo(14.0f, 7.0f)
                lineTo(9.0f, 7.0f)
                close()
                moveTo(8.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(9.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(15.0f, 8.0f)
                horizontalLineToRelative(2.037f)
                lineToRelative(0.923f, 12.0f)
                lineTo(5.04f, 20.0f)
                lineToRelative(0.923f, -12.0f)
                close()
                moveTo(8.0f, 7.0f)
                lineTo(8.0f, 5.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(2.963f)
                lineToRelative(0.035f, 0.462f)
                lineToRelative(1.0f, 13.0f)
                lineToRelative(0.042f, 0.538f)
                lineTo(3.96f, 21.0f)
                lineToRelative(0.041f, -0.538f)
                lineToRelative(1.0f, -13.0f)
                lineTo(5.037f, 7.0f)
                lineTo(8.0f, 7.0f)
                moveToRelative(3.0f, 10.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(11.5f, 10.0f)
                quadToRelative(-0.299f, 0.0f, -0.587f, 0.038f)
                lineToRelative(0.13f, 0.991f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.915f, 0.0f)
                lineToRelative(0.129f, -0.991f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 11.5f, 10.0f)
                moveToRelative(2.74f, 0.93f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -1.017f, -0.588f)
                lineToRelative(-0.384f, 0.923f)
                quadToRelative(0.429f, 0.178f, 0.791f, 0.458f)
                close()
                moveTo(9.777f, 10.342f)
                curveToRelative(-0.366f, 0.151f, -0.707f, 0.35f, -1.017f, 0.588f)
                lineToRelative(0.61f, 0.793f)
                quadToRelative(0.362f, -0.28f, 0.79f, -0.458f)
                close()
                moveTo(15.658f, 12.777f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -0.588f, -1.017f)
                lineToRelative(-0.793f, 0.61f)
                curveToRelative(0.185f, 0.24f, 0.34f, 0.506f, 0.458f, 0.79f)
                close()
                moveTo(7.93f, 11.76f)
                curveToRelative(-0.238f, 0.31f, -0.437f, 0.651f, -0.588f, 1.017f)
                lineToRelative(0.923f, 0.383f)
                curveToRelative(0.118f, -0.284f, 0.273f, -0.55f, 0.458f, -0.79f)
                close()
                moveTo(16.0f, 14.5f)
                quadToRelative(0.0f, -0.299f, -0.038f, -0.587f)
                lineToRelative(-0.992f, 0.129f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, 0.915f)
                lineToRelative(0.992f, 0.13f)
                quadTo(16.0f, 14.798f, 16.0f, 14.5f)
                moveToRelative(-8.962f, -0.587f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.0f, 1.174f)
                lineToRelative(0.992f, -0.13f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -0.915f)
                close()
                moveTo(15.07f, 17.239f)
                quadToRelative(0.358f, -0.465f, 0.588f, -1.017f)
                lineToRelative(-0.923f, -0.383f)
                quadToRelative(-0.179f, 0.428f, -0.458f, 0.791f)
                close()
                moveTo(7.342f, 16.222f)
                curveToRelative(0.151f, 0.366f, 0.35f, 0.708f, 0.588f, 1.017f)
                lineToRelative(0.793f, -0.609f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.458f, -0.79f)
                close()
                moveTo(13.222f, 18.658f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 1.018f, -0.588f)
                lineToRelative(-0.61f, -0.793f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.79f, 0.457f)
                close()
                moveTo(8.76f, 18.07f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 1.017f, 0.588f)
                lineToRelative(0.383f, -0.924f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.79f, -0.457f)
                close()
                moveTo(10.913f, 18.962f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 1.174f, 0.0f)
                lineToRelative(-0.13f, -0.992f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.915f, 0.0f)
                close()
            }
        }
            .build()
        return _shoppingBagCouponSmall!!
    }

private var _shoppingBagCouponSmall: ImageVector? = null
