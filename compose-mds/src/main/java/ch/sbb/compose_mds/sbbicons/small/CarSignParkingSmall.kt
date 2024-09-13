package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.CarSignParkingSmall: ImageVector
    get() {
        if (_carSignParkingSmall != null) {
            return _carSignParkingSmall!!
        }
        _carSignParkingSmall = Builder(name = "CarSignParkingSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.0f)
                lineTo(5.0f, 10.0f)
                verticalLineToRelative(11.0f)
                lineTo(4.0f, 21.0f)
                lineTo(4.0f, 10.0f)
                lineTo(2.0f, 10.0f)
                lineTo(2.0f, 4.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                lineTo(6.0f, 5.0f)
                close()
                moveTo(11.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.05f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, 4.9f, 0.0f)
                lineTo(20.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(17.915f, 13.0f)
                arcToRelative(1.502f, 1.502f, 0.0f, false, false, -2.83f, 0.0f)
                close()
                moveTo(9.0f, 18.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(8.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.999f)
                verticalLineToRelative(-2.0f)
                lineTo(12.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 21.0f)
                verticalLineToRelative(-8.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(18.001f, 19.0f)
                verticalLineToRelative(1.0f)
                lineTo(20.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(9.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 20.0f)
                close()
                moveTo(10.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.002f, 0.001f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 16.0f)
                moveToRelative(8.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 18.002f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 15.0f)
            }
        }
        .build()
        return _carSignParkingSmall!!
    }

private var _carSignParkingSmall: ImageVector? = null
