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

public val SBBIcons.BusProfileLarge: ImageVector
    get() {
        if (_busProfileLarge != null) {
            return _busProfileLarge!!
        }
        _busProfileLarge = Builder(name = "BusProfileLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(33.264f, 8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 35.5f, 9.382f)
                lineToRelative(6.236f, 12.473f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 42.0f, 22.972f)
                lineTo(42.0f, 32.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                lineTo(21.791f, 35.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -5.291f, 4.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -5.291f, -4.0f)
                lineTo(4.0f, 35.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.023f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 10.953f, 0.0f)
                lineTo(39.5f, 34.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                lineTo(41.0f, 31.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.028f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.158f, -0.67f)
                lineTo(34.606f, 9.829f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 33.264f, 9.0f)
                lineTo(4.0f, 9.0f)
                lineTo(4.0f, 8.0f)
                close()
                moveTo(16.5f, 29.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 0.001f, 9.001f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 16.5f, 29.0f)
                moveToRelative(0.0f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -0.002f, 5.002f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 31.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.001f, 3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 32.0f)
                moveToRelative(15.447f, -19.724f)
                lineTo(38.0f, 24.382f)
                lineTo(38.0f, 27.0f)
                horizontalLineToRelative(-9.0f)
                lineTo(29.0f, 12.0f)
                horizontalLineToRelative(2.809f)
                close()
                moveTo(30.0f, 26.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.382f)
                lineTo(31.191f, 13.0f)
                lineTo(30.0f, 13.0f)
                close()
                moveTo(12.0f, 23.0f)
                lineTo(4.0f, 23.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-9.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(26.0f, 23.0f)
                lineTo(15.0f, 23.0f)
                lineTo(15.0f, 12.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(16.0f, 22.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _busProfileLarge!!
    }

private var _busProfileLarge: ImageVector? = null
