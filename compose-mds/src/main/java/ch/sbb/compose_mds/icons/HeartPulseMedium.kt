package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.HeartPulseMedium: ImageVector
    get() {
        if (_heartPulseMedium != null) {
            return _heartPulseMedium!!
        }
        _heartPulseMedium = Builder(name = "HeartPulseMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.25f, 6.25f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, true, 7.519f, 5.243f)
                lineToRelative(0.11f, 0.325f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.371f, 2.427f)
                curveToRelative(0.0f, 1.45f, -0.38f, 2.81f, -1.048f, 3.98f)
                curveToRelative(-0.235f, 0.415f, -0.9f, 1.27f, -1.168f, 1.593f)
                lineToRelative(-0.014f, 0.019f)
                lineToRelative(-0.018f, 0.017f)
                lineToRelative(-1.396f, 1.396f)
                horizontalLineTo(31.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.895f)
                lineToRelative(-9.001f, 9.004f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-9.001f, -9.004f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.895f)
                lineToRelative(-1.42f, -1.419f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.266f, -1.75f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.968f, -3.836f)
                arcTo(7.975f, 7.975f, 0.0f, false, true, 11.25f, 6.25f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 6.004f, 2.735f)
                arcTo(7.91f, 7.91f, 0.0f, false, true, 23.25f, 6.25f)
                moveTo(12.492f, 21.84f)
                lineToRelative(-0.075f, 0.41f)
                horizontalLineToRelative(-3.11f)
                lineToRelative(7.942f, 7.942f)
                lineToRelative(7.941f, -7.942f)
                horizontalLineToRelative(-3.029f)
                lineToRelative(-0.125f, -0.314f)
                lineToRelative(-1.087f, -2.717f)
                lineToRelative(-3.252f, 6.505f)
                lineToRelative(-0.554f, 1.109f)
                lineToRelative(-0.37f, -1.184f)
                lineToRelative(-3.145f, -10.06f)
                close()
                moveTo(23.25f, 7.25f)
                curveToRelative(-2.311f, 0.0f, -4.324f, 1.114f, -5.594f, 2.825f)
                lineToRelative(-0.4f, 0.54f)
                lineToRelative(-0.402f, -0.54f)
                arcTo(6.95f, 6.95f, 0.0f, false, false, 11.25f, 7.25f)
                arcToRelative(6.975f, 6.975f, 0.0f, false, false, -7.009f, 6.995f)
                curveToRelative(0.0f, 1.22f, 0.307f, 2.365f, 0.847f, 3.358f)
                curveToRelative(0.31f, 0.57f, 0.676f, 1.084f, 1.11f, 1.536f)
                lineToRelative(2.11f, 2.111f)
                horizontalLineToRelative(3.274f)
                lineToRelative(1.426f, -7.84f)
                lineToRelative(0.363f, -1.998f)
                lineToRelative(0.606f, 1.939f)
                lineToRelative(3.38f, 10.815f)
                lineToRelative(3.196f, -6.39f)
                lineToRelative(0.498f, -0.996f)
                lineToRelative(0.413f, 1.034f)
                lineToRelative(1.374f, 3.436f)
                horizontalLineToRelative(3.352f)
                lineToRelative(2.084f, -2.084f)
                curveToRelative(0.278f, -0.338f, 0.876f, -1.113f, 1.059f, -1.436f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.917f, -3.485f)
                arcToRelative(6.967f, 6.967f, 0.0f, false, false, -7.0f, -6.995f)
            }
        }
        .build()
        return _heartPulseMedium!!
    }

private var _heartPulseMedium: ImageVector? = null
