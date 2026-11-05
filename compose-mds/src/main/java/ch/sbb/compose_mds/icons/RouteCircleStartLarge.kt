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

public val SBBIcons.RouteCircleStartLarge: ImageVector
    get() {
        if (_routeCircleStartLarge != null) {
            return _routeCircleStartLarge!!
        }
        _routeCircleStartLarge = Builder(
            name = "RouteCircleStartLarge",
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
                moveTo(18.5f, 12.0f)
                curveToRelative(6.737f, 0.0f, 12.227f, 5.33f, 12.49f, 12.0f)
                horizontalLineTo(42.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(30.99f)
                curveToRelative(-0.263f, 6.672f, -5.753f, 12.0f, -12.49f, 12.0f)
                curveTo(11.598f, 37.0f, 6.0f, 31.404f, 6.0f, 24.5f)
                curveTo(6.0f, 17.598f, 11.598f, 12.0f, 18.5f, 12.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(12.15f, 13.0f, 7.0f, 18.15f, 7.0f, 24.5f)
                curveTo(7.0f, 30.852f, 12.15f, 36.0f, 18.5f, 36.0f)
                curveTo(24.852f, 36.0f, 30.0f, 30.852f, 30.0f, 24.5f)
                curveTo(30.0f, 18.15f, 24.852f, 13.0f, 18.5f, 13.0f)
                moveToRelative(0.0f, 5.001f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 0.0f, 13.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 0.0f, -13.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, -11.0f)
            }
        }
            .build()
        return _routeCircleStartLarge!!
    }

private var _routeCircleStartLarge: ImageVector? = null
