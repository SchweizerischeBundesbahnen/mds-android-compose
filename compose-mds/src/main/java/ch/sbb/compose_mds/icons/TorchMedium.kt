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
                moveToRelative(17.546f, 4.847f)
                lineToRelative(-0.796f, -0.585f)
                verticalLineToRelative(7.794f)
                lineToRelative(-3.842f, -1.28f)
                lineToRelative(-0.658f, -0.22f)
                verticalLineToRelative(5.194f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, 5.0f)
                curveToRelative(2.793f, 0.0f, 4.751f, -2.271f, 4.997f, -4.938f)
                verticalLineToRelative(-0.005f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.036f, -0.29f)
                curveToRelative(0.02f, -0.195f, 0.04f, -0.475f, 0.048f, -0.822f)
                curveToRelative(0.014f, -0.693f, -0.028f, -1.66f, -0.25f, -2.76f)
                curveToRelative(-0.447f, -2.203f, -1.625f, -4.95f, -4.535f, -7.088f)
                moveToRelative(3.711f, 10.82f)
                close()
                lineToRelative(-0.003f, 0.018f)
                lineToRelative(-0.002f, 0.02f)
                curveToRelative(-0.203f, 2.275f, -1.83f, 4.044f, -4.002f, 4.044f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineToRelative(-3.806f)
                lineToRelative(3.842f, 1.28f)
                lineToRelative(0.658f, 0.22f)
                verticalLineToRelative(-7.15f)
                curveToRelative(2.088f, 1.841f, 2.984f, 4.032f, 3.35f, 5.84f)
                curveToRelative(0.206f, 1.014f, 0.244f, 1.905f, 0.23f, 2.54f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -0.065f, 0.936f)
                lineToRelative(-0.006f, 0.046f)
                close()
                moveTo(14.25f, 22.75f)
                horizontalLineToRelative(-0.61f)
                lineToRelative(0.12f, 0.598f)
                lineToRelative(1.5f, 7.5f)
                lineToRelative(0.08f, 0.402f)
                horizontalLineToRelative(3.82f)
                lineToRelative(0.08f, -0.402f)
                lineToRelative(1.5f, -7.5f)
                lineToRelative(0.12f, -0.598f)
                horizontalLineToRelative(-6.61f)
                moveToRelative(1.91f, 7.5f)
                lineToRelative(-1.3f, -6.5f)
                horizontalLineToRelative(4.78f)
                lineToRelative(-1.3f, 6.5f)
                close()
            }
        }
        .build()
        return _torchMedium!!
    }

private var _torchMedium: ImageVector? = null
