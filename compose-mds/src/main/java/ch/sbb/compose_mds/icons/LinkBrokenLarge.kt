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

public val SBBIcons.LinkBrokenLarge: ImageVector
    get() {
        if (_linkBrokenLarge != null) {
            return _linkBrokenLarge!!
        }
        _linkBrokenLarge = Builder(name = "LinkBrokenLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.5f, 44.501f)
                horizontalLineToRelative(-1.0f)
                lineTo(25.5f, 36.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.588f, 20.354f)
                lineTo(9.104f, 28.84f)
                curveToRelative(-2.138f, 2.139f, -2.138f, 5.64f, 0.0f, 7.778f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(2.138f, 2.137f, 5.64f, 2.137f, 7.777f, 0.0f)
                lineToRelative(4.96f, -4.96f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-4.96f, 4.96f)
                curveToRelative(-2.527f, 2.528f, -6.661f, 2.527f, -9.19f, 0.0f)
                lineTo(9.81f, 38.739f)
                lineToRelative(-1.415f, -1.414f)
                curveToRelative(-2.528f, -2.529f, -2.528f, -6.663f, 0.0f, -9.192f)
                lineToRelative(8.485f, -8.486f)
                close()
                moveTo(37.853f, 39.147f)
                lineTo(37.147f, 39.853f)
                lineTo(31.146f, 33.853f)
                lineTo(31.853f, 33.147f)
                close()
                moveTo(42.5f, 28.5f)
                horizontalLineToRelative(-8.001f)
                lineToRelative(0.001f, -1.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(28.595f, 8.896f)
                arcToRelative(6.45f, 6.45f, 0.0f, false, true, 9.135f, 0.0f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(1.466f, 1.408f)
                lineToRelative(0.007f, 0.006f)
                curveToRelative(2.528f, 2.528f, 2.542f, 6.614f, 0.012f, 9.142f)
                lineToRelative(-8.496f, 8.535f)
                lineToRelative(-0.355f, -0.352f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(8.497f, -8.534f)
                arcToRelative(5.457f, 5.457f, 0.0f, false, false, -0.003f, -7.722f)
                lineToRelative(-1.473f, -1.414f)
                lineToRelative(-0.007f, -0.007f)
                arcToRelative(5.447f, 5.447f, 0.0f, false, false, -7.72f, 0.0f)
                lineTo(29.3f, 9.604f)
                lineToRelative(-0.001f, 0.002f)
                lineToRelative(-0.007f, 0.006f)
                lineToRelative(-0.025f, 0.027f)
                lineToRelative(-0.1f, 0.098f)
                lineToRelative(-0.368f, 0.368f)
                lineToRelative(-1.248f, 1.25f)
                lineToRelative(-3.198f, 3.199f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(3.198f, -3.2f)
                lineToRelative(1.248f, -1.249f)
                close()
                moveTo(13.0f, 21.0f)
                lineTo(4.999f, 21.0f)
                verticalLineToRelative(-1.0f)
                lineTo(13.0f, 20.0f)
                close()
                moveTo(16.354f, 14.647f)
                lineTo(15.647f, 15.354f)
                lineTo(9.647f, 9.354f)
                lineTo(10.354f, 8.646f)
                close()
                moveTo(21.999f, 12.0f)
                lineTo(21.0f, 12.0f)
                lineTo(21.0f, 3.999f)
                horizontalLineToRelative(0.999f)
                close()
            }
        }
        .build()
        return _linkBrokenLarge!!
    }

private var _linkBrokenLarge: ImageVector? = null
