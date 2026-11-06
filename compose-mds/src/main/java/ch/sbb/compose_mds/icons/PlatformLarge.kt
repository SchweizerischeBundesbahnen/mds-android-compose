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

public val SBBIcons.PlatformLarge: ImageVector
    get() {
        if (_platformLarge != null) {
            return _platformLarge!!
        }
        _platformLarge = Builder(name = "PlatformLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.006f, 4.0f)
                curveToRelative(-1.098f, 0.0f, -2.0f, 0.902f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(11.0f)
                lineTo(34.006f, 9.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(32.006f, 8.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(27.0f)
                horizontalLineToRelative(-21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(23.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(42.006f, 8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(44.006f, 4.0f)
                horizontalLineToRelative(-24.0f)
                moveToRelative(21.0f, 31.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(40.006f, 8.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(19.006f, 36.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-24.0f)
                close()
                moveTo(31.006f, 8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(26.006f, 8.0f)
                close()
                moveTo(19.006f, 6.0f)
                curveToRelative(0.0f, -0.546f, 0.454f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(23.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-24.0f)
                close()
                moveTo(4.0f, 8.0f)
                horizontalLineToRelative(6.006f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.64f)
                lineTo(5.7f, 14.0f)
                horizontalLineToRelative(5.296f)
                curveToRelative(1.58f, 0.0f, 2.854f, 0.388f, 3.732f, 1.241f)
                curveToRelative(0.88f, 0.856f, 1.278f, 2.099f, 1.278f, 3.626f)
                lineTo(16.006f, 38.0f)
                lineTo(11.85f, 38.0f)
                lineToRelative(1.09f, 2.0f)
                horizontalLineToRelative(2.067f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.521f)
                lineToRelative(0.96f, 1.76f)
                lineToRelative(-0.878f, 0.48f)
                lineTo(12.346f, 41.0f)
                lineTo(4.0f, 41.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.8f)
                lineToRelative(-1.09f, -2.0f)
                lineTo(4.006f, 38.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                lineTo(15.006f, 27.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-7.133f)
                curveToRelative(0.0f, -1.363f, -0.353f, -2.304f, -0.975f, -2.909f)
                curveToRelative(-0.625f, -0.607f, -1.606f, -0.958f, -3.035f, -0.958f)
                lineTo(4.313f, 15.0f)
                lineToRelative(0.219f, -0.658f)
                lineTo(6.312f, 9.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(11.006f, 30.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.002f, 4.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.006f, 30.0f)
                moveToRelative(-1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.001f, 0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, -0.001f)
                moveToRelative(-2.0f, -15.0f)
                lineTo(4.002f, 17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.004f)
                close()
                moveTo(24.007f, 10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _platformLarge!!
    }

private var _platformLarge: ImageVector? = null
