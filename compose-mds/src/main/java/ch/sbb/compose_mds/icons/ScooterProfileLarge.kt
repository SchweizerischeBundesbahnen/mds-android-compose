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

public val SBBIcons.ScooterProfileLarge: ImageVector
    get() {
        if (_scooterProfileLarge != null) {
            return _scooterProfileLarge!!
        }
        _scooterProfileLarge = Builder(name = "ScooterProfileLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(32.97f, 11.332f)
                lineToRelative(4.886f, 13.677f)
                arcToRelative(8.46f, 8.46f, 0.0f, false, true, 4.942f, 1.843f)
                lineToRelative(-0.312f, 0.391f)
                lineToRelative(-0.312f, 0.392f)
                arcToRelative(7.46f, 7.46f, 0.0f, false, false, -4.674f, -1.633f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 30.0f, 33.5f)
                verticalLineToRelative(0.5f)
                lineTo(17.972f, 34.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.472f, 3.999f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 9.03f, 34.0f)
                lineTo(5.014f, 34.0f)
                lineTo(5.0f, 33.514f)
                curveToRelative(-0.105f, -3.683f, 1.509f, -6.77f, 3.494f, -8.944f)
                curveToRelative(0.994f, -1.087f, 2.089f, -1.954f, 3.125f, -2.561f)
                curveToRelative(1.027f, -0.6f, 2.037f, -0.97f, 2.858f, -1.007f)
                horizontalLineToRelative(5.872f)
                lineToRelative(-0.411f, 0.742f)
                horizontalLineToRelative(-0.001f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.003f, 0.006f)
                lineToRelative(-0.015f, 0.027f)
                lineToRelative(-0.06f, 0.115f)
                curveToRelative(-0.051f, 0.101f, -0.127f, 0.254f, -0.217f, 0.45f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -0.67f, 1.675f)
                curveToRelative(-0.449f, 1.305f, -0.894f, 3.057f, -0.962f, 4.982f)
                horizontalLineToRelative(6.247f)
                lineToRelative(9.59f, -12.238f)
                lineToRelative(-1.7f, -4.762f)
                lineTo(28.5f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.353f)
                close()
                moveTo(37.5f, 28.999f)
                curveToRelative(2.484f, 0.0f, 4.5f, 2.016f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.016f, 4.5f, -4.5f, 4.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, -4.5f)
                curveToRelative(0.0f, -2.484f, 2.016f, -4.5f, 4.5f, -4.5f)
                moveTo(10.036f, 34.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.464f, 2.999f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 16.963f, 34.0f)
                close()
                moveTo(37.5f, 29.999f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                curveToRelative(0.0f, 1.932f, 1.568f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.568f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.568f, -3.5f, -3.5f, -3.5f)
                moveToRelative(-12.606f, -0.191f)
                lineToRelative(-0.15f, 0.192f)
                lineTo(17.0f, 30.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.266f, 0.516f, -4.323f, 1.028f, -5.808f)
                curveToRelative(0.24f, -0.699f, 0.483f, -1.275f, 0.672f, -1.69f)
                horizontalLineToRelative(-4.187f)
                curveToRelative(-0.593f, 0.03f, -1.437f, 0.313f, -2.389f, 0.87f)
                curveToRelative(-0.947f, 0.554f, -1.964f, 1.358f, -2.892f, 2.373f)
                curveTo(7.465f, 27.18f, 6.049f, 29.85f, 5.998f, 33.0f)
                horizontalLineToRelative(23.018f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 7.786f, -7.969f)
                lineToRelative(-2.556f, -7.156f)
                close()
            }
        }
        .build()
        return _scooterProfileLarge!!
    }

private var _scooterProfileLarge: ImageVector? = null
