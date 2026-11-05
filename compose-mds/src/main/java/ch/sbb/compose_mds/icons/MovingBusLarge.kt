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

public val SBBIcons.MovingBusLarge: ImageVector
    get() {
        if (_movingBusLarge != null) {
            return _movingBusLarge!!
        }
        _movingBusLarge = Builder(name = "MovingBusLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.5f, 8.999f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.5f, 5.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-6.998f)
                verticalLineToRelative(-4.0f)
                lineTo(19.0f, 33.999f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.5f, -5.5f)
                close()
                moveTo(13.0f, 36.999f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(29.002f, 36.999f)
                lineTo(34.0f, 36.999f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.998f)
                close()
                moveTo(5.0f, 32.999f)
                lineTo(4.0f, 32.999f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(13.0f, 32.999f)
                horizontalLineToRelative(21.0f)
                lineTo(34.0f, 24.0f)
                lineToRelative(-21.0f, -0.001f)
                close()
                moveTo(43.0f, 32.999f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(9.0f, 30.999f)
                lineTo(8.0f, 30.999f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(39.0f, 30.999f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.5f, 26.999f)
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
                moveToRelative(-12.0f, -18.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.5f)
                verticalLineToRelative(8.5f)
                lineTo(34.0f, 23.0f)
                verticalLineToRelative(-8.501f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, -4.5f)
                close()
                moveTo(11.0f, 20.999f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(35.0f, 20.999f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(29.5f, 13.001f)
                verticalLineToRelative(1.0f)
                lineToRelative(-12.0f, -0.002f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _movingBusLarge!!
    }

private var _movingBusLarge: ImageVector? = null
