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

public val SBBIcons.ArrowLongLeftSmall: ImageVector
    get() {
        if (_arrowLongLeftSmall != null) {
            return _arrowLongLeftSmall!!
        }
        _arrowLongLeftSmall = Builder(
            name = "ArrowLongLeftSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
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
                moveToRelative(7.297f, 8.998f)
                lineToRelative(-3.14f, 3.149f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(3.14f, 3.141f)
                lineToRelative(0.708f, -0.707f)
                lineTo(5.718f, 13.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(5.715f)
                lineToRelative(2.29f, -2.296f)
                close()
            }
        }
            .build()
        return _arrowLongLeftSmall!!
    }

private var _arrowLongLeftSmall: ImageVector? = null
