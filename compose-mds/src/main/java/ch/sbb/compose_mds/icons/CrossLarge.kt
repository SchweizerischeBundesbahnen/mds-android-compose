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

public val SBBIcons.CrossLarge: ImageVector
    get() {
        if (_crossLarge != null) {
            return _crossLarge!!
        }
        _crossLarge = Builder(
            name = "CrossLarge",
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
                moveTo(35.854f, 12.854f)
                lineTo(24.207f, 24.5f)
                lineToRelative(11.646f, 11.647f)
                lineToRelative(-0.706f, 0.706f)
                lineTo(23.5f, 25.207f)
                lineTo(11.854f, 36.853f)
                lineToRelative(-0.707f, -0.706f)
                lineTo(22.793f, 24.5f)
                lineTo(11.147f, 12.854f)
                lineToRelative(0.707f, -0.707f)
                lineTo(23.5f, 23.793f)
                lineToRelative(11.647f, -11.646f)
                close()
            }
        }
            .build()
        return _crossLarge!!
    }

private var _crossLarge: ImageVector? = null
