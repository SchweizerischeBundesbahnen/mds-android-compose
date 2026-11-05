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
        _routeCircleEndMedium = Builder(
            name = "RouteCircleEndMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(21.75f, 10.25f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 0.0f, 17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, -17.0f)
                moveToRelative(-17.25f, 9.0f)
                horizontalLineToRelative(7.763f)
                curveToRelative(0.26f, 5.015f, 4.41f, 9.0f, 9.487f, 9.0f)
                curveToRelative(5.246f, 0.0f, 9.5f, -4.252f, 9.5f, -9.5f)
                curveToRelative(0.0f, -5.245f, -4.254f, -9.5f, -9.5f, -9.5f)
                curveToRelative(-5.078f, 0.0f, -9.227f, 3.987f, -9.487f, 9.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(21.75f, 24.0f)
                arcToRelative(5.25f, 5.25f, 0.0f, true, false, 0.0f, -10.5f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, false, 0.0f, 10.5f)
            }
        }
            .build()
        return _routeCircleEndMedium!!
    }

private var _routeCircleEndMedium: ImageVector? = null
