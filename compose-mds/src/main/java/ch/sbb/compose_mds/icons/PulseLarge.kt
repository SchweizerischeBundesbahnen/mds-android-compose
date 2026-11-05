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

public val SBBIcons.PulseLarge: ImageVector
    get() {
        if (_pulseLarge != null) {
            return _pulseLarge!!
        }
        _pulseLarge = Builder(name = "PulseLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.985f, 11.379f)
                lineToRelative(5.61f, 22.441f)
                lineToRelative(5.437f, -14.496f)
                lineToRelative(0.532f, -1.42f)
                lineToRelative(0.416f, 1.458f)
                lineTo(32.878f, 26.0f)
                horizontalLineTo(41.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-8.877f)
                lineToRelative(-1.687f, -5.906f)
                lineToRelative(-5.468f, 14.582f)
                lineToRelative(-0.564f, 1.503f)
                lineToRelative(-0.39f, -1.558f)
                lineToRelative(-5.53f, -22.121f)
                lineToRelative(-3.5f, 13.129f)
                lineToRelative(-0.1f, 0.371f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.115f)
                lineToRelative(3.902f, -14.629f)
                lineToRelative(0.499f, -1.87f)
                close()
            }
        }
        .build()
        return _pulseLarge!!
    }

private var _pulseLarge: ImageVector? = null
