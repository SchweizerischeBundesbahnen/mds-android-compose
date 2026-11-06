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

public val SBBIcons.MoonSmall: ImageVector
    get() {
        if (_moonSmall != null) {
            return _moonSmall!!
        }
        _moonSmall = Builder(name = "MoonSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.077f, 4.909f)
                lineTo(9.491f, 6.52f)
                curveToRelative(-0.723f, 1.988f, -0.055f, 4.474f, 1.54f, 6.245f)
                curveToRelative(1.576f, 1.752f, 3.999f, 2.737f, 6.73f, 1.811f)
                lineToRelative(1.997f, -0.677f)
                lineToRelative(-1.48f, 1.502f)
                curveToRelative(-1.86f, 1.884f, -3.865f, 2.642f, -5.732f, 2.572f)
                curveToRelative(-1.857f, -0.07f, -3.516f, -0.957f, -4.694f, -2.249f)
                curveToRelative(-1.178f, -1.29f, -1.897f, -3.01f, -1.85f, -4.78f)
                curveToRelative(0.048f, -1.784f, 0.876f, -3.579f, 2.714f, -4.991f)
                close()
                moveTo(16.094f, 15.92f)
                curveToRelative(-2.349f, 0.14f, -4.395f, -0.916f, -5.807f, -2.485f)
                curveToRelative(-1.391f, -1.546f, -2.204f, -3.633f, -2.074f, -5.622f)
                curveToRelative(-0.818f, 0.994f, -1.182f, 2.09f, -1.21f, 3.159f)
                curveToRelative(-0.04f, 1.483f, 0.565f, 2.958f, 1.587f, 4.08f)
                curveToRelative(1.022f, 1.12f, 2.438f, 1.864f, 3.994f, 1.922f)
                curveToRelative(1.1f, 0.042f, 2.3f, -0.259f, 3.51f, -1.054f)
            }
        }
        .build()
        return _moonSmall!!
    }

private var _moonSmall: ImageVector? = null
