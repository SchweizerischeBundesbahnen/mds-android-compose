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

public val SBBIcons.MedalSmall: ImageVector
    get() {
        if (_medalSmall != null) {
            return _medalSmall!!
        }
        _medalSmall = Builder(
            name = "MedalSmall",
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
                moveTo(6.5f, 3.0f)
                horizontalLineToRelative(-0.77f)
                lineToRelative(0.313f, 0.703f)
                lineToRelative(3.886f, 8.745f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 4.141f, 0.0f)
                lineToRelative(3.887f, -8.745f)
                lineToRelative(0.312f, -0.703f)
                horizontalLineToRelative(-4.103f)
                lineToRelative(-0.128f, 0.308f)
                lineTo(12.0f, 8.2f)
                lineTo(9.96f, 3.308f)
                lineTo(9.833f, 3.0f)
                horizontalLineTo(6.5f)
                moveToRelative(5.494f, 10.0f)
                horizontalLineToRelative(0.012f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -0.012f, 0.0f)
                moveToRelative(0.013f, -1.0f)
                horizontalLineToRelative(1.168f)
                lineToRelative(3.555f, -8.0f)
                horizontalLineToRelative(-1.897f)
                lineToRelative(-2.372f, 5.692f)
                lineToRelative(-0.006f, 0.016f)
                lineToRelative(-0.008f, 0.016f)
                lineTo(11.31f, 12.0f)
                horizontalLineToRelative(0.698f)
                moveToRelative(-2.84f, -8.0f)
                lineToRelative(2.283f, 5.481f)
                lineToRelative(-0.923f, 1.848f)
                lineTo(7.269f, 4.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                moveToRelative(-3.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
            }
        }
            .build()
        return _medalSmall!!
    }

private var _medalSmall: ImageVector? = null
