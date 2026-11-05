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

public val SBBIcons.VegetarianLarge: ImageVector
    get() {
        if (_vegetarianLarge != null) {
            return _vegetarianLarge!!
        }
        _vegetarianLarge = Builder(name = "VegetarianLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.734f, 8.426f)
                curveToRelative(0.128f, 0.857f, 1.423f, 7.72f, -0.765f, 14.505f)
                curveToRelative(-1.098f, 3.404f, -3.078f, 6.805f, -6.529f, 9.416f)
                curveToRelative(-3.399f, 2.571f, -8.187f, 4.345f, -14.877f, 4.64f)
                arcToRelative(91.0f, 91.0f, 0.0f, false, false, -3.613f, 6.73f)
                lineToRelative(-0.9f, -0.435f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 3.647f, -6.795f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.13f, -0.44f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -0.226f, -1.103f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -0.325f, -3.361f)
                curveToRelative(-0.094f, -2.665f, 0.146f, -6.083f, 1.28f, -9.488f)
                curveToRelative(1.135f, -3.41f, 3.17f, -6.817f, 6.665f, -9.432f)
                reflectiveCurveTo(28.372f, 8.253f, 35.22f, 8.0f)
                lineToRelative(0.448f, -0.017f)
                close()
                moveTo(34.815f, 9.019f)
                curveToRelative(-6.455f, 0.306f, -11.029f, 2.03f, -14.255f, 4.445f)
                curveToRelative(-3.3f, 2.47f, -5.23f, 5.689f, -6.315f, 8.946f)
                curveToRelative(-1.086f, 3.262f, -1.321f, 6.554f, -1.23f, 9.138f)
                curveToRelative(0.045f, 1.29f, 0.172f, 2.398f, 0.312f, 3.23f)
                quadToRelative(0.047f, 0.278f, 0.094f, 0.51f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, 16.744f, -20.16f)
                lineToRelative(0.67f, 0.743f)
                arcToRelative(90.8f, 90.8f, 0.0f, false, false, -16.648f, 20.08f)
                curveToRelative(6.178f, -0.372f, 10.555f, -2.06f, 13.65f, -4.402f)
                curveToRelative(3.253f, -2.462f, 5.13f, -5.672f, 6.18f, -8.925f)
                curveToRelative(1.89f, -5.863f, 1.08f, -11.812f, 0.798f, -13.605f)
            }
        }
        .build()
        return _vegetarianLarge!!
    }

private var _vegetarianLarge: ImageVector? = null
