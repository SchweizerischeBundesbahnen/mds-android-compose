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

public val SBBIcons.TrainSignalSmall: ImageVector
    get() {
        if (_trainSignalSmall != null) {
            return _trainSignalSmall!!
        }
        _trainSignalSmall = Builder(name = "TrainSignalSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 3.343f)
                lineTo(14.658f, 2.0f)
                lineTo(9.343f, 2.0f)
                lineTo(8.0f, 3.343f)
                verticalLineToRelative(15.314f)
                lineTo(9.343f, 20.0f)
                lineTo(11.0f, 20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.658f)
                lineTo(16.0f, 18.657f)
                close()
                moveTo(9.757f, 19.0f)
                lineTo(9.0f, 18.243f)
                lineTo(9.0f, 3.757f)
                lineTo(9.757f, 3.0f)
                horizontalLineToRelative(4.486f)
                lineToRelative(0.757f, 0.757f)
                verticalLineToRelative(14.486f)
                lineToRelative(-0.757f, 0.757f)
                close()
                moveTo(13.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.998f, -0.002f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 6.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.999f, 0.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 6.0f)
                moveToRelative(-2.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.001f, -3.999f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 13.0f)
                moveToRelative(1.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                moveToRelative(5.0f, -4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(7.0f, 11.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(4.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.354f, 14.354f)
                lineTo(4.354f, 16.354f)
                lineTo(3.646f, 15.647f)
                lineTo(5.646f, 13.647f)
                close()
                moveTo(20.354f, 15.647f)
                lineTo(18.354f, 13.647f)
                lineTo(17.647f, 14.354f)
                lineTo(19.647f, 16.354f)
                close()
                moveTo(6.354f, 8.647f)
                lineTo(5.646f, 9.354f)
                lineTo(3.646f, 7.354f)
                lineTo(4.354f, 6.646f)
                close()
                moveTo(21.0f, 11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(18.354f, 9.354f)
                lineTo(20.354f, 7.354f)
                lineTo(19.647f, 6.646f)
                lineTo(17.647f, 8.646f)
                close()
            }
        }
        .build()
        return _trainSignalSmall!!
    }

private var _trainSignalSmall: ImageVector? = null
