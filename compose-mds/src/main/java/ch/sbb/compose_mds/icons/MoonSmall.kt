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

public val SBBIcons.MoonSmall: ImageVector
    get() {
        if (_moonSmall != null) {
            return _moonSmall!!
        }
        _moonSmall = Builder(name = "MoonSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.49f, 6.521f)
                curveToRelative(-0.722f, 1.988f, -0.054f, 4.473f, 1.54f, 6.245f)
                curveToRelative(1.577f, 1.751f, 4.0f, 2.737f, 6.731f, 1.811f)
                lineToRelative(1.997f, -0.677f)
                lineToRelative(-1.481f, 1.501f)
                curveToRelative(-1.859f, 1.885f, -3.864f, 2.643f, -5.73f, 2.573f)
                curveToRelative(-1.858f, -0.07f, -3.517f, -0.957f, -4.695f, -2.25f)
                curveToRelative(-1.177f, -1.29f, -1.897f, -3.009f, -1.85f, -4.779f)
                curveToRelative(0.048f, -1.784f, 0.875f, -3.579f, 2.714f, -4.99f)
                lineToRelative(1.361f, -1.046f)
                close()
                moveTo(8.212f, 7.815f)
                curveToRelative(-0.816f, 0.994f, -1.181f, 2.088f, -1.21f, 3.157f)
                curveToRelative(-0.04f, 1.483f, 0.565f, 2.957f, 1.588f, 4.079f)
                curveToRelative(1.022f, 1.12f, 2.438f, 1.865f, 3.993f, 1.924f)
                curveToRelative(1.1f, 0.04f, 2.297f, -0.262f, 3.506f, -1.055f)
                curveToRelative(-2.346f, 0.138f, -4.39f, -0.917f, -5.802f, -2.485f)
                curveToRelative(-1.39f, -1.545f, -2.204f, -3.63f, -2.075f, -5.62f)
            }
        }
        .build()
        return _moonSmall!!
    }

private var _moonSmall: ImageVector? = null
