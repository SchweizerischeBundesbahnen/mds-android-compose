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
                curveToRelative(12.174f, -4.837f, 24.306f, -4.923f, 36.374f, 0.001f)
                lineToRelative(0.311f, 0.127f)
                verticalLineTo(42.0f)
                horizontalLineTo(31.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.66f)
                close()
                moveTo(6.0f, 11.34f)
                verticalLineTo(41.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(11.336f)
                curveTo(29.387f, 6.683f, 17.731f, 6.76f, 6.0f, 11.341f)
                moveToRelative(17.0f, 2.675f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -2.81f, 0.752f)
                lineToRelative(0.993f, 1.719f)
                lineToRelative(-0.866f, 0.5f)
                lineToRelative(-0.992f, -1.718f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -2.056f, 2.056f)
                lineToRelative(1.718f, 0.992f)
                lineToRelative(-0.5f, 0.866f)
                lineToRelative(-1.719f, -0.993f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -0.752f, 2.81f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.984f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 0.752f, 2.81f)
                lineToRelative(1.72f, -0.993f)
                lineToRelative(0.5f, 0.866f)
                lineToRelative(-1.72f, 0.992f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 2.057f, 2.056f)
                lineToRelative(0.992f, -1.718f)
                lineToRelative(0.866f, 0.5f)
                lineToRelative(-0.992f, 1.72f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 2.809f, 0.75f)
                verticalLineTo(27.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.983f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 2.81f, -0.75f)
                lineToRelative(-0.993f, -1.72f)
                lineToRelative(0.866f, -0.5f)
                lineToRelative(0.992f, 1.718f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 2.056f, -2.056f)
                lineToRelative(-1.718f, -0.992f)
                lineToRelative(0.5f, -0.866f)
                lineToRelative(1.72f, 0.992f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 0.75f, -2.81f)
                horizontalLineTo(29.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.984f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -0.752f, -2.809f)
                lineToRelative(-1.72f, 0.993f)
                lineToRelative(-0.5f, -0.866f)
                lineToRelative(1.72f, -0.992f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -2.057f, -2.056f)
                lineToRelative(-0.992f, 1.718f)
                lineToRelative(-0.866f, -0.5f)
                lineToRelative(0.993f, -1.72f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -2.81f, -0.75f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(15.0f, 21.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 17.0f, 0.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -17.0f, 0.0f)
                moveToRelative(8.854f, 0.353f)
                lineToRelative(3.524f, -3.523f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-3.247f, 3.246f)
                lineToRelative(-2.133f, -1.297f)
                lineToRelative(-0.52f, 0.854f)
                lineToRelative(2.47f, 1.501f)
                lineToRelative(0.335f, 0.204f)
                close()
            }
        }
        .build()
        return _stationLarge!!
    }

private var _stationLarge: ImageVector? = null
