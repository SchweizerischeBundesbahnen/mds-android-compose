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

public val SBBIcons.ShoppingBagMedium: ImageVector
    get() {
        if (_shoppingBagMedium != null) {
            return _shoppingBagMedium!!
        }
        _shoppingBagMedium = Builder(name = "ShoppingBagMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 3.25f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -4.25f, 4.25f)
                verticalLineToRelative(3.185f)
                lineTo(7.784f, 10.685f)
                lineToRelative(-0.033f, 0.464f)
                lineToRelative(-1.5f, 21.0f)
                lineToRelative(-0.038f, 0.536f)
                horizontalLineToRelative(23.574f)
                lineToRelative(-0.038f, -0.536f)
                lineToRelative(-1.5f, -21.0f)
                lineToRelative(-0.034f, -0.464f)
                horizontalLineToRelative(-5.968f)
                lineTo(22.25f, 7.5f)
                lineTo(22.25f, 7.5f)
                arcTo(4.25f, 4.25f, 0.0f, false, false, 18.0f, 3.25f)
                moveToRelative(3.245f, 8.435f)
                lineToRelative(-0.005f, 4.814f)
                lineToRelative(1.0f, 0.002f)
                lineToRelative(0.005f, -4.816f)
                horizontalLineToRelative(5.04f)
                lineToRelative(1.428f, 20.0f)
                lineTo(7.287f, 31.685f)
                lineToRelative(1.428f, -20.0f)
                horizontalLineToRelative(5.035f)
                lineTo(13.75f, 16.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.815f)
                close()
                moveTo(21.247f, 10.685f)
                lineTo(21.25f, 7.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, false, -6.5f, 0.0f)
                verticalLineToRelative(3.185f)
                close()
            }
        }
        .build()
        return _shoppingBagMedium!!
    }

private var _shoppingBagMedium: ImageVector? = null
