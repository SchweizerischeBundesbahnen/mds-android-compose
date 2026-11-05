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

public val SBBIcons.HandMotionSmall: ImageVector
    get() {
        if (_handMotionSmall != null) {
            return _handMotionSmall!!
        }
        _handMotionSmall = Builder(
            name = "HandMotionSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(22.0f, 15.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -7.0f, 7.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                close()
                moveTo(15.39f, 4.613f)
                arcToRelative(1.506f, 1.506f, 0.0f, false, true, 2.448f, 0.473f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, true, 2.037f, 2.039f)
                arcToRelative(1.497f, 1.497f, 0.0f, false, true, 0.467f, 2.438f)
                lineToRelative(-1.124f, 1.122f)
                arcToRelative(1.492f, 1.492f, 0.0f, false, true, 0.521f, 2.297f)
                lineToRelative(-0.102f, 0.114f)
                lineToRelative(-0.003f, 0.003f)
                lineToRelative(-0.01f, 0.008f)
                lineToRelative(-0.035f, 0.037f)
                lineToRelative(-0.138f, 0.136f)
                lineToRelative(-2.114f, 2.115f)
                curveToRelative(-1.238f, 1.237f, -2.653f, 2.65f, -3.36f, 3.358f)
                curveToRelative(-0.76f, 0.76f, -1.698f, 1.32f, -2.428f, 1.686f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.272f, 0.547f)
                lineToRelative(-0.02f, 0.008f)
                lineToRelative(-0.007f, 0.002f)
                horizontalLineToRelative(-0.002f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.294f, 0.098f)
                lineToRelative(-5.371f, -5.371f)
                lineToRelative(0.071f, -0.277f)
                lineToRelative(1.874f, -7.242f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, true, 2.934f, 0.382f)
                lineToRelative(-0.01f, 1.964f)
                close()
                moveTo(20.0f, 15.0f)
                curveToRelative(0.0f, 2.67f, -2.33f, 5.0f, -5.0f, 5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(2.117f, 0.0f, 4.0f, -1.883f, 4.0f, -4.0f)
                close()
                moveTo(16.811f, 5.32f)
                arcToRelative(0.506f, 0.506f, 0.0f, false, false, -0.713f, 0.0f)
                lineToRelative(-6.8f, 6.798f)
                lineToRelative(-0.86f, 0.86f)
                lineToRelative(0.007f, -1.215f)
                lineToRelative(0.017f, -3.182f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, false, -0.966f, -0.125f)
                lineTo(5.693f, 15.42f)
                lineToRelative(4.522f, 4.521f)
                lineToRelative(0.04f, -0.015f)
                curveToRelative(0.211f, -0.085f, 0.508f, -0.212f, 0.847f, -0.382f)
                curveToRelative(0.683f, -0.342f, 1.514f, -0.844f, 2.168f, -1.498f)
                lineToRelative(4.974f, -4.973f)
                lineToRelative(0.5f, -0.5f)
                lineToRelative(0.138f, -0.136f)
                lineToRelative(0.045f, -0.045f)
                lineToRelative(0.002f, -0.003f)
                arcToRelative(0.497f, 0.497f, 0.0f, false, false, -0.622f, -0.767f)
                lineToRelative(-0.078f, 0.063f)
                lineToRelative(-3.19f, 3.181f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(5.304f, -5.304f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.707f)
                lineToRelative(-5.303f, 5.303f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(6.015f, -6.015f)
                arcToRelative(0.494f, 0.494f, 0.0f, false, false, -0.699f, -0.699f)
                lineToRelative(-6.023f, 6.008f)
                lineToRelative(-0.707f, -0.708f)
                lineToRelative(5.308f, -5.295f)
                arcToRelative(0.505f, 0.505f, 0.0f, false, false, 0.0f, -0.716f)
                moveTo(9.0f, 3.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(2.0f, 9.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.0f, -7.0f)
                close()
                moveTo(9.0f, 5.0f)
                curveTo(6.883f, 5.0f, 5.0f, 6.883f, 5.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                curveToRelative(0.0f, -2.67f, 2.33f, -5.0f, 5.0f, -5.0f)
                close()
            }
        }
            .build()
        return _handMotionSmall!!
    }

private var _handMotionSmall: ImageVector? = null
