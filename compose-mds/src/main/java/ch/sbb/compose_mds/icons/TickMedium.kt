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

public val SBBIcons.TickMedium: ImageVector
    get() {
        if (_tickMedium != null) {
            return _tickMedium!!
        }
        _tickMedium = Builder(name = "TickMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(28.854f, 10.868f)
                lineToRelative(-13.5f, 13.485f)
                lineTo(15.0f, 24.0f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-6.353f, -6.354f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(5.645f, 5.646f)
                lineToRelative(13.147f, -13.13f)
                close()
            }
        }
        .build()
        return _tickMedium!!
    }

private var _tickMedium: ImageVector? = null
