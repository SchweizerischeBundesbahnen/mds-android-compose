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

public val SBBIcons.CarSignParkingLarge: ImageVector
    get() {
        if (_carSignParkingLarge != null) {
            return _carSignParkingLarge!!
        }
        _carSignParkingLarge = Builder(name = "CarSignParkingLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                verticalLineToRelative(22.999f)
                lineTo(8.0f, 41.999f)
                lineTo(8.0f, 19.0f)
                lineTo(4.0f, 19.0f)
                lineTo(4.0f, 8.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(35.5f, 15.999f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.5f, 5.5f)
                verticalLineToRelative(2.502f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(15.998f)
                horizontalLineToRelative(-6.998f)
                verticalLineToRelative(-4.0f)
                lineTo(23.0f, 36.999f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(16.0f, 25.001f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.502f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.5f, -5.5f)
                close()
                moveTo(17.0f, 39.999f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(35.002f, 39.999f)
                lineTo(40.0f, 39.999f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.998f)
                close()
                moveTo(17.0f, 35.999f)
                horizontalLineToRelative(23.0f)
                verticalLineToRelative(-8.998f)
                lineTo(17.0f, 27.001f)
                close()
                moveTo(21.5f, 29.999f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(14.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(-14.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(14.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-14.0f, -14.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.5f)
                verticalLineToRelative(4.502f)
                horizontalLineToRelative(11.028f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.472f, -4.002f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.472f, 4.002f)
                lineTo(40.0f, 26.001f)
                verticalLineToRelative(-4.502f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, -4.5f)
                close()
                moveTo(32.5f, 22.999f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.464f, 3.002f)
                horizontalLineToRelative(6.928f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.464f, -3.002f)
                moveTo(5.0f, 18.0f)
                horizontalLineToRelative(7.0f)
                lineTo(12.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                close()
            }
        }
        .build()
        return _carSignParkingLarge!!
    }

private var _carSignParkingLarge: ImageVector? = null
