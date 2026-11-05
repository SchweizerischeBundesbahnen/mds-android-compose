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

public val SBBIcons.NextLarge: ImageVector
    get() {
        if (_nextLarge != null) {
            return _nextLarge!!
        }
        _nextLarge = Builder(name = "NextLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.772f, 10.081f)
                lineTo(29.417f, 23.5f)
                lineTo(8.772f, 36.919f)
                lineTo(8.0f, 37.42f)
                lineTo(8.0f, 9.579f)
                close()
                moveTo(39.002f, 37.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(32.002f, 10.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(33.002f, 36.0f)
                horizontalLineToRelative(5.0f)
                lineTo(38.002f, 11.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(9.0f, 35.578f)
                lineToRelative(9.228f, -5.997f)
                lineToRelative(9.355f, -6.081f)
                lineToRelative(-9.355f, -6.081f)
                lineTo(9.0f, 11.42f)
                close()
            }
        }
        .build()
        return _nextLarge!!
    }

private var _nextLarge: ImageVector? = null
