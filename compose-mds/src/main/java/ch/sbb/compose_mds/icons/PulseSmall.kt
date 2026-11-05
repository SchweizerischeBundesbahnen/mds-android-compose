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

public val SBBIcons.PulseSmall: ImageVector
    get() {
        if (_pulseSmall != null) {
            return _pulseSmall!!
        }
        _pulseSmall = Builder(
            name = "PulseSmall",
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
                pathFillType = NonZero,
            ) {
                moveToRelative(9.485f, 5.879f)
                lineToRelative(2.61f, 10.441f)
                lineToRelative(2.437f, -6.496f)
                lineToRelative(0.533f, -1.42f)
                lineToRelative(0.415f, 1.458f)
                lineToRelative(0.897f, 3.138f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.377f)
                lineToRelative(-0.687f, -2.406f)
                lineToRelative(-2.468f, 6.582f)
                lineToRelative(-0.564f, 1.503f)
                lineToRelative(-0.39f, -1.558f)
                lineTo(8.985f, 8.0f)
                lineToRelative(-1.5f, 5.629f)
                lineToRelative(-0.1f, 0.371f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.615f)
                lineToRelative(1.902f, -7.129f)
                lineToRelative(0.499f, -1.87f)
                close()
            }
        }
            .build()
        return _pulseSmall!!
    }

private var _pulseSmall: ImageVector? = null
