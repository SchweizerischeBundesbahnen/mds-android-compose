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

public val SBBIcons.TriceratopsLarge: ImageVector
    get() {
        if (_triceratopsLarge != null) {
            return _triceratopsLarge!!
        }
        _triceratopsLarge = Builder(
            name = "TriceratopsLarge",
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
                moveTo(30.0f, 40.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-7.493f)
                lineToRelative(-0.17f, 0.007f)
                curveToRelative(-0.83f, 0.056f, -1.439f, 0.438f, -1.905f, 1.007f)
                curveToRelative(-0.512f, 0.624f, -0.853f, 1.479f, -1.074f, 2.378f)
                curveToRelative(-0.218f, 0.892f, -0.308f, 1.79f, -0.343f, 2.47f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, -0.018f, 1.041f)
                lineToRelative(0.002f, 0.058f)
                lineToRelative(0.001f, 0.013f)
                verticalLineToRelative(0.004f)
                lineToRelative(-0.5f, 0.022f)
                lineToRelative(-0.499f, 0.023f)
                verticalLineToRelative(-0.008f)
                lineTo(17.0f, 39.997f)
                lineToRelative(-0.002f, -0.067f)
                lineToRelative(-0.004f, -0.247f)
                curveToRelative(0.0f, -0.212f, 0.003f, -0.513f, 0.022f, -0.873f)
                curveToRelative(0.037f, -0.717f, 0.133f, -1.682f, 0.372f, -2.657f)
                curveToRelative(0.237f, -0.968f, 0.624f, -1.986f, 1.27f, -2.773f)
                curveToRelative(0.658f, -0.804f, 1.584f, -1.363f, 2.835f, -1.38f)
                lineTo(30.0f, 32.0f)
                close()
                moveTo(29.5f, 10.0f)
                curveToRelative(0.722f, 0.0f, 1.308f, 0.335f, 1.775f, 0.828f)
                curveToRelative(0.459f, 0.484f, 0.824f, 1.138f, 1.133f, 1.847f)
                curveToRelative(0.602f, 1.38f, 1.071f, 3.167f, 1.546f, 4.603f)
                quadToRelative(0.248f, 0.368f, 0.496f, 0.703f)
                lineToRelative(6.52f, -2.607f)
                lineToRelative(-4.032f, 5.373f)
                curveToRelative(0.878f, 0.801f, 1.76f, 1.478f, 2.66f, 2.192f)
                lineToRelative(3.693f, -1.23f)
                lineTo(42.0f, 25.582f)
                lineTo(42.0f, 27.5f)
                curveToRelative(0.0f, 0.494f, 0.0f, 0.954f, -0.033f, 1.355f)
                curveToRelative(-0.033f, 0.398f, -0.103f, 0.785f, -0.27f, 1.119f)
                arcToRelative(1.66f, 1.66f, 0.0f, false, true, -0.838f, 0.796f)
                curveToRelative(-0.371f, 0.165f, -0.825f, 0.23f, -1.359f, 0.23f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.506f, 0.0f, -0.92f, 0.0f, -1.27f, 0.03f)
                curveToRelative(-0.352f, 0.029f, -0.59f, 0.084f, -0.756f, 0.167f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, false, -0.33f, 0.35f)
                curveToRelative(-0.084f, 0.191f, -0.144f, 0.487f, -0.144f, 0.953f)
                lineTo(34.0f, 40.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -0.534f, 0.065f, -0.988f, 0.23f, -1.36f)
                arcToRelative(1.66f, 1.66f, 0.0f, false, true, 0.796f, -0.837f)
                curveToRelative(0.334f, -0.167f, 0.721f, -0.237f, 1.12f, -0.27f)
                reflectiveCurveTo(36.006f, 30.0f, 36.5f, 30.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.466f, 0.0f, 0.762f, -0.06f, 0.953f, -0.145f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, false, 0.35f, -0.329f)
                curveToRelative(0.083f, -0.165f, 0.138f, -0.404f, 0.168f, -0.756f)
                curveToRelative(0.029f, -0.35f, 0.029f, -0.764f, 0.029f, -1.27f)
                verticalLineToRelative(-1.793f)
                lineToRelative(-1.832f, -1.832f)
                curveToRelative(-1.98f, -1.582f, -4.04f, -3.031f, -6.084f, -6.098f)
                lineToRelative(-0.037f, -0.055f)
                lineToRelative(-0.022f, -0.064f)
                curveToRelative(-0.517f, -1.553f, -0.944f, -3.233f, -1.533f, -4.583f)
                curveToRelative(-0.29f, -0.666f, -0.6f, -1.2f, -0.942f, -1.56f)
                curveToRelative(-0.333f, -0.35f, -0.672f, -0.515f, -1.05f, -0.515f)
                curveToRelative(-1.22f, 0.0f, -2.301f, 0.508f, -3.646f, 1.854f)
                curveToRelative(-1.448f, 1.447f, -2.351f, 3.47f, -2.694f, 5.644f)
                lineTo(23.16f, 19.0f)
                horizontalLineToRelative(-0.068f)
                quadToRelative(-0.078f, 0.658f, -0.09f, 1.323f)
                lineToRelative(4.882f, 5.857f)
                lineToRelative(-0.768f, 0.64f)
                lineToRelative(-5.0f, -6.0f)
                lineToRelative(-0.116f, -0.14f)
                verticalLineToRelative(-0.18f)
                quadToRelative(0.002f, -0.751f, 0.084f, -1.5f)
                lineTo(19.5f, 19.0f)
                curveToRelative(-3.799f, 0.0f, -6.65f, 1.885f, -8.573f, 4.76f)
                lineTo(7.362f, 30.0f)
                lineTo(14.0f, 30.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.0f)
                lineTo(5.639f, 31.0f)
                lineToRelative(0.426f, -0.748f)
                lineToRelative(4.0f, -7.0f)
                lineToRelative(0.01f, -0.015f)
                lineToRelative(0.009f, -0.014f)
                curveTo(12.161f, 20.107f, 15.306f, 18.0f, 19.5f, 18.0f)
                horizontalLineToRelative(2.73f)
                curveToRelative(0.41f, -2.22f, 1.373f, -4.31f, 2.916f, -5.853f)
                curveTo(26.602f, 10.692f, 27.922f, 10.0f, 29.5f, 10.0f)
                moveToRelative(4.0f, 13.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                moveToRelative(6.926f, 0.219f)
                lineToRelative(0.855f, 0.855f)
                lineToRelative(0.428f, -1.283f)
                close()
                moveTo(35.086f, 18.803f)
                curveToRelative(0.375f, 0.456f, 0.75f, 0.867f, 1.126f, 1.247f)
                lineToRelative(1.818f, -2.424f)
                close()
            }
        }
            .build()
        return _triceratopsLarge!!
    }

private var _triceratopsLarge: ImageVector? = null
