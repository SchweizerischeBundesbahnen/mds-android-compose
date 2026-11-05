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

public val SBBIcons.DisplayGearsLarge: ImageVector
    get() {
        if (_displayGearsLarge != null) {
            return _displayGearsLarge!!
        }
        _displayGearsLarge = Builder(name = "DisplayGearsLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.0f, 33.0f)
                lineTo(25.0f, 33.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.0f)
                lineTo(13.0f, 41.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-7.0f)
                lineTo(4.0f, 33.0f)
                lineTo(4.0f, 10.0f)
                horizontalLineToRelative(39.0f)
                close()
                moveTo(23.0f, 33.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(5.0f, 32.0f)
                horizontalLineToRelative(9.604f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, true, -0.591f, -3.0f)
                lineTo(9.0f, 29.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.013f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, true, 1.145f, -4.317f)
                lineToRelative(-3.898f, -2.25f)
                lineToRelative(0.5f, -0.866f)
                lineToRelative(3.896f, 2.25f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, true, 3.161f, -3.16f)
                lineToRelative(-2.25f, -3.897f)
                lineToRelative(0.866f, -0.5f)
                lineToRelative(2.25f, 3.898f)
                arcTo(10.5f, 10.5f, 0.0f, false, true, 24.0f, 18.012f)
                lineTo(24.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.012f)
                curveToRelative(1.554f, 0.071f, 3.015f, 0.478f, 4.316f, 1.146f)
                lineToRelative(2.251f, -3.898f)
                lineToRelative(0.866f, 0.5f)
                lineToRelative(-2.25f, 3.896f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, true, 3.16f, 3.16f)
                lineToRelative(3.897f, -2.249f)
                lineToRelative(0.5f, 0.866f)
                lineToRelative(-3.9f, 2.25f)
                arcTo(10.5f, 10.5f, 0.0f, false, true, 34.988f, 28.0f)
                lineTo(40.0f, 28.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.013f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, true, -0.59f, 3.0f)
                lineTo(42.0f, 32.0f)
                lineTo(42.0f, 11.0f)
                lineTo(5.0f, 11.0f)
                close()
                moveTo(27.168f, 24.876f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 29.0f, 28.5f)
                arcToRelative(4.49f, 4.49f, 0.0f, false, true, -1.673f, 3.5f)
                horizontalLineToRelative(6.002f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 34.0f, 28.5f)
                arcToRelative(9.46f, 9.46f, 0.0f, false, false, -4.318f, -7.977f)
                close()
                moveTo(24.5f, 25.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveToRelative(-9.486f, 4.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 0.657f, 3.0f)
                horizontalLineToRelative(6.002f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -1.645f, -3.0f)
                close()
                moveTo(24.5f, 19.0f)
                arcToRelative(9.46f, 9.46f, 0.0f, false, false, -9.486f, 9.0f)
                horizontalLineToRelative(5.014f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 6.275f, -3.624f)
                lineToRelative(2.512f, -4.35f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 24.5f, 19.0f)
            }
        }
        .build()
        return _displayGearsLarge!!
    }

private var _displayGearsLarge: ImageVector? = null
