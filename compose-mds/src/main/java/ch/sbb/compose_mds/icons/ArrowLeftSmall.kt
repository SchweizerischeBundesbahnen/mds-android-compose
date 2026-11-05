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

public val SBBIcons.ArrowLeftSmall: ImageVector
    get() {
        if (_arrowLeftSmall != null) {
            return _arrowLeftSmall!!
        }
        _arrowLeftSmall = Builder(
            name = "ArrowLeftSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveToRelative(6.156f, 12.138f)
                lineToRelative(3.99f, -3.992f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(-3.137f, 3.138f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(7.713f)
                lineToRelative(3.141f, 3.156f)
                lineToRelative(-0.708f, 0.706f)
                lineToRelative(-3.99f, -4.009f)
                lineToRelative(-0.352f, -0.353f)
                close()
            }
        }
            .build()
        return _arrowLeftSmall!!
    }

private var _arrowLeftSmall: ImageVector? = null
