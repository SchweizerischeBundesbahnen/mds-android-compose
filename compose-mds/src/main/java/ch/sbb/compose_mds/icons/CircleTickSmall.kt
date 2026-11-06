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

public val SBBIcons.CircleTickSmall: ImageVector
    get() {
        if (_circleTickSmall != null) {
            return _circleTickSmall!!
        }
        _circleTickSmall = Builder(name = "CircleTickSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, -9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -9.0f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -9.0f, -9.0f)
                moveToRelative(9.0f, -10.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.477f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.477f, 10.0f, -10.0f)
                reflectiveCurveTo(17.523f, 2.0f, 12.0f, 2.0f)
                moveToRelative(-1.104f, 13.305f)
                lineToRelative(5.0f, -6.5f)
                lineToRelative(-0.792f, -0.61f)
                lineToRelative(-4.69f, 6.096f)
                lineToRelative(-2.102f, -1.681f)
                lineToRelative(-0.624f, 0.78f)
                lineToRelative(2.5f, 2.0f)
                lineToRelative(0.398f, 0.319f)
                close()
            }
        }
        .build()
        return _circleTickSmall!!
    }

private var _circleTickSmall: ImageVector? = null
