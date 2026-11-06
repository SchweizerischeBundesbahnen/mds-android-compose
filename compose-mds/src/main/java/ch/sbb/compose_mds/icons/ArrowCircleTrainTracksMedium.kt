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

public val SBBIcons.ArrowCircleTrainTracksMedium: ImageVector
    get() {
        if (_arrowCircleTrainTracksMedium != null) {
            return _arrowCircleTrainTracksMedium!!
        }
        _arrowCircleTrainTracksMedium = Builder(name = "ArrowCircleTrainTracksMedium", defaultWidth
                = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 3.25f)
                curveTo(9.854f, 3.25f, 3.25f, 9.854f, 3.25f, 18.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -7.594f, 6.156f, -13.75f, 13.75f, -13.75f)
                reflectiveCurveTo(31.75f, 10.406f, 31.75f, 18.0f)
                reflectiveCurveTo(25.594f, 31.75f, 18.0f, 31.75f)
                curveToRelative(-5.547f, 0.0f, -10.544f, -3.287f, -12.74f, -8.0f)
                lineTo(9.0f, 23.75f)
                verticalLineToRelative(-1.0f)
                lineTo(3.25f, 22.75f)
                verticalLineToRelative(5.75f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.555f)
                curveToRelative(2.305f, 5.19f, 7.73f, 8.805f, 13.75f, 8.805f)
                curveToRelative(8.146f, 0.0f, 14.75f, -6.604f, 14.75f, -14.75f)
                reflectiveCurveTo(26.146f, 3.25f, 18.0f, 3.25f)
                moveTo(13.767f, 7.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.243f)
                horizontalLineToRelative(6.5f)
                lineTo(21.267f, 7.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.243f)
                lineTo(24.0f, 10.743f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.733f)
                verticalLineToRelative(3.5f)
                lineTo(24.0f, 15.243f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.733f)
                verticalLineToRelative(3.5f)
                lineTo(24.0f, 19.743f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.733f)
                verticalLineToRelative(3.5f)
                lineTo(24.0f, 24.243f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.733f)
                lineTo(22.267f, 28.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.257f)
                horizontalLineToRelative(-6.5f)
                lineTo(14.767f, 28.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.257f)
                lineTo(12.0f, 25.243f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.767f)
                verticalLineToRelative(-3.5f)
                lineTo(12.0f, 20.743f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.767f)
                verticalLineToRelative(-3.5f)
                lineTo(12.0f, 16.243f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.767f)
                verticalLineToRelative(-3.5f)
                lineTo(12.0f, 11.743f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.767f)
                close()
                moveTo(14.767f, 24.243f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(21.267f, 16.243f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(14.767f, 15.243f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-6.5f)
                close()
            }
        }
        .build()
        return _arrowCircleTrainTracksMedium!!
    }

private var _arrowCircleTrainTracksMedium: ImageVector? = null
