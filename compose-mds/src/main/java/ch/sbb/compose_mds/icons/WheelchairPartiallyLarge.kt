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

public val SBBIcons.WheelchairPartiallyLarge: ImageVector
    get() {
        if (_wheelchairPartiallyLarge != null) {
            return _wheelchairPartiallyLarge!!
        }
        _wheelchairPartiallyLarge = Builder(name = "WheelchairPartiallyLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.112f, 9.218f)
                curveTo(41.76f, 13.086f, 43.8f, 17.783f, 43.8f, 24.5f)
                curveToRelative(0.0f, 6.711f, -2.037f, 11.613f, -4.696f, 15.293f)
                lineToRelative(-0.81f, -0.586f)
                curveToRelative(2.543f, -3.52f, 4.506f, -8.219f, 4.506f, -14.707f)
                curveToRelative(0.0f, -6.483f, -1.959f, -10.986f, -4.514f, -14.718f)
                close()
                moveTo(10.305f, 9.793f)
                curveTo(7.763f, 13.313f, 5.8f, 18.012f, 5.8f, 24.5f)
                curveToRelative(0.0f, 6.483f, 1.96f, 10.988f, 4.513f, 14.718f)
                lineTo(9.9f, 39.5f)
                lineToRelative(-0.412f, 0.282f)
                curveTo(6.84f, 35.916f, 4.8f, 31.217f, 4.8f, 24.5f)
                curveToRelative(0.0f, -6.711f, 2.037f, -11.613f, 4.694f, -15.293f)
                close()
                moveTo(22.0f, 27.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(31.0f, 28.0f)
                lineTo(21.0f, 28.0f)
                lineTo(21.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.9f, 22.361f)
                lineTo(18.127f, 22.807f)
                curveToRelative(-2.442f, 1.242f, -4.123f, 3.783f, -4.123f, 6.688f)
                curveToRelative(0.0f, 4.124f, 3.38f, 7.5f, 7.5f, 7.5f)
                curveToRelative(2.984f, 0.0f, 5.583f, -1.77f, 6.788f, -4.32f)
                lineToRelative(0.904f, 0.428f)
                curveToRelative(-1.362f, 2.883f, -4.304f, 4.892f, -7.692f, 4.892f)
                curveToRelative(-4.672f, 0.0f, -8.5f, -3.824f, -8.5f, -8.5f)
                curveToRelative(0.0f, -3.299f, 1.908f, -6.174f, 4.67f, -7.579f)
                close()
                moveTo(21.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.001f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
            }
        }
        .build()
        return _wheelchairPartiallyLarge!!
    }

private var _wheelchairPartiallyLarge: ImageVector? = null
