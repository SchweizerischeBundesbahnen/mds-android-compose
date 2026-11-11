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

public val SBBIcons.VegetarianMedium: ImageVector
    get() {
        if (_vegetarianMedium != null) {
            return _vegetarianMedium!!
        }
        _vegetarianMedium = Builder(name = "VegetarianMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(27.37f, 7.12f)
                lineToRelative(-0.07f, -0.444f)
                lineToRelative(-0.067f, -0.443f)
                lineToRelative(-0.446f, 0.017f)
                curveToRelative(-5.157f, 0.19f, -8.871f, 1.543f, -11.517f, 3.522f)
                curveToRelative(-2.645f, 1.98f, -4.184f, 4.558f, -5.042f, 7.134f)
                curveToRelative(-0.856f, 2.572f, -1.037f, 5.151f, -0.967f, 7.16f)
                curveToRelative(0.036f, 1.006f, 0.135f, 1.876f, 0.246f, 2.538f)
                curveToRelative(0.056f, 0.33f, 0.115f, 0.613f, 0.172f, 0.836f)
                quadToRelative(0.039f, 0.154f, 0.082f, 0.287f)
                arcToRelative(69.0f, 69.0f, 0.0f, false, false, -2.711f, 5.055f)
                lineToRelative(0.9f, 0.436f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 2.67f, -4.98f)
                curveToRelative(5.003f, -0.23f, 8.599f, -1.565f, 11.16f, -3.504f)
                curveToRelative(2.613f, -1.976f, 4.11f, -4.55f, 4.94f, -7.123f)
                curveToRelative(1.445f, -4.48f, 0.878f, -9.001f, 0.65f, -10.49f)
                moveTo(11.25f, 27.196f)
                curveToRelative(4.485f, -0.306f, 7.67f, -1.55f, 9.927f, -3.259f)
                curveToRelative(2.416f, -1.827f, 3.81f, -4.212f, 4.591f, -6.632f)
                curveToRelative(1.372f, -4.252f, 0.836f, -8.567f, 0.613f, -10.033f)
                curveToRelative(-4.763f, 0.244f, -8.134f, 1.522f, -10.511f, 3.301f)
                curveToRelative(-2.451f, 1.834f, -3.886f, 4.226f, -4.693f, 6.65f)
                curveToRelative(-0.808f, 2.428f, -0.984f, 4.88f, -0.916f, 6.808f)
                arcToRelative(19.0f, 19.0f, 0.0f, false, false, 0.242f, 2.47f)
                arcToRelative(69.0f, 69.0f, 0.0f, false, true, 12.412f, -14.872f)
                lineToRelative(0.67f, 0.742f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -12.336f, 14.825f)
            }
        }
        .build()
        return _vegetarianMedium!!
    }

private var _vegetarianMedium: ImageVector? = null
