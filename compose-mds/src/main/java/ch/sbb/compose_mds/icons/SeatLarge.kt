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

public val SBBIcons.SeatLarge: ImageVector
    get() {
        if (_seatLarge != null) {
            return _seatLarge!!
        }
        _seatLarge = Builder(name = "SeatLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.389f, 18.325f)
                lineToRelative(2.878f, 7.695f)
                horizontalLineToRelative(7.693f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-8.387f)
                lineToRelative(-0.122f, -0.325f)
                lineTo(19.573f, 19.0f)
                horizontalLineTo(16.63f)
                lineToRelative(4.643f, 13.0f)
                horizontalLineToRelative(12.954f)
                lineToRelative(0.14f, 0.273f)
                lineToRelative(5.16f, 10.08f)
                lineToRelative(-0.891f, 0.455f)
                lineTo(33.615f, 33.0f)
                horizontalLineTo(20.566f)
                lineToRelative(-0.118f, -0.332f)
                lineToRelative(-5.0f, -14.0f)
                lineTo(15.21f, 18.0f)
                horizontalLineToRelative(5.057f)
                close()
                moveTo(17.849f, 36.0f)
                horizontalLineTo(33.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(17.15f)
                lineToRelative(-0.12f, -0.33f)
                lineToRelative(-8.0f, -22.0f)
                lineToRelative(0.94f, -0.34f)
                close()
                moveTo(16.5f, 8.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
            }
        }
        .build()
        return _seatLarge!!
    }

private var _seatLarge: ImageVector? = null
