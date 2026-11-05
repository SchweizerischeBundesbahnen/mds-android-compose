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

public val SBBIcons.HourglassLarge: ImageVector
    get() {
        if (_hourglassLarge != null) {
            return _hourglassLarge!!
        }
        _hourglassLarge = Builder(
            name = "HourglassLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(9.0f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(29.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-29.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                moveTo(9.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                horizontalLineToRelative(0.67f)
                curveToRelative(0.606f, 5.38f, 4.378f, 9.925f, 8.345f, 12.318f)
                curveToRelative(1.127f, 0.693f, 1.929f, 2.071f, 1.929f, 3.682f)
                reflectiveCurveToRelative(-0.802f, 2.989f, -1.929f, 3.682f)
                curveTo(14.548f, 30.075f, 10.775f, 34.62f, 10.17f, 40.0f)
                lineTo(9.5f, 40.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(29.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-0.67f)
                curveToRelative(-0.606f, -5.38f, -4.378f, -9.925f, -8.345f, -12.318f)
                curveToRelative(-1.127f, -0.694f, -1.929f, -2.072f, -1.929f, -3.682f)
                reflectiveCurveToRelative(0.802f, -2.989f, 1.929f, -3.682f)
                curveToRelative(3.967f, -2.393f, 7.74f, -6.939f, 8.346f, -12.318f)
                horizontalLineToRelative(0.669f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(36.824f, 8.0f)
                lineTo(11.176f, 8.0f)
                curveToRelative(0.604f, 4.949f, 4.11f, 9.203f, 7.857f, 11.463f)
                lineToRelative(0.004f, 0.002f)
                curveToRelative(1.443f, 0.887f, 2.407f, 2.6f, 2.407f, 4.535f)
                reflectiveCurveToRelative(-0.964f, 3.648f, -2.407f, 4.535f)
                lineToRelative(-0.004f, 0.002f)
                curveTo(15.286f, 30.797f, 11.78f, 35.05f, 11.176f, 40.0f)
                horizontalLineToRelative(25.648f)
                curveToRelative(-0.604f, -4.949f, -4.11f, -9.203f, -7.857f, -11.463f)
                lineToRelative(-0.004f, -0.002f)
                curveToRelative(-1.443f, -0.887f, -2.407f, -2.6f, -2.407f, -4.535f)
                reflectiveCurveToRelative(0.964f, -3.648f, 2.407f, -4.535f)
                lineToRelative(0.004f, -0.002f)
                curveTo(32.714f, 17.203f, 36.22f, 12.95f, 36.824f, 8.0f)
                moveTo(9.0f, 41.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(29.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-29.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                moveTo(16.73f, 15.0f)
                horizontalLineToRelative(14.54f)
                lineToRelative(-0.93f, 0.866f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, -2.42f, 1.861f)
                curveToRelative(-2.079f, 1.287f, -3.422f, 3.685f, -3.422f, 6.273f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.589f, -1.344f, -4.988f, -3.402f, -6.26f)
                arcToRelative(15.3f, 15.3f, 0.0f, false, true, -2.437f, -1.874f)
                close()
                moveTo(23.999f, 21.126f)
                curveToRelative(0.63f, -1.76f, 1.825f, -3.278f, 3.397f, -4.25f)
                lineToRelative(0.003f, -0.002f)
                quadToRelative(0.63f, -0.383f, 1.252f, -0.874f)
                lineTo(19.35f, 16.0f)
                curveToRelative(0.419f, 0.33f, 0.844f, 0.628f, 1.268f, 0.886f)
                lineToRelative(0.003f, 0.002f)
                curveToRelative(1.56f, 0.963f, 2.75f, 2.478f, 3.379f, 4.238f)
                moveTo(24.0f, 29.502f)
                horizontalLineToRelative(-0.39f)
                lineToRelative(-0.095f, 0.377f)
                curveToRelative(-0.385f, 1.523f, -1.437f, 2.157f, -2.91f, 3.044f)
                quadToRelative(-0.262f, 0.157f, -0.54f, 0.327f)
                curveToRelative(-0.614f, 0.37f, -1.268f, 0.644f, -1.943f, 0.902f)
                quadToRelative(-0.226f, 0.087f, -0.458f, 0.173f)
                curveToRelative(-0.522f, 0.197f, -1.056f, 0.397f, -1.555f, 0.63f)
                curveToRelative(-1.331f, 0.623f, -2.515f, 1.525f, -3.087f, 3.399f)
                lineToRelative(-0.197f, 0.646f)
                horizontalLineToRelative(22.351f)
                lineToRelative(-0.198f, -0.646f)
                curveToRelative(-0.572f, -1.874f, -1.758f, -2.777f, -3.091f, -3.401f)
                curveToRelative(-0.5f, -0.234f, -1.034f, -0.435f, -1.558f, -0.632f)
                lineToRelative(-0.462f, -0.175f)
                curveToRelative(-0.677f, -0.26f, -1.334f, -0.536f, -1.952f, -0.908f)
                lineToRelative(-0.466f, -0.283f)
                curveToRelative(-1.483f, -0.898f, -2.524f, -1.528f, -2.914f, -3.075f)
                lineToRelative(-0.096f, -0.378f)
                lineTo(24.0f, 29.502f)
                moveToRelative(-2.879f, 4.279f)
                curveToRelative(1.119f, -0.666f, 2.23f, -1.328f, 2.9f, -2.499f)
                curveToRelative(0.668f, 1.185f, 1.768f, 1.845f, 2.893f, 2.52f)
                quadToRelative(0.24f, 0.142f, 0.48f, 0.29f)
                lineToRelative(0.003f, 0.001f)
                curveToRelative(0.696f, 0.42f, 1.421f, 0.721f, 2.112f, 0.986f)
                quadToRelative(0.252f, 0.097f, 0.494f, 0.187f)
                curveToRelative(0.515f, 0.194f, 1.0f, 0.377f, 1.46f, 0.592f)
                curveToRelative(0.992f, 0.465f, 1.805f, 1.053f, 2.313f, 2.142f)
                lineTo(14.224f, 38.0f)
                curveToRelative(0.507f, -1.089f, 1.32f, -1.676f, 2.309f, -2.139f)
                curveToRelative(0.46f, -0.215f, 0.943f, -0.397f, 1.457f, -0.59f)
                horizontalLineToRelative(0.003f)
                lineToRelative(0.488f, -0.185f)
                curveToRelative(0.687f, -0.264f, 1.41f, -0.563f, 2.102f, -0.981f)
                lineToRelative(0.003f, -0.002f)
                quadToRelative(0.267f, -0.163f, 0.535f, -0.322f)
                moveTo(23.5f, 26.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(23.5f, 27.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
            .build()
        return _hourglassLarge!!
    }

private var _hourglassLarge: ImageVector? = null
