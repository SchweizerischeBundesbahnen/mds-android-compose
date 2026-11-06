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

public val SBBIcons.OpenSourceLarge: ImageVector
    get() {
        if (_openSourceLarge != null) {
            return _openSourceLarge!!
        }
        _openSourceLarge = Builder(name = "OpenSourceLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 4.0f)
                arcToRelative(20.5f, 20.5f, 0.0f, false, true, 20.106f, 16.5f)
                verticalLineToRelative(0.001f)
                arcToRelative(20.5f, 20.5f, 0.0f, false, true, -12.26f, 22.939f)
                lineToRelative(-0.462f, 0.19f)
                lineToRelative(-0.192f, -0.461f)
                lineToRelative(-5.358f, -12.935f)
                lineToRelative(-0.191f, -0.462f)
                lineToRelative(0.462f, -0.19f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -4.21f, 0.0f)
                lineToRelative(0.462f, 0.19f)
                lineToRelative(-0.191f, 0.462f)
                lineToRelative(-5.358f, 12.935f)
                lineToRelative(-0.192f, 0.462f)
                lineToRelative(-0.462f, -0.191f)
                arcTo(20.5f, 20.5f, 0.0f, false, true, 3.394f, 20.5f)
                verticalLineTo(20.5f)
                arcTo(20.5f, 20.5f, 0.0f, false, true, 23.5f, 4.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(19.499f, 19.499f, 0.0f, false, false, -7.923f, 37.318f)
                lineToRelative(4.98f, -12.023f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 7.066f, -10.82f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 1.61f, 8.089f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -2.792f, 2.73f)
                lineToRelative(4.98f, 12.024f)
                arcToRelative(19.5f, 19.5f, 0.0f, false, false, 4.45f, -32.891f)
                arcTo(19.5f, 19.5f, 0.0f, false, false, 23.5f, 5.0f)
            }
        }
        .build()
        return _openSourceLarge!!
    }

private var _openSourceLarge: ImageVector? = null
