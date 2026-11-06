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

public val SBBIcons.FingerprintLarge: ImageVector
    get() {
        if (_fingerprintLarge != null) {
            return _fingerprintLarge!!
        }
        _fingerprintLarge = Builder(name = "FingerprintLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 33.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.5f, 4.5f)
                lineTo(24.0f, 44.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -7.0f, 0.0f)
                verticalLineToRelative(3.526f)
                horizontalLineToRelative(-1.0f)
                lineTo(15.0f, 37.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.5f, -4.5f)
                moveToRelative(0.0f, -4.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 8.5f, 8.5f)
                lineTo(28.0f, 43.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -7.5f, -7.5f)
                curveToRelative(-4.104f, 0.0f, -7.429f, 3.3f, -7.488f, 7.393f)
                lineToRelative(-0.5f, -0.008f)
                lineToRelative(-0.5f, -0.007f)
                curveTo(11.079f, 32.742f, 14.846f, 29.0f, 19.5f, 29.0f)
                moveToRelative(0.5f, 13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(19.5f, 25.001f)
                curveToRelative(6.903f, 0.0f, 12.5f, 5.596f, 12.5f, 12.5f)
                verticalLineToRelative(3.526f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.526f)
                curveToRelative(0.0f, -6.352f, -5.15f, -11.5f, -11.5f, -11.5f)
                curveToRelative(-4.658f, 0.0f, -8.663f, 2.775f, -10.47f, 6.762f)
                lineToRelative(-0.456f, -0.207f)
                lineToRelative(-0.455f, -0.206f)
                curveTo(10.082f, 28.02f, 14.433f, 25.0f, 19.5f, 25.0f)
                moveToRelative(0.0f, -4.001f)
                curveToRelative(9.071f, 0.0f, 16.426f, 7.322f, 16.494f, 16.376f)
                lineToRelative(-1.0f, 0.008f)
                curveTo(34.93f, 28.878f, 28.021f, 22.0f, 19.5f, 22.0f)
                curveToRelative(-4.898f, 0.0f, -9.259f, 2.278f, -12.1f, 5.828f)
                lineToRelative(-0.782f, -0.625f)
                curveTo(9.641f, 23.427f, 14.284f, 21.0f, 19.5f, 21.0f)
                moveToRelative(0.0f, -4.0f)
                curveToRelative(9.326f, 0.0f, 17.183f, 6.233f, 19.668f, 14.755f)
                lineToRelative(-0.48f, 0.14f)
                lineToRelative(-0.48f, 0.14f)
                curveTo(35.844f, 23.927f, 28.368f, 18.0f, 19.5f, 18.0f)
                arcToRelative(19.4f, 19.4f, 0.0f, false, false, -12.666f, 4.691f)
                lineToRelative(-0.325f, -0.38f)
                lineToRelative(-0.325f, -0.378f)
                arcTo(20.4f, 20.4f, 0.0f, false, true, 19.499f, 17.0f)
                moveToRelative(0.0f, -4.0f)
                curveToRelative(9.09f, 0.0f, 17.006f, 4.963f, 21.234f, 12.311f)
                lineToRelative(-0.434f, 0.25f)
                lineToRelative(-0.433f, 0.25f)
                curveTo(35.81f, 18.758f, 28.217f, 14.0f, 19.5f, 14.0f)
                curveToRelative(-4.44f, 0.0f, -8.579f, 1.254f, -12.124f, 3.396f)
                lineToRelative(-0.517f, -0.855f)
                curveTo(10.55f, 14.309f, 14.867f, 13.0f, 19.499f, 13.0f)
                moveToRelative(0.0f, -4.001f)
                curveToRelative(8.366f, 0.0f, 15.867f, 3.628f, 21.078f, 9.368f)
                lineToRelative(-0.74f, 0.672f)
                curveToRelative(-5.032f, -5.542f, -12.268f, -9.04f, -20.339f, -9.04f)
                curveToRelative(-3.643f, 0.0f, -7.113f, 0.725f, -10.296f, 2.012f)
                lineToRelative(-0.375f, -0.928f)
                arcTo(28.4f, 28.4f, 0.0f, false, true, 19.5f, 8.999f)
                moveToRelative(-0.002f, -4.0f)
                curveToRelative(6.031f, 0.0f, 11.665f, 1.66f, 16.502f, 4.526f)
                lineToRelative(-0.255f, 0.431f)
                lineToRelative(-0.255f, 0.43f)
                arcToRelative(31.26f, 31.26f, 0.0f, false, false, -15.992f, -4.387f)
                curveToRelative(-1.18f, 0.0f, -2.344f, 0.075f, -3.494f, 0.205f)
                lineToRelative(-0.113f, -0.994f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 3.607f, -0.211f)
            }
        }
        .build()
        return _fingerprintLarge!!
    }

private var _fingerprintLarge: ImageVector? = null
