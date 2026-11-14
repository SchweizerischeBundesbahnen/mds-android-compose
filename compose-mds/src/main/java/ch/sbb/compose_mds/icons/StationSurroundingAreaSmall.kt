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
                curveToRelative(-2.975f, -1.214f, -4.806f, -1.855f, -6.67f, -1.849f)
                curveToRelative(-1.86f, 0.006f, -3.705f, 0.656f, -6.704f, 1.848f)
                lineTo(5.0f, 4.96f)
                lineTo(5.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.99f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                lineTo(19.0f, 4.964f)
                close()
                moveTo(6.0f, 5.64f)
                curveToRelative(2.832f, -1.118f, 4.441f, -1.647f, 6.023f, -1.652f)
                curveToRelative(1.578f, -0.005f, 3.174f, 0.514f, 5.977f, 1.65f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.99f)
                lineTo(9.0f, 15.01f)
                lineTo(9.0f, 18.0f)
                lineTo(6.0f, 18.0f)
                close()
                moveTo(15.0f, 9.0f)
                curveToRelative(0.0f, -1.677f, -1.323f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveTo(9.0f, 7.323f, 9.0f, 9.0f)
                reflectiveCurveToRelative(1.323f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.323f, 3.0f, -3.0f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 2.23f, -1.77f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.77f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.77f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.771f, 4.0f, 4.0f)
                moveToRelative(-4.0f, 0.707f)
                lineToRelative(1.854f, -1.853f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(12.0f, 8.293f)
                lineToRelative(-0.646f, -0.646f)
                lineToRelative(-0.707f, 0.707f)
                close()
                moveTo(2.532f, 17.303f)
                curveTo(2.22f, 17.635f, 2.0f, 18.038f, 2.0f, 18.5f)
                curveToRelative(0.0f, 0.642f, 0.412f, 1.164f, 0.944f, 1.562f)
                curveToRelative(0.542f, 0.405f, 1.293f, 0.75f, 2.179f, 1.03f)
                curveTo(6.901f, 21.657f, 9.33f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(5.1f, -0.344f, 6.877f, -0.907f)
                curveToRelative(0.886f, -0.281f, 1.637f, -0.626f, 2.179f, -1.03f)
                curveToRelative(0.532f, -0.399f, 0.944f, -0.921f, 0.944f, -1.563f)
                curveToRelative(0.0f, -0.463f, -0.218f, -0.866f, -0.532f, -1.197f)
                curveToRelative(-0.312f, -0.328f, -0.744f, -0.614f, -1.247f, -0.863f)
                lineToRelative(-0.442f, 0.897f)
                curveToRelative(0.444f, 0.218f, 0.762f, 0.443f, 0.963f, 0.655f)
                curveToRelative(0.2f, 0.21f, 0.258f, 0.38f, 0.258f, 0.508f)
                curveToRelative(0.0f, 0.18f, -0.117f, 0.443f, -0.543f, 0.762f)
                curveToRelative(-0.416f, 0.311f, -1.052f, 0.614f, -1.882f, 0.877f)
                curveToRelative(-1.655f, 0.525f, -3.977f, 0.86f, -6.575f, 0.86f)
                curveToRelative(-2.597f, 0.0f, -4.919f, -0.335f, -6.574f, -0.86f)
                curveToRelative(-0.83f, -0.263f, -1.466f, -0.566f, -1.883f, -0.877f)
                curveTo(3.117f, 18.943f, 3.0f, 18.68f, 3.0f, 18.5f)
                curveToRelative(0.0f, -0.129f, 0.058f, -0.299f, 0.258f, -0.509f)
                curveToRelative(0.201f, -0.212f, 0.52f, -0.436f, 0.964f, -0.655f)
                lineToRelative(-0.444f, -0.897f)
                curveToRelative(-0.503f, 0.249f, -0.934f, 0.536f, -1.246f, 0.864f)
            }
        }
        .build()
        return _stationSurroundingAreaSmall!!
    }

private var _stationSurroundingAreaSmall: ImageVector? = null
