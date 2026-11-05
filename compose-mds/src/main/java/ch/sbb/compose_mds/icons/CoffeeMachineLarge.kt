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

public val SBBIcons.CoffeeMachineLarge: ImageVector
    get() {
        if (_coffeeMachineLarge != null) {
            return _coffeeMachineLarge!!
        }
        _coffeeMachineLarge = Builder(name = "CoffeeMachineLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.5f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 43.0f, 6.5f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.0f, 2.45f)
                verticalLineToRelative(21.1f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.0f, 2.45f)
                verticalLineToRelative(2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-34.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 40.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.0f, -2.45f)
                verticalLineToRelative(-21.1f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.0f, -2.45f)
                verticalLineToRelative(-6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.5f, 4.0f)
                close()
                moveTo(6.5f, 37.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 38.5f)
                verticalLineToRelative(2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 42.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(7.0f, 36.0f)
                horizontalLineToRelative(11.123f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.42f, -0.34f)
                lineToRelative(-0.185f, -0.178f)
                arcTo(5.18f, 5.18f, 0.0f, false, true, 16.0f, 31.82f)
                lineTo(16.0f, 26.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.88f)
                arcTo(2.12f, 2.12f, 0.0f, false, true, 35.0f, 30.12f)
                verticalLineToRelative(0.74f)
                curveToRelative(0.0f, 0.568f, -0.225f, 1.112f, -0.625f, 1.513f)
                lineToRelative(-0.002f, 0.001f)
                curveToRelative(-0.401f, 0.4f, -0.945f, 0.626f, -1.513f, 0.626f)
                horizontalLineToRelative(-1.997f)
                curveToRelative(-0.199f, 0.85f, -0.61f, 1.642f, -1.204f, 2.297f)
                lineToRelative(-0.177f, 0.185f)
                quadToRelative(-0.283f, 0.284f, -0.604f, 0.518f)
                lineTo(40.0f, 36.0f)
                lineTo(40.0f, 15.0f)
                lineTo(29.0f, 15.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                lineTo(7.0f, 15.0f)
                close()
                moveTo(17.0f, 31.82f)
                curveToRelative(0.0f, 1.109f, 0.44f, 2.172f, 1.225f, 2.955f)
                lineToRelative(0.15f, 0.144f)
                arcTo(4.18f, 4.18f, 0.0f, false, false, 21.18f, 36.0f)
                horizontalLineToRelative(4.64f)
                curveToRelative(1.109f, 0.0f, 2.172f, -0.44f, 2.955f, -1.225f)
                lineToRelative(0.144f, -0.15f)
                arcTo(4.18f, 4.18f, 0.0f, false, false, 30.0f, 31.82f)
                lineTo(30.0f, 27.0f)
                lineTo(17.0f, 27.0f)
                close()
                moveTo(31.0f, 31.82f)
                quadToRelative(0.0f, 0.09f, -0.004f, 0.18f)
                horizontalLineToRelative(1.864f)
                curveToRelative(0.302f, 0.0f, 0.593f, -0.12f, 0.807f, -0.334f)
                curveToRelative(0.213f, -0.214f, 0.333f, -0.504f, 0.333f, -0.806f)
                verticalLineToRelative(-0.74f)
                arcTo(1.123f, 1.123f, 0.0f, false, false, 32.88f, 29.0f)
                lineTo(31.0f, 29.0f)
                close()
                moveTo(19.0f, 20.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(6.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 6.5f)
                verticalLineToRelative(6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 14.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 40.5f, 5.0f)
                close()
                moveTo(38.0f, 9.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(31.0f, 8.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _coffeeMachineLarge!!
    }

private var _coffeeMachineLarge: ImageVector? = null
