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
                moveTo(4.38f, 3.25f)
                horizontalLineToRelative(-0.376f)
                lineToRelative(-0.104f, 0.362f)
                arcToRelative(16.7f, 16.7f, 0.0f, false, false, -0.65f, 4.633f)
                arcToRelative(17.59f, 17.59f, 0.0f, false, false, 8.492f, 15.433f)
                lineToRelative(0.517f, -0.856f)
                arcTo(16.59f, 16.59f, 0.0f, false, true, 4.25f, 8.261f)
                verticalLineToRelative(-0.012f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, true, 0.512f, -3.999f)
                horizontalLineToRelative(0.488f)
                curveToRelative(5.003f, 0.0f, 9.488f, 1.573f, 12.364f, 5.068f)
                lineToRelative(0.772f, -0.636f)
                curveTo(15.263f, 4.887f, 10.448f, 3.25f, 5.25f, 3.25f)
                horizontalLineToRelative(-0.87f)
                moveTo(31.8f, 6.676f)
                lineToRelative(-0.066f, -0.442f)
                lineToRelative(-0.447f, 0.016f)
                curveToRelative(-5.157f, 0.19f, -8.87f, 1.543f, -11.516f, 3.522f)
                curveToRelative(-2.645f, 1.98f, -4.184f, 4.558f, -5.042f, 7.134f)
                curveToRelative(-0.857f, 2.573f, -1.038f, 5.151f, -0.967f, 7.16f)
                curveToRelative(0.036f, 1.007f, 0.134f, 1.876f, 0.246f, 2.538f)
                curveToRelative(0.055f, 0.33f, 0.115f, 0.613f, 0.172f, 0.837f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.081f, 0.286f)
                arcToRelative(69.0f, 69.0f, 0.0f, false, false, -2.71f, 5.055f)
                lineToRelative(0.9f, 0.436f)
                quadToRelative(1.234f, -2.55f, 2.67f, -4.98f)
                curveToRelative(5.002f, -0.231f, 8.598f, -1.565f, 11.16f, -3.503f)
                curveToRelative(2.613f, -1.977f, 4.11f, -4.551f, 4.94f, -7.123f)
                curveToRelative(1.563f, -4.847f, 0.771f, -9.744f, 0.602f, -10.795f)
                close()
                moveTo(15.747f, 27.2f)
                curveToRelative(4.488f, -0.306f, 7.673f, -1.555f, 9.93f, -3.263f)
                curveToRelative(2.416f, -1.827f, 3.811f, -4.212f, 4.592f, -6.632f)
                curveToRelative(1.373f, -4.255f, 0.835f, -8.573f, 0.612f, -10.036f)
                curveToRelative(-4.763f, 0.243f, -8.133f, 1.525f, -10.51f, 3.304f)
                curveToRelative(-2.452f, 1.834f, -3.886f, 4.225f, -4.693f, 6.65f)
                curveToRelative(-0.809f, 2.428f, -0.984f, 4.88f, -0.916f, 6.808f)
                curveToRelative(0.034f, 0.963f, 0.128f, 1.789f, 0.232f, 2.407f)
                lineToRelative(0.01f, 0.062f)
                arcToRelative(69.0f, 69.0f, 0.0f, false, true, 12.411f, -14.871f)
                lineToRelative(0.67f, 0.742f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -12.338f, 14.83f)
                moveTo(8.516f, 8.576f)
                arcToRelative(25.6f, 25.6f, 0.0f, false, true, 6.12f, 5.355f)
                lineToRelative(-0.77f, 0.638f)
                arcToRelative(24.6f, 24.6f, 0.0f, false, false, -5.88f, -5.145f)
                close()
            }
        }
        .build()
        return _veganMedium!!
    }

private var _veganMedium: ImageVector? = null
