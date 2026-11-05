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

public val SBBIcons.TelephoneReceiverMedium: ImageVector
    get() {
        if (_telephoneReceiverMedium != null) {
            return _telephoneReceiverMedium!!
        }
        _telephoneReceiverMedium = Builder(
            name = "TelephoneReceiverMedium",
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
                moveTo(11.794f, 4.261f)
                curveToRelative(1.074f, -0.621f, 2.42f, -0.082f, 3.042f, 0.993f)
                lineToRelative(2.636f, 4.563f)
                curveToRelative(0.622f, 1.077f, 0.411f, 2.512f, -0.663f, 3.131f)
                lineToRelative(-2.961f, 1.711f)
                lineToRelative(-0.002f, 0.001f)
                curveToRelative(-0.05f, 0.03f, -0.131f, 0.145f, -0.067f, 0.323f)
                arcToRelative(28.7f, 28.7f, 0.0f, false, false, 2.157f, 4.629f)
                moveTo(11.794f, 4.261f)
                lineTo(9.23f, 5.735f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.173f, 0.101f, -0.297f, 0.229f, -0.387f, 0.332f)
                curveToRelative(-1.565f, 1.399f, -2.066f, 3.945f, -1.754f, 6.852f)
                curveToRelative(0.317f, 2.955f, 1.485f, 6.423f, 3.443f, 9.815f)
                curveToRelative(1.958f, 3.39f, 4.377f, 6.136f, 6.777f, 7.887f)
                curveToRelative(2.362f, 1.724f, 4.82f, 2.564f, 6.813f, 1.907f)
                curveToRelative(0.147f, -0.03f, 0.318f, -0.08f, 0.487f, -0.18f)
                lineToRelative(2.55f, -1.472f)
                lineToRelative(0.004f, -0.002f)
                curveToRelative(1.051f, -0.617f, 1.283f, -2.047f, 0.658f, -3.13f)
                lineToRelative(-2.634f, -4.563f)
                curveToRelative(-0.622f, -1.079f, -1.97f, -1.612f, -3.042f, -0.993f)
                lineToRelative(-2.961f, 1.708f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-0.054f, 0.032f, -0.192f, 0.044f, -0.316f, -0.102f)
                arcToRelative(28.7f, 28.7f, 0.0f, false, true, -2.93f, -4.182f)
                moveTo(13.97f, 5.754f)
                curveToRelative(-0.413f, -0.715f, -1.19f, -0.908f, -1.676f, -0.627f)
                horizontalLineToRelative(-0.001f)
                lineTo(9.731f, 6.602f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.154f, 0.144f)
                lineToRelative(-0.022f, 0.027f)
                lineToRelative(-0.027f, 0.023f)
                curveToRelative(-1.21f, 1.064f, -1.749f, 3.194f, -1.446f, 6.018f)
                curveToRelative(0.3f, 2.791f, 1.413f, 6.126f, 3.315f, 9.421f)
                curveToRelative(1.901f, 3.293f, 4.233f, 5.925f, 6.5f, 7.58f)
                curveToRelative(2.294f, 1.674f, 4.408f, 2.272f, 5.936f, 1.756f)
                lineToRelative(0.032f, -0.011f)
                lineToRelative(0.034f, -0.007f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.202f, -0.066f)
                lineToRelative(0.005f, -0.003f)
                lineToRelative(2.55f, -1.471f)
                curveToRelative(0.481f, -0.284f, 0.708f, -1.059f, 0.298f, -1.768f)
                lineTo(24.32f, 23.68f)
                curveToRelative(-0.413f, -0.716f, -1.19f, -0.908f, -1.676f, -0.627f)
                lineToRelative(-2.96f, 1.708f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-0.54f, 0.313f, -1.197f, 0.13f, -1.58f, -0.32f)
                verticalLineToRelative(-0.001f)
                arcToRelative(29.7f, 29.7f, 0.0f, false, true, -3.033f, -4.329f)
                arcToRelative(29.7f, 29.7f, 0.0f, false, true, -2.232f, -4.79f)
                moveToRelative(1.132f, -9.568f)
                lineToRelative(2.636f, 4.563f)
                curveToRelative(0.412f, 0.714f, 0.191f, 1.484f, -0.297f, 1.765f)
                lineToRelative(-2.96f, 1.71f)
                verticalLineToRelative(0.001f)
                curveToRelative(-0.54f, 0.31f, -0.711f, 0.972f, -0.511f, 1.528f)
            }
        }
            .build()
        return _telephoneReceiverMedium!!
    }

private var _telephoneReceiverMedium: ImageVector? = null
