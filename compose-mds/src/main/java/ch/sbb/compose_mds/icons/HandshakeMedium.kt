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

public val SBBIcons.HandshakeMedium: ImageVector
    get() {
        if (_handshakeMedium != null) {
            return _handshakeMedium!!
        }
        _handshakeMedium = Builder(name = "HandshakeMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(32.75f, 9.425f)
                verticalLineToRelative(11.419f)
                lineToRelative(-0.258f, 0.143f)
                lineToRelative(-12.148f, 6.75f)
                lineToRelative(-0.01f, 0.006f)
                lineToRelative(-0.232f, -0.441f)
                lineToRelative(0.231f, 0.44f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.002f, 0.001f)
                lineToRelative(-0.004f, 0.002f)
                lineToRelative(-0.012f, 0.006f)
                lineToRelative(-0.039f, 0.019f)
                lineToRelative(-0.134f, 0.06f)
                curveToRelative(-0.114f, 0.048f, -0.276f, 0.11f, -0.48f, 0.172f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, -3.324f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.652f, -0.251f)
                lineToRelative(-0.012f, -0.006f)
                lineToRelative(-0.004f, -0.002f)
                horizontalLineToRelative(-0.002f)
                verticalLineToRelative(-0.001f)
                lineToRelative(0.232f, -0.443f)
                lineToRelative(-0.233f, 0.443f)
                lineToRelative(-0.01f, -0.006f)
                lineToRelative(-12.15f, -6.75f)
                lineToRelative(-0.257f, -0.143f)
                lineTo(3.25f, 9.425f)
                lineToRelative(0.742f, 0.413f)
                lineToRelative(3.864f, 2.145f)
                lineToRelative(5.647f, -1.776f)
                lineToRelative(0.014f, -0.004f)
                lineToRelative(0.014f, -0.004f)
                curveToRelative(1.71f, -0.426f, 3.227f, -0.054f, 4.545f, 0.957f)
                curveToRelative(1.343f, -0.956f, 2.762f, -1.471f, 4.275f, -0.983f)
                lineToRelative(0.002f, 0.001f)
                lineToRelative(5.791f, 1.81f)
                lineToRelative(3.863f, -2.146f)
                close()
                moveTo(17.258f, 11.796f)
                curveToRelative(-1.037f, -0.72f, -2.177f, -0.95f, -3.47f, -0.63f)
                lineTo(7.95f, 13.002f)
                lineToRelative(-0.205f, 0.064f)
                lineToRelative(-0.188f, -0.104f)
                lineToRelative(-3.308f, -1.838f)
                verticalLineToRelative(9.132f)
                lineToRelative(11.884f, 6.602f)
                lineToRelative(0.02f, 0.01f)
                quadToRelative(0.029f, 0.014f, 0.094f, 0.042f)
                curveToRelative(0.085f, 0.036f, 0.215f, 0.086f, 0.381f, 0.137f)
                arcToRelative(4.74f, 4.74f, 0.0f, false, false, 2.742f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.476f, -0.18f)
                lineToRelative(0.02f, -0.009f)
                lineToRelative(7.753f, -4.308f)
                lineToRelative(-5.602f, -5.815f)
                lineToRelative(-6.493f, 3.212f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-1.119f, 0.56f, -2.261f, 0.253f, -2.9f, -0.51f)
                curveToRelative(-0.651f, -0.775f, -0.725f, -1.95f, 0.117f, -2.958f)
                lineToRelative(0.007f, -0.009f)
                lineToRelative(0.008f, -0.008f)
                quadToRelative(0.453f, -0.494f, 0.896f, -0.985f)
                curveToRelative(1.245f, -1.373f, 2.44f, -2.691f, 3.606f, -3.68f)
                moveToRelative(11.266f, 10.252f)
                lineToRelative(3.226f, -1.792f)
                verticalLineToRelative(-9.131f)
                lineToRelative(-3.308f, 1.837f)
                lineToRelative(-0.187f, 0.104f)
                lineToRelative(-0.205f, -0.064f)
                lineToRelative(-6.0f, -1.875f)
                lineToRelative(-0.004f, -0.002f)
                curveToRelative(-1.239f, -0.4f, -2.488f, 0.087f, -3.928f, 1.257f)
                curveToRelative(-1.174f, 0.954f, -2.378f, 2.283f, -3.702f, 3.742f)
                quadToRelative(-0.448f, 0.495f, -0.915f, 1.005f)
                curveToRelative(-0.536f, 0.648f, -0.437f, 1.278f, -0.112f, 1.666f)
                curveToRelative(0.337f, 0.402f, 0.976f, 0.615f, 1.688f, 0.258f)
                lineToRelative(0.002f, -0.001f)
                lineToRelative(6.824f, -3.375f)
                lineToRelative(0.328f, -0.163f)
                lineToRelative(0.254f, 0.264f)
                close()
            }
        }
        .build()
        return _handshakeMedium!!
    }

private var _handshakeMedium: ImageVector? = null
