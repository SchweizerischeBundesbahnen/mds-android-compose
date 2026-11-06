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

public val SBBIcons.SplitLarge: ImageVector
    get() {
        if (_splitLarge != null) {
            return _splitLarge!!
        }
        _splitLarge = Builder(name = "SplitLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 19.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(8.718f)
                curveToRelative(-3.522f, 3.606f, -6.749f, 7.313f, -11.935f, 10.153f)
                curveToRelative(-3.979f, 2.179f, -9.096f, 3.843f, -16.382f, 4.629f)
                curveToRelative(7.286f, 0.786f, 12.403f, 2.45f, 16.382f, 4.629f)
                curveToRelative(5.186f, 2.84f, 8.413f, 6.546f, 11.935f, 10.152f)
                verticalLineTo(28.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.304f)
                curveToRelative(-3.576f, -3.656f, -6.673f, -7.231f, -11.719f, -9.994f)
                curveTo(25.163f, 26.037f, 17.46f, 24.0f, 4.5f, 24.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(12.96f, 0.0f, 20.663f, -2.037f, 26.085f, -5.006f)
                curveToRelative(5.046f, -2.763f, 8.143f, -6.338f, 11.719f, -9.994f)
                horizontalLineTo(32.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _splitLarge!!
    }

private var _splitLarge: ImageVector? = null
