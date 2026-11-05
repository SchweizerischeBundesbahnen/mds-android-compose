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

public val SBBIcons.ArrowCircleResetSmall: ImageVector
    get() {
        if (_arrowCircleResetSmall != null) {
            return _arrowCircleResetSmall!!
        }
        _arrowCircleResetSmall = Builder(
            name = "ArrowCircleResetSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
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
                pathFillType = EvenOdd,
            ) {
                moveTo(5.255f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.01f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.491f)
                curveTo(6.534f, 5.391f, 9.19f, 4.0f, 12.0f, 4.0f)
                curveToRelative(4.626f, 0.0f, 8.0f, 3.374f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.374f, 8.0f, -8.0f, 8.0f)
                curveToRelative(-3.872f, 0.0f, -6.878f, -2.369f, -7.745f, -5.88f)
                lineToRelative(0.97f, -0.24f)
                curveTo(5.978f, 16.93f, 8.572f, 19.0f, 12.0f, 19.0f)
                curveToRelative(4.074f, 0.0f, 7.0f, -2.926f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-2.926f, -7.0f, -7.0f, -7.0f)
                curveTo(9.093f, 5.0f, 6.413f, 6.677f, 5.255f, 9.0f)
            }
        }
            .build()
        return _arrowCircleResetSmall!!
    }

private var _arrowCircleResetSmall: ImageVector? = null
