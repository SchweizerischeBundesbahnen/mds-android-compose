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

public val SBBIcons.ChartColumnTrendLarge: ImageVector
    get() {
        if (_chartColumnTrendLarge != null) {
            return _chartColumnTrendLarge!!
        }
        _chartColumnTrendLarge = Builder(name = "ChartColumnTrendLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(39.5f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.001f, 3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 39.5f, 6.0f)
                moveToRelative(0.0f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -1.83f, -0.797f)
                lineToRelative(-7.153f, 10.013f)
                arcToRelative(2.498f, 2.498f, 0.0f, false, false, -3.08f, 0.872f)
                lineToRelative(-5.486f, -2.095f)
                quadToRelative(0.048f, -0.24f, 0.049f, -0.493f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -4.726f, 1.14f)
                lineTo(11.1f, 23.58f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.625f, 0.781f)
                lineToRelative(6.175f, -4.94f)
                arcToRelative(2.498f, 2.498f, 0.0f, false, false, 3.662f, -0.506f)
                lineToRelative(5.486f, 2.093f)
                arcTo(2.504f, 2.504f, 0.0f, false, false, 29.5f, 24.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.83f, -4.202f)
                lineToRelative(7.153f, -10.014f)
                curveToRelative(0.311f, 0.139f, 0.655f, 0.216f, 1.017f, 0.216f)
                moveToRelative(-30.0f, 14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.001f, 3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 24.0f)
                moveTo(22.0f, 43.0f)
                horizontalLineToRelative(5.0f)
                lineTo(27.0f, 31.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(5.0f)
                lineTo(37.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(25.0f)
                lineTo(7.0f, 44.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(5.0f)
                lineTo(17.0f, 27.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(18.0f, 43.0f)
                lineTo(18.0f, 28.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(31.0f, 43.0f)
                lineTo(31.0f, 32.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(41.0f, 20.0f)
                verticalLineToRelative(23.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(38.0f, 20.0f)
                close()
                moveTo(11.0f, 36.0f)
                verticalLineToRelative(7.0f)
                lineTo(8.0f, 43.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(21.0f, 17.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 17.5f)
                moveToRelative(8.5f, 2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.001f, 3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 29.5f, 20.0f)
            }
        }
        .build()
        return _chartColumnTrendLarge!!
    }

private var _chartColumnTrendLarge: ImageVector? = null
