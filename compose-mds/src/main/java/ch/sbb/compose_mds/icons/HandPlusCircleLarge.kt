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

public val SBBIcons.HandPlusCircleLarge: ImageVector
    get() {
        if (_handPlusCircleLarge != null) {
            return _handPlusCircleLarge!!
        }
        _handPlusCircleLarge = Builder(name = "HandPlusCircleLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.5f, 5.0f)
                curveTo(27.298f, 5.0f, 32.0f, 9.702f, 32.0f, 15.5f)
                curveTo(32.0f, 21.3f, 27.298f, 26.0f, 21.5f, 26.0f)
                reflectiveCurveTo(11.0f, 21.3f, 11.0f, 15.5f)
                curveTo(11.0f, 9.702f, 15.702f, 5.0f, 21.5f, 5.0f)
                moveToRelative(0.0f, 22.0f)
                curveTo(27.85f, 27.0f, 33.0f, 21.852f, 33.0f, 15.5f)
                curveTo(33.0f, 9.15f, 27.85f, 4.0f, 21.5f, 4.0f)
                reflectiveCurveTo(10.0f, 9.15f, 10.0f, 15.5f)
                curveTo(10.0f, 21.852f, 15.15f, 27.0f, 21.5f, 27.0f)
                moveToRelative(0.5f, -4.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(22.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(8.812f, 27.61f)
                curveToRelative(-0.716f, -0.573f, -1.477f, -0.783f, -2.18f, -0.683f)
                curveToRelative(-0.695f, 0.1f, -1.28f, 0.495f, -1.664f, 1.032f)
                curveToRelative(-0.777f, 1.089f, -0.74f, 2.763f, 0.72f, 3.931f)
                curveToRelative(1.239f, 0.991f, 4.104f, 3.482f, 6.67f, 5.736f)
                curveToRelative(1.28f, 1.124f, 2.483f, 2.186f, 3.365f, 2.967f)
                lineToRelative(0.402f, 0.356f)
                lineToRelative(0.652f, 0.577f)
                lineToRelative(0.289f, 0.258f)
                lineToRelative(0.076f, 0.067f)
                lineToRelative(0.02f, 0.017f)
                lineToRelative(0.005f, 0.005f)
                lineToRelative(0.143f, 0.127f)
                horizontalLineToRelative(7.982f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(16.633f)
                lineToRelative(-1.113f, -0.89f)
                lineToRelative(-12.5f, -10.0f)
                lineToRelative(-0.026f, -0.022f)
                lineToRelative(-0.029f, -0.017f)
                lineToRelative(-0.891f, -0.522f)
                curveToRelative(-0.849f, -0.48f, -1.584f, -0.84f, -2.349f, -1.088f)
                curveToRelative(-1.03f, -0.334f, -2.086f, -0.461f, -3.518f, -0.461f)
                lineTo(20.0f, 31.0f)
                curveToRelative(-0.866f, 0.0f, -1.561f, 0.291f, -2.04f, 0.771f)
                arcToRelative(2.44f, 2.44f, 0.0f, false, false, -0.71f, 1.728f)
                verticalLineToRelative(0.003f)
                curveToRelative(-0.706f, -0.47f, -1.665f, -1.11f, -2.699f, -1.812f)
                curveToRelative(-2.107f, -1.43f, -4.506f, -3.095f, -5.738f, -4.08f)
                moveToRelative(21.5f, 5.5f)
                lineTo(30.0f, 33.5f)
                verticalLineToRelative(-0.003f)
                close()
                moveTo(5.783f, 28.54f)
                curveToRelative(0.241f, -0.337f, 0.594f, -0.567f, 0.992f, -0.623f)
                curveToRelative(0.39f, -0.056f, 0.88f, 0.047f, 1.413f, 0.473f)
                curveToRelative(1.268f, 1.015f, 3.702f, 2.703f, 5.802f, 4.127f)
                arcToRelative(365.0f, 365.0f, 0.0f, false, false, 3.585f, 2.4f)
                lineToRelative(0.002f, 0.002f)
                lineToRelative(0.138f, 0.091f)
                lineToRelative(0.093f, 0.062f)
                lineToRelative(0.025f, 0.016f)
                quadToRelative(0.06f, 0.072f, 0.126f, 0.14f)
                curveToRelative(0.48f, 0.48f, 1.175f, 0.771f, 2.041f, 0.771f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.633f, 0.0f, -1.063f, -0.208f, -1.333f, -0.478f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, true, -0.417f, -1.022f)
                curveToRelative(0.0f, -0.376f, 0.141f, -0.746f, 0.417f, -1.021f)
                curveToRelative(0.27f, -0.27f, 0.7f, -0.478f, 1.333f, -0.479f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.369f, 0.0f, 2.313f, 0.123f, 3.208f, 0.414f)
                curveToRelative(0.898f, 0.291f, 1.776f, 0.76f, 3.01f, 1.5f)
                lineTo(41.074f, 43.0f)
                lineTo(27.706f, 43.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(17.69f, 41.0f)
                lineToRelative(-0.25f, -0.222f)
                arcToRelative(1395.0f, 1395.0f, 0.0f, false, false, -4.422f, -3.904f)
                curveToRelative(-2.559f, -2.246f, -5.444f, -4.755f, -6.705f, -5.764f)
                curveToRelative(-1.04f, -0.832f, -1.003f, -1.908f, -0.53f, -2.57f)
            }
        }
        .build()
        return _handPlusCircleLarge!!
    }

private var _handPlusCircleLarge: ImageVector? = null
