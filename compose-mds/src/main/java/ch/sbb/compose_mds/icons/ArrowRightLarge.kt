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

public val SBBIcons.ArrowRightLarge: ImageVector
    get() {
        if (_arrowRightLarge != null) {
            return _arrowRightLarge!!
        }
        _arrowRightLarge = Builder(
            name = "ArrowRightLarge",
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
                moveToRelative(35.834f, 24.13f)
                lineToRelative(0.352f, 0.352f)
                lineToRelative(-0.352f, 0.354f)
                lineToRelative(-7.98f, 8.016f)
                lineToRelative(-0.709f, -0.705f)
                lineToRelative(7.13f, -7.164f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(24.273f)
                lineToRelative(-7.127f, -7.13f)
                lineToRelative(0.707f, -0.708f)
                close()
            }
        }
            .build()
        return _arrowRightLarge!!
    }

private var _arrowRightLarge: ImageVector? = null
