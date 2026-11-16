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

public val SBBIcons.ChristmasTreeShoppingBagMedium: ImageVector
    get() {
        if (_christmasTreeShoppingBagMedium != null) {
            return _christmasTreeShoppingBagMedium!!
        }
        _christmasTreeShoppingBagMedium = Builder(name = "ChristmasTreeShoppingBagMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(15.437f, 11.007f)
                lineToRelative(-3.75f, -6.75f)
                lineToRelative(-0.437f, -0.787f)
                lineToRelative(-0.438f, 0.787f)
                lineToRelative(-3.75f, 6.75f)
                lineToRelative(-0.412f, 0.743f)
                horizontalLineToRelative(2.291f)
                lineToRelative(-3.388f, 6.776f)
                lineToRelative(-0.362f, 0.724f)
                horizontalLineToRelative(2.25f)
                lineToRelative(-3.388f, 6.776f)
                lineToRelative(-0.362f, 0.724f)
                lineTo(10.5f, 26.75f)
                lineTo(10.5f, 30.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(7.308f)
                lineToRelative(-0.36f, -0.724f)
                lineToRelative(-3.39f, -6.776f)
                horizontalLineToRelative(2.25f)
                lineToRelative(-0.36f, -0.724f)
                lineToRelative(-3.39f, -6.776f)
                horizontalLineToRelative(2.292f)
                close()
                moveTo(10.559f, 10.75f)
                lineTo(8.35f, 10.75f)
                lineToRelative(2.899f, -5.22f)
                lineToRelative(2.9f, 5.22f)
                lineTo(11.94f, 10.75f)
                lineToRelative(0.362f, 0.723f)
                lineToRelative(3.388f, 6.777f)
                horizontalLineToRelative(-2.25f)
                lineToRelative(0.362f, 0.723f)
                lineToRelative(3.388f, 6.777f)
                lineTo(5.31f, 25.75f)
                lineToRelative(3.388f, -6.777f)
                lineToRelative(0.362f, -0.723f)
                horizontalLineToRelative(-2.25f)
                lineToRelative(3.388f, -6.777f)
                close()
                moveTo(28.749f, 16.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -3.5f, 0.0f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(24.249f, 16.5f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-2.215f)
                lineToRelative(-0.783f, 10.965f)
                lineToRelative(-0.038f, 0.535f)
                horizontalLineToRelative(11.574f)
                lineToRelative(-0.038f, -0.535f)
                lineToRelative(-0.783f, -10.965f)
                lineTo(29.75f, 18.25f)
                lineTo(29.75f, 16.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, -5.5f, 0.0f)
                moveToRelative(-1.962f, 12.25f)
                lineToRelative(0.679f, -9.5f)
                horizontalLineToRelative(8.068f)
                lineToRelative(0.679f, 9.5f)
                close()
            }
        }
        .build()
        return _christmasTreeShoppingBagMedium!!
    }

private var _christmasTreeShoppingBagMedium: ImageVector? = null
