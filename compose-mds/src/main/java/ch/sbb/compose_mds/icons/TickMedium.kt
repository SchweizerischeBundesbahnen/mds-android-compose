package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
                    pathFillType = EvenOdd) {
                moveToRelative(28.853f, 10.868f)
                lineToRelative(-13.5f, 13.485f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(0.708f, -0.707f)
                lineTo(15.0f, 23.293f)
                lineTo(28.147f, 10.16f)
                close()
            }
        }
        .build()
        return _tickMedium!!
    }

private var _tickMedium: ImageVector? = null
