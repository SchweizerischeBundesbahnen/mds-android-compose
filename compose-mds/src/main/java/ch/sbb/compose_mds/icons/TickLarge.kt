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

public val SBBIcons.TickLarge: ImageVector
    get() {
        if (_tickLarge != null) {
            return _tickLarge!!
        }
        _tickLarge = Builder(
            name = "TickLarge",
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
                moveToRelative(37.854f, 14.873f)
                lineToRelative(-18.0f, 17.98f)
                lineToRelative(-0.354f, 0.352f)
                lineToRelative(-0.354f, -0.352f)
                lineToRelative(-8.0f, -8.0f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(7.646f, 7.646f)
                lineToRelative(17.647f, -17.626f)
                close()
            }
        }
            .build()
        return _tickLarge!!
    }

private var _tickLarge: ImageVector? = null
