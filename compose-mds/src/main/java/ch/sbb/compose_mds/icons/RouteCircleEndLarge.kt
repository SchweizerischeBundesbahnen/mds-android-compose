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

public val SBBIcons.RouteCircleEndLarge: ImageVector
    get() {
        if (_routeCircleEndLarge != null) {
            return _routeCircleEndLarge!!
        }
        _routeCircleEndLarge = Builder(
            name = "RouteCircleEndLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(29.5f, 12.0f)
                curveTo(36.402f, 12.0f, 42.0f, 17.598f, 42.0f, 24.5f)
                curveTo(42.0f, 31.404f, 36.402f, 37.0f, 29.5f, 37.0f)
                curveToRelative(-6.735f, 0.0f, -12.227f, -5.328f, -12.49f, -12.0f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.51f)
                curveToRelative(0.263f, -6.67f, 5.755f, -12.0f, 12.49f, -12.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(23.15f, 13.0f, 18.0f, 18.15f, 18.0f, 24.5f)
                curveTo(18.0f, 30.852f, 23.15f, 36.0f, 29.5f, 36.0f)
                reflectiveCurveTo(41.0f, 30.852f, 41.0f, 24.5f)
                curveTo(41.0f, 18.15f, 35.85f, 13.0f, 29.5f, 13.0f)
                moveToRelative(0.0f, 4.5f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 0.0f, 14.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, -14.0f)
            }
        }
            .build()
        return _routeCircleEndLarge!!
    }

private var _routeCircleEndLarge: ImageVector? = null
