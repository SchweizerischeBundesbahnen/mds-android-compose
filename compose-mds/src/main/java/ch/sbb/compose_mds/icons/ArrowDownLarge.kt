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

public val SBBIcons.ArrowDownLarge: ImageVector
    get() {
        if (_arrowDownLarge != null) {
            return _arrowDownLarge!!
        }
        _arrowDownLarge = Builder(
            name = "ArrowDownLarge",
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
                moveToRelative(24.0f, 34.292f)
                lineToRelative(7.147f, -7.147f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-8.354f, 8.354f)
                lineToRelative(-8.353f, -8.354f)
                lineToRelative(0.707f, -0.707f)
                lineTo(23.0f, 34.293f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _arrowDownLarge!!
    }

private var _arrowDownLarge: ImageVector? = null
