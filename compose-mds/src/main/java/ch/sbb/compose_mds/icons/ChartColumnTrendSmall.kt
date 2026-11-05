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

public val SBBIcons.ChartColumnTrendSmall: ImageVector
    get() {
        if (_chartColumnTrendSmall != null) {
            return _chartColumnTrendSmall!!
        }
        _chartColumnTrendSmall = Builder(
            name = "ChartColumnTrendSmall",
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
                moveTo(19.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                moveToRelative(0.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.229f, 2.36f)
                lineToRelative(-3.356f, 4.698f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.542f, 0.452f)
                lineToRelative(-2.374f, -0.949f)
                lineTo(11.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.917f, 0.493f)
                lineToRelative(-2.79f, 2.233f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.625f, 0.78f)
                lineToRelative(2.79f, -2.232f)
                arcToRelative(1.497f, 1.497f, 0.0f, false, false, 1.92f, -0.284f)
                lineToRelative(2.373f, 0.949f)
                lineTo(13.0f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.729f, -0.86f)
                lineToRelative(3.356f, -4.698f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 2.0f)
                moveTo(4.0f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                moveToRelative(4.0f, 0.504f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.996f)
                horizontalLineToRelative(3.0f)
                lineTo(16.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 9.004f)
                horizontalLineToRelative(3.0f)
                lineTo(21.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(-4.996f)
                horizontalLineToRelative(3.0f)
                lineTo(6.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.996f)
                moveTo(10.0f, 21.0f)
                verticalLineToRelative(-6.996f)
                lineTo(9.0f, 14.004f)
                lineTo(9.0f, 21.0f)
                close()
                moveTo(15.0f, 21.0f)
                verticalLineToRelative(-4.996f)
                horizontalLineToRelative(-1.0f)
                lineTo(14.0f, 21.0f)
                close()
                moveTo(20.0f, 10.004f)
                lineTo(20.0f, 21.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(19.0f, 10.004f)
                close()
                moveTo(5.0f, 18.004f)
                lineTo(5.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(-2.996f)
                close()
                moveTo(9.5f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(4.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
            }
        }
            .build()
        return _chartColumnTrendSmall!!
    }

private var _chartColumnTrendSmall: ImageVector? = null
