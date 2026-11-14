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

public val SBBIcons.UserLarge: ImageVector
    get() {
        if (_userLarge != null) {
            return _userLarge!!
        }
        _userLarge = Builder(name = "UserLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(30.784f, 14.016f)
                curveToRelative(0.14f, 0.633f, 0.216f, 1.297f, 0.216f, 1.984f)
                curveToRelative(0.0f, 4.479f, -3.191f, 8.0f, -7.0f, 8.0f)
                reflectiveCurveToRelative(-7.0f, -3.521f, -7.0f, -8.0f)
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
                moveToRelative(-0.351f, -1.18f)
                curveTo(29.352f, 9.97f, 26.849f, 8.0f, 24.0f, 8.0f)
                reflectiveCurveToRelative(-5.352f, 1.97f, -6.433f, 4.836f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 3.406f, -1.973f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, true, 1.607f, -0.181f)
                arcToRelative(3.32f, 3.32f, 0.0f, false, false, 2.845f, -0.003f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, true, 1.601f, 0.185f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 3.407f, 1.972f)
                moveToRelative(-4.053f, -1.21f)
                lineToRelative(0.337f, -0.385f)
                lineToRelative(-0.007f, 0.01f)
                close()
                moveTo(25.879f, 11.57f)
                lineTo(25.639f, 11.13f)
                lineTo(25.636f, 11.122f)
                close()
                moveTo(21.62f, 11.625f)
                lineTo(21.29f, 11.25f)
                lineTo(21.283f, 11.241f)
                close()
                moveTo(24.0f, 25.0f)
                curveToRelative(1.873f, 0.0f, 3.58f, -0.716f, 4.93f, -1.91f)
                curveToRelative(5.696f, 2.585f, 9.9f, 9.552f, 10.062f, 17.91f)
                lineTo(9.008f, 41.0f)
                curveToRelative(0.162f, -8.357f, 4.384f, -15.325f, 10.061f, -17.91f)
                curveTo(20.42f, 24.284f, 22.127f, 25.0f, 24.0f, 25.0f)
                moveToRelative(8.0f, -9.0f)
                curveToRelative(0.0f, 2.453f, -0.88f, 4.702f, -2.319f, 6.338f)
                curveTo(35.754f, 25.29f, 40.0f, 32.795f, 40.0f, 41.5f)
                verticalLineToRelative(0.5f)
                lineTo(8.0f, 42.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -8.705f, 4.265f, -16.208f, 10.32f, -19.161f)
                curveTo(16.88f, 20.703f, 16.0f, 18.454f, 16.0f, 16.0f)
                curveToRelative(0.0f, -4.91f, 3.525f, -9.0f, 8.0f, -9.0f)
                reflectiveCurveToRelative(8.0f, 4.09f, 8.0f, 9.0f)
                moveToRelative(-5.0f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                moveToRelative(-2.658f, 5.184f)
                curveToRelative(0.416f, -0.209f, 0.779f, -0.512f, 1.058f, -0.884f)
                lineToRelative(-0.8f, -0.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.2f, 0.0f)
                lineToRelative(-0.8f, 0.6f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.742f, 0.884f)
                moveTo(22.0f, 31.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(21.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                moveToRelative(0.0f, 2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
            }
        }
        .build()
        return _userLarge!!
    }

private var _userLarge: ImageVector? = null
