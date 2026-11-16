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

public val SBBIcons.ChartLineSmall: ImageVector
    get() {
        if (_chartLineSmall != null) {
            return _chartLineSmall!!
        }
        _chartLineSmall = Builder(name = "ChartLineSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 18.293f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(5.707f)
                lineToRelative(2.563f, -2.562f)
                lineToRelative(2.888f, -0.963f)
                lineToRelative(0.213f, -0.072f)
                lineToRelative(0.089f, -0.206f)
                lineTo(12.83f, 12.0f)
                horizontalLineToRelative(2.06f)
                lineToRelative(1.0f, -4.0f)
                horizontalLineToRelative(1.817f)
                lineToRelative(1.646f, -1.646f)
                lineToRelative(-0.707f, -0.708f)
                lineTo(17.293f, 7.0f)
                horizontalLineToRelative(-2.184f)
                lineToRelative(-1.0f, 4.0f)
                horizontalLineToRelative(-1.94f)
                lineToRelative(-0.129f, 0.303f)
                lineToRelative(-1.412f, 3.293f)
                lineToRelative(-2.786f, 0.93f)
                lineToRelative(-0.113f, 0.037f)
                lineToRelative(-0.083f, 0.083f)
                close()
            }
        }
        .build()
        return _chartLineSmall!!
    }

private var _chartLineSmall: ImageVector? = null
