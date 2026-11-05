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

public val SBBIcons.LocationPinSurroundingAreaMedium: ImageVector
    get() {
        if (_locationPinSurroundingAreaMedium != null) {
            return _locationPinSurroundingAreaMedium!!
        }
        _locationPinSurroundingAreaMedium = Builder(name = "LocationPinSurroundingAreaMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.25f, 12.022f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, true, 17.5f, 0.0f)
                verticalLineToRelative(0.004f)
                curveToRelative(-0.013f, 1.46f, -0.473f, 2.756f, -1.167f, 3.973f)
                lineToRelative(-0.005f, 0.01f)
                lineToRelative(-0.007f, 0.01f)
                lineToRelative(-7.125f, 11.247f)
                lineToRelative(-0.422f, 0.666f)
                lineToRelative(-0.422f, -0.666f)
                lineToRelative(-7.126f, -11.247f)
                lineToRelative(-0.006f, -0.01f)
                curveToRelative(-0.711f, -1.185f, -1.16f, -2.457f, -1.22f, -3.967f)
                verticalLineToRelative(-0.02f)
                moveToRelative(1.0f, -0.01f)
                curveToRelative(0.053f, 1.312f, 0.44f, 2.418f, 1.075f, 3.476f)
                lineToRelative(6.699f, 10.576f)
                lineToRelative(6.696f, -10.57f)
                curveToRelative(0.632f, -1.111f, 1.018f, -2.236f, 1.03f, -3.474f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, false, -15.5f, -0.008f)
                moveToRelative(7.762f, -4.752f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, false, 0.0f, 9.5f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 0.0f, -9.5f)
                moveToRelative(-5.75f, 4.75f)
                arcToRelative(5.75f, 5.75f, 0.0f, true, true, 11.5f, 0.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, -11.5f, 0.0f)
                moveToRelative(0.884f, 11.005f)
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
            }
        }
        .build()
        return _locationPinSurroundingAreaMedium!!
    }

private var _locationPinSurroundingAreaMedium: ImageVector? = null
