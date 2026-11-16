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

public val SBBIcons.FilterFilledLarge: ImageVector
    get() {
        if (_filterFilledLarge != null) {
            return _filterFilledLarge!!
        }
        _filterFilledLarge = Builder(name = "FilterFilledLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.88f, 10.824f)
                lineTo(27.0f, 24.684f)
                verticalLineToRelative(14.315f)
                horizontalLineToRelative(-7.0f)
                verticalLineTo(24.684f)
                lineTo(8.12f, 10.824f)
                lineTo(7.413f, 10.0f)
                horizontalLineToRelative(32.174f)
                close()
            }
        }
        .build()
        return _filterFilledLarge!!
    }

private var _filterFilledLarge: ImageVector? = null
