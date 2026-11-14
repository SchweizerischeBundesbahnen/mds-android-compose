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

public val SBBIcons.ArrowLongDownSmall: ImageVector
    get() {
        if (_arrowLongDownSmall != null) {
            return _arrowLongDownSmall!!
        }
        _arrowLongDownSmall = Builder(name = "ArrowLongDownSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(11.507f, 19.49f)
                lineToRelative(0.352f, 0.354f)
                lineToRelative(-0.353f, -0.354f)
                moveToRelative(-0.002f, 0.0f)
                lineToRelative(-0.353f, 0.355f)
                close()
                moveTo(11.004f, 18.284f)
                lineTo(8.71f, 15.995f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(3.15f, 3.143f)
                lineToRelative(0.353f, 0.352f)
                lineToRelative(0.353f, -0.353f)
                lineTo(15.0f, 16.702f)
                lineToRelative(-0.706f, -0.707f)
                lineToRelative(-2.288f, 2.288f)
                lineTo(12.006f, 4.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _arrowLongDownSmall!!
    }

private var _arrowLongDownSmall: ImageVector? = null
