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

public val SBBIcons.LayersSmall: ImageVector
    get() {
        if (_layersSmall != null) {
            return _layersSmall!!
        }
        _layersSmall = Builder(
            name = "LayersSmall",
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
                moveTo(12.282f, 3.087f)
                lineTo(12.0f, 2.894f)
                lineToRelative(-0.282f, 0.193f)
                lineToRelative(-9.5f, 6.5f)
                lineToRelative(-0.603f, 0.413f)
                lineToRelative(0.603f, 0.413f)
                lineToRelative(2.35f, 1.608f)
                lineToRelative(-2.345f, 1.563f)
                lineToRelative(-0.616f, 0.41f)
                lineToRelative(0.61f, 0.419f)
                lineToRelative(9.5f, 6.5f)
                lineToRelative(0.283f, 0.193f)
                lineToRelative(0.282f, -0.193f)
                lineToRelative(9.5f, -6.5f)
                lineToRelative(0.611f, -0.418f)
                lineToRelative(-0.616f, -0.411f)
                lineToRelative(-2.345f, -1.563f)
                lineToRelative(2.35f, -1.608f)
                lineToRelative(0.604f, -0.413f)
                lineToRelative(-0.604f, -0.413f)
                close()
                moveTo(18.542f, 12.629f)
                lineTo(12.282f, 16.913f)
                lineTo(12.0f, 17.106f)
                lineTo(11.718f, 16.913f)
                lineTo(5.458f, 12.629f)
                lineTo(3.393f, 14.005f)
                lineTo(12.0f, 19.895f)
                lineToRelative(8.607f, -5.89f)
                close()
                moveTo(12.0f, 15.894f)
                lineTo(3.385f, 10.0f)
                lineTo(12.0f, 4.106f)
                lineTo(20.615f, 10.0f)
                close()
            }
        }
            .build()
        return _layersSmall!!
    }

private var _layersSmall: ImageVector? = null
