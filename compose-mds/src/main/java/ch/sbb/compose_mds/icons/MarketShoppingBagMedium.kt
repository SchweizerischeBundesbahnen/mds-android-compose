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

public val SBBIcons.MarketShoppingBagMedium: ImageVector
    get() {
        if (_marketShoppingBagMedium != null) {
            return _marketShoppingBagMedium!!
        }
        _marketShoppingBagMedium = Builder(name = "MarketShoppingBagMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(20.725f, 6.592f)
                lineToRelative(-0.115f, -0.342f)
                lineTo(4.89f, 6.25f)
                lineToRelative(-0.114f, 0.342f)
                lineToRelative(-1.5f, 4.5f)
                lineToRelative(-0.22f, 0.658f)
                horizontalLineToRelative(0.194f)
                verticalLineToRelative(0.252f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 1.5f, 2.45f)
                lineTo(4.75f, 29.75f)
                horizontalLineToRelative(16.0f)
                lineTo(20.75f, 14.452f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 1.5f, -2.45f)
                verticalLineToRelative(-0.252f)
                horizontalLineToRelative(0.194f)
                lineToRelative(-0.22f, -0.658f)
                close()
                moveTo(21.25f, 11.75f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(0.252f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f)
                close()
                moveTo(16.75f, 11.75f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(0.252f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f)
                close()
                moveTo(12.25f, 11.75f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(0.252f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f)
                close()
                moveTo(7.75f, 11.75f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(0.252f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f)
                close()
                moveTo(21.056f, 10.75f)
                lineTo(4.444f, 10.75f)
                lineToRelative(1.166f, -3.5f)
                horizontalLineToRelative(14.28f)
                close()
                moveTo(19.5f, 14.752f)
                quadToRelative(0.127f, 0.0f, 0.25f, -0.012f)
                verticalLineToRelative(14.01f)
                horizontalLineToRelative(-14.0f)
                lineTo(5.75f, 14.74f)
                quadToRelative(0.123f, 0.011f, 0.25f, 0.011f)
                curveToRelative(0.93f, 0.0f, 1.752f, -0.461f, 2.25f, -1.168f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 2.25f, 1.168f)
                curveToRelative(0.93f, 0.0f, 1.752f, -0.461f, 2.25f, -1.168f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 15.0f, 14.751f)
                curveToRelative(0.93f, 0.0f, 1.752f, -0.461f, 2.25f, -1.168f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 2.25f, 1.168f)
                moveToRelative(12.46f, 4.998f)
                lineToRelative(0.038f, 0.458f)
                lineToRelative(0.75f, 9.0f)
                lineToRelative(0.045f, 0.542f)
                lineTo(22.707f, 29.749f)
                lineToRelative(0.045f, -0.542f)
                lineToRelative(0.75f, -9.0f)
                lineToRelative(0.038f, -0.458f)
                horizontalLineToRelative(2.21f)
                verticalLineToRelative(-1.251f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                verticalLineToRelative(1.251f)
                close()
                moveTo(28.75f, 19.749f)
                verticalLineToRelative(-1.251f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(1.251f)
                close()
                moveTo(23.793f, 28.749f)
                horizontalLineToRelative(7.914f)
                lineToRelative(-0.667f, -8.0f)
                horizontalLineToRelative(-6.58f)
                close()
            }
        }
        .build()
        return _marketShoppingBagMedium!!
    }

private var _marketShoppingBagMedium: ImageVector? = null
