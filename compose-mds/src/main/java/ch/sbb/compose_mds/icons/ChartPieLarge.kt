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
                moveTo(22.434f, 3.027f)
                quadToRelative(0.282f, -0.015f, 0.566f, -0.021f)
                verticalLineToRelative(20.783f)
                lineToRelative(0.25f, 0.144f)
                lineTo(41.0f, 34.181f)
                curveTo(37.4f, 40.071f, 30.909f, 44.0f, 23.5f, 44.0f)
                curveTo(12.178f, 44.0f, 3.0f, 34.822f, 3.0f, 23.5f)
                curveTo(3.0f, 12.536f, 11.608f, 3.581f, 22.434f, 3.027f)
                moveTo(44.0f, 23.5f)
                curveToRelative(0.0f, 3.556f, -0.906f, 6.9f, -2.498f, 9.816f)
                lineTo(24.5f, 23.5f)
                lineToRelative(17.002f, -9.816f)
                arcTo(20.4f, 20.4f, 0.0f, false, true, 44.0f, 23.5f)
                moveToRelative(-3.0f, -10.681f)
                curveToRelative(-3.52f, -5.756f, -9.8f, -9.64f, -17.0f, -9.813f)
                verticalLineToRelative(19.628f)
                close()
                moveTo(22.384f, 2.029f)
                quadToRelative(0.555f, -0.03f, 1.117f, -0.029f)
                curveTo(35.374f, 2.0f, 45.0f, 11.626f, 45.0f, 23.5f)
                reflectiveCurveTo(35.374f, 45.0f, 23.5f, 45.0f)
                reflectiveCurveTo(2.0f, 35.374f, 2.0f, 23.5f)
                curveTo(2.0f, 12.0f, 11.028f, 2.61f, 22.383f, 2.029f)
            }
        }
        .build()
        return _chartPieLarge!!
    }

private var _chartPieLarge: ImageVector? = null
