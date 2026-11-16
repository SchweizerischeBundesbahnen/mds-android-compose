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
                moveTo(21.458f, 8.966f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 6.858f, 1.392f)
                lineToRelative(-0.304f, 1.723f)
                lineToRelative(3.94f, 0.694f)
                lineToRelative(0.45f, 0.08f)
                lineToRelative(-0.04f, 0.454f)
                lineToRelative(-1.386f, 16.51f)
                lineToRelative(-0.046f, 0.547f)
                lineToRelative(-0.54f, -0.096f)
                lineToRelative(-17.727f, -3.126f)
                lineToRelative(-0.539f, -0.095f)
                lineToRelative(0.144f, -0.528f)
                lineToRelative(4.342f, -15.988f)
                lineToRelative(0.12f, -0.44f)
                lineToRelative(0.45f, 0.079f)
                lineToRelative(3.938f, 0.694f)
                lineToRelative(0.303f, -1.723f)
                close()
                moveTo(20.945f, 11.85f)
                lineTo(20.38f, 15.052f)
                lineTo(21.365f, 15.225f)
                lineTo(21.929f, 12.024f)
                lineTo(26.854f, 12.892f)
                lineTo(26.289f, 16.092f)
                lineTo(27.274f, 16.266f)
                lineTo(27.838f, 13.066f)
                lineTo(31.328f, 13.68f)
                lineTo(30.023f, 29.19f)
                lineTo(13.375f, 26.254f)
                lineTo(17.455f, 11.235f)
                close()
                moveTo(27.027f, 11.907f)
                lineTo(22.102f, 11.039f)
                lineTo(22.406f, 9.318f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 4.926f, 0.866f)
                close()
                moveTo(12.0f, 15.25f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 16.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(12.0f, 18.25f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 19.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.5f, 22.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _shoppingBagFastMedium!!
    }

private var _shoppingBagFastMedium: ImageVector? = null
