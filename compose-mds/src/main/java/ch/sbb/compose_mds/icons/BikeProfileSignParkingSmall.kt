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

public val SBBIcons.BikeProfileSignParkingSmall: ImageVector
    get() {
        if (_bikeProfileSignParkingSmall != null) {
            return _bikeProfileSignParkingSmall!!
        }
        _bikeProfileSignParkingSmall = Builder(name = "BikeProfileSignParkingSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(14.5f, 2.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.828f, 0.67f, 1.5f, 1.5f, 1.5f)
                lineTo(17.0f, 12.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(1.0f)
                lineTo(18.0f, 12.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(16.5f, 4.0f)
                lineTo(16.0f, 4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.577f, -0.001f, 1.1f, -0.146f, 1.477f, -0.522f)
                curveToRelative(0.378f, -0.376f, 0.523f, -0.9f, 0.523f, -1.478f)
                curveToRelative(0.0f, -0.582f, -0.15f, -1.106f, -0.529f, -1.481f)
                curveTo(19.093f, 4.144f, 18.571f, 4.0f, 18.0f, 4.0f)
                close()
                moveTo(18.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.414f, 0.0f, 0.641f, 0.104f, 0.767f, 0.229f)
                curveToRelative(0.125f, 0.124f, 0.233f, 0.35f, 0.233f, 0.771f)
                reflectiveCurveToRelative(-0.106f, 0.647f, -0.229f, 0.77f)
                curveToRelative(-0.124f, 0.124f, -0.35f, 0.23f, -0.772f, 0.23f)
                moveTo(7.0f, 9.0f)
                horizontalLineToRelative(4.434f)
                lineToRelative(-0.518f, 0.777f)
                lineToRelative(-1.845f, 2.769f)
                lineToRelative(0.742f, 1.633f)
                arcTo(4.004f, 4.004f, 0.0f, false, true, 15.0f, 18.0f)
                curveToRelative(0.0f, 2.208f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.792f, -4.0f, -4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.903f, -3.405f)
                lineTo(8.18f, 13.0f)
                lineTo(3.35f, 13.0f)
                lineToRelative(-0.528f, 1.45f)
                arcTo(3.99f, 3.99f, 0.0f, false, true, 5.0f, 18.0f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, true, -2.864f, 3.835f)
                lineToRelative(-0.284f, -0.958f)
                arcTo(3.01f, 3.01f, 0.0f, false, false, 4.0f, 18.0f)
                curveToRelative(0.0f, -1.29f, -0.824f, -2.389f, -1.98f, -2.81f)
                lineToRelative(-0.469f, -0.171f)
                lineToRelative(0.171f, -0.47f)
                lineToRelative(0.808f, -2.22f)
                lineToRelative(0.12f, -0.329f)
                horizontalLineToRelative(5.582f)
                lineToRelative(1.334f, -2.0f)
                lineTo(7.0f, 10.0f)
                close()
                moveTo(9.322f, 15.515f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.91f, -0.416f)
                lineToRelative(1.224f, 2.694f)
                lineToRelative(-0.91f, 0.413f)
                close()
                moveTo(4.0f, 11.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bikeProfileSignParkingSmall!!
    }

private var _bikeProfileSignParkingSmall: ImageVector? = null
