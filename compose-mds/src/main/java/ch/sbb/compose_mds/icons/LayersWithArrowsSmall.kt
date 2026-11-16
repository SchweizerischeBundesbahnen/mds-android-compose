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
                moveToRelative(21.672f, 4.53f)
                lineToRelative(-9.5f, -3.5f)
                lineTo(12.0f, 0.967f)
                lineToRelative(-0.173f, 0.065f)
                lineToRelative(-9.5f, 3.5f)
                lineTo(1.053f, 5.0f)
                lineToRelative(1.273f, 0.468f)
                lineToRelative(9.5f, 3.5f)
                lineToRelative(0.173f, 0.065f)
                lineToRelative(0.173f, -0.065f)
                lineToRelative(9.5f, -3.5f)
                lineTo(22.946f, 5.0f)
                close()
                moveTo(12.0f, 7.967f)
                lineTo(3.944f, 5.0f)
                lineToRelative(8.055f, -2.968f)
                lineTo(20.054f, 5.0f)
                close()
                moveTo(21.674f, 18.532f)
                lineTo(12.174f, 15.032f)
                lineTo(12.001f, 14.968f)
                lineTo(11.828f, 15.032f)
                lineTo(2.328f, 18.532f)
                lineTo(1.054f, 19.0f)
                lineToRelative(1.273f, 0.469f)
                lineToRelative(9.5f, 3.5f)
                lineToRelative(0.173f, 0.064f)
                lineToRelative(0.173f, -0.064f)
                lineToRelative(9.5f, -3.5f)
                lineToRelative(1.273f, -0.47f)
                close()
                moveTo(12.0f, 21.967f)
                lineTo(3.944f, 19.0f)
                lineTo(12.0f, 16.032f)
                lineTo(20.055f, 19.0f)
                close()
                moveTo(7.0f, 9.969f)
                lineTo(7.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                lineTo(6.0f, 9.973f)
                lineToRelative(-1.987f, 2.023f)
                lineToRelative(-0.712f, -0.7f)
                lineToRelative(2.842f, -2.897f)
                lineToRelative(0.357f, -0.362f)
                lineToRelative(0.356f, 0.362f)
                lineToRelative(2.852f, 2.894f)
                lineToRelative(-0.712f, 0.702f)
                close()
                moveTo(18.0f, 14.028f)
                lineTo(19.987f, 12.002f)
                lineTo(20.701f, 12.703f)
                lineTo(17.859f, 15.6f)
                lineTo(17.502f, 15.249f)
                lineTo(17.146f, 15.601f)
                lineTo(14.293f, 12.707f)
                lineTo(15.006f, 12.005f)
                lineTo(17.0f, 14.028f)
                lineTo(17.0f, 10.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.146f, 15.601f)
                lineTo(17.502f, 15.25f)
                lineTo(17.859f, 15.6f)
                lineTo(17.503f, 15.963f)
                close()
            }
        }
        .build()
        return _layersWithArrowsSmall!!
    }

private var _layersWithArrowsSmall: ImageVector? = null
