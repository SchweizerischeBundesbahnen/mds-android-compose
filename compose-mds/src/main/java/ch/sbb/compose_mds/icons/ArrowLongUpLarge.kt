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

public val SBBIcons.ArrowLongUpLarge: ImageVector
    get() {
        if (_arrowLongUpLarge != null) {
            return _arrowLongUpLarge!!
        }
        _arrowLongUpLarge = Builder(
            name = "ArrowLongUpLarge",
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
                moveToRelative(23.849f, 8.166f)
                lineToRelative(6.299f, 6.283f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-5.445f, -5.434f)
                verticalLineToRelative(30.278f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(9.725f)
                lineToRelative(-5.428f, 5.432f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(6.282f, -6.284f)
                lineToRelative(0.352f, -0.354f)
                close()
            }
        }
            .build()
        return _arrowLongUpLarge!!
    }

private var _arrowLongUpLarge: ImageVector? = null
