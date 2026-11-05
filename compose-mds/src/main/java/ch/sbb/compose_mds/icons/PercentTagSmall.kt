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

public val SBBIcons.PercentTagSmall: ImageVector
    get() {
        if (_percentTagSmall != null) {
            return _percentTagSmall!!
        }
        _percentTagSmall = Builder(name = "PercentTagSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.5f, 5.0f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.299f)
                lineToRelative(0.141f, -0.263f)
                lineToRelative(3.5f, -6.5f)
                lineToRelative(0.128f, -0.237f)
                lineToRelative(-0.128f, -0.237f)
                lineToRelative(-3.5f, -6.5f)
                lineTo(17.3f, 5.0f)
                lineTo(3.5f, 5.0f)
                moveTo(4.0f, 18.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(12.701f)
                lineToRelative(3.231f, 6.0f)
                lineToRelative(-3.23f, 6.0f)
                close()
                moveTo(8.0f, 9.0f)
                curveToRelative(0.0f, -0.564f, 0.436f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.436f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.436f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.436f, -1.0f, -1.0f)
                moveToRelative(1.0f, -2.0f)
                curveToRelative(-1.116f, 0.0f, -2.0f, 0.884f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.884f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.884f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.884f, -2.0f, -2.0f, -2.0f)
                moveToRelative(3.0f, 8.0f)
                curveToRelative(0.0f, -0.564f, 0.436f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.436f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.436f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.435f, -1.0f, -1.0f)
                moveToRelative(1.0f, -2.0f)
                curveToRelative(-1.116f, 0.0f, -2.0f, 0.883f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.884f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.883f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.884f, -2.0f, -2.0f, -2.0f)
                moveToRelative(-6.354f, 2.647f)
                lineToRelative(8.0f, -8.0f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(-8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _percentTagSmall!!
    }

private var _percentTagSmall: ImageVector? = null
