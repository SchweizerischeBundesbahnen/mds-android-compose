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

public val SBBIcons.StationSurroundingAreaLarge: ImageVector
    get() {
        if (_stationSurroundingAreaLarge != null) {
            return _stationSurroundingAreaLarge!!
        }
        _stationSurroundingAreaLarge = Builder(name = "StationSurroundingAreaLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.722f, 33.723f)
                curveToRelative(-0.917f, 0.453f, -1.611f, 0.933f, -2.07f, 1.416f)
                curveToRelative(-0.455f, 0.48f, -0.652f, 0.936f, -0.652f, 1.36f)
                curveToRelative(0.0f, 0.59f, 0.382f, 1.248f, 1.287f, 1.925f)
                curveToRelative(0.896f, 0.67f, 2.225f, 1.297f, 3.913f, 1.832f)
                curveToRelative(3.372f, 1.07f, 8.069f, 1.742f, 13.3f, 1.742f)
                curveToRelative(5.232f, 0.0f, 9.929f, -0.672f, 13.3f, -1.742f)
                curveToRelative(1.69f, -0.535f, 3.018f, -1.162f, 3.914f, -1.832f)
                curveToRelative(0.905f, -0.677f, 1.286f, -1.334f, 1.286f, -1.926f)
                curveToRelative(0.0f, -0.423f, -0.197f, -0.879f, -0.652f, -1.36f)
                curveToRelative(-0.458f, -0.482f, -1.152f, -0.961f, -2.069f, -1.413f)
                lineToRelative(0.442f, -0.897f)
                curveToRelative(0.977f, 0.482f, 1.784f, 1.023f, 2.352f, 1.622f)
                curveToRelative(0.57f, 0.601f, 0.927f, 1.29f, 0.927f, 2.048f)
                curveToRelative(0.0f, 1.053f, -0.677f, 1.97f, -1.687f, 2.727f)
                curveToRelative(-1.02f, 0.763f, -2.467f, 1.431f, -4.21f, 1.984f)
                curveTo(33.609f, 42.317f, 28.806f, 43.0f, 23.5f, 43.0f)
                reflectiveCurveToRelative(-10.109f, -0.682f, -13.603f, -1.79f)
                curveToRelative(-1.743f, -0.553f, -3.19f, -1.22f, -4.21f, -1.984f)
                curveTo(4.678f, 38.468f, 4.0f, 37.552f, 4.0f, 36.498f)
                curveToRelative(0.0f, -0.757f, 0.357f, -1.446f, 0.927f, -2.048f)
                curveToRelative(0.568f, -0.599f, 1.374f, -1.14f, 2.351f, -1.624f)
                close()
                moveTo(23.54f, 5.976f)
                curveToRelative(3.613f, -0.011f, 7.188f, 1.229f, 13.147f, 3.661f)
                lineToRelative(0.312f, 0.127f)
                verticalLineTo(37.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-5.982f)
                horizontalLineToRelative(-9.0f)
                verticalLineTo(37.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineTo(9.761f)
                lineToRelative(0.315f, -0.126f)
                curveToRelative(6.014f, -2.389f, 9.616f, -3.648f, 13.226f, -3.66f)
                moveToRelative(0.003f, 1.0f)
                curveToRelative(-3.33f, 0.01f, -6.695f, 1.148f, -12.544f, 3.465f)
                verticalLineTo(36.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.983f)
                horizontalLineToRelative(11.0f)
                verticalLineTo(36.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(10.437f)
                curveToRelative(-5.791f, -2.355f, -9.129f, -3.471f, -12.456f, -3.461f)
                moveTo(23.5f, 10.0f)
                arcToRelative(7.45f, 7.45f, 0.0f, false, true, 7.5f, 7.5f)
                arcToRelative(7.45f, 7.45f, 0.0f, false, true, -7.5f, 7.5f)
                arcToRelative(7.45f, 7.45f, 0.0f, false, true, -7.5f, -7.5f)
                arcToRelative(7.45f, 7.45f, 0.0f, false, true, 7.5f, -7.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(6.45f, 6.45f, 0.0f, false, false, -6.5f, 6.5f)
                curveToRelative(0.0f, 3.63f, 2.87f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.87f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.87f, -6.5f, -6.5f, -6.5f)
                moveToRelative(3.354f, 3.854f)
                lineTo(23.5f, 18.207f)
                lineToRelative(-2.354f, -2.353f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(1.647f, 1.646f)
                lineToRelative(2.646f, -2.646f)
                close()
            }
        }
        .build()
        return _stationSurroundingAreaLarge!!
    }

private var _stationSurroundingAreaLarge: ImageVector? = null
