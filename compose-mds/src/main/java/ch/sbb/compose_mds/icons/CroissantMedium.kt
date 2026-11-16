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

public val SBBIcons.CroissantMedium: ImageVector
    get() {
        if (_croissantMedium != null) {
            return _croissantMedium!!
        }
        _croissantMedium = Builder(name = "CroissantMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.6f, 3.328f)
                curveToRelative(0.93f, -0.3f, 1.876f, 0.292f, 2.113f, 1.193f)
                lineToRelative(0.002f, 0.006f)
                curveToRelative(0.18f, -0.132f, 0.394f, -0.225f, 0.635f, -0.265f)
                arcToRelative(15.2f, 15.2f, 0.0f, false, true, 6.513f, 0.34f)
                curveToRelative(0.657f, 0.18f, 1.073f, 0.762f, 1.124f, 1.39f)
                curveToRelative(2.17f, 0.46f, 3.969f, 1.534f, 5.16f, 2.733f)
                curveToRelative(0.636f, 0.64f, 1.114f, 1.332f, 1.377f, 2.003f)
                curveToRelative(0.26f, 0.666f, 0.326f, 1.37f, 0.04f, 1.974f)
                curveToRelative(-0.288f, 0.61f, -0.85f, 1.027f, -1.497f, 1.299f)
                curveToRelative(-0.65f, 0.274f, -1.435f, 0.425f, -2.261f, 0.477f)
                arcToRelative(12.8f, 12.8f, 0.0f, false, true, -4.577f, -0.58f)
                curveToRelative(-0.18f, 0.444f, -0.555f, 0.768f, -0.997f, 0.91f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, false, -1.653f, 0.709f)
                arcToRelative(1.55f, 1.55f, 0.0f, false, true, -0.922f, 0.186f)
                lineToRelative(0.027f, 0.102f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -0.576f, 1.74f)
                arcToRelative(18.3f, 18.3f, 0.0f, false, false, -2.522f, 2.55f)
                curveToRelative(-0.41f, 0.503f, -1.07f, 0.746f, -1.719f, 0.58f)
                lineToRelative(-0.825f, -0.212f)
                curveToRelative(0.036f, 0.306f, -0.016f, 0.629f, -0.175f, 0.928f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, -0.69f, 1.67f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, true, -0.982f, 1.046f)
                arcToRelative(13.2f, 13.2f, 0.0f, false, true, 0.643f, 4.614f)
                curveToRelative(-0.04f, 0.838f, -0.176f, 1.636f, -0.438f, 2.298f)
                curveToRelative(-0.26f, 0.657f, -0.665f, 1.233f, -1.273f, 1.533f)
                curveToRelative(-0.603f, 0.298f, -1.31f, 0.232f, -1.976f, -0.028f)
                curveToRelative(-0.673f, -0.263f, -1.366f, -0.744f, -2.01f, -1.384f)
                curveToRelative(-1.212f, -1.206f, -2.303f, -3.03f, -2.777f, -5.23f)
                arcToRelative(1.55f, 1.55f, 0.0f, false, true, -1.316f, -1.108f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, true, -0.402f, -6.547f)
                curveToRelative(0.044f, -0.287f, 0.164f, -0.537f, 0.334f, -0.74f)
                curveToRelative(-0.578f, -0.403f, -0.886f, -1.147f, -0.652f, -1.875f)
                curveTo(5.204f, 9.806f, 9.791f, 5.204f, 15.6f, 3.328f)
                moveToRelative(8.872f, 9.597f)
                curveToRelative(1.323f, 0.438f, 2.9f, 0.643f, 4.27f, 0.555f)
                curveToRelative(0.754f, -0.048f, 1.421f, -0.183f, 1.937f, -0.4f)
                curveToRelative(0.518f, -0.218f, 0.836f, -0.498f, 0.981f, -0.805f)
                curveToRelative(0.126f, -0.266f, 0.134f, -0.664f, -0.068f, -1.183f)
                curveToRelative(-0.2f, -0.514f, -0.589f, -1.093f, -1.153f, -1.661f)
                curveToRelative(-1.047f, -1.054f, -2.651f, -2.022f, -4.603f, -2.448f)
                close()
                moveTo(13.877f, 19.132f)
                lineTo(13.907f, 19.14f)
                lineTo(16.115f, 19.706f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, false, 0.697f, -0.243f)
                arcToRelative(19.3f, 19.3f, 0.0f, false, true, 2.66f, -2.69f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.245f, -0.713f)
                lineToRelative(-0.39f, -1.483f)
                lineToRelative(-0.01f, -0.034f)
                lineToRelative(-2.19f, -8.324f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.008f, -0.032f)
                lineToRelative(-0.372f, -1.412f)
                curveToRelative(-0.104f, -0.393f, -0.502f, -0.604f, -0.839f, -0.496f)
                curveToRelative(-5.5f, 1.777f, -9.85f, 6.138f, -11.627f, 11.667f)
                curveToRelative(-0.112f, 0.35f, 0.108f, 0.753f, 0.497f, 0.853f)
                close()
                moveTo(13.984f, 20.922f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, -0.32f, -0.812f)
                lineToRelative(-8.328f, -2.136f)
                curveToRelative(-0.334f, -0.085f, -0.655f, 0.134f, -0.701f, 0.433f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, false, 0.376f, 6.124f)
                curveToRelative(0.075f, 0.27f, 0.375f, 0.45f, 0.68f, 0.375f)
                lineToRelative(7.125f, -1.728f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, 0.406f, -0.409f)
                quadToRelative(0.297f, -0.97f, 0.762f, -1.847f)
                moveToRelative(-7.627f, 4.852f)
                lineToRelative(5.866f, -1.424f)
                curveToRelative(0.455f, 1.33f, 0.683f, 2.93f, 0.617f, 4.324f)
                curveToRelative(-0.036f, 0.768f, -0.161f, 1.45f, -0.37f, 1.977f)
                curveToRelative(-0.21f, 0.531f, -0.484f, 0.855f, -0.785f, 1.003f)
                curveToRelative(-0.26f, 0.129f, -0.652f, 0.14f, -1.17f, -0.062f)
                curveToRelative(-0.514f, -0.2f, -1.095f, -0.59f, -1.669f, -1.161f)
                curveToRelative(-1.064f, -1.059f, -2.047f, -2.683f, -2.49f, -4.657f)
                moveToRelative(13.928f, -11.485f)
                curveToRelative(0.095f, 0.36f, 0.49f, 0.528f, 0.811f, 0.352f)
                curveToRelative(0.577f, -0.318f, 1.19f, -0.581f, 1.83f, -0.787f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, 0.402f, -0.413f)
                lineToRelative(1.65f, -7.186f)
                curveToRelative(0.072f, -0.316f, -0.116f, -0.615f, -0.38f, -0.688f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, false, -6.084f, -0.319f)
                curveToRelative(-0.284f, 0.047f, -0.503f, 0.36f, -0.426f, 0.696f)
                close()
            }
        }
        .build()
        return _croissantMedium!!
    }

private var _croissantMedium: ImageVector? = null
