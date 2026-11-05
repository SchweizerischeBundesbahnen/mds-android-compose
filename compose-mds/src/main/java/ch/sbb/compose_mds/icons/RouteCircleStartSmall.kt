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

public val SBBIcons.RouteCircleStartSmall: ImageVector
    get() {
        if (_routeCircleStartSmall != null) {
            return _routeCircleStartSmall!!
        }
        _routeCircleStartSmall = Builder(name = "RouteCircleStartSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.5f, 7.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.002f, 11.002f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 9.5f, 7.0f)
                moveTo(3.0f, 12.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 12.981f, -0.5f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.019f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 3.0f, 12.5f)
                moveTo(9.5f, 10.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveTo(6.0f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
            }
        }
        .build()
        return _routeCircleStartSmall!!
    }

private var _routeCircleStartSmall: ImageVector? = null
