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

public val SBBIcons.TickSmall: ImageVector
    get() {
        if (_tickSmall != null) {
            return _tickSmall!!
        }
        _tickSmall = Builder(name = "TickSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.354f, 7.363f)
                lineToRelative(-9.0f, 8.99f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-4.353f, -4.354f)
                lineToRelative(0.707f, -0.707f)
                lineTo(10.0f, 15.293f)
                lineToRelative(8.647f, -8.637f)
                close()
            }
        }
        .build()
        return _tickSmall!!
    }

private var _tickSmall: ImageVector? = null
