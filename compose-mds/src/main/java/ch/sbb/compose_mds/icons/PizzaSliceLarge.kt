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

public val SBBIcons.PizzaSliceLarge: ImageVector
    get() {
        if (_pizzaSliceLarge != null) {
            return _pizzaSliceLarge!!
        }
        _pizzaSliceLarge = Builder(name = "PizzaSliceLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.95f, 4.543f)
                curveToRelative(0.457f, -1.272f, 1.877f, -1.869f, 3.109f, -1.363f)
                curveToRelative(12.228f, 5.016f, 21.95f, 14.913f, 26.775f, 27.278f)
                curveToRelative(0.484f, 1.24f, -0.128f, 2.655f, -1.403f, 3.098f)
                lineTo(40.134f, 34.7f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, true, -2.336f, -0.477f)
                lineTo(5.706f, 44.893f)
                curveToRelative(-1.63f, 0.541f, -3.155f, -1.036f, -2.584f, -2.649f)
                lineToRelative(11.28f, -31.858f)
                arcToRelative(2.35f, 2.35f, 0.0f, false, true, -0.64f, -2.547f)
                close()
                moveTo(15.286f, 10.888f)
                lineTo(10.136f, 25.43f)
                lineTo(12.353f, 27.647f)
                lineTo(11.646f, 28.354f)
                lineTo(9.766f, 26.474f)
                lineTo(7.448f, 33.023f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 4.85f, 40.36f)
                lineToRelative(-0.786f, 2.218f)
                curveToRelative(-0.296f, 0.838f, 0.497f, 1.641f, 1.326f, 1.365f)
                lineTo(14.0f, 41.082f)
                lineTo(14.0f, 38.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.749f)
                lineToRelative(9.85f, -3.275f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, true, -0.85f, -2.463f)
                arcToRelative(4.007f, 4.007f, 0.0f, false, true, 4.0f, -4.015f)
                arcToRelative(4.007f, 4.007f, 0.0f, false, true, 3.999f, 4.102f)
                lineToRelative(5.21f, -1.733f)
                curveToRelative(-3.982f, -10.14f, -11.928f, -18.277f, -21.923f, -22.477f)
                moveTo(30.96f, 35.442f)
                quadToRelative(0.038f, -0.214f, 0.039f, -0.431f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, false, -3.0f, -3.015f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, false, -2.12f, 5.136f)
                close()
                moveTo(5.195f, 39.382f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 1.905f, -5.38f)
                close()
                moveTo(17.679f, 4.104f)
                arcToRelative(1.345f, 1.345f, 0.0f, false, false, -1.788f, 0.778f)
                lineToRelative(-1.187f, 3.296f)
                curveToRelative(-0.243f, 0.676f, 0.082f, 1.42f, 0.727f, 1.687f)
                curveTo(25.79f, 14.14f, 34.027f, 22.527f, 38.14f, 33.001f)
                curveToRelative(0.257f, 0.654f, 0.993f, 0.987f, 1.666f, 0.754f)
                lineToRelative(3.298f, -1.144f)
                curveToRelative(0.718f, -0.249f, 1.084f, -1.057f, 0.799f, -1.79f)
                curveToRelative(-4.727f, -12.11f, -14.25f, -21.804f, -26.224f, -26.717f)
                moveTo(18.499f, 17.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                moveToRelative(0.0f, 6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                moveToRelative(-1.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                moveToRelative(0.0f, 6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                moveTo(30.0f, 28.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(25.585f, 26.277f)
                lineTo(26.417f, 25.723f)
                lineTo(24.417f, 22.723f)
                lineTo(23.585f, 23.277f)
                close()
            }
        }
        .build()
        return _pizzaSliceLarge!!
    }

private var _pizzaSliceLarge: ImageVector? = null
