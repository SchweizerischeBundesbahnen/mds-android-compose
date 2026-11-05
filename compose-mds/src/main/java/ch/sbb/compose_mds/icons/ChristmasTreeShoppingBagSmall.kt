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
        _christmasTreeShoppingBagSmall = Builder(
            name = "ChristmasTreeShoppingBagSmall",
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
                moveTo(7.937f, 2.757f)
                lineTo(7.5f, 1.97f)
                lineToRelative(-0.437f, 0.787f)
                lineToRelative(-2.5f, 4.5f)
                lineTo(4.15f, 8.0f)
                horizontalLineToRelative(1.54f)
                lineToRelative(-2.137f, 4.276f)
                lineTo(3.19f, 13.0f)
                horizontalLineTo(4.69f)
                lineToRelative(-2.137f, 4.276f)
                lineTo(2.19f, 18.0f)
                horizontalLineTo(7.0f)
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
                lineToRelative(-0.412f, -0.743f)
                close()
                moveTo(6.5f, 7.0f)
                horizontalLineToRelative(-0.65f)
                lineTo(7.5f, 4.03f)
                lineTo(9.15f, 7.0f)
                horizontalLineTo(7.69f)
                lineToRelative(0.363f, 0.723f)
                lineTo(10.19f, 12.0f)
                horizontalLineTo(8.69f)
                lineToRelative(0.363f, 0.723f)
                lineTo(11.19f, 17.0f)
                horizontalLineTo(3.809f)
                lineToRelative(2.138f, -4.277f)
                lineTo(6.31f, 12.0f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(2.138f, -4.277f)
                lineTo(7.31f, 7.0f)
                close()
                moveTo(18.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                moveToRelative(-2.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.466f)
                lineToRelative(-0.033f, 0.464f)
                lineToRelative(-0.5f, 7.0f)
                lineToRelative(-0.038f, 0.536f)
                horizontalLineToRelative(8.074f)
                lineToRelative(-0.038f, -0.536f)
                lineToRelative(-0.5f, -7.0f)
                lineToRelative(-0.034f, -0.464f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                moveToRelative(-0.963f, 8.0f)
                lineToRelative(0.428f, -6.0f)
                horizontalLineToRelative(5.069f)
                lineToRelative(0.429f, 6.0f)
                close()
            }
        }
            .build()
        return _christmasTreeShoppingBagSmall!!
    }

private var _christmasTreeShoppingBagSmall: ImageVector? = null
