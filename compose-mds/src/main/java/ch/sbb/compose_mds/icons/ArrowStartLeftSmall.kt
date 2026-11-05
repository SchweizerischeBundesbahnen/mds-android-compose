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

public val SBBIcons.ArrowStartLeftSmall: ImageVector
    get() {
        if (_arrowStartLeftSmall != null) {
            return _arrowStartLeftSmall!!
        }
        _arrowStartLeftSmall = Builder(name = "ArrowStartLeftSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(8.146f, 8.146f)
                lineToRelative(-3.99f, 3.992f)
                lineToRelative(-0.352f, 0.353f)
                lineToRelative(0.352f, 0.354f)
                lineToRelative(3.99f, 4.007f)
                lineToRelative(0.708f, -0.705f)
                lineToRelative(-3.141f, -3.156f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(5.717f)
                lineToRelative(3.137f, -3.138f)
                close()
                moveTo(20.0f, 9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _arrowStartLeftSmall!!
    }

private var _arrowStartLeftSmall: ImageVector? = null
