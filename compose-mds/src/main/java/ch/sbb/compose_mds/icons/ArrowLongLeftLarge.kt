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

public val SBBIcons.ArrowLongLeftLarge: ImageVector
    get() {
        if (_arrowLongLeftLarge != null) {
            return _arrowLongLeftLarge!!
        }
        _arrowLongLeftLarge = Builder(
            name = "ArrowLongLeftLarge",
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
                moveToRelative(14.802f, 18.202f)
                lineToRelative(0.354f, 0.353f)
                lineTo(9.724f, 24.0f)
                horizontalLineToRelative(30.277f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(9.727f)
                lineToRelative(5.429f, 5.429f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-6.283f, -6.283f)
                lineToRelative(-0.353f, -0.352f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(6.282f, -6.298f)
                close()
            }
        }
            .build()
        return _arrowLongLeftLarge!!
    }

private var _arrowLongLeftLarge: ImageVector? = null
