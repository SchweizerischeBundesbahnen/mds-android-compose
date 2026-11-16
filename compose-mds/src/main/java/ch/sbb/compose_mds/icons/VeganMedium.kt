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

public val SBBIcons.VeganMedium: ImageVector
    get() {
        if (_veganMedium != null) {
            return _veganMedium!!
        }
        _veganMedium = Builder(name = "VeganMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.386f, 8.683f)
                curveTo(15.262f, 4.887f, 10.446f, 3.25f, 5.249f, 3.25f)
                horizontalLineTo(4.003f)
                lineToRelative(-0.105f, 0.362f)
                arcTo(16.7f, 16.7f, 0.0f, false, false, 3.25f, 8.24f)
                arcToRelative(17.59f, 17.59f, 0.0f, false, false, 8.492f, 15.439f)
                lineToRelative(0.517f, -0.856f)
                arcTo(16.59f, 16.59f, 0.0f, false, true, 4.249f, 8.261f)
                verticalLineToRelative(-0.012f)
                curveToRelative(-0.002f, -1.35f, 0.172f, -2.694f, 0.514f, -3.999f)
                horizontalLineToRelative(0.486f)
                curveToRelative(5.002f, 0.0f, 9.488f, 1.573f, 12.364f, 5.067f)
                close()
                moveTo(31.869f, 7.12f)
                lineToRelative(-0.07f, -0.444f)
                lineToRelative(-0.066f, -0.443f)
                lineToRelative(-0.447f, 0.017f)
                curveToRelative(-5.157f, 0.19f, -8.87f, 1.543f, -11.516f, 3.522f)
                curveToRelative(-2.645f, 1.98f, -4.184f, 4.558f, -5.042f, 7.134f)
                curveToRelative(-0.857f, 2.572f, -1.038f, 5.151f, -0.967f, 7.16f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.246f, 2.538f)
                curveToRelative(0.056f, 0.33f, 0.115f, 0.613f, 0.172f, 0.836f)
                quadToRelative(0.039f, 0.154f, 0.082f, 0.287f)
                arcToRelative(69.0f, 69.0f, 0.0f, false, false, -2.712f, 5.055f)
                lineToRelative(0.9f, 0.436f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 2.671f, -4.98f)
                curveToRelative(5.002f, -0.23f, 8.598f, -1.565f, 11.16f, -3.504f)
                curveToRelative(2.613f, -1.976f, 4.11f, -4.55f, 4.94f, -7.123f)
                curveToRelative(1.445f, -4.48f, 0.878f, -9.001f, 0.65f, -10.49f)
                moveTo(15.75f, 27.196f)
                curveToRelative(4.486f, -0.306f, 7.67f, -1.55f, 9.928f, -3.259f)
                curveToRelative(2.416f, -1.827f, 3.81f, -4.212f, 4.59f, -6.632f)
                curveToRelative(1.372f, -4.252f, 0.837f, -8.567f, 0.613f, -10.033f)
                curveToRelative(-4.763f, 0.244f, -8.133f, 1.522f, -10.51f, 3.301f)
                curveToRelative(-2.451f, 1.834f, -3.886f, 4.226f, -4.693f, 6.65f)
                curveToRelative(-0.809f, 2.428f, -0.984f, 4.88f, -0.916f, 6.808f)
                curveToRelative(0.034f, 0.963f, 0.128f, 1.789f, 0.231f, 2.408f)
                lineToRelative(0.011f, 0.061f)
                arcTo(69.0f, 69.0f, 0.0f, false, true, 27.415f, 11.63f)
                lineToRelative(0.67f, 0.742f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -12.336f, 14.825f)
                moveTo(8.515f, 8.576f)
                arcToRelative(25.6f, 25.6f, 0.0f, false, true, 6.12f, 5.355f)
                lineToRelative(-0.77f, 0.638f)
                arcToRelative(24.6f, 24.6f, 0.0f, false, false, -5.881f, -5.145f)
                close()
            }
        }
        .build()
        return _veganMedium!!
    }

private var _veganMedium: ImageVector? = null
