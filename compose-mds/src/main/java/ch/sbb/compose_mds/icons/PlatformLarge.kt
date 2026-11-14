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
                moveTo(26.005f, 8.0f)
                horizontalLineToRelative(5.001f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(44.006f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(27.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-23.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(21.0f)
                lineTo(39.006f, 8.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-11.0f)
                lineTo(23.006f, 9.0f)
                horizontalLineToRelative(2.0f)
                lineTo(25.006f, 8.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(18.006f, 6.0f)
                curveToRelative(0.0f, -1.098f, 0.902f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(39.006f, 36.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-24.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(41.006f, 8.0f)
                verticalLineToRelative(27.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(40.006f, 8.0f)
                close()
                moveTo(43.006f, 7.0f)
                horizontalLineToRelative(-24.0f)
                lineTo(19.006f, 6.0f)
                curveToRelative(0.0f, -0.546f, 0.454f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(23.0f)
                close()
                moveTo(10.006f, 8.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.367f, 9.0f)
                lineToRelative(-1.666f, 5.0f)
                horizontalLineToRelative(5.296f)
                curveToRelative(1.578f, 0.0f, 2.853f, 0.388f, 3.731f, 1.241f)
                curveToRelative(0.88f, 0.856f, 1.278f, 2.1f, 1.278f, 3.626f)
                lineTo(16.006f, 38.0f)
                horizontalLineToRelative(-4.158f)
                lineToRelative(1.091f, 2.0f)
                horizontalLineToRelative(2.067f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.522f)
                lineToRelative(0.96f, 1.76f)
                lineToRelative(-0.876f, 0.48f)
                lineTo(12.347f, 41.0f)
                lineTo(4.0f, 41.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.801f)
                lineToRelative(-1.09f, -2.0f)
                lineTo(4.005f, 38.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                lineTo(15.005f, 27.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-7.133f)
                curveToRelative(0.0f, -1.363f, -0.353f, -2.304f, -0.975f, -2.909f)
                curveToRelative(-0.625f, -0.607f, -1.606f, -0.958f, -3.034f, -0.958f)
                lineTo(4.313f, 15.0f)
                lineToRelative(0.219f, -0.658f)
                lineTo(6.312f, 9.0f)
                lineTo(4.0f, 9.0f)
                lineTo(4.0f, 8.0f)
                close()
                moveTo(11.006f, 31.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.001f)
                moveToRelative(0.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.001f)
                moveToRelative(-3.0f, -16.0f)
                verticalLineToRelative(-1.0f)
                lineTo(4.002f, 17.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(24.006f, 13.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _platformLarge!!
    }

private var _platformLarge: ImageVector? = null
