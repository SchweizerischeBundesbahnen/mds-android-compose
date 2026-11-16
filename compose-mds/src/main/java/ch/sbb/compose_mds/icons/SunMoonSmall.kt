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

public val SBBIcons.SunMoonSmall: ImageVector
    get() {
        if (_sunMoonSmall != null) {
            return _sunMoonSmall!!
        }
        _sunMoonSmall = Builder(name = "SunMoonSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.24f, 9.11f)
                curveToRelative(-0.126f, -0.874f, -0.059f, -1.746f, 0.23f, -2.54f)
                lineToRelative(0.586f, -1.612f)
                lineToRelative(-1.36f, 1.045f)
                curveToRelative(-1.84f, 1.413f, -2.667f, 3.208f, -2.715f, 4.992f)
                curveToRelative(-0.047f, 1.77f, 0.673f, 3.488f, 1.85f, 4.779f)
                curveToRelative(1.178f, 1.292f, 2.837f, 2.18f, 4.694f, 2.249f)
                curveToRelative(1.867f, 0.07f, 3.872f, -0.688f, 5.73f, -2.572f)
                lineToRelative(1.482f, -1.501f)
                lineToRelative(-1.997f, 0.676f)
                curveToRelative(-1.037f, 0.352f, -2.03f, 0.428f, -2.948f, 0.29f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 16.0f, 12.0f)
                curveToRelative(0.0f, -2.176f, -1.823f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.08f, 0.0f, -2.049f, 0.437f, -2.76f, 1.11f)
                moveToRelative(0.287f, 1.189f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, false, 1.483f, 2.516f)
                curveToRelative(0.708f, 0.787f, 1.588f, 1.42f, 2.59f, 1.794f)
                curveToRelative(0.835f, -0.545f, 1.4f, -1.562f, 1.4f, -2.609f)
                curveToRelative(0.0f, -1.624f, -1.375f, -3.0f, -3.0f, -3.0f)
                arcToRelative(3.05f, 3.05f, 0.0f, false, false, -2.473f, 1.299f)
                moveToRelative(-2.546f, 0.722f)
                curveToRelative(0.029f, -1.069f, 0.394f, -2.163f, 1.21f, -3.156f)
                curveToRelative(-0.129f, 1.989f, 0.685f, 4.075f, 2.075f, 5.62f)
                curveToRelative(1.412f, 1.568f, 3.456f, 2.622f, 5.802f, 2.484f)
                curveToRelative(-1.21f, 0.793f, -2.407f, 1.096f, -3.506f, 1.055f)
                curveToRelative(-1.555f, -0.059f, -2.971f, -0.804f, -3.993f, -1.924f)
                curveToRelative(-1.023f, -1.121f, -1.628f, -2.596f, -1.588f, -4.079f)
            }
        }
        .build()
        return _sunMoonSmall!!
    }

private var _sunMoonSmall: ImageVector? = null
