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

public val SBBIcons.TrainSignalLarge: ImageVector
    get() {
        if (_trainSignalLarge != null) {
            return _trainSignalLarge!!
        }
        _trainSignalLarge = Builder(name = "TrainSignalLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(33.0f, 7.793f)
                lineTo(29.207f, 4.0f)
                lineTo(18.793f, 4.0f)
                lineTo(15.0f, 7.793f)
                verticalLineToRelative(25.414f)
                lineTo(18.793f, 37.0f)
                lineTo(22.0f, 37.0f)
                verticalLineToRelative(5.994f)
                horizontalLineToRelative(1.0f)
                lineTo(23.0f, 37.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.994f)
                horizontalLineToRelative(1.0f)
                lineTo(26.0f, 37.0f)
                horizontalLineToRelative(3.207f)
                lineTo(33.0f, 33.207f)
                close()
                moveTo(16.0f, 32.793f)
                lineTo(16.0f, 8.207f)
                lineTo(19.207f, 5.0f)
                horizontalLineToRelative(9.586f)
                lineTo(32.0f, 8.207f)
                verticalLineToRelative(24.586f)
                lineTo(28.793f, 36.0f)
                horizontalLineToRelative(-9.586f)
                close()
                moveTo(31.0f, 8.793f)
                lineTo(28.207f, 6.0f)
                horizontalLineToRelative(-8.414f)
                lineTo(17.0f, 8.793f)
                verticalLineToRelative(23.414f)
                lineTo(19.793f, 35.0f)
                horizontalLineToRelative(8.414f)
                lineTo(31.0f, 32.207f)
                close()
                moveTo(18.0f, 31.793f)
                lineTo(18.0f, 9.207f)
                lineTo(20.207f, 7.0f)
                horizontalLineToRelative(7.586f)
                lineTo(30.0f, 9.207f)
                verticalLineToRelative(22.586f)
                lineTo(27.793f, 34.0f)
                horizontalLineToRelative(-7.586f)
                close()
                moveTo(26.0f, 28.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                moveToRelative(-3.0f, -5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                moveToRelative(2.0f, -11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                moveToRelative(10.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(13.354f, 15.647f)
                lineTo(12.647f, 16.354f)
                lineTo(10.647f, 14.354f)
                lineTo(11.354f, 13.647f)
                close()
                moveTo(35.354f, 16.354f)
                lineTo(37.354f, 14.354f)
                lineTo(36.647f, 13.647f)
                lineTo(34.647f, 15.647f)
                close()
                moveTo(13.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(11.354f, 25.354f)
                lineTo(13.354f, 23.354f)
                lineTo(12.647f, 22.647f)
                lineTo(10.647f, 24.647f)
                close()
                moveTo(36.647f, 25.354f)
                lineTo(34.647f, 23.354f)
                lineTo(35.353f, 22.647f)
                lineTo(37.353f, 24.647f)
                close()
                moveTo(10.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 19.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(39.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _trainSignalLarge!!
    }

private var _trainSignalLarge: ImageVector? = null
