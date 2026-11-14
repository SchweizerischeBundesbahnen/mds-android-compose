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

public val SBBIcons.ArrowsLongRightLeftSmall: ImageVector
    get() {
        if (_arrowsLongRightLeftSmall != null) {
            return _arrowsLongRightLeftSmall!!
        }
        _arrowsLongRightLeftSmall = Builder(name = "ArrowsLongRightLeftSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(19.49f, 7.49f)
                lineToRelative(0.354f, -0.352f)
                lineToRelative(-3.142f, -3.141f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(2.289f, 2.287f)
                lineTo(4.0f, 6.991f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(14.284f)
                lineToRelative(-2.289f, 2.296f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(3.143f, -3.15f)
                lineToRelative(-0.355f, -0.352f)
                close()
                moveTo(19.845f, 7.845f)
                lineTo(20.197f, 7.491f)
                lineTo(19.844f, 7.138f)
                lineTo(19.49f, 7.491f)
                close()
                moveTo(4.51f, 16.49f)
                lineToRelative(-0.354f, -0.352f)
                lineToRelative(0.354f, 0.353f)
                moveToRelative(-0.355f, 0.355f)
                lineToRelative(0.355f, -0.353f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(4.155f, 16.846f)
                lineTo(7.298f, 19.995f)
                lineTo(8.005f, 19.288f)
                lineTo(5.715f, 16.992f)
                lineTo(20.0f, 16.992f)
                verticalLineToRelative(-1.0f)
                lineTo(5.717f, 15.992f)
                lineToRelative(2.288f, -2.287f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-3.142f, 3.14f)
                lineToRelative(-0.353f, 0.354f)
                close()
            }
        }
        .build()
        return _arrowsLongRightLeftSmall!!
    }

private var _arrowsLongRightLeftSmall: ImageVector? = null
