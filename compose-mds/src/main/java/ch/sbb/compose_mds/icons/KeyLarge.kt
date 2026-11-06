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

public val SBBIcons.KeyLarge: ImageVector
    get() {
        if (_keyLarge != null) {
            return _keyLarge!!
        }
        _keyLarge = Builder(name = "KeyLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 6.0f)
                curveToRelative(5.29f, 0.0f, 9.5f, 4.21f, 9.5f, 9.5f)
                curveToRelative(0.0f, 3.231f, -1.572f, 6.057f, -4.0f, 7.769f)
                verticalLineToRelative(14.038f)
                lineToRelative(-5.5f, 5.5f)
                lineToRelative(-5.5f, -5.5f)
                verticalLineTo(23.269f)
                curveToRelative(-2.428f, -1.712f, -4.0f, -4.538f, -4.0f, -7.769f)
                curveToRelative(0.0f, -5.29f, 4.21f, -9.5f, 9.5f, -9.5f)
                moveTo(28.0f, 23.886f)
                arcTo(9.54f, 9.54f, 0.0f, false, true, 23.5f, 25.0f)
                arcToRelative(9.54f, 9.54f, 0.0f, false, true, -4.5f, -1.114f)
                verticalLineToRelative(13.007f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(4.5f, -4.5f)
                verticalLineTo(33.0f)
                horizontalLineToRelative(-5.014f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(28.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(23.5f, 7.0f)
                arcToRelative(8.445f, 8.445f, 0.0f, false, false, -8.5f, 8.5f)
                curveToRelative(0.0f, 4.738f, 3.762f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveToRelative(8.5f, -3.762f, 8.5f, -8.5f)
                reflectiveCurveTo(28.238f, 7.0f, 23.5f, 7.0f)
                moveToRelative(0.01f, 5.0f)
                curveToRelative(1.983f, 0.0f, 3.49f, 1.491f, 3.49f, 3.454f)
                curveTo(27.0f, 17.397f, 25.513f, 19.0f, 23.51f, 19.0f)
                curveToRelative(-2.0f, 0.0f, -3.51f, -1.599f, -3.51f, -3.546f)
                curveTo(20.0f, 13.487f, 21.53f, 12.0f, 23.51f, 12.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(22.065f, 13.0f, 21.0f, 14.057f, 21.0f, 15.454f)
                curveTo(21.0f, 16.871f, 22.085f, 18.0f, 23.51f, 18.0f)
                curveToRelative(1.42f, 0.0f, 2.49f, -1.125f, 2.49f, -2.546f)
                curveTo(26.0f, 14.053f, 24.95f, 13.0f, 23.51f, 13.0f)
            }
        }
        .build()
        return _keyLarge!!
    }

private var _keyLarge: ImageVector? = null
