package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.PercentTagLarge: ImageVector
    get() {
        if (_percentTagLarge != null) {
            return _percentTagLarge!!
        }
        _percentTagLarge = Builder(name = "PercentTagLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(33.94f, 10.263f)
                lineToRelative(7.0f, 13.0f)
                lineToRelative(0.128f, 0.237f)
                lineToRelative(-0.128f, 0.237f)
                lineToRelative(-7.0f, 13.0f)
                lineTo(33.8f, 37.0f)
                lineTo(6.0f, 37.0f)
                lineTo(6.0f, 10.0f)
                horizontalLineToRelative(27.799f)
                close()
                moveTo(7.0f, 36.0f)
                horizontalLineToRelative(26.201f)
                lineToRelative(6.73f, -12.5f)
                lineToRelative(-6.73f, -12.5f)
                lineTo(7.0f, 11.0f)
                close()
                moveTo(25.5f, 26.001f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, 3.5f, 3.5f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, -3.5f, 3.5f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, -3.5f, -3.5f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, 3.5f, -3.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.47f, 2.47f, 0.0f, false, false, -2.5f, 2.5f)
                curveToRelative(0.0f, 1.404f, 1.096f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.096f, 2.5f, -2.5f)
                arcToRelative(2.47f, 2.47f, 0.0f, false, false, -2.5f, -2.5f)
                moveToRelative(4.354f, -11.147f)
                lineToRelative(-16.0f, 16.0f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(16.0f, -16.0f)
                close()
                moveTo(35.5f, 22.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-18.0f, -9.0f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, 3.5f, 3.5f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, -3.5f, 3.5f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, -3.5f, -3.5f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, 3.5f, -3.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.47f, 2.47f, 0.0f, false, false, -2.5f, 2.5f)
                arcToRelative(2.47f, 2.47f, 0.0f, false, false, 2.5f, 2.5f)
                arcToRelative(2.47f, 2.47f, 0.0f, false, false, 2.5f, -2.5f)
                arcToRelative(2.47f, 2.47f, 0.0f, false, false, -2.5f, -2.5f)
            }
        }
        .build()
        return _percentTagLarge!!
    }

private var _percentTagLarge: ImageVector? = null
