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
        _pizzaSliceLarge = Builder(
            name = "PizzaSliceLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(14.95f, 4.543f)
                curveToRelative(0.457f, -1.271f, 1.876f, -1.87f, 3.109f, -1.364f)
                curveToRelative(12.228f, 5.017f, 21.949f, 14.914f, 26.775f, 27.279f)
                curveToRelative(0.484f, 1.24f, -0.127f, 2.655f, -1.403f, 3.098f)
                lineTo(40.134f, 34.7f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, true, -2.336f, -0.477f)
                lineTo(5.706f, 44.893f)
                lineToRelative(-0.158f, -0.474f)
                lineToRelative(0.158f, 0.474f)
                curveToRelative(-1.63f, 0.541f, -3.156f, -1.036f, -2.585f, -2.649f)
                lineToRelative(11.282f, -31.858f)
                arcToRelative(2.35f, 2.35f, 0.0f, false, true, -0.64f, -2.547f)
                close()
                moveTo(15.286f, 10.888f)
                lineTo(10.136f, 25.43f)
                lineTo(12.353f, 27.647f)
                lineTo(11.646f, 28.354f)
                lineTo(9.766f, 26.474f)
                lineTo(7.448f, 33.023f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.599f, 7.337f)
                lineToRelative(-0.785f, 2.218f)
                lineToRelative(-0.471f, -0.167f)
                lineToRelative(0.47f, 0.167f)
                curveToRelative(-0.296f, 0.838f, 0.497f, 1.641f, 1.327f, 1.366f)
                lineTo(14.0f, 41.08f)
                lineTo(14.0f, 38.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.749f)
                lineToRelative(9.85f, -3.275f)
                arcTo(4.007f, 4.007f, 0.0f, false, true, 28.0f, 30.996f)
                arcToRelative(4.007f, 4.007f, 0.0f, false, true, 3.999f, 4.101f)
                lineToRelative(5.21f, -1.732f)
                curveToRelative(-3.983f, -10.14f, -11.928f, -18.277f, -21.923f, -22.477f)
                moveToRelative(15.676f, 24.554f)
                quadToRelative(0.037f, -0.214f, 0.038f, -0.431f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, false, -3.0f, -3.015f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, false, -2.12f, 5.136f)
                close()
                moveTo(5.196f, 39.382f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 1.905f, -5.38f)
                close()
                moveTo(17.679f, 4.105f)
                arcToRelative(1.345f, 1.345f, 0.0f, false, false, -1.789f, 0.777f)
                lineToRelative(-1.186f, 3.296f)
                curveToRelative(-0.244f, 0.676f, 0.082f, 1.421f, 0.727f, 1.688f)
                curveTo(25.79f, 14.14f, 34.028f, 22.526f, 38.14f, 33.0f)
                curveToRelative(0.257f, 0.654f, 0.993f, 0.988f, 1.666f, 0.754f)
                lineToRelative(3.297f, -1.144f)
                curveToRelative(0.719f, -0.25f, 1.085f, -1.057f, 0.8f, -1.79f)
                curveToRelative(-4.727f, -12.11f, -14.25f, -21.804f, -26.224f, -26.716f)
                moveTo(16.0f, 19.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                moveToRelative(2.5f, -3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveTo(15.0f, 30.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                moveToRelative(2.5f, -3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveTo(30.0f, 29.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(23.585f, 23.277f)
                lineTo(25.585f, 26.277f)
                lineTo(26.417f, 25.723f)
                lineTo(24.417f, 22.723f)
                close()
            }
        }
            .build()
        return _pizzaSliceLarge!!
    }

private var _pizzaSliceLarge: ImageVector? = null
