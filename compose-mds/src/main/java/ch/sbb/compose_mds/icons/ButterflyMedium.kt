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

public val SBBIcons.ButterflyMedium: ImageVector
    get() {
        if (_butterflyMedium != null) {
            return _butterflyMedium!!
        }
        _butterflyMedium = Builder(
            name = "ButterflyMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(25.453f, 5.75f)
                curveToRelative(-1.426f, -0.012f, -2.484f, 0.126f, -3.243f, 0.514f)
                curveToRelative(-0.718f, 0.368f, -1.221f, 0.987f, -1.48f, 2.092f)
                lineToRelative(-0.942f, 4.737f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, true, 2.41f, -2.582f)
                curveToRelative(2.114f, -1.686f, 5.226f, -2.953f, 9.986f, -2.76f)
                lineToRelative(0.4f, 0.016f)
                lineToRelative(0.072f, 0.392f)
                curveToRelative(0.202f, 1.1f, 0.077f, 2.598f, -0.363f, 4.141f)
                curveToRelative(-0.442f, 1.552f, -1.215f, 3.194f, -2.351f, 4.579f)
                curveToRelative(-1.139f, 1.387f, -2.651f, 2.525f, -4.564f, 3.033f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, -2.184f, 0.286f)
                curveToRelative(0.557f, 0.344f, 1.104f, 0.735f, 1.62f, 1.185f)
                curveToRelative(1.914f, 1.672f, 3.374f, 4.136f, 3.379f, 7.866f)
                verticalLineToRelative(0.519f)
                lineToRelative(-0.518f, -0.018f)
                curveToRelative(-1.746f, -0.06f, -3.117f, -0.126f, -4.2f, -0.303f)
                curveToRelative(-1.09f, -0.179f, -1.944f, -0.479f, -2.624f, -1.048f)
                curveToRelative(-0.68f, -0.568f, -1.131f, -1.36f, -1.509f, -2.41f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, -0.592f, -2.027f)
                curveToRelative(-0.194f, 0.778f, -0.384f, 1.45f, -0.592f, 2.027f)
                curveToRelative(-0.378f, 1.05f, -0.83f, 1.842f, -1.509f, 2.41f)
                curveToRelative(-0.68f, 0.57f, -1.534f, 0.87f, -2.624f, 1.048f)
                curveToRelative(-1.083f, 0.177f, -2.454f, 0.242f, -4.2f, 0.303f)
                lineToRelative(-0.518f, 0.018f)
                verticalLineToRelative(-0.519f)
                curveToRelative(0.005f, -3.73f, 1.465f, -6.194f, 3.38f, -7.866f)
                curveToRelative(0.515f, -0.45f, 1.062f, -0.841f, 1.619f, -1.185f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, -2.183f, -0.286f)
                curveToRelative(-1.914f, -0.508f, -3.426f, -1.646f, -4.565f, -3.033f)
                curveToRelative(-1.136f, -1.385f, -1.909f, -3.027f, -2.351f, -4.579f)
                curveToRelative(-0.44f, -1.543f, -0.565f, -3.041f, -0.363f, -4.14f)
                lineToRelative(0.073f, -0.393f)
                lineToRelative(0.399f, -0.016f)
                curveToRelative(4.76f, -0.193f, 7.872f, 1.074f, 9.985f, 2.76f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, true, 2.411f, 2.582f)
                lineToRelative(-0.941f, -4.737f)
                curveToRelative(-0.26f, -1.105f, -0.763f, -1.724f, -1.481f, -2.092f)
                curveToRelative(-0.76f, -0.388f, -1.817f, -0.526f, -3.242f, -0.514f)
                lineToRelative(-0.01f, -1.0f)
                curveToRelative(1.458f, -0.013f, 2.722f, 0.12f, 3.707f, 0.624f)
                curveToRelative(1.024f, 0.524f, 1.687f, 1.415f, 2.002f, 2.762f)
                lineToRelative(0.001f, 0.009f)
                lineToRelative(0.002f, 0.008f)
                lineToRelative(1.0f, 5.032f)
                lineToRelative(1.0f, -5.032f)
                lineToRelative(0.002f, -0.008f)
                lineToRelative(0.002f, -0.009f)
                curveToRelative(0.314f, -1.347f, 0.977f, -2.238f, 2.0f, -2.762f)
                curveToRelative(0.986f, -0.504f, 2.25f, -0.637f, 3.707f, -0.624f)
                close()
                moveTo(19.25f, 15.882f)
                verticalLineToRelative(2.514f)
                quadToRelative(0.382f, 0.135f, 0.794f, 0.292f)
                curveToRelative(1.98f, 0.623f, 3.663f, 0.634f, 5.077f, 0.258f)
                curveToRelative(1.672f, -0.445f, 3.015f, -1.443f, 4.048f, -2.702f)
                curveToRelative(1.035f, -1.26f, 1.751f, -2.775f, 2.162f, -4.218f)
                curveToRelative(0.357f, -1.25f, 0.475f, -2.415f, 0.395f, -3.29f)
                curveToRelative(-4.305f, -0.095f, -7.057f, 1.083f, -8.903f, 2.556f)
                curveToRelative(-1.793f, 1.43f, -2.769f, 3.163f, -3.487f, 4.437f)
                close()
                moveTo(19.25f, 19.476f)
                verticalLineToRelative(2.22f)
                curveToRelative(0.381f, 1.715f, 0.686f, 2.99f, 1.033f, 3.955f)
                curveToRelative(0.349f, 0.97f, 0.723f, 1.574f, 1.21f, 1.981f)
                curveToRelative(0.486f, 0.407f, 1.14f, 0.664f, 2.143f, 0.828f)
                curveToRelative(0.906f, 0.148f, 2.05f, 0.215f, 3.546f, 0.271f)
                curveToRelative(-0.13f, -3.13f, -1.404f, -5.178f, -3.026f, -6.595f)
                curveToRelative(-1.367f, -1.193f, -2.992f, -1.95f, -4.446f, -2.505f)
                quadToRelative(-0.229f, -0.073f, -0.46f, -0.155f)
                moveToRelative(-1.0f, -1.08f)
                verticalLineToRelative(-2.514f)
                lineToRelative(-0.087f, -0.153f)
                curveToRelative(-0.717f, -1.274f, -1.694f, -3.007f, -3.486f, -4.437f)
                curveToRelative(-1.846f, -1.473f, -4.598f, -2.651f, -8.903f, -2.555f)
                curveToRelative(-0.08f, 0.874f, 0.038f, 2.038f, 0.395f, 3.29f)
                curveToRelative(0.41f, 1.442f, 1.127f, 2.956f, 2.162f, 4.217f)
                reflectiveCurveToRelative(2.376f, 2.257f, 4.048f, 2.702f)
                curveToRelative(1.414f, 0.376f, 3.097f, 0.365f, 5.077f, -0.258f)
                quadToRelative(0.412f, -0.157f, 0.794f, -0.292f)
                moveToRelative(-4.905f, 3.74f)
                curveToRelative(1.366f, -1.193f, 2.992f, -1.95f, 4.446f, -2.505f)
                quadToRelative(0.227f, -0.073f, 0.459f, -0.155f)
                verticalLineToRelative(2.22f)
                curveToRelative(-0.381f, 1.715f, -0.686f, 2.99f, -1.033f, 3.955f)
                curveToRelative(-0.349f, 0.97f, -0.723f, 1.574f, -1.21f, 1.981f)
                curveToRelative(-0.486f, 0.407f, -1.14f, 0.664f, -2.143f, 0.828f)
                curveToRelative(-0.906f, 0.148f, -2.05f, 0.215f, -3.546f, 0.271f)
                curveToRelative(0.13f, -3.13f, 1.405f, -5.178f, 3.027f, -6.595f)
            }
        }
            .build()
        return _butterflyMedium!!
    }

private var _butterflyMedium: ImageVector? = null
