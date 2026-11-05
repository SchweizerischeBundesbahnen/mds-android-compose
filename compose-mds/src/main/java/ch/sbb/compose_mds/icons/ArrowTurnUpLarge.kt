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

public val SBBIcons.ArrowTurnUpLarge: ImageVector
    get() {
        if (_arrowTurnUpLarge != null) {
            return _arrowTurnUpLarge!!
        }
        _arrowTurnUpLarge = Builder(name = "ArrowTurnUpLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(28.836f, 10.165f)
                lineToRelative(6.299f, 6.283f)
                lineToRelative(-0.354f, 0.355f)
                lineToRelative(-0.353f, 0.353f)
                lineTo(29.0f, 11.74f)
                verticalLineTo(20.5f)
                curveToRelative(0.0f, 6.076f, -1.825f, 10.232f, -4.858f, 12.858f)
                curveTo(21.122f, 35.973f, 16.985f, 37.0f, 12.5f, 37.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(4.352f, 0.0f, 8.215f, -0.999f, 10.986f, -3.398f)
                curveTo(26.244f, 30.216f, 28.0f, 26.37f, 28.0f, 20.5f)
                verticalLineToRelative(-8.792f)
                lineToRelative(-5.445f, 5.448f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(6.282f, -6.284f)
                lineToRelative(0.352f, -0.353f)
                close()
            }
        }
        .build()
        return _arrowTurnUpLarge!!
    }

private var _arrowTurnUpLarge: ImageVector? = null
