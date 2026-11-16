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

public val SBBIcons.CloudLarge: ImageVector
    get() {
        if (_cloudLarge != null) {
            return _cloudLarge!!
        }
        _cloudLarge = Builder(name = "CloudLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(32.842f, 6.203f)
                curveToRelative(1.36f, -0.491f, 3.039f, -0.116f, 3.984f, 1.416f)
                curveToRelative(1.513f, -0.714f, 3.426f, 0.32f, 3.519f, 2.166f)
                curveToRelative(0.481f, 0.127f, 0.87f, 0.429f, 1.145f, 0.812f)
                curveToRelative(0.36f, 0.501f, 0.535f, 1.15f, 0.507f, 1.785f)
                curveToRelative(-0.028f, 0.639f, -0.262f, 1.3f, -0.764f, 1.803f)
                curveToRelative(-0.507f, 0.509f, -1.247f, 0.815f, -2.2f, 0.815f)
                horizontalLineToRelative(-6.996f)
                curveToRelative(-0.943f, 0.0f, -1.687f, -0.307f, -2.207f, -0.807f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, true, -0.823f, -1.787f)
                curveToRelative(-0.044f, -0.636f, 0.13f, -1.29f, 0.53f, -1.789f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.188f, -0.742f)
                curveToRelative(-0.125f, -0.8f, 0.005f, -1.524f, 0.323f, -2.129f)
                arcToRelative(3.27f, 3.27f, 0.0f, false, true, 1.794f, -1.543f)
                moveToRelative(3.209f, 2.072f)
                curveToRelative(-0.67f, -1.215f, -1.886f, -1.487f, -2.87f, -1.132f)
                curveToRelative(-0.53f, 0.192f, -0.983f, 0.564f, -1.248f, 1.068f)
                curveToRelative(-0.262f, 0.498f, -0.358f, 1.158f, -0.117f, 1.966f)
                lineToRelative(0.2f, 0.67f)
                lineToRelative(-0.699f, -0.028f)
                curveToRelative(-0.466f, -0.018f, -0.79f, 0.16f, -1.002f, 0.424f)
                curveToRelative(-0.221f, 0.276f, -0.34f, 0.674f, -0.311f, 1.095f)
                curveToRelative(0.028f, 0.417f, 0.2f, 0.829f, 0.518f, 1.134f)
                curveToRelative(0.313f, 0.3f, 0.799f, 0.528f, 1.515f, 0.528f)
                horizontalLineToRelative(6.996f)
                curveToRelative(0.73f, 0.0f, 1.2f, -0.229f, 1.491f, -0.522f)
                curveToRelative(0.298f, -0.299f, 0.455f, -0.709f, 0.474f, -1.14f)
                curveToRelative(0.019f, -0.435f, -0.104f, -0.856f, -0.32f, -1.157f)
                curveToRelative(-0.21f, -0.293f, -0.496f, -0.461f, -0.845f, -0.461f)
                horizontalLineToRelative(-0.563f)
                lineToRelative(0.067f, -0.56f)
                lineToRelative(0.496f, 0.06f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-0.496f, -0.059f)
                curveToRelative(0.178f, -1.488f, -1.415f, -2.235f, -2.386f, -1.444f)
                lineToRelative(-0.508f, 0.414f)
                lineToRelative(-0.265f, -0.599f)
                close()
                moveTo(13.605f, 30.512f)
                curveToRelative(1.329f, -2.36f, 3.802f, -2.943f, 5.797f, -2.222f)
                curveToRelative(1.063f, 0.384f, 2.0f, 1.14f, 2.555f, 2.195f)
                curveToRelative(0.481f, 0.916f, 0.66f, 2.03f, 0.415f, 3.279f)
                arcTo(2.91f, 2.91f, 0.0f, false, true, 24.376f, 35.0f)
                horizontalLineToRelative(10.34f)
                curveToRelative(2.203f, 0.0f, 3.73f, -0.697f, 4.722f, -1.693f)
                curveToRelative(0.998f, -1.0f, 1.496f, -2.347f, 1.556f, -3.714f)
                curveToRelative(0.06f, -1.371f, -0.323f, -2.73f, -1.044f, -3.733f)
                curveToRelative(-0.714f, -0.994f, -1.75f, -1.63f, -3.034f, -1.63f)
                horizontalLineToRelative(-0.563f)
                lineToRelative(0.067f, -0.56f)
                curveToRelative(0.584f, -4.872f, -4.703f, -7.43f, -7.984f, -4.754f)
                lineToRelative(-0.507f, 0.414f)
                lineToRelative(-0.266f, -0.6f)
                curveToRelative(-1.946f, -4.392f, -6.058f, -5.467f, -9.337f, -4.283f)
                curveToRelative(-1.645f, 0.595f, -3.071f, 1.756f, -3.91f, 3.352f)
                curveToRelative(-0.783f, 1.49f, -1.07f, 3.388f, -0.508f, 5.612f)
                lineToRelative(0.124f, 0.45f)
                lineToRelative(0.2f, 0.67f)
                lineToRelative(-0.699f, -0.028f)
                lineToRelative(-0.373f, -0.002f)
                curveToRelative(-1.823f, 0.056f, -3.068f, 1.08f, -3.695f, 2.476f)
                curveToRelative(-0.574f, 1.275f, -0.628f, 2.86f, -0.098f, 4.28f)
                curveToRelative(1.04f, -1.155f, 2.8f, -1.546f, 4.238f, -0.745f)
                moveToRelative(-4.878f, 1.775f)
                curveToRelative(-0.923f, -1.824f, -0.952f, -3.992f, -0.174f, -5.722f)
                curveToRelative(0.745f, -1.655f, 2.235f, -2.909f, 4.351f, -3.053f)
                curveToRelative(-0.57f, -2.384f, -0.263f, -4.486f, 0.627f, -6.18f)
                curveToRelative(0.965f, -1.834f, 2.596f, -3.154f, 4.455f, -3.825f)
                curveToRelative(3.585f, -1.295f, 8.05f, -0.187f, 10.325f, 4.263f)
                curveToRelative(3.856f, -2.527f, 9.392f, 0.3f, 9.145f, 5.49f)
                curveToRelative(1.405f, 0.16f, 2.533f, 0.939f, 3.307f, 2.016f)
                curveToRelative(0.864f, 1.204f, 1.299f, 2.79f, 1.23f, 4.36f)
                curveToRelative(-0.069f, 1.576f, -0.645f, 3.172f, -1.846f, 4.378f)
                curveTo(38.939f, 35.225f, 37.142f, 36.0f, 34.717f, 36.0f)
                horizontalLineToRelative(-9.868f)
                curveToRelative(0.125f, 0.431f, 0.172f, 0.889f, 0.141f, 1.343f)
                arcToRelative(3.84f, 3.84f, 0.0f, false, true, -1.158f, 2.516f)
                curveToRelative(-0.729f, 0.7f, -1.78f, 1.14f, -3.138f, 1.14f)
                horizontalLineTo(10.2f)
                curveToRelative(-1.373f, 0.0f, -2.414f, -0.44f, -3.122f, -1.15f)
                curveToRelative(-0.701f, -0.703f, -1.034f, -1.631f, -1.073f, -2.538f)
                curveToRelative(-0.04f, -0.902f, 0.21f, -1.818f, 0.714f, -2.52f)
                curveToRelative(0.416f, -0.58f, 1.014f, -1.02f, 1.757f, -1.162f)
                curveToRelative(0.001f, -0.488f, 0.092f, -0.938f, 0.252f, -1.342f)
                moveToRelative(10.336f, -3.057f)
                curveToRelative(-1.687f, -0.609f, -3.8f, -0.062f, -4.808f, 2.215f)
                lineToRelative(-0.457f, -0.203f)
                lineToRelative(-0.317f, 0.388f)
                curveToRelative(-1.58f, -1.288f, -4.115f, -0.141f, -4.003f, 2.164f)
                lineToRelative(0.02f, 0.226f)
                lineToRelative(0.065f, 0.56f)
                horizontalLineTo(9.0f)
                curveToRelative(-0.616f, 0.0f, -1.116f, 0.302f, -1.47f, 0.795f)
                curveToRelative(-0.36f, 0.501f, -0.558f, 1.19f, -0.527f, 1.892f)
                curveToRelative(0.03f, 0.7f, 0.285f, 1.377f, 0.783f, 1.877f)
                curveToRelative(0.492f, 0.493f, 1.263f, 0.856f, 2.413f, 0.856f)
                horizontalLineToRelative(10.495f)
                curveToRelative(1.132f, 0.0f, 1.925f, -0.362f, 2.446f, -0.861f)
                arcToRelative(2.85f, 2.85f, 0.0f, false, false, 0.853f, -1.865f)
                curveToRelative(0.047f, -0.685f, -0.144f, -1.345f, -0.521f, -1.815f)
                curveToRelative(-0.367f, -0.458f, -0.93f, -0.762f, -1.708f, -0.73f)
                lineToRelative(-0.7f, 0.028f)
                lineToRelative(0.2f, -0.671f)
                lineToRelative(0.066f, -0.236f)
                curveToRelative(0.294f, -1.163f, 0.141f, -2.141f, -0.258f, -2.9f)
                arcToRelative(3.66f, 3.66f, 0.0f, false, false, -2.01f, -1.72f)
                moveToRelative(-5.582f, 2.4f)
                lineToRelative(0.508f, 0.414f)
                lineToRelative(0.266f, -0.599f)
                lineToRelative(-0.457f, -0.202f)
                close()
            }
        }
        .build()
        return _cloudLarge!!
    }

private var _cloudLarge: ImageVector? = null
