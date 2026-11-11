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

public val SBBIcons.RailwayShipSmall: ImageVector
    get() {
        if (_railwayShipSmall != null) {
            return _railwayShipSmall!!
        }
        _railwayShipSmall = Builder(name = "RailwayShipSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 3.0f)
                lineTo(17.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.183f, 7.0f)
                lineToRelative(0.372f, 0.728f)
                lineToRelative(2.127f, 4.156f)
                lineToRelative(-0.763f, 0.261f)
                curveToRelative(-0.408f, 0.14f, -0.849f, 0.14f, -1.257f, 0.0f)
                lineToRelative(-0.324f, 0.946f)
                arcToRelative(2.94f, 2.94f, 0.0f, false, false, 1.905f, 0.0f)
                lineToRelative(1.42f, -0.486f)
                curveToRelative(0.407f, -0.14f, 0.848f, -0.14f, 1.256f, 0.0f)
                lineToRelative(1.419f, 0.486f)
                lineToRelative(0.324f, -0.945f)
                lineToRelative(-1.419f, -0.487f)
                arcToRelative(2.93f, 2.93f, 0.0f, false, false, -1.597f, -0.087f)
                lineTo(3.817f, 8.0f)
                lineTo(14.0f, 8.0f)
                lineTo(14.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(13.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(16.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                lineTo(8.0f, 3.0f)
                close()
                moveTo(12.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(10.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.354f, 5.354f)
                lineTo(4.354f, 20.354f)
                lineTo(3.647f, 19.647f)
                lineTo(18.647f, 4.647f)
                close()
                moveTo(18.824f, 12.0f)
                lineTo(16.0f, 12.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.634f)
                lineToRelative(0.252f, 0.704f)
                lineToRelative(0.01f, 0.026f)
                lineToRelative(0.011f, 0.024f)
                quadToRelative(0.091f, 0.186f, 0.093f, 0.382f)
                arcToRelative(0.854f, 0.854f, 0.0f, false, true, -0.844f, 0.864f)
                lineTo(10.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.075f, 0.37f, 0.232f, 0.71f, 0.45f, 1.0f)
                lineTo(10.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(0.218f, -0.29f, 0.375f, -0.63f, 0.45f, -1.0f)
                horizontalLineToRelative(2.206f)
                arcToRelative(1.854f, 1.854f, 0.0f, false, false, 1.67f, -2.637f)
                lineToRelative(-1.884f, -5.27f)
                arcToRelative(4.58f, 4.58f, 0.0f, false, false, -2.562f, -2.742f)
                lineToRelative(-0.385f, 0.924f)
                arcTo(3.57f, 3.57f, 0.0f, false, true, 18.824f, 12.0f)
                moveToRelative(-1.91f, 8.0f)
                arcToRelative(1.501f, 1.501f, 0.0f, false, true, -2.828f, 0.0f)
                close()
                moveTo(20.277f, 16.0f)
                lineTo(19.205f, 13.0f)
                lineTo(17.0f, 13.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(15.0f, 12.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _railwayShipSmall!!
    }

private var _railwayShipSmall: ImageVector? = null
