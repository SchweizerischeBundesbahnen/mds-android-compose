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

public val SBBIcons.CigaretteLarge: ImageVector
    get() {
        if (_cigaretteLarge != null) {
            return _cigaretteLarge!!
        }
        _cigaretteLarge = Builder(name = "CigaretteLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(37.5f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.496f, 2.348f)
                arcTo(3.48f, 3.48f, 0.0f, false, false, 33.0f, 7.5f)
                curveToRelative(0.0f, 1.405f, 0.83f, 2.6f, 2.016f, 3.156f)
                quadToRelative(-0.014f, 0.166f, -0.015f, 0.345f)
                curveToRelative(0.0f, 1.52f, 0.543f, 2.904f, 1.43f, 3.832f)
                arcTo(3.45f, 3.45f, 0.0f, false, false, 36.0f, 16.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 7.0f, 0.0f)
                curveToRelative(0.0f, -0.904f, -0.35f, -1.717f, -0.907f, -2.332f)
                curveToRelative(0.57f, -0.868f, 0.907f, -1.973f, 0.907f, -3.168f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.28f, -1.8f)
                arcTo(3.49f, 3.49f, 0.0f, false, false, 44.0f, 6.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -4.415f, -3.378f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 37.5f, 1.999f)
                moveTo(36.0f, 4.498f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.884f, -0.575f)
                lineToRelative(0.193f, 0.462f)
                lineToRelative(0.461f, -0.193f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 43.0f, 6.5f)
                curveToRelative(0.0f, 0.878f, -0.455f, 1.648f, -1.145f, 2.096f)
                lineToRelative(-0.341f, 0.22f)
                lineToRelative(0.146f, 0.379f)
                curveToRelative(0.211f, 0.549f, 0.34f, 1.156f, 0.34f, 1.805f)
                curveToRelative(0.0f, 1.162f, -0.377f, 2.19f, -0.956f, 2.912f)
                lineToRelative(-0.303f, 0.38f)
                lineToRelative(0.37f, 0.314f)
                arcTo(2.48f, 2.48f, 0.0f, false, true, 42.0f, 16.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                curveToRelative(0.0f, -0.542f, 0.178f, -1.042f, 0.477f, -1.456f)
                lineToRelative(0.27f, -0.374f)
                lineToRelative(-0.351f, -0.3f)
                curveTo(36.576f, 13.674f, 36.0f, 12.444f, 36.0f, 11.0f)
                curveToRelative(0.0f, -0.19f, 0.022f, -0.376f, 0.047f, -0.596f)
                lineToRelative(0.002f, -0.014f)
                lineToRelative(0.047f, -0.403f)
                lineToRelative(-0.385f, -0.129f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, true, -1.712f, -2.359f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, true, 1.683f, -2.35f)
                lineToRelative(0.369f, -0.128f)
                lineToRelative(-0.035f, -0.388f)
                lineToRelative(-0.008f, -0.065f)
                lineToRelative(-0.003f, -0.024f)
                lineToRelative(-0.003f, -0.02f)
                close()
                moveTo(4.0f, 22.0f)
                horizontalLineToRelative(38.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                lineTo(4.0f, 28.0f)
                verticalLineToRelative(-6.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(16.0f, 27.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 27.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(-4.0f)
                lineTo(17.0f, 23.0f)
                close()
                moveTo(42.5f, 27.0f)
                lineTo(39.0f, 27.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
            }
        }
        .build()
        return _cigaretteLarge!!
    }

private var _cigaretteLarge: ImageVector? = null
