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

public val SmallGroup.ArrowDownSmall: ImageVector
    get() {
        if (_arrowDownSmall != null) {
            return _arrowDownSmall!!
        }
        _arrowDownSmall = Builder(name = "ArrowDownSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(12.0f, 16.293f)
                lineToRelative(3.146f, -3.147f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(0.708f, -0.707f)
                lineTo(11.0f, 16.293f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _arrowDownSmall!!
    }

private var _arrowDownSmall: ImageVector? = null
