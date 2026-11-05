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

public val SBBIcons.StopLarge: ImageVector
    get() {
        if (_stopLarge != null) {
            return _stopLarge!!
        }
        _stopLarge = Builder(
            name = "StopLarge",
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
                pathFillType = NonZero,
            ) {
                moveTo(37.0f, 37.0f)
                lineTo(10.0f, 37.0f)
                lineTo(10.0f, 10.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(11.0f, 36.0f)
                horizontalLineToRelative(25.0f)
                lineTo(36.0f, 11.0f)
                lineTo(11.0f, 11.0f)
                close()
            }
        }
            .build()
        return _stopLarge!!
    }

private var _stopLarge: ImageVector? = null
