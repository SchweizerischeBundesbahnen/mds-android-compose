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

public val SBBIcons.ChartPieSmall: ImageVector
    get() {
        if (_chartPieSmall != null) {
            return _chartPieSmall!!
        }
        _chartPieSmall = Builder(name = "ChartPieSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 12.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 7.0f, -7.483f)
                verticalLineToRelative(7.772f)
                lineToRelative(0.25f, 0.144f)
                lineToRelative(6.481f, 3.742f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 5.0f, 12.5f)
                moveToRelative(15.0f, 0.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -0.768f, 3.31f)
                lineTo(13.5f, 12.5f)
                lineToRelative(5.732f, -3.31f)
                curveToRelative(0.492f, 0.999f, 0.768f, 2.122f, 0.768f, 3.31f)
                moveToRelative(-1.269f, -4.175f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 13.0f, 5.016f)
                verticalLineToRelative(6.618f)
                close()
                moveTo(12.057f, 4.012f)
                quadToRelative(0.225f, -0.013f, 0.443f, -0.012f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, -0.443f, 0.012f)
            }
        }
        .build()
        return _chartPieSmall!!
    }

private var _chartPieSmall: ImageVector? = null
