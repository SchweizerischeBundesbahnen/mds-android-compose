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

public val SBBIcons.MergeLarge: ImageVector
    get() {
        if (_mergeLarge != null) {
            return _mergeLarge!!
        }
        _mergeLarge = Builder(name = "MergeLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.854f, 7.146f)
                curveToRelative(3.949f, 3.95f, 7.123f, 7.87f, 12.561f, 10.848f)
                curveToRelative(5.25f, 2.875f, 12.64f, 4.875f, 24.871f, 5.0f)
                lineToRelative(-6.92f, -6.92f)
                lineToRelative(0.707f, -0.708f)
                lineToRelative(8.134f, 8.134f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-7.78f, 7.779f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(6.918f, -6.92f)
                curveToRelative(-12.23f, 0.124f, -19.62f, 2.125f, -24.869f, 5.0f)
                curveToRelative(-5.438f, 2.978f, -8.612f, 6.898f, -12.561f, 10.847f)
                lineToRelative(-0.708f, -0.706f)
                curveToRelative(3.871f, -3.871f, 7.187f, -7.95f, 12.789f, -11.018f)
                curveToRelative(3.979f, -2.179f, 9.095f, -3.843f, 16.381f, -4.629f)
                curveToRelative(-7.286f, -0.786f, -12.403f, -2.45f, -16.381f, -4.629f)
                curveToRelative(-5.602f, -3.067f, -8.918f, -7.146f, -12.789f, -11.017f)
                close()
            }
        }
        .build()
        return _mergeLarge!!
    }

private var _mergeLarge: ImageVector? = null
