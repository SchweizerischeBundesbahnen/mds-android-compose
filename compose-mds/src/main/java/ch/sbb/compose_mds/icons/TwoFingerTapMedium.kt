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

public val SBBIcons.TwoFingerTapMedium: ImageVector
    get() {
        if (_twoFingerTapMedium != null) {
            return _twoFingerTapMedium!!
        }
        _twoFingerTapMedium = Builder(
            name = "TwoFingerTapMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                moveTo(18.75f, 4.75f)
                arcToRelative(4.96f, 4.96f, 0.0f, false, false, -3.601f, 1.558f)
                curveToRelative(-2.473f, 0.299f, -4.399f, 2.382f, -4.399f, 4.942f)
                curveToRelative(0.0f, 1.015f, 0.308f, 1.954f, 0.823f, 2.74f)
                lineToRelative(0.836f, -0.55f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, true, -0.659f, -2.19f)
                curveToRelative(0.0f, -2.096f, 1.618f, -3.798f, 3.679f, -3.965f)
                lineToRelative(0.201f, -0.017f)
                lineToRelative(0.134f, -0.151f)
                arcTo(3.97f, 3.97f, 0.0f, false, true, 18.75f, 5.75f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.817f, -0.245f, 1.572f, -0.665f, 2.2f)
                lineToRelative(0.83f, 0.557f)
                arcToRelative(4.94f, 4.94f, 0.0f, false, false, 0.835f, -2.757f)
                curveToRelative(0.0f, -2.763f, -2.238f, -5.0f, -5.0f, -5.0f)
                moveToRelative(-1.002f, 5.002f)
                arcToRelative(1.001f, 1.001f, 0.0f, true, true, 2.003f, 0.0f)
                lineToRelative(-0.001f, 7.367f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.004f, 0.129f)
                horizontalLineToRelative(0.004f)
                lineTo(19.75f, 19.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.344f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, true, 2.0f, 0.09f)
                verticalLineToRelative(2.254f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.762f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, true, 2.005f, 0.013f)
                verticalLineToRelative(0.043f)
                lineToRelative(-0.001f, 0.156f)
                lineToRelative(-0.002f, 0.772f)
                curveToRelative(0.0f, 0.762f, -0.002f, 2.074f, -0.002f, 4.278f)
                curveToRelative(0.0f, 2.15f, -0.33f, 3.79f, -0.654f, 4.884f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -0.504f, 1.366f)
                lineTo(14.536f, 30.25f)
                lineToRelative(-0.075f, -0.127f)
                lineToRelative(-0.583f, -0.99f)
                lineToRelative(-1.802f, -3.056f)
                lineToRelative(-2.955f, -5.017f)
                curveToRelative(-0.214f, -0.365f, -0.317f, -0.666f, -0.327f, -0.909f)
                arcToRelative(0.77f, 0.77f, 0.0f, false, true, 0.249f, -0.608f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.417f, 0.0f)
                lineToRelative(3.435f, 3.436f)
                lineToRelative(0.146f, 0.147f)
                horizontalLineToRelative(0.709f)
                lineTo(14.75f, 18.75f)
                lineToRelative(-0.003f, -7.499f)
                arcToRelative(1.003f, 1.003f, 0.0f, false, true, 2.001f, -0.084f)
                lineToRelative(0.001f, 7.582f)
                horizontalLineToRelative(0.001f)
                verticalLineToRelative(0.761f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.002f, -8.259f)
                quadToRelative(0.0f, -0.06f, -0.004f, -0.119f)
                close()
                moveTo(20.751f, 9.752f)
                lineTo(20.75f, 15.512f)
                arcToRelative(2.002f, 2.002f, 0.0f, false, true, 2.988f, 1.514f)
                arcToRelative(2.001f, 2.001f, 0.0f, false, true, 3.017f, 1.726f)
                verticalLineToRelative(0.047f)
                lineToRelative(-0.001f, 0.155f)
                lineToRelative(-0.002f, 0.77f)
                curveToRelative(0.0f, 0.761f, -0.002f, 2.073f, -0.002f, 4.277f)
                curveToRelative(0.0f, 2.254f, -0.345f, 3.99f, -0.695f, 5.17f)
                curveToRelative(-0.176f, 0.589f, -0.352f, 1.039f, -0.486f, 1.345f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.214f, 0.446f)
                lineToRelative(-0.015f, 0.026f)
                lineToRelative(-0.004f, 0.008f)
                lineToRelative(-0.002f, 0.002f)
                lineTo(25.334f, 31.0f)
                lineToRelative(-0.434f, -0.248f)
                lineToRelative(0.433f, 0.25f)
                lineToRelative(-0.144f, 0.25f)
                lineTo(13.964f, 31.252f)
                lineToRelative(-0.145f, -0.246f)
                lineToRelative(0.431f, -0.254f)
                lineToRelative(-0.43f, 0.254f)
                lineToRelative(-0.002f, -0.002f)
                lineToRelative(-0.002f, -0.005f)
                lineToRelative(-0.011f, -0.018f)
                lineToRelative(-0.043f, -0.073f)
                lineToRelative(-0.162f, -0.275f)
                lineToRelative(-0.584f, -0.99f)
                lineToRelative(-1.801f, -3.056f)
                lineToRelative(-2.957f, -5.019f)
                curveToRelative(-0.254f, -0.433f, -0.444f, -0.9f, -0.463f, -1.373f)
                curveToRelative(-0.021f, -0.498f, 0.149f, -0.965f, 0.541f, -1.357f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.831f, 0.0f)
                lineToRelative(2.583f, 2.584f)
                verticalLineToRelative(-2.67f)
                lineToRelative(-0.003f, -7.499f)
                arcToRelative(2.002f, 2.002f, 0.0f, false, true, 3.014f, -1.728f)
                arcToRelative(2.001f, 2.001f, 0.0f, false, true, 3.99f, 0.228f)
            }
        }
            .build()
        return _twoFingerTapMedium!!
    }

private var _twoFingerTapMedium: ImageVector? = null
