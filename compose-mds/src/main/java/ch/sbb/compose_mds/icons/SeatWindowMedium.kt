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
                moveTo(10.75f, 9.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 3.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 5.5f, 0.0f)
                moveTo(10.1f, 27.25f)
                lineTo(21.0f, 27.25f)
                verticalLineToRelative(1.0f)
                lineTo(9.4f, 28.25f)
                lineToRelative(-0.12f, -0.33f)
                lineToRelative(-6.0f, -16.5f)
                lineToRelative(0.94f, -0.34f)
                close()
                moveTo(12.03f, 14.075f)
                lineTo(11.909f, 13.75f)
                lineTo(7.852f, 13.75f)
                lineToRelative(0.24f, 0.668f)
                lineToRelative(3.75f, 10.5f)
                lineToRelative(0.117f, 0.332f)
                horizontalLineToRelative(9.797f)
                lineToRelative(3.736f, 7.291f)
                lineToRelative(0.89f, -0.456f)
                lineToRelative(-3.875f, -7.562f)
                lineToRelative(-0.14f, -0.273f)
                horizontalLineToRelative(-9.702f)
                lineToRelative(-3.394f, -9.5f)
                horizontalLineToRelative(1.944f)
                lineToRelative(2.128f, 5.69f)
                lineToRelative(0.122f, 0.325f)
                horizontalLineToRelative(6.003f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.31f)
                close()
                moveTo(31.248f, 6.25f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-14.5f)
                verticalLineToRelative(-10.0f)
                close()
                moveTo(17.748f, 15.25f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(-2.296f)
                lineToRelative(-2.497f, -2.497f)
                lineToRelative(-4.5f, 4.5f)
                lineToRelative(-3.001f, -3.0f)
                lineToRelative(-2.502f, 2.5f)
                close()
                moveTo(17.748f, 13.044f)
                lineTo(17.748f, 7.25f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(4.29f)
                lineTo(27.75f, 9.043f)
                lineToRelative(-4.5f, 4.5f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(-0.354f, 0.354f)
                close()
            }
        }
        .build()
        return _seatWindowMedium!!
    }

private var _seatWindowMedium: ImageVector? = null
