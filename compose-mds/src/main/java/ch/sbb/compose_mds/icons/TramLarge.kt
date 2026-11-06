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

public val SBBIcons.TramLarge: ImageVector
    get() {
        if (_tramLarge != null) {
            return _tramLarge!!
        }
        _tramLarge = Builder(name = "TramLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, 45.0f)
                lineTo(6.0f, 45.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(35.0f)
                close()
                moveTo(27.0f, 9.999f)
                horizontalLineToRelative(4.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.5f, 5.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(-4.565f)
                lineToRelative(3.481f, 5.223f)
                lineToRelative(-0.832f, 0.554f)
                lineTo(31.232f, 37.0f)
                lineTo(15.768f, 37.0f)
                lineToRelative(-3.852f, 5.777f)
                lineToRelative(-0.832f, -0.554f)
                lineToRelative(3.481f, -5.223f)
                lineTo(10.0f, 37.0f)
                verticalLineToRelative(-21.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.5f, -5.5f)
                lineTo(20.0f, 10.0f)
                lineTo(20.0f, 8.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(11.0f, 35.999f)
                horizontalLineToRelative(25.0f)
                verticalLineToRelative(-9.0f)
                lineTo(11.0f, 26.999f)
                close()
                moveTo(17.5f, 29.999f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(12.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(-12.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(12.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-14.0f, -20.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(25.0f)
                verticalLineToRelative(-10.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, -4.5f)
                close()
                moveTo(28.0f, 15.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(21.0f, 9.999f)
                horizontalLineToRelative(5.0f)
                lineTo(26.0f, 9.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _tramLarge!!
    }

private var _tramLarge: ImageVector? = null
