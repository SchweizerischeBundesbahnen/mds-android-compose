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

public val SBBIcons.CarPowerPlugMedium: ImageVector
    get() {
        if (_carPowerPlugMedium != null) {
            return _carPowerPlugMedium!!
        }
        _carPowerPlugMedium = Builder(name = "CarPowerPlugMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.92f, 5.744f)
                arcTo(2.77f, 2.77f, 0.0f, false, false, 8.744f, 8.92f)
                lineToRelative(0.006f, 0.04f)
                verticalLineToRelative(3.29f)
                horizontalLineToRelative(9.536f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 6.928f, 0.0f)
                horizontalLineToRelative(2.036f)
                lineTo(27.25f, 8.96f)
                lineToRelative(0.007f, -0.04f)
                arcToRelative(2.77f, 2.77f, 0.0f, false, false, -3.177f, -3.176f)
                lineToRelative(-0.04f, 0.006f)
                lineTo(11.96f, 5.75f)
                close()
                moveTo(24.2f, 12.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -4.9f, 0.0f)
                close()
                moveTo(8.75f, 19.75f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(18.5f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(12.039f, 4.75f)
                arcTo(3.77f, 3.77f, 0.0f, false, false, 7.75f, 9.039f)
                verticalLineToRelative(1.71f)
                lineTo(6.0f, 10.749f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-12.0f)
                lineTo(30.0f, 11.749f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.75f)
                lineTo(28.25f, 9.04f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, false, -4.288f, -4.29f)
                close()
                moveTo(8.75f, 22.75f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(23.75f, 22.75f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 16.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(-1.25f, 0.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveTo(24.0f, 16.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(-1.25f, 0.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveToRelative(-2.0f, 10.75f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.464f, 3.0f)
                lineTo(10.5f, 28.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.786f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.464f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.5f)
                lineTo(24.0f, 31.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(-2.0f)
                lineTo(24.0f, 28.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(16.982f, 27.482f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.768f, -0.732f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -1.768f, -4.268f)
            }
        }
        .build()
        return _carPowerPlugMedium!!
    }

private var _carPowerPlugMedium: ImageVector? = null
