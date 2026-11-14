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

public val SBBIcons.MountainLakeSunMedium: ImageVector
    get() {
        if (_mountainLakeSunMedium != null) {
            return _mountainLakeSunMedium!!
        }
        _mountainLakeSunMedium = Builder(name = "MountainLakeSunMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.25f, 5.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                moveToRelative(0.0f, 6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                moveToRelative(22.941f, 9.015f)
                lineToRelative(-6.0f, -11.25f)
                lineToRelative(-0.317f, -0.596f)
                lineToRelative(-0.477f, 0.477f)
                lineToRelative(-8.694f, 8.693f)
                lineToRelative(-5.653f, -4.24f)
                lineToRelative(-0.423f, -0.316f)
                lineToRelative(-4.793f, 7.19f)
                lineToRelative(0.832f, 0.554f)
                lineToRelative(4.206f, -6.31f)
                lineToRelative(5.578f, 4.183f)
                lineToRelative(0.347f, 0.26f)
                lineToRelative(0.306f, -0.306f)
                lineToRelative(8.523f, -8.524f)
                lineToRelative(5.683f, 10.655f)
                close()
                moveTo(25.508f, 28.75f)
                curveToRelative(1.009f, 0.0f, 1.785f, 0.204f, 2.44f, 0.519f)
                curveToRelative(0.64f, 0.307f, 1.149f, 0.714f, 1.61f, 1.083f)
                lineToRelative(0.008f, 0.007f)
                curveToRelative(0.474f, 0.38f, 0.9f, 0.72f, 1.426f, 0.972f)
                curveToRelative(0.516f, 0.248f, 1.144f, 0.419f, 2.008f, 0.419f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.01f, 0.0f, -1.785f, -0.204f, -2.44f, -0.519f)
                curveToRelative(-0.64f, -0.307f, -1.149f, -0.714f, -1.61f, -1.083f)
                lineToRelative(-0.009f, -0.007f)
                curveToRelative(-0.473f, -0.38f, -0.899f, -0.72f, -1.425f, -0.972f)
                curveToRelative(-0.516f, -0.248f, -1.144f, -0.419f, -2.008f, -0.419f)
                reflectiveCurveToRelative(-1.494f, 0.172f, -2.01f, 0.42f)
                curveToRelative(-0.527f, 0.253f, -0.954f, 0.592f, -1.428f, 0.97f)
                lineToRelative(-0.017f, 0.015f)
                curveToRelative(-0.46f, 0.367f, -0.965f, 0.772f, -1.602f, 1.077f)
                curveToRelative(-0.655f, 0.315f, -1.433f, 0.518f, -2.442f, 0.518f)
                reflectiveCurveToRelative(-1.789f, -0.203f, -2.444f, -0.518f)
                curveToRelative(-0.637f, -0.305f, -1.143f, -0.71f, -1.603f, -1.077f)
                lineToRelative(-0.018f, -0.014f)
                curveToRelative(-0.474f, -0.38f, -0.901f, -0.718f, -1.428f, -0.971f)
                curveToRelative(-0.517f, -0.248f, -1.147f, -0.42f, -2.012f, -0.42f)
                reflectiveCurveToRelative(-1.495f, 0.172f, -2.012f, 0.42f)
                curveToRelative(-0.527f, 0.253f, -0.954f, 0.592f, -1.428f, 0.97f)
                lineToRelative(-0.018f, 0.015f)
                curveToRelative(-0.459f, 0.367f, -0.965f, 0.772f, -1.602f, 1.077f)
                curveToRelative(-0.656f, 0.315f, -1.433f, 0.518f, -2.444f, 0.518f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.866f, 0.0f, 1.495f, -0.172f, 2.012f, -0.42f)
                curveToRelative(0.527f, -0.253f, 0.954f, -0.592f, 1.427f, -0.97f)
                lineToRelative(0.014f, -0.011f)
                curveToRelative(0.46f, -0.368f, 0.968f, -0.775f, 1.608f, -1.081f)
                curveToRelative(0.655f, -0.315f, 1.433f, -0.518f, 2.443f, -0.518f)
                reflectiveCurveToRelative(1.788f, 0.203f, 2.444f, 0.518f)
                curveToRelative(0.637f, 0.305f, 1.143f, 0.71f, 1.602f, 1.077f)
                lineToRelative(0.018f, 0.014f)
                curveToRelative(0.474f, 0.38f, 0.902f, 0.718f, 1.43f, 0.971f)
                curveToRelative(0.516f, 0.248f, 1.145f, 0.42f, 2.01f, 0.42f)
                reflectiveCurveToRelative(1.494f, -0.172f, 2.01f, -0.42f)
                curveToRelative(0.527f, -0.253f, 0.954f, -0.592f, 1.427f, -0.97f)
                lineToRelative(0.018f, -0.015f)
                curveToRelative(0.459f, -0.367f, 0.965f, -0.772f, 1.601f, -1.077f)
                curveToRelative(0.656f, -0.315f, 1.434f, -0.518f, 2.444f, -0.518f)
                moveToRelative(2.44f, -5.481f)
                curveToRelative(-0.655f, -0.315f, -1.431f, -0.519f, -2.44f, -0.519f)
                curveToRelative(-1.01f, 0.0f, -1.788f, 0.203f, -2.443f, 0.518f)
                curveToRelative(-0.637f, 0.305f, -1.143f, 0.71f, -1.602f, 1.077f)
                lineToRelative(-0.018f, 0.014f)
                curveToRelative(-0.473f, 0.38f, -0.9f, 0.718f, -1.426f, 0.971f)
                curveToRelative(-0.517f, 0.248f, -1.146f, 0.42f, -2.01f, 0.42f)
                curveToRelative(-0.866f, 0.0f, -1.495f, -0.172f, -2.012f, -0.42f)
                curveToRelative(-0.527f, -0.253f, -0.955f, -0.592f, -1.429f, -0.97f)
                lineToRelative(-0.018f, -0.015f)
                curveToRelative(-0.459f, -0.367f, -0.965f, -0.772f, -1.602f, -1.077f)
                curveToRelative(-0.656f, -0.315f, -1.434f, -0.518f, -2.444f, -0.518f)
                reflectiveCurveToRelative(-1.788f, 0.203f, -2.443f, 0.518f)
                curveToRelative(-0.64f, 0.306f, -1.148f, 0.713f, -1.608f, 1.08f)
                lineToRelative(-0.014f, 0.011f)
                curveToRelative(-0.473f, 0.38f, -0.9f, 0.718f, -1.427f, 0.971f)
                curveToRelative(-0.517f, 0.248f, -1.146f, 0.42f, -2.012f, 0.42f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.01f, 0.0f, 1.788f, -0.203f, 2.444f, -0.518f)
                curveToRelative(0.637f, -0.305f, 1.143f, -0.71f, 1.602f, -1.077f)
                lineToRelative(0.018f, -0.014f)
                curveToRelative(0.474f, -0.38f, 0.901f, -0.718f, 1.428f, -0.971f)
                curveToRelative(0.517f, -0.248f, 1.147f, -0.42f, 2.012f, -0.42f)
                reflectiveCurveToRelative(1.495f, 0.172f, 2.012f, 0.42f)
                curveToRelative(0.527f, 0.253f, 0.954f, 0.592f, 1.428f, 0.97f)
                lineToRelative(0.018f, 0.015f)
                curveToRelative(0.46f, 0.367f, 0.966f, 0.772f, 1.603f, 1.077f)
                curveToRelative(0.655f, 0.315f, 1.433f, 0.518f, 2.444f, 0.518f)
                reflectiveCurveToRelative(1.787f, -0.203f, 2.442f, -0.518f)
                curveToRelative(0.637f, -0.305f, 1.143f, -0.71f, 1.602f, -1.077f)
                lineToRelative(0.017f, -0.014f)
                curveToRelative(0.474f, -0.38f, 0.901f, -0.718f, 1.428f, -0.971f)
                curveToRelative(0.516f, -0.248f, 1.145f, -0.42f, 2.01f, -0.42f)
                reflectiveCurveToRelative(1.492f, 0.171f, 2.008f, 0.419f)
                curveToRelative(0.526f, 0.253f, 0.952f, 0.593f, 1.425f, 0.972f)
                lineToRelative(0.01f, 0.007f)
                curveToRelative(0.46f, 0.369f, 0.968f, 0.776f, 1.609f, 1.083f)
                curveToRelative(0.655f, 0.315f, 1.43f, 0.519f, 2.44f, 0.519f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-0.864f, 0.0f, -1.492f, -0.171f, -2.008f, -0.419f)
                curveToRelative(-0.526f, -0.253f, -0.952f, -0.593f, -1.426f, -0.972f)
                lineToRelative(-0.008f, -0.007f)
                curveToRelative(-0.461f, -0.369f, -0.97f, -0.776f, -1.61f, -1.083f)
            }
        }
        .build()
        return _mountainLakeSunMedium!!
    }

private var _mountainLakeSunMedium: ImageVector? = null
