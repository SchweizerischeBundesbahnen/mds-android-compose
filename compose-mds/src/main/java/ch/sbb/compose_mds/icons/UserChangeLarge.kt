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

public val SBBIcons.UserChangeLarge: ImageVector
    get() {
        if (_userChangeLarge != null) {
            return _userChangeLarge!!
        }
        _userChangeLarge = Builder(
            name = "UserChangeLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(34.5f, 24.0f)
                curveToRelative(2.68f, 0.0f, 4.5f, 2.671f, 4.5f, 5.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -0.66f, 2.872f)
                curveToRelative(3.14f, 2.109f, 4.668f, 6.19f, 4.668f, 10.134f)
                verticalLineToRelative(0.5f)
                lineTo(26.004f, 43.006f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.923f, 1.515f, -8.016f, 4.655f, -10.133f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 30.0f, 29.5f)
                curveToRelative(0.0f, -2.829f, 1.82f, -5.5f, 4.5f, -5.5f)
                moveToRelative(-21.65f, 2.48f)
                lineToRelative(5.0f, 4.93f)
                lineToRelative(-0.35f, 0.355f)
                lineToRelative(-0.35f, 0.356f)
                lineToRelative(-4.213f, -4.152f)
                curveToRelative(-0.153f, 4.29f, 0.87f, 7.705f, 2.635f, 10.083f)
                curveToRelative(1.906f, 2.567f, 4.7f, 3.962f, 7.93f, 3.95f)
                lineToRelative(0.002f, 0.5f)
                lineToRelative(0.002f, 0.5f)
                curveToRelative(-3.546f, 0.013f, -6.64f, -1.53f, -8.737f, -4.355f)
                curveToRelative(-1.905f, -2.566f, -2.964f, -6.158f, -2.838f, -10.546f)
                lineToRelative(-4.08f, 4.032f)
                lineToRelative(-0.351f, -0.356f)
                lineToRelative(-0.352f, -0.356f)
                lineToRelative(5.0f, -4.94f)
                lineToRelative(0.352f, -0.346f)
                close()
                moveTo(37.816f, 33.227f)
                curveTo(37.023f, 34.285f, 35.866f, 35.0f, 34.5f, 35.0f)
                curveToRelative(-1.367f, 0.0f, -2.524f, -0.714f, -3.317f, -1.773f)
                curveToRelative(-2.625f, 1.793f, -4.047f, 5.242f, -4.17f, 8.779f)
                horizontalLineToRelative(14.985f)
                curveToRelative(-0.123f, -3.553f, -1.556f, -6.992f, -4.182f, -8.78f)
                moveTo(34.5f, 25.0f)
                curveToRelative(-1.909f, 0.0f, -3.5f, 1.977f, -3.5f, 4.5f)
                curveToRelative(0.0f, 1.038f, 0.278f, 2.011f, 0.748f, 2.783f)
                curveTo(32.398f, 33.348f, 33.386f, 34.0f, 34.5f, 34.0f)
                reflectiveCurveToRelative(2.101f, -0.652f, 2.751f, -1.717f)
                curveToRelative(0.47f, -0.772f, 0.749f, -1.745f, 0.749f, -2.783f)
                curveToRelative(0.0f, -2.523f, -1.591f, -4.5f, -3.5f, -4.5f)
                moveToRelative(-22.0f, -21.0f)
                curveTo(15.18f, 4.0f, 17.0f, 6.671f, 17.0f, 9.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -0.643f, 2.84f)
                curveToRelative(3.579f, 1.924f, 4.65f, 6.0f, 4.65f, 10.168f)
                verticalLineToRelative(0.5f)
                lineTo(4.005f, 23.008f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -4.149f, 1.051f, -8.227f, 4.64f, -10.153f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 8.0f, 9.5f)
                curveTo(8.0f, 6.671f, 9.82f, 4.0f, 12.5f, 4.0f)
                moveToRelative(3.339f, 9.198f)
                curveTo(15.045f, 14.274f, 13.882f, 15.0f, 12.5f, 15.0f)
                curveToRelative(-1.376f, 0.0f, -2.539f, -0.72f, -3.333f, -1.79f)
                curveToRelative(-2.992f, 1.58f, -4.07f, 4.932f, -4.153f, 8.798f)
                horizontalLineToRelative(14.984f)
                curveToRelative(-0.085f, -3.88f, -1.178f, -7.23f, -4.16f, -8.81f)
                moveToRelative(7.643f, -9.168f)
                curveToRelative(3.543f, -0.011f, 6.64f, 1.509f, 8.738f, 4.313f)
                curveToRelative(1.906f, 2.547f, 2.962f, 6.12f, 2.836f, 10.505f)
                lineToRelative(4.093f, -4.034f)
                lineToRelative(0.702f, 0.712f)
                lineToRelative(-5.012f, 4.942f)
                lineToRelative(-0.352f, 0.346f)
                lineToRelative(-0.35f, -0.346f)
                lineToRelative(-4.989f, -4.93f)
                lineToRelative(0.704f, -0.712f)
                lineToRelative(4.2f, 4.15f)
                curveToRelative(0.152f, -4.284f, -0.87f, -7.677f, -2.633f, -10.034f)
                curveToRelative(-1.904f, -2.545f, -4.7f, -3.922f, -7.933f, -3.912f)
                close()
                moveTo(12.5f, 5.0f)
                curveTo(10.591f, 5.0f, 9.0f, 6.977f, 9.0f, 9.5f)
                curveToRelative(0.0f, 0.774f, 0.152f, 1.51f, 0.424f, 2.153f)
                lineToRelative(0.124f, 0.27f)
                curveTo(10.179f, 13.199f, 11.265f, 14.0f, 12.5f, 14.0f)
                curveToRelative(1.237f, 0.0f, 2.32f, -0.804f, 2.952f, -2.08f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 16.0f, 9.5f)
                curveTo(16.0f, 6.977f, 14.409f, 5.0f, 12.5f, 5.0f)
            }
        }
            .build()
        return _userChangeLarge!!
    }

private var _userChangeLarge: ImageVector? = null
