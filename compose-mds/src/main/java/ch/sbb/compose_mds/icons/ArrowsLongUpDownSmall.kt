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

public val SBBIcons.ArrowsLongUpDownSmall: ImageVector
    get() {
        if (_arrowsLongUpDownSmall != null) {
            return _arrowsLongUpDownSmall!!
        }
        _arrowsLongUpDownSmall = Builder(
            name = "ArrowsLongUpDownSmall",
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
                moveToRelative(16.858f, 19.84f)
                lineToRelative(3.14f, -3.143f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-2.287f, 2.288f)
                lineTo(17.004f, 3.995f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(14.286f)
                lineToRelative(-2.296f, -2.291f)
                lineToRelative(-0.706f, 0.708f)
                lineToRelative(3.149f, 3.142f)
                lineToRelative(0.353f, 0.353f)
                close()
                moveTo(7.858f, 4.151f)
                lineTo(10.998f, 7.293f)
                lineTo(10.291f, 8.0f)
                lineTo(8.004f, 5.712f)
                verticalLineToRelative(14.283f)
                horizontalLineToRelative(-1.0f)
                lineTo(7.004f, 5.71f)
                lineTo(4.708f, 8.0f)
                lineToRelative(-0.706f, -0.707f)
                lineTo(7.15f, 4.15f)
                lineToRelative(0.353f, -0.353f)
                close()
            }
        }
            .build()
        return _arrowsLongUpDownSmall!!
    }

private var _arrowsLongUpDownSmall: ImageVector? = null
