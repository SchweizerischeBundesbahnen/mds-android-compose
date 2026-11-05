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

public val SBBIcons.BicycleReservationSmall: ImageVector
    get() {
        if (_bicycleReservationSmall != null) {
            return _bicycleReservationSmall!!
        }
        _bicycleReservationSmall = Builder(name = "BicycleReservationSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.42f, 2.0f)
                lineTo(18.0f, 2.0f)
                verticalLineToRelative(4.997f)
                horizontalLineToRelative(1.09f)
                lineTo(19.09f, 5.032f)
                horizontalLineToRelative(0.981f)
                quadToRelative(0.523f, 0.0f, 0.739f, 0.205f)
                quadToRelative(0.218f, 0.201f, 0.26f, 0.731f)
                quadToRelative(0.04f, 0.595f, 0.064f, 0.76f)
                quadToRelative(0.027f, 0.162f, 0.086f, 0.27f)
                horizontalLineToRelative(1.138f)
                lineToRelative(-0.048f, -0.059f)
                quadToRelative(-0.099f, -0.127f, -0.147f, -0.646f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -0.106f, -0.906f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -0.16f, -0.38f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, -0.52f, -0.368f)
                quadToRelative(0.375f, -0.141f, 0.584f, -0.465f)
                quadToRelative(0.213f, -0.325f, 0.212f, -0.762f)
                quadToRelative(0.0f, -0.388f, -0.167f, -0.694f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, false, -0.486f, -0.492f)
                quadTo(21.138f, 2.0f, 20.42f, 2.0f)
                moveToRelative(-1.33f, 2.232f)
                lineTo(19.09f, 2.858f)
                horizontalLineToRelative(1.087f)
                quadToRelative(0.48f, 0.0f, 0.7f, 0.164f)
                quadToRelative(0.223f, 0.165f, 0.223f, 0.52f)
                quadToRelative(0.0f, 0.365f, -0.26f, 0.546f)
                quadToRelative(-0.204f, 0.144f, -0.707f, 0.144f)
                close()
                moveTo(13.0f, 6.0f)
                horizontalLineToRelative(4.434f)
                lineToRelative(-0.518f, 0.777f)
                lineToRelative(-1.846f, 2.769f)
                lineToRelative(0.743f, 1.634f)
                arcTo(4.004f, 4.004f, 0.0f, false, true, 21.001f, 15.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.902f, -3.405f)
                lineTo(14.179f, 10.0f)
                lineTo(9.35f, 10.0f)
                lineToRelative(-0.524f, 1.441f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 15.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                arcToRelative(4.004f, 4.004f, 0.0f, false, true, 4.886f, -3.901f)
                lineToRelative(0.644f, -1.77f)
                lineToRelative(0.12f, -0.33f)
                horizontalLineToRelative(5.582f)
                lineToRelative(1.334f, -2.0f)
                lineTo(13.0f, 6.999f)
                close()
                moveTo(15.322f, 12.515f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.91f, -0.415f)
                lineToRelative(1.224f, 2.693f)
                lineToRelative(-0.91f, 0.414f)
                close()
                moveTo(6.53f, 14.829f)
                lineToRelative(1.01f, -2.78f)
                arcTo(3.004f, 3.004f, 0.0f, false, false, 4.0f, 15.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.52f, -2.608f)
                lineTo(7.47f, 15.17f)
                close()
                moveTo(10.0f, 8.0f)
                lineTo(7.21f, 8.0f)
                lineTo(7.21f, 7.0f)
                lineTo(10.0f, 7.0f)
                close()
            }
        }
        .build()
        return _bicycleReservationSmall!!
    }

private var _bicycleReservationSmall: ImageVector? = null
