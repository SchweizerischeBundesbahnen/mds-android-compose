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
        _treeLarge = Builder(name = "TreeLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.62f, 13.259f)
                curveTo(10.898f, 13.812f, 8.0f, 16.815f, 8.0f, 20.532f)
                curveToRelative(0.0f, 4.116f, 3.54f, 7.4f, 7.842f, 7.4f)
                horizontalLineTo(23.0f)
                verticalLineToRelative(7.185f)
                lineToRelative(-1.512f, -1.44f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.367f, -3.798f)
                curveToRelative(-0.342f, -0.342f, -0.85f, -0.537f, -1.337f, -0.658f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -1.567f, -0.22f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.756f, -0.009f)
                lineToRelative(-0.042f, 0.002f)
                lineToRelative(-0.074f, 0.004f)
                lineToRelative(-0.032f, 0.002f)
                lineToRelative(-0.01f, 0.001f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.454f, 0.032f)
                lineToRelative(-0.011f, 0.454f)
                verticalLineToRelative(0.009f)
                lineToRelative(-0.001f, 0.004f)
                verticalLineToRelative(0.03f)
                lineToRelative(-0.001f, 0.112f)
                quadToRelative(-0.001f, 0.146f, 0.005f, 0.4f)
                curveToRelative(0.008f, 0.332f, 0.029f, 0.79f, 0.082f, 1.28f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.28f, 1.506f)
                curveToRelative(0.137f, 0.472f, 0.344f, 0.96f, 0.678f, 1.293f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.919f, 0.28f)
                lineTo(23.0f, 36.499f)
                verticalLineTo(43.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineTo(27.933f)
                horizontalLineToRelative(9.79f)
                curveToRelative(3.4f, 0.0f, 6.21f, -2.598f, 6.21f, -5.866f)
                curveToRelative(0.0f, -1.832f, -0.893f, -3.449f, -2.266f, -4.518f)
                curveToRelative(0.4f, -0.71f, 0.634f, -1.518f, 0.634f, -2.383f)
                curveToRelative(0.0f, -2.845f, -2.445f, -5.1f, -5.394f, -5.1f)
                curveToRelative(-0.484f, 0.0f, -0.947f, 0.066f, -1.387f, 0.18f)
                curveToRelative(-0.894f, -3.63f, -4.317f, -6.313f, -8.402f, -6.313f)
                curveToRelative(-4.752f, 0.0f, -8.659f, 3.628f, -8.659f, 8.167f)
                curveToRelative(0.0f, 0.395f, 0.035f, 0.781f, 0.093f, 1.159f)
                moveToRelative(6.128f, 19.714f)
                lineToRelative(-1.403f, -1.335f)
                lineToRelative(-0.69f, 0.724f)
                lineToRelative(1.403f, 1.336f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.472f, -0.284f)
                curveToRelative(-0.154f, -0.154f, -0.304f, -0.445f, -0.426f, -0.865f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.245f, -1.335f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, -0.077f, -1.196f)
                lineToRelative(-0.001f, -0.04f)
                horizontalLineToRelative(0.028f)
                lineToRelative(0.037f, -0.001f)
                curveToRelative(0.33f, -0.008f, 0.778f, -0.007f, 1.252f, 0.022f)
                curveToRelative(0.478f, 0.03f, 0.968f, 0.088f, 1.389f, 0.193f)
                curveToRelative(0.436f, 0.108f, 0.725f, 0.248f, 0.871f, 0.394f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.334f, 2.387f)
                moveTo(24.0f, 26.933f)
                horizontalLineToRelative(9.79f)
                curveToRelative(2.906f, 0.0f, 5.21f, -2.208f, 5.21f, -4.866f)
                curveToRelative(0.0f, -1.631f, -0.866f, -3.08f, -2.21f, -3.97f)
                lineToRelative(-0.428f, -0.282f)
                lineToRelative(0.293f, -0.42f)
                curveToRelative(0.45f, -0.646f, 0.713f, -1.41f, 0.713f, -2.229f)
                curveToRelative(0.0f, -2.235f, -1.937f, -4.1f, -4.394f, -4.1f)
                curveToRelative(-0.558f, 0.0f, -1.091f, 0.108f, -1.591f, 0.29f)
                lineToRelative(-0.564f, 0.205f)
                lineToRelative(-0.1f, -0.591f)
                curveToRelative(-0.58f, -3.398f, -3.7f, -6.037f, -7.534f, -6.037f)
                curveToRelative(-4.26f, 0.0f, -7.659f, 3.237f, -7.659f, 7.167f)
                quadToRelative(0.001f, 0.57f, 0.097f, 1.119f)
                lineToRelative(0.072f, 0.364f)
                lineToRelative(0.127f, 0.562f)
                lineToRelative(-0.573f, 0.046f)
                lineToRelative(-0.041f, -0.498f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(0.042f, 0.498f)
                curveTo(11.723f, 14.48f, 9.0f, 17.219f, 9.0f, 20.533f)
                curveToRelative(0.0f, 3.506f, 3.033f, 6.4f, 6.842f, 6.4f)
                horizontalLineTo(23.0f)
                verticalLineToRelative(-5.706f)
                lineToRelative(-5.293f, -3.82f)
                lineToRelative(0.586f, -0.811f)
                lineTo(23.0f, 19.993f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(12.775f)
                lineToRelative(6.634f, -7.116f)
                lineToRelative(0.732f, 0.682f)
                lineTo(24.0f, 25.24f)
                close()
            }
        }
        .build()
        return _treeLarge!!
    }

private var _treeLarge: ImageVector? = null
