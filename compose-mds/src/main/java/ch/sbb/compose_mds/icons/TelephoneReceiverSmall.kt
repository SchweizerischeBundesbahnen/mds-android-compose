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

public val SBBIcons.TelephoneReceiverSmall: ImageVector
    get() {
        if (_telephoneReceiverSmall != null) {
            return _telephoneReceiverSmall!!
        }
        _telephoneReceiverSmall = Builder(name = "TelephoneReceiverSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.78f, 2.697f)
                curveToRelative(0.813f, -0.471f, 1.806f, -0.054f, 2.255f, 0.722f)
                lineToRelative(1.757f, 3.042f)
                curveToRelative(0.45f, 0.779f, 0.311f, 1.847f, -0.503f, 2.316f)
                lineTo(9.337f, 9.905f)
                quadToRelative(0.0f, 0.01f, 0.006f, 0.028f)
                curveToRelative(0.358f, 1.0f, 0.833f, 2.032f, 1.425f, 3.058f)
                moveTo(7.779f, 2.697f)
                lineToRelative(-1.708f, 0.982f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.293f, 0.248f)
                curveTo(4.678f, 4.916f, 4.35f, 6.681f, 4.56f, 8.631f)
                curveToRelative(0.214f, 1.997f, 1.001f, 4.33f, 2.316f, 6.609f)
                curveToRelative(1.315f, 2.276f, 2.942f, 4.125f, 4.565f, 5.31f)
                curveToRelative(1.584f, 1.156f, 3.277f, 1.755f, 4.683f, 1.297f)
                curveToRelative(0.107f, -0.023f, 0.236f, -0.061f, 0.365f, -0.137f)
                lineToRelative(1.7f, -0.981f)
                lineToRelative(0.003f, -0.002f)
                curveToRelative(0.796f, -0.468f, 0.952f, -1.53f, 0.5f, -2.314f)
                lineToRelative(-1.757f, -3.042f)
                curveToRelative(-0.45f, -0.78f, -1.443f, -1.193f, -2.256f, -0.723f)
                lineToRelative(-1.953f, 1.126f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.021f, -0.019f)
                arcToRelative(19.0f, 19.0f, 0.0f, false, true, -1.937f, -2.764f)
                moveTo(9.17f, 3.92f)
                curveToRelative(-0.24f, -0.417f, -0.664f, -0.488f, -0.89f, -0.358f)
                verticalLineToRelative(0.001f)
                lineToRelative(-1.708f, 0.982f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.06f, 0.06f)
                lineToRelative(-0.022f, 0.027f)
                lineToRelative(-0.027f, 0.023f)
                curveToRelative(-0.745f, 0.655f, -1.108f, 2.004f, -0.908f, 3.87f)
                curveToRelative(0.197f, 1.833f, 0.93f, 4.034f, 2.188f, 6.215f)
                curveToRelative(1.259f, 2.179f, 2.798f, 3.914f, 4.288f, 5.001f)
                curveToRelative(1.516f, 1.106f, 2.866f, 1.466f, 3.805f, 1.148f)
                lineToRelative(0.033f, -0.011f)
                lineToRelative(0.034f, -0.006f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.08f, -0.025f)
                lineToRelative(0.005f, -0.003f)
                lineToRelative(1.699f, -0.98f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.225f, -0.134f, 0.375f, -0.54f, 0.138f, -0.951f)
                lineToRelative(-1.756f, -3.042f)
                curveToRelative(-0.24f, -0.417f, -0.663f, -0.488f, -0.89f, -0.357f)
                lineToRelative(-1.973f, 1.138f)
                curveToRelative(-0.442f, 0.256f, -0.966f, 0.102f, -1.264f, -0.25f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -2.04f, -2.91f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -1.5f, -3.221f)
                moveToRelative(0.767f, -6.351f)
                lineToRelative(1.757f, 3.042f)
                curveToRelative(0.24f, 0.415f, 0.09f, 0.817f, -0.136f, 0.948f)
                horizontalLineToRelative(-0.001f)
                lineTo(8.816f, 9.05f)
                verticalLineToRelative(0.001f)
                curveToRelative(-0.441f, 0.254f, -0.57f, 0.786f, -0.415f, 1.22f)
            }
        }
        .build()
        return _telephoneReceiverSmall!!
    }

private var _telephoneReceiverSmall: ImageVector? = null
