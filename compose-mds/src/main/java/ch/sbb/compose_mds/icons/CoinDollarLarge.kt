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

public val SBBIcons.CoinDollarLarge: ImageVector
    get() {
        if (_coinDollarLarge != null) {
            return _coinDollarLarge!!
        }
        _coinDollarLarge = Builder(
            name = "CoinDollarLarge",
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
                moveTo(23.5f, 4.0f)
                curveTo(34.27f, 4.0f, 43.0f, 12.73f, 43.0f, 23.5f)
                reflectiveCurveTo(34.27f, 43.0f, 23.5f, 43.0f)
                reflectiveCurveTo(4.0f, 34.27f, 4.0f, 23.5f)
                reflectiveCurveTo(12.73f, 4.0f, 23.5f, 4.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(13.283f, 5.0f, 5.0f, 13.283f, 5.0f, 23.5f)
                reflectiveCurveTo(13.283f, 42.0f, 23.5f, 42.0f)
                reflectiveCurveTo(42.0f, 33.717f, 42.0f, 23.5f)
                reflectiveCurveTo(33.717f, 5.0f, 23.5f, 5.0f)
                moveToRelative(0.44f, 7.98f)
                quadToRelative(2.635f, 0.21f, 3.992f, 1.551f)
                quadToRelative(1.47f, 1.443f, 1.441f, 3.8f)
                horizontalLineToRelative(-2.328f)
                quadToRelative(-0.22f, -3.287f, -3.105f, -3.396f)
                verticalLineToRelative(6.943f)
                quadToRelative(1.748f, 0.444f, 2.42f, 0.679f)
                reflectiveQuadToRelative(1.254f, 0.609f)
                quadToRelative(2.314f, 1.497f, 2.314f, 4.56f)
                quadToRelative(0.0f, 3.16f, -2.577f, 4.81f)
                quadToRelative(-1.234f, 0.79f, -3.41f, 0.915f)
                lineTo(23.941f, 36.5f)
                horizontalLineToRelative(-1.524f)
                verticalLineToRelative(-3.049f)
                quadToRelative(-3.118f, -0.196f, -4.628f, -1.858f)
                quadToRelative(-1.554f, -1.717f, -1.539f, -4.532f)
                horizontalLineToRelative(2.355f)
                quadToRelative(0.0f, 4.214f, 3.812f, 4.434f)
                verticalLineToRelative(-7.663f)
                quadToRelative(-2.12f, -0.36f, -3.576f, -1.289f)
                quadToRelative(-2.218f, -1.4f, -2.218f, -4.145f)
                quadToRelative(0.001f, -2.34f, 1.573f, -3.817f)
                quadToRelative(1.575f, -1.475f, 4.221f, -1.601f)
                lineTo(22.417f, 10.5f)
                horizontalLineToRelative(1.523f)
                close()
                moveTo(23.94f, 31.495f)
                quadToRelative(1.608f, -0.012f, 2.635f, -1.003f)
                reflectiveQuadToRelative(1.025f, -2.545f)
                quadToRelative(0.0f, -1.592f, -0.887f, -2.513f)
                quadToRelative(-0.886f, -0.924f, -2.773f, -1.27f)
                close()
                moveTo(22.417f, 14.922f)
                quadToRelative(-1.344f, 0.04f, -2.107f, 0.567f)
                quadToRelative(-1.359f, 0.941f, -1.359f, 2.717f)
                quadToRelative(0.0f, 1.385f, 0.847f, 2.189f)
                quadToRelative(0.845f, 0.804f, 2.619f, 1.108f)
                close()
                moveTo(19.151f, 9.677f)
                curveToRelative(-4.487f, 1.427f, -8.063f, 4.983f, -9.474f, 9.473f)
                lineTo(9.2f, 19.0f)
                lineToRelative(-0.476f, -0.15f)
                curveToRelative(1.51f, -4.804f, 5.33f, -8.602f, 10.125f, -10.126f)
                close()
            }
        }
            .build()
        return _coinDollarLarge!!
    }

private var _coinDollarLarge: ImageVector? = null
