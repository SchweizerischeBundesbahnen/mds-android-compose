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
        _butterflySmall = Builder(
            name = "ButterflySmall",
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
                moveTo(8.033f, 4.0f)
                curveToRelative(0.945f, -0.008f, 1.616f, 0.085f, 2.084f, 0.325f)
                curveToRelative(0.428f, 0.218f, 0.737f, 0.585f, 0.9f, 1.28f)
                lineToRelative(0.488f, 2.455f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -1.2f, -1.183f)
                curveTo(8.86f, 5.725f, 6.746f, 4.87f, 3.537f, 5.0f)
                lineToRelative(-0.399f, 0.017f)
                lineToRelative(-0.072f, 0.392f)
                curveToRelative(-0.142f, 0.766f, -0.053f, 1.792f, 0.245f, 2.837f)
                curveToRelative(0.3f, 1.052f, 0.825f, 2.169f, 1.599f, 3.112f)
                curveToRelative(0.777f, 0.946f, 1.813f, 1.728f, 3.129f, 2.078f)
                quadToRelative(0.47f, 0.125f, 0.978f, 0.172f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.669f, 0.522f)
                curveToRelative(-1.31f, 1.144f, -2.307f, 2.832f, -2.31f, 5.37f)
                verticalLineToRelative(0.518f)
                lineTo(6.556f, 20.0f)
                curveToRelative(1.162f, -0.04f, 2.086f, -0.084f, 2.821f, -0.204f)
                curveToRelative(0.74f, -0.122f, 1.343f, -0.329f, 1.83f, -0.735f)
                curveToRelative(0.485f, -0.406f, 0.799f, -0.965f, 1.055f, -1.678f)
                quadToRelative(0.123f, -0.344f, 0.238f, -0.754f)
                quadToRelative(0.114f, 0.41f, 0.238f, 0.754f)
                curveToRelative(0.256f, 0.713f, 0.57f, 1.272f, 1.056f, 1.678f)
                reflectiveCurveToRelative(1.088f, 0.613f, 1.829f, 0.735f)
                curveToRelative(0.735f, 0.12f, 1.66f, 0.163f, 2.821f, 0.204f)
                lineToRelative(0.518f, 0.018f)
                verticalLineToRelative(-0.519f)
                curveToRelative(-0.003f, -2.537f, -1.0f, -4.225f, -2.31f, -5.37f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.67f, -0.521f)
                quadToRelative(0.51f, -0.046f, 0.98f, -0.172f)
                curveToRelative(1.315f, -0.35f, 2.351f, -1.132f, 3.128f, -2.078f)
                curveToRelative(0.774f, -0.943f, 1.299f, -2.06f, 1.599f, -3.112f)
                curveToRelative(0.298f, -1.045f, 0.387f, -2.07f, 0.245f, -2.837f)
                lineToRelative(-0.072f, -0.392f)
                lineToRelative(-0.4f, -0.017f)
                curveToRelative(-3.208f, -0.13f, -5.323f, 0.725f, -6.767f, 1.877f)
                curveToRelative(-0.47f, 0.376f, -0.866f, 0.78f, -1.2f, 1.183f)
                lineToRelative(0.487f, -2.454f)
                curveToRelative(0.164f, -0.696f, 0.473f, -1.063f, 0.9f, -1.281f)
                curveToRelative(0.469f, -0.24f, 1.14f, -0.333f, 2.085f, -0.325f)
                lineToRelative(0.009f, -1.0f)
                curveToRelative(-0.977f, -0.009f, -1.854f, 0.08f, -2.549f, 0.434f)
                curveToRelative(-0.733f, 0.375f, -1.201f, 1.015f, -1.42f, 1.952f)
                lineToRelative(-0.002f, 0.009f)
                lineToRelative(-0.002f, 0.008f)
                lineToRelative(-0.503f, 2.532f)
                lineToRelative(-0.503f, -2.532f)
                lineToRelative(-0.002f, -0.008f)
                lineToRelative(-0.002f, -0.009f)
                curveToRelative(-0.219f, -0.937f, -0.687f, -1.577f, -1.42f, -1.952f)
                curveTo(9.878f, 3.08f, 9.0f, 2.991f, 8.024f, 3.0f)
                close()
                moveTo(13.0f, 10.632f)
                verticalLineToRelative(1.515f)
                quadToRelative(0.203f, 0.073f, 0.419f, 0.154f)
                curveToRelative(1.29f, 0.406f, 2.379f, 0.41f, 3.285f, 0.168f)
                curveToRelative(1.075f, -0.285f, 1.942f, -0.927f, 2.613f, -1.745f)
                curveToRelative(0.673f, -0.82f, 1.141f, -1.808f, 1.41f, -2.752f)
                curveToRelative(0.214f, -0.75f, 0.295f, -1.445f, 0.268f, -1.984f)
                curveToRelative(-2.748f, -0.032f, -4.5f, 0.732f, -5.676f, 1.67f)
                curveToRelative(-1.169f, 0.933f, -1.805f, 2.062f, -2.284f, 2.912f)
                close()
                moveTo(13.0f, 13.217f)
                verticalLineToRelative(1.228f)
                curveToRelative(0.253f, 1.137f, 0.453f, 1.97f, 0.679f, 2.6f)
                curveToRelative(0.228f, 0.633f, 0.464f, 1.004f, 0.756f, 1.249f)
                curveToRelative(0.292f, 0.244f, 0.695f, 0.408f, 1.35f, 0.515f)
                curveToRelative(0.556f, 0.09f, 1.253f, 0.136f, 2.16f, 0.172f)
                curveToRelative(-0.125f, -1.937f, -0.933f, -3.21f, -1.951f, -4.098f)
                curveToRelative(-0.89f, -0.776f, -1.95f, -1.271f, -2.91f, -1.639f)
                close()
                moveTo(12.0f, 12.147f)
                verticalLineToRelative(-1.515f)
                lineToRelative(-0.035f, -0.062f)
                curveToRelative(-0.479f, -0.85f, -1.115f, -1.98f, -2.284f, -2.911f)
                curveToRelative(-1.176f, -0.939f, -2.928f, -1.703f, -5.676f, -1.67f)
                curveToRelative(-0.027f, 0.538f, 0.054f, 1.233f, 0.268f, 1.983f)
                curveToRelative(0.269f, 0.944f, 0.737f, 1.932f, 1.41f, 2.752f)
                curveToRelative(0.671f, 0.818f, 1.538f, 1.46f, 2.613f, 1.745f)
                curveToRelative(0.906f, 0.242f, 1.994f, 0.238f, 3.285f, -0.168f)
                quadToRelative(0.216f, -0.082f, 0.419f, -0.154f)
                moveToRelative(-2.994f, 2.736f)
                curveToRelative(0.89f, -0.776f, 1.95f, -1.271f, 2.91f, -1.639f)
                lineToRelative(0.084f, -0.027f)
                verticalLineToRelative(1.228f)
                curveToRelative(-0.253f, 1.137f, -0.453f, 1.97f, -0.679f, 2.6f)
                curveToRelative(-0.228f, 0.633f, -0.464f, 1.004f, -0.756f, 1.249f)
                curveToRelative(-0.292f, 0.244f, -0.695f, 0.408f, -1.35f, 0.515f)
                curveToRelative(-0.556f, 0.09f, -1.253f, 0.136f, -2.16f, 0.172f)
                curveToRelative(0.125f, -1.937f, 0.933f, -3.21f, 1.951f, -4.098f)
            }
        }
            .build()
        return _butterflySmall!!
    }

private var _butterflySmall: ImageVector? = null
