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

public val SBBIcons.LocationPinSurroundingAreaLarge: ImageVector
    get() {
        if (_locationPinSurroundingAreaLarge != null) {
            return _locationPinSurroundingAreaLarge!!
        }
        _locationPinSurroundingAreaLarge = Builder(
            name = "LocationPinSurroundingAreaLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
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
                moveTo(12.0f, 16.003f)
                curveTo(12.0f, 9.373f, 17.372f, 4.0f, 24.0f, 4.0f)
                reflectiveCurveToRelative(12.0f, 5.374f, 12.0f, 12.003f)
                verticalLineToRelative(0.004f)
                curveToRelative(-0.018f, 1.992f, -0.645f, 3.766f, -1.601f, 5.442f)
                lineToRelative(-0.006f, 0.01f)
                lineToRelative(-0.005f, 0.008f)
                lineToRelative(-9.932f, 15.8f)
                lineToRelative(-0.423f, 0.672f)
                lineToRelative(-0.424f, -0.673f)
                lineToRelative(-9.932f, -15.799f)
                lineToRelative(-0.005f, -0.009f)
                curveToRelative(-0.975f, -1.627f, -1.59f, -3.366f, -1.672f, -5.436f)
                verticalLineToRelative(-0.02f)
                moveToRelative(1.0f, -0.01f)
                curveToRelative(0.075f, 1.87f, 0.627f, 3.444f, 1.527f, 4.947f)
                lineToRelative(9.506f, 15.12f)
                lineToRelative(9.502f, -15.116f)
                curveTo(34.43f, 19.374f, 34.985f, 17.772f, 35.0f, 16.0f)
                curveToRelative(-0.001f, -6.075f, -4.926f, -11.0f, -11.0f, -11.0f)
                curveToRelative(-6.072f, 0.0f, -10.995f, 4.92f, -11.0f, 10.993f)
                moveTo(24.0f, 9.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 0.0f, 14.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, -14.0f)
                moveToRelative(-8.0f, 7.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                moveToRelative(0.957f, 14.095f)
                curveToRelative(-3.699f, 0.45f, -6.882f, 1.245f, -9.156f, 2.274f)
                curveToRelative(-1.136f, 0.513f, -2.07f, 1.097f, -2.728f, 1.745f)
                reflectiveCurveTo(4.0f, 35.513f, 4.0f, 36.342f)
                curveToRelative(0.0f, 1.075f, 0.69f, 2.011f, 1.727f, 2.786f)
                curveToRelative(1.045f, 0.782f, 2.527f, 1.467f, 4.317f, 2.035f)
                curveTo(13.628f, 42.3f, 18.556f, 43.0f, 24.0f, 43.0f)
                reflectiveCurveToRelative(10.372f, -0.7f, 13.956f, -1.837f)
                curveToRelative(1.79f, -0.568f, 3.272f, -1.253f, 4.317f, -2.035f)
                curveTo(43.31f, 38.353f, 44.0f, 37.417f, 44.0f, 36.342f)
                curveToRelative(0.0f, -0.828f, -0.413f, -1.577f, -1.07f, -2.225f)
                curveToRelative(-0.655f, -0.648f, -1.587f, -1.23f, -2.72f, -1.744f)
                curveToRelative(-2.268f, -1.027f, -5.443f, -1.823f, -9.132f, -2.273f)
                lineToRelative(-0.122f, 0.992f)
                curveToRelative(3.631f, 0.444f, 6.698f, 1.221f, 8.841f, 2.192f)
                curveToRelative(1.073f, 0.486f, 1.89f, 1.01f, 2.43f, 1.544f)
                curveToRelative(0.54f, 0.533f, 0.773f, 1.041f, 0.773f, 1.514f)
                curveToRelative(0.0f, 0.613f, -0.395f, 1.29f, -1.326f, 1.985f)
                curveToRelative(-0.92f, 0.69f, -2.286f, 1.333f, -4.02f, 1.883f)
                curveTo(34.192f, 41.308f, 29.37f, 42.0f, 24.0f, 42.0f)
                reflectiveCurveToRelative(-10.192f, -0.692f, -13.654f, -1.79f)
                curveToRelative(-1.734f, -0.55f, -3.1f, -1.194f, -4.02f, -1.883f)
                curveTo(5.396f, 37.632f, 5.0f, 36.955f, 5.0f, 36.342f)
                curveToRelative(0.0f, -0.473f, 0.233f, -0.982f, 0.775f, -1.516f)
                curveToRelative(0.543f, -0.535f, 1.362f, -1.06f, 2.438f, -1.546f)
                curveToRelative(2.15f, -0.972f, 5.224f, -1.75f, 8.864f, -2.192f)
                close()
            }
        }
            .build()
        return _locationPinSurroundingAreaLarge!!
    }

private var _locationPinSurroundingAreaLarge: ImageVector? = null
