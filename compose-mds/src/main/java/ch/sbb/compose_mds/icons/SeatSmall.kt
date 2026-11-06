package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.SeatSmall: ImageVector
    get() {
        if (_seatSmall != null) {
            return _seatSmall!!
        }
        _seatSmall = Builder(name = "SeatSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveTo(6.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(2.03f, 12.67f)
                lineToRelative(-4.0f, -11.0f)
                lineToRelative(0.94f, -0.34f)
                lineTo(8.85f, 18.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.15f)
                close()
                moveTo(7.71f, 9.0f)
                horizontalLineTo(7.0f)
                lineToRelative(0.239f, 0.668f)
                lineToRelative(2.5f, 7.0f)
                lineToRelative(0.119f, 0.332f)
                horizontalLineToRelative(6.546f)
                lineToRelative(2.44f, 4.768f)
                lineToRelative(0.891f, -0.456f)
                lineToRelative(-2.58f, -5.04f)
                lineToRelative(-0.14f, -0.272f)
                horizontalLineToRelative(-6.453f)
                lineTo(8.42f, 10.0f)
                horizontalLineToRelative(0.944f)
                lineToRelative(1.379f, 3.685f)
                lineToRelative(0.121f, 0.325f)
                horizontalLineToRelative(4.117f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.423f)
                lineToRelative(-1.379f, -3.685f)
                lineTo(10.057f, 9.0f)
                horizontalLineTo(7.71f)
            }
        }
        .build()
        return _seatSmall!!
    }

private var _seatSmall: ImageVector? = null
