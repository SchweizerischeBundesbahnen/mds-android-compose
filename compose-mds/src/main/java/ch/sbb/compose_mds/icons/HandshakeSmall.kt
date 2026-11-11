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

public val SBBIcons.HandshakeSmall: ImageVector
    get() {
        if (_handshakeSmall != null) {
            return _handshakeSmall!!
        }
        _handshakeSmall = Builder(name = "HandshakeSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.23f, 7.885f)
                curveToRelative(-0.604f, -0.36f, -1.258f, -0.461f, -1.993f, -0.281f)
                lineTo(5.35f, 8.826f)
                lineToRelative(-0.204f, 0.065f)
                lineToRelative(-0.188f, -0.104f)
                lineTo(3.0f, 7.7f)
                verticalLineToRelative(5.707f)
                lineToRelative(7.83f, 4.35f)
                lineToRelative(0.01f, 0.005f)
                lineToRelative(0.056f, 0.025f)
                arcToRelative(2.996f, 2.996f, 0.0f, false, false, 1.97f, 0.085f)
                curveToRelative(0.105f, -0.031f, 0.186f, -0.062f, 0.238f, -0.085f)
                quadToRelative(0.04f, -0.016f, 0.056f, -0.025f)
                lineToRelative(0.009f, -0.005f)
                lineToRelative(4.973f, -2.764f)
                lineToRelative(-3.499f, -3.631f)
                lineToRelative(-4.22f, 2.087f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-0.813f, 0.406f, -1.658f, 0.186f, -2.134f, -0.382f)
                curveToRelative(-0.487f, -0.581f, -0.533f, -1.455f, 0.078f, -2.187f)
                lineToRelative(0.016f, -0.017f)
                lineToRelative(0.813f, -0.895f)
                curveToRelative(0.693f, -0.763f, 1.37f, -1.495f, 2.034f, -2.082f)
                moveToRelative(3.277f, -0.349f)
                curveToRelative(-0.7f, -0.164f, -1.435f, 0.126f, -2.323f, 0.848f)
                curveToRelative(-0.943f, 0.767f, -1.918f, 1.902f, -3.05f, 3.137f)
                lineToRelative(-0.1f, 0.137f)
                curveToRelative(-0.194f, 0.318f, -0.123f, 0.594f, 0.02f, 0.765f)
                curveToRelative(0.175f, 0.208f, 0.516f, 0.334f, 0.922f, 0.13f)
                lineToRelative(0.003f, -0.001f)
                lineToRelative(4.55f, -2.25f)
                lineToRelative(0.327f, -0.162f)
                lineToRelative(0.254f, 0.263f)
                lineToRelative(3.937f, 4.088f)
                lineTo(21.0f, 13.406f)
                lineTo(21.0f, 7.699f)
                lineToRelative(-1.957f, 1.088f)
                lineToRelative(-0.243f, -0.438f)
                lineToRelative(0.243f, 0.438f)
                lineToRelative(-0.188f, 0.104f)
                lineToRelative(-0.205f, -0.064f)
                lineToRelative(-4.0f, -1.25f)
                lineToRelative(-0.004f, -0.002f)
                close()
                moveTo(13.422f, 18.242f)
                lineTo(13.632f, 18.644f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.004f, 0.003f)
                lineToRelative(-0.01f, 0.005f)
                lineToRelative(-0.027f, 0.013f)
                lineToRelative(-0.097f, 0.043f)
                arcToRelative(4.002f, 4.002f, 0.0f, false, true, -2.65f, 0.121f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, -0.432f, -0.164f)
                lineToRelative(-0.028f, -0.013f)
                lineToRelative(-0.01f, -0.005f)
                lineToRelative(-0.003f, -0.002f)
                lineToRelative(-0.001f, -0.001f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.01f, -0.006f)
                lineToRelative(-8.101f, -4.5f)
                lineTo(2.0f, 13.994f)
                lineTo(2.0f, 6.0f)
                lineToRelative(0.743f, 0.412f)
                lineToRelative(2.513f, 1.396f)
                lineToRelative(3.696f, -1.162f)
                lineToRelative(0.015f, -0.004f)
                lineToRelative(0.013f, -0.004f)
                curveToRelative(1.151f, -0.287f, 2.18f, -0.053f, 3.074f, 0.595f)
                curveToRelative(0.888f, -0.608f, 1.854f, -0.944f, 2.894f, -0.61f)
                lineToRelative(3.796f, 1.185f)
                lineToRelative(2.513f, -1.396f)
                lineTo(22.0f, 6.0f)
                verticalLineToRelative(7.994f)
                lineToRelative(-0.257f, 0.143f)
                lineToRelative(-8.1f, 4.5f)
                lineToRelative(-0.01f, 0.006f)
                close()
            }
        }
        .build()
        return _handshakeSmall!!
    }

private var _handshakeSmall: ImageVector? = null
