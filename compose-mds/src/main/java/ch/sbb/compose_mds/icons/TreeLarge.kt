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

public val SBBIcons.TreeLarge: ImageVector
    get() {
        if (_treeLarge != null) {
            return _treeLarge!!
        }
        _treeLarge = Builder(
            name = "TreeLarge",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(23.184f, 3.933f)
                curveToRelative(-4.752f, 0.0f, -8.658f, 3.627f, -8.658f, 8.166f)
                quadToRelative(0.002f, 0.593f, 0.09f, 1.159f)
                curveTo(10.898f, 13.812f, 8.0f, 16.816f, 8.0f, 20.533f)
                curveToRelative(0.0f, 4.115f, 3.54f, 7.4f, 7.842f, 7.4f)
                horizontalLineTo(23.0f)
                verticalLineToRelative(7.184f)
                lineToRelative(-1.512f, -1.44f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.367f, -3.798f)
                curveToRelative(-0.342f, -0.343f, -0.85f, -0.538f, -1.337f, -0.658f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -1.568f, -0.22f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.872f, -0.003f)
                lineToRelative(-0.031f, 0.002f)
                lineToRelative(-0.009f, 0.001f)
                horizontalLineToRelative(-0.003f)
                lineToRelative(0.035f, 0.499f)
                lineToRelative(-0.036f, -0.499f)
                lineToRelative(-0.453f, 0.032f)
                lineToRelative(-0.011f, 0.455f)
                lineToRelative(0.5f, 0.012f)
                lineToRelative(-0.5f, -0.012f)
                verticalLineToRelative(0.012f)
                lineToRelative(-0.001f, 0.03f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, 0.086f, 1.791f)
                curveToRelative(0.052f, 0.488f, 0.138f, 1.023f, 0.28f, 1.508f)
                curveToRelative(0.136f, 0.472f, 0.344f, 0.958f, 0.678f, 1.292f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.92f, 0.28f)
                lineTo(23.0f, 36.499f)
                verticalLineTo(43.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineTo(27.933f)
                horizontalLineToRelative(9.789f)
                curveToRelative(3.4f, 0.0f, 6.211f, -2.598f, 6.211f, -5.867f)
                curveToRelative(0.0f, -1.83f, -0.89f, -3.448f, -2.262f, -4.517f)
                curveToRelative(0.4f, -0.709f, 0.63f, -1.519f, 0.63f, -2.383f)
                curveToRelative(0.0f, -2.845f, -2.445f, -5.1f, -5.394f, -5.1f)
                curveToRelative(-0.483f, 0.0f, -0.946f, 0.065f, -1.385f, 0.18f)
                curveToRelative(-0.894f, -3.631f, -4.32f, -6.313f, -8.405f, -6.313f)
                moveToRelative(-2.436f, 29.04f)
                lineToRelative(-1.403f, -1.335f)
                lineToRelative(-0.69f, 0.724f)
                lineToRelative(1.403f, 1.336f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.472f, -0.284f)
                curveToRelative(-0.154f, -0.154f, -0.303f, -0.445f, -0.426f, -0.865f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.245f, -1.335f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, -0.077f, -1.197f)
                verticalLineToRelative(-0.038f)
                lineToRelative(0.064f, -0.002f)
                curveToRelative(0.33f, -0.007f, 0.778f, -0.007f, 1.253f, 0.022f)
                curveToRelative(0.477f, 0.03f, 0.967f, 0.088f, 1.388f, 0.192f)
                curveToRelative(0.436f, 0.108f, 0.726f, 0.25f, 0.871f, 0.395f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.334f, 2.387f)
                moveTo(24.0f, 26.933f)
                horizontalLineToRelative(9.789f)
                curveToRelative(2.908f, 0.0f, 5.211f, -2.208f, 5.211f, -4.867f)
                curveToRelative(0.0f, -1.63f, -0.866f, -3.08f, -2.21f, -3.968f)
                lineToRelative(-0.428f, -0.283f)
                lineToRelative(0.293f, -0.42f)
                curveToRelative(0.45f, -0.646f, 0.713f, -1.41f, 0.713f, -2.229f)
                curveToRelative(0.0f, -2.235f, -1.937f, -4.1f, -4.394f, -4.1f)
                curveToRelative(-0.558f, 0.0f, -1.091f, 0.108f, -1.591f, 0.29f)
                lineToRelative(-0.563f, 0.204f)
                lineToRelative(-0.1f, -0.59f)
                curveToRelative(-0.58f, -3.398f, -3.7f, -6.037f, -7.536f, -6.037f)
                curveToRelative(-4.259f, 0.0f, -7.658f, 3.237f, -7.658f, 7.166f)
                curveToRelative(0.0f, 0.507f, 0.061f, 1.002f, 0.17f, 1.484f)
                lineToRelative(0.126f, 0.561f)
                lineToRelative(-0.573f, 0.047f)
                curveTo(11.722f, 14.48f, 9.0f, 17.218f, 9.0f, 20.533f)
                curveToRelative(0.0f, 3.505f, 3.034f, 6.4f, 6.842f, 6.4f)
                horizontalLineTo(23.0f)
                verticalLineToRelative(-5.707f)
                lineToRelative(-5.293f, -3.82f)
                lineToRelative(0.586f, -0.811f)
                lineTo(23.0f, 19.993f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(12.774f)
                lineToRelative(6.634f, -7.115f)
                lineToRelative(0.732f, 0.682f)
                lineToRelative(-7.366f, 7.9f)
                close()
            }
        }
            .build()
        return _treeLarge!!
    }

private var _treeLarge: ImageVector? = null
