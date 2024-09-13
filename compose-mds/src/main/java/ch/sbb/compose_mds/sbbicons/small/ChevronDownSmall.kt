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

public val SmallGroup.ChevronDownSmall: ImageVector
    get() {
        if (_chevronDownSmall != null) {
            return _chevronDownSmall!!
        }
        _chevronDownSmall = Builder(name = "ChevronDownSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(12.0f, 15.293f)
                lineToRelative(7.647f, -7.647f)
                lineToRelative(0.707f, 0.708f)
                lineToRelative(-8.0f, 8.0f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-8.0f, -8.0f)
                lineToRelative(0.708f, -0.708f)
                close()
            }
        }
        .build()
        return _chevronDownSmall!!
    }

private var _chevronDownSmall: ImageVector? = null
