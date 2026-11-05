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
                moveTo(9.0f, 9.0f)
                lineTo(5.255f, 9.0f)
                curveTo(6.413f, 6.677f, 9.093f, 5.0f, 12.0f, 5.0f)
                curveToRelative(4.074f, 0.0f, 7.0f, 2.926f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-2.926f, 7.0f, -7.0f, 7.0f)
                curveToRelative(-3.428f, 0.0f, -6.022f, -2.071f, -6.775f, -5.12f)
                lineToRelative(-0.97f, 0.24f)
                curveTo(5.122f, 17.63f, 8.128f, 20.0f, 12.0f, 20.0f)
                curveToRelative(4.626f, 0.0f, 8.0f, -3.374f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.374f, -8.0f, -8.0f, -8.0f)
                curveTo(9.19f, 4.0f, 6.534f, 5.392f, 5.0f, 7.501f)
                lineTo(5.0f, 5.01f)
                lineTo(4.0f, 5.01f)
                lineTo(4.0f, 10.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(11.0f, 8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _arrowCircleTimeSmall!!
    }

private var _arrowCircleTimeSmall: ImageVector? = null
