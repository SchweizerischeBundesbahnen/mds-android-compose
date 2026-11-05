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

public val SBBIcons.ChevronSmallEndLeftLarge: ImageVector
    get() {
        if (_chevronSmallEndLeftLarge != null) {
            return _chevronSmallEndLeftLarge!!
        }
        _chevronSmallEndLeftLarge = Builder(
            name = "ChevronSmallEndLeftLarge",
            defaultWidth =
                48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight =
            48.0f,
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
                moveToRelative(33.202f, 17.048f)
                lineToRelative(-7.54f, 7.452f)
                lineToRelative(7.536f, 7.453f)
                lineToRelative(-0.351f, 0.355f)
                lineToRelative(-0.353f, 0.356f)
                lineToRelative(-7.895f, -7.809f)
                lineToRelative(-0.36f, -0.355f)
                lineToRelative(0.36f, -0.356f)
                lineToRelative(7.9f, -7.807f)
                close()
                moveTo(17.0f, 31.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _chevronSmallEndLeftLarge!!
    }

private var _chevronSmallEndLeftLarge: ImageVector? = null
