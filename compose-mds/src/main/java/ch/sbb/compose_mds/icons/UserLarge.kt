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
        _userLarge = Builder(
            name = "UserLarge",
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
                moveTo(17.567f, 12.836f)
                curveTo(18.648f, 9.97f, 21.151f, 8.0f, 24.0f, 8.0f)
                reflectiveCurveToRelative(5.352f, 1.97f, 6.433f, 4.836f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -3.4f, -1.968f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, false, -1.618f, -0.185f)
                arcToRelative(3.32f, 3.32f, 0.0f, false, true, -2.83f, 0.0f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, false, -1.618f, 0.185f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -3.4f, 1.968f)
                moveToRelative(-0.351f, 1.18f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 17.0f, 16.0f)
                curveToRelative(0.0f, 4.479f, 3.191f, 8.0f, 7.0f, 8.0f)
                reflectiveCurveToRelative(7.0f, -3.521f, 7.0f, -8.0f)
                curveToRelative(0.0f, -0.687f, -0.075f, -1.351f, -0.216f, -1.984f)
                arcToRelative(13.2f, 13.2f, 0.0f, false, true, -4.392f, -2.38f)
                lineToRelative(-0.006f, -0.005f)
                lineToRelative(-0.006f, -0.006f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, false, -0.501f, -0.056f)
                lineToRelative(-0.012f, 0.007f)
                lineToRelative(-0.012f, 0.006f)
                arcToRelative(4.32f, 4.32f, 0.0f, false, true, -3.71f, 0.0f)
                lineToRelative(-0.012f, -0.006f)
                lineToRelative(-0.012f, -0.007f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, false, -0.5f, 0.056f)
                lineToRelative(-0.007f, 0.006f)
                lineToRelative(-0.007f, 0.005f)
                arcToRelative(13.2f, 13.2f, 0.0f, false, true, -4.391f, 2.38f)
                moveTo(24.0f, 7.0f)
                curveToRelative(-4.475f, 0.0f, -8.0f, 4.09f, -8.0f, 9.0f)
                curveToRelative(0.0f, 2.454f, 0.88f, 4.703f, 2.32f, 6.339f)
                curveTo(12.264f, 25.292f, 8.0f, 32.795f, 8.0f, 41.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -8.705f, -4.246f, -16.21f, -10.319f, -19.162f)
                curveTo(31.12f, 20.702f, 32.0f, 18.453f, 32.0f, 16.0f)
                curveToRelative(0.0f, -4.91f, -3.525f, -9.0f, -8.0f, -9.0f)
                moveTo(9.005f, 41.0f)
                curveToRelative(0.162f, -8.357f, 4.387f, -15.325f, 10.064f, -17.91f)
                curveTo(20.421f, 24.284f, 22.127f, 25.0f, 24.0f, 25.0f)
                reflectiveCurveToRelative(3.58f, -0.716f, 4.931f, -1.91f)
                curveToRelative(5.695f, 2.584f, 9.902f, 9.552f, 10.064f, 17.91f)
                close()
                moveTo(26.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-1.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                moveToRelative(-3.4f, 4.3f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.8f, 0.0f)
                lineToRelative(-0.8f, -0.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.2f, 0.0f)
                close()
                moveTo(22.0f, 31.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(21.0f, 15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                moveToRelative(0.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
            }
        }
            .build()
        return _userLarge!!
    }

private var _userLarge: ImageVector? = null
