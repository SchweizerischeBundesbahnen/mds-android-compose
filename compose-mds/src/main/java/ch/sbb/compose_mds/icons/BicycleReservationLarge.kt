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

public val SBBIcons.BicycleReservationLarge: ImageVector
    get() {
        if (_bicycleReservationLarge != null) {
            return _bicycleReservationLarge!!
        }
        _bicycleReservationLarge = Builder(name = "BicycleReservationLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(40.112f, 4.0f)
                lineTo(36.0f, 4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(1.188f)
                lineTo(37.188f, 9.097f)
                horizontalLineToRelative(2.37f)
                quadToRelative(1.022f, 0.0f, 1.447f, 0.277f)
                quadToRelative(0.61f, 0.394f, 0.683f, 1.853f)
                quadToRelative(0.05f, 1.015f, 0.092f, 1.299f)
                quadToRelative(0.044f, 0.277f, 0.179f, 0.474f)
                horizontalLineToRelative(1.36f)
                lineToRelative(-0.11f, -0.13f)
                quadToRelative(-0.247f, -0.27f, -0.351f, -1.427f)
                quadToRelative(-0.117f, -1.275f, -0.173f, -1.552f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.258f, -0.59f)
                quadToRelative(-0.339f, -0.512f, -0.991f, -0.647f)
                quadToRelative(0.75f, -0.252f, 1.145f, -0.819f)
                quadToRelative(0.393f, -0.566f, 0.394f, -1.385f)
                quadToRelative(0.0f, -0.67f, -0.284f, -1.2f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.806f, -0.856f)
                quadTo(41.245f, 4.0f, 40.112f, 4.0f)
                moveToRelative(-2.924f, 4.137f)
                lineTo(37.188f, 5.034f)
                horizontalLineToRelative(2.561f)
                quadToRelative(0.64f, 0.0f, 1.003f, 0.099f)
                quadToRelative(0.363f, 0.092f, 0.61f, 0.32f)
                quadToRelative(0.418f, 0.4f, 0.418f, 1.102f)
                quadToRelative(0.0f, 0.917f, -0.664f, 1.305f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -0.635f, 0.215f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.052f, 0.062f)
                close()
                moveTo(33.0f, 12.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(-3.75f, 5.0f)
                lineTo(18.159f, 18.0f)
                lineToRelative(-0.125f, 0.318f)
                lineToRelative(-1.59f, 4.062f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.931f, 0.365f)
                lineTo(18.842f, 19.0f)
                horizontalLineToRelative(9.344f)
                lineToRelative(1.919f, 4.012f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 34.0f, 38.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.995f, -7.42f)
                lineToRelative(-1.924f, -4.022f)
                lineTo(33.4f, 12.8f)
                lineToRelative(0.6f, -0.8f)
                close()
                moveTo(30.537f, 23.916f)
                lineTo(33.55f, 30.216f)
                lineTo(34.452f, 29.784f)
                lineTo(31.438f, 23.484f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 41.001f, 30.0f)
                curveToRelative(0.0f, 3.867f, -3.133f, 7.0f, -7.0f, 7.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -3.464f, -13.084f)
                moveToRelative(-17.003f, 5.902f)
                lineToRelative(2.545f, -6.504f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 0.931f, 0.365f)
                lineToRelative(-2.544f, 6.503f)
                close()
                moveTo(20.0f, 15.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _bicycleReservationLarge!!
    }

private var _bicycleReservationLarge: ImageVector? = null
