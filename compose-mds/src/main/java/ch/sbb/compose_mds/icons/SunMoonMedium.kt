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
        _sunMoonMedium = Builder(
            name = "SunMoonMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                moveToRelative(13.97f, 9.77f)
                lineToRelative(0.586f, -1.612f)
                lineToRelative(-1.36f, 1.046f)
                curveToRelative(-2.702f, 2.074f, -3.904f, 4.697f, -3.974f, 7.294f)
                curveToRelative(-0.07f, 2.583f, 0.981f, 5.101f, 2.709f, 6.995f)
                curveToRelative(1.728f, 1.896f, 4.156f, 3.19f, 6.866f, 3.292f)
                curveToRelative(2.72f, 0.102f, 5.663f, -1.0f, 8.41f, -3.784f)
                lineToRelative(1.48f, -1.501f)
                lineToRelative(-1.998f, 0.677f)
                curveToRelative(-1.785f, 0.605f, -3.486f, 0.679f, -5.037f, 0.358f)
                curveToRelative(1.287f, -1.1f, 2.097f, -2.795f, 2.097f, -4.535f)
                curveToRelative(0.0f, -3.126f, -2.622f, -5.75f, -5.75f, -5.75f)
                curveToRelative(-1.727f, 0.0f, -3.26f, 0.78f, -4.304f, 1.943f)
                curveToRelative(-0.296f, -1.511f, -0.228f, -3.04f, 0.275f, -4.422f)
                moveToRelative(0.043f, 5.64f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, false, 2.315f, 3.98f)
                curveToRelative(1.115f, 1.24f, 2.51f, 2.232f, 4.102f, 2.8f)
                curveToRelative(1.384f, -0.846f, 2.32f, -2.493f, 2.32f, -4.19f)
                curveToRelative(0.0f, -2.574f, -2.175f, -4.75f, -4.75f, -4.75f)
                curveToRelative(-1.678f, 0.0f, -3.146f, 0.895f, -3.987f, 2.16f)
                moveToRelative(1.572f, 4.65f)
                curveToRelative(2.258f, 2.51f, 5.612f, 4.118f, 9.44f, 3.548f)
                curveToRelative(-2.113f, 1.632f, -4.245f, 2.25f, -6.19f, 2.178f)
                curveToRelative(-2.41f, -0.09f, -4.594f, -1.243f, -6.166f, -2.967f)
                reflectiveCurveToRelative(-2.509f, -3.997f, -2.447f, -6.294f)
                curveToRelative(0.05f, -1.877f, 0.768f, -3.797f, 2.398f, -5.477f)
                curveToRelative(-0.474f, 3.124f, 0.734f, 6.532f, 2.965f, 9.012f)
            }
        }
            .build()
        return _sunMoonMedium!!
    }

private var _sunMoonMedium: ImageVector? = null
