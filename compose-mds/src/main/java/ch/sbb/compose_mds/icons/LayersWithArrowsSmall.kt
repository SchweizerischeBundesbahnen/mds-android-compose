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

public val SBBIcons.LayersWithArrowsSmall: ImageVector
    get() {
        if (_layersWithArrowsSmall != null) {
            return _layersWithArrowsSmall!!
        }
        _layersWithArrowsSmall = Builder(name = "LayersWithArrowsSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.172f, 1.03f)
                lineTo(12.0f, 0.967f)
                lineToRelative(-0.173f, 0.063f)
                lineToRelative(-9.5f, 3.5f)
                lineTo(1.053f, 5.0f)
                lineToRelative(1.273f, 0.469f)
                lineToRelative(9.5f, 3.5f)
                lineToRelative(0.173f, 0.064f)
                lineToRelative(0.173f, -0.064f)
                lineToRelative(9.5f, -3.5f)
                lineToRelative(1.274f, -0.47f)
                lineToRelative(-1.274f, -0.469f)
                close()
                moveTo(12.0f, 7.967f)
                lineTo(3.946f, 5.0f)
                lineToRelative(8.053f, -2.967f)
                lineTo(20.053f, 5.0f)
                close()
                moveTo(12.174f, 15.031f)
                lineTo(12.0f, 14.967f)
                lineToRelative(-0.173f, 0.064f)
                lineToRelative(-9.5f, 3.5f)
                lineTo(1.053f, 19.0f)
                lineToRelative(1.274f, 0.47f)
                lineToRelative(9.5f, 3.5f)
                lineToRelative(0.173f, 0.063f)
                lineToRelative(0.173f, -0.064f)
                lineToRelative(9.5f, -3.5f)
                lineToRelative(1.273f, -0.47f)
                lineToRelative(-1.273f, -0.468f)
                close()
                moveTo(12.0f, 21.967f)
                lineTo(3.946f, 19.0f)
                lineTo(12.0f, 16.033f)
                lineTo(20.054f, 19.0f)
                close()
                moveTo(7.0f, 9.969f)
                lineToRelative(1.996f, 2.026f)
                lineToRelative(0.712f, -0.702f)
                lineToRelative(-2.852f, -2.894f)
                lineToRelative(-0.357f, -0.362f)
                lineToRelative(-0.356f, 0.363f)
                lineTo(3.3f, 11.296f)
                lineToRelative(0.714f, 0.7f)
                lineTo(6.0f, 9.973f)
                lineTo(6.0f, 14.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 14.029f)
                lineTo(19.987f, 12.002f)
                lineTo(20.701f, 12.702f)
                lineTo(17.86f, 15.6f)
                lineToRelative(-0.356f, 0.363f)
                lineToRelative(-0.357f, -0.362f)
                lineToRelative(-2.853f, -2.894f)
                lineToRelative(0.712f, -0.703f)
                lineTo(17.0f, 14.029f)
                lineTo(17.0f, 10.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _layersWithArrowsSmall!!
    }

private var _layersWithArrowsSmall: ImageVector? = null
