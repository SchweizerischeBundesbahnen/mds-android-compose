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

public val SBBIcons.ArrowCircleSmall: ImageVector
    get() {
        if (_arrowCircleSmall != null) {
            return _arrowCircleSmall!!
        }
        _arrowCircleSmall = Builder(name = "ArrowCircleSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 12.0f)
                curveToRelative(0.0f, -4.073f, 2.927f, -7.0f, 7.0f, -7.0f)
                curveToRelative(2.906f, 0.0f, 5.585f, 1.68f, 6.744f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.504f)
                curveTo(17.466f, 5.394f, 14.812f, 4.0f, 12.0f, 4.0f)
                curveToRelative(-4.625f, 0.0f, -8.0f, 3.375f, -8.0f, 8.0f)
                curveToRelative(0.0f, 4.626f, 3.375f, 8.0f, 8.0f, 8.0f)
                curveToRelative(3.871f, 0.0f, 6.883f, -2.367f, 7.75f, -5.882f)
                lineToRelative(-0.971f, -0.239f)
                curveTo(18.027f, 16.93f, 15.429f, 19.0f, 12.0f, 19.0f)
                curveToRelative(-4.073f, 0.0f, -7.0f, -2.925f, -7.0f, -7.0f)
            }
        }
        .build()
        return _arrowCircleSmall!!
    }

private var _arrowCircleSmall: ImageVector? = null
