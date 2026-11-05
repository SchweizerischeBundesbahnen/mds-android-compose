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

public val SBBIcons.ArrowUpLarge: ImageVector
    get() {
        if (_arrowUpLarge != null) {
            return _arrowUpLarge!!
        }
        _arrowUpLarge = Builder(
            name = "ArrowUpLarge",
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
                moveToRelative(31.854f, 19.147f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(24.0f, 12.707f)
                verticalLineTo(37.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(12.707f)
                lineToRelative(-7.146f, 7.147f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(8.353f, -8.354f)
                close()
            }
        }
            .build()
        return _arrowUpLarge!!
    }

private var _arrowUpLarge: ImageVector? = null
