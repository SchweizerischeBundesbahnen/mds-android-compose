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
        _locationPinSurroundingAreaLarge = Builder(name = "LocationPinSurroundingAreaLarge",
                defaultWidth = 48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f,
                viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.0f, 4.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, 5.374f, 12.0f, 12.003f)
                verticalLineToRelative(0.004f)
                lineToRelative(-0.01f, 0.37f)
                curveToRelative(-0.088f, 1.843f, -0.695f, 3.5f, -1.592f, 5.072f)
                lineToRelative(-0.004f, 0.009f)
                lineToRelative(-0.006f, 0.009f)
                lineToRelative(-0.423f, -0.266f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(0.424f, 0.266f)
                lineToRelative(-9.932f, 15.799f)
                lineToRelative(-0.424f, 0.674f)
                lineToRelative(-0.423f, -0.674f)
                lineToRelative(-9.931f, -15.8f)
                lineToRelative(-0.006f, -0.008f)
                curveToRelative(-0.975f, -1.627f, -1.591f, -3.366f, -1.672f, -5.435f)
                verticalLineToRelative(-0.02f)
                curveTo(12.0f, 9.374f, 17.372f, 4.0f, 24.0f, 4.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-6.07f, 0.0f, -10.993f, 4.919f, -11.0f, 10.99f)
                curveToRelative(0.074f, 1.87f, 0.626f, 3.443f, 1.524f, 4.946f)
                lineToRelative(9.508f, 15.124f)
                lineToRelative(9.503f, -15.116f)
                curveToRelative(0.895f, -1.569f, 1.448f, -3.17f, 1.465f, -4.941f)
                lineToRelative(-0.015f, -0.566f)
                curveTo(34.691f, 9.623f, 29.885f, 5.0f, 24.0f, 5.0f)
                moveToRelative(7.0f, 11.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, -14.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 14.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(5.073f, 34.113f)
                curveToRelative(-0.658f, 0.65f, -1.073f, 1.4f, -1.073f, 2.229f)
                curveToRelative(0.0f, 1.074f, 0.69f, 2.01f, 1.727f, 2.786f)
                curveToRelative(1.045f, 0.782f, 2.528f, 1.468f, 4.317f, 2.035f)
                curveTo(13.628f, 42.3f, 18.556f, 43.0f, 24.0f, 43.0f)
                reflectiveCurveToRelative(10.372f, -0.7f, 13.956f, -1.837f)
                curveToRelative(1.79f, -0.567f, 3.272f, -1.253f, 4.317f, -2.035f)
                curveTo(43.31f, 38.353f, 44.0f, 37.416f, 44.0f, 36.342f)
                curveToRelative(0.0f, -0.828f, -0.413f, -1.576f, -1.07f, -2.225f)
                curveToRelative(-0.655f, -0.647f, -1.587f, -1.23f, -2.72f, -1.744f)
                curveToRelative(-2.268f, -1.028f, -5.444f, -1.823f, -9.133f, -2.273f)
                lineToRelative(-0.12f, 0.992f)
                curveToRelative(3.63f, 0.443f, 6.697f, 1.221f, 8.84f, 2.192f)
                curveToRelative(1.073f, 0.486f, 1.89f, 1.01f, 2.43f, 1.544f)
                curveToRelative(0.54f, 0.533f, 0.773f, 1.041f, 0.773f, 1.514f)
                curveToRelative(0.0f, 0.612f, -0.395f, 1.29f, -1.325f, 1.985f)
                curveToRelative(-0.921f, 0.689f, -2.287f, 1.333f, -4.02f, 1.883f)
                curveTo(34.191f, 41.308f, 29.37f, 42.0f, 24.0f, 42.0f)
                reflectiveCurveToRelative(-10.192f, -0.692f, -13.654f, -1.79f)
                curveToRelative(-1.734f, -0.55f, -3.1f, -1.194f, -4.02f, -1.883f)
                curveTo(5.395f, 37.631f, 5.0f, 36.954f, 5.0f, 36.342f)
                curveToRelative(0.0f, -0.474f, 0.233f, -0.982f, 0.774f, -1.516f)
                curveToRelative(0.543f, -0.535f, 1.363f, -1.06f, 2.439f, -1.546f)
                curveToRelative(2.15f, -0.972f, 5.224f, -1.75f, 8.864f, -2.192f)
                lineToRelative(-0.12f, -0.992f)
                curveToRelative(-3.698f, 0.449f, -6.882f, 1.244f, -9.156f, 2.272f)
                curveToRelative(-1.136f, 0.514f, -2.07f, 1.097f, -2.728f, 1.745f)
            }
        }
        .build()
        return _locationPinSurroundingAreaLarge!!
    }

private var _locationPinSurroundingAreaLarge: ImageVector? = null
