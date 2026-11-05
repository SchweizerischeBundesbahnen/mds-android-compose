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

public val SBBIcons.StationSmall: ImageVector
    get() {
        if (_stationSmall != null) {
            return _stationSmall!!
        }
        _stationSmall = Builder(name = "StationSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.689f, 4.837f)
                curveTo(15.593f, 2.35f, 9.46f, 2.394f, 3.315f, 4.835f)
                lineTo(3.0f, 4.961f)
                lineTo(3.0f, 21.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.992f)
                horizontalLineToRelative(7.0f)
                lineTo(16.0f, 21.0f)
                horizontalLineToRelative(6.0f)
                lineTo(22.0f, 4.964f)
                close()
                moveTo(4.0f, 20.0f)
                lineTo(4.0f, 5.642f)
                curveToRelative(5.702f, -2.187f, 11.359f, -2.222f, 17.0f, -0.004f)
                lineTo(21.0f, 20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.99f)
                lineTo(8.0f, 17.01f)
                lineTo(8.0f, 20.0f)
                close()
                moveTo(12.5f, 7.0f)
                arcTo(3.47f, 3.47f, 0.0f, false, false, 9.0f, 10.5f)
                curveToRelative(0.0f, 1.956f, 1.544f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.544f, 3.5f, -3.5f)
                reflectiveCurveTo(14.456f, 7.0f, 12.5f, 7.0f)
                moveTo(8.0f, 10.5f)
                curveTo(8.0f, 7.992f, 9.992f, 6.0f, 12.5f, 6.0f)
                reflectiveCurveTo(17.0f, 7.992f, 17.0f, 10.5f)
                reflectiveCurveTo(15.008f, 15.0f, 12.5f, 15.0f)
                arcTo(4.47f, 4.47f, 0.0f, false, true, 8.0f, 10.5f)
                moveToRelative(6.792f, -1.59f)
                lineToRelative(-1.9f, 2.4f)
                lineToRelative(-0.33f, 0.417f)
                lineToRelative(-0.395f, -0.354f)
                lineToRelative(-1.9f, -1.7f)
                lineToRelative(0.667f, -0.746f)
                lineToRelative(1.504f, 1.346f)
                lineToRelative(1.57f, -1.983f)
                close()
            }
        }
        .build()
        return _stationSmall!!
    }

private var _stationSmall: ImageVector? = null
