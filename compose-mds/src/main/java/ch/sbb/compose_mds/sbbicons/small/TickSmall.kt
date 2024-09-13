package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.TickSmall: ImageVector
    get() {
        if (_tickSmall != null) {
            return _tickSmall!!
        }
        _tickSmall = Builder(name = "TickSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(19.353f, 7.363f)
                lineToRelative(-9.0f, 8.99f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(0.708f, -0.707f)
                lineTo(10.0f, 15.293f)
                lineToRelative(8.647f, -8.637f)
                close()
            }
        }
        .build()
        return _tickSmall!!
    }

private var _tickSmall: ImageVector? = null
