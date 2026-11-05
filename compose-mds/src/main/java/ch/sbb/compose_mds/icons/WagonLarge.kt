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

public val SBBIcons.WagonLarge: ImageVector
    get() {
        if (_wagonLarge != null) {
            return _wagonLarge!!
        }
        _wagonLarge = Builder(name = "WagonLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.5f, 20.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                horizontalLineToRelative(0.002f)
                lineTo(41.002f, 32.0f)
                lineTo(44.0f, 32.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.998f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.045f)
                quadToRelative(0.041f, 0.242f, 0.043f, 0.499f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                curveToRelative(0.0f, -0.172f, 0.017f, -0.338f, 0.043f, -0.499f)
                lineTo(14.957f, 35.0f)
                curveToRelative(0.026f, 0.161f, 0.043f, 0.328f, 0.043f, 0.499f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                quadToRelative(0.002f, -0.258f, 0.043f, -0.499f)
                lineTo(6.0f, 35.0f)
                verticalLineToRelative(-0.5f)
                lineTo(5.999f, 33.0f)
                lineTo(3.0f, 33.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.999f)
                lineToRelative(-0.005f, -9.498f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                close()
                moveTo(9.06f, 35.0f)
                quadToRelative(-0.058f, 0.246f, -0.06f, 0.499f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                quadToRelative(-0.002f, -0.253f, -0.06f, -0.499f)
                close()
                moveTo(33.06f, 35.0f)
                quadToRelative(-0.058f, 0.246f, -0.06f, 0.499f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                quadToRelative(-0.002f, -0.253f, -0.06f, -0.499f)
                close()
                moveTo(8.494f, 21.002f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                lineTo(7.0f, 34.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.999f)
                horizontalLineToRelative(7.0f)
                lineTo(17.0f, 34.0f)
                horizontalLineToRelative(23.002f)
                lineTo(40.002f, 22.5f)
                lineTo(40.0f, 22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(11.0f, 34.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.999f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(37.002f, 31.0f)
                lineTo(20.0f, 31.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(17.002f)
                close()
                moveTo(21.0f, 30.0f)
                horizontalLineToRelative(15.002f)
                verticalLineToRelative(-3.0f)
                lineTo(21.0f, 27.0f)
                close()
            }
        }
        .build()
        return _wagonLarge!!
    }

private var _wagonLarge: ImageVector? = null
