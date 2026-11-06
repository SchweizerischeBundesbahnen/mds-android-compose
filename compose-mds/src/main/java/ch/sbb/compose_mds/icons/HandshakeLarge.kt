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

public val SBBIcons.HandshakeLarge: ImageVector
    get() {
        if (_handshakeLarge != null) {
            return _handshakeLarge!!
        }
        _handshakeLarge = Builder(name = "HandshakeLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.74f, 11.561f)
                lineTo(4.0f, 11.158f)
                verticalLineToRelative(15.651f)
                lineToRelative(0.276f, 0.138f)
                lineToRelative(3.997f, 1.999f)
                lineToRelative(14.474f, 7.486f)
                curveToRelative(0.32f, 0.206f, 0.834f, 0.413f, 1.409f, 0.393f)
                curveToRelative(0.62f, -0.023f, 1.27f, -0.312f, 1.76f, -1.048f)
                curveToRelative(0.365f, -0.547f, 0.468f, -1.081f, 0.407f, -1.559f)
                lineToRelative(0.813f, 0.44f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, false, 3.19f, -0.951f)
                curveToRelative(0.24f, -0.446f, 0.322f, -0.939f, 0.264f, -1.41f)
                lineToRelative(1.147f, 0.62f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, false, 3.19f, -0.952f)
                curveToRelative(0.238f, -0.44f, 0.317f, -0.92f, 0.261f, -1.378f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, false, 3.335f, -1.756f)
                lineToRelative(4.22f, -2.343f)
                lineToRelative(0.257f, -0.143f)
                lineTo(43.0f, 11.5f)
                lineToRelative(-0.742f, 0.413f)
                lineToRelative(-5.214f, 2.895f)
                lineToRelative(-7.79f, -2.433f)
                lineToRelative(-0.003f, -0.001f)
                curveToRelative(-1.911f, -0.617f, -3.718f, 0.004f, -5.458f, 1.22f)
                curveToRelative(-2.558f, -2.113f, -5.661f, -1.937f, -6.93f, -1.575f)
                lineToRelative(-0.016f, 0.005f)
                lineToRelative(-0.015f, 0.005f)
                lineToRelative(-6.79f, 2.425f)
                close()
                moveTo(22.969f, 14.215f)
                curveToRelative(-2.185f, -1.676f, -4.78f, -1.53f, -5.817f, -1.239f)
                lineToRelative(-6.984f, 2.495f)
                lineToRelative(-0.21f, 0.075f)
                lineToRelative(-0.197f, -0.107f)
                lineTo(5.0f, 12.842f)
                verticalLineToRelative(13.349f)
                lineToRelative(3.724f, 1.862f)
                lineToRelative(0.006f, 0.003f)
                lineToRelative(14.5f, 7.5f)
                lineToRelative(0.024f, 0.013f)
                lineToRelative(0.023f, 0.015f)
                curveToRelative(0.184f, 0.122f, 0.507f, 0.253f, 0.842f, 0.241f)
                curveToRelative(0.304f, -0.01f, 0.655f, -0.138f, 0.965f, -0.602f)
                curveToRelative(0.31f, -0.465f, 0.292f, -0.838f, 0.185f, -1.122f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.546f, -0.685f)
                lineToRelative(0.03f, -0.045f)
                lineToRelative(-3.115f, -1.683f)
                lineToRelative(0.476f, -0.88f)
                lineToRelative(5.498f, 2.97f)
                arcToRelative(1.36f, 1.36f, 0.0f, false, false, 1.834f, -0.547f)
                arcToRelative(1.375f, 1.375f, 0.0f, false, false, -0.545f, -1.847f)
                lineToRelative(-4.477f, -2.42f)
                lineToRelative(0.475f, -0.88f)
                lineToRelative(4.478f, 2.42f)
                lineToRelative(2.836f, 1.533f)
                curveToRelative(0.654f, 0.353f, 1.48f, 0.107f, 1.834f, -0.547f)
                curveToRelative(0.344f, -0.636f, 0.106f, -1.438f, -0.534f, -1.804f)
                lineToRelative(-6.182f, -3.34f)
                lineToRelative(0.475f, -0.88f)
                lineToRelative(6.153f, 3.324f)
                lineToRelative(0.039f, 0.021f)
                lineToRelative(1.557f, 0.841f)
                curveToRelative(0.654f, 0.354f, 1.48f, 0.108f, 1.834f, -0.546f)
                arcToRelative(1.36f, 1.36f, 0.0f, false, false, -0.546f, -1.835f)
                lineToRelative(0.366f, -0.938f)
                lineToRelative(0.109f, 0.059f)
                curveToRelative(0.552f, 0.298f, 0.937f, 0.788f, 1.117f, 1.344f)
                lineTo(42.0f, 25.756f)
                lineTo(42.0f, 14.062f)
                lineToRelative(1.0f, -2.561f)
                lineToRelative(-1.0f, 2.56f)
                lineTo(42.0f, 13.2f)
                lineToRelative(-4.658f, 2.587f)
                lineToRelative(-0.187f, 0.103f)
                lineToRelative(-0.205f, -0.063f)
                lineToRelative(-8.0f, -2.5f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(-1.734f, -0.562f, -3.46f, 0.132f, -5.393f, 1.703f)
                curveToRelative(-1.58f, 1.283f, -3.2f, 3.072f, -4.97f, 5.024f)
                quadToRelative(-0.59f, 0.653f, -1.205f, 1.326f)
                curveToRelative(-0.768f, 0.923f, -0.64f, 1.854f, -0.153f, 2.436f)
                curveToRelative(0.5f, 0.596f, 1.436f, 0.896f, 2.453f, 0.387f)
                horizontalLineToRelative(0.002f)
                lineToRelative(6.862f, -3.394f)
                lineToRelative(0.232f, -0.114f)
                lineToRelative(0.227f, 0.122f)
                lineToRelative(10.209f, 5.515f)
                lineToRelative(-0.367f, 0.94f)
                lineToRelative(-10.09f, -5.452f)
                lineToRelative(-6.628f, 3.278f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-1.424f, 0.712f, -2.863f, 0.317f, -3.665f, -0.64f)
                curveToRelative(-0.813f, -0.969f, -0.916f, -2.445f, 0.159f, -3.728f)
                lineToRelative(0.007f, -0.01f)
                lineToRelative(0.008f, -0.008f)
                quadToRelative(0.6f, -0.656f, 1.187f, -1.305f)
                curveToRelative(1.772f, -1.956f, 3.458f, -3.817f, 5.102f, -5.153f)
                close()
                moveTo(37.209f, 26.333f)
                lineTo(42.0f, 14.061f)
                close()
            }
        }
        .build()
        return _handshakeLarge!!
    }

private var _handshakeLarge: ImageVector? = null
