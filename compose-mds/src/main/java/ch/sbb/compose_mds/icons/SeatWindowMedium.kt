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

public val SBBIcons.SeatWindowMedium: ImageVector
    get() {
        if (_seatWindowMedium != null) {
            return _seatWindowMedium!!
        }
        _seatWindowMedium = Builder(name = "SeatWindowMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 7.25f)
                arcToRelative(1.749f, 1.749f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, -3.5f)
                moveTo(6.25f, 9.0f)
                arcToRelative(2.749f, 2.749f, 0.0f, true, true, 5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                moveToRelative(3.85f, 18.25f)
                lineTo(4.22f, 11.08f)
                lineToRelative(-0.94f, 0.34f)
                lineToRelative(6.0f, 16.5f)
                lineToRelative(0.12f, 0.33f)
                lineTo(21.0f, 28.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(8.562f, 13.75f)
                horizontalLineToRelative(-0.71f)
                lineToRelative(0.24f, 0.668f)
                lineToRelative(3.75f, 10.5f)
                lineToRelative(0.118f, 0.332f)
                horizontalLineToRelative(9.796f)
                lineToRelative(3.735f, 7.291f)
                lineToRelative(0.89f, -0.456f)
                lineToRelative(-3.874f, -7.563f)
                lineToRelative(-0.14f, -0.272f)
                horizontalLineToRelative(-9.703f)
                lineToRelative(-3.393f, -9.5f)
                horizontalLineToRelative(1.944f)
                lineToRelative(2.129f, 5.69f)
                lineToRelative(0.121f, 0.325f)
                horizontalLineToRelative(6.003f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.31f)
                lineToRelative(-2.128f, -5.69f)
                lineToRelative(-0.121f, -0.325f)
                lineTo(8.562f, 13.75f)
                moveToRelative(8.185f, -7.5f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-14.5f)
                verticalLineToRelative(-10.0f)
                moveToRelative(1.0f, 8.207f)
                verticalLineToRelative(0.793f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(-2.296f)
                lineToRelative(-2.497f, -2.497f)
                lineToRelative(-4.146f, 4.147f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-2.646f, -2.647f)
                close()
                moveTo(17.747f, 13.044f)
                lineTo(19.897f, 10.896f)
                lineTo(20.25f, 10.543f)
                lineTo(20.604f, 10.896f)
                lineTo(23.25f, 13.543f)
                lineTo(27.396f, 9.396f)
                lineTo(27.75f, 9.043f)
                lineTo(28.104f, 9.396f)
                lineTo(30.247f, 11.54f)
                lineTo(30.247f, 7.25f)
                horizontalLineToRelative(-12.5f)
                close()
            }
        }
        .build()
        return _seatWindowMedium!!
    }

private var _seatWindowMedium: ImageVector? = null
