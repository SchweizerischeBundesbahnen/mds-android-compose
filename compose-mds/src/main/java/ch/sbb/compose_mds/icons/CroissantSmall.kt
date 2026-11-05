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

public val SBBIcons.CroissantSmall: ImageVector
    get() {
        if (_croissantSmall != null) {
            return _croissantSmall!!
        }
        _croissantSmall = Builder(
            name = "CroissantSmall",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(11.9f, 2.772f)
                curveToRelative(-0.256f, -0.57f, -0.905f, -0.92f, -1.551f, -0.712f)
                arcToRelative(12.9f, 12.9f, 0.0f, false, false, -8.289f, 8.316f)
                curveToRelative(-0.161f, 0.502f, 0.011f, 1.01f, 0.366f, 1.332f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.16f, 0.437f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, false, 0.272f, 4.434f)
                curveToRelative(0.125f, 0.448f, 0.486f, 0.749f, 0.9f, 0.84f)
                curveToRelative(0.335f, 1.45f, 1.062f, 2.654f, 1.872f, 3.46f)
                curveToRelative(0.44f, 0.438f, 0.922f, 0.774f, 1.397f, 0.959f)
                curveToRelative(0.47f, 0.183f, 0.992f, 0.24f, 1.452f, 0.012f)
                curveToRelative(0.456f, -0.225f, 0.748f, -0.65f, 0.93f, -1.11f)
                curveToRelative(0.183f, -0.463f, 0.276f, -1.015f, 0.303f, -1.585f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.39f, -2.99f)
                curveToRelative(0.3f, -0.155f, 0.514f, -0.43f, 0.61f, -0.742f)
                quadToRelative(0.175f, -0.573f, 0.447f, -1.085f)
                curveToRelative(0.082f, -0.154f, 0.127f, -0.318f, 0.14f, -0.48f)
                lineToRelative(0.338f, 0.086f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, false, 1.316f, -0.442f)
                curveToRelative(0.5f, -0.613f, 1.053f, -1.178f, 1.659f, -1.677f)
                curveToRelative(0.346f, -0.285f, 0.534f, -0.732f, 0.468f, -1.187f)
                curveToRelative(0.164f, -0.014f, 0.33f, -0.061f, 0.486f, -0.148f)
                quadToRelative(0.507f, -0.279f, 1.073f, -0.46f)
                arcToRelative(1.24f, 1.24f, 0.0f, false, false, 0.701f, -0.562f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, 2.974f, 0.35f)
                curveToRelative(0.563f, -0.035f, 1.106f, -0.138f, 1.562f, -0.33f)
                curveToRelative(0.453f, -0.19f, 0.868f, -0.49f, 1.084f, -0.948f)
                curveToRelative(0.217f, -0.46f, 0.16f, -0.98f, -0.023f, -1.448f)
                curveToRelative(-0.185f, -0.475f, -0.518f, -0.954f, -0.953f, -1.392f)
                curveToRelative(-0.796f, -0.801f, -1.982f, -1.516f, -3.41f, -1.843f)
                arcToRelative(1.19f, 1.19f, 0.0f, false, false, -0.855f, -0.95f)
                arcToRelative(10.3f, 10.3f, 0.0f, false, false, -4.413f, -0.23f)
                quadToRelative(-0.165f, 0.027f, -0.307f, 0.095f)
                moveToRelative(5.449f, 2.083f)
                lineToRelative(-0.837f, 3.65f)
                curveToRelative(0.83f, 0.253f, 1.796f, 0.37f, 2.638f, 0.316f)
                curveToRelative(0.492f, -0.032f, 0.917f, -0.12f, 1.238f, -0.255f)
                curveToRelative(0.324f, -0.136f, 0.495f, -0.3f, 0.568f, -0.454f)
                curveToRelative(0.058f, -0.121f, 0.075f, -0.335f, -0.05f, -0.657f)
                curveToRelative(-0.124f, -0.316f, -0.367f, -0.683f, -0.732f, -1.05f)
                curveToRelative(-0.647f, -0.652f, -1.628f, -1.256f, -2.825f, -1.55f)
                moveToRelative(-13.833f, 7.29f)
                lineToRelative(5.54f, 1.42f)
                curveToRelative(0.122f, 0.039f, 0.185f, 0.18f, 0.12f, 0.304f)
                quadToRelative(-0.318f, 0.6f, -0.521f, 1.262f)
                curveToRelative(-0.03f, 0.095f, -0.092f, 0.145f, -0.15f, 0.159f)
                lineToRelative(-4.75f, 1.152f)
                curveToRelative(-0.123f, 0.03f, -0.23f, -0.046f, -0.254f, -0.133f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, -0.246f, -4.012f)
                curveToRelative(0.014f, -0.095f, 0.126f, -0.187f, 0.26f, -0.153f)
                moveToRelative(5.776f, 0.448f)
                lineToRelative(0.029f, 0.007f)
                lineToRelative(1.464f, 0.376f)
                curveToRelative(0.1f, 0.025f, 0.213f, -0.008f, 0.293f, -0.106f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, 1.798f, -1.816f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.107f, -0.305f)
                lineToRelative(-0.265f, -1.007f)
                verticalLineToRelative(-0.004f)
                lineToRelative(-1.715f, -6.512f)
                curveToRelative(-0.047f, -0.178f, -0.22f, -0.255f, -0.347f, -0.214f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -7.644f, 7.67f)
                curveToRelative(-0.044f, 0.135f, 0.041f, 0.311f, 0.214f, 0.356f)
                close()
                moveTo(6.013f, 20.168f)
                curveToRelative(-0.659f, -0.655f, -1.274f, -1.65f, -1.577f, -2.864f)
                lineToRelative(3.6f, -0.873f)
                curveToRelative(0.265f, 0.836f, 0.396f, 1.817f, 0.355f, 2.676f)
                curveToRelative(-0.023f, 0.5f, -0.104f, 0.935f, -0.234f, 1.264f)
                curveToRelative(-0.132f, 0.334f, -0.293f, 0.508f, -0.443f, 0.582f)
                curveToRelative(-0.116f, 0.057f, -0.324f, 0.078f, -0.646f, -0.048f)
                curveToRelative(-0.316f, -0.123f, -0.684f, -0.368f, -1.055f, -0.737f)
                moveToRelative(7.67f, -10.686f)
                verticalLineToRelative(0.002f)
                arcToRelative(0.205f, 0.205f, 0.0f, false, false, 0.3f, 0.13f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 1.249f, -0.537f)
                curveToRelative(0.091f, -0.03f, 0.141f, -0.092f, 0.156f, -0.155f)
                lineToRelative(1.099f, -4.79f)
                curveToRelative(0.03f, -0.131f, -0.052f, -0.238f, -0.134f, -0.26f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, false, -3.985f, -0.21f)
                arcToRelative(0.17f, 0.17f, 0.0f, false, false, -0.12f, 0.087f)
                arcToRelative(0.24f, 0.24f, 0.0f, false, false, -0.027f, 0.183f)
                close()
            }
        }
            .build()
        return _croissantSmall!!
    }

private var _croissantSmall: ImageVector? = null
