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

public val SBBIcons.FilterXLarge: ImageVector
    get() {
        if (_filterXLarge != null) {
            return _filterXLarge!!
        }
        _filterXLarge = Builder(name = "FilterXLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(35.854f, 29.853f)
                lineToRelative(-4.647f, 4.646f)
                lineToRelative(4.646f, 4.646f)
                lineToRelative(-0.706f, 0.707f)
                lineToRelative(-4.647f, -4.646f)
                lineToRelative(-4.646f, 4.646f)
                lineToRelative(-0.707f, -0.706f)
                lineToRelative(4.646f, -4.647f)
                lineToRelative(-4.646f, -4.647f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(4.646f, 4.647f)
                lineToRelative(4.647f, -4.647f)
                close()
                moveTo(38.88f, 8.824f)
                lineTo(27.0f, 22.684f)
                verticalLineTo(26.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.686f)
                lineToRelative(0.12f, -0.14f)
                lineTo(37.413f, 8.999f)
                horizontalLineTo(9.587f)
                lineTo(20.88f, 22.174f)
                lineToRelative(0.12f, 0.14f)
                verticalLineTo(36.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(22.684f)
                lineTo(8.12f, 8.824f)
                lineTo(7.413f, 8.0f)
                horizontalLineToRelative(32.174f)
                close()
            }
        }
        .build()
        return _filterXLarge!!
    }

private var _filterXLarge: ImageVector? = null
