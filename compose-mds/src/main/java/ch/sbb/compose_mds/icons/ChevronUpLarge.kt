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

public val SBBIcons.ChevronUpLarge: ImageVector
    get() {
        if (_chevronUpLarge != null) {
            return _chevronUpLarge!!
        }
        _chevronUpLarge = Builder(name = "ChevronUpLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(39.854f, 31.147f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(23.5f, 16.206f)
                lineTo(7.854f, 31.854f)
                lineToRelative(-0.708f, -0.707f)
                lineTo(23.5f, 14.793f)
                close()
            }
        }
        .build()
        return _chevronUpLarge!!
    }

private var _chevronUpLarge: ImageVector? = null
