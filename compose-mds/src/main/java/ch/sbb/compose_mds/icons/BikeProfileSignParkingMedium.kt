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

public val SBBIcons.BikeProfileSignParkingMedium: ImageVector
    get() {
        if (_bikeProfileSignParkingMedium != null) {
            return _bikeProfileSignParkingMedium!!
        }
        _bikeProfileSignParkingMedium = Builder(name = "BikeProfileSignParkingMedium", defaultWidth
                = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(30.75f, 4.25f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(10.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(20.75f, 5.25f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(30.75f, 17.75f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(32.75f, 5.25f)
                curveToRelative(0.0f, -1.106f, -0.894f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-1.106f, 0.0f, -2.0f, 0.894f, -2.0f, 2.0f)
                verticalLineToRelative(10.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(25.75f, 33.0f)
                horizontalLineToRelative(1.0f)
                lineTo(26.75f, 17.75f)
                close()
                moveTo(28.327f, 7.666f)
                curveToRelative(0.251f, 0.249f, 0.423f, 0.662f, 0.423f, 1.334f)
                reflectiveCurveToRelative(-0.169f, 1.084f, -0.417f, 1.332f)
                curveToRelative(-0.249f, 0.248f, -0.662f, 0.417f, -1.334f, 0.418f)
                lineTo(25.25f, 10.75f)
                verticalLineToRelative(-3.5f)
                lineTo(27.0f, 7.25f)
                curveToRelative(0.66f, 0.0f, 1.075f, 0.166f, 1.327f, 0.416f)
                moveToRelative(0.713f, 3.374f)
                curveToRelative(0.502f, -0.501f, 0.71f, -1.213f, 0.71f, -2.04f)
                curveToRelative(0.0f, -0.833f, -0.214f, -1.544f, -0.719f, -2.044f)
                curveToRelative(-0.503f, -0.5f, -1.214f, -0.706f, -2.03f, -0.706f)
                horizontalLineToRelative(-2.75f)
                lineTo(24.251f, 15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                lineTo(27.0f, 11.75f)
                curveToRelative(0.825f, -0.002f, 1.537f, -0.21f, 2.04f, -0.71f)
                moveTo(6.25f, 27.0f)
                curveToRelative(0.0f, -2.045f, -1.307f, -3.784f, -3.133f, -4.45f)
                lineToRelative(-0.47f, -0.171f)
                lineToRelative(0.171f, -0.47f)
                lineToRelative(1.212f, -3.33f)
                lineToRelative(0.12f, -0.329f)
                horizontalLineToRelative(8.332f)
                lineToRelative(2.333f, -3.5f)
                lineTo(10.5f, 14.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.185f)
                lineToRelative(-0.519f, 0.777f)
                lineToRelative(-2.845f, 4.268f)
                lineToRelative(1.264f, 2.782f)
                arcTo(5.756f, 5.756f, 0.0f, false, true, 22.25f, 27.0f)
                arcToRelative(5.755f, 5.755f, 0.0f, false, true, -5.75f, 5.75f)
                arcTo(5.755f, 5.755f, 0.0f, false, true, 10.75f, 27.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 2.926f, -5.007f)
                lineToRelative(-1.247f, -2.742f)
                lineTo(4.85f, 19.251f)
                lineToRelative(-0.928f, 2.553f)
                curveToRelative(1.96f, 0.914f, 3.329f, 2.89f, 3.329f, 5.197f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, true, -4.116f, 5.514f)
                lineToRelative(-0.285f, -0.96f)
                arcTo(4.76f, 4.76f, 0.0f, false, false, 6.25f, 27.0f)
                moveToRelative(7.842f, -4.093f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, -2.341f, 4.092f)
                curveToRelative(0.0f, 2.62f, 2.13f, 4.75f, 4.75f, 4.75f)
                reflectiveCurveToRelative(4.75f, -2.13f, 4.75f, -4.75f)
                arcTo(4.756f, 4.756f, 0.0f, false, false, 15.0f, 22.492f)
                lineToRelative(1.955f, 4.3f)
                lineToRelative(-0.91f, 0.414f)
                close()
                moveTo(6.0f, 15.25f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 16.25f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _bikeProfileSignParkingMedium!!
    }

private var _bikeProfileSignParkingMedium: ImageVector? = null
