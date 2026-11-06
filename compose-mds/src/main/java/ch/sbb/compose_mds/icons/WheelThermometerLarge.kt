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

public val SBBIcons.WheelThermometerLarge: ImageVector
    get() {
        if (_wheelThermometerLarge != null) {
            return _wheelThermometerLarge!!
        }
        _wheelThermometerLarge = Builder(name = "WheelThermometerLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.0f, 3.0f)
                curveTo(12.402f, 3.0f, 3.0f, 12.402f, 3.0f, 24.0f)
                reflectiveCurveToRelative(9.402f, 21.0f, 21.0f, 21.0f)
                curveToRelative(0.758f, 0.0f, 1.479f, -0.033f, 2.21f, -0.11f)
                lineToRelative(0.106f, 0.994f)
                curveToRelative(-0.772f, 0.082f, -1.528f, 0.116f, -2.316f, 0.116f)
                curveToRelative(-12.15f, 0.0f, -22.0f, -9.85f, -22.0f, -22.0f)
                reflectiveCurveTo(11.85f, 2.0f, 24.0f, 2.0f)
                curveToRelative(2.421f, 0.0f, 4.777f, 0.44f, 6.947f, 1.157f)
                lineToRelative(-0.315f, 0.95f)
                curveTo(28.551f, 3.416f, 26.302f, 3.0f, 24.0f, 3.0f)
                moveToRelative(7.5f, 6.0f)
                curveToRelative(0.0f, -2.792f, 2.208f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.208f, 5.0f, 5.0f)
                verticalLineToRelative(21.744f)
                curveToRelative(2.069f, 1.533f, 3.5f, 3.958f, 3.5f, 6.756f)
                curveToRelative(0.0f, 4.68f, -3.821f, 8.5f, -8.5f, 8.5f)
                reflectiveCurveTo(28.0f, 42.18f, 28.0f, 37.5f)
                curveToRelative(0.0f, -2.798f, 1.431f, -5.223f, 3.5f, -6.756f)
                close()
                moveTo(36.5f, 5.0f)
                curveToRelative(-2.24f, 0.0f, -4.0f, 1.76f, -4.0f, 4.0f)
                verticalLineToRelative(22.261f)
                lineToRelative(-0.214f, 0.15f)
                curveTo(30.336f, 32.768f, 29.0f, 34.972f, 29.0f, 37.5f)
                curveToRelative(0.0f, 4.127f, 3.373f, 7.5f, 7.5f, 7.5f)
                reflectiveCurveToRelative(7.5f, -3.373f, 7.5f, -7.5f)
                curveToRelative(0.0f, -2.527f, -1.336f, -4.73f, -3.286f, -6.09f)
                lineToRelative(-0.214f, -0.149f)
                lineTo(40.5f, 9.0f)
                curveToRelative(0.0f, -2.24f, -1.76f, -4.0f, -4.0f, -4.0f)
                moveTo(21.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                moveToRelative(3.0f, -4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                moveToRelative(9.0f, 17.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
                moveToRelative(3.0f, -4.472f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 1.0f, 0.0f)
                lineTo(37.0f, 12.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(7.0f, 24.0f)
                curveToRelative(0.0f, -9.382f, 7.618f, -17.0f, 17.0f, -17.0f)
                curveToRelative(1.58f, 0.0f, 3.093f, 0.17f, 4.526f, 0.565f)
                lineToRelative(0.266f, -0.964f)
                curveTo(27.256f, 6.177f, 25.65f, 6.0f, 24.0f, 6.0f)
                curveTo(14.066f, 6.0f, 6.0f, 14.066f, 6.0f, 24.0f)
                curveToRelative(0.0f, 9.935f, 8.066f, 18.0f, 18.0f, 18.0f)
                lineToRelative(0.345f, 0.002f)
                curveToRelative(0.27f, 0.003f, 0.491f, 0.005f, 0.844f, -0.015f)
                lineToRelative(-0.058f, -0.998f)
                curveToRelative(-0.317f, 0.018f, -0.495f, 0.016f, -0.751f, 0.014f)
                lineTo(24.0f, 41.0f)
                curveToRelative(-9.382f, 0.0f, -17.0f, -7.618f, -17.0f, -17.0f)
            }
        }
        .build()
        return _wheelThermometerLarge!!
    }

private var _wheelThermometerLarge: ImageVector? = null
