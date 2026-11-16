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
        _chartColumnTrendSmall = Builder(name = "ChartColumnTrendSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                moveToRelative(0.0f, 2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.23f, -0.64f)
                lineToRelative(-3.355f, 4.698f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.542f, 0.453f)
                lineToRelative(-2.374f, -0.95f)
                lineTo(11.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.917f, 0.493f)
                lineToRelative(-2.791f, 2.233f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.625f, 0.781f)
                lineToRelative(2.79f, -2.233f)
                arcToRelative(1.497f, 1.497f, 0.0f, false, false, 1.92f, -0.284f)
                lineToRelative(2.374f, 0.95f)
                lineToRelative(-0.001f, 0.06f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.73f, -0.86f)
                lineToRelative(3.355f, -4.698f)
                quadTo(19.284f, 5.0f, 19.5f, 5.0f)
                moveToRelative(-15.0f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                moveToRelative(6.5f, 9.0f)
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
                horizontalLineToRelative(3.0f)
                close()
                moveTo(9.0f, 21.0f)
                verticalLineToRelative(-6.996f)
                horizontalLineToRelative(1.0f)
                lineTo(10.0f, 21.0f)
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
                moveTo(10.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveToRelative(4.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
            }
        }
        .build()
        return _chartColumnTrendSmall!!
    }

private var _chartColumnTrendSmall: ImageVector? = null
