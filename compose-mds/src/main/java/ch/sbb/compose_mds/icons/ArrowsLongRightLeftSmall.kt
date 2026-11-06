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
                moveToRelative(19.844f, 7.138f)
                lineToRelative(-3.142f, -3.141f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(2.288f, 2.287f)
                lineTo(4.0f, 6.991f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(14.285f)
                lineToRelative(-2.29f, 2.296f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(3.142f, -3.15f)
                lineToRelative(0.353f, -0.353f)
                close()
                moveTo(4.156f, 16.138f)
                lineTo(7.298f, 12.997f)
                lineTo(8.005f, 13.704f)
                lineTo(5.717f, 15.991f)
                lineTo(20.0f, 15.991f)
                verticalLineToRelative(1.0f)
                lineTo(5.715f, 16.991f)
                lineToRelative(2.29f, 2.296f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-3.142f, -3.15f)
                lineToRelative(-0.353f, -0.353f)
                close()
            }
        }
        .build()
        return _arrowsLongRightLeftSmall!!
    }

private var _arrowsLongRightLeftSmall: ImageVector? = null
