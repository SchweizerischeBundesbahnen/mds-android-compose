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

public val SBBIcons.ChartLineMedium: ImageVector
    get() {
        if (_chartLineMedium != null) {
            return _chartLineMedium!!
        }
        _chartLineMedium = Builder(
            name = "ChartLineMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                moveTo(6.25f, 7.5f)
                verticalLineToRelative(22.25f)
                horizontalLineTo(30.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(7.957f)
                lineToRelative(4.313f, -4.313f)
                lineToRelative(4.388f, -1.463f)
                lineToRelative(0.213f, -0.07f)
                lineToRelative(0.089f, -0.207f)
                lineToRelative(2.12f, -4.947f)
                horizontalLineToRelative(3.06f)
                lineToRelative(0.095f, -0.379f)
                lineToRelative(1.405f, -5.621f)
                horizontalLineToRelative(2.817f)
                lineToRelative(0.147f, -0.146f)
                lineToRelative(2.25f, -2.25f)
                lineToRelative(-0.708f, -0.708f)
                lineToRelative(-2.103f, 2.104f)
                horizontalLineTo(22.86f)
                lineToRelative(-0.095f, 0.379f)
                lineToRelative(-1.405f, 5.621f)
                horizontalLineToRelative(-2.94f)
                lineToRelative(-0.13f, 0.303f)
                lineToRelative(-2.161f, 5.044f)
                lineToRelative(-4.287f, 1.429f)
                lineToRelative(-0.112f, 0.037f)
                lineToRelative(-0.084f, 0.083f)
                lineToRelative(-4.396f, 4.397f)
                verticalLineTo(7.5f)
                close()
            }
        }
            .build()
        return _chartLineMedium!!
    }

private var _chartLineMedium: ImageVector? = null
