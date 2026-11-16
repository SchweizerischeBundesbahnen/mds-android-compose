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

public val SBBIcons.ChartPieLarge: ImageVector
    get() {
        if (_chartPieLarge != null) {
            return _chartPieLarge!!
        }
        _chartPieLarge = Builder(name = "ChartPieLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(41.001f, 12.819f)
                curveTo(37.481f, 7.063f, 31.2f, 3.179f, 24.0f, 3.006f)
                verticalLineToRelative(19.628f)
                close()
                moveTo(41.501f, 13.684f)
                lineTo(24.5f, 23.5f)
                lineToRelative(17.001f, 9.816f)
                arcTo(20.4f, 20.4f, 0.0f, false, false, 44.0f, 23.5f)
                curveToRelative(0.0f, -3.556f, -0.906f, -6.9f, -2.499f, -9.816f)
                moveTo(23.0f, 23.789f)
                lineTo(23.0f, 3.006f)
                quadToRelative(-0.285f, 0.008f, -0.565f, 0.021f)
                curveTo(11.608f, 3.582f, 3.0f, 12.536f, 3.0f, 23.5f)
                curveTo(3.0f, 34.822f, 12.178f, 44.0f, 23.5f, 44.0f)
                curveToRelative(7.409f, 0.0f, 13.9f, -3.93f, 17.501f, -9.819f)
                lineTo(23.25f, 23.933f)
                close()
                moveTo(45.0f, 23.5f)
                curveTo(45.0f, 35.374f, 35.374f, 45.0f, 23.5f, 45.0f)
                reflectiveCurveTo(2.0f, 35.374f, 2.0f, 23.5f)
                curveTo(2.0f, 12.0f, 11.028f, 2.61f, 22.383f, 2.028f)
                quadTo(22.938f, 2.0f, 23.5f, 2.0f)
                curveTo(35.374f, 2.0f, 45.0f, 11.626f, 45.0f, 23.5f)
            }
        }
        .build()
        return _chartPieLarge!!
    }

private var _chartPieLarge: ImageVector? = null
