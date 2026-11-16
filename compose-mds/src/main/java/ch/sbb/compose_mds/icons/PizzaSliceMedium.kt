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

public val SBBIcons.PizzaSliceMedium: ImageVector
    get() {
        if (_pizzaSliceMedium != null) {
            return _pizzaSliceMedium!!
        }
        _pizzaSliceMedium = Builder(name = "PizzaSliceMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.664f, 4.669f)
                curveToRelative(0.397f, -1.113f, 1.65f, -1.734f, 2.77f, -1.259f)
                curveToRelative(8.327f, 3.532f, 14.929f, 10.374f, 18.181f, 18.916f)
                curveToRelative(0.431f, 1.133f, -0.207f, 2.38f, -1.327f, 2.752f)
                lineToRelative(-3.968f, 1.315f)
                arcToRelative(2.14f, 2.14f, 0.0f, false, true, -2.092f, -0.43f)
                lineToRelative(-20.046f, 6.71f)
                curveToRelative(-1.172f, 0.392f, -2.249f, -0.75f, -1.846f, -1.897f)
                lineToRelative(0.002f, -0.006f)
                lineToRelative(7.32f, -19.96f)
                arcToRelative(2.19f, 2.19f, 0.0f, false, true, -0.409f, -2.172f)
                close()
                moveTo(11.496f, 11.427f)
                lineTo(10.295f, 14.703f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, true, 1.484f, 2.754f)
                curveToRelative(0.0f, 1.804f, -1.448f, 3.277f, -3.246f, 3.277f)
                quadToRelative(-0.223f, 0.0f, -0.439f, -0.03f)
                lineToRelative(-3.816f, 10.41f)
                arcToRelative(0.473f, 0.473f, 0.0f, false, false, 0.586f, 0.61f)
                lineToRelative(2.905f, -0.972f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.055f, -0.587f)
                curveToRelative(0.01f, -1.61f, 1.31f, -2.919f, 2.916f, -2.91f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, 2.602f, 1.669f)
                lineToRelative(11.383f, -3.81f)
                lineToRelative(-0.018f, -0.045f)
                curveToRelative(-2.423f, -6.109f, -7.154f, -11.016f, -13.1f, -13.642f)
                moveToRelative(0.777f, 17.818f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -1.649f, -0.99f)
                curveToRelative(-1.043f, -0.006f, -1.903f, 0.847f, -1.91f, 1.916f)
                quadToRelative(0.0f, 0.132f, 0.016f, 0.26f)
                close()
                moveTo(8.452f, 19.733f)
                lineTo(9.938f, 15.678f)
                curveToRelative(0.513f, 0.418f, 0.842f, 1.059f, 0.842f, 1.779f)
                curveToRelative(0.0f, 1.263f, -1.011f, 2.277f, -2.246f, 2.277f)
                quadToRelative(-0.041f, 0.0f, -0.082f, -0.002f)
                moveTo(14.044f, 4.33f)
                curveToRelative(-0.552f, -0.234f, -1.22f, 0.062f, -1.439f, 0.674f)
                lineTo(11.19f, 8.974f)
                curveToRelative(-0.214f, 0.6f, 0.084f, 1.262f, 0.69f, 1.53f)
                curveToRelative(6.198f, 2.73f, 11.125f, 7.837f, 13.646f, 14.196f)
                curveToRelative(0.25f, 0.628f, 0.893f, 0.938f, 1.48f, 0.743f)
                lineToRelative(3.967f, -1.314f)
                curveToRelative(0.602f, -0.2f, 0.928f, -0.869f, 0.708f, -1.447f)
                curveToRelative(-3.156f, -8.29f, -9.562f, -14.926f, -17.637f, -18.35f)
                moveTo(18.25f, 22.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 3.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 5.5f, 0.0f)
            }
        }
        .build()
        return _pizzaSliceMedium!!
    }

private var _pizzaSliceMedium: ImageVector? = null
