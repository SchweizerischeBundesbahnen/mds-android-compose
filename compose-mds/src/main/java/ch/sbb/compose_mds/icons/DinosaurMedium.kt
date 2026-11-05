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

public val SBBIcons.DinosaurMedium: ImageVector
    get() {
        if (_dinosaurMedium != null) {
            return _dinosaurMedium!!
        }
        _dinosaurMedium = Builder(
            name = "DinosaurMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(30.75f, 6.25f)
                curveToRelative(1.086f, 0.0f, 1.927f, 0.44f, 2.501f, 1.112f)
                curveToRelative(0.564f, 0.66f, 0.852f, 1.52f, 0.904f, 2.357f)
                curveToRelative(0.052f, 0.834f, -0.127f, 1.696f, -0.56f, 2.365f)
                curveToRelative(-0.441f, 0.684f, -1.152f, 1.166f, -2.095f, 1.166f)
                horizontalLineToRelative(-3.354f)
                curveToRelative(-0.472f, 1.796f, -1.59f, 3.125f, -2.515f, 4.47f)
                curveToRelative(-1.004f, 1.461f, -1.881f, 3.049f, -1.881f, 5.53f)
                verticalLineTo(30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.75f)
                curveToRelative(0.0f, -2.769f, 0.998f, -4.556f, 2.057f, -6.096f)
                curveToRelative(1.07f, -1.556f, 2.104f, -2.756f, 2.453f, -4.502f)
                lineToRelative(0.08f, -0.402f)
                horizontalLineToRelative(4.16f)
                curveToRelative(0.557f, 0.0f, 0.971f, -0.268f, 1.256f, -0.709f)
                curveToRelative(0.294f, -0.456f, 0.443f, -1.094f, 0.401f, -1.76f)
                curveToRelative(-0.041f, -0.663f, -0.269f, -1.303f, -0.666f, -1.768f)
                curveToRelative(-0.387f, -0.453f, -0.952f, -0.763f, -1.741f, -0.763f)
                curveToRelative(-1.413f, 0.0f, -2.814f, 0.352f, -4.129f, 1.229f)
                curveToRelative(-1.318f, 0.878f, -2.578f, 2.304f, -3.674f, 4.495f)
                curveToRelative(-0.735f, 1.47f, -1.344f, 2.71f, -2.384f, 3.542f)
                curveToRelative(-1.068f, 0.853f, -2.517f, 1.234f, -4.813f, 1.234f)
                curveToRelative(-2.033f, 0.0f, -3.783f, 1.18f, -5.63f, 3.21f)
                curveToRelative(-1.599f, 1.76f, -3.187f, 4.057f, -5.054f, 6.602f)
                curveToRelative(0.77f, -0.291f, 1.427f, -0.617f, 2.023f, -0.916f)
                curveToRelative(0.902f, -0.45f, 1.768f, -0.896f, 2.661f, -0.896f)
                horizontalLineToRelative(0.5f)
                verticalLineTo(30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.186f)
                curveToRelative(-0.471f, 0.114f, -1.002f, 0.371f, -1.714f, 0.727f)
                curveToRelative(-0.939f, 0.47f, -2.107f, 1.055f, -3.665f, 1.444f)
                lineToRelative(-1.366f, 0.341f)
                lineToRelative(0.845f, -1.126f)
                curveToRelative(2.224f, -2.965f, 4.134f, -5.826f, 6.03f, -7.91f)
                curveToRelative(1.903f, -2.094f, 3.903f, -3.54f, 6.37f, -3.54f)
                curveToRelative(2.204f, 0.0f, 3.38f, -0.37f, 4.188f, -1.016f)
                curveToRelative(0.834f, -0.667f, 1.35f, -1.678f, 2.115f, -3.208f)
                curveToRelative(1.154f, -2.309f, 2.52f, -3.883f, 4.013f, -4.88f)
                curveToRelative(1.498f, -0.998f, 3.097f, -1.396f, 4.684f, -1.396f)
                moveToRelative(-12.0f, 16.5f)
                curveToRelative(0.332f, 0.0f, 0.877f, -0.016f, 1.309f, 0.271f)
                curveToRelative(0.487f, 0.325f, 0.691f, 0.913f, 0.691f, 1.729f)
                verticalLineTo(30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.25f)
                curveToRelative(0.0f, -0.684f, -0.171f, -0.846f, -0.246f, -0.896f)
                curveToRelative(-0.13f, -0.088f, -0.336f, -0.104f, -0.754f, -0.104f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.418f, 0.0f, -0.623f, 0.016f, -0.754f, 0.104f)
                curveToRelative(-0.075f, 0.05f, -0.246f, 0.212f, -0.246f, 0.896f)
                verticalLineTo(30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.25f)
                curveToRelative(0.0f, -0.816f, 0.204f, -1.404f, 0.691f, -1.729f)
                curveToRelative(0.432f, -0.287f, 0.977f, -0.271f, 1.309f, -0.271f)
                close()
                moveTo(29.25f, 9.0f)
                curveToRelative(0.42f, 0.0f, 0.75f, 0.33f, 0.75f, 0.75f)
                reflectiveCurveToRelative(-0.33f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.33f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.33f, -0.75f, 0.75f, -0.75f)
            }
        }
            .build()
        return _dinosaurMedium!!
    }

private var _dinosaurMedium: ImageVector? = null
