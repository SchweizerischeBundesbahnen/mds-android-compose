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

public val SBBIcons.SunMoonMedium: ImageVector
    get() {
        if (_sunMoonMedium != null) {
            return _sunMoonMedium!!
        }
        _sunMoonMedium = Builder(name = "SunMoonMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.695f, 14.193f)
                curveToRelative(-0.296f, -1.51f, -0.228f, -3.04f, 0.275f, -4.422f)
                lineToRelative(0.587f, -1.612f)
                lineToRelative(-1.362f, 1.045f)
                curveToRelative(-2.7f, 2.074f, -3.903f, 4.697f, -3.973f, 7.294f)
                curveToRelative(-0.07f, 2.584f, 0.982f, 5.102f, 2.709f, 6.996f)
                reflectiveCurveToRelative(4.156f, 3.189f, 6.866f, 3.29f)
                curveToRelative(2.72f, 0.103f, 5.663f, -0.998f, 8.41f, -3.783f)
                lineToRelative(1.48f, -1.501f)
                lineToRelative(-1.997f, 0.676f)
                curveToRelative(-1.786f, 0.606f, -3.487f, 0.68f, -5.038f, 0.358f)
                curveToRelative(1.287f, -1.1f, 2.098f, -2.794f, 2.098f, -4.534f)
                curveToRelative(0.0f, -3.126f, -2.623f, -5.75f, -5.75f, -5.75f)
                curveToRelative(-1.728f, 0.0f, -3.261f, 0.78f, -4.305f, 1.943f)
                moveToRelative(0.318f, 1.217f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, false, 2.315f, 3.98f)
                curveToRelative(1.116f, 1.24f, 2.51f, 2.231f, 4.102f, 2.8f)
                curveToRelative(1.384f, -0.846f, 2.32f, -2.493f, 2.32f, -4.19f)
                curveToRelative(0.0f, -2.574f, -2.175f, -4.75f, -4.75f, -4.75f)
                curveToRelative(-1.677f, 0.0f, -3.145f, 0.896f, -3.987f, 2.16f)
                moveToRelative(-3.791f, 1.115f)
                curveToRelative(0.05f, -1.877f, 0.769f, -3.797f, 2.398f, -5.477f)
                curveToRelative(-0.473f, 3.124f, 0.734f, 6.533f, 2.965f, 9.012f)
                curveToRelative(2.26f, 2.51f, 5.614f, 4.116f, 9.442f, 3.545f)
                curveToRelative(-2.113f, 1.634f, -4.246f, 2.254f, -6.193f, 2.18f)
                curveToRelative(-2.408f, -0.09f, -4.593f, -1.242f, -6.165f, -2.965f)
                curveToRelative(-1.573f, -1.725f, -2.509f, -3.999f, -2.447f, -6.295f)
            }
        }
        .build()
        return _sunMoonMedium!!
    }

private var _sunMoonMedium: ImageVector? = null
