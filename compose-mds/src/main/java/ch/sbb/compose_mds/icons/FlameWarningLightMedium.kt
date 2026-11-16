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

public val SBBIcons.FlameWarningLightMedium: ImageVector
    get() {
        if (_flameWarningLightMedium != null) {
            return _flameWarningLightMedium!!
        }
        _flameWarningLightMedium = Builder(name = "FlameWarningLightMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.75f, 23.298f)
                curveToRelative(0.0f, -3.557f, 1.961f, -6.674f, 3.053f, -8.115f)
                curveToRelative(1.515f, -2.003f, 2.435f, -3.608f, 2.978f, -5.141f)
                curveToRelative(0.542f, -1.528f, 0.721f, -3.013f, 0.721f, -4.792f)
                lineTo(11.502f, 3.943f)
                lineToRelative(0.872f, 0.973f)
                curveToRelative(1.438f, 1.605f, 2.633f, 2.868f, 3.683f, 3.977f)
                lineToRelative(0.626f, 0.663f)
                curveToRelative(1.196f, 1.269f, 2.215f, 2.375f, 3.21f, 3.634f)
                lineToRelative(-0.786f, 0.62f)
                curveToRelative(-0.965f, -1.223f, -1.958f, -2.303f, -3.152f, -3.569f)
                lineToRelative(-0.538f, -0.57f)
                arcToRelative(227.0f, 227.0f, 0.0f, false, true, -2.95f, -3.164f)
                curveToRelative(-0.075f, 1.346f, -0.29f, 2.59f, -0.743f, 3.869f)
                curveToRelative(-0.59f, 1.664f, -1.572f, 3.36f, -3.123f, 5.41f)
                curveToRelative(-1.053f, 1.391f, -2.851f, 4.289f, -2.851f, 7.512f)
                curveToRelative(0.0f, 2.969f, 1.674f, 5.455f, 3.929f, 7.098f)
                curveToRelative(-0.507f, -0.788f, -0.889f, -1.701f, -0.889f, -2.666f)
                curveToRelative(0.0f, -1.375f, 0.392f, -2.43f, 1.207f, -3.574f)
                curveToRelative(0.38f, -0.534f, 0.75f, -0.983f, 1.082f, -1.389f)
                lineToRelative(0.124f, -0.152f)
                curveToRelative(0.368f, -0.45f, 0.683f, -0.846f, 0.945f, -1.28f)
                curveToRelative(0.508f, -0.842f, 0.85f, -1.868f, 0.85f, -3.71f)
                verticalLineToRelative(-1.368f)
                lineToRelative(0.881f, 1.046f)
                curveToRelative(1.77f, 2.097f, 2.902f, 3.49f, 3.926f, 4.903f)
                lineToRelative(-0.81f, 0.588f)
                curveToRelative(-0.837f, -1.155f, -1.752f, -2.3f, -3.061f, -3.868f)
                curveToRelative(-0.13f, 1.256f, -0.458f, 2.145f, -0.93f, 2.927f)
                curveToRelative(-0.303f, 0.5f, -0.658f, 0.945f, -1.026f, 1.395f)
                lineToRelative(-0.129f, 0.157f)
                curveToRelative(-0.333f, 0.406f, -0.679f, 0.828f, -1.037f, 1.331f)
                curveToRelative(-0.714f, 1.003f, -1.022f, 1.858f, -1.022f, 2.994f)
                curveToRelative(0.0f, 0.752f, 0.32f, 1.526f, 0.819f, 2.261f)
                curveToRelative(0.495f, 0.73f, 1.138f, 1.384f, 1.716f, 1.88f)
                lineTo(12.0f, 32.25f)
                lineToRelative(-0.187f, 0.465f)
                curveTo(8.179f, 31.25f, 4.75f, 27.84f, 4.75f, 23.298f)
                moveTo(24.5f, 18.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(21.06f, 18.502f)
                lineTo(20.19f, 18.998f)
                lineTo(18.69f, 16.373f)
                lineTo(19.56f, 15.877f)
                close()
                moveTo(31.39f, 32.75f)
                lineToRelative(-1.0f, -4.0f)
                horizontalLineToRelative(-2.14f)
                lineTo(28.25f, 24.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -8.5f, 0.0f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(-2.14f)
                lineToRelative(-1.0f, 4.0f)
                close()
                moveTo(27.25f, 24.0f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(-6.5f)
                lineTo(20.75f, 24.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 6.5f, 0.0f)
                moveToRelative(2.86f, 7.75f)
                lineTo(17.89f, 31.75f)
                lineToRelative(0.5f, -2.0f)
                horizontalLineToRelative(11.22f)
                close()
                moveTo(27.81f, 18.998f)
                lineTo(29.31f, 16.373f)
                lineTo(28.44f, 15.877f)
                lineTo(26.94f, 18.502f)
                close()
            }
        }
        .build()
        return _flameWarningLightMedium!!
    }

private var _flameWarningLightMedium: ImageVector? = null
