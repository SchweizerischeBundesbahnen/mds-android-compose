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
        _dogMedium = Builder(
            name = "DogMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(26.75f, 8.25f)
                lineTo(26.75f, 7.043f)
                lineToRelative(-0.854f, 0.853f)
                lineToRelative(-5.882f, 5.883f)
                lineTo(9.712f, 15.25f)
                horizontalLineToRelative(-0.025f)
                quadToRelative(-0.06f, 0.0f, -0.178f, -0.004f)
                curveToRelative(-0.156f, -0.005f, -0.38f, -0.016f, -0.65f, -0.041f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -1.963f, -0.371f)
                curveToRelative(-0.712f, -0.217f, -1.381f, -0.536f, -1.866f, -0.992f)
                curveToRelative(-0.471f, -0.443f, -0.78f, -1.025f, -0.78f, -1.828f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 1.103f, 0.44f, 1.941f, 1.095f, 2.557f)
                curveToRelative(0.64f, 0.601f, 1.47f, 0.979f, 2.26f, 1.22f)
                curveToRelative(0.792f, 0.241f, 1.578f, 0.355f, 2.161f, 0.41f)
                quadToRelative(0.274f, 0.025f, 0.484f, 0.035f)
                lineTo(9.25f, 30.0f)
                horizontalLineToRelative(1.0f)
                lineTo(10.25f, 16.184f)
                lineToRelative(10.07f, -1.439f)
                lineToRelative(0.166f, -0.024f)
                lineToRelative(0.118f, -0.117f)
                lineToRelative(5.146f, -5.147f)
                verticalLineToRelative(2.0f)
                lineToRelative(0.146f, 0.147f)
                lineToRelative(4.147f, 4.146f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(-1.146f, -1.147f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-0.146f, 0.147f)
                lineTo(24.25f, 30.0f)
                horizontalLineToRelative(1.0f)
                lineTo(25.25f, 18.957f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(1.146f, 1.147f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(0.354f, -0.353f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(-0.353f, -0.354f)
                lineToRelative(-4.354f, -4.353f)
                close()
                moveTo(15.75f, 21.25f)
                horizontalLineToRelative(-0.007f)
                curveToRelative(-1.066f, 0.014f, -1.793f, 0.71f, -2.27f, 1.564f)
                curveToRelative(-0.475f, 0.85f, -0.76f, 1.946f, -0.935f, 2.995f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, false, -0.276f, 2.89f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, false, -0.014f, 1.217f)
                lineToRelative(0.002f, 0.072f)
                verticalLineToRelative(0.026f)
                lineToRelative(0.5f, -0.014f)
                lineToRelative(0.5f, -0.016f)
                verticalLineToRelative(-0.02f)
                lineToRelative(-0.002f, -0.065f)
                lineToRelative(-0.002f, -0.253f)
                curveToRelative(0.0f, -0.22f, 0.002f, -0.534f, 0.015f, -0.912f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 0.263f, -2.76f)
                curveToRelative(0.169f, -1.008f, 0.43f, -1.971f, 0.822f, -2.672f)
                curveToRelative(0.39f, -0.697f, 0.85f, -1.043f, 1.408f, -1.052f)
                horizontalLineToRelative(5.496f)
                lineTo(21.25f, 30.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-8.75f)
                horizontalLineToRelative(-6.5f)
                moveToRelative(9.0f, -8.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.501f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                moveToRelative(-0.25f, 1.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
            }
        }
            .build()
        return _dogMedium!!
    }

private var _dogMedium: ImageVector? = null
