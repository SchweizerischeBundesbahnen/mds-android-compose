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

public val SBBIcons.BusStopLarge: ImageVector
    get() {
        if (_busStopLarge != null) {
            return _busStopLarge!!
        }
        _busStopLarge = Builder(name = "BusStopLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.998f, 9.0f)
                horizontalLineToRelative(-1.996f)
                verticalLineToRelative(35.002f)
                horizontalLineToRelative(-1.0f)
                lineTo(41.002f, 9.0f)
                lineTo(18.0f, 9.0f)
                verticalLineToRelative(35.002f)
                horizontalLineToRelative(-1.0f)
                lineTo(17.0f, 9.0f)
                horizontalLineToRelative(-2.002f)
                lineTo(14.998f, 4.0f)
                horizontalLineToRelative(29.0f)
                close()
                moveTo(14.0f, 25.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(19.0f)
                lineTo(9.0f, 44.0f)
                lineTo(9.0f, 25.0f)
                lineTo(5.0f, 25.0f)
                lineTo(5.0f, 14.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(36.0f, 32.999f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(28.0f, 31.999f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(6.0f, 24.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-9.0f)
                lineTo(6.0f, 15.0f)
                close()
                moveTo(12.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(31.5f, 14.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.001f, 4.999f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 31.5f, 14.0f)
                moveTo(12.0f, 18.0f)
                lineTo(7.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(31.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 31.5f, 15.0f)
                moveTo(15.998f, 8.0f)
                horizontalLineToRelative(27.0f)
                lineTo(42.998f, 5.0f)
                horizontalLineToRelative(-27.0f)
                close()
            }
        }
        .build()
        return _busStopLarge!!
    }

private var _busStopLarge: ImageVector? = null
