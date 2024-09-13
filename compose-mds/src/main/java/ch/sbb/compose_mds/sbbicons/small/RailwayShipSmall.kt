package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.RailwayShipSmall: ImageVector
    get() {
        if (_railwayShipSmall != null) {
            return _railwayShipSmall!!
        }
        _railwayShipSmall = Builder(name = "RailwayShipSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5f, 2.0f)
                lineTo(7.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.182f, 7.0f)
                lineToRelative(0.373f, 0.728f)
                lineToRelative(2.127f, 4.156f)
                lineToRelative(-0.763f, 0.261f)
                curveToRelative(-0.408f, 0.14f, -0.849f, 0.14f, -1.257f, 0.0f)
                lineToRelative(-0.324f, 0.946f)
                arcToRelative(2.94f, 2.94f, 0.0f, false, false, 1.905f, 0.0f)
                lineToRelative(1.42f, -0.486f)
                curveToRelative(0.407f, -0.14f, 0.848f, -0.14f, 1.256f, 0.0f)
                lineToRelative(1.419f, 0.486f)
                lineToRelative(0.324f, -0.946f)
                lineToRelative(-1.419f, -0.486f)
                arcToRelative(2.93f, 2.93f, 0.0f, false, false, -1.597f, -0.087f)
                lineTo(3.818f, 8.0f)
                lineTo(14.0f, 8.0f)
                lineTo(14.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(13.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(16.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                lineTo(8.0f, 3.0f)
                horizontalLineToRelative(9.0f)
                lineTo(17.0f, 2.0f)
                close()
                moveTo(12.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(10.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(3.646f, 19.646f)
                lineToRelative(15.0f, -15.0f)
                lineToRelative(0.708f, 0.708f)
                lineToRelative(-15.0f, 15.0f)
                close()
                moveTo(16.0f, 12.0f)
                horizontalLineToRelative(2.824f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, -1.83f, -1.726f)
                lineToRelative(0.386f, -0.922f)
                arcToRelative(4.58f, 4.58f, 0.0f, false, true, 2.564f, 2.745f)
                lineToRelative(1.875f, 5.246f)
                arcTo(1.854f, 1.854f, 0.0f, false, true, 20.156f, 20.0f)
                lineTo(17.95f, 20.0f)
                curveToRelative(-0.075f, 0.37f, -0.232f, 0.71f, -0.45f, 1.0f)
                lineTo(22.0f, 21.0f)
                verticalLineToRelative(1.0f)
                lineTo(10.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.45f, -1.0f)
                lineTo(10.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.156f)
                arcToRelative(0.854f, 0.854f, 0.0f, false, false, 0.751f, -1.245f)
                lineToRelative(-0.012f, -0.025f)
                lineToRelative(-0.01f, -0.026f)
                lineToRelative(-0.25f, -0.704f)
                lineTo(16.0f, 17.0f)
                verticalLineToRelative(-5.0f)
                moveToRelative(0.915f, 8.0f)
                arcToRelative(1.502f, 1.502f, 0.0f, false, true, -2.83f, 0.0f)
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
