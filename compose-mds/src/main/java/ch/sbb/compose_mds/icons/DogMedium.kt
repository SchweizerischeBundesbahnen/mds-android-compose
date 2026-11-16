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

public val SBBIcons.DogMedium: ImageVector
    get() {
        if (_dogMedium != null) {
            return _dogMedium!!
        }
        _dogMedium = Builder(name = "DogMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(31.457f, 15.75f)
                lineToRelative(-4.707f, -4.707f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-0.854f, 0.853f)
                lineToRelative(-5.882f, 5.882f)
                lineTo(9.713f, 15.25f)
                horizontalLineToRelative(-0.026f)
                quadToRelative(-0.06f, 0.0f, -0.178f, -0.004f)
                curveToRelative(-0.156f, -0.005f, -0.38f, -0.016f, -0.65f, -0.04f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -1.963f, -0.372f)
                curveToRelative(-0.712f, -0.217f, -1.38f, -0.536f, -1.866f, -0.992f)
                curveToRelative(-0.47f, -0.443f, -0.78f, -1.025f, -0.78f, -1.828f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 1.103f, 0.44f, 1.941f, 1.095f, 2.556f)
                curveToRelative(0.64f, 0.602f, 1.471f, 0.98f, 2.26f, 1.22f)
                curveToRelative(0.793f, 0.242f, 1.579f, 0.356f, 2.162f, 0.41f)
                quadToRelative(0.273f, 0.026f, 0.483f, 0.036f)
                lineTo(9.25f, 30.0f)
                horizontalLineToRelative(1.0f)
                lineTo(10.25f, 16.184f)
                lineToRelative(10.07f, -1.439f)
                lineToRelative(0.165f, -0.023f)
                lineToRelative(5.265f, -5.265f)
                verticalLineToRelative(2.0f)
                lineToRelative(4.293f, 4.293f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(24.25f, 30.0f)
                horizontalLineToRelative(1.0f)
                lineTo(25.25f, 18.957f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(1.5f, 1.5f)
                close()
                moveTo(22.25f, 30.0f)
                verticalLineToRelative(-8.75f)
                horizontalLineToRelative(-6.507f)
                curveToRelative(-1.066f, 0.015f, -1.793f, 0.711f, -2.27f, 1.564f)
                curveToRelative(-0.475f, 0.85f, -0.76f, 1.947f, -0.936f, 2.995f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, false, -0.275f, 2.89f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -0.014f, 1.213f)
                verticalLineToRelative(0.004f)
                lineToRelative(0.001f, 0.04f)
                verticalLineToRelative(0.032f)
                lineToRelative(0.001f, 0.02f)
                verticalLineToRelative(0.006f)
                lineToRelative(0.5f, -0.014f)
                lineToRelative(0.495f, -0.016f)
                horizontalLineToRelative(0.004f)
                verticalLineToRelative(-0.059f)
                lineToRelative(-0.002f, -0.026f)
                lineToRelative(-0.002f, -0.253f)
                curveToRelative(0.0f, -0.22f, 0.003f, -0.534f, 0.016f, -0.911f)
                curveToRelative(0.027f, -0.757f, 0.096f, -1.761f, 0.263f, -2.76f)
                curveToRelative(0.168f, -1.009f, 0.43f, -1.973f, 0.822f, -2.674f)
                curveToRelative(0.366f, -0.654f, 0.794f, -0.998f, 1.307f, -1.046f)
                lineToRelative(0.104f, -0.005f)
                horizontalLineToRelative(5.493f)
                lineTo(21.25f, 30.0f)
                close()
                moveTo(15.743f, 21.25f)
                lineTo(15.75f, 21.75f)
                verticalLineToRelative(0.033f)
                close()
                moveTo(24.75f, 14.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.5f)
                moveToRelative(0.0f, 1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
            }
        }
        .build()
        return _dogMedium!!
    }

private var _dogMedium: ImageVector? = null
