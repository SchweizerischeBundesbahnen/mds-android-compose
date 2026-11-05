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
        _chartColumnTrendLarge = Builder(
            name = "ChartColumnTrendLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(38.0f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 38.0f, 7.5f)
                moveTo(39.5f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.83f, 4.203f)
                lineToRelative(-7.153f, 10.013f)
                arcToRelative(2.498f, 2.498f, 0.0f, false, false, -3.08f, 0.871f)
                lineToRelative(-5.486f, -2.095f)
                quadTo(22.0f, 17.754f, 22.0f, 17.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -4.725f, 1.14f)
                lineTo(11.1f, 23.58f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.625f, 0.78f)
                lineToRelative(6.174f, -4.94f)
                arcToRelative(2.498f, 2.498f, 0.0f, false, false, 3.662f, -0.506f)
                lineToRelative(5.486f, 2.095f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.282f, -1.211f)
                lineToRelative(7.153f, -10.014f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 39.5f, 5.0f)
                moveTo(8.0f, 25.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 25.5f)
                moveToRelative(9.0f, 1.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(16.0f)
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
                moveToRelative(14.0f, 16.0f)
                lineTo(31.0f, 32.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(18.0f, 43.0f)
                horizontalLineToRelative(3.0f)
                lineTo(21.0f, 28.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(11.0f, 36.0f)
                verticalLineToRelative(7.0f)
                lineTo(8.0f, 43.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(19.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.001f, 3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 16.0f)
                moveToRelative(8.5f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 28.0f, 21.5f)
                moveTo(41.0f, 43.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(38.0f, 20.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
            .build()
        return _chartColumnTrendLarge!!
    }

private var _chartColumnTrendLarge: ImageVector? = null
