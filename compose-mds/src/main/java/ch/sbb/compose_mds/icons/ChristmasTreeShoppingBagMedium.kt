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
        _christmasTreeShoppingBagMedium = Builder(
            name = "ChristmasTreeShoppingBagMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveToRelative(11.687f, 4.257f)
                lineToRelative(-0.437f, -0.787f)
                lineToRelative(-0.437f, 0.787f)
                lineToRelative(-3.75f, 6.75f)
                lineToRelative(-0.413f, 0.743f)
                horizontalLineToRelative(2.29f)
                lineToRelative(-3.387f, 6.776f)
                lineToRelative(-0.362f, 0.724f)
                lineTo(7.44f, 19.25f)
                lineToRelative(-3.387f, 6.776f)
                lineToRelative(-0.362f, 0.724f)
                lineTo(10.5f, 26.75f)
                lineTo(10.5f, 30.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(7.309f)
                lineToRelative(-0.362f, -0.724f)
                lineToRelative(-3.388f, -6.776f)
                horizontalLineToRelative(2.25f)
                lineToRelative(-0.362f, -0.724f)
                lineToRelative(-3.388f, -6.776f)
                horizontalLineToRelative(2.29f)
                lineToRelative(-0.412f, -0.743f)
                close()
                moveTo(9.75f, 10.75f)
                horizontalLineToRelative(-1.4f)
                lineToRelative(2.9f, -5.22f)
                lineToRelative(2.9f, 5.22f)
                horizontalLineToRelative(-2.21f)
                lineToRelative(0.363f, 0.723f)
                lineToRelative(3.388f, 6.777f)
                lineTo(13.44f, 18.25f)
                lineToRelative(0.363f, 0.723f)
                lineToRelative(3.388f, 6.777f)
                lineTo(5.309f, 25.75f)
                lineToRelative(3.388f, -6.777f)
                lineToRelative(0.362f, -0.723f)
                horizontalLineToRelative(-2.25f)
                lineToRelative(3.388f, -6.777f)
                lineToRelative(0.362f, -0.723f)
                close()
                moveTo(27.0f, 14.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.75f, 1.75f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(3.5f)
                lineTo(28.75f, 16.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 27.0f, 14.75f)
                moveToRelative(-2.75f, 1.75f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-2.216f)
                lineToRelative(-0.033f, 0.464f)
                lineToRelative(-0.75f, 10.5f)
                lineToRelative(-0.038f, 0.536f)
                horizontalLineToRelative(11.574f)
                lineToRelative(-0.038f, -0.536f)
                lineToRelative(-0.75f, -10.5f)
                lineToRelative(-0.034f, -0.464f)
                lineTo(29.75f, 18.25f)
                lineTo(29.75f, 16.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, -5.5f, 0.0f)
                moveToRelative(-1.963f, 12.25f)
                lineToRelative(0.678f, -9.5f)
                horizontalLineToRelative(8.069f)
                lineToRelative(0.679f, 9.5f)
                close()
            }
        }
            .build()
        return _christmasTreeShoppingBagMedium!!
    }

private var _christmasTreeShoppingBagMedium: ImageVector? = null
