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

public val SBBIcons.LocationPinSurroundingAreaPowerPlugMedium: ImageVector
    get() {
        if (_locationPinSurroundingAreaPowerPlugMedium != null) {
            return _locationPinSurroundingAreaPowerPlugMedium!!
        }
        _locationPinSurroundingAreaPowerPlugMedium = Builder(
            name =
                "LocationPinSurroundingAreaPowerPlugMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(18.0f, 3.272f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -8.75f, 8.75f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.06f, 1.51f, 0.509f, 2.782f, 1.22f, 3.967f)
                lineToRelative(0.006f, 0.01f)
                lineToRelative(7.126f, 11.247f)
                lineToRelative(0.422f, 0.666f)
                lineToRelative(0.422f, -0.666f)
                lineToRelative(7.125f, -11.247f)
                lineToRelative(0.006f, -0.01f)
                lineToRelative(0.006f, -0.01f)
                curveToRelative(0.694f, -1.217f, 1.154f, -2.513f, 1.167f, -3.973f)
                verticalLineToRelative(-0.004f)
                arcTo(8.75f, 8.75f, 0.0f, false, false, 18.0f, 3.272f)
                moveToRelative(-6.675f, 12.217f)
                curveToRelative(-0.636f, -1.059f, -1.022f, -2.165f, -1.075f, -3.477f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, 15.5f, 0.008f)
                curveToRelative(-0.012f, 1.238f, -0.398f, 2.363f, -1.03f, 3.473f)
                lineToRelative(-6.696f, 10.57f)
                close()
                moveTo(13.146f, 23.015f)
                curveToRelative(-2.791f, 0.316f, -5.209f, 0.9f, -6.944f, 1.666f)
                curveToRelative(-0.866f, 0.382f, -1.587f, 0.822f, -2.1f, 1.317f)
                curveToRelative(-0.513f, 0.496f, -0.852f, 1.085f, -0.852f, 1.752f)
                curveToRelative(0.0f, 0.847f, 0.544f, 1.567f, 1.315f, 2.144f)
                curveToRelative(0.781f, 0.584f, 1.88f, 1.09f, 3.195f, 1.507f)
                curveToRelative(2.636f, 0.836f, 6.252f, 1.349f, 10.24f, 1.349f)
                reflectiveCurveToRelative(7.604f, -0.513f, 10.24f, -1.349f)
                curveToRelative(1.314f, -0.417f, 2.413f, -0.923f, 3.194f, -1.508f)
                curveToRelative(0.771f, -0.576f, 1.315f, -1.296f, 1.315f, -2.143f)
                curveToRelative(0.0f, -0.662f, -0.334f, -1.247f, -0.84f, -1.74f)
                reflectiveCurveToRelative(-1.218f, -0.93f, -2.073f, -1.311f)
                curveToRelative(-1.712f, -0.764f, -4.098f, -1.347f, -6.856f, -1.668f)
                lineToRelative(-0.115f, 0.993f)
                curveToRelative(2.699f, 0.314f, 4.977f, 0.88f, 6.564f, 1.588f)
                curveToRelative(0.795f, 0.354f, 1.391f, 0.733f, 1.782f, 1.114f)
                curveToRelative(0.39f, 0.379f, 0.539f, 0.723f, 0.539f, 1.024f)
                curveToRelative(0.0f, 0.385f, -0.25f, 0.845f, -0.915f, 1.343f)
                curveToRelative(-0.656f, 0.49f, -1.638f, 0.955f, -2.898f, 1.355f)
                curveToRelative(-2.514f, 0.797f, -6.023f, 1.302f, -9.937f, 1.302f)
                curveToRelative(-3.915f, 0.0f, -7.424f, -0.505f, -9.938f, -1.302f)
                curveToRelative(-1.26f, -0.4f, -2.241f, -0.864f, -2.898f, -1.355f)
                curveToRelative(-0.665f, -0.498f, -0.914f, -0.958f, -0.914f, -1.343f)
                curveToRelative(0.0f, -0.304f, 0.151f, -0.65f, 0.547f, -1.033f)
                curveToRelative(0.397f, -0.383f, 1.003f, -0.765f, 1.81f, -1.121f)
                curveToRelative(1.61f, -0.712f, 3.919f, -1.277f, 6.652f, -1.587f)
                close()
                moveTo(20.75f, 9.25f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-1.503f, 0.002f)
                verticalLineToRelative(0.5f)
                verticalLineToRelative(-0.5f)
                moveToRelative(2.003f, 2.498f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.5f)
                moveToRelative(0.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.465f, -3.0f)
                lineTo(12.0f, 11.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.285f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.461f, -2.998f)
                moveToRelative(0.001f, 1.0f)
                lineToRelative(1.003f, -0.002f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                arcToRelative(2.497f, 2.497f, 0.0f, false, true, 2.497f, -2.498f)
            }
        }
            .build()
        return _locationPinSurroundingAreaPowerPlugMedium!!
    }

private var _locationPinSurroundingAreaPowerPlugMedium: ImageVector? = null
