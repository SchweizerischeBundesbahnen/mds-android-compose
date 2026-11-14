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

public val SBBIcons.TorchMedium: ImageVector
    get() {
        if (_torchMedium != null) {
            return _torchMedium!!
        }
        _torchMedium = Builder(name = "TorchMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.08f, 11.936f)
                curveToRelative(-0.446f, -2.204f, -1.624f, -4.952f, -4.534f, -7.09f)
                lineToRelative(-0.796f, -0.583f)
                verticalLineToRelative(7.793f)
                lineToRelative(-3.842f, -1.28f)
                lineToRelative(-0.658f, -0.22f)
                verticalLineToRelative(5.194f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, 5.0f)
                curveToRelative(2.795f, 0.0f, 4.754f, -2.274f, 4.997f, -4.943f)
                lineToRelative(0.009f, -0.063f)
                quadToRelative(0.011f, -0.08f, 0.027f, -0.227f)
                curveToRelative(0.02f, -0.195f, 0.041f, -0.475f, 0.048f, -0.822f)
                curveToRelative(0.014f, -0.693f, -0.028f, -1.66f, -0.25f, -2.76f)
                moveToRelative(-4.83f, 7.814f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineToRelative(-3.807f)
                lineToRelative(3.842f, 1.282f)
                lineToRelative(0.658f, 0.218f)
                lineTo(17.751f, 6.294f)
                curveToRelative(2.088f, 1.842f, 2.984f, 4.033f, 3.35f, 5.84f)
                curveToRelative(0.206f, 1.014f, 0.244f, 1.905f, 0.231f, 2.54f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -0.065f, 0.935f)
                lineToRelative(-0.007f, 0.047f)
                lineToRelative(-0.002f, 0.007f)
                verticalLineToRelative(0.004f)
                lineToRelative(-0.003f, 0.02f)
                lineToRelative(-0.002f, 0.02f)
                curveToRelative(-0.203f, 2.274f, -1.83f, 4.043f, -4.002f, 4.043f)
                moveToRelative(3.49f, 3.598f)
                lineToRelative(0.12f, -0.598f)
                horizontalLineToRelative(-7.22f)
                lineToRelative(0.12f, 0.598f)
                lineToRelative(1.5f, 7.5f)
                lineToRelative(0.08f, 0.402f)
                horizontalLineToRelative(3.82f)
                lineToRelative(0.08f, -0.402f)
                close()
                moveTo(18.341f, 30.25f)
                horizontalLineToRelative(-2.18f)
                lineToRelative(-1.3f, -6.5f)
                horizontalLineToRelative(4.78f)
                close()
            }
        }
        .build()
        return _torchMedium!!
    }

private var _torchMedium: ImageVector? = null
