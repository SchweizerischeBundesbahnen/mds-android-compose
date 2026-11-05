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

public val SBBIcons.ArrowCircleTrainTracksSmall: ImageVector
    get() {
        if (_arrowCircleTrainTracksSmall != null) {
            return _arrowCircleTrainTracksSmall!!
        }
        _arrowCircleTrainTracksSmall = Builder(name = "ArrowCircleTrainTracksSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 9.0f, 9.0f)
                curveToRelative(-3.54f, 0.0f, -6.737f, -2.044f, -8.227f, -5.0f)
                lineTo(6.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.319f)
                curveTo(4.708f, 19.85f, 8.177f, 22.0f, 12.0f, 22.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, -4.477f, 10.0f, -10.0f)
                reflectiveCurveTo(17.523f, 2.0f, 12.0f, 2.0f)
                moveTo(9.011f, 5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.995f)
                horizontalLineToRelative(4.0f)
                lineTo(14.011f, 5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.995f)
                lineTo(16.0f, 6.995f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.989f)
                verticalLineToRelative(2.0f)
                lineTo(16.0f, 9.995f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.989f)
                verticalLineToRelative(2.0f)
                lineTo(16.0f, 12.995f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.989f)
                verticalLineToRelative(2.0f)
                lineTo(16.0f, 15.995f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.989f)
                lineTo(15.011f, 19.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.005f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.011f, 19.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.005f)
                lineTo(8.0f, 16.995f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.011f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 13.995f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.011f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 10.995f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.011f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 7.995f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.011f)
                close()
                moveTo(10.011f, 15.995f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(14.011f, 10.995f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.011f, 9.995f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _arrowCircleTrainTracksSmall!!
    }

private var _arrowCircleTrainTracksSmall: ImageVector? = null
