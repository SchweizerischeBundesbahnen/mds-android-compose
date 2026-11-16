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

public val SBBIcons.TimetableArrowsCircleMedium: ImageVector
    get() {
        if (_timetableArrowsCircleMedium != null) {
            return _timetableArrowsCircleMedium!!
        }
        _timetableArrowsCircleMedium = Builder(name = "TimetableArrowsCircleMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.5f, 5.75f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 4.75f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(22.5f, 5.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(22.5f, 9.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(33.0f, 10.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 4.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(13.5f, 10.25f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 9.25f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(13.5f, 13.75f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 14.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(13.5f, 19.25f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 18.25f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(13.5f, 22.75f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 23.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(13.5f, 28.25f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 27.25f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(24.751f, 15.25f)
                curveToRelative(1.526f, 0.003f, 3.187f, 0.515f, 4.618f, 1.354f)
                curveToRelative(0.9f, 0.526f, 1.727f, 1.193f, 2.381f, 1.965f)
                lineTo(31.75f, 16.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.25f)
                lineTo(28.5f, 20.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.893f)
                curveToRelative(-0.597f, -0.886f, -1.49f, -1.675f, -2.529f, -2.283f)
                curveToRelative(-1.307f, -0.766f, -2.796f, -1.214f, -4.115f, -1.217f)
                curveToRelative(-3.84f, -0.007f, -6.99f, 2.545f, -6.998f, 6.251f)
                lineToRelative(-1.0f, -0.002f)
                curveToRelative(0.009f, -4.387f, 3.746f, -7.257f, 8.0f, -7.249f)
                moveTo(21.0f, 25.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.984f)
                curveToRelative(1.163f, 2.181f, 3.944f, 3.5f, 6.734f, 3.5f)
                curveToRelative(3.842f, 0.0f, 7.0f, -2.551f, 7.0f, -6.256f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 4.39f, -3.748f, 7.256f, -8.0f, 7.256f)
                curveToRelative(-2.632f, 0.0f, -5.414f, -1.082f, -7.0f, -3.086f)
                verticalLineToRelative(1.84f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.75f, 25.75f)
                close()
            }
        }
        .build()
        return _timetableArrowsCircleMedium!!
    }

private var _timetableArrowsCircleMedium: ImageVector? = null
