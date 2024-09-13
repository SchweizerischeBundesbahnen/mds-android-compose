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

public val LargeGroup.BatteryLevelHighLarge: ImageVector
    get() {
        if (_batteryLevelHighLarge != null) {
            return _batteryLevelHighLarge!!
        }
        _batteryLevelHighLarge = Builder(name = "BatteryLevelHighLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(21.995f, 7.528f)
                lineToRelative(0.002f, -0.002f)
                close()
                moveTo(22.0f, 7.52f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, 0.04f, -0.045f)
                curveToRelative(0.065f, -0.062f, 0.187f, -0.14f, 0.378f, -0.217f)
                curveToRelative(0.38f, -0.152f, 0.94f, -0.258f, 1.582f, -0.258f)
                reflectiveCurveToRelative(1.201f, 0.106f, 1.582f, 0.258f)
                curveToRelative(0.191f, 0.077f, 0.313f, 0.155f, 0.378f, 0.217f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, 0.04f, 0.045f)
                verticalLineToRelative(1.96f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, -0.04f, 0.045f)
                curveToRelative(-0.065f, 0.062f, -0.187f, 0.14f, -0.378f, 0.217f)
                curveToRelative(-0.38f, 0.152f, -0.94f, 0.258f, -1.582f, 0.258f)
                reflectiveCurveToRelative(-1.201f, -0.106f, -1.582f, -0.258f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -0.378f, -0.217f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, -0.04f, -0.045f)
                close()
                moveTo(21.995f, 9.472f)
                lineTo(21.997f, 9.474f)
                close()
                moveTo(26.005f, 9.472f)
                lineTo(26.003f, 9.474f)
                close()
                moveTo(26.005f, 7.528f)
                lineTo(26.003f, 7.526f)
                close()
                moveTo(22.047f, 6.33f)
                curveTo(22.57f, 6.12f, 23.262f, 6.0f, 24.0f, 6.0f)
                reflectiveCurveToRelative(1.429f, 0.12f, 1.953f, 0.33f)
                curveToRelative(0.261f, 0.104f, 0.506f, 0.241f, 0.694f, 0.418f)
                curveToRelative(0.088f, 0.084f, 0.172f, 0.184f, 0.235f, 0.3f)
                curveToRelative(1.322f, 0.196f, 2.509f, 0.546f, 3.398f, 0.988f)
                curveToRelative(0.479f, 0.238f, 0.893f, 0.514f, 1.194f, 0.825f)
                curveToRelative(0.3f, 0.309f, 0.526f, 0.694f, 0.526f, 1.139f)
                verticalLineToRelative(30.0f)
                curveToRelative(0.0f, 0.564f, -0.344f, 1.022f, -0.78f, 1.366f)
                curveToRelative(-0.443f, 0.348f, -1.051f, 0.64f, -1.76f, 0.876f)
                curveToRelative(-1.42f, 0.474f, -3.351f, 0.758f, -5.46f, 0.758f)
                reflectiveCurveToRelative(-4.04f, -0.285f, -5.46f, -0.758f)
                curveToRelative(-0.709f, -0.236f, -1.317f, -0.528f, -1.76f, -0.876f)
                curveToRelative(-0.436f, -0.344f, -0.78f, -0.802f, -0.78f, -1.366f)
                lineTo(16.0f, 10.0f)
                curveToRelative(0.0f, -0.448f, 0.232f, -0.825f, 0.537f, -1.12f)
                reflectiveCurveToRelative(0.722f, -0.548f, 1.2f, -0.763f)
                curveToRelative(0.869f, -0.392f, 2.022f, -0.698f, 3.304f, -0.888f)
                curveToRelative(0.06f, -0.195f, 0.18f, -0.357f, 0.312f, -0.48f)
                curveToRelative(0.188f, -0.178f, 0.433f, -0.315f, 0.694f, -0.42f)
                moveToRelative(7.788f, 2.601f)
                curveToRelative(-0.718f, -0.357f, -1.702f, -0.662f, -2.835f, -0.852f)
                lineTo(27.0f, 9.5f)
                curveToRelative(0.0f, 0.32f, -0.165f, 0.574f, -0.353f, 0.752f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.694f, 0.418f)
                curveToRelative(-0.524f, 0.21f, -1.215f, 0.33f, -1.953f, 0.33f)
                reflectiveCurveToRelative(-1.429f, -0.12f, -1.953f, -0.33f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.694f, -0.418f)
                curveTo(21.165f, 10.074f, 21.0f, 9.82f, 21.0f, 9.5f)
                lineTo(21.0f, 8.247f)
                curveToRelative(-1.142f, 0.182f, -2.13f, 0.456f, -2.852f, 0.781f)
                curveToRelative(-0.42f, 0.19f, -0.724f, 0.386f, -0.916f, 0.571f)
                reflectiveCurveTo(17.0f, 9.919f, 17.0f, 10.0f)
                curveToRelative(0.0f, 0.126f, 0.076f, 0.326f, 0.4f, 0.58f)
                curveToRelative(0.316f, 0.25f, 0.806f, 0.497f, 1.456f, 0.713f)
                curveTo(20.15f, 11.725f, 21.969f, 12.0f, 24.0f, 12.0f)
                reflectiveCurveToRelative(3.85f, -0.275f, 5.144f, -0.707f)
                curveToRelative(0.65f, -0.216f, 1.14f, -0.463f, 1.457f, -0.713f)
                curveToRelative(0.323f, -0.254f, 0.399f, -0.454f, 0.399f, -0.58f)
                curveToRelative(0.0f, -0.09f, -0.046f, -0.24f, -0.244f, -0.443f)
                curveToRelative(-0.195f, -0.202f, -0.502f, -0.417f, -0.921f, -0.626f)
                moveTo(31.0f, 11.525f)
                curveToRelative(-0.416f, 0.279f, -0.942f, 0.518f, -1.54f, 0.717f)
                curveToRelative(-1.42f, 0.473f, -3.351f, 0.758f, -5.46f, 0.758f)
                reflectiveCurveToRelative(-4.04f, -0.284f, -5.46f, -0.758f)
                curveToRelative(-0.598f, -0.2f, -1.124f, -0.438f, -1.54f, -0.717f)
                lineTo(17.0f, 40.0f)
                curveToRelative(0.0f, 0.126f, 0.076f, 0.326f, 0.4f, 0.58f)
                curveToRelative(0.316f, 0.25f, 0.806f, 0.497f, 1.456f, 0.713f)
                curveTo(20.15f, 41.724f, 21.969f, 42.0f, 24.0f, 42.0f)
                reflectiveCurveToRelative(3.85f, -0.276f, 5.144f, -0.707f)
                curveToRelative(0.65f, -0.216f, 1.14f, -0.463f, 1.457f, -0.713f)
                curveToRelative(0.323f, -0.254f, 0.399f, -0.454f, 0.399f, -0.58f)
                close()
                moveTo(17.797f, 14.957f)
                curveTo(19.254f, 15.606f, 21.51f, 16.0f, 24.0f, 16.0f)
                reflectiveCurveToRelative(4.746f, -0.394f, 6.203f, -1.043f)
                lineToRelative(-0.406f, -0.914f)
                curveTo(28.514f, 14.614f, 26.41f, 15.0f, 24.0f, 15.0f)
                reflectiveCurveToRelative(-4.514f, -0.386f, -5.797f, -0.957f)
                close()
                moveTo(24.0f, 19.0f)
                curveToRelative(-2.49f, 0.0f, -4.746f, -0.394f, -6.203f, -1.043f)
                lineToRelative(0.406f, -0.914f)
                curveTo(19.486f, 17.614f, 21.59f, 18.0f, 24.0f, 18.0f)
                reflectiveCurveToRelative(4.514f, -0.386f, 5.797f, -0.957f)
                lineToRelative(0.406f, 0.914f)
                curveTo(28.746f, 18.606f, 26.49f, 19.0f, 24.0f, 19.0f)
                moveToRelative(-6.203f, 1.957f)
                curveTo(19.254f, 21.606f, 21.51f, 22.0f, 24.0f, 22.0f)
                reflectiveCurveToRelative(4.746f, -0.394f, 6.203f, -1.043f)
                lineToRelative(-0.406f, -0.914f)
                curveTo(28.514f, 20.614f, 26.41f, 21.0f, 24.0f, 21.0f)
                reflectiveCurveToRelative(-4.514f, -0.386f, -5.797f, -0.957f)
                close()
                moveTo(24.0f, 25.0f)
                curveToRelative(-2.49f, 0.0f, -4.746f, -0.394f, -6.203f, -1.043f)
                lineToRelative(0.406f, -0.914f)
                curveTo(19.486f, 23.614f, 21.59f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(4.514f, -0.386f, 5.797f, -0.957f)
                lineToRelative(0.406f, 0.914f)
                curveTo(28.746f, 24.606f, 26.49f, 25.0f, 24.0f, 25.0f)
                moveToRelative(-6.203f, 1.957f)
                curveTo(19.254f, 27.606f, 21.51f, 28.0f, 24.0f, 28.0f)
                reflectiveCurveToRelative(4.746f, -0.394f, 6.203f, -1.043f)
                lineToRelative(-0.406f, -0.914f)
                curveTo(28.514f, 26.614f, 26.41f, 27.0f, 24.0f, 27.0f)
                reflectiveCurveToRelative(-4.514f, -0.386f, -5.797f, -0.957f)
                close()
                moveTo(24.0f, 31.0f)
                curveToRelative(-2.49f, 0.0f, -4.746f, -0.394f, -6.203f, -1.043f)
                lineToRelative(0.406f, -0.914f)
                curveTo(19.486f, 29.614f, 21.59f, 30.0f, 24.0f, 30.0f)
                reflectiveCurveToRelative(4.514f, -0.386f, 5.797f, -0.957f)
                lineToRelative(0.406f, 0.914f)
                curveTo(28.746f, 30.606f, 26.49f, 31.0f, 24.0f, 31.0f)
                moveToRelative(-6.203f, 1.957f)
                curveTo(19.254f, 33.606f, 21.51f, 34.0f, 24.0f, 34.0f)
                reflectiveCurveToRelative(4.746f, -0.394f, 6.203f, -1.043f)
                lineToRelative(-0.406f, -0.914f)
                curveTo(28.514f, 32.614f, 26.41f, 33.0f, 24.0f, 33.0f)
                reflectiveCurveToRelative(-4.514f, -0.386f, -5.797f, -0.957f)
                close()
                moveTo(24.0f, 37.0f)
                curveToRelative(-2.49f, 0.0f, -4.746f, -0.394f, -6.203f, -1.043f)
                lineToRelative(0.406f, -0.914f)
                curveTo(19.486f, 35.614f, 21.59f, 36.0f, 24.0f, 36.0f)
                reflectiveCurveToRelative(4.514f, -0.386f, 5.797f, -0.957f)
                lineToRelative(0.406f, 0.914f)
                curveTo(28.746f, 36.606f, 26.49f, 37.0f, 24.0f, 37.0f)
                moveToRelative(-6.203f, 1.957f)
                curveTo(19.254f, 39.606f, 21.51f, 40.0f, 24.0f, 40.0f)
                reflectiveCurveToRelative(4.746f, -0.394f, 6.203f, -1.043f)
                lineToRelative(-0.406f, -0.914f)
                curveTo(28.514f, 38.614f, 26.41f, 39.0f, 24.0f, 39.0f)
                reflectiveCurveToRelative(-4.514f, -0.386f, -5.797f, -0.957f)
                close()
            }
        }
        .build()
        return _batteryLevelHighLarge!!
    }

private var _batteryLevelHighLarge: ImageVector? = null
