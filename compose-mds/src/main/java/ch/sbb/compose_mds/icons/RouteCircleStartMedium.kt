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

public val SBBIcons.RouteCircleStartMedium: ImageVector
    get() {
        if (_routeCircleStartMedium != null) {
            return _routeCircleStartMedium!!
        }
        _routeCircleStartMedium = Builder(name = "RouteCircleStartMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.75f, 18.75f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, -17.0f, 0.001f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 17.0f, 0.0f)
                moveToRelative(0.987f, 0.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, -9.487f, 9.0f)
                curveToRelative(-5.246f, 0.0f, -9.5f, -4.252f, -9.5f, -9.5f)
                curveToRelative(0.0f, -5.245f, 4.254f, -9.5f, 9.5f, -9.5f)
                curveToRelative(5.08f, 0.0f, 9.227f, 3.987f, 9.487f, 9.0f)
                lineTo(31.5f, 18.251f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(18.25f, 18.752f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -10.001f, -0.001f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 10.001f, 0.001f)
            }
        }
        .build()
        return _routeCircleStartMedium!!
    }

private var _routeCircleStartMedium: ImageVector? = null
