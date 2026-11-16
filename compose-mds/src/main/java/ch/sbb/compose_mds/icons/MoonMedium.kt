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

public val SBBIcons.MoonMedium: ImageVector
    get() {
        if (_moonMedium != null) {
            return _moonMedium!!
        }
        _moonMedium = Builder(name = "MoonMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.001f, 9.697f)
                curveToRelative(-1.122f, 3.087f, -0.08f, 6.91f, 2.359f, 9.619f)
                curveToRelative(2.42f, 2.69f, 6.156f, 4.212f, 10.361f, 2.786f)
                lineToRelative(1.997f, -0.677f)
                lineToRelative(-1.48f, 1.502f)
                curveToRelative(-2.746f, 2.785f, -5.69f, 3.886f, -8.41f, 3.783f)
                curveToRelative(-2.71f, -0.101f, -5.137f, -1.395f, -6.866f, -3.29f)
                curveToRelative(-1.727f, -1.895f, -2.778f, -4.413f, -2.709f, -6.996f)
                curveToRelative(0.07f, -2.597f, 1.273f, -5.22f, 3.974f, -7.295f)
                lineToRelative(1.361f, -1.045f)
                close()
                moveTo(12.651f, 10.974f)
                curveToRelative(-1.629f, 1.68f, -2.347f, 3.6f, -2.398f, 5.477f)
                curveToRelative(-0.062f, 2.296f, 0.875f, 4.57f, 2.448f, 6.295f)
                curveToRelative(1.571f, 1.723f, 3.756f, 2.875f, 6.165f, 2.965f)
                curveToRelative(1.946f, 0.074f, 4.08f, -0.546f, 6.193f, -2.18f)
                curveToRelative(-3.829f, 0.571f, -7.183f, -1.035f, -9.442f, -3.545f)
                curveToRelative(-2.232f, -2.48f, -3.438f, -5.888f, -2.965f, -9.012f)
            }
        }
        .build()
        return _moonMedium!!
    }

private var _moonMedium: ImageVector? = null
