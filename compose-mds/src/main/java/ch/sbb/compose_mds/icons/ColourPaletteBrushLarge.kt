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

public val SBBIcons.ColourPaletteBrushLarge: ImageVector
    get() {
        if (_colourPaletteBrushLarge != null) {
            return _colourPaletteBrushLarge!!
        }
        _colourPaletteBrushLarge = Builder(
            name = "ColourPaletteBrushLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
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
                pathFillType = NonZero,
            ) {
                moveTo(25.054f, 5.02f)
                horizontalLineToRelative(0.001f)
                curveToRelative(2.712f, 0.083f, 5.3f, 0.74f, 7.661f, 1.87f)
                lineToRelative(-0.216f, 0.45f)
                lineToRelative(-0.215f, 0.451f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -7.26f, -1.77f)
                lineTo(25.025f, 6.02f)
                curveToRelative(-9.053f, -0.253f, -16.688f, 6.016f, -18.577f, 14.427f)
                verticalLineToRelative(0.001f)
                curveToRelative(-0.395f, 1.789f, 0.75f, 3.522f, 2.563f, 4.096f)
                horizontalLineToRelative(0.001f)
                curveTo(13.065f, 25.839f, 16.0f, 29.329f, 16.0f, 33.5f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -0.681f, 3.32f)
                curveToRelative(-0.744f, 1.76f, -0.054f, 3.794f, 1.612f, 4.567f)
                curveTo(19.222f, 42.435f, 21.79f, 43.0f, 24.48f, 43.0f)
                curveToRelative(2.685f, 0.0f, 5.414f, -0.623f, 7.789f, -1.732f)
                lineToRelative(0.21f, 0.453f)
                lineToRelative(0.213f, 0.452f)
                arcTo(19.7f, 19.7f, 0.0f, false, true, 24.48f, 44.0f)
                curveToRelative(-2.83f, 0.0f, -5.541f, -0.595f, -7.968f, -1.705f)
                lineToRelative(-0.205f, -0.103f)
                curveToRelative(-2.06f, -1.09f, -2.81f, -3.637f, -1.907f, -5.767f)
                lineToRelative(0.002f, -0.005f)
                arcTo(7.3f, 7.3f, 0.0f, false, false, 15.0f, 33.5f)
                curveToRelative(0.0f, -3.668f, -2.585f, -6.819f, -6.29f, -8.004f)
                verticalLineToRelative(0.001f)
                curveToRelative(-2.228f, -0.706f, -3.762f, -2.893f, -3.238f, -5.265f)
                verticalLineToRelative(-0.002f)
                curveTo(7.463f, 11.365f, 15.51f, 4.754f, 25.054f, 5.02f)
                moveToRelative(16.866f, 0.751f)
                lineToRelative(-0.003f, 0.005f)
                lineToRelative(-0.016f, 0.027f)
                lineToRelative(-0.068f, 0.119f)
                curveToRelative(-0.058f, 0.107f, -0.139f, 0.268f, -0.226f, 0.474f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -0.46f, 1.715f)
                curveToRelative(-0.163f, 1.315f, 0.043f, 3.057f, 1.527f, 4.85f)
                lineToRelative(0.314f, 0.36f)
                lineToRelative(0.023f, 0.025f)
                lineToRelative(0.019f, 0.027f)
                curveToRelative(0.619f, 0.885f, 0.97f, 1.965f, 0.97f, 3.127f)
                curveToRelative(0.0f, 1.718f, -0.798f, 3.21f, -2.0f, 4.217f)
                lineTo(42.0f, 40.5f)
                curveToRelative(0.0f, 1.936f, -1.564f, 3.5f, -3.5f, 3.5f)
                arcToRelative(3.496f, 3.496f, 0.0f, false, true, -3.5f, -3.5f)
                lineTo(35.0f, 20.719f)
                curveToRelative(-1.196f, -1.003f, -1.991f, -2.487f, -1.999f, -4.195f)
                lineToRelative(-0.002f, -0.02f)
                lineToRelative(-0.005f, -0.088f)
                arcToRelative(13.477f, 13.477f, 0.0f, false, true, 0.028f, -1.46f)
                curveToRelative(0.07f, -0.945f, 0.257f, -2.226f, 0.73f, -3.56f)
                curveToRelative(0.951f, -2.688f, 3.072f, -5.601f, 7.663f, -6.39f)
                lineToRelative(1.124f, -0.192f)
                close()
                moveTo(36.0f, 30.0f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 1.384f, 1.117f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.116f, 2.5f, -2.5f)
                lineTo(41.0f, 30.0f)
                close()
                moveTo(22.5f, 33.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveTo(29.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                moveToRelative(7.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(29.0f, 25.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                moveToRelative(7.0f, 0.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.02f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(14.5f, 15.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(26.108f, -9.794f)
                curveToRelative(-3.473f, 0.924f, -5.122f, 3.286f, -5.914f, 5.523f)
                arcToRelative(12.8f, 12.8f, 0.0f, false, false, -0.674f, 3.3f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, -0.026f, 1.34f)
                lineToRelative(0.004f, 0.089f)
                verticalLineToRelative(0.003f)
                lineToRelative(0.002f, 0.02f)
                verticalLineToRelative(0.019f)
                curveToRelative(0.0f, 1.411f, 0.66f, 2.645f, 1.677f, 3.48f)
                lineTo(37.0f, 19.98f)
                lineTo(37.0f, 14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.98f)
                horizontalLineToRelative(1.0f)
                lineTo(39.0f, 14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.98f)
                horizontalLineToRelative(1.323f)
                curveTo(42.339f, 19.146f, 43.0f, 17.912f, 43.0f, 16.5f)
                arcToRelative(4.43f, 4.43f, 0.0f, false, false, -0.779f, -2.537f)
                curveToRelative(-1.962f, -2.15f, -2.272f, -4.326f, -2.067f, -5.975f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 0.454f, -1.782f)
                moveTo(24.5f, 9.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
            }
        }
            .build()
        return _colourPaletteBrushLarge!!
    }

private var _colourPaletteBrushLarge: ImageVector? = null
