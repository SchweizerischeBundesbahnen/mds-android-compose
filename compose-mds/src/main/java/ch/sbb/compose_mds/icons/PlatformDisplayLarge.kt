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

public val SBBIcons.PlatformDisplayLarge: ImageVector
    get() {
        if (_platformDisplayLarge != null) {
            return _platformDisplayLarge!!
        }
        _platformDisplayLarge = Builder(name = "PlatformDisplayLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.999f, 19.0f)
                horizontalLineToRelative(29.003f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                lineTo(43.0f, 19.0f)
                verticalLineToRelative(13.0f)
                lineTo(4.0f, 32.0f)
                lineTo(4.0f, 19.0f)
                horizontalLineToRelative(3.999f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(5.0f, 31.0f)
                horizontalLineToRelative(37.0f)
                lineTo(42.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                close()
                moveTo(40.0f, 28.001f)
                lineTo(13.0f, 28.001f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(12.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(40.0f, 24.0f)
                lineTo(13.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(27.0f)
                close()
            }
        }
        .build()
        return _platformDisplayLarge!!
    }

private var _platformDisplayLarge: ImageVector? = null
