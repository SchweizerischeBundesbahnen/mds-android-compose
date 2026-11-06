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

public val SBBIcons.StationSurroundingAreaSmall: ImageVector
    get() {
        if (_stationSurroundingAreaSmall != null) {
            return _stationSurroundingAreaSmall!!
        }
        _stationSurroundingAreaSmall = Builder(name = "StationSurroundingAreaSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.689f, 4.837f)
                curveToRelative(-2.974f, -1.214f, -4.806f, -1.855f, -6.67f, -1.849f)
                curveToRelative(-1.86f, 0.006f, -3.705f, 0.656f, -6.704f, 1.847f)
                lineTo(5.0f, 4.961f)
                lineTo(5.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.992f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                lineTo(19.0f, 4.964f)
                close()
                moveTo(6.0f, 18.0f)
                lineTo(6.0f, 5.64f)
                curveToRelative(2.832f, -1.118f, 4.441f, -1.647f, 6.023f, -1.652f)
                curveToRelative(1.579f, -0.005f, 3.174f, 0.513f, 5.977f, 1.649f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.99f)
                lineTo(9.0f, 15.01f)
                lineTo(9.0f, 18.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(-1.677f, 0.0f, -3.0f, 1.323f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.323f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.323f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.323f, -3.0f, -3.0f, -3.0f)
                moveTo(8.0f, 9.0f)
                curveToRelative(0.0f, -2.229f, 1.77f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.771f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.77f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.77f, -4.0f, -4.0f)
                moveToRelative(4.354f, 0.354f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(-0.708f, -0.707f)
                lineTo(12.0f, 8.293f)
                lineToRelative(-0.646f, -0.646f)
                lineToRelative(-0.708f, 0.707f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(0.354f, 0.353f)
                close()
                moveTo(3.778f, 16.439f)
                curveToRelative(-0.503f, 0.249f, -0.934f, 0.536f, -1.246f, 0.864f)
                curveToRelative(-0.314f, 0.331f, -0.532f, 0.734f, -0.532f, 1.197f)
                curveToRelative(0.0f, 0.642f, 0.412f, 1.165f, 0.944f, 1.563f)
                curveToRelative(0.541f, 0.405f, 1.294f, 0.749f, 2.18f, 1.03f)
                curveTo(6.9f, 21.657f, 9.328f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(5.1f, -0.343f, 6.877f, -0.907f)
                curveToRelative(0.886f, -0.281f, 1.638f, -0.625f, 2.18f, -1.03f)
                curveToRelative(0.531f, -0.398f, 0.943f, -0.921f, 0.943f, -1.563f)
                curveToRelative(0.0f, -0.463f, -0.218f, -0.866f, -0.532f, -1.197f)
                curveToRelative(-0.312f, -0.328f, -0.743f, -0.615f, -1.247f, -0.863f)
                lineToRelative(-0.442f, 0.897f)
                curveToRelative(0.443f, 0.218f, 0.762f, 0.442f, 0.963f, 0.655f)
                curveToRelative(0.2f, 0.21f, 0.258f, 0.379f, 0.258f, 0.508f)
                curveToRelative(0.0f, 0.18f, -0.117f, 0.443f, -0.543f, 0.762f)
                curveToRelative(-0.417f, 0.312f, -1.052f, 0.614f, -1.882f, 0.878f)
                curveToRelative(-1.656f, 0.525f, -3.977f, 0.86f, -6.575f, 0.86f)
                curveToRelative(-2.597f, 0.0f, -4.919f, -0.335f, -6.574f, -0.86f)
                curveToRelative(-0.831f, -0.264f, -1.466f, -0.566f, -1.883f, -0.878f)
                curveTo(3.117f, 18.943f, 3.0f, 18.68f, 3.0f, 18.5f)
                curveToRelative(0.0f, -0.13f, 0.058f, -0.298f, 0.258f, -0.509f)
                curveToRelative(0.201f, -0.212f, 0.52f, -0.436f, 0.964f, -0.655f)
                close()
            }
        }
        .build()
        return _stationSurroundingAreaSmall!!
    }

private var _stationSurroundingAreaSmall: ImageVector? = null
