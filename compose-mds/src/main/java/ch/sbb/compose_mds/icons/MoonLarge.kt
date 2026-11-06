package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.MoonLarge: ImageVector
    get() {
        if (_moonLarge != null) {
            return _moonLarge!!
        }
        _moonLarge = Builder(name = "MoonLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.012f, 12.372f)
                curveToRelative(-1.522f, 4.187f, -0.105f, 9.348f, 3.177f, 12.994f)
                curveToRelative(3.264f, 3.627f, 8.312f, 5.687f, 13.992f, 3.762f)
                lineToRelative(1.998f, -0.678f)
                lineToRelative(-1.481f, 1.502f)
                curveToRelative(-3.633f, 3.684f, -7.514f, 5.13f, -11.087f, 4.995f)
                curveToRelative(-3.563f, -0.134f, -6.76f, -1.835f, -9.038f, -4.334f)
                curveToRelative(-2.277f, -2.497f, -3.66f, -5.813f, -3.568f, -9.21f)
                curveToRelative(0.091f, -3.41f, 1.67f, -6.86f, 5.233f, -9.598f)
                lineToRelative(1.36f, -1.045f)
                close()
                moveTo(17.625f, 13.642f)
                curveToRelative(-2.467f, 2.355f, -3.548f, 5.102f, -3.62f, 7.789f)
                curveToRelative(-0.084f, 3.11f, 1.183f, 6.18f, 3.306f, 8.508f)
                curveToRelative(2.122f, 2.327f, 5.076f, 3.887f, 8.337f, 4.01f)
                curveToRelative(2.795f, 0.104f, 5.861f, -0.846f, 8.87f, -3.347f)
                curveToRelative(-5.306f, 1.034f, -9.968f, -1.117f, -13.072f, -4.566f)
                curveToRelative(-3.072f, -3.413f, -4.664f, -8.15f, -3.821f, -12.393f)
            }
        }
        .build()
        return _moonLarge!!
    }

private var _moonLarge: ImageVector? = null
