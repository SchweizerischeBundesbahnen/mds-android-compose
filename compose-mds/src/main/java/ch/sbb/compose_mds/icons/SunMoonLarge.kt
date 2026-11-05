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

public val SBBIcons.SunMoonLarge: ImageVector
    get() {
        if (_sunMoonLarge != null) {
            return _sunMoonLarge!!
        }
        _sunMoonLarge = Builder(name = "SunMoonLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.97f, 12.47f)
                curveToRelative(-0.719f, 1.978f, -0.782f, 4.172f, -0.303f, 6.321f)
                curveToRelative(1.361f, -1.658f, 3.455f, -2.79f, 5.832f, -2.791f)
                curveToRelative(4.078f, 0.0f, 7.5f, 3.424f, 7.5f, 7.5f)
                curveToRelative(0.0f, 2.388f, -1.172f, 4.709f, -3.002f, 6.132f)
                curveToRelative(2.185f, 0.518f, 4.6f, 0.456f, 7.142f, -0.405f)
                lineToRelative(1.998f, -0.678f)
                lineToRelative(-1.481f, 1.502f)
                curveToRelative(-3.633f, 3.684f, -7.514f, 5.129f, -11.087f, 4.995f)
                curveToRelative(-3.563f, -0.134f, -6.76f, -1.836f, -9.038f, -4.334f)
                curveToRelative(-2.277f, -2.497f, -3.66f, -5.814f, -3.568f, -9.21f)
                curveToRelative(0.091f, -3.41f, 1.67f, -6.861f, 5.233f, -9.599f)
                lineToRelative(1.36f, -1.045f)
                close()
                moveTo(17.583f, 13.741f)
                curveToRelative(-2.467f, 2.354f, -3.548f, 5.101f, -3.62f, 7.788f)
                curveToRelative(-0.084f, 3.11f, 1.184f, 6.181f, 3.306f, 8.51f)
                curveToRelative(2.122f, 2.325f, 5.076f, 3.885f, 8.337f, 4.008f)
                curveToRelative(2.795f, 0.105f, 5.861f, -0.845f, 8.87f, -3.347f)
                curveToRelative(-5.306f, 1.034f, -9.968f, -1.116f, -13.072f, -4.565f)
                curveToRelative(-3.072f, -3.414f, -4.664f, -8.15f, -3.821f, -12.394f)
                moveTo(24.499f, 17.0f)
                curveToRelative(-2.327f, 0.0f, -4.355f, 1.26f, -5.497f, 3.024f)
                arcToRelative(15.1f, 15.1f, 0.0f, false, false, 3.145f, 5.44f)
                curveToRelative(1.522f, 1.692f, 3.432f, 3.04f, 5.612f, 3.806f)
                curveTo(29.692f, 28.122f, 31.0f, 25.846f, 31.0f, 23.5f)
                curveToRelative(0.0f, -3.524f, -2.975f, -6.5f, -6.5f, -6.5f)
            }
        }
        .build()
        return _sunMoonLarge!!
    }

private var _sunMoonLarge: ImageVector? = null
