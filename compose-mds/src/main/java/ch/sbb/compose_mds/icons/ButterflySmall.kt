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

public val SBBIcons.ButterflySmall: ImageVector
    get() {
        if (_butterflySmall != null) {
            return _butterflySmall!!
        }
        _butterflySmall = Builder(name = "ButterflySmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.006f, 14.883f)
                curveToRelative(0.902f, -0.787f, 1.982f, -1.285f, 2.953f, -1.654f)
                lineToRelative(0.02f, -0.006f)
                lineToRelative(0.021f, -0.007f)
                verticalLineToRelative(1.228f)
                curveToRelative(-0.253f, 1.137f, -0.453f, 1.972f, -0.679f, 2.6f)
                curveToRelative(-0.227f, 0.634f, -0.464f, 1.005f, -0.756f, 1.25f)
                curveToRelative(-0.292f, 0.244f, -0.695f, 0.408f, -1.35f, 0.515f)
                curveToRelative(-0.555f, 0.091f, -1.252f, 0.134f, -2.158f, 0.17f)
                curveToRelative(0.125f, -1.936f, 0.932f, -3.207f, 1.949f, -4.096f)
                moveToRelative(3.492f, -0.383f)
                horizontalLineToRelative(0.003f)
                close()
                moveTo(12.5f, 16.627f)
                quadToRelative(-0.115f, 0.411f, -0.238f, 0.755f)
                curveToRelative(-0.257f, 0.714f, -0.57f, 1.273f, -1.056f, 1.68f)
                curveToRelative(-0.486f, 0.405f, -1.088f, 0.612f, -1.829f, 0.733f)
                curveToRelative(-0.735f, 0.12f, -1.66f, 0.164f, -2.821f, 0.205f)
                lineToRelative(-0.518f, 0.017f)
                lineTo(6.038f, 19.5f)
                curveToRelative(0.003f, -2.538f, 1.0f, -4.226f, 2.31f, -5.37f)
                quadToRelative(0.328f, -0.284f, 0.672f, -0.524f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.98f, -0.17f)
                curveToRelative(-1.317f, -0.35f, -2.353f, -1.132f, -3.13f, -2.078f)
                curveToRelative(-0.774f, -0.944f, -1.3f, -2.06f, -1.6f, -3.112f)
                curveToRelative(-0.297f, -1.045f, -0.386f, -2.07f, -0.245f, -2.836f)
                lineToRelative(0.073f, -0.393f)
                lineToRelative(0.4f, -0.016f)
                lineToRelative(0.019f, 0.499f)
                lineToRelative(-0.02f, -0.5f)
                curveToRelative(3.209f, -0.13f, 5.324f, 0.725f, 6.768f, 1.877f)
                curveToRelative(0.471f, 0.376f, 0.865f, 0.782f, 1.2f, 1.185f)
                lineToRelative(-0.488f, -2.457f)
                curveToRelative(-0.164f, -0.695f, -0.472f, -1.062f, -0.9f, -1.28f)
                curveToRelative(-0.468f, -0.24f, -1.139f, -0.333f, -2.084f, -0.324f)
                lineToRelative(-0.009f, -1.0f)
                curveToRelative(0.977f, -0.01f, 1.854f, 0.078f, 2.548f, 0.433f)
                curveToRelative(0.734f, 0.375f, 1.202f, 1.015f, 1.421f, 1.952f)
                lineToRelative(0.002f, 0.008f)
                lineToRelative(0.002f, 0.009f)
                lineToRelative(0.503f, 2.532f)
                lineToRelative(0.503f, -2.532f)
                lineToRelative(0.002f, -0.009f)
                lineToRelative(0.002f, -0.008f)
                curveToRelative(0.219f, -0.937f, 0.687f, -1.577f, 1.42f, -1.952f)
                curveToRelative(0.695f, -0.355f, 1.572f, -0.442f, 2.549f, -0.433f)
                lineToRelative(-0.01f, 1.0f)
                curveToRelative(-0.944f, -0.009f, -1.615f, 0.084f, -2.083f, 0.324f)
                curveToRelative(-0.428f, 0.218f, -0.736f, 0.585f, -0.9f, 1.28f)
                lineToRelative(-0.488f, 2.457f)
                curveToRelative(0.335f, -0.403f, 0.729f, -0.81f, 1.2f, -1.185f)
                curveTo(16.14f, 5.725f, 18.255f, 4.87f, 21.463f, 5.0f)
                lineToRelative(-0.02f, 0.499f)
                lineToRelative(0.02f, -0.5f)
                lineToRelative(0.4f, 0.017f)
                lineToRelative(0.072f, 0.393f)
                curveToRelative(0.14f, 0.766f, 0.052f, 1.791f, -0.246f, 2.836f)
                curveToRelative(-0.3f, 1.052f, -0.825f, 2.169f, -1.6f, 3.112f)
                curveToRelative(-0.776f, 0.946f, -1.812f, 1.728f, -3.128f, 2.078f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.981f, 0.17f)
                quadToRelative(0.345f, 0.24f, 0.671f, 0.523f)
                curveToRelative(1.311f, 1.145f, 2.308f, 2.833f, 2.31f, 5.37f)
                verticalLineToRelative(0.518f)
                lineTo(18.445f, 20.0f)
                curveToRelative(-1.162f, -0.04f, -2.086f, -0.084f, -2.821f, -0.204f)
                curveToRelative(-0.74f, -0.122f, -1.343f, -0.329f, -1.83f, -0.735f)
                curveToRelative(-0.484f, -0.406f, -0.798f, -0.965f, -1.055f, -1.679f)
                quadToRelative(-0.122f, -0.344f, -0.238f, -0.755f)
                moveToRelative(0.0f, -6.126f)
                lineTo(12.501f, 10.5f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(13.001f, 10.631f)
                verticalLineToRelative(1.516f)
                quadToRelative(0.182f, 0.066f, 0.374f, 0.139f)
                curveToRelative(1.31f, 0.42f, 2.413f, 0.427f, 3.33f, 0.183f)
                curveToRelative(1.075f, -0.285f, 1.942f, -0.927f, 2.613f, -1.745f)
                curveToRelative(0.674f, -0.82f, 1.142f, -1.808f, 1.41f, -2.752f)
                curveToRelative(0.214f, -0.75f, 0.294f, -1.444f, 0.267f, -1.982f)
                curveToRelative(-2.747f, -0.033f, -4.5f, 0.73f, -5.675f, 1.669f)
                curveToRelative(-1.17f, 0.933f, -1.807f, 2.063f, -2.286f, 2.913f)
                quadToRelative(-0.016f, 0.03f, -0.033f, 0.059f)
                moveToRelative(0.0f, 2.585f)
                verticalLineToRelative(1.229f)
                curveToRelative(0.253f, 1.137f, 0.453f, 1.97f, 0.679f, 2.6f)
                curveToRelative(0.227f, 0.633f, 0.464f, 1.004f, 0.756f, 1.249f)
                curveToRelative(0.292f, 0.244f, 0.695f, 0.408f, 1.35f, 0.515f)
                curveToRelative(0.555f, 0.091f, 1.252f, 0.134f, 2.158f, 0.17f)
                curveToRelative(-0.125f, -1.936f, -0.932f, -3.207f, -1.949f, -4.096f)
                curveToRelative(-0.902f, -0.787f, -1.982f, -1.285f, -2.953f, -1.654f)
                close()
                moveTo(4.272f, 7.972f)
                curveToRelative(-0.213f, -0.75f, -0.293f, -1.444f, -0.266f, -1.982f)
                curveToRelative(2.747f, -0.033f, 4.5f, 0.73f, 5.675f, 1.669f)
                curveToRelative(1.17f, 0.933f, 1.806f, 2.063f, 2.285f, 2.913f)
                lineToRelative(0.034f, 0.06f)
                verticalLineToRelative(1.515f)
                quadToRelative(-0.182f, 0.066f, -0.374f, 0.139f)
                curveToRelative(-1.31f, 0.42f, -2.413f, 0.427f, -3.33f, 0.183f)
                curveToRelative(-1.075f, -0.285f, -1.942f, -0.927f, -2.613f, -1.745f)
                curveToRelative(-0.674f, -0.82f, -1.141f, -1.808f, -1.41f, -2.752f)
            }
        }
        .build()
        return _butterflySmall!!
    }

private var _butterflySmall: ImageVector? = null
