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

public val SBBIcons.PulseMedium: ImageVector
    get() {
        if (_pulseMedium != null) {
            return _pulseMedium!!
        }
        _pulseMedium = Builder(name = "PulseMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.985f, 8.879f)
                lineToRelative(4.11f, 16.441f)
                lineToRelative(3.937f, -10.496f)
                lineToRelative(0.532f, -1.42f)
                lineToRelative(0.416f, 1.458f)
                lineToRelative(1.397f, 4.888f)
                horizontalLineTo(30.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.377f)
                lineToRelative(-1.187f, -4.156f)
                lineToRelative(-3.968f, 10.582f)
                lineToRelative(-0.564f, 1.503f)
                lineToRelative(-0.39f, -1.558f)
                lineTo(13.485f, 11.0f)
                lineToRelative(-2.5f, 9.379f)
                lineToRelative(-0.1f, 0.371f)
                horizontalLineTo(4.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.615f)
                lineToRelative(2.902f, -10.879f)
                lineToRelative(0.499f, -1.87f)
                close()
            }
        }
        .build()
        return _pulseMedium!!
    }

private var _pulseMedium: ImageVector? = null
