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

public val SBBIcons.StationLarge: ImageVector
    get() {
        if (_stationLarge != null) {
            return _stationLarge!!
        }
        _stationLarge = Builder(name = "StationLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.315f, 10.536f)
                curveToRelative(12.174f, -4.837f, 24.306f, -4.923f, 36.374f, 0.0f)
                lineToRelative(0.311f, 0.128f)
                lineTo(42.0f, 42.0f)
                lineTo(31.0f, 42.0f)
                verticalLineToRelative(-6.0f)
                lineTo(16.0f, 36.0f)
                verticalLineToRelative(6.0f)
                lineTo(5.0f, 42.0f)
                lineTo(5.0f, 10.66f)
                close()
                moveTo(41.0f, 11.34f)
                curveTo(29.386f, 6.685f, 17.732f, 6.76f, 6.0f, 11.342f)
                lineTo(6.0f, 41.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(24.0f, 14.016f)
                lineTo(24.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.984f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -2.81f, 0.752f)
                lineToRelative(0.993f, 1.72f)
                lineToRelative(-0.866f, 0.5f)
                lineToRelative(-0.992f, -1.72f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -2.056f, 2.057f)
                lineToRelative(1.718f, 0.992f)
                lineToRelative(-0.5f, 0.865f)
                lineToRelative(-1.719f, -0.992f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -0.752f, 2.81f)
                lineTo(18.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.984f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 0.752f, 2.81f)
                lineToRelative(1.72f, -0.993f)
                lineToRelative(0.5f, 0.865f)
                lineToRelative(-1.72f, 0.993f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 2.057f, 2.057f)
                lineToRelative(0.992f, -1.719f)
                lineToRelative(0.866f, 0.5f)
                lineToRelative(-0.993f, 1.719f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 2.81f, 0.751f)
                lineTo(23.0f, 27.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.983f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 2.81f, -0.751f)
                lineToRelative(-0.993f, -1.719f)
                lineToRelative(0.866f, -0.5f)
                lineToRelative(0.992f, 1.719f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 2.057f, -2.057f)
                lineToRelative(-1.72f, -0.993f)
                lineToRelative(0.5f, -0.865f)
                lineToRelative(1.72f, 0.993f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 0.752f, -2.81f)
                lineTo(29.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.984f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -0.752f, -2.81f)
                lineToRelative(-1.72f, 0.992f)
                lineToRelative(-0.5f, -0.865f)
                lineToRelative(1.72f, -0.992f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -2.057f, -2.057f)
                lineToRelative(-0.992f, 1.72f)
                lineToRelative(-0.866f, -0.5f)
                lineToRelative(0.993f, -1.72f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -2.81f, -0.752f)
                moveToRelative(8.0f, 7.484f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -8.5f, 8.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 0.0f, -17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 8.5f, 8.5f)
                moveToRelative(-8.424f, 0.631f)
                lineToRelative(0.277f, -0.277f)
                lineToRelative(3.525f, -3.524f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-3.247f, 3.244f)
                lineToRelative(-2.133f, -1.296f)
                lineToRelative(-0.52f, 0.855f)
                lineToRelative(2.47f, 1.501f)
                close()
                moveTo(23.5f, 21.501f)
                lineTo(23.24f, 21.927f)
                lineTo(23.5f, 21.499f)
                lineTo(23.854f, 21.854f)
                close()
            }
        }
        .build()
        return _stationLarge!!
    }

private var _stationLarge: ImageVector? = null
