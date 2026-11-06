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

public val SBBIcons.StationMedium: ImageVector
    get() {
        if (_stationMedium != null) {
            return _stationMedium!!
        }
        _stationMedium = Builder(name = "StationMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(32.439f, 7.487f)
                curveToRelative(-9.082f, -3.706f, -18.214f, -3.64f, -27.374f, -0.002f)
                lineToRelative(-0.315f, 0.126f)
                lineTo(4.75f, 31.25f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(-4.486f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(4.486f)
                horizontalLineToRelative(8.5f)
                lineTo(32.75f, 7.614f)
                close()
                moveTo(5.75f, 30.25f)
                lineTo(5.75f, 8.29f)
                curveToRelative(8.716f, -3.382f, 17.373f, -3.439f, 26.0f, -0.002f)
                lineTo(31.75f, 30.25f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-4.486f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(4.486f)
                close()
                moveTo(18.75f, 10.25f)
                arcToRelative(5.457f, 5.457f, 0.0f, false, false, -5.5f, 5.5f)
                curveToRelative(0.0f, 3.072f, 2.428f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.428f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.428f, -5.5f, -5.5f, -5.5f)
                moveToRelative(-6.5f, 5.5f)
                curveToRelative(0.0f, -3.624f, 2.876f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.876f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.876f, 6.5f, -6.5f, 6.5f)
                arcToRelative(6.457f, 6.457f, 0.0f, false, true, -6.5f, -6.5f)
                moveToRelative(9.742f, -2.54f)
                lineToRelative(-2.85f, 3.6f)
                lineToRelative(-0.33f, 0.417f)
                lineToRelative(-0.395f, -0.354f)
                lineToRelative(-2.85f, -2.55f)
                lineToRelative(0.666f, -0.746f)
                lineToRelative(2.455f, 2.196f)
                lineToRelative(2.52f, -3.183f)
                close()
            }
        }
        .build()
        return _stationMedium!!
    }

private var _stationMedium: ImageVector? = null
