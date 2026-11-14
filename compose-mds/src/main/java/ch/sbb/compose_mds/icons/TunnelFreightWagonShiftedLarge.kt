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

public val SBBIcons.TunnelFreightWagonShiftedLarge: ImageVector
    get() {
        if (_tunnelFreightWagonShiftedLarge != null) {
            return _tunnelFreightWagonShiftedLarge!!
        }
        _tunnelFreightWagonShiftedLarge = Builder(name = "TunnelFreightWagonShiftedLarge",
                defaultWidth = 48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f,
                viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.5f, 3.0f)
                curveTo(34.27f, 3.0f, 43.0f, 11.479f, 43.0f, 22.75f)
                lineTo(43.0f, 46.0f)
                horizontalLineToRelative(1.0f)
                lineTo(44.0f, 22.75f)
                curveTo(44.0f, 10.927f, 34.822f, 2.0f, 23.5f, 2.0f)
                reflectiveCurveTo(3.0f, 10.927f, 3.0f, 22.75f)
                lineTo(3.0f, 46.0f)
                horizontalLineToRelative(1.0f)
                lineTo(4.0f, 22.75f)
                curveTo(4.0f, 11.479f, 12.73f, 3.0f, 23.5f, 3.0f)
                moveTo(38.0f, 46.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.217f)
                lineToRelative(-2.4f, -4.0f)
                lineTo(37.0f, 41.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(32.0f, 15.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.617f)
                lineToRelative(-2.4f, 4.0f)
                lineTo(13.0f, 45.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(31.217f, 41.0f)
                lineTo(19.783f, 41.0f)
                lineToRelative(-2.4f, 4.0f)
                horizontalLineToRelative(16.234f)
                close()
                moveTo(15.0f, 36.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(-4.0f)
                lineTo(15.0f, 36.0f)
                moveToRelative(2.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                lineTo(24.0f, 16.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(25.0f, 16.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(6.0f)
                lineTo(31.0f, 16.0f)
                close()
                moveTo(16.0f, 35.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(10.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _tunnelFreightWagonShiftedLarge!!
    }

private var _tunnelFreightWagonShiftedLarge: ImageVector? = null
