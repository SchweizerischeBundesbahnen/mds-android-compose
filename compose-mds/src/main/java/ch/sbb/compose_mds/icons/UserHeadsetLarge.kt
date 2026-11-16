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

public val SBBIcons.UserHeadsetLarge: ImageVector
    get() {
        if (_userHeadsetLarge != null) {
            return _userHeadsetLarge!!
        }
        _userHeadsetLarge = Builder(name = "UserHeadsetLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.47f, 5.0f)
                arcToRelative(9.76f, 9.76f, 0.0f, false, true, 9.504f, 9.0f)
                horizontalLineToRelative(0.526f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-3.848f)
                quadToRelative(-0.429f, 0.721f, -0.97f, 1.338f)
                curveTo(35.753f, 25.29f, 40.0f, 32.795f, 40.0f, 41.5f)
                verticalLineToRelative(0.5f)
                lineTo(8.0f, 42.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -8.705f, 4.265f, -16.208f, 10.32f, -19.161f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 17.0f, 20.358f)
                lineTo(17.0f, 21.0f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(0.526f)
                arcToRelative(9.76f, 9.76f, 0.0f, false, true, 9.503f, -9.0f)
                close()
                moveTo(24.0f, 25.0f)
                curveToRelative(1.873f, 0.0f, 3.58f, -0.716f, 4.93f, -1.91f)
                curveToRelative(5.696f, 2.585f, 9.9f, 9.552f, 10.062f, 17.91f)
                lineTo(9.008f, 41.0f)
                curveToRelative(0.162f, -8.357f, 4.384f, -15.325f, 10.061f, -17.91f)
                curveTo(20.42f, 24.284f, 22.127f, 25.0f, 24.0f, 25.0f)
                moveToRelative(-7.8f, -11.0f)
                horizontalLineToRelative(-1.17f)
                arcToRelative(8.76f, 8.76f, 0.0f, false, true, 8.957f, -8.0f)
                horizontalLineToRelative(0.026f)
                arcToRelative(8.76f, 8.76f, 0.0f, false, true, 8.958f, 8.0f)
                lineTo(31.8f, 14.0f)
                curveToRelative(-0.804f, -3.972f, -3.95f, -7.0f, -7.801f, -7.0f)
                reflectiveCurveToRelative(-6.997f, 3.028f, -7.8f, 7.0f)
                moveTo(32.0f, 16.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(32.0f, 15.0f)
                close()
                moveTo(30.433f, 12.836f)
                curveTo(29.352f, 9.97f, 26.849f, 8.0f, 24.0f, 8.0f)
                reflectiveCurveToRelative(-5.352f, 1.97f, -6.433f, 4.836f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 3.406f, -1.973f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, true, 1.607f, -0.181f)
                arcToRelative(3.32f, 3.32f, 0.0f, false, false, 2.845f, -0.003f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, true, 1.601f, 0.185f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 3.407f, 1.972f)
                moveToRelative(0.351f, 1.18f)
                curveToRelative(0.14f, 0.633f, 0.216f, 1.297f, 0.216f, 1.984f)
                curveToRelative(0.0f, 1.466f, -0.342f, 2.83f, -0.935f, 4.0f)
                lineTo(25.0f, 20.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.465f)
                curveToRelative(-1.293f, 1.838f, -3.277f, 3.0f, -5.465f, 3.0f)
                curveToRelative(-3.809f, 0.0f, -7.0f, -3.521f, -7.0f, -8.0f)
                curveToRelative(0.0f, -0.687f, 0.075f, -1.351f, 0.216f, -1.984f)
                arcToRelative(13.2f, 13.2f, 0.0f, false, false, 4.391f, -2.38f)
                lineToRelative(0.006f, -0.005f)
                lineToRelative(0.007f, -0.006f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, 0.44f, -0.083f)
                lineToRelative(0.061f, 0.027f)
                lineToRelative(0.012f, 0.006f)
                lineToRelative(0.012f, 0.006f)
                arcToRelative(4.32f, 4.32f, 0.0f, false, false, 3.71f, 0.0f)
                lineToRelative(0.012f, -0.006f)
                lineToRelative(0.012f, -0.005f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, 0.5f, 0.055f)
                lineToRelative(0.007f, 0.006f)
                lineToRelative(0.007f, 0.006f)
                arcToRelative(13.2f, 13.2f, 0.0f, false, false, 4.391f, 2.38f)
                moveTo(25.88f, 11.57f)
                lineToRelative(-0.24f, -0.439f)
                lineToRelative(-0.003f, -0.008f)
                close()
                moveTo(21.621f, 11.626f)
                lineTo(21.291f, 11.251f)
                lineTo(21.284f, 11.242f)
                close()
                moveTo(13.0f, 19.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                lineTo(16.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
                moveTo(26.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                moveToRelative(0.0f, 2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                moveTo(19.0f, 31.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(22.0f, 15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                moveToRelative(3.71f, -4.25f)
                lineToRelative(-0.33f, 0.375f)
                lineToRelative(0.337f, -0.384f)
                close()
            }
        }
        .build()
        return _userHeadsetLarge!!
    }

private var _userHeadsetLarge: ImageVector? = null
