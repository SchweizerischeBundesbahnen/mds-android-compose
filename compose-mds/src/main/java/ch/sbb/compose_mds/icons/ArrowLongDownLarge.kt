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

public val SBBIcons.ArrowLongDownLarge: ImageVector
    get() {
        if (_arrowLongDownLarge != null) {
            return _arrowLongDownLarge!!
        }
        _arrowLongDownLarge = Builder(
            name = "ArrowLongDownLarge",
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
                moveToRelative(24.01f, 38.273f)
                lineToRelative(5.43f, -5.43f)
                lineToRelative(0.706f, 0.708f)
                lineToRelative(-6.282f, 6.284f)
                lineToRelative(-0.352f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-6.299f, -6.284f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(5.445f, 5.43f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _arrowLongDownLarge!!
    }

private var _arrowLongDownLarge: ImageVector? = null
