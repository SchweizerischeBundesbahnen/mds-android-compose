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

public val SBBIcons.NarcoticLarge: ImageVector
    get() {
        if (_narcoticLarge != null) {
            return _narcoticLarge!!
        }
        _narcoticLarge = Builder(name = "NarcoticLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.794f, 6.924f)
                arcToRelative(6.566f, 6.566f, 0.0f, true, true, 9.287f, 9.285f)
                lineTo(18.283f, 27.006f)
                quadToRelative(0.108f, -0.004f, 0.216f, -0.005f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, -8.5f, 8.5f)
                curveToRelative(0.0f, -1.259f, 0.29f, -2.441f, 0.785f, -3.506f)
                arcTo(6.566f, 6.566f, 0.0f, false, true, 5.926f, 20.79f)
                close()
                moveTo(38.999f, 10.997f)
                horizontalLineToRelative(2.0f)
                lineTo(40.999f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(-3.998f)
                lineTo(39.0f, 43.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                lineTo(33.0f, 44.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(0.002f, -7.0f)
                lineTo(34.0f, 36.0f)
                lineTo(34.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.003f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.002f, -6.498f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(11.02f, 36.004f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 14.962f, 0.0f)
                close()
                moveTo(18.498f, 28.0f)
                quadToRelative(-0.683f, 0.001f, -1.334f, 0.123f)
                lineToRelative(-1.627f, 1.628f)
                lineToRelative(-0.326f, 0.325f)
                quadToRelative(-0.106f, 0.107f, -0.217f, 0.206f)
                lineToRelative(-0.066f, 0.058f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.343f, 0.285f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -2.603f, 1.219f)
                arcToRelative(7.4f, 7.4f, 0.0f, false, false, -0.966f, 3.159f)
                horizontalLineToRelative(14.965f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 18.5f, 28.0f)
                moveTo(35.0f, 18.999f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(35.0f, 23.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.0f)
                lineTo(42.0f, 16.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(6.632f, 21.497f)
                arcToRelative(5.566f, 5.566f, 0.0f, false, false, 4.723f, 9.447f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.22f, -0.04f)
                arcToRelative(5.58f, 5.58f, 0.0f, false, false, 2.861f, -1.47f)
                lineToRelative(0.068f, -0.065f)
                lineToRelative(2.06f, -2.061f)
                lineToRelative(0.107f, -0.107f)
                horizontalLineToRelative(0.002f)
                lineToRelative(4.411f, -4.413f)
                lineToRelative(-7.872f, -7.872f)
                close()
                moveTo(28.374f, 7.631f)
                arcToRelative(5.566f, 5.566f, 0.0f, false, false, -7.873f, 0.0f)
                lineToRelative(-6.58f, 6.578f)
                lineToRelative(7.872f, 7.872f)
                lineToRelative(6.58f, -6.58f)
                arcToRelative(5.567f, 5.567f, 0.0f, false, false, 0.0f, -7.87f)
                moveTo(36.999f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.003f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _narcoticLarge!!
    }

private var _narcoticLarge: ImageVector? = null
