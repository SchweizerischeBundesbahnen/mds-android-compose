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

public val SBBIcons.FilterLarge: ImageVector
    get() {
        if (_filterLarge != null) {
            return _filterLarge!!
        }
        _filterLarge = Builder(
            name = "FilterLarge",
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
                moveTo(38.88f, 10.824f)
                lineTo(27.0f, 24.684f)
                verticalLineToRelative(14.315f)
                horizontalLineToRelative(-7.0f)
                lineTo(20.0f, 24.684f)
                lineTo(8.12f, 10.824f)
                lineTo(7.413f, 10.0f)
                horizontalLineToRelative(32.174f)
                close()
                moveTo(20.88f, 24.174f)
                lineTo(21.0f, 24.314f)
                lineTo(21.0f, 38.0f)
                horizontalLineToRelative(5.0f)
                lineTo(26.0f, 24.314f)
                lineToRelative(0.12f, -0.14f)
                lineToRelative(11.293f, -13.175f)
                lineTo(9.587f, 10.999f)
                close()
            }
        }
            .build()
        return _filterLarge!!
    }

private var _filterLarge: ImageVector? = null
