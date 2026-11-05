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

public val SBBIcons.EmployeesSbbSmall: ImageVector
    get() {
        if (_employeesSbbSmall != null) {
            return _employeesSbbSmall!!
        }
        _employeesSbbSmall = Builder(
            name = "EmployeesSbbSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 6.0f)
                curveToRelative(0.44f, 0.0f, 0.84f, 0.171f, 1.175f, 0.475f)
                lineToRelative(0.016f, 0.015f)
                quadToRelative(0.058f, 0.053f, 0.113f, 0.112f)
                curveToRelative(0.419f, 0.447f, 0.696f, 1.115f, 0.696f, 1.9f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -0.015f, 0.206f)
                lineToRelative(-0.007f, 0.064f)
                lineToRelative(-0.006f, 0.055f)
                verticalLineToRelative(0.001f)
                curveTo(13.839f, 10.142f, 12.98f, 11.0f, 12.0f, 11.0f)
                curveToRelative(-0.368f, 0.0f, -0.709f, -0.12f, -1.006f, -0.338f)
                quadToRelative(0.006f, -0.08f, 0.006f, -0.163f)
                curveToRelative(0.0f, -0.83f, -0.24f, -1.595f, -0.658f, -2.2f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.283f, -0.356f)
                curveTo(10.263f, 6.76f, 11.078f, 5.999f, 12.0f, 5.999f)
                moveTo(12.0f, 12.0f)
                curveToRelative(0.67f, 0.0f, 1.259f, -0.235f, 1.732f, -0.625f)
                curveToRelative(1.975f, 1.262f, 2.943f, 3.176f, 3.22f, 5.624f)
                horizontalLineToRelative(-3.38f)
                curveToRelative(-0.524f, -1.787f, -1.528f, -3.289f, -3.176f, -4.383f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, 0.412f, -0.9f)
                curveToRelative(0.358f, 0.18f, 0.76f, 0.284f, 1.192f, 0.284f)
                moveToRelative(2.808f, -2.284f)
                curveToRelative(-0.1f, 0.322f, -0.238f, 0.625f, -0.411f, 0.899f)
                curveToRelative(1.649f, 1.094f, 2.651f, 2.597f, 3.176f, 4.384f)
                horizontalLineToRelative(3.38f)
                curveToRelative(-0.278f, -2.447f, -1.243f, -4.358f, -3.217f, -5.62f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, -2.928f, 0.337f)
                moveToRelative(3.595f, -1.095f)
                curveToRelative(0.382f, -0.6f, 0.597f, -1.343f, 0.597f, -2.121f)
                curveToRelative(0.0f, -1.85f, -1.213f, -3.502f, -3.0f, -3.502f)
                curveToRelative(-1.377f, 0.0f, -2.408f, 0.991f, -2.808f, 2.284f)
                arcTo(2.64f, 2.64f, 0.0f, false, false, 12.0f, 4.999f)
                curveToRelative(-1.377f, 0.0f, -2.408f, 0.99f, -2.807f, 2.283f)
                arcTo(2.64f, 2.64f, 0.0f, false, false, 8.0f, 6.998f)
                curveToRelative(-1.786f, 0.0f, -3.0f, 1.652f, -3.0f, 3.502f)
                curveToRelative(0.0f, 0.771f, 0.211f, 1.508f, 0.587f, 2.105f)
                curveTo(3.309f, 14.117f, 2.049f, 16.506f, 2.0f, 19.492f)
                lineTo(1.992f, 20.0f)
                horizontalLineToRelative(12.045f)
                lineToRelative(-0.038f, -0.536f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 13.812f, 18.0f)
                horizontalLineToRelative(4.225f)
                lineToRelative(-0.038f, -0.535f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 17.812f, 16.0f)
                horizontalLineToRelative(4.225f)
                lineToRelative(-0.038f, -0.536f)
                curveToRelative(-0.205f, -2.876f, -1.237f, -5.275f, -3.596f, -6.842f)
                moveTo(14.06f, 5.945f)
                curveTo(14.65f, 6.59f, 15.0f, 7.5f, 15.0f, 8.5f)
                quadToRelative(0.0f, 0.082f, -0.006f, 0.162f)
                curveTo(15.29f, 8.88f, 15.632f, 9.0f, 16.0f, 9.0f)
                curveToRelative(1.063f, 0.0f, 2.0f, -1.015f, 2.0f, -2.5f)
                reflectiveCurveToRelative(-0.937f, -2.502f, -2.0f, -2.502f)
                curveToRelative(-0.922f, 0.0f, -1.737f, 0.762f, -1.941f, 1.946f)
                moveToRelative(-4.9f, 2.514f)
                arcTo(1.73f, 1.73f, 0.0f, false, false, 8.0f, 8.0f)
                curveToRelative(-1.061f, 0.0f, -2.0f, 1.015f, -2.0f, 2.501f)
                reflectiveCurveTo(6.938f, 13.0f, 8.0f, 13.0f)
                curveToRelative(0.273f, 0.0f, 0.536f, -0.066f, 0.777f, -0.19f)
                lineToRelative(0.001f, -0.001f)
                curveToRelative(0.61f, -0.315f, 1.077f, -1.0f, 1.188f, -1.915f)
                lineToRelative(0.007f, -0.068f)
                lineToRelative(0.011f, -0.103f)
                lineToRelative(0.006f, -0.055f)
                curveToRelative(0.007f, -0.061f, 0.01f, -0.113f, 0.01f, -0.167f)
                curveToRelative(0.0f, -0.655f, -0.192f, -1.229f, -0.5f, -1.66f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -0.308f, -0.352f)
                close()
                moveTo(6.249f, 13.366f)
                quadToRelative(0.155f, 0.128f, 0.325f, 0.233f)
                lineToRelative(0.429f, 0.48f)
                lineToRelative(-0.251f, 0.509f)
                lineToRelative(-0.106f, 0.213f)
                lineToRelative(0.1f, 0.217f)
                lineToRelative(0.8f, 1.74f)
                lineToRelative(0.443f, 0.964f)
                lineToRelative(0.461f, -0.956f)
                lineToRelative(0.82f, -1.7f)
                lineToRelative(0.103f, -0.212f)
                lineToRelative(-0.098f, -0.213f)
                lineToRelative(-0.258f, -0.563f)
                lineToRelative(0.401f, -0.479f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.312f, -0.223f)
                curveToRelative(1.975f, 1.262f, 2.945f, 3.176f, 3.222f, 5.623f)
                horizontalLineToRelative(-9.93f)
                curveToRelative(0.171f, -2.48f, 1.3f, -4.401f, 3.227f, -5.633f)
                moveToRelative(1.505f, 1.45f)
                lineToRelative(0.257f, 0.56f)
                lineToRelative(0.257f, -0.532f)
                lineToRelative(-0.254f, -0.553f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
            .build()
        return _employeesSbbSmall!!
    }

private var _employeesSbbSmall: ImageVector? = null
