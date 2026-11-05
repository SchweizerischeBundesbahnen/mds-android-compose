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

public val SBBIcons.ChevronLeftUpLarge: ImageVector
    get() {
        if (_chevronLeftUpLarge != null) {
            return _chevronLeftUpLarge!!
        }
        _chevronLeftUpLarge = Builder(
            name = "ChevronLeftUpLarge",
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
                moveTo(33.993f, 15.0f)
                horizontalLineToRelative(-19.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(20.0f)
                close()
            }
        }
            .build()
        return _chevronLeftUpLarge!!
    }

private var _chevronLeftUpLarge: ImageVector? = null
