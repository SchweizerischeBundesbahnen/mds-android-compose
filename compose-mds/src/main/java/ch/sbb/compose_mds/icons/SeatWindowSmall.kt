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

public val SBBIcons.SeatWindowSmall: ImageVector
    get() {
        if (_seatWindowSmall != null) {
            return _seatWindowSmall!!
        }
        _seatWindowSmall = Builder(name = "SeatWindowSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                moveTo(6.85f, 18.0f)
                lineTo(14.0f, 18.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.15f, 19.0f)
                lineToRelative(-0.12f, -0.33f)
                lineToRelative(-4.0f, -11.0f)
                lineToRelative(0.94f, -0.34f)
                close()
                moveTo(8.177f, 9.325f)
                lineTo(8.055f, 9.0f)
                lineTo(4.998f, 9.0f)
                lineToRelative(0.24f, 0.668f)
                lineToRelative(2.5f, 7.0f)
                lineToRelative(0.117f, 0.332f)
                horizontalLineToRelative(6.547f)
                lineToRelative(2.444f, 4.77f)
                lineToRelative(0.89f, -0.456f)
                lineToRelative(-2.583f, -5.041f)
                lineToRelative(-0.14f, -0.273f)
                lineTo(8.56f, 16.0f)
                lineToRelative(-2.143f, -6.0f)
                horizontalLineToRelative(0.944f)
                lineToRelative(1.378f, 3.685f)
                lineToRelative(0.122f, 0.325f)
                horizontalLineToRelative(4.118f)
                verticalLineToRelative(-1.0f)
                lineTo(9.555f, 13.01f)
                close()
                moveTo(20.998f, 4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-10.0f)
                lineTo(10.998f, 4.0f)
                close()
                moveTo(15.707f, 10.0f)
                horizontalLineToRelative(4.291f)
                lineTo(19.998f, 8.705f)
                lineTo(18.5f, 7.207f)
                close()
                moveTo(15.293f, 10.0f)
                lineTo(13.499f, 8.206f)
                lineTo(11.998f, 9.707f)
                lineTo(11.998f, 10.0f)
                close()
                moveTo(11.998f, 8.294f)
                lineTo(11.998f, 5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.291f)
                lineTo(18.5f, 5.793f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-0.354f, 0.353f)
                close()
            }
        }
        .build()
        return _seatWindowSmall!!
    }

private var _seatWindowSmall: ImageVector? = null
