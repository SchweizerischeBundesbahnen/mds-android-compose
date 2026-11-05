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

public val SBBIcons.ChevronLeftLarge: ImageVector
    get() {
        if (_chevronLeftLarge != null) {
            return _chevronLeftLarge!!
        }
        _chevronLeftLarge = Builder(
            name = "ChevronLeftLarge",
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
                moveToRelative(31.147f, 8.145f)
                lineToRelative(0.707f, 0.708f)
                lineToRelative(-15.647f, 15.646f)
                lineToRelative(15.647f, 15.647f)
                lineToRelative(-0.707f, 0.706f)
                lineTo(14.793f, 24.5f)
                close()
            }
        }
            .build()
        return _chevronLeftLarge!!
    }

private var _chevronLeftLarge: ImageVector? = null
