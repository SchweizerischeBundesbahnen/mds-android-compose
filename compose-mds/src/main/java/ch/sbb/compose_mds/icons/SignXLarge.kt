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

public val SBBIcons.SignXLarge: ImageVector
    get() {
        if (_signXLarge != null) {
            return _signXLarge!!
        }
        _signXLarge = Builder(name = "SignXLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.947f, 6.276f)
                lineToRelative(17.4f, 35.0f)
                lineToRelative(0.36f, 0.723f)
                lineTo(5.293f, 41.999f)
                lineToRelative(0.36f, -0.723f)
                lineToRelative(17.399f, -35.0f)
                lineToRelative(0.448f, -0.9f)
                close()
                moveTo(6.907f, 41.0f)
                horizontalLineToRelative(33.186f)
                lineTo(23.499f, 7.622f)
                close()
                moveTo(28.854f, 26.854f)
                lineTo(24.207f, 31.5f)
                lineToRelative(4.647f, 4.647f)
                lineToRelative(-0.707f, 0.706f)
                lineToRelative(-4.647f, -4.646f)
                lineToRelative(-4.646f, 4.646f)
                lineToRelative(-0.707f, -0.706f)
                lineToRelative(4.646f, -4.647f)
                lineToRelative(-4.646f, -4.646f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(4.646f, 4.646f)
                lineToRelative(4.647f, -4.646f)
                close()
            }
        }
        .build()
        return _signXLarge!!
    }

private var _signXLarge: ImageVector? = null
