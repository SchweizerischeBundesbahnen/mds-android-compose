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

public val SBBIcons.ChevronRightLarge: ImageVector
    get() {
        if (_chevronRightLarge != null) {
            return _chevronRightLarge!!
        }
        _chevronRightLarge = Builder(
            name = "ChevronRightLarge",
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
                moveTo(32.207f, 24.499f)
                lineTo(15.854f, 40.853f)
                lineToRelative(-0.707f, -0.708f)
                lineTo(30.793f, 24.5f)
                lineTo(15.147f, 8.853f)
                lineToRelative(0.707f, -0.708f)
                close()
            }
        }
            .build()
        return _chevronRightLarge!!
    }

private var _chevronRightLarge: ImageVector? = null
