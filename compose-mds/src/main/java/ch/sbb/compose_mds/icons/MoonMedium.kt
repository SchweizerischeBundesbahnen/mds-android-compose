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

public val SBBIcons.MoonMedium: ImageVector
    get() {
        if (_moonMedium != null) {
            return _moonMedium!!
        }
        _moonMedium = Builder(name = "MoonMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(14.588f, 8.084f)
                lineToRelative(-0.586f, 1.613f)
                curveToRelative(-1.123f, 3.087f, -0.08f, 6.91f, 2.358f, 9.62f)
                curveToRelative(2.42f, 2.689f, 6.156f, 4.21f, 10.361f, 2.785f)
                lineToRelative(1.997f, -0.677f)
                lineToRelative(-1.48f, 1.502f)
                curveToRelative(-2.746f, 2.784f, -5.69f, 3.886f, -8.41f, 3.784f)
                curveToRelative(-2.71f, -0.102f, -5.137f, -1.397f, -6.866f, -3.292f)
                curveToRelative(-1.727f, -1.894f, -2.778f, -4.412f, -2.708f, -6.995f)
                curveToRelative(0.07f, -2.597f, 1.272f, -5.22f, 3.973f, -7.295f)
                close()
                moveTo(25.056f, 23.534f)
                curveToRelative(-3.828f, 0.57f, -7.181f, -1.039f, -9.44f, -3.549f)
                curveToRelative(-2.231f, -2.479f, -3.438f, -5.887f, -2.965f, -9.012f)
                curveToRelative(-1.63f, 1.68f, -2.347f, 3.6f, -2.398f, 5.478f)
                curveToRelative(-0.062f, 2.297f, 0.875f, 4.57f, 2.448f, 6.294f)
                reflectiveCurveToRelative(3.756f, 2.876f, 6.165f, 2.966f)
                curveToRelative(1.946f, 0.073f, 4.077f, -0.545f, 6.19f, -2.177f)
            }
        }
        .build()
        return _moonMedium!!
    }

private var _moonMedium: ImageVector? = null
