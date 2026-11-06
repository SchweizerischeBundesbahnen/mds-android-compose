package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.LayersLarge: ImageVector
    get() {
        if (_layersLarge != null) {
            return _layersLarge!!
        }
        _layersLarge = Builder(name = "LayersLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.782f, 7.087f)
                lineToRelative(19.0f, 13.0f)
                lineToRelative(0.604f, 0.413f)
                lineToRelative(-0.604f, 0.413f)
                lineToRelative(-5.311f, 3.633f)
                lineToRelative(5.306f, 3.538f)
                lineToRelative(0.617f, 0.41f)
                lineToRelative(-0.612f, 0.42f)
                lineToRelative(-19.0f, 13.0f)
                lineToRelative(-0.282f, 0.191f)
                lineToRelative(-0.282f, -0.192f)
                lineToRelative(-19.0f, -13.0f)
                lineToRelative(-0.612f, -0.419f)
                lineToRelative(0.617f, -0.41f)
                lineToRelative(5.305f, -3.538f)
                lineToRelative(-5.31f, -3.633f)
                lineToRelative(-0.604f, -0.413f)
                lineToRelative(0.604f, -0.413f)
                lineToRelative(19.0f, -13.0f)
                lineToRelative(0.282f, -0.192f)
                close()
                moveTo(24.782f, 33.913f)
                lineTo(24.5f, 34.106f)
                lineTo(24.218f, 33.913f)
                lineTo(11.418f, 25.155f)
                lineTo(6.394f, 28.505f)
                lineTo(24.5f, 40.894f)
                lineToRelative(18.106f, -12.39f)
                lineToRelative(-5.025f, -3.349f)
                close()
                moveTo(6.386f, 20.5f)
                lineTo(24.5f, 32.894f)
                lineTo(42.613f, 20.5f)
                lineTo(24.5f, 8.105f)
                close()
            }
        }
        .build()
        return _layersLarge!!
    }

private var _layersLarge: ImageVector? = null
