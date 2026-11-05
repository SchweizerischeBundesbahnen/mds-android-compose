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

public val SBBIcons.ShopMedium: ImageVector
    get() {
        if (_shopMedium != null) {
            return _shopMedium!!
        }
        _shopMedium = Builder(name = "ShopMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(29.73f, 6.592f)
                lineToRelative(1.5f, 4.5f)
                lineToRelative(0.218f, 0.658f)
                horizontalLineToRelative(-0.229f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, true, -1.464f, 2.558f)
                lineTo(29.755f, 29.75f)
                lineToRelative(-0.5f, 0.001f)
                horizontalLineToRelative(-24.5f)
                verticalLineToRelative(-15.44f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, true, -1.467f, -2.561f)
                horizontalLineToRelative(-0.226f)
                lineToRelative(0.219f, -0.658f)
                lineToRelative(1.5f, -4.5f)
                lineToRelative(0.114f, -0.342f)
                horizontalLineToRelative(24.72f)
                close()
                moveTo(24.003f, 13.149f)
                arcToRelative(3.872f, 3.872f, 0.0f, false, true, -6.75f, 0.0f)
                arcToRelative(3.872f, 3.872f, 0.0f, false, true, -6.75f, 0.0f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, true, -4.748f, 1.723f)
                verticalLineToRelative(13.879f)
                horizontalLineToRelative(14.0f)
                lineTo(19.755f, 16.75f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(12.001f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-13.88f)
                arcToRelative(3.871f, 3.871f, 0.0f, false, true, -4.752f, -1.72f)
                moveToRelative(-3.248f, 15.602f)
                horizontalLineToRelative(5.0f)
                lineTo(25.755f, 17.75f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(17.755f, 23.752f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(8.755f, 22.752f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(4.302f, 11.752f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, 2.826f, 2.374f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, 2.827f, -2.374f)
                close()
                moveTo(11.052f, 11.752f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, 2.826f, 2.374f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, 2.827f, -2.374f)
                close()
                moveTo(17.802f, 11.752f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, 2.826f, 2.374f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, 2.827f, -2.374f)
                close()
                moveTo(24.552f, 11.752f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, 2.826f, 2.374f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, 2.827f, -2.374f)
                close()
                moveTo(4.449f, 10.752f)
                horizontalLineToRelative(25.612f)
                lineToRelative(-1.166f, -3.5f)
                lineTo(5.615f, 7.252f)
                close()
            }
        }
        .build()
        return _shopMedium!!
    }

private var _shopMedium: ImageVector? = null
