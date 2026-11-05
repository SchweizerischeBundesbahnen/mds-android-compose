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

public val SBBIcons.HandshakeSmall: ImageVector
    get() {
        if (_handshakeSmall != null) {
            return _handshakeSmall!!
        }
        _handshakeSmall = Builder(name = "HandshakeSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 6.0f)
                verticalLineToRelative(7.994f)
                lineToRelative(-0.257f, 0.143f)
                lineToRelative(-8.1f, 4.5f)
                lineToRelative(-0.01f, 0.006f)
                lineToRelative(-0.232f, -0.443f)
                lineToRelative(0.232f, 0.443f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.002f, 0.001f)
                lineToRelative(-0.003f, 0.002f)
                lineToRelative(-0.01f, 0.004f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.124f, 0.057f)
                arcToRelative(3.996f, 3.996f, 0.0f, false, true, -2.65f, 0.12f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, -0.46f, -0.177f)
                lineToRelative(-0.01f, -0.004f)
                lineToRelative(-0.003f, -0.002f)
                horizontalLineToRelative(-0.001f)
                verticalLineToRelative(-0.001f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(0.232f, -0.443f)
                lineToRelative(-0.232f, 0.443f)
                lineToRelative(-0.011f, -0.006f)
                lineToRelative(-8.1f, -4.5f)
                lineTo(2.0f, 13.994f)
                verticalLineTo(6.0f)
                lineToRelative(0.743f, 0.413f)
                lineToRelative(2.513f, 1.395f)
                lineToRelative(3.696f, -1.162f)
                lineToRelative(0.014f, -0.005f)
                lineToRelative(0.015f, -0.003f)
                curveToRelative(1.15f, -0.287f, 2.18f, -0.053f, 3.073f, 0.594f)
                curveToRelative(0.889f, -0.608f, 1.856f, -0.945f, 2.897f, -0.609f)
                lineToRelative(0.003f, 0.001f)
                lineToRelative(3.79f, 1.185f)
                lineToRelative(2.513f, -1.396f)
                close()
                moveTo(11.229f, 7.884f)
                curveToRelative(-0.604f, -0.36f, -1.257f, -0.46f, -1.992f, -0.28f)
                lineTo(5.35f, 8.828f)
                lineToRelative(-0.205f, 0.064f)
                lineToRelative(-0.188f, -0.104f)
                lineTo(3.0f, 7.699f)
                verticalLineToRelative(5.707f)
                lineToRelative(7.833f, 4.352f)
                lineToRelative(0.008f, 0.003f)
                lineToRelative(0.056f, 0.025f)
                arcToRelative(2.995f, 2.995f, 0.0f, false, false, 1.969f, 0.085f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.294f, -0.11f)
                lineToRelative(0.007f, -0.003f)
                lineToRelative(4.976f, -2.765f)
                lineToRelative(-3.5f, -3.633f)
                lineToRelative(-4.218f, 2.087f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-0.814f, 0.408f, -1.66f, 0.187f, -2.136f, -0.382f)
                curveToRelative(-0.488f, -0.58f, -0.533f, -1.454f, 0.078f, -2.186f)
                lineToRelative(0.007f, -0.009f)
                lineToRelative(0.008f, -0.008f)
                quadToRelative(0.3f, -0.326f, 0.593f, -0.652f)
                curveToRelative(0.77f, -0.85f, 1.52f, -1.677f, 2.255f, -2.326f)
                moveToRelative(7.818f, 6.607f)
                lineTo(21.0f, 13.406f)
                verticalLineTo(7.7f)
                lineToRelative(-1.957f, 1.087f)
                lineToRelative(-0.188f, 0.104f)
                lineToRelative(-0.204f, -0.064f)
                lineToRelative(-4.0f, -1.25f)
                lineToRelative(-0.005f, -0.001f)
                curveToRelative(-0.743f, -0.24f, -1.515f, 0.038f, -2.462f, 0.808f)
                curveToRelative(-0.772f, 0.627f, -1.564f, 1.5f, -2.446f, 2.473f)
                lineToRelative(-0.611f, 0.672f)
                curveToRelative(-0.305f, 0.37f, -0.236f, 0.7f, -0.073f, 0.894f)
                curveToRelative(0.174f, 0.208f, 0.516f, 0.334f, 0.923f, 0.13f)
                lineToRelative(0.002f, -0.001f)
                lineToRelative(4.55f, -2.25f)
                lineToRelative(0.327f, -0.162f)
                lineToRelative(0.254f, 0.263f)
                close()
            }
        }
        .build()
        return _handshakeSmall!!
    }

private var _handshakeSmall: ImageVector? = null
