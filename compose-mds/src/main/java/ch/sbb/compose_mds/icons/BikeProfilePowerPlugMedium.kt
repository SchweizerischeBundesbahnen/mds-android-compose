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
                moveTo(24.75f, 4.75f)
                lineTo(19.5f, 4.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.316f)
                lineToRelative(-2.334f, 3.5f)
                lineTo(13.15f, 9.25f)
                lineToRelative(-0.12f, 0.33f)
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
                lineToRelative(2.846f, -4.269f)
                lineToRelative(0.518f, -0.777f)
                close()
                moveTo(20.752f, 18.0f)
                curveToRelative(0.0f, -1.74f, 0.94f, -3.265f, 2.34f, -4.092f)
                lineToRelative(1.954f, 4.299f)
                lineToRelative(0.91f, -0.414f)
                lineToRelative(-1.955f, -4.3f)
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
                moveToRelative(-0.832f, -6.14f)
                lineTo(15.0f, 7.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.188f)
                close()
                moveTo(20.75f, 27.248f)
                lineTo(20.75f, 25.75f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-1.503f, 0.002f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.462f, 2.998f)
                lineTo(10.5f, 28.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.786f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.464f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.5f)
                lineTo(24.0f, 31.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(-2.0f)
                lineToRelative(3.251f, -0.007f)
                lineToRelative(-0.002f, -1.0f)
                close()
                moveTo(18.747f, 26.751f)
                lineTo(19.75f, 26.75f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.498f, 2.498f, 0.0f, true, true, -0.003f, -4.998f)
            }
        }
        .build()
        return _bikeProfilePowerPlugMedium!!
    }

private var _bikeProfilePowerPlugMedium: ImageVector? = null
