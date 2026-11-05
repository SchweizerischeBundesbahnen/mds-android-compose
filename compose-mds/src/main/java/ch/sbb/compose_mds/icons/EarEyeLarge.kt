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

public val SBBIcons.EarEyeLarge: ImageVector
    get() {
        if (_earEyeLarge != null) {
            return _earEyeLarge!!
        }
        _earEyeLarge = Builder(name = "EarEyeLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.5f, 28.0f)
                curveToRelative(4.26f, 0.0f, 8.373f, 3.158f, 11.096f, 7.222f)
                lineToRelative(0.186f, 0.278f)
                lineToRelative(-0.186f, 0.278f)
                curveTo(40.873f, 39.842f, 36.74f, 43.0f, 32.5f, 43.0f)
                curveToRelative(-4.26f, 0.0f, -8.372f, -3.158f, -11.095f, -7.222f)
                lineToRelative(-0.186f, -0.278f)
                lineToRelative(0.186f, -0.278f)
                curveTo(24.128f, 31.158f, 28.24f, 28.0f, 32.5f, 28.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-3.69f, 0.0f, -7.444f, 2.71f, -10.074f, 6.5f)
                curveTo(25.056f, 39.29f, 28.81f, 42.0f, 32.5f, 42.0f)
                curveToRelative(3.67f, 0.0f, 7.444f, -2.71f, 10.074f, -6.501f)
                curveTo(39.944f, 31.709f, 36.19f, 29.0f, 32.5f, 29.0f)
                moveToRelative(0.0f, 3.0f)
                curveToRelative(1.936f, 0.0f, 3.5f, 1.564f, 3.5f, 3.5f)
                reflectiveCurveTo(34.436f, 39.0f, 32.5f, 39.0f)
                arcToRelative(3.496f, 3.496f, 0.0f, false, true, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.936f, 1.564f, -3.5f, 3.5f, -3.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.496f, 2.496f, 0.0f, false, false, -2.5f, 2.5f)
                curveToRelative(0.0f, 1.384f, 1.116f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.116f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.116f, -2.5f, -2.5f, -2.5f)
                moveToRelative(6.353f, -25.146f)
                lineToRelative(-30.0f, 30.0f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(30.0f, -30.0f)
                close()
                moveTo(12.5f, 4.0f)
                curveToRelative(2.963f, 0.0f, 4.863f, 1.244f, 6.006f, 2.83f)
                curveTo(19.63f, 8.391f, 20.0f, 10.25f, 20.0f, 11.5f)
                curveToRelative(0.0f, 3.228f, -2.154f, 5.36f, -3.146f, 6.354f)
                curveTo(15.846f, 18.86f, 14.0f, 20.728f, 14.0f, 23.5f)
                curveToRelative(0.0f, 0.58f, -0.17f, 1.439f, -0.694f, 2.167f)
                curveTo(12.763f, 26.421f, 11.863f, 27.0f, 10.5f, 27.0f)
                curveToRelative(-1.31f, 0.0f, -2.207f, -0.414f, -2.771f, -1.04f)
                curveTo(7.176f, 25.346f, 7.0f, 24.59f, 7.0f, 24.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.41f, 0.125f, 0.904f, 0.472f, 1.29f)
                curveToRelative(0.336f, 0.373f, 0.938f, 0.71f, 2.028f, 0.71f)
                curveToRelative(1.037f, 0.0f, 1.637f, -0.42f, 1.994f, -0.917f)
                arcTo(2.85f, 2.85f, 0.0f, false, false, 13.0f, 23.5f)
                curveToRelative(0.0f, -3.228f, 2.154f, -5.36f, 3.146f, -6.353f)
                curveTo(17.155f, 16.139f, 19.0f, 14.272f, 19.0f, 11.5f)
                curveToRelative(0.0f, -1.09f, -0.33f, -2.73f, -1.306f, -4.085f)
                curveTo(16.737f, 6.086f, 15.137f, 5.0f, 12.5f, 5.0f)
                curveToRelative(-2.66f, 0.0f, -4.26f, 0.98f, -5.207f, 2.182f)
                curveTo(6.328f, 8.406f, 6.0f, 9.914f, 6.0f, 11.0f)
                horizontalLineTo(5.0f)
                curveToRelative(0.0f, -1.254f, 0.372f, -2.996f, 1.507f, -4.437f)
                curveTo(7.659f, 5.101f, 9.56f, 4.0f, 12.5f, 4.0f)
                moveToRelative(0.0f, 4.0f)
                curveToRelative(0.93f, 0.0f, 1.823f, 0.282f, 2.482f, 0.966f)
                curveTo(15.641f, 9.648f, 16.0f, 10.663f, 16.0f, 12.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.163f, -0.31f, -1.898f, -0.737f, -2.34f)
                curveTo(13.837f, 9.217f, 13.23f, 9.0f, 12.5f, 9.0f)
                curveToRelative(-0.728f, 0.0f, -1.322f, 0.216f, -1.745f, 0.703f)
                curveToRelative(-0.408f, 0.47f, -0.717f, 1.261f, -0.752f, 2.548f)
                quadToRelative(0.057f, 0.043f, 0.124f, 0.096f)
                curveToRelative(0.201f, 0.162f, 0.47f, 0.399f, 0.74f, 0.692f)
                curveToRelative(0.525f, 0.57f, 1.133f, 1.438f, 1.133f, 2.461f)
                reflectiveCurveToRelative(-0.565f, 1.903f, -1.312f, 2.51f)
                curveTo(9.94f, 18.619f, 8.956f, 19.0f, 8.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.704f, 0.0f, 1.47f, -0.288f, 2.058f, -0.766f)
                curveToRelative(0.587f, -0.477f, 0.942f, -1.097f, 0.942f, -1.734f)
                reflectiveCurveToRelative(-0.392f, -1.268f, -0.867f, -1.783f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.91f, -0.8f)
                lineToRelative(-0.001f, -0.002f)
                lineTo(9.0f, 12.767f)
                verticalLineTo(12.5f)
                curveToRelative(0.0f, -1.565f, 0.348f, -2.702f, 1.0f, -3.453f)
                curveTo(10.662f, 8.284f, 11.568f, 8.0f, 12.5f, 8.0f)
            }
        }
        .build()
        return _earEyeLarge!!
    }

private var _earEyeLarge: ImageVector? = null
