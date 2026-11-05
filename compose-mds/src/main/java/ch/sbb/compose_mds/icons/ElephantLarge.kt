package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.ElephantLarge: ImageVector
    get() {
        if (_elephantLarge != null) {
            return _elephantLarge!!
        }
        _elephantLarge = Builder(
            name = "ElephantLarge",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(30.374f, 13.563f)
                arcTo(10.48f, 10.48f, 0.0f, false, true, 34.0f, 21.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.88f, -0.494f, 3.645f, -1.36f, 5.172f)
                arcToRelative(6.997f, 6.997f, 0.0f, false, false, 8.253f, -4.398f)
                lineToRelative(1.37f, -3.76f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -11.89f, -6.951f)
                moveToRelative(0.805f, 17.099f)
                arcToRelative(10.6f, 10.6f, 0.0f, false, true, -2.15f, 1.766f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 4.692f, 3.172f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, true, -2.542f, -4.938f)
                moveToRelative(-3.745f, 2.576f)
                arcTo(10.5f, 10.5f, 0.0f, false, true, 23.5f, 34.0f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, true, -4.022f, -0.798f)
                curveToRelative(0.973f, 2.961f, 2.435f, 5.435f, 4.096f, 7.216f)
                curveToRelative(1.868f, 2.0f, 3.944f, 3.082f, 5.836f, 3.082f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-0.93f)
                curveToRelative(-0.527f, 0.0f, -1.122f, -0.314f, -1.646f, -0.757f)
                curveToRelative(-0.545f, -0.46f, -1.088f, -1.12f, -1.51f, -1.945f)
                curveToRelative(-0.726f, -1.422f, -1.092f, -3.336f, -0.48f, -5.56f)
                moveToRelative(-9.501f, -0.834f)
                arcToRelative(10.6f, 10.6f, 0.0f, false, true, -2.16f, -1.794f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, true, -2.55f, 4.99f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 4.71f, -3.196f)
                moveToRelative(-3.573f, -3.733f)
                arcToRelative(10.45f, 10.45f, 0.0f, false, true, -1.36f, -5.17f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.171f, 1.405f, -6.013f, 3.626f, -7.939f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -9.491f, -1.055f)
                moveToRelative(10.278f, 0.437f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.615f, 7.913f)
                lineToRelative(1.368f, 3.759f)
                arcToRelative(7.997f, 7.997f, 0.0f, false, false, 9.755f, 4.94f)
                lineToRelative(0.007f, 0.009f)
                arcToRelative(9.48f, 9.48f, 0.0f, false, true, -3.673f, 6.48f)
                lineTo(9.83f, 37.132f)
                lineToRelative(1.78f, -0.19f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, false, 6.857f, -3.613f)
                curveToRelative(1.012f, 3.164f, 2.568f, 5.836f, 4.375f, 7.772f)
                curveToRelative(1.977f, 2.117f, 4.299f, 3.4f, 6.567f, 3.4f)
                horizontalLineToRelative(1.724f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 1.867f, -0.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.867f, -0.5f)
                horizontalLineToRelative(-0.064f)
                curveToRelative(-0.174f, 0.0f, -0.541f, -0.132f, -1.0f, -0.52f)
                curveToRelative(-0.44f, -0.371f, -0.902f, -0.926f, -1.265f, -1.637f)
                curveToRelative(-0.637f, -1.247f, -0.972f, -2.975f, -0.35f, -5.04f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, false, 6.878f, 3.638f)
                lineToRelative(1.78f, 0.19f)
                lineToRelative(-1.424f, -1.085f)
                arcToRelative(9.48f, 9.48f, 0.0f, false, true, -3.667f, -6.41f)
                lineToRelative(0.057f, -0.08f)
                arcToRelative(7.996f, 7.996f, 0.0f, false, false, 9.754f, -4.94f)
                lineToRelative(1.369f, -3.76f)
                arcToRelative(7.998f, 7.998f, 0.0f, false, false, -13.615f, -7.913f)
                arcTo(10.45f, 10.45f, 0.0f, false, false, 23.5f, 11.0f)
                curveToRelative(-2.27f, 0.0f, -4.37f, 0.72f, -6.087f, 1.944f)
                moveTo(14.36f, 28.67f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -8.254f, -4.397f)
                lineToRelative(-1.368f, -3.76f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 2.397f, -8.007f)
                moveTo(23.5f, 12.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, -9.5f, 9.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.5f, 9.5f)
                curveToRelative(5.246f, 0.0f, 9.5f, -4.253f, 9.5f, -9.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -5.247f, -4.254f, -9.5f, -9.5f, -9.5f)
                moveTo(18.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(13.001f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
            }
        }
            .build()
        return _elephantLarge!!
    }

private var _elephantLarge: ImageVector? = null
