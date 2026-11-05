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

public val SBBIcons.ClipboardTickLarge: ImageVector
    get() {
        if (_clipboardTickLarge != null) {
            return _clipboardTickLarge!!
        }
        _clipboardTickLarge = Builder(
            name = "ClipboardTickLarge",
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
                moveTo(29.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(37.0f)
                lineTo(6.0f, 43.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 4.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(7.0f, 42.0f)
                horizontalLineToRelative(33.0f)
                lineTo(40.0f, 7.0f)
                lineTo(29.0f, 7.0f)
                verticalLineToRelative(2.0f)
                lineTo(18.0f, 9.0f)
                lineTo(18.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(33.898f, 15.802f)
                lineTo(19.898f, 34.302f)
                lineTo(19.586f, 34.715f)
                lineTo(19.185f, 34.388f)
                lineTo(11.185f, 27.888f)
                lineTo(11.815f, 27.112f)
                lineTo(19.413f, 33.285f)
                lineTo(33.102f, 15.198f)
                close()
                moveTo(19.0f, 8.0f)
                horizontalLineToRelative(9.0f)
                lineTo(28.0f, 5.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
            .build()
        return _clipboardTickLarge!!
    }

private var _clipboardTickLarge: ImageVector? = null
