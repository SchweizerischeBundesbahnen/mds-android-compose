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

public val SBBIcons.ArrowCircleTimeMedium: ImageVector
    get() {
        if (_arrowCircleTimeMedium != null) {
            return _arrowCircleTimeMedium!!
        }
        _arrowCircleTimeMedium = Builder(name = "ArrowCircleTimeMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.5f, 13.75f)
                horizontalLineTo(7.488f)
                curveTo(9.166f, 9.987f, 13.404f, 7.25f, 18.0f, 7.25f)
                curveToRelative(6.249f, 0.0f, 10.75f, 4.501f, 10.75f, 10.75f)
                reflectiveCurveTo(24.249f, 28.75f, 18.0f, 28.75f)
                curveToRelative(-5.253f, 0.0f, -9.247f, -3.181f, -10.405f, -7.87f)
                lineToRelative(-0.97f, 0.24f)
                curveTo(7.897f, 26.27f, 12.303f, 29.75f, 18.0f, 29.75f)
                curveToRelative(6.801f, 0.0f, 11.75f, -4.949f, 11.75f, -11.75f)
                reflectiveCurveTo(24.801f, 6.25f, 18.0f, 6.25f)
                curveToRelative(-4.434f, 0.0f, -8.596f, 2.353f, -10.75f, 5.82f)
                verticalLineTo(7.516f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(7.235f)
                horizontalLineToRelative(7.25f)
                close()
                moveTo(16.75f, 12.0f)
                verticalLineToRelative(7.25f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.25f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _arrowCircleTimeMedium!!
    }

private var _arrowCircleTimeMedium: ImageVector? = null
