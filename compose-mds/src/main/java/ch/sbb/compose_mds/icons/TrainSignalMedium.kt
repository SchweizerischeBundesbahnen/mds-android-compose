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

public val SBBIcons.TrainSignalMedium: ImageVector
    get() {
        if (_trainSignalMedium != null) {
            return _trainSignalMedium!!
        }
        _trainSignalMedium = Builder(name = "TrainSignalMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.75f, 5.118f)
                lineTo(21.882f, 3.25f)
                horizontalLineToRelative(-7.764f)
                lineTo(12.25f, 5.118f)
                verticalLineToRelative(22.764f)
                lineToRelative(1.868f, 1.868f)
                horizontalLineToRelative(2.632f)
                lineTo(16.75f, 33.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(0.5f)
                lineTo(18.25f, 33.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(2.632f)
                lineToRelative(1.868f, -1.868f)
                close()
                moveTo(13.25f, 27.468f)
                lineTo(13.25f, 5.532f)
                lineToRelative(1.283f, -1.282f)
                horizontalLineToRelative(6.935f)
                lineToRelative(1.282f, 1.282f)
                verticalLineToRelative(21.936f)
                lineToRelative(-1.282f, 1.282f)
                horizontalLineToRelative(-6.935f)
                close()
                moveTo(19.75f, 9.0f)
                arcToRelative(1.749f, 1.749f, 0.0f, true, false, -3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.749f, 2.749f, 0.0f, true, true, -5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.5f, 0.0f)
                moveTo(18.0f, 19.25f)
                curveToRelative(1.52f, 0.0f, 2.75f, -1.23f, 2.75f, -2.75f)
                arcToRelative(2.749f, 2.749f, 0.0f, true, false, -5.5f, 0.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 18.0f, 19.25f)
                moveTo(19.75f, 24.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 3.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 5.5f, 0.0f)
                moveToRelative(7.75f, -6.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(10.5f, 16.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(6.0f, 17.75f)
                verticalLineToRelative(-1.0f)
                lineTo(4.5f, 16.75f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(9.354f, 21.354f)
                lineTo(6.354f, 24.354f)
                lineTo(5.646f, 23.647f)
                lineTo(8.646f, 20.647f)
                close()
                moveTo(30.354f, 23.647f)
                lineTo(27.354f, 20.647f)
                lineTo(26.647f, 21.354f)
                lineTo(29.647f, 24.354f)
                close()
                moveTo(9.354f, 13.147f)
                lineTo(8.646f, 13.854f)
                lineTo(5.646f, 10.854f)
                lineTo(6.354f, 10.147f)
                close()
                moveTo(31.5f, 16.75f)
                verticalLineToRelative(1.0f)
                lineTo(30.0f, 17.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(27.354f, 13.854f)
                lineTo(30.354f, 10.854f)
                lineTo(29.647f, 10.147f)
                lineTo(26.647f, 13.147f)
                close()
            }
        }
        .build()
        return _trainSignalMedium!!
    }

private var _trainSignalMedium: ImageVector? = null
