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

public val SBBIcons.ChristmasTreeShoppingBagSmall: ImageVector
    get() {
        if (_christmasTreeShoppingBagSmall != null) {
            return _christmasTreeShoppingBagSmall!!
        }
        _christmasTreeShoppingBagSmall = Builder(name = "ChristmasTreeShoppingBagSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(10.438f, 7.257f)
                lineToRelative(-2.5f, -4.5f)
                lineTo(7.5f, 1.97f)
                lineToRelative(-0.437f, 0.786f)
                lineToRelative(-2.5f, 4.5f)
                lineTo(4.15f, 8.0f)
                horizontalLineToRelative(1.541f)
                lineToRelative(-2.138f, 4.276f)
                lineTo(3.19f, 13.0f)
                horizontalLineToRelative(1.5f)
                lineToRelative(-2.138f, 4.276f)
                lineTo(2.19f, 18.0f)
                lineTo(7.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.809f)
                lineToRelative(-0.362f, -0.724f)
                lineTo(10.31f, 13.0f)
                horizontalLineToRelative(1.5f)
                lineToRelative(-0.362f, -0.724f)
                lineTo(9.31f, 8.0f)
                horizontalLineToRelative(1.54f)
                close()
                moveTo(7.308f, 7.0f)
                lineTo(5.852f, 7.0f)
                lineTo(7.5f, 4.03f)
                lineTo(9.15f, 7.0f)
                lineTo(7.69f, 7.0f)
                lineToRelative(0.362f, 0.724f)
                lineTo(10.19f, 12.0f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(0.362f, 0.724f)
                lineTo(11.19f, 17.0f)
                lineTo(3.81f, 17.0f)
                lineToRelative(2.138f, -4.276f)
                lineTo(6.31f, 12.0f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(2.138f, -4.276f)
                close()
                moveTo(19.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.466f)
                lineToRelative(-0.533f, 7.465f)
                lineToRelative(-0.038f, 0.535f)
                horizontalLineToRelative(8.074f)
                lineTo(22.0f, 19.465f)
                lineTo(21.466f, 12.0f)
                lineTo(20.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                moveToRelative(-0.963f, 8.0f)
                lineToRelative(0.429f, -6.0f)
                horizontalLineToRelative(5.068f)
                lineToRelative(0.429f, 6.0f)
                close()
            }
        }
        .build()
        return _christmasTreeShoppingBagSmall!!
    }

private var _christmasTreeShoppingBagSmall: ImageVector? = null
