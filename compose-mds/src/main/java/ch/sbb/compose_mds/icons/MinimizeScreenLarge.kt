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

public val SBBIcons.MinimizeScreenLarge: ImageVector
    get() {
        if (_minimizeScreenLarge != null) {
            return _minimizeScreenLarge!!
        }
        _minimizeScreenLarge = Builder(
            name = "MinimizeScreenLarge",
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
                moveTo(19.0f, 40.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.0f, 29.0f)
                lineTo(7.0f, 29.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(40.0f, 29.0f)
                lineTo(29.0f, 29.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(28.0f, 28.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                lineTo(18.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(29.0f, 18.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(1.0f)
                lineTo(28.0f, 19.0f)
                lineTo(28.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _minimizeScreenLarge!!
    }

private var _minimizeScreenLarge: ImageVector? = null
