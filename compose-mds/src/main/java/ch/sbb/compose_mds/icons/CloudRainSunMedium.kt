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

public val SBBIcons.CloudRainSunMedium: ImageVector
    get() {
        if (_cloudRainSunMedium != null) {
            return _cloudRainSunMedium!!
        }
        _cloudRainSunMedium = Builder(name = "CloudRainSunMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.25f, 6.0f)
                lineTo(25.25f, 3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(28.75f, 12.75f)
                curveToRelative(0.0f, -2.26f, -1.74f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.101f, 0.0f, -2.074f, 0.412f, -2.782f, 1.09f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 1.795f, 1.851f)
                curveToRelative(0.482f, 0.92f, 0.661f, 2.04f, 0.415f, 3.294f)
                arcToRelative(2.93f, 2.93f, 0.0f, false, true, 1.886f, 1.073f)
                quadToRelative(0.147f, 0.183f, 0.265f, 0.384f)
                curveToRelative(1.439f, -0.594f, 2.42f, -1.993f, 2.42f, -3.692f)
                moveToRelative(-4.0f, -5.0f)
                curveToRelative(-1.51f, 0.0f, -2.85f, 0.632f, -3.76f, 1.664f)
                curveToRelative(-1.957f, -0.607f, -4.302f, 0.02f, -5.582f, 2.305f)
                curveToRelative(-2.192f, -1.226f, -5.124f, 0.328f, -5.132f, 3.13f)
                curveToRelative(-0.745f, 0.143f, -1.343f, 0.586f, -1.76f, 1.168f)
                curveToRelative(-0.504f, 0.705f, -0.753f, 1.625f, -0.714f, 2.53f)
                curveToRelative(0.04f, 0.91f, 0.372f, 1.84f, 1.073f, 2.547f)
                curveToRelative(0.708f, 0.714f, 1.75f, 1.157f, 3.126f, 1.157f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.368f, 0.0f, 2.425f, -0.443f, 3.157f, -1.146f)
                arcToRelative(3.84f, 3.84f, 0.0f, false, false, 1.157f, -2.528f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.109f, -1.208f)
                curveToRelative(1.812f, -0.746f, 3.044f, -2.51f, 3.044f, -4.619f)
                curveToRelative(0.0f, -2.813f, -2.188f, -5.0f, -5.0f, -5.0f)
                moveToRelative(-3.883f, 2.677f)
                curveToRelative(-1.686f, -0.612f, -3.799f, -0.064f, -4.809f, 2.225f)
                lineToRelative(-0.458f, -0.202f)
                lineToRelative(0.458f, 0.202f)
                lineToRelative(-0.265f, 0.602f)
                lineToRelative(-0.51f, -0.416f)
                lineToRelative(-0.156f, -0.118f)
                curveToRelative(-1.635f, -1.136f, -4.117f, 0.126f, -3.83f, 2.521f)
                lineToRelative(-0.497f, 0.059f)
                lineToRelative(0.496f, -0.059f)
                lineToRelative(0.068f, 0.56f)
                lineTo(10.8f, 15.801f)
                curveToRelative(-0.616f, 0.0f, -1.116f, 0.303f, -1.47f, 0.798f)
                curveToRelative(-0.361f, 0.505f, -0.56f, 1.198f, -0.529f, 1.905f)
                curveToRelative(0.03f, 0.703f, 0.286f, 1.384f, 0.784f, 1.886f)
                curveToRelative(0.493f, 0.497f, 1.265f, 0.86f, 2.415f, 0.86f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.144f, 0.0f, 1.943f, -0.363f, 2.465f, -0.866f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, false, 0.852f, -1.872f)
                curveToRelative(0.044f, -0.69f, -0.15f, -1.353f, -0.531f, -1.827f)
                curveToRelative(-0.372f, -0.46f, -0.938f, -0.766f, -1.716f, -0.735f)
                lineToRelative(-0.698f, 0.028f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.379f, -1.274f, 0.233f, -2.339f, -0.194f, -3.153f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, false, -2.01f, -1.728f)
                moveToRelative(-0.616f, -2.891f)
                lineToRelative(-0.693f, 0.72f)
                lineToRelative(-2.161f, -2.079f)
                lineToRelative(0.693f, -0.72f)
                close()
                moveTo(31.458f, 20.27f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-2.121f, -2.12f)
                lineToRelative(-0.707f, 0.706f)
                close()
                moveTo(34.501f, 12.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(29.877f, 8.308f)
                lineTo(31.998f, 6.187f)
                lineTo(31.291f, 5.479f)
                lineTo(29.17f, 7.601f)
                close()
                moveTo(14.697f, 24.224f)
                lineToRelative(-1.5f, 3.0f)
                lineToRelative(-0.894f, -0.448f)
                lineToRelative(1.5f, -3.0f)
                close()
                moveTo(22.197f, 27.224f)
                lineTo(23.697f, 24.224f)
                lineTo(22.803f, 23.776f)
                lineTo(21.303f, 26.776f)
                close()
                moveTo(17.697f, 24.224f)
                lineTo(14.697f, 30.224f)
                lineTo(13.803f, 29.776f)
                lineTo(16.803f, 23.776f)
                close()
                moveTo(17.772f, 30.224f)
                lineTo(20.772f, 24.224f)
                lineTo(19.877f, 23.776f)
                lineTo(16.877f, 29.776f)
                close()
            }
        }
        .build()
        return _cloudRainSunMedium!!
    }

private var _cloudRainSunMedium: ImageVector? = null
