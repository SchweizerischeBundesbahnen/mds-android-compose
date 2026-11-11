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

public val SBBIcons.TrainStationMedium: ImageVector
    get() {
        if (_trainStationMedium != null) {
            return _trainStationMedium!!
        }
        _trainStationMedium = Builder(name = "TrainStationMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.25f, 4.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.98f)
                lineToRelative(-2.102f, 3.209f)
                lineToRelative(-0.19f, 0.291f)
                horizontalLineToRelative(4.486f)
                curveToRelative(1.02f, 0.0f, 1.87f, 0.216f, 2.46f, 0.78f)
                curveToRelative(0.595f, 0.57f, 0.825f, 1.397f, 0.825f, 2.387f)
                lineTo(20.749f, 26.75f)
                lineTo(19.25f, 26.75f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.502f)
                verticalLineToRelative(-4.5f)
                lineTo(26.5f, 24.25f)
                lineTo(26.5f, 20.0f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-4.75f)
                horizontalLineToRelative(4.0f)
                lineTo(29.75f, 20.0f)
                lineTo(29.0f, 20.0f)
                verticalLineToRelative(4.25f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.748f)
                verticalLineToRelative(4.5f)
                lineTo(4.5f, 29.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(4.75f, 12.417f)
                curveToRelative(0.0f, -0.99f, 0.23f, -1.818f, 0.824f, -2.387f)
                curveToRelative(0.59f, -0.564f, 1.442f, -0.78f, 2.462f, -0.78f)
                horizontalLineToRelative(4.487f)
                lineToRelative(-0.191f, -0.291f)
                lineTo(10.23f, 5.75f)
                lineTo(8.25f, 5.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(12.75f, 7.772f)
                lineTo(11.425f, 5.75f)
                horizontalLineToRelative(2.65f)
                close()
                moveTo(19.75f, 12.417f)
                curveToRelative(0.0f, -0.855f, -0.2f, -1.36f, -0.517f, -1.664f)
                curveToRelative(-0.322f, -0.308f, -0.864f, -0.503f, -1.769f, -0.503f)
                lineTo(8.036f, 10.25f)
                curveToRelative(-0.905f, 0.0f, -1.448f, 0.195f, -1.77f, 0.503f)
                curveToRelative(-0.317f, 0.303f, -0.517f, 0.81f, -0.517f, 1.664f)
                verticalLineToRelative(5.833f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(19.75f, 19.25f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(7.25f, 26.75f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(27.997f, 13.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                moveTo(15.0f, 13.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.5f, 22.25f)
                curveToRelative(0.137f, 0.0f, 0.25f, 0.113f, 0.25f, 0.25f)
                reflectiveCurveToRelative(-0.113f, 0.25f, -0.25f, 0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.5f)
                moveToRelative(0.0f, 1.5f)
                arcToRelative(1.251f, 1.251f, 0.0f, false, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                moveTo(9.25f, 22.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, -0.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.251f, 1.251f, 0.0f, false, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                moveTo(27.5f, 19.0f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-2.75f)
                horizontalLineToRelative(2.0f)
                lineTo(28.75f, 19.0f)
                lineTo(28.0f, 19.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-0.5f)
                close()
            }
        }
        .build()
        return _trainStationMedium!!
    }

private var _trainStationMedium: ImageVector? = null
