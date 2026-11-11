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

public val SBBIcons.MedalLarge: ImageVector
    get() {
        if (_medalLarge != null) {
            return _medalLarge!!
        }
        _medalLarge = Builder(name = "MedalLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.966f, 3.317f)
                lineTo(18.841f, 3.0f)
                horizontalLineToRelative(-8.073f)
                lineToRelative(0.266f, 0.683f)
                lineToRelative(9.0f, 23.0f)
                lineToRelative(0.046f, 0.115f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 14.0f, 36.0f)
                curveToRelative(0.0f, 5.523f, 4.477f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.477f, 10.0f, -10.0f)
                curveToRelative(0.0f, -4.131f, -2.505f, -7.678f, -6.08f, -9.202f)
                lineToRelative(0.046f, -0.115f)
                lineToRelative(9.0f, -23.0f)
                lineTo(37.233f, 3.0f)
                horizontalLineToRelative(-8.074f)
                lineToRelative(-0.125f, 0.317f)
                lineTo(24.0f, 16.182f)
                close()
                moveTo(24.0f, 27.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 0.0f, 18.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, -18.0f)
                moveToRelative(3.158f, -1.0f)
                horizontalLineToRelative(-2.425f)
                lineToRelative(8.609f, -22.0f)
                horizontalLineToRelative(2.425f)
                close()
                moveTo(22.716f, 22.21f)
                lineTo(24.466f, 17.737f)
                lineTo(29.842f, 4.0f)
                horizontalLineToRelative(2.425f)
                lineToRelative(-8.609f, 22.0f)
                horizontalLineToRelative(-2.425f)
                close()
                moveTo(21.713f, 22.027f)
                lineTo(20.5f, 25.127f)
                lineTo(12.234f, 4.0f)
                horizontalLineToRelative(2.424f)
                close()
                moveTo(23.463f, 17.555f)
                lineTo(22.249f, 20.655f)
                lineTo(15.734f, 4.0f)
                horizontalLineToRelative(2.424f)
                close()
                moveTo(24.0f, 29.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 0.0f, 14.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, -14.0f)
                moveToRelative(0.0f, 15.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                moveToRelative(0.0f, -13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _medalLarge!!
    }

private var _medalLarge: ImageVector? = null
