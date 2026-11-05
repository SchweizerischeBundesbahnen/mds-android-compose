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

public val SBBIcons.LayersWithArrowsLarge: ImageVector
    get() {
        if (_layersWithArrowsLarge != null) {
            return _layersWithArrowsLarge!!
        }
        _layersWithArrowsLarge = Builder(name = "LayersWithArrowsLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.673f, 31.031f)
                lineToRelative(19.0f, 7.0f)
                lineToRelative(1.273f, 0.469f)
                lineToRelative(-1.273f, 0.469f)
                lineToRelative(-19.0f, 7.0f)
                lineToRelative(-0.173f, 0.064f)
                lineToRelative(-0.173f, -0.064f)
                lineToRelative(-19.0f, -7.0f)
                lineToRelative(-1.273f, -0.469f)
                lineToRelative(1.273f, -0.469f)
                lineToRelative(19.0f, -7.0f)
                lineToRelative(0.173f, -0.064f)
                close()
                moveTo(6.944f, 38.5f)
                lineTo(24.5f, 44.967f)
                lineTo(42.055f, 38.5f)
                lineTo(24.5f, 32.032f)
                close()
                moveTo(36.0f, 29.78f)
                lineToRelative(4.832f, -4.925f)
                lineToRelative(0.356f, 0.35f)
                lineToRelative(0.358f, 0.35f)
                lineToRelative(-5.685f, 5.795f)
                lineToRelative(-0.355f, 0.362f)
                lineToRelative(-0.358f, -0.361f)
                lineToRelative(-5.706f, -5.788f)
                lineToRelative(0.357f, -0.352f)
                lineToRelative(0.356f, -0.35f)
                lineTo(35.0f, 29.772f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(13.856f, 17.65f)
                lineToRelative(5.705f, 5.788f)
                lineToRelative(-0.357f, 0.35f)
                lineToRelative(-0.355f, 0.35f)
                lineTo(14.0f, 19.219f)
                verticalLineTo(29.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.777f)
                lineToRelative(-4.83f, 4.92f)
                lineToRelative(-0.712f, -0.702f)
                lineToRelative(5.686f, -5.792f)
                lineToRelative(0.356f, -0.362f)
                close()
                moveTo(24.672f, 3.03f)
                lineToRelative(19.0f, 7.0f)
                lineToRelative(1.273f, 0.469f)
                lineToRelative(-1.273f, 0.469f)
                lineToRelative(-19.0f, 7.0f)
                lineToRelative(-0.173f, 0.064f)
                lineToRelative(-0.173f, -0.064f)
                lineToRelative(-19.0f, -7.0f)
                lineToRelative(-1.273f, -0.469f)
                lineToRelative(1.273f, -0.469f)
                lineToRelative(19.0f, -7.0f)
                lineToRelative(0.173f, -0.064f)
                close()
                moveTo(6.943f, 10.5f)
                lineTo(24.5f, 16.966f)
                lineToRelative(17.555f, -6.467f)
                lineToRelative(-17.555f, -6.468f)
                close()
            }
        }
        .build()
        return _layersWithArrowsLarge!!
    }

private var _layersWithArrowsLarge: ImageVector? = null
