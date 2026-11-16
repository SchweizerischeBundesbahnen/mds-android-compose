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
        _shoppingBagCouponSmall = Builder(name = "ShoppingBagCouponSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.0f, 5.5f)
                lineTo(14.0f, 7.0f)
                lineTo(9.0f, 7.0f)
                lineTo(9.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.5f, 3.0f)
                moveTo(8.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(9.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(15.0f, 8.0f)
                horizontalLineToRelative(2.037f)
                lineToRelative(0.924f, 12.0f)
                lineTo(5.039f, 20.0f)
                lineToRelative(0.924f, -12.0f)
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
                lineToRelative(0.042f, -0.538f)
                lineToRelative(1.0f, -13.0f)
                lineTo(5.037f, 7.0f)
                close()
                moveTo(12.0f, 12.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(11.5f, 19.0f)
                quadToRelative(0.299f, 0.0f, 0.587f, -0.038f)
                lineToRelative(-0.13f, -0.991f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.915f, 0.0f)
                lineToRelative(-0.129f, 0.99f)
                quadToRelative(0.288f, 0.039f, 0.587f, 0.039f)
                moveToRelative(-1.34f, -1.266f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.791f, -0.457f)
                lineToRelative(-0.61f, 0.793f)
                quadToRelative(0.467f, 0.358f, 1.018f, 0.588f)
                close()
                moveTo(13.223f, 18.658f)
                curveToRelative(0.366f, -0.152f, 0.708f, -0.35f, 1.017f, -0.588f)
                lineToRelative(-0.61f, -0.793f)
                curveToRelative(-0.24f, 0.185f, -0.506f, 0.34f, -0.79f, 0.457f)
                close()
                moveTo(8.723f, 16.631f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.457f, -0.791f)
                lineToRelative(-0.924f, 0.382f)
                quadToRelative(0.23f, 0.551f, 0.588f, 1.018f)
                close()
                moveTo(15.07f, 17.24f)
                quadToRelative(0.358f, -0.466f, 0.588f, -1.018f)
                lineToRelative(-0.924f, -0.382f)
                curveToRelative(-0.118f, 0.284f, -0.272f, 0.55f, -0.457f, 0.79f)
                close()
                moveTo(7.038f, 13.913f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.0f, 1.174f)
                lineToRelative(0.991f, -0.13f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -0.915f)
                close()
                moveTo(14.971f, 14.042f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 0.0f, 0.916f)
                lineToRelative(0.99f, 0.129f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.0f, -1.174f)
                close()
                moveTo(8.266f, 13.16f)
                quadToRelative(0.177f, -0.428f, 0.457f, -0.791f)
                lineToRelative(-0.793f, -0.61f)
                quadToRelative(-0.359f, 0.467f, -0.588f, 1.018f)
                close()
                moveTo(15.658f, 12.777f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -0.588f, -1.018f)
                lineToRelative(-0.793f, 0.61f)
                curveToRelative(0.185f, 0.24f, 0.34f, 0.507f, 0.457f, 0.79f)
                close()
                moveTo(9.37f, 11.722f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.791f, -0.457f)
                lineToRelative(-0.383f, -0.923f)
                curveToRelative(-0.366f, 0.151f, -0.708f, 0.35f, -1.017f, 0.587f)
                close()
                moveTo(14.241f, 10.929f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -1.017f, -0.587f)
                lineToRelative(-0.383f, 0.923f)
                quadToRelative(0.428f, 0.178f, 0.79f, 0.457f)
                close()
                moveTo(12.088f, 10.038f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, -1.174f, 0.0f)
                lineToRelative(0.129f, 0.991f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.916f, 0.0f)
                close()
            }
        }
        .build()
        return _shoppingBagCouponSmall!!
    }

private var _shoppingBagCouponSmall: ImageVector? = null
