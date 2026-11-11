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

public val SBBIcons.ArrowCircleTimeSmall: ImageVector
    get() {
        if (_arrowCircleTimeSmall != null) {
            return _arrowCircleTimeSmall!!
        }
        _arrowCircleTimeSmall = Builder(name = "ArrowCircleTimeSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 12.0f)
                curveToRelative(0.0f, -4.074f, -2.926f, -7.0f, -7.0f, -7.0f)
                curveToRelative(-2.907f, 0.0f, -5.587f, 1.677f, -6.745f, 4.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.01f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(7.5f)
                curveTo(6.534f, 5.393f, 9.19f, 4.0f, 12.0f, 4.0f)
                curveToRelative(4.626f, 0.0f, 8.0f, 3.374f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.374f, 8.0f, -8.0f, 8.0f)
                curveToRelative(-3.872f, 0.0f, -6.878f, -2.369f, -7.745f, -5.88f)
                lineToRelative(0.97f, -0.24f)
                curveTo(5.979f, 16.929f, 8.573f, 19.0f, 12.0f, 19.0f)
                curveToRelative(4.074f, 0.0f, 7.0f, -2.926f, 7.0f, -7.0f)
                moveToRelative(-7.0f, 0.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _arrowCircleTimeSmall!!
    }

private var _arrowCircleTimeSmall: ImageVector? = null
