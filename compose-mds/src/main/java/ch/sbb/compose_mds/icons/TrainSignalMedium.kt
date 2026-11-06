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
                moveTo(14.325f, 3.25f)
                horizontalLineToRelative(-0.207f)
                lineToRelative(-0.146f, 0.146f)
                lineToRelative(-1.575f, 1.575f)
                lineToRelative(-0.147f, 0.147f)
                verticalLineToRelative(22.764f)
                lineToRelative(0.147f, 0.147f)
                lineToRelative(1.575f, 1.575f)
                lineToRelative(0.146f, 0.146f)
                horizontalLineToRelative(2.632f)
                lineTo(16.75f, 33.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(0.5f)
                lineTo(18.25f, 33.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(2.632f)
                lineToRelative(0.147f, -0.146f)
                lineToRelative(1.575f, -1.575f)
                lineToRelative(0.146f, -0.147f)
                lineTo(23.75f, 5.118f)
                lineToRelative(-0.146f, -0.147f)
                lineToRelative(-1.575f, -1.575f)
                lineToRelative(-0.146f, -0.146f)
                horizontalLineToRelative(-7.558f)
                moveTo(13.25f, 5.532f)
                lineToRelative(1.283f, -1.282f)
                horizontalLineToRelative(6.935f)
                lineToRelative(1.282f, 1.282f)
                verticalLineToRelative(21.936f)
                lineToRelative(-1.282f, 1.282f)
                horizontalLineToRelative(-6.935f)
                lineToRelative(-1.283f, -1.282f)
                close()
                moveTo(18.0f, 7.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                moveTo(15.25f, 9.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.5f, 0.0f)
                moveTo(18.0f, 13.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, -5.5f)
                moveToRelative(0.0f, 8.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.002f, 3.502f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 18.0f, 22.25f)
                moveTo(15.25f, 24.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.502f, 0.002f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 15.25f, 24.0f)
                moveToRelative(10.25f, -6.25f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(10.5f, 17.75f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(4.5f, 17.75f)
                lineTo(6.0f, 17.75f)
                verticalLineToRelative(-1.0f)
                lineTo(4.5f, 16.75f)
                close()
                moveTo(9.354f, 21.354f)
                lineTo(6.354f, 24.354f)
                lineTo(5.646f, 23.646f)
                lineTo(8.646f, 20.646f)
                close()
                moveTo(30.354f, 23.646f)
                lineTo(27.354f, 20.646f)
                lineTo(26.646f, 21.354f)
                lineTo(29.646f, 24.354f)
                close()
                moveTo(6.354f, 10.146f)
                lineTo(9.354f, 13.146f)
                lineTo(8.646f, 13.854f)
                lineTo(5.646f, 10.854f)
                close()
                moveTo(31.5f, 17.75f)
                lineTo(30.0f, 17.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(27.354f, 13.854f)
                lineTo(30.354f, 10.854f)
                lineTo(29.646f, 10.146f)
                lineTo(26.646f, 13.146f)
                close()
            }
        }
        .build()
        return _trainSignalMedium!!
    }

private var _trainSignalMedium: ImageVector? = null
