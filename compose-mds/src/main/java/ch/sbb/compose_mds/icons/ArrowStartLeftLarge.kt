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

public val SBBIcons.ArrowStartLeftLarge: ImageVector
    get() {
        if (_arrowStartLeftLarge != null) {
            return _arrowStartLeftLarge!!
        }
        _arrowStartLeftLarge = Builder(
            name = "ArrowStartLeftLarge",
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
                moveToRelative(16.5f, 16.499f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(-7.128f, 7.13f)
                horizontalLineTo(30.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(9.724f)
                lineToRelative(7.13f, 7.164f)
                lineToRelative(-0.354f, 0.352f)
                lineToRelative(-0.354f, 0.352f)
                lineToRelative(-7.98f, -8.015f)
                lineToRelative(-0.352f, -0.354f)
                lineToRelative(0.352f, -0.352f)
                lineToRelative(7.98f, -7.985f)
                close()
                moveTo(39.0f, 32.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _arrowStartLeftLarge!!
    }

private var _arrowStartLeftLarge: ImageVector? = null
