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
                moveTo(13.75f, 9.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 3.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 5.5f, 0.0f)
                moveTo(13.1f, 27.25f)
                lineTo(24.0f, 27.25f)
                verticalLineToRelative(1.0f)
                lineTo(12.4f, 28.25f)
                lineToRelative(-0.12f, -0.33f)
                lineToRelative(-6.0f, -16.5f)
                lineToRelative(0.94f, -0.34f)
                close()
                moveTo(15.034f, 14.075f)
                lineTo(14.911f, 13.75f)
                horizontalLineToRelative(-4.056f)
                lineToRelative(0.24f, 0.668f)
                lineToRelative(3.75f, 10.5f)
                lineToRelative(0.117f, 0.332f)
                horizontalLineToRelative(9.797f)
                lineToRelative(3.73f, 7.288f)
                lineToRelative(0.891f, -0.456f)
                lineToRelative(-3.87f, -7.56f)
                lineToRelative(-0.14f, -0.272f)
                horizontalLineToRelative(-9.703f)
                lineToRelative(-3.393f, -9.5f)
                horizontalLineToRelative(1.944f)
                lineToRelative(2.128f, 5.69f)
                lineToRelative(0.122f, 0.325f)
                horizontalLineToRelative(6.002f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.308f)
                close()
            }
        }
        .build()
        return _seatMedium!!
    }

private var _seatMedium: ImageVector? = null
