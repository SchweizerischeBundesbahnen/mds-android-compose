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

public val SBBIcons.CrossTinyLarge: ImageVector
    get() {
        if (_crossTinyLarge != null) {
            return _crossTinyLarge!!
        }
        _crossTinyLarge = Builder(name = "CrossTinyLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.854f, 16.854f)
                lineTo(24.207f, 24.5f)
                lineToRelative(7.647f, 7.647f)
                lineToRelative(-0.707f, 0.706f)
                lineToRelative(-7.647f, -7.646f)
                lineToRelative(-7.646f, 7.646f)
                lineToRelative(-0.707f, -0.706f)
                lineToRelative(7.646f, -7.647f)
                lineToRelative(-7.646f, -7.646f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(7.646f, 7.646f)
                lineToRelative(7.647f, -7.646f)
                close()
            }
        }
        .build()
        return _crossTinyLarge!!
    }

private var _crossTinyLarge: ImageVector? = null
