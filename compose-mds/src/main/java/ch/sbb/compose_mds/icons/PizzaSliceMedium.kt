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
                moveTo(11.664f, 4.67f)
                curveToRelative(0.397f, -1.114f, 1.65f, -1.735f, 2.77f, -1.26f)
                curveToRelative(8.327f, 3.532f, 14.929f, 10.373f, 18.181f, 18.916f)
                curveToRelative(0.431f, 1.133f, -0.207f, 2.38f, -1.327f, 2.752f)
                lineToRelative(-3.968f, 1.315f)
                arcToRelative(2.14f, 2.14f, 0.0f, false, true, -2.092f, -0.43f)
                lineToRelative(-20.046f, 6.71f)
                curveToRelative(-1.172f, 0.392f, -2.249f, -0.75f, -1.846f, -1.897f)
                lineToRelative(0.002f, -0.006f)
                lineToRelative(7.32f, -19.96f)
                arcToRelative(2.19f, 2.19f, 0.0f, false, true, -0.41f, -2.172f)
                close()
                lineToRelative(0.47f, 0.168f)
                close()
                moveTo(11.496f, 11.427f)
                lineTo(10.295f, 14.703f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, true, 1.484f, 2.753f)
                curveToRelative(0.0f, 1.805f, -1.448f, 3.278f, -3.246f, 3.278f)
                quadToRelative(-0.223f, 0.0f, -0.439f, -0.03f)
                lineTo(4.28f, 31.112f)
                arcToRelative(0.473f, 0.473f, 0.0f, false, false, 0.585f, 0.614f)
                lineToRelative(2.905f, -0.973f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.055f, -0.587f)
                curveToRelative(0.01f, -1.61f, 1.31f, -2.92f, 2.917f, -2.91f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, 2.6f, 1.669f)
                lineToRelative(11.384f, -3.81f)
                lineToRelative(-0.008f, -0.02f)
                lineToRelative(-0.01f, -0.025f)
                curveToRelative(-2.423f, -6.11f, -7.154f, -11.016f, -13.101f, -13.642f)
                moveToRelative(0.778f, 17.818f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -1.65f, -0.99f)
                curveToRelative(-1.043f, -0.006f, -1.903f, 0.846f, -1.91f, 1.916f)
                quadToRelative(0.0f, 0.132f, 0.016f, 0.26f)
                close()
                moveTo(8.45f, 19.733f)
                lineToRelative(1.487f, -4.054f)
                curveToRelative(0.513f, 0.417f, 0.842f, 1.057f, 0.842f, 1.777f)
                curveToRelative(0.0f, 1.264f, -1.011f, 2.278f, -2.246f, 2.278f)
                close()
                moveTo(14.044f, 4.33f)
                curveToRelative(-0.552f, -0.234f, -1.22f, 0.063f, -1.438f, 0.674f)
                lineTo(11.19f, 8.974f)
                curveToRelative(-0.214f, 0.6f, 0.083f, 1.262f, 0.69f, 1.53f)
                curveToRelative(6.197f, 2.73f, 11.124f, 7.838f, 13.645f, 14.197f)
                curveToRelative(0.25f, 0.628f, 0.893f, 0.937f, 1.48f, 0.743f)
                lineToRelative(3.967f, -1.315f)
                curveToRelative(0.602f, -0.2f, 0.928f, -0.869f, 0.707f, -1.447f)
                curveToRelative(-3.155f, -8.29f, -9.56f, -14.926f, -17.636f, -18.351f)
                moveTo(16.5f, 20.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                moveToRelative(-2.75f, 1.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.5f, 0.0f)
            }
        }
        .build()
        return _pizzaSliceMedium!!
    }

private var _pizzaSliceMedium: ImageVector? = null
