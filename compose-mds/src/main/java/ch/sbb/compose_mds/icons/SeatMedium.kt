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

public val SBBIcons.SeatMedium: ImageVector
    get() {
        if (_seatMedium != null) {
            return _seatMedium!!
        }
        _seatMedium = Builder(name = "SeatMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 7.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                moveTo(9.25f, 9.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.5f, 0.0f)
                moveToRelative(3.03f, 18.92f)
                lineToRelative(-6.0f, -16.5f)
                lineToRelative(0.94f, -0.34f)
                lineToRelative(5.88f, 16.17f)
                lineTo(24.0f, 27.25f)
                verticalLineToRelative(1.0f)
                lineTo(12.4f, 28.25f)
                close()
                moveTo(11.565f, 13.75f)
                horizontalLineToRelative(-0.71f)
                lineToRelative(0.239f, 0.668f)
                lineToRelative(3.75f, 10.5f)
                lineToRelative(0.119f, 0.332f)
                horizontalLineToRelative(9.796f)
                lineToRelative(3.73f, 7.288f)
                lineToRelative(0.89f, -0.456f)
                lineToRelative(-3.87f, -7.56f)
                lineToRelative(-0.138f, -0.272f)
                horizontalLineToRelative(-9.704f)
                lineToRelative(-3.393f, -9.5f)
                horizontalLineToRelative(1.944f)
                lineToRelative(2.129f, 5.69f)
                lineToRelative(0.121f, 0.325f)
                horizontalLineToRelative(6.002f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.308f)
                lineToRelative(-2.129f, -5.69f)
                lineToRelative(-0.121f, -0.325f)
                horizontalLineToRelative(-3.347f)
            }
        }
        .build()
        return _seatMedium!!
    }

private var _seatMedium: ImageVector? = null
