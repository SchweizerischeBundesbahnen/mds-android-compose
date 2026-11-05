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

public val SBBIcons.DriverlessBusProfileLarge: ImageVector
    get() {
        if (_driverlessBusProfileLarge != null) {
            return _driverlessBusProfileLarge!!
        }
        _driverlessBusProfileLarge = Builder(
            name = "DriverlessBusProfileLarge",
            defaultWidth =
                48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight =
            48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(5.0f, 35.499f)
                curveToRelative(0.0f, 3.592f, 2.91f, 6.5f, 6.5f, 6.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -7.5f, -7.5f)
                close()
                moveTo(43.0f, 35.499f)
                curveToRelative(0.0f, 4.144f, -3.358f, 7.5f, -7.5f, 7.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(3.59f, 0.0f, 6.5f, -2.908f, 6.5f, -6.5f)
                close()
                moveTo(9.0f, 35.499f)
                curveToRelative(0.0f, 1.382f, 1.118f, 2.5f, 2.5f, 2.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, -3.5f)
                close()
                moveTo(39.0f, 35.499f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, 3.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                close()
                moveTo(38.5f, 9.999f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(-4.338f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -6.324f, 0.0f)
                lineTo(16.663f, 32.999f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.163f, 2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.163f, -2.0f)
                lineTo(6.0f, 32.999f)
                verticalLineToRelative(-20.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                close()
                moveTo(13.5f, 28.999f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(20.0f, 0.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                moveToRelative(-25.0f, -18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(3.036f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 6.928f, 0.0f)
                horizontalLineToRelative(13.072f)
                arcToRelative(3.501f, 3.501f, 0.0f, true, true, 6.964f, -0.5f)
                quadToRelative(0.0f, 0.255f, -0.036f, 0.5f)
                lineTo(40.0f, 31.999f)
                verticalLineToRelative(-19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(17.0f, 25.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(10.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(27.0f, 25.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(20.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(37.0f, 25.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(30.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(11.0f, 24.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(21.0f, 24.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(31.0f, 24.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
            .build()
        return _driverlessBusProfileLarge!!
    }

private var _driverlessBusProfileLarge: ImageVector? = null
