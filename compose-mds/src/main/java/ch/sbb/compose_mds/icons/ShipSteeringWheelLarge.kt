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

public val SBBIcons.ShipSteeringWheelLarge: ImageVector
    get() {
        if (_shipSteeringWheelLarge != null) {
            return _shipSteeringWheelLarge!!
        }
        _shipSteeringWheelLarge = Builder(name = "ShipSteeringWheelLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.009f)
                arcToRelative(14.45f, 14.45f, 0.0f, false, true, 9.393f, 3.891f)
                lineToRelative(3.189f, -3.188f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-3.19f, 3.188f)
                arcTo(14.44f, 14.44f, 0.0f, false, true, 37.99f, 23.0f)
                lineTo(43.0f, 23.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.01f)
                arcToRelative(14.44f, 14.44f, 0.0f, false, true, -3.89f, 9.393f)
                lineToRelative(3.19f, 3.189f)
                lineToRelative(-0.708f, 0.707f)
                lineToRelative(-3.19f, -3.19f)
                arcTo(14.44f, 14.44f, 0.0f, false, true, 24.0f, 37.99f)
                lineTo(24.0f, 43.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.01f)
                arcToRelative(14.44f, 14.44f, 0.0f, false, true, -9.394f, -3.89f)
                lineToRelative(-3.188f, 3.19f)
                lineToRelative(-0.707f, -0.708f)
                lineToRelative(3.188f, -3.19f)
                arcTo(14.45f, 14.45f, 0.0f, false, true, 9.01f, 24.0f)
                lineTo(4.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.01f)
                arcToRelative(14.45f, 14.45f, 0.0f, false, true, 3.89f, -9.393f)
                lineTo(9.71f, 10.42f)
                lineToRelative(0.708f, -0.707f)
                lineToRelative(3.188f, 3.188f)
                arcTo(14.45f, 14.45f, 0.0f, false, true, 23.0f, 9.01f)
                lineTo(23.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(23.5f, 10.0f)
                curveTo(16.044f, 10.0f, 10.0f, 16.044f, 10.0f, 23.5f)
                reflectiveCurveTo(16.044f, 37.0f, 23.5f, 37.0f)
                reflectiveCurveTo(37.0f, 30.956f, 37.0f, 23.5f)
                reflectiveCurveTo(30.956f, 10.0f, 23.5f, 10.0f)
                moveToRelative(0.0f, 3.0f)
                curveTo(29.3f, 13.0f, 34.0f, 17.702f, 34.0f, 23.5f)
                curveTo(34.0f, 29.3f, 29.3f, 34.0f, 23.5f, 34.0f)
                reflectiveCurveTo(13.0f, 29.3f, 13.0f, 23.5f)
                curveTo(13.0f, 17.702f, 17.7f, 13.0f, 23.5f, 13.0f)
                moveToRelative(-6.355f, 17.56f)
                arcTo(9.46f, 9.46f, 0.0f, false, false, 23.0f, 32.987f)
                verticalLineToRelative(-5.015f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -2.309f, -0.956f)
                close()
                moveTo(26.308f, 27.014f)
                curveToRelative(-0.648f, 0.518f, -1.44f, 0.86f, -2.308f, 0.957f)
                verticalLineToRelative(5.015f)
                arcToRelative(9.46f, 9.46f, 0.0f, false, false, 5.855f, -2.425f)
                close()
                moveTo(14.014f, 24.0f)
                arcToRelative(9.46f, 9.46f, 0.0f, false, false, 2.425f, 5.854f)
                lineToRelative(3.545f, -3.546f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 19.028f, 24.0f)
                close()
                moveTo(27.972f, 24.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.957f, 2.307f)
                lineToRelative(3.546f, 3.547f)
                arcTo(9.46f, 9.46f, 0.0f, false, false, 32.987f, 24.0f)
                close()
                moveTo(23.5f, 20.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                curveToRelative(0.0f, 1.932f, 1.568f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.568f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.568f, -3.5f, -3.5f, -3.5f)
                moveToRelative(0.0f, 2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-7.061f, -5.855f)
                arcTo(9.46f, 9.46f, 0.0f, false, false, 14.014f, 23.0f)
                horizontalLineToRelative(5.014f)
                curveToRelative(0.096f, -0.867f, 0.439f, -1.66f, 0.956f, -2.308f)
                close()
                moveTo(27.016f, 20.693f)
                curveToRelative(0.517f, 0.647f, 0.86f, 1.44f, 0.956f, 2.307f)
                horizontalLineToRelative(5.014f)
                arcToRelative(9.46f, 9.46f, 0.0f, false, false, -2.424f, -5.855f)
                close()
                moveTo(24.0f, 19.028f)
                curveToRelative(0.868f, 0.096f, 1.661f, 0.44f, 2.309f, 0.958f)
                lineToRelative(3.546f, -3.547f)
                arcTo(9.46f, 9.46f, 0.0f, false, false, 24.0f, 14.013f)
                close()
                moveTo(23.0f, 14.013f)
                arcToRelative(9.46f, 9.46f, 0.0f, false, false, -5.855f, 2.426f)
                lineToRelative(3.545f, 3.546f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 2.31f, -0.957f)
                close()
            }
        }
        .build()
        return _shipSteeringWheelLarge!!
    }

private var _shipSteeringWheelLarge: ImageVector? = null
