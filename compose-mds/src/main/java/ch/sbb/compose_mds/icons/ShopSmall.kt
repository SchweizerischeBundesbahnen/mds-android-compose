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

public val SBBIcons.ShopSmall: ImageVector
    get() {
        if (_shopSmall != null) {
            return _shopSmall!!
        }
        _shopSmall = Builder(name = "ShopSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.978f, 4.342f)
                lineToRelative(1.0f, 3.0f)
                lineToRelative(0.219f, 0.658f)
                horizontalLineToRelative(-0.243f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -0.95f, 1.62f)
                lineTo(20.004f, 20.0f)
                horizontalLineToRelative(-17.0f)
                lineTo(3.004f, 9.621f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 2.05f, 8.0f)
                horizontalLineToRelative(-0.24f)
                lineToRelative(0.218f, -0.658f)
                lineToRelative(1.0f, -3.0f)
                lineTo(3.143f, 4.0f)
                horizontalLineToRelative(16.72f)
                close()
                moveTo(16.002f, 9.076f)
                arcToRelative(2.744f, 2.744f, 0.0f, false, true, -4.5f, 0.0f)
                arcToRelative(2.744f, 2.744f, 0.0f, false, true, -4.5f, 0.0f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, true, -2.999f, 1.067f)
                lineTo(4.003f, 19.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-8.858f)
                arcToRelative(2.744f, 2.744f, 0.0f, false, true, -3.001f, -1.065f)
                moveTo(14.003f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(12.003f, 16.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(6.003f, 15.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(3.078f, 8.0f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, false, 3.35f, 0.0f)
                close()
                moveTo(7.578f, 8.0f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, false, 3.35f, 0.0f)
                close()
                moveTo(12.078f, 8.0f)
                arcToRelative(1.749f, 1.749f, 0.0f, false, false, 3.35f, 0.0f)
                close()
                moveTo(16.578f, 8.0f)
                arcToRelative(1.749f, 1.749f, 0.0f, false, false, 3.35f, 0.0f)
                close()
                moveTo(3.198f, 7.0f)
                horizontalLineToRelative(16.611f)
                lineToRelative(-0.666f, -2.0f)
                lineTo(3.863f, 5.0f)
                close()
            }
        }
        .build()
        return _shopSmall!!
    }

private var _shopSmall: ImageVector? = null
