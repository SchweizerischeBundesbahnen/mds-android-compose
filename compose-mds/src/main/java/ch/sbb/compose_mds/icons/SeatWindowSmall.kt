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
                moveTo(6.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.002f, 1.999f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 5.0f)
                moveTo(4.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 3.998f, -0.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 6.0f)
                moveToRelative(2.85f, 12.0f)
                lineTo(2.97f, 7.33f)
                lineToRelative(-0.94f, 0.34f)
                lineToRelative(4.0f, 11.0f)
                lineToRelative(0.12f, 0.33f)
                lineTo(14.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(5.708f, 9.0f)
                horizontalLineToRelative(-0.71f)
                lineToRelative(0.24f, 0.668f)
                lineToRelative(2.5f, 7.0f)
                lineToRelative(0.118f, 0.332f)
                horizontalLineToRelative(6.546f)
                lineToRelative(2.444f, 4.77f)
                lineToRelative(0.89f, -0.456f)
                lineToRelative(-2.583f, -5.042f)
                lineToRelative(-0.14f, -0.272f)
                lineTo(8.56f, 16.0f)
                lineToRelative(-2.143f, -6.0f)
                horizontalLineToRelative(0.944f)
                lineToRelative(1.379f, 3.685f)
                lineToRelative(0.121f, 0.325f)
                horizontalLineToRelative(4.117f)
                verticalLineToRelative(-1.0f)
                lineTo(9.556f, 13.01f)
                lineTo(8.176f, 9.325f)
                lineTo(8.055f, 9.0f)
                lineTo(5.708f, 9.0f)
                moveToRelative(5.29f, -5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-10.0f)
                lineTo(10.998f, 4.0f)
                moveToRelative(1.0f, 5.707f)
                lineTo(11.998f, 10.0f)
                horizontalLineToRelative(3.295f)
                lineToRelative(-0.147f, -0.146f)
                lineTo(13.5f, 8.207f)
                close()
                moveTo(11.998f, 8.294f)
                lineTo(13.147f, 7.146f)
                lineTo(13.5f, 6.793f)
                lineTo(13.854f, 7.146f)
                lineTo(15.5f, 8.793f)
                lineToRelative(2.646f, -2.647f)
                lineToRelative(0.354f, -0.353f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(1.144f, 1.145f)
                lineTo(19.998f, 5.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(19.998f, 8.705f)
                lineTo(18.5f, 7.207f)
                lineToRelative(-2.646f, 2.647f)
                lineToRelative(-0.147f, 0.146f)
                horizontalLineToRelative(4.291f)
                close()
            }
        }
        .build()
        return _seatWindowSmall!!
    }

private var _seatWindowSmall: ImageVector? = null
