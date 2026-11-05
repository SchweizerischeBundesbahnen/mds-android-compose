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

public val SBBIcons.TunnelFreightWagonShiftedMedium: ImageVector
    get() {
        if (_tunnelFreightWagonShiftedMedium != null) {
            return _tunnelFreightWagonShiftedMedium!!
        }
        _tunnelFreightWagonShiftedMedium = Builder(name = "TunnelFreightWagonShiftedMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.25f, 17.38f)
                curveToRelative(0.0f, -7.488f, 5.82f, -13.13f, 13.0f, -13.13f)
                reflectiveCurveToRelative(13.0f, 5.642f, 13.0f, 13.13f)
                lineTo(30.25f, 33.0f)
                horizontalLineToRelative(1.0f)
                lineTo(31.25f, 17.38f)
                curveToRelative(0.0f, -8.043f, -6.27f, -14.13f, -14.0f, -14.13f)
                reflectiveCurveToRelative(-14.0f, 6.087f, -14.0f, 14.13f)
                lineTo(3.25f, 33.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(23.191f, 31.75f)
                horizontalLineToRelative(-8.882f)
                lineToRelative(1.0f, -2.0f)
                horizontalLineToRelative(6.882f)
                close()
                moveTo(24.309f, 31.75f)
                lineTo(27.0f, 31.75f)
                verticalLineToRelative(1.0f)
                lineTo(10.5f, 32.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.691f)
                lineToRelative(1.0f, -2.0f)
                lineTo(10.75f, 29.75f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-14.5f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.441f)
                close()
                moveTo(11.75f, 26.75f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-14.0f)
                close()
                moveTo(8.75f, 13.25f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-12.5f)
                close()
                moveTo(13.25f, 13.25f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(19.25f, 13.25f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }
        .build()
        return _tunnelFreightWagonShiftedMedium!!
    }

private var _tunnelFreightWagonShiftedMedium: ImageVector? = null
