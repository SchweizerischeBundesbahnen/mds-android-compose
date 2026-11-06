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

public val SBBIcons.BalconyDoorLarge: ImageVector
    get() {
        if (_balconyDoorLarge != null) {
            return _balconyDoorLarge!!
        }
        _balconyDoorLarge = Builder(name = "BalconyDoorLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.007f, 26.0f)
                lineTo(43.0f, 26.0f)
                verticalLineToRelative(17.0f)
                lineTo(6.0f, 43.0f)
                lineTo(6.0f, 26.0f)
                horizontalLineToRelative(4.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineToRelative(29.007f)
                close()
                moveTo(7.0f, 42.0f)
                horizontalLineToRelative(35.0f)
                verticalLineToRelative(-3.0f)
                lineTo(7.0f, 39.0f)
                close()
                moveTo(7.0f, 38.0f)
                horizontalLineToRelative(3.0f)
                lineTo(10.0f, 27.0f)
                lineTo(7.0f, 27.0f)
                close()
                moveTo(11.0f, 38.0f)
                horizontalLineToRelative(3.0f)
                lineTo(14.0f, 27.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(15.0f, 38.0f)
                horizontalLineToRelative(9.0f)
                lineTo(24.0f, 27.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(25.0f, 38.0f)
                horizontalLineToRelative(9.0f)
                lineTo(34.0f, 27.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(35.0f, 38.0f)
                horizontalLineToRelative(3.007f)
                lineTo(38.007f, 27.0f)
                lineTo(35.0f, 27.0f)
                close()
                moveTo(39.007f, 38.0f)
                lineTo(42.0f, 38.0f)
                lineTo(42.0f, 27.0f)
                horizontalLineToRelative(-2.993f)
                close()
                moveTo(11.0f, 26.0f)
                horizontalLineToRelative(3.0f)
                lineTo(14.0f, 8.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(3.007f)
                lineTo(38.007f, 5.0f)
                lineTo(11.0f, 5.0f)
                close()
                moveTo(15.0f, 26.0f)
                horizontalLineToRelative(9.0f)
                lineTo(24.0f, 9.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(25.0f, 26.0f)
                horizontalLineToRelative(9.0f)
                lineTo(34.0f, 9.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(23.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(27.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _balconyDoorLarge!!
    }

private var _balconyDoorLarge: ImageVector? = null
