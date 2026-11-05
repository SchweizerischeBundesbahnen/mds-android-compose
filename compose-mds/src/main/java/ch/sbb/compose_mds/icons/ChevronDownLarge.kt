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

public val SBBIcons.ChevronDownLarge: ImageVector
    get() {
        if (_chevronDownLarge != null) {
            return _chevronDownLarge!!
        }
        _chevronDownLarge = Builder(
            name = "ChevronDownLarge",
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
                moveTo(39.854f, 15.854f)
                lineTo(23.5f, 32.207f)
                lineTo(7.146f, 15.854f)
                lineToRelative(0.708f, -0.707f)
                lineTo(23.5f, 30.793f)
                lineToRelative(15.647f, -15.646f)
                close()
            }
        }
            .build()
        return _chevronDownLarge!!
    }

private var _chevronDownLarge: ImageVector? = null
