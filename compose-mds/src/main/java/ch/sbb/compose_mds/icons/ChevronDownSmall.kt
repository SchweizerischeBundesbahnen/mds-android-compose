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

public val SBBIcons.ChevronDownSmall: ImageVector
    get() {
        if (_chevronDownSmall != null) {
            return _chevronDownSmall!!
        }
        _chevronDownSmall = Builder(name = "ChevronDownSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.354f, 8.354f)
                lineTo(12.0f, 16.707f)
                lineTo(3.647f, 8.354f)
                lineToRelative(0.707f, -0.708f)
                lineTo(12.0f, 15.293f)
                lineToRelative(7.647f, -7.647f)
                close()
            }
        }
        .build()
        return _chevronDownSmall!!
    }

private var _chevronDownSmall: ImageVector? = null
