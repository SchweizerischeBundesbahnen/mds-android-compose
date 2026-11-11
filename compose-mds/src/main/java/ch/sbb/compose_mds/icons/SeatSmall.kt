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
                moveTo(9.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                moveTo(8.85f, 18.0f)
                lineTo(16.0f, 18.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.15f, 19.0f)
                lineToRelative(-0.12f, -0.33f)
                lineToRelative(-4.0f, -11.0f)
                lineToRelative(0.94f, -0.34f)
                close()
                moveTo(10.179f, 9.325f)
                lineTo(10.057f, 9.0f)
                lineTo(7.0f, 9.0f)
                lineToRelative(0.24f, 0.668f)
                lineToRelative(2.5f, 7.0f)
                lineToRelative(0.117f, 0.332f)
                horizontalLineToRelative(6.547f)
                lineToRelative(2.44f, 4.768f)
                lineToRelative(0.891f, -0.456f)
                lineToRelative(-2.58f, -5.04f)
                lineToRelative(-0.14f, -0.272f)
                horizontalLineToRelative(-6.453f)
                lineTo(8.42f, 10.0f)
                horizontalLineToRelative(0.944f)
                lineToRelative(1.378f, 3.685f)
                lineToRelative(0.122f, 0.325f)
                horizontalLineToRelative(4.116f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.422f)
                close()
            }
        }
        .build()
        return _seatSmall!!
    }

private var _seatSmall: ImageVector? = null
