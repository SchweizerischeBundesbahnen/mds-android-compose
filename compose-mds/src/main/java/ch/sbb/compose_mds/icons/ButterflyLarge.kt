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

public val SBBIcons.ButterflyLarge: ImageVector
    get() {
        if (_butterflyLarge != null) {
            return _butterflyLarge!!
        }
        _butterflyLarge = Builder(name = "ButterflyLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(33.995f, 8.0f)
                curveToRelative(-1.902f, -0.017f, -3.499f, 0.166f, -4.698f, 0.714f)
                curveToRelative(-1.161f, 0.53f, -1.971f, 1.41f, -2.32f, 2.883f)
                lineToRelative(-1.418f, 7.131f)
                curveToRelative(0.872f, -1.33f, 2.026f, -2.794f, 3.643f, -4.084f)
                curveToRelative(2.696f, -2.15f, 6.637f, -3.794f, 12.618f, -3.662f)
                lineToRelative(0.585f, 0.019f)
                lineToRelative(0.4f, 0.015f)
                lineToRelative(0.072f, 0.393f)
                curveToRelative(0.264f, 1.432f, 0.102f, 3.403f, -0.48f, 5.446f)
                curveToRelative(-0.584f, 2.05f, -1.605f, 4.219f, -3.103f, 6.044f)
                curveToRelative(-1.5f, 1.828f, -3.49f, 3.322f, -6.0f, 3.99f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, -3.504f, 0.362f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, true, 2.684f, 1.886f)
                curveToRelative(2.52f, 2.2f, 4.443f, 5.44f, 4.449f, 10.363f)
                verticalLineToRelative(0.517f)
                lineTo(36.406f, 40.0f)
                curveToRelative(-2.33f, -0.08f, -4.147f, -0.168f, -5.58f, -0.403f)
                curveToRelative(-1.437f, -0.235f, -2.542f, -0.628f, -3.417f, -1.359f)
                curveToRelative(-0.874f, -0.731f, -1.463f, -1.755f, -1.962f, -3.142f)
                curveToRelative(-0.332f, -0.923f, -0.63f, -2.03f, -0.946f, -3.353f)
                curveToRelative(-0.316f, 1.323f, -0.615f, 2.43f, -0.947f, 3.354f)
                curveToRelative(-0.498f, 1.386f, -1.087f, 2.41f, -1.961f, 3.141f)
                reflectiveCurveToRelative(-1.98f, 1.124f, -3.418f, 1.36f)
                curveToRelative(-1.433f, 0.234f, -3.25f, 0.321f, -5.58f, 0.402f)
                lineToRelative(-0.518f, 0.017f)
                lineTo(12.077f, 39.5f)
                curveToRelative(0.007f, -4.923f, 1.93f, -8.164f, 4.45f, -10.363f)
                curveToRelative(0.846f, -0.74f, 1.76f, -1.36f, 2.683f, -1.886f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, -3.503f, -0.363f)
                curveToRelative(-2.511f, -0.667f, -4.5f, -2.16f, -6.0f, -3.989f)
                curveToRelative(-1.498f, -1.825f, -2.52f, -3.993f, -3.104f, -6.044f)
                curveToRelative(-0.582f, -2.043f, -0.744f, -4.014f, -0.48f, -5.446f)
                lineToRelative(0.073f, -0.393f)
                lineToRelative(0.4f, -0.015f)
                curveToRelative(6.31f, -0.256f, 10.42f, 1.423f, 13.203f, 3.643f)
                curveToRelative(1.616f, 1.29f, 2.77f, 2.754f, 3.641f, 4.084f)
                lineToRelative(-1.417f, -7.13f)
                curveToRelative(-0.35f, -1.474f, -1.158f, -2.354f, -2.32f, -2.884f)
                curveToRelative(-1.199f, -0.548f, -2.795f, -0.731f, -4.697f, -0.714f)
                lineToRelative(-0.01f, -1.0f)
                curveToRelative(1.941f, -0.017f, 3.72f, 0.162f, 5.124f, 0.803f)
                curveToRelative(1.349f, 0.617f, 2.332f, 1.65f, 2.795f, 3.254f)
                lineToRelative(0.086f, 0.33f)
                lineToRelative(0.002f, 0.007f)
                verticalLineToRelative(0.008f)
                lineToRelative(1.498f, 7.532f)
                lineToRelative(1.497f, -7.532f)
                verticalLineToRelative(-0.008f)
                lineToRelative(0.003f, -0.008f)
                curveToRelative(0.418f, -1.792f, 1.442f, -2.925f, 2.88f, -3.583f)
                curveToRelative(1.405f, -0.641f, 3.183f, -0.82f, 5.125f, -0.803f)
                close()
                moveTo(24.0f, 26.23f)
                quadToRelative(-0.383f, 0.14f, -0.757f, 0.259f)
                curveToRelative(-1.967f, 0.747f, -4.192f, 1.769f, -6.06f, 3.4f)
                curveToRelative(-2.226f, 1.944f, -3.963f, 4.768f, -4.097f, 9.09f)
                curveToRelative(2.08f, -0.076f, 3.671f, -0.162f, 4.926f, -0.368f)
                curveToRelative(1.351f, -0.221f, 2.257f, -0.571f, 2.938f, -1.14f)
                curveToRelative(0.681f, -0.57f, 1.192f, -1.407f, 1.662f, -2.713f)
                curveToRelative(0.468f, -1.303f, 0.878f, -3.019f, 1.388f, -5.316f)
                close()
                moveTo(25.0f, 29.442f)
                curveToRelative(0.51f, 2.297f, 0.92f, 4.013f, 1.387f, 5.316f)
                curveToRelative(0.47f, 1.306f, 0.981f, 2.142f, 1.663f, 2.712f)
                curveToRelative(0.68f, 0.57f, 1.586f, 0.92f, 2.938f, 1.141f)
                curveToRelative(1.254f, 0.206f, 2.845f, 0.292f, 4.925f, 0.368f)
                curveToRelative(-0.134f, -4.322f, -1.87f, -7.146f, -4.097f, -9.09f)
                curveToRelative(-1.868f, -1.631f, -4.093f, -2.653f, -6.06f, -3.4f)
                quadToRelative(-0.374f, -0.121f, -0.756f, -0.26f)
                close()
                moveTo(19.0f, 30.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 18.998f, 34.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 30.0f)
                moveToRelative(11.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 29.998f, 34.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 30.0f)
                moveToRelative(-11.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.002f, 2.002f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 31.0f)
                moveToRelative(11.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.002f, 2.002f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 30.0f, 31.0f)
                moveTo(7.049f, 11.986f)
                curveToRelative(-0.139f, 1.209f, 0.016f, 2.844f, 0.515f, 4.595f)
                curveToRelative(0.554f, 1.942f, 1.518f, 3.981f, 2.915f, 5.683f)
                curveToRelative(1.395f, 1.7f, 3.214f, 3.054f, 5.484f, 3.658f)
                curveToRelative(1.94f, 0.516f, 4.246f, 0.49f, 6.949f, -0.376f)
                quadToRelative(0.565f, -0.214f, 1.088f, -0.399f)
                verticalLineToRelative(-3.515f)
                curveToRelative(-0.968f, -1.713f, -2.293f, -4.185f, -4.826f, -6.206f)
                curveToRelative(-2.517f, -2.008f, -6.267f, -3.599f, -12.125f, -3.44f)
                moveToRelative(34.901f, 0.0f)
                curveToRelative(-5.858f, -0.159f, -9.608f, 1.432f, -12.124f, 3.44f)
                curveToRelative(-2.534f, 2.021f, -3.858f, 4.493f, -4.826f, 6.206f)
                verticalLineToRelative(3.515f)
                quadToRelative(0.521f, 0.185f, 1.087f, 0.399f)
                curveToRelative(2.703f, 0.867f, 5.009f, 0.892f, 6.95f, 0.376f)
                curveToRelative(2.27f, -0.604f, 4.088f, -1.958f, 5.483f, -3.658f)
                curveToRelative(1.397f, -1.702f, 2.362f, -3.741f, 2.915f, -5.683f)
                curveToRelative(0.5f, -1.75f, 0.653f, -3.386f, 0.515f, -4.595f)
                moveTo(14.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                moveToRelative(21.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                moveToRelative(-21.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                moveToRelative(21.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
            }
        }
        .build()
        return _butterflyLarge!!
    }

private var _butterflyLarge: ImageVector? = null
