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

public val SBBIcons.ArrowsRightLeftSmall: ImageVector
    get() {
        if (_arrowsRightLeftSmall != null) {
            return _arrowsRightLeftSmall!!
        }
        _arrowsRightLeftSmall = Builder(name = "ArrowsRightLeftSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(17.844f, 7.137f)
                lineToRelative(-3.99f, -3.99f)
                lineToRelative(-0.708f, 0.706f)
                lineToRelative(3.137f, 3.138f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(11.287f)
                lineToRelative(-3.141f, 3.156f)
                lineToRelative(0.708f, 0.705f)
                lineToRelative(3.99f, -4.009f)
                lineToRelative(0.352f, -0.353f)
                close()
                moveTo(6.706f, 15.992f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(6.703f)
                lineToRelative(3.142f, 3.156f)
                lineToRelative(-0.71f, 0.705f)
                lineToRelative(-3.99f, -4.009f)
                lineToRelative(-0.351f, -0.353f)
                lineToRelative(0.353f, -0.353f)
                lineToRelative(3.99f, -3.99f)
                lineToRelative(0.707f, 0.706f)
                close()
            }
        }
        .build()
        return _arrowsRightLeftSmall!!
    }

private var _arrowsRightLeftSmall: ImageVector? = null
