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

public val SBBIcons.ArrowEndRightLarge: ImageVector
    get() {
        if (_arrowEndRightLarge != null) {
            return _arrowEndRightLarge!!
        }
        _arrowEndRightLarge = Builder(
            name = "ArrowEndRightLarge",
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
                moveToRelative(29.834f, 24.13f)
                lineToRelative(0.352f, 0.352f)
                lineToRelative(-0.352f, 0.354f)
                lineToRelative(-7.98f, 8.016f)
                lineToRelative(-0.709f, -0.705f)
                lineToRelative(7.13f, -7.164f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(20.273f)
                lineToRelative(-7.126f, -7.13f)
                lineToRelative(0.707f, -0.708f)
                close()
                moveTo(40.0f, 32.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _arrowEndRightLarge!!
    }

private var _arrowEndRightLarge: ImageVector? = null
