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

public val SBBIcons.RewindLarge: ImageVector
    get() {
        if (_rewindLarge != null) {
            return _rewindLarge!!
        }
        _rewindLarge = Builder(
            name = "RewindLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
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
                moveToRelative(39.0f, 37.5f)
                lineToRelative(-0.8f, -0.6f)
                lineTo(27.0f, 28.5f)
                verticalLineToRelative(8.978f)
                lineToRelative(-0.793f, -0.573f)
                lineToRelative(-18.0f, -13.0f)
                lineToRelative(-0.56f, -0.405f)
                lineToRelative(0.56f, -0.405f)
                lineToRelative(18.0f, -13.0f)
                lineTo(27.0f, 9.522f)
                lineTo(27.0f, 18.5f)
                lineToRelative(11.2f, -8.4f)
                lineToRelative(0.8f, -0.599f)
                close()
                moveTo(9.354f, 23.5f)
                lineTo(26.0f, 35.522f)
                lineTo(26.0f, 26.5f)
                lineToRelative(0.8f, 0.6f)
                lineTo(38.0f, 35.499f)
                lineTo(38.0f, 11.5f)
                lineToRelative(-11.2f, 8.4f)
                lineToRelative(-0.8f, 0.6f)
                verticalLineToRelative(-9.022f)
                close()
            }
        }
            .build()
        return _rewindLarge!!
    }

private var _rewindLarge: ImageVector? = null
