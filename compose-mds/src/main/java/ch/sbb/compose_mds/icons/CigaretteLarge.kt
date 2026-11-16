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
                moveTo(40.5f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 43.0f, 6.5f)
                curveToRelative(0.0f, 0.823f, -0.4f, 1.552f, -1.019f, 2.008f)
                lineToRelative(-0.127f, 0.088f)
                lineToRelative(-0.34f, 0.22f)
                lineToRelative(0.146f, 0.379f)
                curveToRelative(0.211f, 0.549f, 0.34f, 1.156f, 0.34f, 1.805f)
                curveToRelative(0.0f, 1.162f, -0.377f, 2.19f, -0.956f, 2.912f)
                lineToRelative(-0.303f, 0.38f)
                lineToRelative(0.369f, 0.314f)
                arcTo(2.48f, 2.48f, 0.0f, false, true, 42.0f, 16.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                curveToRelative(0.0f, -0.542f, 0.178f, -1.042f, 0.477f, -1.456f)
                lineToRelative(0.27f, -0.374f)
                lineToRelative(-0.351f, -0.3f)
                curveToRelative(-0.82f, -0.697f, -1.396f, -1.927f, -1.397f, -3.37f)
                curveToRelative(0.0f, -0.192f, 0.022f, -0.38f, 0.048f, -0.602f)
                lineToRelative(0.001f, -0.008f)
                lineToRelative(0.048f, -0.403f)
                lineToRelative(-0.386f, -0.13f)
                arcTo(2.49f, 2.49f, 0.0f, false, true, 34.0f, 7.5f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, true, 1.682f, -2.35f)
                lineToRelative(0.368f, -0.127f)
                lineToRelative(-0.035f, -0.389f)
                lineToRelative(-0.007f, -0.065f)
                lineToRelative(-0.003f, -0.024f)
                quadToRelative(0.0f, -0.01f, -0.003f, -0.02f)
                lineTo(36.0f, 4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.885f, -0.575f)
                lineToRelative(0.193f, 0.462f)
                lineToRelative(0.462f, -0.193f)
                curveToRelative(0.296f, -0.124f, 0.62f, -0.193f, 0.96f, -0.193f)
                moveToRelative(0.544f, 9.912f)
                lineToRelative(0.39f, 0.312f)
                close()
                moveTo(35.518f, 4.678f)
                lineTo(35.682f, 5.151f)
                close()
                moveTo(42.718f, 9.201f)
                arcTo(3.48f, 3.48f, 0.0f, false, false, 44.0f, 6.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -4.416f, -3.378f)
                arcToRelative(2.498f, 2.498f, 0.0f, false, false, -4.577f, 1.227f)
                arcTo(3.48f, 3.48f, 0.0f, false, false, 33.0f, 7.499f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, 2.016f, 3.153f)
                quadTo(35.0f, 10.82f, 35.0f, 11.0f)
                curveToRelative(0.0f, 1.52f, 0.546f, 2.903f, 1.433f, 3.831f)
                arcToRelative(3.45f, 3.45f, 0.0f, false, false, -0.433f, 1.67f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                curveToRelative(0.0f, -0.905f, -0.35f, -1.718f, -0.908f, -2.333f)
                curveToRelative(0.57f, -0.868f, 0.908f, -1.972f, 0.908f, -3.168f)
                curveToRelative(0.0f, -0.64f, -0.105f, -1.244f, -0.28f, -1.8f)
                moveTo(43.0f, 23.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(39.0f, 23.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
                moveTo(17.0f, 23.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(4.0f)
                lineTo(17.0f, 27.0f)
                close()
                moveTo(16.0f, 27.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(5.0f, 23.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 27.0f)
                close()
                moveTo(44.0f, 26.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                lineTo(4.0f, 28.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(38.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _cigaretteLarge!!
    }

private var _cigaretteLarge: ImageVector? = null
