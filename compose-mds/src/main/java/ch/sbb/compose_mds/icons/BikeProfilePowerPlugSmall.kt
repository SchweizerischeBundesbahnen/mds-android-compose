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

public val SBBIcons.BikeProfilePowerPlugSmall: ImageVector
    get() {
        if (_bikeProfilePowerPlugSmall != null) {
            return _bikeProfilePowerPlugSmall!!
        }
        _bikeProfilePowerPlugSmall = Builder(name = "BikeProfilePowerPlugSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.916f, 3.777f)
                lineTo(17.435f, 3.0f)
                lineTo(13.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.565f)
                lineToRelative(-1.333f, 2.0f)
                lineTo(8.65f, 6.0f)
                lineToRelative(-0.119f, 0.33f)
                lineToRelative(-0.643f, 1.769f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 7.0f, 16.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.174f, -3.559f)
                lineTo(9.35f, 7.0f)
                horizontalLineToRelative(4.828f)
                lineToRelative(0.725f, 1.595f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 17.001f, 16.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                arcToRelative(4.004f, 4.004f, 0.0f, false, false, -5.188f, -3.82f)
                lineToRelative(-0.743f, -1.634f)
                close()
                moveTo(14.001f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.32f, -2.485f)
                lineToRelative(1.225f, 2.692f)
                lineToRelative(0.91f, -0.414f)
                lineTo(16.232f, 9.1f)
                quadTo(16.6f, 9.001f, 17.0f, 9.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-1.655f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                moveToRelative(-6.46f, -2.951f)
                lineToRelative(-1.01f, 2.78f)
                lineToRelative(0.939f, 0.342f)
                lineToRelative(1.01f, -2.78f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 10.0f, 12.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                arcToRelative(3.004f, 3.004f, 0.0f, false, true, 3.541f, -2.951f)
                moveTo(10.001f, 5.0f)
                lineTo(10.001f, 4.0f)
                lineTo(7.209f, 4.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(14.0f, 17.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.501f)
                lineToRelative(-1.002f, 0.002f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 10.05f, 19.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.232f, 1.14f, 1.241f, 2.0f, 2.45f, 2.0f)
                lineTo(14.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.001f)
                lineToRelative(2.001f, -0.005f)
                lineToRelative(-0.002f, -1.0f)
                close()
                moveTo(12.5f, 20.999f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.002f, -2.998f)
                lineToRelative(0.502f, -0.002f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _bikeProfilePowerPlugSmall!!
    }

private var _bikeProfilePowerPlugSmall: ImageVector? = null
