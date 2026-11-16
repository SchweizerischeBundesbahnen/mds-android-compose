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
                moveTo(17.44f, 5.263f)
                lineTo(17.3f, 5.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.299f)
                lineToRelative(0.141f, -0.262f)
                lineToRelative(3.5f, -6.5f)
                lineToRelative(0.128f, -0.238f)
                lineToRelative(-0.128f, -0.237f)
                close()
                moveTo(16.701f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(12.701f)
                lineToRelative(3.23f, 6.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveToRelative(0.564f, 0.0f, 1.0f, 0.436f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.436f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.436f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.436f, -1.0f, 1.0f, -1.0f)
                moveToRelative(0.0f, 3.0f)
                curveToRelative(1.116f, 0.0f, 2.0f, -0.884f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.884f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.884f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.884f, 2.0f, 2.0f, 2.0f)
                moveToRelative(4.0f, 3.0f)
                curveToRelative(0.564f, 0.0f, 1.0f, 0.436f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.436f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.435f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.564f, 0.436f, -1.0f, 1.0f, -1.0f)
                moveToRelative(0.0f, 3.0f)
                curveToRelative(1.116f, 0.0f, 2.0f, -0.883f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.884f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.883f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.884f, 2.0f, 2.0f, 2.0f)
                moveToRelative(2.354f, -8.646f)
                lineToRelative(-8.0f, 8.0f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(8.0f, -8.0f)
                close()
            }
        }
        .build()
        return _percentTagSmall!!
    }

private var _percentTagSmall: ImageVector? = null
