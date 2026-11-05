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
        _sunMoonSmall = Builder(
            name = "SunMoonSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveToRelative(9.47f, 6.57f)
                lineToRelative(0.586f, -1.612f)
                lineToRelative(-1.36f, 1.045f)
                curveTo(6.855f, 7.416f, 6.028f, 9.21f, 5.98f, 10.994f)
                curveToRelative(-0.047f, 1.77f, 0.672f, 3.49f, 1.85f, 4.78f)
                curveToRelative(1.178f, 1.293f, 2.837f, 2.18f, 4.694f, 2.249f)
                curveToRelative(1.867f, 0.07f, 3.873f, -0.688f, 5.731f, -2.572f)
                lineToRelative(1.48f, -1.502f)
                lineToRelative(-1.997f, 0.677f)
                curveToRelative(-1.036f, 0.352f, -2.028f, 0.428f, -2.947f, 0.291f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 16.0f, 12.0f)
                curveToRelative(0.0f, -2.176f, -1.822f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.079f, 0.0f, -2.048f, 0.437f, -2.76f, 1.11f)
                curveToRelative(-0.124f, -0.874f, -0.057f, -1.746f, 0.23f, -2.54f)
                moveToRelative(0.056f, 3.729f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, false, 1.483f, 2.516f)
                curveToRelative(0.709f, 0.788f, 1.589f, 1.42f, 2.591f, 1.794f)
                curveToRelative(0.835f, -0.545f, 1.4f, -1.562f, 1.4f, -2.609f)
                curveToRelative(0.0f, -1.624f, -1.376f, -3.0f, -3.0f, -3.0f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, false, -2.474f, 1.299f)
                moveToRelative(0.74f, 3.185f)
                curveToRelative(1.412f, 1.57f, 3.458f, 2.625f, 5.807f, 2.486f)
                curveToRelative(-1.21f, 0.794f, -2.41f, 1.095f, -3.51f, 1.054f)
                curveToRelative(-1.556f, -0.059f, -2.972f, -0.803f, -3.994f, -1.924f)
                reflectiveCurveToRelative(-1.628f, -2.596f, -1.588f, -4.079f)
                curveToRelative(0.029f, -1.07f, 0.393f, -2.165f, 1.21f, -3.159f)
                curveToRelative(-0.129f, 1.99f, 0.684f, 4.076f, 2.075f, 5.622f)
            }
        }
            .build()
        return _sunMoonSmall!!
    }

private var _sunMoonSmall: ImageVector? = null
