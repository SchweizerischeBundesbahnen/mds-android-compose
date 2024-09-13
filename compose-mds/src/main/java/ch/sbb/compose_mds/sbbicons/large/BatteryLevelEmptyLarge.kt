package ch.sbb.compose_mds.sbbicons.large

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.LargeGroup

public val LargeGroup.BatteryLevelEmptyLarge: ImageVector
    get() {
        if (_batteryLevelEmptyLarge != null) {
            return _batteryLevelEmptyLarge!!
        }
        _batteryLevelEmptyLarge = Builder(name = "BatteryLevelEmptyLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(21.995f, 7.528f)
                lineToRelative(0.002f, -0.002f)
                close()
                moveTo(22.04f, 7.475f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.04f, 0.045f)
                verticalLineToRelative(1.96f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.04f, 0.045f)
                curveToRelative(0.065f, 0.062f, 0.187f, 0.14f, 0.378f, 0.217f)
                curveToRelative(0.38f, 0.152f, 0.94f, 0.258f, 1.582f, 0.258f)
                reflectiveCurveToRelative(1.201f, -0.106f, 1.582f, -0.258f)
                curveToRelative(0.191f, -0.077f, 0.313f, -0.155f, 0.378f, -0.217f)
                arcTo(0.3f, 0.3f, 0.0f, false, false, 26.0f, 9.48f)
                lineTo(26.0f, 7.52f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.04f, -0.045f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.378f, -0.217f)
                curveTo(25.202f, 7.106f, 24.642f, 7.0f, 24.0f, 7.0f)
                reflectiveCurveToRelative(-1.201f, 0.106f, -1.582f, 0.258f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.378f, 0.217f)
                moveToRelative(-0.045f, 1.997f)
                lineToRelative(0.002f, 0.002f)
                close()
                moveTo(26.005f, 9.472f)
                lineTo(26.003f, 9.474f)
                close()
                moveTo(26.005f, 7.528f)
                lineTo(26.003f, 7.526f)
                close()
                moveTo(24.0f, 6.0f)
                curveToRelative(-0.738f, 0.0f, -1.429f, 0.12f, -1.953f, 0.33f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.694f, 0.418f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, false, -0.312f, 0.48f)
                curveToRelative(-1.282f, 0.191f, -2.435f, 0.497f, -3.304f, 0.889f)
                curveToRelative(-0.478f, 0.215f, -0.895f, 0.468f, -1.2f, 0.763f)
                reflectiveCurveTo(16.0f, 9.552f, 16.0f, 10.0f)
                verticalLineToRelative(30.0f)
                curveToRelative(0.0f, 0.564f, 0.344f, 1.022f, 0.78f, 1.366f)
                curveToRelative(0.443f, 0.348f, 1.051f, 0.64f, 1.76f, 0.876f)
                curveToRelative(1.42f, 0.474f, 3.351f, 0.758f, 5.46f, 0.758f)
                reflectiveCurveToRelative(4.04f, -0.285f, 5.46f, -0.758f)
                curveToRelative(0.709f, -0.236f, 1.317f, -0.528f, 1.76f, -0.876f)
                curveToRelative(0.436f, -0.344f, 0.78f, -0.802f, 0.78f, -1.366f)
                lineTo(32.0f, 10.0f)
                curveToRelative(0.0f, -0.445f, -0.226f, -0.83f, -0.526f, -1.14f)
                reflectiveCurveToRelative(-0.715f, -0.586f, -1.194f, -0.824f)
                curveToRelative(-0.89f, -0.442f, -2.076f, -0.792f, -3.398f, -0.988f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.235f, -0.3f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.694f, -0.418f)
                curveTo(25.43f, 6.12f, 24.738f, 6.0f, 24.0f, 6.0f)
                moveToRelative(3.0f, 2.079f)
                curveToRelative(1.133f, 0.19f, 2.117f, 0.495f, 2.835f, 0.852f)
                curveToRelative(0.419f, 0.209f, 0.726f, 0.424f, 0.921f, 0.626f)
                curveToRelative(0.198f, 0.203f, 0.244f, 0.353f, 0.244f, 0.443f)
                curveToRelative(0.0f, 0.126f, -0.076f, 0.326f, -0.4f, 0.58f)
                curveToRelative(-0.316f, 0.25f, -0.806f, 0.497f, -1.456f, 0.713f)
                curveTo(27.85f, 11.725f, 26.031f, 12.0f, 24.0f, 12.0f)
                reflectiveCurveToRelative(-3.85f, -0.275f, -5.144f, -0.707f)
                curveToRelative(-0.65f, -0.216f, -1.14f, -0.463f, -1.457f, -0.713f)
                curveToRelative(-0.323f, -0.254f, -0.399f, -0.454f, -0.399f, -0.58f)
                curveToRelative(0.0f, -0.082f, 0.04f, -0.216f, 0.232f, -0.401f)
                reflectiveCurveToRelative(0.496f, -0.381f, 0.916f, -0.57f)
                curveToRelative(0.721f, -0.326f, 1.71f, -0.6f, 2.852f, -0.782f)
                lineTo(21.0f, 9.5f)
                curveToRelative(0.0f, 0.32f, 0.165f, 0.574f, 0.353f, 0.752f)
                curveToRelative(0.188f, 0.177f, 0.433f, 0.314f, 0.694f, 0.418f)
                curveToRelative(0.524f, 0.21f, 1.215f, 0.33f, 1.953f, 0.33f)
                reflectiveCurveToRelative(1.429f, -0.12f, 1.953f, -0.33f)
                curveToRelative(0.261f, -0.104f, 0.506f, -0.241f, 0.694f, -0.418f)
                curveToRelative(0.188f, -0.178f, 0.353f, -0.432f, 0.353f, -0.752f)
                close()
                moveTo(29.46f, 12.242f)
                curveToRelative(0.598f, -0.2f, 1.124f, -0.438f, 1.54f, -0.717f)
                lineTo(31.0f, 40.0f)
                curveToRelative(0.0f, 0.126f, -0.076f, 0.326f, -0.4f, 0.58f)
                curveToRelative(-0.316f, 0.25f, -0.806f, 0.497f, -1.456f, 0.713f)
                curveTo(27.85f, 41.724f, 26.031f, 42.0f, 24.0f, 42.0f)
                reflectiveCurveToRelative(-3.85f, -0.276f, -5.144f, -0.707f)
                curveToRelative(-0.65f, -0.216f, -1.14f, -0.463f, -1.457f, -0.713f)
                curveToRelative(-0.323f, -0.254f, -0.399f, -0.454f, -0.399f, -0.58f)
                lineTo(17.0f, 11.525f)
                curveToRelative(0.416f, 0.279f, 0.942f, 0.518f, 1.54f, 0.717f)
                curveToRelative(1.42f, 0.473f, 3.351f, 0.758f, 5.46f, 0.758f)
                reflectiveCurveToRelative(4.04f, -0.284f, 5.46f, -0.758f)
            }
        }
        .build()
        return _batteryLevelEmptyLarge!!
    }

private var _batteryLevelEmptyLarge: ImageVector? = null
