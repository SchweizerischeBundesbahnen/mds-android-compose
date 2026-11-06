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
                moveTo(23.987f, 6.0f)
                arcToRelative(8.76f, 8.76f, 0.0f, false, false, -8.958f, 8.0f)
                horizontalLineToRelative(1.17f)
                curveToRelative(0.804f, -3.972f, 3.95f, -7.0f, 7.801f, -7.0f)
                reflectiveCurveToRelative(6.997f, 3.028f, 7.8f, 7.0f)
                horizontalLineToRelative(1.17f)
                arcToRelative(8.76f, 8.76f, 0.0f, false, false, -8.957f, -8.0f)
                horizontalLineToRelative(-0.026f)
                moveToRelative(6.665f, 15.0f)
                lineTo(34.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-0.526f)
                arcTo(9.76f, 9.76f, 0.0f, false, false, 24.0f, 5.0f)
                arcToRelative(9.76f, 9.76f, 0.0f, false, false, -9.974f, 9.0f)
                lineTo(13.5f, 14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                lineTo(17.0f, 21.0f)
                verticalLineToRelative(-0.642f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 1.32f, 1.98f)
                curveTo(12.264f, 25.293f, 8.0f, 32.795f, 8.0f, 41.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -8.705f, -4.246f, -16.21f, -10.319f, -19.162f)
                curveToRelative(0.36f, -0.41f, 0.686f, -0.858f, 0.97f, -1.338f)
                moveTo(9.005f, 41.0f)
                curveToRelative(0.162f, -8.357f, 4.387f, -15.325f, 10.064f, -17.91f)
                curveTo(20.421f, 24.284f, 22.127f, 25.0f, 24.0f, 25.0f)
                reflectiveCurveToRelative(3.58f, -0.716f, 4.931f, -1.91f)
                curveToRelative(5.695f, 2.584f, 9.902f, 9.552f, 10.064f, 17.91f)
                close()
                moveTo(30.065f, 20.0f)
                lineTo(25.0f, 20.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.465f)
                curveToRelative(-1.293f, 1.838f, -3.277f, 3.0f, -5.465f, 3.0f)
                curveToRelative(-3.809f, 0.0f, -7.0f, -3.521f, -7.0f, -8.0f)
                curveToRelative(0.0f, -0.687f, 0.075f, -1.351f, 0.216f, -1.984f)
                arcToRelative(13.2f, 13.2f, 0.0f, false, false, 4.391f, -2.38f)
                lineToRelative(0.007f, -0.005f)
                lineToRelative(0.006f, -0.005f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, 0.5f, -0.057f)
                lineToRelative(0.013f, 0.007f)
                lineToRelative(0.012f, 0.006f)
                arcToRelative(4.32f, 4.32f, 0.0f, false, false, 3.71f, 0.0f)
                lineToRelative(0.012f, -0.006f)
                lineToRelative(0.012f, -0.007f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, 0.5f, 0.056f)
                lineToRelative(0.007f, 0.006f)
                lineToRelative(0.006f, 0.005f)
                arcToRelative(13.2f, 13.2f, 0.0f, false, false, 4.392f, 2.38f)
                curveToRelative(0.141f, 0.633f, 0.216f, 1.297f, 0.216f, 1.984f)
                curveToRelative(0.0f, 1.466f, -0.342f, 2.83f, -0.935f, 4.0f)
                moveToRelative(0.368f, -7.164f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -3.4f, -1.968f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, false, -1.618f, -0.184f)
                arcToRelative(3.32f, 3.32f, 0.0f, false, true, -2.83f, 0.0f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, false, -1.618f, 0.184f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -3.4f, 1.968f)
                curveTo(18.648f, 9.97f, 21.151f, 8.0f, 24.0f, 8.0f)
                reflectiveCurveToRelative(5.352f, 1.97f, 6.433f, 4.836f)
                moveTo(16.0f, 15.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                lineTo(16.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                moveToRelative(10.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                moveToRelative(0.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveTo(19.0f, 31.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(21.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-1.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                moveToRelative(12.0f, -0.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(32.0f, 20.0f)
                verticalLineToRelative(-5.0f)
            }
        }
        .build()
        return _userHeadsetLarge!!
    }

private var _userHeadsetLarge: ImageVector? = null
