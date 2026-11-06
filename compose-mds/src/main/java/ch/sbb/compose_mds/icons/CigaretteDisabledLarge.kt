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

public val SBBIcons.CigaretteDisabledLarge: ImageVector
    get() {
        if (_cigaretteDisabledLarge != null) {
            return _cigaretteDisabledLarge!!
        }
        _cigaretteDisabledLarge = Builder(name = "CigaretteDisabledLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(45.354f, 43.646f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(28.294f, 28.0f)
                lineTo(4.0f, 28.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(18.294f)
                lineTo(3.646f, 3.354f)
                lineToRelative(0.707f, -0.707f)
                close()
                moveTo(42.5f, 22.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                lineTo(31.0f, 28.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-4.0f)
                lineTo(26.0f, 23.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(17.0f, 23.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(10.294f)
                lineToRelative(-4.0f, -4.0f)
                close()
                moveTo(5.0f, 27.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.0f)
                lineTo(5.0f, 23.0f)
                close()
                moveTo(14.0f, 27.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(39.0f, 27.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(39.0f, 23.0f)
                close()
                moveTo(37.5f, 2.0f)
                curveToRelative(0.872f, 0.0f, 1.637f, 0.447f, 2.084f, 1.123f)
                quadToRelative(0.44f, -0.121f, 0.916f, -0.122f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 44.0f, 6.5f)
                curveToRelative(0.0f, 1.09f, -0.502f, 2.06f, -1.281f, 2.699f)
                curveToRelative(0.175f, 0.556f, 0.281f, 1.16f, 0.281f, 1.8f)
                curveToRelative(0.0f, 1.196f, -0.338f, 2.3f, -0.908f, 3.169f)
                curveToRelative(0.558f, 0.615f, 0.908f, 1.427f, 0.908f, 2.331f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
                curveToRelative(0.0f, -0.608f, 0.16f, -1.174f, 0.433f, -1.668f)
                curveTo(35.545f, 13.903f, 35.0f, 12.52f, 35.0f, 11.0f)
                quadToRelative(0.0f, -0.18f, 0.016f, -0.35f)
                arcTo(3.48f, 3.48f, 0.0f, false, true, 33.0f, 7.5f)
                curveToRelative(0.0f, -1.4f, 0.826f, -2.592f, 2.007f, -3.15f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 37.5f, 2.0f)
                moveToRelative(0.0f, 1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 36.0f, 4.5f)
                quadToRelative(0.0f, 0.003f, 0.003f, 0.025f)
                lineToRelative(0.003f, 0.02f)
                lineToRelative(0.003f, 0.023f)
                lineToRelative(0.007f, 0.065f)
                lineToRelative(0.035f, 0.389f)
                lineToRelative(-0.368f, 0.128f)
                arcTo(2.49f, 2.49f, 0.0f, false, false, 34.0f, 7.5f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, false, 1.71f, 2.358f)
                lineToRelative(0.387f, 0.129f)
                lineToRelative(-0.048f, 0.403f)
                curveToRelative(-0.027f, 0.226f, -0.049f, 0.416f, -0.049f, 0.61f)
                curveToRelative(0.0f, 1.443f, 0.577f, 2.673f, 1.397f, 3.37f)
                lineToRelative(0.35f, 0.3f)
                lineToRelative(-0.27f, 0.374f)
                arcTo(2.48f, 2.48f, 0.0f, false, false, 37.0f, 16.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                curveToRelative(0.0f, -0.757f, -0.346f, -1.431f, -0.89f, -1.894f)
                lineToRelative(-0.369f, -0.314f)
                lineToRelative(0.304f, -0.38f)
                curveToRelative(0.579f, -0.722f, 0.955f, -1.75f, 0.955f, -2.911f)
                curveToRelative(0.0f, -0.65f, -0.129f, -1.257f, -0.34f, -1.806f)
                lineToRelative(-0.145f, -0.378f)
                lineToRelative(0.34f, -0.22f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 43.0f, 6.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.461f, -2.308f)
                lineToRelative(-0.462f, 0.193f)
                lineToRelative(-0.192f, -0.462f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 37.5f, 3.0f)
            }
        }
        .build()
        return _cigaretteDisabledLarge!!
    }

private var _cigaretteDisabledLarge: ImageVector? = null
