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

public val SBBIcons.ArrowLongUpSmall: ImageVector
    get() {
        if (_arrowLongUpSmall != null) {
            return _arrowLongUpSmall!!
        }
        _arrowLongUpSmall = Builder(name = "ArrowLongUpSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(11.496f, 4.51f)
                lineToRelative(-0.352f, -0.354f)
                lineToRelative(0.353f, 0.354f)
                moveToRelative(0.002f, 0.0f)
                lineToRelative(0.353f, -0.355f)
                close()
                moveTo(11.999f, 5.716f)
                lineTo(14.294f, 8.005f)
                lineTo(15.001f, 7.298f)
                lineTo(11.851f, 4.155f)
                lineTo(11.498f, 3.803f)
                lineTo(11.145f, 4.156f)
                lineTo(8.005f, 7.298f)
                lineTo(8.711f, 8.005f)
                lineTo(10.999f, 5.717f)
                lineTo(10.999f, 20.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _arrowLongUpSmall!!
    }

private var _arrowLongUpSmall: ImageVector? = null
