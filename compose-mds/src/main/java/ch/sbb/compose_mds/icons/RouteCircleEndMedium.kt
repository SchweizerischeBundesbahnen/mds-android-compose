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

public val SBBIcons.RouteCircleEndMedium: ImageVector
    get() {
        if (_routeCircleEndMedium != null) {
            return _routeCircleEndMedium!!
        }
        _routeCircleEndMedium = Builder(name = "RouteCircleEndMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(30.25f, 18.75f)
                curveToRelative(0.0f, -4.693f, -3.807f, -8.5f, -8.5f, -8.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 8.5f, 8.5f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 5.248f, -4.254f, 9.5f, -9.5f, 9.5f)
                curveToRelative(-5.078f, 0.0f, -9.227f, -3.985f, -9.487f, -9.0f)
                horizontalLineTo(4.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.763f)
                curveToRelative(0.26f, -5.013f, 4.41f, -9.0f, 9.487f, -9.0f)
                curveToRelative(5.246f, 0.0f, 9.5f, 4.255f, 9.5f, 9.5f)
                moveTo(21.75f, 24.0f)
                arcToRelative(5.25f, 5.25f, 0.0f, true, false, 0.0f, -10.5f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, false, 0.0f, 10.5f)
            }
        }
        .build()
        return _routeCircleEndMedium!!
    }

private var _routeCircleEndMedium: ImageVector? = null
