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

public val SBBIcons.TunnelFreightWagonShiftedSmall: ImageVector
    get() {
        if (_tunnelFreightWagonShiftedSmall != null) {
            return _tunnelFreightWagonShiftedSmall!!
        }
        _tunnelFreightWagonShiftedSmall = Builder(name = "TunnelFreightWagonShiftedSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 3.0f)
                curveToRelative(4.696f, 0.0f, 8.5f, 3.687f, 8.5f, 8.586f)
                lineTo(20.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                lineTo(21.0f, 11.586f)
                curveTo(21.0f, 6.132f, 16.745f, 2.0f, 11.5f, 2.0f)
                reflectiveCurveTo(2.0f, 6.132f, 2.0f, 11.586f)
                lineTo(2.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                lineTo(3.0f, 11.586f)
                curveTo(3.0f, 6.687f, 6.804f, 3.0f, 11.5f, 3.0f)
                moveTo(18.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.69f)
                lineToRelative(-0.5f, -1.0f)
                lineTo(18.0f, 20.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.19f)
                lineToRelative(-0.5f, 1.0f)
                lineTo(7.0f, 21.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(14.69f, 20.0f)
                horizontalLineToRelative(-4.38f)
                lineToRelative(-0.5f, 1.0f)
                horizontalLineToRelative(5.38f)
                close()
                moveTo(8.0f, 18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 18.0f)
                moveToRelative(1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(12.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                close()
                moveTo(13.0f, 9.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 9.0f)
                close()
                moveTo(8.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                lineTo(6.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _tunnelFreightWagonShiftedSmall!!
    }

private var _tunnelFreightWagonShiftedSmall: ImageVector? = null
