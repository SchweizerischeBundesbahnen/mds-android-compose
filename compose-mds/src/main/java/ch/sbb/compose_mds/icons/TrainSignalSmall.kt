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
                moveTo(9.55f, 2.0f)
                horizontalLineToRelative(-0.207f)
                lineToRelative(-0.146f, 0.146f)
                lineToRelative(-1.05f, 1.05f)
                lineTo(8.0f, 3.343f)
                verticalLineToRelative(15.314f)
                lineToRelative(0.147f, 0.147f)
                lineToRelative(1.05f, 1.05f)
                lineToRelative(0.146f, 0.146f)
                lineTo(11.0f, 20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.657f)
                lineToRelative(0.147f, -0.146f)
                lineToRelative(1.05f, -1.05f)
                lineToRelative(0.146f, -0.147f)
                lineTo(16.0f, 3.343f)
                lineToRelative(-0.146f, -0.147f)
                lineToRelative(-1.05f, -1.05f)
                lineTo(14.657f, 2.0f)
                lineTo(9.55f, 2.0f)
                moveTo(9.0f, 3.757f)
                lineTo(9.757f, 3.0f)
                horizontalLineToRelative(4.486f)
                lineToRelative(0.757f, 0.757f)
                verticalLineToRelative(14.486f)
                lineToRelative(-0.757f, 0.757f)
                lineTo(9.757f, 19.0f)
                lineTo(9.0f, 18.243f)
                close()
                moveTo(12.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(2.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                moveToRelative(0.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.001f, 2.001f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 15.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.001f, 0.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 16.0f)
                moveToRelative(7.0f, -4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(7.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(3.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 11.0f)
                close()
                moveTo(6.354f, 14.354f)
                lineTo(4.354f, 16.354f)
                lineTo(3.646f, 15.646f)
                lineTo(5.646f, 13.646f)
                close()
                moveTo(20.354f, 15.646f)
                lineTo(18.354f, 13.646f)
                lineTo(17.646f, 14.354f)
                lineTo(19.646f, 16.354f)
                close()
                moveTo(4.354f, 6.646f)
                lineTo(6.354f, 8.646f)
                lineTo(5.646f, 9.354f)
                lineTo(3.646f, 7.354f)
                close()
                moveTo(21.0f, 12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(18.354f, 9.354f)
                lineTo(20.354f, 7.354f)
                lineTo(19.646f, 6.646f)
                lineTo(17.646f, 8.646f)
                close()
            }
        }
        .build()
        return _trainSignalSmall!!
    }

private var _trainSignalSmall: ImageVector? = null
