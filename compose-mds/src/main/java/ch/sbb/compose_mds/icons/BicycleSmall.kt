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

public val SBBIcons.BicycleSmall: ImageVector
    get() {
        if (_bicycleSmall != null) {
            return _bicycleSmall!!
        }
        _bicycleSmall = Builder(name = "BicycleSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.916f, 6.777f)
                lineTo(17.435f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.565f)
                lineToRelative(-1.333f, 2.0f)
                horizontalLineTo(8.65f)
                lineToRelative(-0.119f, 0.329f)
                lineToRelative(-0.643f, 1.77f)
                arcTo(4.004f, 4.004f, 0.0f, false, false, 3.0f, 15.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.174f, -3.559f)
                lineTo(9.35f, 10.0f)
                horizontalLineToRelative(4.828f)
                lineToRelative(0.725f, 1.595f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 17.002f, 19.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                arcToRelative(4.004f, 4.004f, 0.0f, false, false, -5.188f, -3.82f)
                lineToRelative(-0.743f, -1.634f)
                close()
                moveTo(14.001f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.32f, -2.485f)
                lineToRelative(1.225f, 2.691f)
                lineToRelative(0.91f, -0.413f)
                lineToRelative(-1.224f, -2.693f)
                quadTo(16.6f, 12.0f, 17.0f, 12.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-1.655f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                moveToRelative(-6.46f, -2.951f)
                lineToRelative(-1.01f, 2.78f)
                lineToRelative(0.939f, 0.341f)
                lineToRelative(1.01f, -2.779f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 10.0f, 15.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                arcToRelative(3.004f, 3.004f, 0.0f, false, true, 3.541f, -2.951f)
                moveTo(10.001f, 8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.209f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _bicycleSmall!!
    }

private var _bicycleSmall: ImageVector? = null
