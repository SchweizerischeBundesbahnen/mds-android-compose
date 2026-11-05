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

public val SBBIcons.TriceratopsSmall: ImageVector
    get() {
        if (_triceratopsSmall != null) {
            return _triceratopsSmall!!
        }
        _triceratopsSmall = Builder(
            name = "TriceratopsSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(15.0f, 20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.493f)
                lineToRelative(-0.14f, 0.009f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, false, -0.719f, 0.38f)
                curveToRelative(-0.217f, 0.249f, -0.374f, 0.602f, -0.478f, 1.0f)
                arcToRelative(6.206f, 6.206f, 0.0f, false, false, -0.173f, 1.46f)
                lineToRelative(0.002f, 0.098f)
                verticalLineToRelative(0.024f)
                lineToRelative(0.001f, 0.005f)
                lineToRelative(-0.5f, 0.024f)
                lineToRelative(-0.499f, 0.024f)
                verticalLineToRelative(-0.005f)
                lineTo(8.0f, 20.01f)
                lineToRelative(-0.001f, -0.034f)
                lineToRelative(-0.002f, -0.123f)
                arcToRelative(6.653f, 6.653f, 0.0f, false, true, 0.206f, -1.719f)
                curveToRelative(0.125f, -0.473f, 0.333f, -0.993f, 0.693f, -1.403f)
                curveToRelative(0.375f, -0.427f, 0.901f, -0.72f, 1.597f, -0.73f)
                lineTo(15.0f, 16.001f)
                close()
                moveTo(14.5f, 5.0f)
                curveToRelative(0.447f, 0.0f, 0.802f, 0.21f, 1.07f, 0.492f)
                curveToRelative(0.258f, 0.273f, 0.454f, 0.63f, 0.614f, 0.995f)
                curveToRelative(0.301f, 0.692f, 0.544f, 1.601f, 0.77f, 2.291f)
                lineToRelative(0.11f, 0.158f)
                lineToRelative(3.906f, -1.562f)
                lineToRelative(-2.412f, 3.215f)
                curveToRelative(0.34f, 0.299f, 0.685f, 0.57f, 1.04f, 0.85f)
                lineToRelative(2.193f, -0.73f)
                lineTo(21.0f, 13.082f)
                lineTo(21.0f, 14.0f)
                curveToRelative(0.0f, 0.243f, 0.0f, 0.486f, -0.018f, 0.698f)
                reflectiveCurveToRelative(-0.055f, 0.442f, -0.16f, 0.65f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, true, -0.54f, 0.515f)
                curveToRelative(-0.232f, 0.103f, -0.498f, 0.137f, -0.782f, 0.137f)
                lineTo(18.0f, 16.0f)
                curveToRelative(-0.256f, 0.0f, -0.452f, 0.0f, -0.614f, 0.014f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.287f, 0.058f)
                curveToRelative(-0.023f, 0.012f, -0.034f, 0.02f, -0.048f, 0.053f)
                curveToRelative(-0.023f, 0.05f, -0.051f, 0.16f, -0.051f, 0.375f)
                lineTo(17.0f, 20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.284f, 0.034f, -0.55f, 0.137f, -0.781f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, true, 0.514f, -0.541f)
                curveToRelative(0.21f, -0.105f, 0.44f, -0.143f, 0.65f, -0.16f)
                curveTo(17.515f, 15.0f, 17.758f, 15.0f, 18.0f, 15.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.216f, 0.0f, 0.325f, -0.028f, 0.375f, -0.05f)
                curveToRelative(0.033f, -0.015f, 0.041f, -0.026f, 0.053f, -0.049f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.058f, -0.287f)
                curveTo(20.0f, 14.452f, 20.0f, 14.256f, 20.0f, 14.0f)
                verticalLineToRelative(-0.793f)
                lineToRelative(-0.832f, -0.832f)
                curveToRelative(-0.98f, -0.783f, -2.04f, -1.531f, -3.084f, -3.098f)
                lineToRelative(-0.037f, -0.055f)
                lineToRelative(-0.022f, -0.064f)
                curveToRelative(-0.267f, -0.803f, -0.47f, -1.608f, -0.758f, -2.27f)
                quadToRelative(-0.212f, -0.484f, -0.423f, -0.708f)
                curveTo(14.71f, 6.04f, 14.603f, 6.0f, 14.5f, 6.0f)
                curveToRelative(-0.52f, 0.0f, -1.001f, 0.208f, -1.646f, 0.854f)
                curveToRelative(-0.848f, 0.847f, -1.312f, 2.131f, -1.35f, 3.47f)
                lineToRelative(2.38f, 2.856f)
                lineToRelative(-0.768f, 0.64f)
                lineToRelative(-2.5f, -3.0f)
                lineToRelative(-0.116f, -0.14f)
                verticalLineToRelative(-0.18f)
                quadToRelative(0.0f, -0.25f, 0.019f, -0.5f)
                lineTo(9.5f, 10.0f)
                curveToRelative(-1.8f, 0.0f, -3.151f, 0.886f, -4.074f, 2.263f)
                lineTo(3.862f, 15.0f)
                lineTo(7.0f, 15.0f)
                verticalLineToRelative(5.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(-4.0f)
                lineTo(2.139f, 16.0f)
                lineToRelative(0.426f, -0.748f)
                lineToRelative(2.0f, -3.5f)
                lineToRelative(0.01f, -0.015f)
                lineToRelative(0.009f, -0.014f)
                curveTo(5.661f, 10.107f, 7.306f, 9.0f, 9.5f, 9.0f)
                horizontalLineToRelative(1.158f)
                curveToRelative(0.233f, -1.077f, 0.723f, -2.088f, 1.489f, -2.854f)
                curveTo(12.9f, 5.392f, 13.62f, 5.0f, 14.5f, 5.0f)
                moveToRelative(2.0f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                moveToRelative(1.21f, -2.246f)
                quadToRelative(0.06f, 0.068f, 0.122f, 0.135f)
                lineToRelative(0.198f, -0.263f)
                close()
            }
        }
            .build()
        return _triceratopsSmall!!
    }

private var _triceratopsSmall: ImageVector? = null
