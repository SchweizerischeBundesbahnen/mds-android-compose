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
        _medalLarge = Builder(
            name = "MedalLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(11.5f, 3.0f)
                horizontalLineToRelative(-0.732f)
                lineToRelative(0.266f, 0.682f)
                lineToRelative(9.0f, 23.0f)
                lineToRelative(0.046f, 0.116f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 14.0f, 36.0f)
                curveToRelative(0.0f, 5.523f, 4.477f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.477f, 10.0f, -10.0f)
                curveToRelative(0.0f, -4.131f, -2.505f, -7.678f, -6.08f, -9.202f)
                lineToRelative(0.046f, -0.116f)
                lineToRelative(9.0f, -23.0f)
                lineTo(37.233f, 3.0f)
                horizontalLineToRelative(-8.074f)
                lineToRelative(-0.124f, 0.318f)
                lineTo(24.0f, 16.183f)
                lineTo(18.966f, 3.318f)
                lineTo(18.84f, 3.0f)
                horizontalLineToRelative(-7.34f)
                moveTo(24.0f, 27.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 0.0f, 18.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, -18.0f)
                moveTo(18.16f, 4.0f)
                lineToRelative(5.304f, 13.556f)
                lineToRelative(-1.213f, 3.1f)
                lineTo(15.733f, 4.0f)
                close()
                moveTo(14.66f, 4.0f)
                lineTo(21.714f, 22.028f)
                lineTo(20.501f, 25.128f)
                lineTo(12.233f, 4.0f)
                close()
                moveTo(23.66f, 26.0f)
                horizontalLineToRelative(-2.426f)
                lineToRelative(1.483f, -3.79f)
                lineToRelative(1.75f, -4.472f)
                lineTo(29.84f, 4.0f)
                horizontalLineToRelative(2.427f)
                close()
                moveTo(24.734f, 26.0f)
                lineTo(33.34f, 4.0f)
                horizontalLineToRelative(2.427f)
                lineToRelative(-8.61f, 22.0f)
                close()
                moveTo(17.0f, 36.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 14.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -14.0f, 0.0f)
                moveToRelative(7.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                moveToRelative(0.0f, 3.0f)
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
