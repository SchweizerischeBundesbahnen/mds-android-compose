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

public val SBBIcons.BikeProfilePowerPlugMedium: ImageVector
    get() {
        if (_bikeProfilePowerPlugMedium != null) {
            return _bikeProfilePowerPlugMedium!!
        }
        _bikeProfilePowerPlugMedium = Builder(name = "BikeProfilePowerPlugMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(25.166f, 5.527f)
                lineToRelative(0.519f, -0.777f)
                lineTo(19.5f, 4.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.315f)
                lineToRelative(-2.333f, 3.5f)
                lineTo(13.15f, 9.25f)
                lineToRelative(-0.119f, 0.33f)
                lineToRelative(-1.042f, 2.865f)
                arcTo(5.756f, 5.756f, 0.0f, false, false, 4.75f, 18.0f)
                arcToRelative(5.756f, 5.756f, 0.0f, false, false, 5.75f, 5.75f)
                arcTo(5.756f, 5.756f, 0.0f, false, false, 16.25f, 18.0f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, false, -3.323f, -5.212f)
                lineToRelative(0.923f, -2.538f)
                horizontalLineToRelative(7.578f)
                lineToRelative(1.247f, 2.743f)
                arcTo(5.75f, 5.75f, 0.0f, false, false, 19.751f, 18.0f)
                arcToRelative(5.755f, 5.755f, 0.0f, false, false, 5.75f, 5.75f)
                arcToRelative(5.756f, 5.756f, 0.0f, false, false, 5.75f, -5.75f)
                arcToRelative(5.756f, 5.756f, 0.0f, false, false, -7.666f, -5.422f)
                lineTo(22.32f, 9.796f)
                close()
                moveTo(20.752f, 18.0f)
                curveToRelative(0.0f, -1.74f, 0.94f, -3.265f, 2.34f, -4.092f)
                lineToRelative(1.954f, 4.299f)
                lineToRelative(0.911f, -0.414f)
                lineToRelative(-1.956f, -4.3f)
                arcTo(4.756f, 4.756f, 0.0f, false, true, 30.251f, 18.0f)
                arcToRelative(4.756f, 4.756f, 0.0f, false, true, -4.75f, 4.75f)
                arcToRelative(4.755f, 4.755f, 0.0f, false, true, -4.75f, -4.75f)
                moveToRelative(-9.107f, -4.61f)
                lineToRelative(-1.615f, 4.44f)
                lineToRelative(0.94f, 0.34f)
                lineToRelative(1.614f, -4.438f)
                arcTo(4.76f, 4.76f, 0.0f, false, true, 15.25f, 18.0f)
                arcToRelative(4.756f, 4.756f, 0.0f, false, true, -4.75f, 4.75f)
                arcTo(4.756f, 4.756f, 0.0f, false, true, 5.75f, 18.0f)
                arcToRelative(4.756f, 4.756f, 0.0f, false, true, 5.895f, -4.61f)
                moveTo(15.0f, 7.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.188f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(20.749f, 27.249f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-0.501f)
                lineToRelative(-1.503f, 0.002f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.46f, 2.998f)
                lineTo(10.5f, 28.749f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.786f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.464f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.5f)
                lineTo(24.0f, 31.249f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(-2.0f)
                lineToRelative(3.251f, -0.007f)
                lineToRelative(-0.002f, -1.0f)
                close()
                moveTo(18.749f, 31.749f)
                arcToRelative(2.498f, 2.498f, 0.0f, true, true, -0.003f, -4.998f)
                lineToRelative(1.003f, -0.002f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _bikeProfilePowerPlugMedium!!
    }

private var _bikeProfilePowerPlugMedium: ImageVector? = null
